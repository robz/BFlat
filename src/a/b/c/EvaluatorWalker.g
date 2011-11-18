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
  private Map<String, Object> variables = new HashMap <String, Object> ();
}

evaluator returns [int result]
  : declaration* assignment* {result = 1;}
  ;
  
declaration
  : ^('int' IDENT) 
    { 
      try {
        if (variables.containsKey($IDENT.text))
          throw new Exception("int dec; already declared variable "+$IDENT.text);
        variables.put($IDENT.text, new Integer(0)); 
      } catch(Exception ex) {
        BFlatGUI.debugPrint(0, ex.getMessage());
      }
    }
  | ^('boolean' IDENT)
    { 
      try {
        if (variables.containsKey($IDENT.text))
          throw new Exception("boolean dec; already declared variable "+$IDENT.text);
        variables.put($IDENT.text, new Boolean(false)); 
      } catch(Exception ex) {
        BFlatGUI.debugPrint(0, ex.getMessage());
      }
    }
  ;  

assignment 
  : ^('=' IDENT e=expression)
    { 
	    try {
		    if (!variables.containsKey($IDENT.text))
		      throw new Exception("undeclared variable "+$IDENT.text);
		    String varclass = variables.get($IDENT.text).getClass().getName(),
		      expclass = e.getClass().getName();
		    if (!varclass.equals(expclass))
		      throw new Exception("unexpected type: "+$IDENT.text+" is "+varclass+" but was expecting "+expclass);
		    variables.put($IDENT.text, e); 
		    BFlatGUI.debugPrint(1, $IDENT.text+" : "+e);
	    } catch(Exception ex) {
	      BFlatGUI.debugPrint(0, "assignment; "+ex.getMessage());
	    }
    }
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
  | IDENT 
    {  
      try {
        result = (Integer)variables.get($IDENT.text); 
      } catch(Exception ex) {
        BFlatGUI.debugPrint(0, "expression; "+ex.getMessage());
      }
    }
  ;
