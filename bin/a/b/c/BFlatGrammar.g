grammar BFlatGrammar ;

options {
  language = Java;
  output = AST;
  ASTLabelType = CommonTree;
}

tokens {
  NEGATION;
}

@header {
  package a.b.c;
}

@lexer::header {
  package a.b.c;
}

/* Top level */

program
  : declaration* statement* EOF!
  ;

/* meh... */

declaration
  : ('int'^ | 'boolean'^) IDENT EOL!;
  
statement
  : assignment EOL!;

assignment
  : IDENT ('='^) expression 
  ;

/* Expression stuff */

term 
  : IDENT | (LPAR! expression RPAR!) | INTEGER | BOOL
  ;
 
unary 
  : ('+'! | negation^)* term
  ;

negation 
  : '-' -> NEGATION
  ;

mult 
  : unary (('*'^ | '/'^ | '%'^) unary)*
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
NEG : '!';

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