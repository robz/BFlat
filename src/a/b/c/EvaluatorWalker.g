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
  String currentFunctionName;
  static int indent;
  static boolean stepping;
  Object lastAssignmentResult;

  // used strictly for display purposes (diplying all the scopes)
  static ArrayStack<LocalScope> scopeStack;

  // private version of the functionDefinitions (probably can delete and just use static version?)
  private Map<String, FunctInfo> functionDefinitions;

  // contains symbol table for all local variables
  private LocalScope localScope;
  
  // will manage nesting scopes within a function
  private FunctionScopeManager smanager;

  // public constructor to get the functionDefinitions, presumably from the parser
  public EvaluatorWalker(BufferedTreeNodeStream nodes, Map<String, FunctInfo> functionDefinitions, boolean stepping) {
    this(nodes);
    this.functionDefinitions = functionDefinitions;
    currentFunctionName = "main";
    BFlatGUI.debugPrint(3, getIndent()+"Entering "+currentFunctionName+" function!");
    
    scopeStack = new ArrayStack<LocalScope> ();
    
    smanager = new FunctionScopeManager();
    localScope = new LocalScope(currentFunctionName, smanager);
    scopeStack.push(localScope);
    
    
    this.stepping = stepping;
    indent = 0;
  }

  // private contructor for function calls
  private EvaluatorWalker(BufferedTreeNodeStream blockStream, String name, Map<String, FunctInfo> functionDefinitions, 
      ArrayList<Object> arguments, String[] paramNames) {
    // Expected tree for function: ^(FUNC ID BLOCK PARAM PARAM ... PARAM )
    this(blockStream);
    
    currentFunctionName = name;
   
    this.functionDefinitions = functionDefinitions;
    
    smanager = new FunctionScopeManager();
    localScope = new LocalScope(currentFunctionName, smanager);
    for(int i = 0; i < arguments.size(); i++) {
      String classname = arguments.get(i).getClass().toString();
      if (classname.contains("FunctInfo"))
        localScope.addLambdaParam(paramNames[i], (FunctInfo)arguments.get(i));
      else
        localScope.addParam(paramNames[i], arguments.get(i));
    }
    
    scopeStack.push(localScope);
    
  }

  // Returns a function from the functionDefinitions map.
  //  should add in parameter matching.
  private FunctInfo findFunction(String name) {
    FunctInfo li = (FunctInfo)localScope.getLambda(name);
    if (li != null) {
      return li;
    }
    return functionDefinitions.get(name);
  }
  
  // Returns value of a variable from looking at GrammarTester's static Scope.
  //  should change this to local memory. 
  //  also, I believe the scope object takes care of error handling just fine.
  public Object getValue(String name) {
        Object value = localScope.get(name);
        if ( value!=null ) {
            return value;
        }
        // if not found
        BFlatGUI.debugPrint(0, "undefined variable "+name);
        return null;
    }
    
  // for the tester program to retrieve whenever it wants
  public LocalScope getlocalScope() {
    return localScope;
  }
  
  public String getIndent() {
    String str = "";
    for(int i = 0; i < indent; i++) 
      str += "    ";
    return str;
  }
  
  public boolean checkParamArgTypes(String[] types, ArrayList<Object> arguments) {
    boolean good = true;
    for(int i = 0; i < types.length; i++) {
      String classname = arguments.get(i).getClass().toString();
      if (types[i].equals("int"))
        good = good && classname.contains("Integer");
      else if (types[i].equals("boolean"))
        good = good && classname.contains("Boolean");
      else
        good = good && classname.contains("FunctInfo");
    }
    return good;
  }
}

evaluator returns [Object result]
@init {
  BFlatGUI.setStack(scopeStack.getStackString(""));
  BFlatGUI.debugPrint(6, "pausing at program start");
  if (stepping)
    Pauser.waitForGo();
}
@after{
  //BFlatGUI.debugPrint(3, scopeStack.getStackString(getIndent()));
  BFlatGUI.debugPrint(3, getIndent()+"Leaving main function!");
  
  BFlatGUI.setStack(scopeStack.getStackString(""));
  BFlatGUI.setSymbolTable(smanager.toString());
  BFlatGUI.debugPrint(6, "pausing at program end");
  if (stepping)
    Pauser.waitForGo();
    
  scopeStack.pop();
  BFlatGUI.setStack(scopeStack.getStackString(""));
}
  : function {result = $function.result;} .*
  ;
  
function returns [Object result]
  : ^(FUNC IDENT parameter* block ) {result = $block.result;}
  ;  
  
parameter returns [String var]
  : ^(PARAM type IDENT) {var = $type.result+" "+$IDENT.text;}
  ;
  
type returns [String result]
  : t=('int' | 'boolean' | 'funct') {result = $t.text;}
  ;

block returns [Object result]
@init {
  smanager.pushScope();
  BFlatGUI.setSymbolTable(smanager.toString());
  BFlatGUI.debugPrint(5, "Entering scope");
}
@after{
  //BFlatGUI.debugPrint(3, scopeStack.getStackString(getIndent()));
  BFlatGUI.debugPrint(5, "Exiting scope");
  result = lastAssignmentResult;
  
  BFlatGUI.setStack(scopeStack.getStackString(""));
  BFlatGUI.setSymbolTable(smanager.toString());
  BFlatGUI.debugPrint(6, "pausing at scope exit");
  if (stepping)
    Pauser.waitForGo();
  
  smanager.popScope(localScope);
}
  : ^(BLOCK lambdaDeclaration* declaration* (lambdaSet|statement)*)
  ;
  
