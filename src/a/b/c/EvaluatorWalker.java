// $ANTLR 3.4 /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g 2011-11-25 11:07:20

  package a.b.c;
  import java.util.Map;
  import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class EvaluatorWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARG", "ARITH_NEGATION", "BLOCK", "BOOL", "BOOL_NEGATION", "CALL", "COMMENT", "DIGIT", "EOL", "FUNC", "IDENT", "INTEGER", "LAMBDA", "LAMBDASET", "LBRACE", "LETTER", "LPAR", "MULTILINE_COMMENT", "PARAM", "RBRACE", "RETURN", "RPAR", "WS", "'!'", "'!='", "'%'", "'&&'", "'*'", "'+'", "','", "'-'", "'/'", "'<'", "'<='", "'='", "'=='", "'>'", "'>='", "'boolean'", "'else'", "'funct'", "'function'", "'if'", "'int'", "'lambda'", "'while'", "'||'"
    };

    public static final int EOF=-1;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int ARG=4;
    public static final int ARITH_NEGATION=5;
    public static final int BLOCK=6;
    public static final int BOOL=7;
    public static final int BOOL_NEGATION=8;
    public static final int CALL=9;
    public static final int COMMENT=10;
    public static final int DIGIT=11;
    public static final int EOL=12;
    public static final int FUNC=13;
    public static final int IDENT=14;
    public static final int INTEGER=15;
    public static final int LAMBDA=16;
    public static final int LAMBDASET=17;
    public static final int LBRACE=18;
    public static final int LETTER=19;
    public static final int LPAR=20;
    public static final int MULTILINE_COMMENT=21;
    public static final int PARAM=22;
    public static final int RBRACE=23;
    public static final int RETURN=24;
    public static final int RPAR=25;
    public static final int WS=26;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public EvaluatorWalker(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public EvaluatorWalker(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return EvaluatorWalker.tokenNames; }
    public String getGrammarFileName() { return "/v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g"; }


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



    // $ANTLR start "evaluator"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:125:1: evaluator returns [Object result] : function ( . )* ;
    public final Object evaluator() throws RecognitionException {
        Object result = null;


        Object function1 =null;



          BFlatGUI.setStack(scopeStack.getStackString(""));
          BFlatGUI.debugPrint(6, "pausing at program start");
          if (stepping)
            Pauser.waitForGo();

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:145:3: ( function ( . )* )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:145:5: function ( . )*
            {
            pushFollow(FOLLOW_function_in_evaluator72);
            function1=function();

            state._fsp--;


            result = function1;

            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:145:43: ( . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= ARG && LA1_0 <= 50)) ) {
                    alt1=1;
                }
                else if ( (LA1_0==EOF) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:145:43: .
            	    {
            	    matchAny(input); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "evaluator"



    // $ANTLR start "function"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:148:1: function returns [Object result] : ^( FUNC IDENT ( parameter )* block ) ;
    public final Object function() throws RecognitionException {
        Object result = null;


        Object block2 =null;


        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:149:3: ( ^( FUNC IDENT ( parameter )* block ) )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:149:5: ^( FUNC IDENT ( parameter )* block )
            {
            match(input,FUNC,FOLLOW_FUNC_in_function97); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_function99); 

            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:149:18: ( parameter )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==PARAM) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:149:18: parameter
            	    {
            	    pushFollow(FOLLOW_parameter_in_function101);
            	    parameter();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            pushFollow(FOLLOW_block_in_function104);
            block2=block();

            state._fsp--;


            match(input, Token.UP, null); 


            result = block2;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "function"



    // $ANTLR start "parameter"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:152:1: parameter returns [String var] : ^( PARAM type IDENT ) ;
    public final String parameter() throws RecognitionException {
        String var = null;


        CommonTree IDENT4=null;
        String type3 =null;


        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:153:3: ( ^( PARAM type IDENT ) )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:153:5: ^( PARAM type IDENT )
            {
            match(input,PARAM,FOLLOW_PARAM_in_parameter130); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_in_parameter132);
            type3=type();

            state._fsp--;


            IDENT4=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_parameter134); 

            match(input, Token.UP, null); 


            var = type3+" "+(IDENT4!=null?IDENT4.getText():null);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return var;
    }
    // $ANTLR end "parameter"



    // $ANTLR start "type"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:156:1: type returns [String result] : t= ( 'int' | 'boolean' | 'funct' ) ;
    public final String type() throws RecognitionException {
        String result = null;


        CommonTree t=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:157:3: (t= ( 'int' | 'boolean' | 'funct' ) )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:157:5: t= ( 'int' | 'boolean' | 'funct' )
            {
            t=(CommonTree)input.LT(1);

            if ( input.LA(1)==42||input.LA(1)==44||input.LA(1)==47 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            result = (t!=null?t.getText():null);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "type"



    // $ANTLR start "block"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:160:1: block returns [Object result] : ^( BLOCK ( lambdaDeclaration )* ( declaration )* ( lambdaSet | statement )* ) ;
    public final Object block() throws RecognitionException {
        Object result = null;



          smanager.pushScope();
          BFlatGUI.setSymbolTable(smanager.toString());
          BFlatGUI.debugPrint(5, "Entering scope");

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:179:3: ( ^( BLOCK ( lambdaDeclaration )* ( declaration )* ( lambdaSet | statement )* ) )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:179:5: ^( BLOCK ( lambdaDeclaration )* ( declaration )* ( lambdaSet | statement )* )
            {
            match(input,BLOCK,FOLLOW_BLOCK_in_block197); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:179:13: ( lambdaDeclaration )*
                loop3:
                do {
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==LAMBDA) ) {
                        alt3=1;
                    }


                    switch (alt3) {
                	case 1 :
                	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:179:13: lambdaDeclaration
                	    {
                	    pushFollow(FOLLOW_lambdaDeclaration_in_block199);
                	    lambdaDeclaration();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop3;
                    }
                } while (true);


                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:179:32: ( declaration )*
                loop4:
                do {
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==42||LA4_0==47) ) {
                        alt4=1;
                    }


                    switch (alt4) {
                	case 1 :
                	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:179:32: declaration
                	    {
                	    pushFollow(FOLLOW_declaration_in_block202);
                	    declaration();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop4;
                    }
                } while (true);


                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:179:45: ( lambdaSet | statement )*
                loop5:
                do {
                    int alt5=3;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==LAMBDASET) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==CALL||LA5_0==38||LA5_0==46||LA5_0==49) ) {
                        alt5=2;
                    }


                    switch (alt5) {
                	case 1 :
                	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:179:46: lambdaSet
                	    {
                	    pushFollow(FOLLOW_lambdaSet_in_block206);
                	    lambdaSet();

                	    state._fsp--;


                	    }
                	    break;
                	case 2 :
                	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:179:56: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_block208);
                	    statement();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop5;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            }


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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "block"



    // $ANTLR start "lambdaDeclaration"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:182:1: lambdaDeclaration : ^( LAMBDA IDENT ( ( ( parameter )* b= . ) ) ) ;
    public final void lambdaDeclaration() throws RecognitionException {
        CommonTree IDENT6=null;
        CommonTree b=null;
        String parameter5 =null;



          String paramString = "";
          String typeString = "";
          String divider = "";

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:188:3: ( ^( LAMBDA IDENT ( ( ( parameter )* b= . ) ) ) )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:188:5: ^( LAMBDA IDENT ( ( ( parameter )* b= . ) ) )
            {
            match(input,LAMBDA,FOLLOW_LAMBDA_in_lambdaDeclaration231); 

            match(input, Token.DOWN, null); 
            IDENT6=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_lambdaDeclaration233); 

            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:188:19: ( ( ( parameter )* b= . ) )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:189:6: ( ( parameter )* b= . )
            {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:189:6: ( ( parameter )* b= . )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:189:8: ( parameter )* b= .
            {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:189:8: ( parameter )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==PARAM) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==DOWN) ) {
                        int LA6_3 = input.LA(3);

                        if ( (LA6_3==42||LA6_3==44||LA6_3==47) ) {
                            int LA6_4 = input.LA(4);

                            if ( (LA6_4==IDENT) ) {
                                int LA6_5 = input.LA(5);

                                if ( (LA6_5==UP) ) {
                                    int LA6_6 = input.LA(6);

                                    if ( ((LA6_6 >= ARG && LA6_6 <= 50)) ) {
                                        alt6=1;
                                    }


                                }


                            }


                        }


                    }


                }


                switch (alt6) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:189:9: parameter
            	    {
            	    pushFollow(FOLLOW_parameter_in_lambdaDeclaration245);
            	    parameter5=parameter();

            	    state._fsp--;


            	    String[] var = parameter5.split(" "); paramString+=divider+var[1]; typeString+=divider+var[0]; divider=";";

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            b=(CommonTree)input.LT(1);

            matchAny(input); 

            }


             
                    FunctInfo fi = new FunctInfo(b, paramString, typeString);
                    localScope.addLambda((IDENT6!=null?IDENT6.getText():null), fi);
                    lastAssignmentResult = fi;
                  

            }


            match(input, Token.UP, null); 


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "lambdaDeclaration"



    // $ANTLR start "lambdaSet"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:198:1: lambdaSet : ^( LAMBDASET IDENT call ) ;
    public final void lambdaSet() throws RecognitionException {
        CommonTree IDENT8=null;
        Object call7 =null;


        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:199:3: ( ^( LAMBDASET IDENT call ) )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:199:5: ^( LAMBDASET IDENT call )
            {
            match(input,LAMBDASET,FOLLOW_LAMBDASET_in_lambdaSet285); 

            match(input, Token.DOWN, null); 
            IDENT8=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_lambdaSet287); 

            pushFollow(FOLLOW_call_in_lambdaSet289);
            call7=call();

            state._fsp--;


            match(input, Token.UP, null); 



                    FunctInfo fi = (FunctInfo)call7;
                    localScope.addLambda((IDENT8!=null?IDENT8.getText():null), fi);
                    lastAssignmentResult = fi;
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "lambdaSet"



    // $ANTLR start "declaration"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:206:1: declaration : ( ^( 'int' ( IDENT )+ ) | ^( 'boolean' ( IDENT )+ ) );
    public final void declaration() throws RecognitionException {
        CommonTree IDENT9=null;
        CommonTree IDENT10=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:207:3: ( ^( 'int' ( IDENT )+ ) | ^( 'boolean' ( IDENT )+ ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==47) ) {
                alt9=1;
            }
            else if ( (LA9_0==42) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:207:5: ^( 'int' ( IDENT )+ )
                    {
                    match(input,47,FOLLOW_47_in_declaration309); 

                    match(input, Token.DOWN, null); 
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:207:13: ( IDENT )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==IDENT) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:207:14: IDENT
                    	    {
                    	    IDENT9=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_declaration312); 

                    	     localScope.addVar((IDENT9!=null?IDENT9.getText():null), new Integer(0)); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    match(input, Token.UP, null); 


                    }
                    break;
                case 2 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:208:5: ^( 'boolean' ( IDENT )+ )
                    {
                    match(input,42,FOLLOW_42_in_declaration324); 

                    match(input, Token.DOWN, null); 
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:208:16: ( IDENT )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==IDENT) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:208:17: IDENT
                    	    {
                    	    IDENT10=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_declaration326); 

                    	     localScope.addVar((IDENT10!=null?IDENT10.getText():null), new Boolean(false)); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    match(input, Token.UP, null); 


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "declaration"



    // $ANTLR start "statement"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:211:1: statement : ( call | assignment | ifStatement | whileStatement );
    public final void statement() throws RecognitionException {
        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:212:3: ( call | assignment | ifStatement | whileStatement )
            int alt10=4;
            switch ( input.LA(1) ) {
            case CALL:
                {
                alt10=1;
                }
                break;
            case 38:
                {
                alt10=2;
                }
                break;
            case 46:
                {
                alt10=3;
                }
                break;
            case 49:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:212:5: call
                    {
                    pushFollow(FOLLOW_call_in_statement347);
                    call();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:212:10: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement349);
                    assignment();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:212:21: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement351);
                    ifStatement();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:212:33: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement353);
                    whileStatement();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "statement"



    // $ANTLR start "whileStatement"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:215:1: whileStatement : ^( 'while' e= expression ( . )* ) ;
    public final void whileStatement() throws RecognitionException {
        Object e =null;



          boolean expval = false;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:219:3: ( ^( 'while' e= expression ( . )* ) )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:219:5: ^( 'while' e= expression ( . )* )
            {
            match(input,49,FOLLOW_49_in_whileStatement372); 

            int eindex = input.index(); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_whileStatement381);
            e=expression();

            state._fsp--;


             expval = (Boolean)e; int bindex = input.index(); int marker = input.mark(); 

            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:221:5: ( . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0 >= ARG && LA11_0 <= 50)) ) {
                    alt11=1;
                }
                else if ( (LA11_0==UP) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:221:5: .
            	    {
            	    matchAny(input); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            match(input, Token.UP, null); 



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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "whileStatement"



    // $ANTLR start "ifStatement"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:240:1: ifStatement : ^( 'if' e= expression s= . ( 'else' v= . )? ) ;
    public final void ifStatement() throws RecognitionException {
        CommonTree s=null;
        CommonTree v=null;
        Object e =null;



          int eindex = -1;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:244:3: ( ^( 'if' e= expression s= . ( 'else' v= . )? ) )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:244:6: ^( 'if' e= expression s= . ( 'else' v= . )? )
            {
            match(input,46,FOLLOW_46_in_ifStatement422); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_ifStatement426);
            e=expression();

            state._fsp--;


            int sindex = input.index();

            s=(CommonTree)input.LT(1);

            matchAny(input); 

            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:244:60: ( 'else' v= . )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==43) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:244:61: 'else' v= .
                    {
                    match(input,43,FOLLOW_43_in_ifStatement435); 

                    eindex = input.index();

                    v=(CommonTree)input.LT(1);

                    matchAny(input); 

                    }
                    break;

            }


            match(input, Token.UP, null); 



                   BufferedTreeNodeStream stream = (BufferedTreeNodeStream) input;
                   if ((Boolean)e) {
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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "ifStatement"



    // $ANTLR start "call"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:259:1: call returns [Object result] : ^( CALL IDENT ( argument )* ) ;
    public final Object call() throws RecognitionException {
        Object result = null;


        CommonTree IDENT12=null;
        Object argument11 =null;



            ArrayList<Object> arguments = new ArrayList<Object> ();
          
        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:263:3: ( ^( CALL IDENT ( argument )* ) )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:263:5: ^( CALL IDENT ( argument )* )
            {
            match(input,CALL,FOLLOW_CALL_in_call472); 

            match(input, Token.DOWN, null); 
            IDENT12=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_call474); 

            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:263:18: ( argument )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==ARG) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:263:19: argument
            	    {
            	    pushFollow(FOLLOW_argument_in_call477);
            	    argument11=argument();

            	    state._fsp--;


            	     arguments.add(argument11); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            match(input, Token.UP, null); 


             
                    FunctInfo functInfo = findFunction((IDENT12!=null?IDENT12.getText():null));
                    if (functInfo == null) {
                      BFlatGUI.debugPrint(0, "No function match found for " + (IDENT12!=null?IDENT12.getText():null));
                    } else {
                      //System.out.println("found arguments for "+(IDENT12!=null?IDENT12.getText():null)+": "+arguments);
                      String[] paramNames = functInfo.paramList.split(";");
                      if (paramNames[0].equals("")) paramNames = new String[]{};
                      
                      if (paramNames.length != arguments.size()) {
                        BFlatGUI.debugPrint(0, "# of arguments do not match # of parameters for call to " + (IDENT12!=null?IDENT12.getText():null));
                      } else {
                        String[] types = functInfo.typeList.split(";");
                        if (types[0].equals("")) types = new String[]{};
                        
                        boolean parameterMatchArgsTypes = checkParamArgTypes(types, arguments);
                        if (!parameterMatchArgsTypes) {
                          BFlatGUI.debugPrint(0, "arguments types and parameters types don't match for call to " + (IDENT12!=null?IDENT12.getText():null));
                        } else {
            		          BFlatGUI.setStack(scopeStack.getStackString(""));
            		          BFlatGUI.setSymbolTable(smanager.toString());
                          BFlatGUI.debugPrint(6, "pausing at function call "+(IDENT12!=null?IDENT12.getText():null));
            		          if (stepping)
            		            Pauser.waitForGo();
            		           
            		          BufferedTreeNodeStream blockStream = new BufferedTreeNodeStream(functInfo.body);
            		          //BFlatGUI.debugPrint(3, scopeStack.getStackString(getIndent()));
            		          
                          indent++;
            		          BFlatGUI.debugPrint(3, getIndent()+"Entering "+(IDENT12!=null?IDENT12.getText():null)+" function!");
            		          
            		          EvaluatorWalker e = new EvaluatorWalker(blockStream, (IDENT12!=null?IDENT12.getText():null), functionDefinitions, arguments, paramNames);
            		          result = e.block();
            		          
                          BFlatGUI.debugPrint(3, getIndent()+"Leaving "+(IDENT12!=null?IDENT12.getText():null)+" function!");
            		          BFlatGUI.setStack(scopeStack.getStackString(""));
                          scopeStack.pop();
                          
            		          indent--;
            		          
            		          lastAssignmentResult = result;
            		        }
            	        } 
                    }
                 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "call"



    // $ANTLR start "argument"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:310:1: argument returns [Object result] : ^( ARG expression ) ;
    public final Object argument() throws RecognitionException {
        Object result = null;


        Object expression13 =null;


        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:311:3: ( ^( ARG expression ) )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:311:5: ^( ARG expression )
            {
            match(input,ARG,FOLLOW_ARG_in_argument503); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_argument505);
            expression13=expression();

            state._fsp--;


            match(input, Token.UP, null); 


            result = expression13;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "argument"



    // $ANTLR start "assignment"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:314:1: assignment : ^( '=' IDENT e= expression ) ;
    public final void assignment() throws RecognitionException {
        CommonTree IDENT14=null;
        Object e =null;


        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:315:3: ( ^( '=' IDENT e= expression ) )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:315:5: ^( '=' IDENT e= expression )
            {
            match(input,38,FOLLOW_38_in_assignment524); 

            match(input, Token.DOWN, null); 
            IDENT14=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_assignment526); 

            pushFollow(FOLLOW_expression_in_assignment530);
            e=expression();

            state._fsp--;


            match(input, Token.UP, null); 


             
                    localScope.set((IDENT14!=null?IDENT14.getText():null), e); 
                    lastAssignmentResult = e;
                 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "assignment"



    // $ANTLR start "expression"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:321:1: expression returns [Object result] : ( ^( '+' op1= expression op2= expression ) | ^( '-' op1= expression op2= expression ) | ^( '*' op1= expression op2= expression ) | ^( '/' op1= expression op2= expression ) | ^( '%' op1= expression op2= expression ) | ^( ARITH_NEGATION op1= expression ) | ^( '||' op1= expression op2= expression ) | ^( '&&' op1= expression op2= expression ) | ^( '==' op1= expression op2= expression ) | ^( '!=' op1= expression op2= expression ) | ^( '>=' op1= expression op2= expression ) | ^( '<=' op1= expression op2= expression ) | ^( '>' op1= expression op2= expression ) | ^( '<' op1= expression op2= expression ) | ^( BOOL_NEGATION op1= expression ) | INTEGER | BOOL | IDENT | call ) ;
    public final Object expression() throws RecognitionException {
        Object result = null;


        CommonTree INTEGER15=null;
        CommonTree BOOL16=null;
        CommonTree IDENT17=null;
        Object op1 =null;

        Object op2 =null;

        Object call18 =null;


        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:322:3: ( ( ^( '+' op1= expression op2= expression ) | ^( '-' op1= expression op2= expression ) | ^( '*' op1= expression op2= expression ) | ^( '/' op1= expression op2= expression ) | ^( '%' op1= expression op2= expression ) | ^( ARITH_NEGATION op1= expression ) | ^( '||' op1= expression op2= expression ) | ^( '&&' op1= expression op2= expression ) | ^( '==' op1= expression op2= expression ) | ^( '!=' op1= expression op2= expression ) | ^( '>=' op1= expression op2= expression ) | ^( '<=' op1= expression op2= expression ) | ^( '>' op1= expression op2= expression ) | ^( '<' op1= expression op2= expression ) | ^( BOOL_NEGATION op1= expression ) | INTEGER | BOOL | IDENT | call ) )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:323:3: ( ^( '+' op1= expression op2= expression ) | ^( '-' op1= expression op2= expression ) | ^( '*' op1= expression op2= expression ) | ^( '/' op1= expression op2= expression ) | ^( '%' op1= expression op2= expression ) | ^( ARITH_NEGATION op1= expression ) | ^( '||' op1= expression op2= expression ) | ^( '&&' op1= expression op2= expression ) | ^( '==' op1= expression op2= expression ) | ^( '!=' op1= expression op2= expression ) | ^( '>=' op1= expression op2= expression ) | ^( '<=' op1= expression op2= expression ) | ^( '>' op1= expression op2= expression ) | ^( '<' op1= expression op2= expression ) | ^( BOOL_NEGATION op1= expression ) | INTEGER | BOOL | IDENT | call )
            {
            OperationExecuter oe = null;

            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:324:3: ( ^( '+' op1= expression op2= expression ) | ^( '-' op1= expression op2= expression ) | ^( '*' op1= expression op2= expression ) | ^( '/' op1= expression op2= expression ) | ^( '%' op1= expression op2= expression ) | ^( ARITH_NEGATION op1= expression ) | ^( '||' op1= expression op2= expression ) | ^( '&&' op1= expression op2= expression ) | ^( '==' op1= expression op2= expression ) | ^( '!=' op1= expression op2= expression ) | ^( '>=' op1= expression op2= expression ) | ^( '<=' op1= expression op2= expression ) | ^( '>' op1= expression op2= expression ) | ^( '<' op1= expression op2= expression ) | ^( BOOL_NEGATION op1= expression ) | INTEGER | BOOL | IDENT | call )
            int alt14=19;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt14=1;
                }
                break;
            case 34:
                {
                alt14=2;
                }
                break;
            case 31:
                {
                alt14=3;
                }
                break;
            case 35:
                {
                alt14=4;
                }
                break;
            case 29:
                {
                alt14=5;
                }
                break;
            case ARITH_NEGATION:
                {
                alt14=6;
                }
                break;
            case 50:
                {
                alt14=7;
                }
                break;
            case 30:
                {
                alt14=8;
                }
                break;
            case 39:
                {
                alt14=9;
                }
                break;
            case 28:
                {
                alt14=10;
                }
                break;
            case 41:
                {
                alt14=11;
                }
                break;
            case 37:
                {
                alt14=12;
                }
                break;
            case 40:
                {
                alt14=13;
                }
                break;
            case 36:
                {
                alt14=14;
                }
                break;
            case BOOL_NEGATION:
                {
                alt14=15;
                }
                break;
            case INTEGER:
                {
                alt14=16;
                }
                break;
            case BOOL:
                {
                alt14=17;
                }
                break;
            case IDENT:
                {
                alt14=18;
                }
                break;
            case CALL:
                {
                alt14=19;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:325:4: ^( '+' op1= expression op2= expression )
                    {
                    match(input,32,FOLLOW_32_in_expression564); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression570);
                    op1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression576);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     oe = new OperationExecuter(op1,op2,"+"); 

                    }
                    break;
                case 2 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:326:6: ^( '-' op1= expression op2= expression )
                    {
                    match(input,34,FOLLOW_34_in_expression590); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression596);
                    op1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression602);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     oe = new OperationExecuter(op1,op2,"-"); 

                    }
                    break;
                case 3 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:327:6: ^( '*' op1= expression op2= expression )
                    {
                    match(input,31,FOLLOW_31_in_expression614); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression620);
                    op1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression626);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     oe = new OperationExecuter(op1,op2,"*"); 

                    }
                    break;
                case 4 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:328:6: ^( '/' op1= expression op2= expression )
                    {
                    match(input,35,FOLLOW_35_in_expression638); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression644);
                    op1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression650);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     oe = new OperationExecuter(op1,op2,"/"); 

                    }
                    break;
                case 5 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:329:6: ^( '%' op1= expression op2= expression )
                    {
                    match(input,29,FOLLOW_29_in_expression662); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression668);
                    op1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression674);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     oe = new OperationExecuter(op1,op2,"%"); 

                    }
                    break;
                case 6 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:330:6: ^( ARITH_NEGATION op1= expression )
                    {
                    match(input,ARITH_NEGATION,FOLLOW_ARITH_NEGATION_in_expression686); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression692);
                    op1=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     oe = new OperationExecuter(op1,null,"ARITH_NEGATION"); 

                    }
                    break;
                case 7 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:331:6: ^( '||' op1= expression op2= expression )
                    {
                    match(input,50,FOLLOW_50_in_expression710); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression716);
                    op1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression722);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     oe = new OperationExecuter(op1,op2,"||"); 

                    }
                    break;
                case 8 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:332:6: ^( '&&' op1= expression op2= expression )
                    {
                    match(input,30,FOLLOW_30_in_expression733); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression739);
                    op1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression745);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     oe = new OperationExecuter(op1,op2,"&&"); 

                    }
                    break;
                case 9 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:333:6: ^( '==' op1= expression op2= expression )
                    {
                    match(input,39,FOLLOW_39_in_expression756); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression762);
                    op1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression768);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     oe = new OperationExecuter(op1,op2,"=="); 

                    }
                    break;
                case 10 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:334:6: ^( '!=' op1= expression op2= expression )
                    {
                    match(input,28,FOLLOW_28_in_expression779); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression785);
                    op1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression791);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     oe = new OperationExecuter(op1,op2,"!="); 

                    }
                    break;
                case 11 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:335:6: ^( '>=' op1= expression op2= expression )
                    {
                    match(input,41,FOLLOW_41_in_expression802); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression808);
                    op1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression814);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     oe = new OperationExecuter(op1,op2,">="); 

                    }
                    break;
                case 12 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:336:6: ^( '<=' op1= expression op2= expression )
                    {
                    match(input,37,FOLLOW_37_in_expression825); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression831);
                    op1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression837);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     oe = new OperationExecuter(op1,op2,"<="); 

                    }
                    break;
                case 13 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:337:6: ^( '>' op1= expression op2= expression )
                    {
                    match(input,40,FOLLOW_40_in_expression848); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression854);
                    op1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression860);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     oe = new OperationExecuter(op1,op2,">"); 

                    }
                    break;
                case 14 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:338:6: ^( '<' op1= expression op2= expression )
                    {
                    match(input,36,FOLLOW_36_in_expression872); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression878);
                    op1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression884);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     oe = new OperationExecuter(op1,op2,"<"); 

                    }
                    break;
                case 15 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:339:6: ^( BOOL_NEGATION op1= expression )
                    {
                    match(input,BOOL_NEGATION,FOLLOW_BOOL_NEGATION_in_expression896); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression902);
                    op1=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     oe = new OperationExecuter(op1,null,"BOOL_NEGATION"); 

                    }
                    break;
                case 16 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:340:6: INTEGER
                    {
                    INTEGER15=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_expression920); 

                     oe = new OperationExecuter(localScope, (INTEGER15!=null?INTEGER15.getText():null),"INTEGER"); 

                    }
                    break;
                case 17 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:341:6: BOOL
                    {
                    BOOL16=(CommonTree)match(input,BOOL,FOLLOW_BOOL_in_expression964); 

                     oe = new OperationExecuter(localScope, (BOOL16!=null?BOOL16.getText():null),"BOOL"); 

                    }
                    break;
                case 18 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:342:6: IDENT
                    {
                    IDENT17=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_expression1010); 

                     oe = new OperationExecuter(localScope, (IDENT17!=null?IDENT17.getText():null),"IDENT"); 

                    }
                    break;
                case 19 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/EvaluatorWalker.g:343:6: call
                    {
                    pushFollow(FOLLOW_call_in_expression1055);
                    call18=call();

                    state._fsp--;


                     result = call18;

                    }
                    break;

            }


            if (oe != null) result = oe.doOperation();
                if (result == null)
                  BFlatGUI.debugPrint(0, "result of expression is null!");
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "expression"

    // Delegated rules


 

    public static final BitSet FOLLOW_function_in_evaluator72 = new BitSet(new long[]{0x0007FFFFFFFFFFF2L});
    public static final BitSet FOLLOW_FUNC_in_function97 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_function99 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_parameter_in_function101 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_block_in_function104 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARAM_in_parameter130 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_parameter132 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_IDENT_in_parameter134 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_type158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_in_block197 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_lambdaDeclaration_in_block199 = new BitSet(new long[]{0x0002C44000030208L});
    public static final BitSet FOLLOW_declaration_in_block202 = new BitSet(new long[]{0x0002C44000020208L});
    public static final BitSet FOLLOW_lambdaSet_in_block206 = new BitSet(new long[]{0x0002404000020208L});
    public static final BitSet FOLLOW_statement_in_block208 = new BitSet(new long[]{0x0002404000020208L});
    public static final BitSet FOLLOW_LAMBDA_in_lambdaDeclaration231 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_lambdaDeclaration233 = new BitSet(new long[]{0x0007FFFFFFFFFFF0L});
    public static final BitSet FOLLOW_parameter_in_lambdaDeclaration245 = new BitSet(new long[]{0x0007FFFFFFFFFFF0L});
    public static final BitSet FOLLOW_LAMBDASET_in_lambdaSet285 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_lambdaSet287 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_call_in_lambdaSet289 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_47_in_declaration309 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_declaration312 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_42_in_declaration324 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_declaration326 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_call_in_statement347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_whileStatement372 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_whileStatement381 = new BitSet(new long[]{0x0007FFFFFFFFFFF8L});
    public static final BitSet FOLLOW_46_in_ifStatement422 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_ifStatement426 = new BitSet(new long[]{0x0007FFFFFFFFFFF0L});
    public static final BitSet FOLLOW_43_in_ifStatement435 = new BitSet(new long[]{0x0007FFFFFFFFFFF0L});
    public static final BitSet FOLLOW_CALL_in_call472 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_call474 = new BitSet(new long[]{0x0000000000000018L});
    public static final BitSet FOLLOW_argument_in_call477 = new BitSet(new long[]{0x0000000000000018L});
    public static final BitSet FOLLOW_ARG_in_argument503 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_argument505 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_38_in_assignment524 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_assignment526 = new BitSet(new long[]{0x000403BDF000C3A0L});
    public static final BitSet FOLLOW_expression_in_assignment530 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_32_in_expression564 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression570 = new BitSet(new long[]{0x000403BDF000C3A0L});
    public static final BitSet FOLLOW_expression_in_expression576 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_34_in_expression590 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression596 = new BitSet(new long[]{0x000403BDF000C3A0L});
    public static final BitSet FOLLOW_expression_in_expression602 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_31_in_expression614 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression620 = new BitSet(new long[]{0x000403BDF000C3A0L});
    public static final BitSet FOLLOW_expression_in_expression626 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_35_in_expression638 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression644 = new BitSet(new long[]{0x000403BDF000C3A0L});
    public static final BitSet FOLLOW_expression_in_expression650 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_29_in_expression662 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression668 = new BitSet(new long[]{0x000403BDF000C3A0L});
    public static final BitSet FOLLOW_expression_in_expression674 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARITH_NEGATION_in_expression686 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression692 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_50_in_expression710 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression716 = new BitSet(new long[]{0x000403BDF000C3A0L});
    public static final BitSet FOLLOW_expression_in_expression722 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_30_in_expression733 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression739 = new BitSet(new long[]{0x000403BDF000C3A0L});
    public static final BitSet FOLLOW_expression_in_expression745 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_39_in_expression756 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression762 = new BitSet(new long[]{0x000403BDF000C3A0L});
    public static final BitSet FOLLOW_expression_in_expression768 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_28_in_expression779 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression785 = new BitSet(new long[]{0x000403BDF000C3A0L});
    public static final BitSet FOLLOW_expression_in_expression791 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_41_in_expression802 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression808 = new BitSet(new long[]{0x000403BDF000C3A0L});
    public static final BitSet FOLLOW_expression_in_expression814 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_37_in_expression825 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression831 = new BitSet(new long[]{0x000403BDF000C3A0L});
    public static final BitSet FOLLOW_expression_in_expression837 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_40_in_expression848 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression854 = new BitSet(new long[]{0x000403BDF000C3A0L});
    public static final BitSet FOLLOW_expression_in_expression860 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_36_in_expression872 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression878 = new BitSet(new long[]{0x000403BDF000C3A0L});
    public static final BitSet FOLLOW_expression_in_expression884 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOOL_NEGATION_in_expression896 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression902 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTEGER_in_expression920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_expression964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_expression1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_expression1055 = new BitSet(new long[]{0x0000000000000002L});

}