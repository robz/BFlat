grammar BFlatGrammar ;

options {
  language = Java;
  output = AST;
  ASTLabelType = CommonTree;
}

tokens {
  ARITH_NEGATION;
  BOOL_NEGATION;
  FUNC;
  CALL;
  BLOCK;
  RETURN;
  PARAM;
  ARG;
  LAMBDA;
  LAMBDASET;
}

@header {
  package a.b.c;
  import java.util.HashMap;
  import java.util.Map;
}

@lexer::header {
  package a.b.c;
}

@members {
  Map<String,FunctInfo> functionDefinitions = new HashMap<String,FunctInfo>();
  
  void addFunction(String name, FunctInfo functInfo) {
    if (functionDefinitions.containsKey(name)) {
      BFlatGUI.debugPrint(0, "function \""+name+"\" seems to be duplicated.");
    } else {
      functionDefinitions.put(name, functInfo);
    }
  }
  
  Map<String,FunctInfo> getFunctionDefinitions() { return functionDefinitions; }
}

/* Top level */

program
  : function+
  ;

/* future use
program
  : 'function'! IDENT! (type?)! LPAR! (typeSignature?)! RPAR! LBRACE!
        declaration* statement*
      RBRACE! EOF!
  ;

typeSignature : parameter (',' parameter)*;

parameter : type IDENT; 

type : 'int' | 'bool';
*/

/* meh... */

function
  : 'function' IDENT LPAR parameter_list? RPAR LBRACE block RBRACE
    -> ^(FUNC IDENT parameter_list? block )
  ;
  finally {
    String functionName = $function.tree.getChild(0).toString();
    String paramString = "", divider = "", typeList = "";
    int i = 1;
    while($function.tree.getChild(i).toString().equals("PARAM")) {
      paramString += divider + $function.tree.getChild(i).getChild(1).toString();
      typeList += divider + $function.tree.getChild(i).getChild(0).toString();
      divider = ";";
      i++;
    }
    addFunction(functionName, new FunctInfo((CommonTree)$function.tree.getChild(i), paramString, typeList));
  }

parameter_list
  : parameter (','! parameter)*;

parameter
  : paramType IDENT -> ^(PARAM paramType IDENT)
  ;
  
paramType
  : type|'funct';

block
  : (lambdaDeclaration | declaration)* statement* -> ^(BLOCK lambdaDeclaration* declaration* statement*)
  ;

declaration
  : type^ IDENT (','! IDENT)* EOL!;
 
statement
  : (ifStatement | whileStatement | assignment EOL! | call EOL! | lambdaSet EOL!);
  
ifStatement
  : ('if'^) LPAR! expression RPAR! LBRACE! block  RBRACE! (('else') LBRACE! block RBRACE!)?
  ;
  
whileStatement
  : 'while' LPAR expression RPAR LBRACE block RBRACE -> ^('while' expression block)
  ; 
  
assignment
  : IDENT ('='^) expression
  ;
  
type
  : ('int' | 'boolean')
  ;
  
lambdaDeclaration
  : 'funct' IDENT '=' 'lambda' LPAR parameter_list? RPAR LBRACE block RBRACE EOL
    -> ^(LAMBDA IDENT parameter_list? block )
  ;
  
lambdaSet
  : 'funct' IDENT '=' call
    -> ^(LAMBDASET IDENT call )
  ;

/* Expression stuff */

call
  : IDENT LPAR arglist? RPAR -> ^(CALL IDENT arglist?)
  ;

arglist
  : argument (','! argument)*
  ;
  
argument
  : expression -> ^(ARG expression)
  ;

term 
  : call | IDENT | (LPAR! expression RPAR!) | INTEGER | BOOL
  ;
  
unary 
  : ('+'! | arithNegation^ | boolNegation^)* term
  ;

boolNegation
  : '!' -> BOOL_NEGATION
  ;
  
arithNegation 
  : '-' -> ARITH_NEGATION 
  ;

mult 
  : unary (('*' | '/' | '%')^ unary)*
  ;

add 
  : mult (('+' | '-')^ mult)*
  ;

relation 
  : add (('<' | '>' | '<=' | '>=' | '==' | '!=')^ add)*
  ;

conjunction 
  : relation ('&&'^ relation)*
  ;

expression
  : (conjunction ('||'^ conjunction)*)
  ;

/* Literals */

fragment LETTER : ('a'..'z'|'A'..'Z');
fragment DIGIT : ('0'..'9');
INTEGER : DIGIT+;
BOOL : 'true' | 'false';
IDENT : (LETTER) (LETTER|DIGIT)*;

/* Operators */ 

//INCRE : '++';
//DECRE : '--';

/* Tokens */
EOL : ';';
LPAR : '(';
RPAR : ')';
LBRACE : '{';
RBRACE : '}';

/* Whitespace (Ignore) */
WS : (' ' | '\r' | '\n' | '\f' | '\t')+ {$channel = HIDDEN;};
COMMENT : '//' .* ('\r'|'\n') {$channel = HIDDEN;};
MULTILINE_COMMENT: '/*' .* '*/' {$channel = HIDDEN;};