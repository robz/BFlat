// $ANTLR 3.4 /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g 2011-11-25 11:07:17

  package a.b.c;
  import java.util.HashMap;
  import java.util.Map;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class BFlatGrammarParser extends Parser {
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public BFlatGrammarParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public BFlatGrammarParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return BFlatGrammarParser.tokenNames; }
    public String getGrammarFileName() { return "/v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g"; }


      Map<String,FunctInfo> functionDefinitions = new HashMap<String,FunctInfo>();
      
      void addFunction(String name, FunctInfo functInfo) {
        if (functionDefinitions.containsKey(name)) {
          BFlatGUI.debugPrint(0, "function \""+name+"\" seems to be duplicated.");
        } else {
          functionDefinitions.put(name, functInfo);
        }
      }
      
      Map<String,FunctInfo> getFunctionDefinitions() { return functionDefinitions; }


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:48:1: program : ( function )+ ;
    public final BFlatGrammarParser.program_return program() throws RecognitionException {
        BFlatGrammarParser.program_return retval = new BFlatGrammarParser.program_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        BFlatGrammarParser.function_return function1 =null;



        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:49:3: ( ( function )+ )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:49:5: ( function )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:49:5: ( function )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==45) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:49:5: function
            	    {
            	    pushFollow(FOLLOW_function_in_program124);
            	    function1=function();

            	    state._fsp--;

            	    adaptor.addChild(root_0, function1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "program"


    public static class function_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:68:1: function : 'function' IDENT LPAR ( parameter_list )? RPAR LBRACE block RBRACE -> ^( FUNC IDENT ( parameter_list )? block ) ;
    public final BFlatGrammarParser.function_return function() throws RecognitionException {
        BFlatGrammarParser.function_return retval = new BFlatGrammarParser.function_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal2=null;
        Token IDENT3=null;
        Token LPAR4=null;
        Token RPAR6=null;
        Token LBRACE7=null;
        Token RBRACE9=null;
        BFlatGrammarParser.parameter_list_return parameter_list5 =null;

        BFlatGrammarParser.block_return block8 =null;


        CommonTree string_literal2_tree=null;
        CommonTree IDENT3_tree=null;
        CommonTree LPAR4_tree=null;
        CommonTree RPAR6_tree=null;
        CommonTree LBRACE7_tree=null;
        CommonTree RBRACE9_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_parameter_list=new RewriteRuleSubtreeStream(adaptor,"rule parameter_list");
        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:69:3: ( 'function' IDENT LPAR ( parameter_list )? RPAR LBRACE block RBRACE -> ^( FUNC IDENT ( parameter_list )? block ) )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:69:5: 'function' IDENT LPAR ( parameter_list )? RPAR LBRACE block RBRACE
            {
            string_literal2=(Token)match(input,45,FOLLOW_45_in_function144);  
            stream_45.add(string_literal2);


            IDENT3=(Token)match(input,IDENT,FOLLOW_IDENT_in_function146);  
            stream_IDENT.add(IDENT3);


            LPAR4=(Token)match(input,LPAR,FOLLOW_LPAR_in_function148);  
            stream_LPAR.add(LPAR4);


            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:69:27: ( parameter_list )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==42||LA2_0==44||LA2_0==47) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:69:27: parameter_list
                    {
                    pushFollow(FOLLOW_parameter_list_in_function150);
                    parameter_list5=parameter_list();

                    state._fsp--;

                    stream_parameter_list.add(parameter_list5.getTree());

                    }
                    break;

            }


            RPAR6=(Token)match(input,RPAR,FOLLOW_RPAR_in_function153);  
            stream_RPAR.add(RPAR6);


            LBRACE7=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_function155);  
            stream_LBRACE.add(LBRACE7);


            pushFollow(FOLLOW_block_in_function157);
            block8=block();

            state._fsp--;

            stream_block.add(block8.getTree());

            RBRACE9=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_function159);  
            stream_RBRACE.add(RBRACE9);


            // AST REWRITE
            // elements: parameter_list, block, IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 70:5: -> ^( FUNC IDENT ( parameter_list )? block )
            {
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:70:8: ^( FUNC IDENT ( parameter_list )? block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FUNC, "FUNC")
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENT.nextNode()
                );

                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:70:21: ( parameter_list )?
                if ( stream_parameter_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameter_list.nextTree());

                }
                stream_parameter_list.reset();

                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving

                String functionName = ((CommonTree)retval.tree).getChild(0).toString();
                String paramString = "", divider = "", typeList = "";
                int i = 1;
                while(((CommonTree)retval.tree).getChild(i).toString().equals("PARAM")) {
                  paramString += divider + ((CommonTree)retval.tree).getChild(i).getChild(1).toString();
                  typeList += divider + ((CommonTree)retval.tree).getChild(i).getChild(0).toString();
                  divider = ";";
                  i++;
                }
                addFunction(functionName, new FunctInfo((CommonTree)((CommonTree)retval.tree).getChild(i), paramString, typeList));
              
        }
        return retval;
    }
    // $ANTLR end "function"


    public static class parameter_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameter_list"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:85:1: parameter_list : parameter ( ',' ! parameter )* ;
    public final BFlatGrammarParser.parameter_list_return parameter_list() throws RecognitionException {
        BFlatGrammarParser.parameter_list_return retval = new BFlatGrammarParser.parameter_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal11=null;
        BFlatGrammarParser.parameter_return parameter10 =null;

        BFlatGrammarParser.parameter_return parameter12 =null;


        CommonTree char_literal11_tree=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:86:3: ( parameter ( ',' ! parameter )* )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:86:5: parameter ( ',' ! parameter )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_parameter_in_parameter_list196);
            parameter10=parameter();

            state._fsp--;

            adaptor.addChild(root_0, parameter10.getTree());

            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:86:15: ( ',' ! parameter )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==33) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:86:16: ',' ! parameter
            	    {
            	    char_literal11=(Token)match(input,33,FOLLOW_33_in_parameter_list199); 

            	    pushFollow(FOLLOW_parameter_in_parameter_list202);
            	    parameter12=parameter();

            	    state._fsp--;

            	    adaptor.addChild(root_0, parameter12.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parameter_list"


    public static class parameter_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameter"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:88:1: parameter : paramType IDENT -> ^( PARAM paramType IDENT ) ;
    public final BFlatGrammarParser.parameter_return parameter() throws RecognitionException {
        BFlatGrammarParser.parameter_return retval = new BFlatGrammarParser.parameter_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENT14=null;
        BFlatGrammarParser.paramType_return paramType13 =null;


        CommonTree IDENT14_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_paramType=new RewriteRuleSubtreeStream(adaptor,"rule paramType");
        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:89:3: ( paramType IDENT -> ^( PARAM paramType IDENT ) )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:89:5: paramType IDENT
            {
            pushFollow(FOLLOW_paramType_in_parameter214);
            paramType13=paramType();

            state._fsp--;

            stream_paramType.add(paramType13.getTree());

            IDENT14=(Token)match(input,IDENT,FOLLOW_IDENT_in_parameter216);  
            stream_IDENT.add(IDENT14);


            // AST REWRITE
            // elements: IDENT, paramType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 89:21: -> ^( PARAM paramType IDENT )
            {
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:89:24: ^( PARAM paramType IDENT )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PARAM, "PARAM")
                , root_1);

                adaptor.addChild(root_1, stream_paramType.nextTree());

                adaptor.addChild(root_1, 
                stream_IDENT.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parameter"


    public static class paramType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "paramType"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:92:1: paramType : ( type | 'funct' );
    public final BFlatGrammarParser.paramType_return paramType() throws RecognitionException {
        BFlatGrammarParser.paramType_return retval = new BFlatGrammarParser.paramType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal16=null;
        BFlatGrammarParser.type_return type15 =null;


        CommonTree string_literal16_tree=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:93:3: ( type | 'funct' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==42||LA4_0==47) ) {
                alt4=1;
            }
            else if ( (LA4_0==44) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:93:5: type
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_type_in_paramType241);
                    type15=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type15.getTree());

                    }
                    break;
                case 2 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:93:10: 'funct'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal16=(Token)match(input,44,FOLLOW_44_in_paramType243); 
                    string_literal16_tree = 
                    (CommonTree)adaptor.create(string_literal16)
                    ;
                    adaptor.addChild(root_0, string_literal16_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "paramType"


    public static class block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:95:1: block : ( lambdaDeclaration | declaration )* ( statement )* -> ^( BLOCK ( lambdaDeclaration )* ( declaration )* ( statement )* ) ;
    public final BFlatGrammarParser.block_return block() throws RecognitionException {
        BFlatGrammarParser.block_return retval = new BFlatGrammarParser.block_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        BFlatGrammarParser.lambdaDeclaration_return lambdaDeclaration17 =null;

        BFlatGrammarParser.declaration_return declaration18 =null;

        BFlatGrammarParser.statement_return statement19 =null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_lambdaDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule lambdaDeclaration");
        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:96:3: ( ( lambdaDeclaration | declaration )* ( statement )* -> ^( BLOCK ( lambdaDeclaration )* ( declaration )* ( statement )* ) )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:96:5: ( lambdaDeclaration | declaration )* ( statement )*
            {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:96:5: ( lambdaDeclaration | declaration )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==44) ) {
                    int LA5_2 = input.LA(2);

                    if ( (LA5_2==IDENT) ) {
                        int LA5_4 = input.LA(3);

                        if ( (LA5_4==38) ) {
                            int LA5_5 = input.LA(4);

                            if ( (LA5_5==48) ) {
                                alt5=1;
                            }


                        }


                    }


                }
                else if ( (LA5_0==42||LA5_0==47) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:96:6: lambdaDeclaration
            	    {
            	    pushFollow(FOLLOW_lambdaDeclaration_in_block254);
            	    lambdaDeclaration17=lambdaDeclaration();

            	    state._fsp--;

            	    stream_lambdaDeclaration.add(lambdaDeclaration17.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:96:26: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_block258);
            	    declaration18=declaration();

            	    state._fsp--;

            	    stream_declaration.add(declaration18.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:96:40: ( statement )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==IDENT||LA6_0==44||LA6_0==46||LA6_0==49) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:96:40: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block262);
            	    statement19=statement();

            	    state._fsp--;

            	    stream_statement.add(statement19.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            // AST REWRITE
            // elements: declaration, statement, lambdaDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 96:51: -> ^( BLOCK ( lambdaDeclaration )* ( declaration )* ( statement )* )
            {
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:96:54: ^( BLOCK ( lambdaDeclaration )* ( declaration )* ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(BLOCK, "BLOCK")
                , root_1);

                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:96:62: ( lambdaDeclaration )*
                while ( stream_lambdaDeclaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_lambdaDeclaration.nextTree());

                }
                stream_lambdaDeclaration.reset();

                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:96:81: ( declaration )*
                while ( stream_declaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_declaration.nextTree());

                }
                stream_declaration.reset();

                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:96:94: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "block"


    public static class declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaration"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:99:1: declaration : type ^ IDENT ( ',' ! IDENT )* EOL !;
    public final BFlatGrammarParser.declaration_return declaration() throws RecognitionException {
        BFlatGrammarParser.declaration_return retval = new BFlatGrammarParser.declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENT21=null;
        Token char_literal22=null;
        Token IDENT23=null;
        Token EOL24=null;
        BFlatGrammarParser.type_return type20 =null;


        CommonTree IDENT21_tree=null;
        CommonTree char_literal22_tree=null;
        CommonTree IDENT23_tree=null;
        CommonTree EOL24_tree=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:100:3: ( type ^ IDENT ( ',' ! IDENT )* EOL !)
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:100:5: type ^ IDENT ( ',' ! IDENT )* EOL !
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_type_in_declaration291);
            type20=type();

            state._fsp--;

            root_0 = (CommonTree)adaptor.becomeRoot(type20.getTree(), root_0);

            IDENT21=(Token)match(input,IDENT,FOLLOW_IDENT_in_declaration294); 
            IDENT21_tree = 
            (CommonTree)adaptor.create(IDENT21)
            ;
            adaptor.addChild(root_0, IDENT21_tree);


            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:100:17: ( ',' ! IDENT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==33) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:100:18: ',' ! IDENT
            	    {
            	    char_literal22=(Token)match(input,33,FOLLOW_33_in_declaration297); 

            	    IDENT23=(Token)match(input,IDENT,FOLLOW_IDENT_in_declaration300); 
            	    IDENT23_tree = 
            	    (CommonTree)adaptor.create(IDENT23)
            	    ;
            	    adaptor.addChild(root_0, IDENT23_tree);


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            EOL24=(Token)match(input,EOL,FOLLOW_EOL_in_declaration304); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declaration"


    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:102:1: statement : ( ifStatement | whileStatement | assignment EOL !| call EOL !| lambdaSet EOL !) ;
    public final BFlatGrammarParser.statement_return statement() throws RecognitionException {
        BFlatGrammarParser.statement_return retval = new BFlatGrammarParser.statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOL28=null;
        Token EOL30=null;
        Token EOL32=null;
        BFlatGrammarParser.ifStatement_return ifStatement25 =null;

        BFlatGrammarParser.whileStatement_return whileStatement26 =null;

        BFlatGrammarParser.assignment_return assignment27 =null;

        BFlatGrammarParser.call_return call29 =null;

        BFlatGrammarParser.lambdaSet_return lambdaSet31 =null;


        CommonTree EOL28_tree=null;
        CommonTree EOL30_tree=null;
        CommonTree EOL32_tree=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:103:3: ( ( ifStatement | whileStatement | assignment EOL !| call EOL !| lambdaSet EOL !) )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:103:5: ( ifStatement | whileStatement | assignment EOL !| call EOL !| lambdaSet EOL !)
            {
            root_0 = (CommonTree)adaptor.nil();


            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:103:5: ( ifStatement | whileStatement | assignment EOL !| call EOL !| lambdaSet EOL !)
            int alt8=5;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt8=1;
                }
                break;
            case 49:
                {
                alt8=2;
                }
                break;
            case IDENT:
                {
                int LA8_3 = input.LA(2);

                if ( (LA8_3==LPAR) ) {
                    alt8=4;
                }
                else if ( (LA8_3==38) ) {
                    alt8=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 3, input);

                    throw nvae;

                }
                }
                break;
            case 44:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:103:6: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement317);
                    ifStatement25=ifStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, ifStatement25.getTree());

                    }
                    break;
                case 2 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:103:20: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement321);
                    whileStatement26=whileStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, whileStatement26.getTree());

                    }
                    break;
                case 3 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:103:37: assignment EOL !
                    {
                    pushFollow(FOLLOW_assignment_in_statement325);
                    assignment27=assignment();

                    state._fsp--;

                    adaptor.addChild(root_0, assignment27.getTree());

                    EOL28=(Token)match(input,EOL,FOLLOW_EOL_in_statement327); 

                    }
                    break;
                case 4 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:103:55: call EOL !
                    {
                    pushFollow(FOLLOW_call_in_statement332);
                    call29=call();

                    state._fsp--;

                    adaptor.addChild(root_0, call29.getTree());

                    EOL30=(Token)match(input,EOL,FOLLOW_EOL_in_statement334); 

                    }
                    break;
                case 5 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:103:67: lambdaSet EOL !
                    {
                    pushFollow(FOLLOW_lambdaSet_in_statement339);
                    lambdaSet31=lambdaSet();

                    state._fsp--;

                    adaptor.addChild(root_0, lambdaSet31.getTree());

                    EOL32=(Token)match(input,EOL,FOLLOW_EOL_in_statement341); 

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class ifStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifStatement"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:105:1: ifStatement : ( 'if' ^) LPAR ! expression RPAR ! LBRACE ! block RBRACE ! ( ( 'else' ) LBRACE ! block RBRACE !)? ;
    public final BFlatGrammarParser.ifStatement_return ifStatement() throws RecognitionException {
        BFlatGrammarParser.ifStatement_return retval = new BFlatGrammarParser.ifStatement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal33=null;
        Token LPAR34=null;
        Token RPAR36=null;
        Token LBRACE37=null;
        Token RBRACE39=null;
        Token string_literal40=null;
        Token LBRACE41=null;
        Token RBRACE43=null;
        BFlatGrammarParser.expression_return expression35 =null;

        BFlatGrammarParser.block_return block38 =null;

        BFlatGrammarParser.block_return block42 =null;


        CommonTree string_literal33_tree=null;
        CommonTree LPAR34_tree=null;
        CommonTree RPAR36_tree=null;
        CommonTree LBRACE37_tree=null;
        CommonTree RBRACE39_tree=null;
        CommonTree string_literal40_tree=null;
        CommonTree LBRACE41_tree=null;
        CommonTree RBRACE43_tree=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:106:3: ( ( 'if' ^) LPAR ! expression RPAR ! LBRACE ! block RBRACE ! ( ( 'else' ) LBRACE ! block RBRACE !)? )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:106:5: ( 'if' ^) LPAR ! expression RPAR ! LBRACE ! block RBRACE ! ( ( 'else' ) LBRACE ! block RBRACE !)?
            {
            root_0 = (CommonTree)adaptor.nil();


            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:106:5: ( 'if' ^)
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:106:6: 'if' ^
            {
            string_literal33=(Token)match(input,46,FOLLOW_46_in_ifStatement356); 
            string_literal33_tree = 
            (CommonTree)adaptor.create(string_literal33)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal33_tree, root_0);


            }


            LPAR34=(Token)match(input,LPAR,FOLLOW_LPAR_in_ifStatement360); 

            pushFollow(FOLLOW_expression_in_ifStatement363);
            expression35=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression35.getTree());

            RPAR36=(Token)match(input,RPAR,FOLLOW_RPAR_in_ifStatement365); 

            LBRACE37=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_ifStatement368); 

            pushFollow(FOLLOW_block_in_ifStatement371);
            block38=block();

            state._fsp--;

            adaptor.addChild(root_0, block38.getTree());

            RBRACE39=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_ifStatement374); 

            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:106:59: ( ( 'else' ) LBRACE ! block RBRACE !)?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==43) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:106:60: ( 'else' ) LBRACE ! block RBRACE !
                    {
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:106:60: ( 'else' )
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:106:61: 'else'
                    {
                    string_literal40=(Token)match(input,43,FOLLOW_43_in_ifStatement379); 
                    string_literal40_tree = 
                    (CommonTree)adaptor.create(string_literal40)
                    ;
                    adaptor.addChild(root_0, string_literal40_tree);


                    }


                    LBRACE41=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_ifStatement382); 

                    pushFollow(FOLLOW_block_in_ifStatement385);
                    block42=block();

                    state._fsp--;

                    adaptor.addChild(root_0, block42.getTree());

                    RBRACE43=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_ifStatement387); 

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ifStatement"


    public static class whileStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whileStatement"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:109:1: whileStatement : 'while' LPAR expression RPAR LBRACE block RBRACE -> ^( 'while' expression block ) ;
    public final BFlatGrammarParser.whileStatement_return whileStatement() throws RecognitionException {
        BFlatGrammarParser.whileStatement_return retval = new BFlatGrammarParser.whileStatement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal44=null;
        Token LPAR45=null;
        Token RPAR47=null;
        Token LBRACE48=null;
        Token RBRACE50=null;
        BFlatGrammarParser.expression_return expression46 =null;

        BFlatGrammarParser.block_return block49 =null;


        CommonTree string_literal44_tree=null;
        CommonTree LPAR45_tree=null;
        CommonTree RPAR47_tree=null;
        CommonTree LBRACE48_tree=null;
        CommonTree RBRACE50_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
        RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:110:3: ( 'while' LPAR expression RPAR LBRACE block RBRACE -> ^( 'while' expression block ) )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:110:5: 'while' LPAR expression RPAR LBRACE block RBRACE
            {
            string_literal44=(Token)match(input,49,FOLLOW_49_in_whileStatement405);  
            stream_49.add(string_literal44);


            LPAR45=(Token)match(input,LPAR,FOLLOW_LPAR_in_whileStatement407);  
            stream_LPAR.add(LPAR45);


            pushFollow(FOLLOW_expression_in_whileStatement409);
            expression46=expression();

            state._fsp--;

            stream_expression.add(expression46.getTree());

            RPAR47=(Token)match(input,RPAR,FOLLOW_RPAR_in_whileStatement411);  
            stream_RPAR.add(RPAR47);


            LBRACE48=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_whileStatement413);  
            stream_LBRACE.add(LBRACE48);


            pushFollow(FOLLOW_block_in_whileStatement415);
            block49=block();

            state._fsp--;

            stream_block.add(block49.getTree());

            RBRACE50=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_whileStatement417);  
            stream_RBRACE.add(RBRACE50);


            // AST REWRITE
            // elements: block, expression, 49
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 110:54: -> ^( 'while' expression block )
            {
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:110:57: ^( 'while' expression block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_49.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "whileStatement"


    public static class assignment_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:113:1: assignment : IDENT ( '=' ^) expression ;
    public final BFlatGrammarParser.assignment_return assignment() throws RecognitionException {
        BFlatGrammarParser.assignment_return retval = new BFlatGrammarParser.assignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENT51=null;
        Token char_literal52=null;
        BFlatGrammarParser.expression_return expression53 =null;


        CommonTree IDENT51_tree=null;
        CommonTree char_literal52_tree=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:114:3: ( IDENT ( '=' ^) expression )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:114:5: IDENT ( '=' ^) expression
            {
            root_0 = (CommonTree)adaptor.nil();


            IDENT51=(Token)match(input,IDENT,FOLLOW_IDENT_in_assignment443); 
            IDENT51_tree = 
            (CommonTree)adaptor.create(IDENT51)
            ;
            adaptor.addChild(root_0, IDENT51_tree);


            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:114:11: ( '=' ^)
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:114:12: '=' ^
            {
            char_literal52=(Token)match(input,38,FOLLOW_38_in_assignment446); 
            char_literal52_tree = 
            (CommonTree)adaptor.create(char_literal52)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(char_literal52_tree, root_0);


            }


            pushFollow(FOLLOW_expression_in_assignment450);
            expression53=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression53.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignment"


    public static class type_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:117:1: type : ( 'int' | 'boolean' ) ;
    public final BFlatGrammarParser.type_return type() throws RecognitionException {
        BFlatGrammarParser.type_return retval = new BFlatGrammarParser.type_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set54=null;

        CommonTree set54_tree=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:118:3: ( ( 'int' | 'boolean' ) )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set54=(Token)input.LT(1);

            if ( input.LA(1)==42||input.LA(1)==47 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set54)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type"


    public static class lambdaDeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "lambdaDeclaration"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:121:1: lambdaDeclaration : 'funct' IDENT '=' 'lambda' LPAR ( parameter_list )? RPAR LBRACE block RBRACE EOL -> ^( LAMBDA IDENT ( parameter_list )? block ) ;
    public final BFlatGrammarParser.lambdaDeclaration_return lambdaDeclaration() throws RecognitionException {
        BFlatGrammarParser.lambdaDeclaration_return retval = new BFlatGrammarParser.lambdaDeclaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal55=null;
        Token IDENT56=null;
        Token char_literal57=null;
        Token string_literal58=null;
        Token LPAR59=null;
        Token RPAR61=null;
        Token LBRACE62=null;
        Token RBRACE64=null;
        Token EOL65=null;
        BFlatGrammarParser.parameter_list_return parameter_list60 =null;

        BFlatGrammarParser.block_return block63 =null;


        CommonTree string_literal55_tree=null;
        CommonTree IDENT56_tree=null;
        CommonTree char_literal57_tree=null;
        CommonTree string_literal58_tree=null;
        CommonTree LPAR59_tree=null;
        CommonTree RPAR61_tree=null;
        CommonTree LBRACE62_tree=null;
        CommonTree RBRACE64_tree=null;
        CommonTree EOL65_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
        RewriteRuleTokenStream stream_EOL=new RewriteRuleTokenStream(adaptor,"token EOL");
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_parameter_list=new RewriteRuleSubtreeStream(adaptor,"rule parameter_list");
        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:122:3: ( 'funct' IDENT '=' 'lambda' LPAR ( parameter_list )? RPAR LBRACE block RBRACE EOL -> ^( LAMBDA IDENT ( parameter_list )? block ) )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:122:5: 'funct' IDENT '=' 'lambda' LPAR ( parameter_list )? RPAR LBRACE block RBRACE EOL
            {
            string_literal55=(Token)match(input,44,FOLLOW_44_in_lambdaDeclaration486);  
            stream_44.add(string_literal55);


            IDENT56=(Token)match(input,IDENT,FOLLOW_IDENT_in_lambdaDeclaration488);  
            stream_IDENT.add(IDENT56);


            char_literal57=(Token)match(input,38,FOLLOW_38_in_lambdaDeclaration490);  
            stream_38.add(char_literal57);


            string_literal58=(Token)match(input,48,FOLLOW_48_in_lambdaDeclaration492);  
            stream_48.add(string_literal58);


            LPAR59=(Token)match(input,LPAR,FOLLOW_LPAR_in_lambdaDeclaration494);  
            stream_LPAR.add(LPAR59);


            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:122:37: ( parameter_list )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==42||LA10_0==44||LA10_0==47) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:122:37: parameter_list
                    {
                    pushFollow(FOLLOW_parameter_list_in_lambdaDeclaration496);
                    parameter_list60=parameter_list();

                    state._fsp--;

                    stream_parameter_list.add(parameter_list60.getTree());

                    }
                    break;

            }


            RPAR61=(Token)match(input,RPAR,FOLLOW_RPAR_in_lambdaDeclaration499);  
            stream_RPAR.add(RPAR61);


            LBRACE62=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_lambdaDeclaration501);  
            stream_LBRACE.add(LBRACE62);


            pushFollow(FOLLOW_block_in_lambdaDeclaration503);
            block63=block();

            state._fsp--;

            stream_block.add(block63.getTree());

            RBRACE64=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_lambdaDeclaration505);  
            stream_RBRACE.add(RBRACE64);


            EOL65=(Token)match(input,EOL,FOLLOW_EOL_in_lambdaDeclaration507);  
            stream_EOL.add(EOL65);


            // AST REWRITE
            // elements: parameter_list, block, IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 123:5: -> ^( LAMBDA IDENT ( parameter_list )? block )
            {
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:123:8: ^( LAMBDA IDENT ( parameter_list )? block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(LAMBDA, "LAMBDA")
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENT.nextNode()
                );

                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:123:23: ( parameter_list )?
                if ( stream_parameter_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameter_list.nextTree());

                }
                stream_parameter_list.reset();

                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "lambdaDeclaration"


    public static class lambdaSet_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "lambdaSet"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:126:1: lambdaSet : 'funct' IDENT '=' call -> ^( LAMBDASET IDENT call ) ;
    public final BFlatGrammarParser.lambdaSet_return lambdaSet() throws RecognitionException {
        BFlatGrammarParser.lambdaSet_return retval = new BFlatGrammarParser.lambdaSet_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal66=null;
        Token IDENT67=null;
        Token char_literal68=null;
        BFlatGrammarParser.call_return call69 =null;


        CommonTree string_literal66_tree=null;
        CommonTree IDENT67_tree=null;
        CommonTree char_literal68_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_call=new RewriteRuleSubtreeStream(adaptor,"rule call");
        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:127:3: ( 'funct' IDENT '=' call -> ^( LAMBDASET IDENT call ) )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:127:5: 'funct' IDENT '=' call
            {
            string_literal66=(Token)match(input,44,FOLLOW_44_in_lambdaSet540);  
            stream_44.add(string_literal66);


            IDENT67=(Token)match(input,IDENT,FOLLOW_IDENT_in_lambdaSet542);  
            stream_IDENT.add(IDENT67);


            char_literal68=(Token)match(input,38,FOLLOW_38_in_lambdaSet544);  
            stream_38.add(char_literal68);


            pushFollow(FOLLOW_call_in_lambdaSet546);
            call69=call();

            state._fsp--;

            stream_call.add(call69.getTree());

            // AST REWRITE
            // elements: IDENT, call
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 128:5: -> ^( LAMBDASET IDENT call )
            {
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:128:8: ^( LAMBDASET IDENT call )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(LAMBDASET, "LAMBDASET")
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENT.nextNode()
                );

                adaptor.addChild(root_1, stream_call.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "lambdaSet"


    public static class call_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "call"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:133:1: call : IDENT LPAR ( arglist )? RPAR -> ^( CALL IDENT ( arglist )? ) ;
    public final BFlatGrammarParser.call_return call() throws RecognitionException {
        BFlatGrammarParser.call_return retval = new BFlatGrammarParser.call_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENT70=null;
        Token LPAR71=null;
        Token RPAR73=null;
        BFlatGrammarParser.arglist_return arglist72 =null;


        CommonTree IDENT70_tree=null;
        CommonTree LPAR71_tree=null;
        CommonTree RPAR73_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
        RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");
        RewriteRuleSubtreeStream stream_arglist=new RewriteRuleSubtreeStream(adaptor,"rule arglist");
        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:134:3: ( IDENT LPAR ( arglist )? RPAR -> ^( CALL IDENT ( arglist )? ) )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:134:5: IDENT LPAR ( arglist )? RPAR
            {
            IDENT70=(Token)match(input,IDENT,FOLLOW_IDENT_in_call577);  
            stream_IDENT.add(IDENT70);


            LPAR71=(Token)match(input,LPAR,FOLLOW_LPAR_in_call579);  
            stream_LPAR.add(LPAR71);


            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:134:16: ( arglist )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==BOOL||(LA11_0 >= IDENT && LA11_0 <= INTEGER)||LA11_0==LPAR||LA11_0==27||LA11_0==32||LA11_0==34) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:134:16: arglist
                    {
                    pushFollow(FOLLOW_arglist_in_call581);
                    arglist72=arglist();

                    state._fsp--;

                    stream_arglist.add(arglist72.getTree());

                    }
                    break;

            }


            RPAR73=(Token)match(input,RPAR,FOLLOW_RPAR_in_call584);  
            stream_RPAR.add(RPAR73);


            // AST REWRITE
            // elements: arglist, IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 134:30: -> ^( CALL IDENT ( arglist )? )
            {
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:134:33: ^( CALL IDENT ( arglist )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CALL, "CALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENT.nextNode()
                );

                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:134:46: ( arglist )?
                if ( stream_arglist.hasNext() ) {
                    adaptor.addChild(root_1, stream_arglist.nextTree());

                }
                stream_arglist.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "call"


    public static class arglist_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arglist"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:137:1: arglist : argument ( ',' ! argument )* ;
    public final BFlatGrammarParser.arglist_return arglist() throws RecognitionException {
        BFlatGrammarParser.arglist_return retval = new BFlatGrammarParser.arglist_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal75=null;
        BFlatGrammarParser.argument_return argument74 =null;

        BFlatGrammarParser.argument_return argument76 =null;


        CommonTree char_literal75_tree=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:138:3: ( argument ( ',' ! argument )* )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:138:5: argument ( ',' ! argument )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_argument_in_arglist608);
            argument74=argument();

            state._fsp--;

            adaptor.addChild(root_0, argument74.getTree());

            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:138:14: ( ',' ! argument )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==33) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:138:15: ',' ! argument
            	    {
            	    char_literal75=(Token)match(input,33,FOLLOW_33_in_arglist611); 

            	    pushFollow(FOLLOW_argument_in_arglist614);
            	    argument76=argument();

            	    state._fsp--;

            	    adaptor.addChild(root_0, argument76.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arglist"


    public static class argument_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "argument"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:141:1: argument : expression -> ^( ARG expression ) ;
    public final BFlatGrammarParser.argument_return argument() throws RecognitionException {
        BFlatGrammarParser.argument_return retval = new BFlatGrammarParser.argument_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        BFlatGrammarParser.expression_return expression77 =null;


        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:142:3: ( expression -> ^( ARG expression ) )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:142:5: expression
            {
            pushFollow(FOLLOW_expression_in_argument631);
            expression77=expression();

            state._fsp--;

            stream_expression.add(expression77.getTree());

            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 142:16: -> ^( ARG expression )
            {
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:142:19: ^( ARG expression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ARG, "ARG")
                , root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "argument"


    public static class term_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:145:1: term : ( call | IDENT | ( LPAR ! expression RPAR !) | INTEGER | BOOL );
    public final BFlatGrammarParser.term_return term() throws RecognitionException {
        BFlatGrammarParser.term_return retval = new BFlatGrammarParser.term_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENT79=null;
        Token LPAR80=null;
        Token RPAR82=null;
        Token INTEGER83=null;
        Token BOOL84=null;
        BFlatGrammarParser.call_return call78 =null;

        BFlatGrammarParser.expression_return expression81 =null;


        CommonTree IDENT79_tree=null;
        CommonTree LPAR80_tree=null;
        CommonTree RPAR82_tree=null;
        CommonTree INTEGER83_tree=null;
        CommonTree BOOL84_tree=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:146:3: ( call | IDENT | ( LPAR ! expression RPAR !) | INTEGER | BOOL )
            int alt13=5;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==LPAR) ) {
                    alt13=1;
                }
                else if ( (LA13_1==EOL||LA13_1==RPAR||(LA13_1 >= 28 && LA13_1 <= 37)||(LA13_1 >= 39 && LA13_1 <= 41)||LA13_1==50) ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;

                }
                }
                break;
            case LPAR:
                {
                alt13=3;
                }
                break;
            case INTEGER:
                {
                alt13=4;
                }
                break;
            case BOOL:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:146:5: call
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_call_in_term653);
                    call78=call();

                    state._fsp--;

                    adaptor.addChild(root_0, call78.getTree());

                    }
                    break;
                case 2 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:146:12: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    IDENT79=(Token)match(input,IDENT,FOLLOW_IDENT_in_term657); 
                    IDENT79_tree = 
                    (CommonTree)adaptor.create(IDENT79)
                    ;
                    adaptor.addChild(root_0, IDENT79_tree);


                    }
                    break;
                case 3 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:146:20: ( LPAR ! expression RPAR !)
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:146:20: ( LPAR ! expression RPAR !)
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:146:21: LPAR ! expression RPAR !
                    {
                    LPAR80=(Token)match(input,LPAR,FOLLOW_LPAR_in_term662); 

                    pushFollow(FOLLOW_expression_in_term665);
                    expression81=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression81.getTree());

                    RPAR82=(Token)match(input,RPAR,FOLLOW_RPAR_in_term667); 

                    }


                    }
                    break;
                case 4 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:146:47: INTEGER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    INTEGER83=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_term673); 
                    INTEGER83_tree = 
                    (CommonTree)adaptor.create(INTEGER83)
                    ;
                    adaptor.addChild(root_0, INTEGER83_tree);


                    }
                    break;
                case 5 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:146:57: BOOL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    BOOL84=(Token)match(input,BOOL,FOLLOW_BOOL_in_term677); 
                    BOOL84_tree = 
                    (CommonTree)adaptor.create(BOOL84)
                    ;
                    adaptor.addChild(root_0, BOOL84_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class unary_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:149:1: unary : ( '+' !| arithNegation ^| boolNegation ^)* term ;
    public final BFlatGrammarParser.unary_return unary() throws RecognitionException {
        BFlatGrammarParser.unary_return retval = new BFlatGrammarParser.unary_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal85=null;
        BFlatGrammarParser.arithNegation_return arithNegation86 =null;

        BFlatGrammarParser.boolNegation_return boolNegation87 =null;

        BFlatGrammarParser.term_return term88 =null;


        CommonTree char_literal85_tree=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:150:3: ( ( '+' !| arithNegation ^| boolNegation ^)* term )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:150:5: ( '+' !| arithNegation ^| boolNegation ^)* term
            {
            root_0 = (CommonTree)adaptor.nil();


            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:150:5: ( '+' !| arithNegation ^| boolNegation ^)*
            loop14:
            do {
                int alt14=4;
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
                case 27:
                    {
                    alt14=3;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:150:6: '+' !
            	    {
            	    char_literal85=(Token)match(input,32,FOLLOW_32_in_unary694); 

            	    }
            	    break;
            	case 2 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:150:13: arithNegation ^
            	    {
            	    pushFollow(FOLLOW_arithNegation_in_unary699);
            	    arithNegation86=arithNegation();

            	    state._fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(arithNegation86.getTree(), root_0);

            	    }
            	    break;
            	case 3 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:150:30: boolNegation ^
            	    {
            	    pushFollow(FOLLOW_boolNegation_in_unary704);
            	    boolNegation87=boolNegation();

            	    state._fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(boolNegation87.getTree(), root_0);

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            pushFollow(FOLLOW_term_in_unary709);
            term88=term();

            state._fsp--;

            adaptor.addChild(root_0, term88.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unary"


    public static class boolNegation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolNegation"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:153:1: boolNegation : '!' -> BOOL_NEGATION ;
    public final BFlatGrammarParser.boolNegation_return boolNegation() throws RecognitionException {
        BFlatGrammarParser.boolNegation_return retval = new BFlatGrammarParser.boolNegation_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal89=null;

        CommonTree char_literal89_tree=null;
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:154:3: ( '!' -> BOOL_NEGATION )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:154:5: '!'
            {
            char_literal89=(Token)match(input,27,FOLLOW_27_in_boolNegation722);  
            stream_27.add(char_literal89);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 154:9: -> BOOL_NEGATION
            {
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(BOOL_NEGATION, "BOOL_NEGATION")
                );

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolNegation"


    public static class arithNegation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arithNegation"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:157:1: arithNegation : '-' -> ARITH_NEGATION ;
    public final BFlatGrammarParser.arithNegation_return arithNegation() throws RecognitionException {
        BFlatGrammarParser.arithNegation_return retval = new BFlatGrammarParser.arithNegation_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal90=null;

        CommonTree char_literal90_tree=null;
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:158:3: ( '-' -> ARITH_NEGATION )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:158:5: '-'
            {
            char_literal90=(Token)match(input,34,FOLLOW_34_in_arithNegation742);  
            stream_34.add(char_literal90);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 158:9: -> ARITH_NEGATION
            {
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(ARITH_NEGATION, "ARITH_NEGATION")
                );

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arithNegation"


    public static class mult_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mult"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:161:1: mult : unary ( ( '*' | '/' | '%' ) ^ unary )* ;
    public final BFlatGrammarParser.mult_return mult() throws RecognitionException {
        BFlatGrammarParser.mult_return retval = new BFlatGrammarParser.mult_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set92=null;
        BFlatGrammarParser.unary_return unary91 =null;

        BFlatGrammarParser.unary_return unary93 =null;


        CommonTree set92_tree=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:162:3: ( unary ( ( '*' | '/' | '%' ) ^ unary )* )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:162:5: unary ( ( '*' | '/' | '%' ) ^ unary )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_unary_in_mult761);
            unary91=unary();

            state._fsp--;

            adaptor.addChild(root_0, unary91.getTree());

            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:162:11: ( ( '*' | '/' | '%' ) ^ unary )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==29||LA15_0==31||LA15_0==35) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:162:12: ( '*' | '/' | '%' ) ^ unary
            	    {
            	    set92=(Token)input.LT(1);

            	    set92=(Token)input.LT(1);

            	    if ( input.LA(1)==29||input.LA(1)==31||input.LA(1)==35 ) {
            	        input.consume();
            	        root_0 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(set92)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unary_in_mult777);
            	    unary93=unary();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unary93.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "mult"


    public static class add_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "add"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:165:1: add : mult ( ( '+' | '-' ) ^ mult )* ;
    public final BFlatGrammarParser.add_return add() throws RecognitionException {
        BFlatGrammarParser.add_return retval = new BFlatGrammarParser.add_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set95=null;
        BFlatGrammarParser.mult_return mult94 =null;

        BFlatGrammarParser.mult_return mult96 =null;


        CommonTree set95_tree=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:166:3: ( mult ( ( '+' | '-' ) ^ mult )* )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:166:5: mult ( ( '+' | '-' ) ^ mult )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_mult_in_add793);
            mult94=mult();

            state._fsp--;

            adaptor.addChild(root_0, mult94.getTree());

            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:166:10: ( ( '+' | '-' ) ^ mult )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==32||LA16_0==34) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:166:11: ( '+' | '-' ) ^ mult
            	    {
            	    set95=(Token)input.LT(1);

            	    set95=(Token)input.LT(1);

            	    if ( input.LA(1)==32||input.LA(1)==34 ) {
            	        input.consume();
            	        root_0 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(set95)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_mult_in_add805);
            	    mult96=mult();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mult96.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "add"


    public static class relation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relation"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:169:1: relation : add ( ( '<' | '>' | '<=' | '>=' | '==' | '!=' ) ^ add )* ;
    public final BFlatGrammarParser.relation_return relation() throws RecognitionException {
        BFlatGrammarParser.relation_return retval = new BFlatGrammarParser.relation_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set98=null;
        BFlatGrammarParser.add_return add97 =null;

        BFlatGrammarParser.add_return add99 =null;


        CommonTree set98_tree=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:170:3: ( add ( ( '<' | '>' | '<=' | '>=' | '==' | '!=' ) ^ add )* )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:170:5: add ( ( '<' | '>' | '<=' | '>=' | '==' | '!=' ) ^ add )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_add_in_relation821);
            add97=add();

            state._fsp--;

            adaptor.addChild(root_0, add97.getTree());

            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:170:9: ( ( '<' | '>' | '<=' | '>=' | '==' | '!=' ) ^ add )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==28||(LA17_0 >= 36 && LA17_0 <= 37)||(LA17_0 >= 39 && LA17_0 <= 41)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:170:10: ( '<' | '>' | '<=' | '>=' | '==' | '!=' ) ^ add
            	    {
            	    set98=(Token)input.LT(1);

            	    set98=(Token)input.LT(1);

            	    if ( input.LA(1)==28||(input.LA(1) >= 36 && input.LA(1) <= 37)||(input.LA(1) >= 39 && input.LA(1) <= 41) ) {
            	        input.consume();
            	        root_0 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(set98)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_add_in_relation849);
            	    add99=add();

            	    state._fsp--;

            	    adaptor.addChild(root_0, add99.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relation"


    public static class conjunction_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conjunction"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:173:1: conjunction : relation ( '&&' ^ relation )* ;
    public final BFlatGrammarParser.conjunction_return conjunction() throws RecognitionException {
        BFlatGrammarParser.conjunction_return retval = new BFlatGrammarParser.conjunction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal101=null;
        BFlatGrammarParser.relation_return relation100 =null;

        BFlatGrammarParser.relation_return relation102 =null;


        CommonTree string_literal101_tree=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:174:3: ( relation ( '&&' ^ relation )* )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:174:5: relation ( '&&' ^ relation )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_relation_in_conjunction865);
            relation100=relation();

            state._fsp--;

            adaptor.addChild(root_0, relation100.getTree());

            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:174:14: ( '&&' ^ relation )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==30) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:174:15: '&&' ^ relation
            	    {
            	    string_literal101=(Token)match(input,30,FOLLOW_30_in_conjunction868); 
            	    string_literal101_tree = 
            	    (CommonTree)adaptor.create(string_literal101)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal101_tree, root_0);


            	    pushFollow(FOLLOW_relation_in_conjunction871);
            	    relation102=relation();

            	    state._fsp--;

            	    adaptor.addChild(root_0, relation102.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "conjunction"


    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:177:1: expression : ( conjunction ( '||' ^ conjunction )* ) ;
    public final BFlatGrammarParser.expression_return expression() throws RecognitionException {
        BFlatGrammarParser.expression_return retval = new BFlatGrammarParser.expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal104=null;
        BFlatGrammarParser.conjunction_return conjunction103 =null;

        BFlatGrammarParser.conjunction_return conjunction105 =null;


        CommonTree string_literal104_tree=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:178:3: ( ( conjunction ( '||' ^ conjunction )* ) )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:178:5: ( conjunction ( '||' ^ conjunction )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:178:5: ( conjunction ( '||' ^ conjunction )* )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:178:6: conjunction ( '||' ^ conjunction )*
            {
            pushFollow(FOLLOW_conjunction_in_expression887);
            conjunction103=conjunction();

            state._fsp--;

            adaptor.addChild(root_0, conjunction103.getTree());

            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:178:18: ( '||' ^ conjunction )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==50) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:178:19: '||' ^ conjunction
            	    {
            	    string_literal104=(Token)match(input,50,FOLLOW_50_in_expression890); 
            	    string_literal104_tree = 
            	    (CommonTree)adaptor.create(string_literal104)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal104_tree, root_0);


            	    pushFollow(FOLLOW_conjunction_in_expression893);
            	    conjunction105=conjunction();

            	    state._fsp--;

            	    adaptor.addChild(root_0, conjunction105.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression"

    // Delegated rules


 

    public static final BitSet FOLLOW_function_in_program124 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_function144 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_IDENT_in_function146 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAR_in_function148 = new BitSet(new long[]{0x0000940002000000L});
    public static final BitSet FOLLOW_parameter_list_in_function150 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_RPAR_in_function153 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LBRACE_in_function155 = new BitSet(new long[]{0x0002D40000804000L});
    public static final BitSet FOLLOW_block_in_function157 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_RBRACE_in_function159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_parameter_list196 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_parameter_list199 = new BitSet(new long[]{0x0000940000000000L});
    public static final BitSet FOLLOW_parameter_in_parameter_list202 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_paramType_in_parameter214 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_IDENT_in_parameter216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_paramType241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_paramType243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambdaDeclaration_in_block254 = new BitSet(new long[]{0x0002D40000004002L});
    public static final BitSet FOLLOW_declaration_in_block258 = new BitSet(new long[]{0x0002D40000004002L});
    public static final BitSet FOLLOW_statement_in_block262 = new BitSet(new long[]{0x0002500000004002L});
    public static final BitSet FOLLOW_type_in_declaration291 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_IDENT_in_declaration294 = new BitSet(new long[]{0x0000000200001000L});
    public static final BitSet FOLLOW_33_in_declaration297 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_IDENT_in_declaration300 = new BitSet(new long[]{0x0000000200001000L});
    public static final BitSet FOLLOW_EOL_in_declaration304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement325 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_EOL_in_statement327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_statement332 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_EOL_in_statement334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambdaSet_in_statement339 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_EOL_in_statement341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ifStatement356 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAR_in_ifStatement360 = new BitSet(new long[]{0x000000050810C080L});
    public static final BitSet FOLLOW_expression_in_ifStatement363 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_RPAR_in_ifStatement365 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LBRACE_in_ifStatement368 = new BitSet(new long[]{0x0002D40000804000L});
    public static final BitSet FOLLOW_block_in_ifStatement371 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_RBRACE_in_ifStatement374 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ifStatement379 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LBRACE_in_ifStatement382 = new BitSet(new long[]{0x0002D40000804000L});
    public static final BitSet FOLLOW_block_in_ifStatement385 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_RBRACE_in_ifStatement387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_whileStatement405 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAR_in_whileStatement407 = new BitSet(new long[]{0x000000050810C080L});
    public static final BitSet FOLLOW_expression_in_whileStatement409 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_RPAR_in_whileStatement411 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LBRACE_in_whileStatement413 = new BitSet(new long[]{0x0002D40000804000L});
    public static final BitSet FOLLOW_block_in_whileStatement415 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_RBRACE_in_whileStatement417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_assignment443 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_assignment446 = new BitSet(new long[]{0x000000050810C080L});
    public static final BitSet FOLLOW_expression_in_assignment450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_lambdaDeclaration486 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_IDENT_in_lambdaDeclaration488 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_lambdaDeclaration490 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_lambdaDeclaration492 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAR_in_lambdaDeclaration494 = new BitSet(new long[]{0x0000940002000000L});
    public static final BitSet FOLLOW_parameter_list_in_lambdaDeclaration496 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_RPAR_in_lambdaDeclaration499 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LBRACE_in_lambdaDeclaration501 = new BitSet(new long[]{0x0002D40000804000L});
    public static final BitSet FOLLOW_block_in_lambdaDeclaration503 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_RBRACE_in_lambdaDeclaration505 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_EOL_in_lambdaDeclaration507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_lambdaSet540 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_IDENT_in_lambdaSet542 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_lambdaSet544 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_call_in_lambdaSet546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_call577 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAR_in_call579 = new BitSet(new long[]{0x000000050A10C080L});
    public static final BitSet FOLLOW_arglist_in_call581 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_RPAR_in_call584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_arglist608 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_arglist611 = new BitSet(new long[]{0x000000050810C080L});
    public static final BitSet FOLLOW_argument_in_arglist614 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_expression_in_argument631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_term653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_term657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAR_in_term662 = new BitSet(new long[]{0x000000050810C080L});
    public static final BitSet FOLLOW_expression_in_term665 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_RPAR_in_term667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_term673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_term677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_unary694 = new BitSet(new long[]{0x000000050810C080L});
    public static final BitSet FOLLOW_arithNegation_in_unary699 = new BitSet(new long[]{0x000000050810C080L});
    public static final BitSet FOLLOW_boolNegation_in_unary704 = new BitSet(new long[]{0x000000050810C080L});
    public static final BitSet FOLLOW_term_in_unary709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_boolNegation722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_arithNegation742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_mult761 = new BitSet(new long[]{0x00000008A0000002L});
    public static final BitSet FOLLOW_set_in_mult764 = new BitSet(new long[]{0x000000050810C080L});
    public static final BitSet FOLLOW_unary_in_mult777 = new BitSet(new long[]{0x00000008A0000002L});
    public static final BitSet FOLLOW_mult_in_add793 = new BitSet(new long[]{0x0000000500000002L});
    public static final BitSet FOLLOW_set_in_add796 = new BitSet(new long[]{0x000000050810C080L});
    public static final BitSet FOLLOW_mult_in_add805 = new BitSet(new long[]{0x0000000500000002L});
    public static final BitSet FOLLOW_add_in_relation821 = new BitSet(new long[]{0x000003B010000002L});
    public static final BitSet FOLLOW_set_in_relation824 = new BitSet(new long[]{0x000000050810C080L});
    public static final BitSet FOLLOW_add_in_relation849 = new BitSet(new long[]{0x000003B010000002L});
    public static final BitSet FOLLOW_relation_in_conjunction865 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_conjunction868 = new BitSet(new long[]{0x000000050810C080L});
    public static final BitSet FOLLOW_relation_in_conjunction871 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_conjunction_in_expression887 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_expression890 = new BitSet(new long[]{0x000000050810C080L});
    public static final BitSet FOLLOW_conjunction_in_expression893 = new BitSet(new long[]{0x0004000000000002L});

}