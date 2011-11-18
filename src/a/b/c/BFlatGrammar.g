grammar BFlatGrammar ;

options {
  language = Java;
  output = AST;
  ASTLabelType = CommonTree;
}

tokens {
  ARITH_NEGATION;
  BOOL_NEGATION;
}

@header {
  package a.b.c;
}

@lexer::header {
  package a.b.c;
}

/* Top level */

program
  : declaration* statement*
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

declaration
  : ('int'^ | 'boolean'^) IDENT (','! IDENT)* EOL!;
 
statement
  : (ifStatement | assignment EOL!);
  
ifStatement
    : ('if'^) LPAR! expression RPAR! LBRACE! statement*  RBRACE! 
    ;

assignment
  : IDENT ('='^) expression 
  ;

/* Expression stuff */

term 
  : IDENT | (LPAR! expression RPAR!) | INTEGER | BOOL
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
IDENT : LETTER(LETTER|DIGIT)*;

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