lambdaDeclaration
@init{
  String paramString = "";
  String typeString = "";
  String divider = "";
}
  : ^(LAMBDA IDENT( 
     ( (parameter {String[] var = $parameter.var.split(" "); paramString+=divider+var[1]; typeString+=divider+var[0]; divider=";";} )*
      b=.) { 
        FunctInfo fi = new FunctInfo(b, paramString, typeString);
        localScope.addLambda($IDENT.text, fi);
        lastAssignmentResult = fi;
      }
  ))
  ; 
  
lambdaSet
  : ^(LAMBDASET IDENT call) {
        FunctInfo fi = (FunctInfo)$call.result;
        localScope.addLambda($IDENT.text, fi);
        lastAssignmentResult = fi;
  }
  ;
   
declaration
  : ^('int' (IDENT { localScope.addVar($IDENT.text, new Integer(0)); })+)
  | ^('boolean'(IDENT { localScope.addVar($IDENT.text, new Boolean(false)); })+)
  ; 
  
statement
  : call|assignment|ifStatement|whileStatement
  ; 

whileStatement
@init{
  boolean expval = false;
}
  : ^('while' {int eindex = input.index(); }  e = expression
      { expval = (Boolean)e; int bindex = input.index(); int marker = input.mark(); }
    .*)
    {
      int next = input.index();
      while(true){
        if(expval == true){
          input.rewind(marker);
          block();
          input.seek(eindex);
          input.consume();
          expval = (Boolean)expression();
        }
        else{
          input.seek(next);
          break;
        }
      }
    }
  ;

ifStatement
@init{
  int eindex = -1;
}
  :  ^('if' e=expression {int sindex = input.index();} s=. ('else' {eindex = input.index();} v=.)?){
       BufferedTreeNodeStream stream = (BufferedTreeNodeStream) input;
       if ((Boolean)$e.result) {
         stream.push(sindex);
         block();
         stream.pop(); 
       }
       else if(eindex != -1){
           stream.push(eindex);
         block();
         stream.pop();
       }
    } 
  ;
  
call returns [Object result]
  @init{
    ArrayList<Object> arguments = new ArrayList<Object> ();
  }
  : ^(CALL IDENT (argument { arguments.add($argument.result); })*) { 
        FunctInfo functInfo = findFunction($IDENT.text);
        if (functInfo == null) {
          BFlatGUI.debugPrint(0, "No function match found for " + $IDENT.text);
        } else {
          //System.out.println("found arguments for "+$IDENT.text+": "+arguments);
          String[] paramNames = functInfo.paramList.split(";");
          if (paramNames[0].equals("")) paramNames = new String[]{};
          
          if (paramNames.length != arguments.size()) {
            BFlatGUI.debugPrint(0, "# of arguments do not match # of parameters for call to " + $IDENT.text);
          } else {
            String[] types = functInfo.typeList.split(";");
            if (types[0].equals("")) types = new String[]{};
            
            boolean parameterMatchArgsTypes = checkParamArgTypes(types, arguments);
            if (!parameterMatchArgsTypes) {
              BFlatGUI.debugPrint(0, "arguments types and parameters types don't match for call to " + $IDENT.text);
            } else {
		          BFlatGUI.setStack(scopeStack.getStackString(""));
		          BFlatGUI.setSymbolTable(smanager.toString());
              BFlatGUI.debugPrint(6, "pausing at function call "+$IDENT.text);
		          if (stepping)
		            Pauser.waitForGo();
		           
		          BufferedTreeNodeStream blockStream = new BufferedTreeNodeStream(functInfo.body);
		          //BFlatGUI.debugPrint(3, scopeStack.getStackString(getIndent()));
		          
              indent++;
		          BFlatGUI.debugPrint(3, getIndent()+"Entering "+$IDENT.text+" function!");
		          
		          EvaluatorWalker e = new EvaluatorWalker(blockStream, $IDENT.text, functionDefinitions, arguments, paramNames);
		          result = e.block();
		          
              BFlatGUI.debugPrint(3, getIndent()+"Leaving "+$IDENT.text+" function!");
		          BFlatGUI.setStack(scopeStack.getStackString(""));
              scopeStack.pop();
              
		          indent--;
		          
		          lastAssignmentResult = result;
		        }
	        } 
        }
     }
  ;

argument returns [Object result] 
  : ^(ARG expression) {result = $expression.result;}
  ;
 
assignment 
  : ^('=' IDENT e=expression) { 
        localScope.set($IDENT.text, e); 
        lastAssignmentResult = e;
     }
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
	  | INTEGER                                   { oe = new OperationExecuter(localScope, $INTEGER.text,"INTEGER"); } 
	  | BOOL                                      { oe = new OperationExecuter(localScope, $BOOL.text,"BOOL"); }
	  | IDENT                                     { oe = new OperationExecuter(localScope, $IDENT.text,"IDENT"); }
	  | call                                      { result = $call.result;}
  )
  {if (oe != null) result = oe.doOperation();
    if (result == null)
      BFlatGUI.debugPrint(0, "result of expression is null!");
  } 
  ;
