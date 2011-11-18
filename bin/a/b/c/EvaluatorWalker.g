tree grammar EvaluatorWalker;

options {
  language = Java;
  tokenVocab = BFlatGrammar;
  ASTLabelType = CommonTree; 
}

@header {
  package a.b.c;
  import java.util.Map;
  import java.util.HashMap;
}

@members {
  GrammarTester.Scope scope = new GrammarTester.Scope();
}

evaluator returns [int result]
  : declaration* assignment* {result = 1;}
  ;
  
declaration
  : ^('int' IDENT) { scope.add($IDENT.text, new Integer(0)); }
  | ^('boolean' IDENT) { scope.add($IDENT.text, new Boolean(false)); }
  ;  

assignment 
  : ^('=' IDENT e=expression) { scope.set($IDENT.text, e); }
  ;

expression returns [Object result] 
  : ^('+' op1 = expression op2 = expression) { result = (Integer)op1 + (Integer)op2; }
  | ^('-' op1 = expression op2 = expression) { result = (Integer)op1 - (Integer)op2; }
  | ^('*' op1 = expression op2 = expression) { result = (Integer)op1 * (Integer)op2; }
  | ^('/' op1 = expression op2 = expression) { result = (Integer)op1 / (Integer)op2; }
  | ^('%' op1 = expression op2 = expression) { result = (Integer)op1 \% (Integer)op2; }
  | ^(NEGATION op1 = expression) { result = -(Integer)op1; }
  | ^('||' op1 = expression op2 = expression) { result = ((Boolean)op1 || (Boolean)op2); }
  | ^('&&' op1 = expression op2 = expression) { result = ((Boolean)op1 && (Boolean)op2); }
  | ^('==' op1 = expression op2 = expression) { result = op1.equals(op2); }
  | ^('!=' op1 = expression op2 = expression) { result = !op1.equals(op2); }
  | ^('>=' op1 = expression op2 = expression) { result = ((Integer)op1 >= (Integer)op2); }
  | ^('<=' op1 = expression op2 = expression) { result = ((Integer)op1 <= (Integer)op2); }
  | ^('>' op1 = expression op2 = expression) { result = ((Integer)op1 > (Integer)op2); }
  | ^('<' op1 = expression op2 = expression) { result = ((Integer)op1 < (Integer)op2); }
  | INTEGER { result = Integer.parseInt($INTEGER.text); } 
  | BOOL { result = Boolean.parseBoolean($BOOL.text); }
  | IDENT { result = scope.get($IDENT.text); }
  ;
