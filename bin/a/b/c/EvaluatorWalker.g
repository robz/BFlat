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

evaluator returns [int result]
  : declaration* (ifStatement | assignment)* {result = 1;}
  ;
  
declaration
  : ^('int' (IDENT { GrammarTester.scope.add($IDENT.text, new Integer(0)); })+)
  | ^('boolean'(IDENT { GrammarTester.scope.add($IDENT.text, new Boolean(false)); })+)
  ;  
  
ifStatement
  : ^('if' e=expression .) {
      if ((Boolean)e) {
        CommonTree blockRoot = (CommonTree)($ifStatement.start.getChild(2));
      }
    }
  ;


assignment 
  : ^('=' IDENT e=expression) { GrammarTester.scope.set($IDENT.text, e); }
  ;

expression returns [Object result] 
  : 
  {OperationExecuter oe = null;}
  (
  ^('+' op1 = expression op2 = expression)    { oe = new OperationExecuter(op1,op2,"+"); }
  | ^('-' op1 = expression op2 = expression)  { oe = new OperationExecuter(op1,op2,"-"); }
  | ^('*' op1 = expression op2 = expression)  { oe = new OperationExecuter(op1,op2,"*"); }
  | ^('/' op1 = expression op2 = expression)  { oe = new OperationExecuter(op1,op2,"/"); }
  | ^('%' op1 = expression op2 = expression)  { oe = new OperationExecuter(op1,op2,"\%"); }
  | ^(ARITH_NEGATION op1 = expression)        { oe = new OperationExecuter(op1,null,"ARITH_NEGATION"); }
  | ^('||' op1 = expression op2 = expression) { oe = new OperationExecuter(op1,op2,"||"); }
  | ^('&&' op1 = expression op2 = expression) { oe = new OperationExecuter(op1,op2,"&&"); }
  | ^('==' op1 = expression op2 = expression) { oe = new OperationExecuter(op1,op2,"=="); }
  | ^('!=' op1 = expression op2 = expression) { oe = new OperationExecuter(op1,op2,"!="); }
  | ^('>=' op1 = expression op2 = expression) { oe = new OperationExecuter(op1,op2,">="); }
  | ^('<=' op1 = expression op2 = expression) { oe = new OperationExecuter(op1,op2,"<="); }
  | ^('>' op1 = expression op2 = expression)  { oe = new OperationExecuter(op1,op2,">"); }
  | ^('<' op1 = expression op2 = expression)  { oe = new OperationExecuter(op1,op2,"<"); }
  | ^(BOOL_NEGATION op1 = expression)         { oe = new OperationExecuter(op1,null,"BOOL_NEGATION"); }
  | INTEGER                                   { oe = new OperationExecuter($INTEGER.text,"INTEGER"); } 
  | BOOL                                      { oe = new OperationExecuter($BOOL.text,"BOOL"); }
  | IDENT                                     { oe = new OperationExecuter($IDENT.text,"IDENT"); }
  )
  {result = oe.doOperation();} 
  ;
