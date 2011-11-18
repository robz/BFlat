// $ANTLR 3.4 /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g 2011-11-18 05:28:05

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARITH_NEGATION", "BOOL", "BOOL_NEGATION", "COMMENT", "DIGIT", "EOL", "IDENT", "INTEGER", "LBRACE", "LETTER", "LPAR", "MULTILINE_COMMENT", "RBRACE", "RPAR", "WS", "'!'", "'!='", "'%'", "'&&'", "'*'", "'+'", "','", "'-'", "'/'", "'<'", "'<='", "'='", "'=='", "'>'", "'>='", "'boolean'", "'if'", "'int'", "'||'"
    };

    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
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
    public static final int ARITH_NEGATION=4;
    public static final int BOOL=5;
    public static final int BOOL_NEGATION=6;
    public static final int COMMENT=7;
    public static final int DIGIT=8;
    public static final int EOL=9;
    public static final int IDENT=10;
    public static final int INTEGER=11;
    public static final int LBRACE=12;
    public static final int LETTER=13;
    public static final int LPAR=14;
    public static final int MULTILINE_COMMENT=15;
    public static final int RBRACE=16;
    public static final int RPAR=17;
    public static final int WS=18;

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
    public String getGrammarFileName() { return "/v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g"; }



    // $ANTLR start "evaluator"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:15:1: evaluator returns [int result] : ( declaration )* ( ifStatement | assignment )* ;
    public final int evaluator() throws RecognitionException {
        int result = 0;


        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:16:3: ( ( declaration )* ( ifStatement | assignment )* )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:16:5: ( declaration )* ( ifStatement | assignment )*
            {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:16:5: ( declaration )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==34||LA1_0==36) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:16:5: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_evaluator57);
            	    declaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:16:18: ( ifStatement | assignment )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==35) ) {
                    alt2=1;
                }
                else if ( (LA2_0==30) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:16:19: ifStatement
            	    {
            	    pushFollow(FOLLOW_ifStatement_in_evaluator61);
            	    ifStatement();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:16:33: assignment
            	    {
            	    pushFollow(FOLLOW_assignment_in_evaluator65);
            	    assignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            result = 1;

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
    // $ANTLR end "evaluator"



    // $ANTLR start "declaration"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:19:1: declaration : ( ^( 'int' ( IDENT )+ ) | ^( 'boolean' ( IDENT )+ ) );
    public final void declaration() throws RecognitionException {
        CommonTree IDENT1=null;
        CommonTree IDENT2=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:20:3: ( ^( 'int' ( IDENT )+ ) | ^( 'boolean' ( IDENT )+ ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==36) ) {
                alt5=1;
            }
            else if ( (LA5_0==34) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:20:5: ^( 'int' ( IDENT )+ )
                    {
                    match(input,36,FOLLOW_36_in_declaration85); 

                    match(input, Token.DOWN, null); 
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:20:13: ( IDENT )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==IDENT) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:20:14: IDENT
                    	    {
                    	    IDENT1=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_declaration88); 

                    	     GrammarTester.scope.add((IDENT1!=null?IDENT1.getText():null), new Integer(0)); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    match(input, Token.UP, null); 


                    }
                    break;
                case 2 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:21:5: ^( 'boolean' ( IDENT )+ )
                    {
                    match(input,34,FOLLOW_34_in_declaration100); 

                    match(input, Token.DOWN, null); 
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:21:16: ( IDENT )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==IDENT) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:21:17: IDENT
                    	    {
                    	    IDENT2=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_declaration102); 

                    	     GrammarTester.scope.add((IDENT2!=null?IDENT2.getText():null), new Boolean(false)); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
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


    public static class ifStatement_return extends TreeRuleReturnScope {
    };


    // $ANTLR start "ifStatement"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:24:1: ifStatement : ^( 'if' e= expression . ) ;
    public final EvaluatorWalker.ifStatement_return ifStatement() throws RecognitionException {
        EvaluatorWalker.ifStatement_return retval = new EvaluatorWalker.ifStatement_return();
        retval.start = input.LT(1);


        Object e =null;


        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:25:3: ( ^( 'if' e= expression . ) )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:25:5: ^( 'if' e= expression . )
            {
            match(input,35,FOLLOW_35_in_ifStatement125); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_ifStatement129);
            e=expression();

            state._fsp--;


            matchAny(input); 

            match(input, Token.UP, null); 



                  if ((Boolean)e) {
                    CommonTree blockRoot = (CommonTree)(((CommonTree)retval.start).getChild(2));
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
        return retval;
    }
    // $ANTLR end "ifStatement"



    // $ANTLR start "assignment"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:33:1: assignment : ^( '=' IDENT e= expression ) ;
    public final void assignment() throws RecognitionException {
        CommonTree IDENT3=null;
        Object e =null;


        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:34:3: ( ^( '=' IDENT e= expression ) )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:34:5: ^( '=' IDENT e= expression )
            {
            match(input,30,FOLLOW_30_in_assignment150); 

            match(input, Token.DOWN, null); 
            IDENT3=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_assignment152); 

            pushFollow(FOLLOW_expression_in_assignment156);
            e=expression();

            state._fsp--;


            match(input, Token.UP, null); 


             GrammarTester.scope.set((IDENT3!=null?IDENT3.getText():null), e); 

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
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:37:1: expression returns [Object result] : ( ^( '+' op1= expression op2= expression ) | ^( '-' op1= expression op2= expression ) | ^( '*' op1= expression op2= expression ) | ^( '/' op1= expression op2= expression ) | ^( '%' op1= expression op2= expression ) | ^( ARITH_NEGATION op1= expression ) | ^( '||' op1= expression op2= expression ) | ^( '&&' op1= expression op2= expression ) | ^( '==' op1= expression op2= expression ) | ^( '!=' op1= expression op2= expression ) | ^( '>=' op1= expression op2= expression ) | ^( '<=' op1= expression op2= expression ) | ^( '>' op1= expression op2= expression ) | ^( '<' op1= expression op2= expression ) | ^( BOOL_NEGATION op1= expression ) | INTEGER | BOOL | IDENT ) ;
    public final Object expression() throws RecognitionException {
        Object result = null;


        CommonTree INTEGER4=null;
        CommonTree BOOL5=null;
        CommonTree IDENT6=null;
        Object op1 =null;

        Object op2 =null;


        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:38:3: ( ( ^( '+' op1= expression op2= expression ) | ^( '-' op1= expression op2= expression ) | ^( '*' op1= expression op2= expression ) | ^( '/' op1= expression op2= expression ) | ^( '%' op1= expression op2= expression ) | ^( ARITH_NEGATION op1= expression ) | ^( '||' op1= expression op2= expression ) | ^( '&&' op1= expression op2= expression ) | ^( '==' op1= expression op2= expression ) | ^( '!=' op1= expression op2= expression ) | ^( '>=' op1= expression op2= expression ) | ^( '<=' op1= expression op2= expression ) | ^( '>' op1= expression op2= expression ) | ^( '<' op1= expression op2= expression ) | ^( BOOL_NEGATION op1= expression ) | INTEGER | BOOL | IDENT ) )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:39:3: ( ^( '+' op1= expression op2= expression ) | ^( '-' op1= expression op2= expression ) | ^( '*' op1= expression op2= expression ) | ^( '/' op1= expression op2= expression ) | ^( '%' op1= expression op2= expression ) | ^( ARITH_NEGATION op1= expression ) | ^( '||' op1= expression op2= expression ) | ^( '&&' op1= expression op2= expression ) | ^( '==' op1= expression op2= expression ) | ^( '!=' op1= expression op2= expression ) | ^( '>=' op1= expression op2= expression ) | ^( '<=' op1= expression op2= expression ) | ^( '>' op1= expression op2= expression ) | ^( '<' op1= expression op2= expression ) | ^( BOOL_NEGATION op1= expression ) | INTEGER | BOOL | IDENT )
            {
            OperationExecuter oe = null;

            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:40:3: ( ^( '+' op1= expression op2= expression ) | ^( '-' op1= expression op2= expression ) | ^( '*' op1= expression op2= expression ) | ^( '/' op1= expression op2= expression ) | ^( '%' op1= expression op2= expression ) | ^( ARITH_NEGATION op1= expression ) | ^( '||' op1= expression op2= expression ) | ^( '&&' op1= expression op2= expression ) | ^( '==' op1= expression op2= expression ) | ^( '!=' op1= expression op2= expression ) | ^( '>=' op1= expression op2= expression ) | ^( '<=' op1= expression op2= expression ) | ^( '>' op1= expression op2= expression ) | ^( '<' op1= expression op2= expression ) | ^( BOOL_NEGATION op1= expression ) | INTEGER | BOOL | IDENT )
            int alt6=18;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt6=1;
                }
                break;
            case 26:
                {
                alt6=2;
                }
                break;
            case 23:
                {
                alt6=3;
                }
                break;
            case 27:
                {
                alt6=4;
                }
                break;
            case 21:
                {
                alt6=5;
                }
                break;
            case ARITH_NEGATION:
                {
                alt6=6;
                }
                break;
            case 37:
                {
                alt6=7;
                }
                break;
            case 22:
                {
                alt6=8;
                }
                break;
            case 31:
                {
                alt6=9;
                }
                break;
            case 20:
                {
                alt6=10;
                }
                break;
            case 33:
                {
                alt6=11;
                }
                break;
            case 29:
                {
                alt6=12;
                }
                break;
            case 32:
                {
                alt6=13;
                }
                break;
            case 28:
                {
                alt6=14;
                }
                break;
            case BOOL_NEGATION:
                {
                alt6=15;
                }
                break;
            case INTEGER:
                {
                alt6=16;
                }
                break;
            case BOOL:
                {
                alt6=17;
                }
                break;
            case IDENT:
                {
                alt6=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:41:3: ^( '+' op1= expression op2= expression )
                    {
                    match(input,24,FOLLOW_24_in_expression189); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression195);
                    op1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression201);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     oe = new OperationExecuter(op1,op2,"+"); 

                    }
                    break;
                case 2 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:42:5: ^( '-' op1= expression op2= expression )
                    {
                    match(input,26,FOLLOW_26_in_expression214); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression220);
                    op1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression226);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     oe = new OperationExecuter(op1,op2,"-"); 

                    }
                    break;
                case 3 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:43:5: ^( '*' op1= expression op2= expression )
                    {
                    match(input,23,FOLLOW_23_in_expression237); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression243);
                    op1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression249);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     oe = new OperationExecuter(op1,op2,"*"); 

                    }
                    break;
                case 4 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:44:5: ^( '/' op1= expression op2= expression )
                    {
                    match(input,27,FOLLOW_27_in_expression260); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression266);
                    op1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression272);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     oe = new OperationExecuter(op1,op2,"/"); 

                    }
                    break;
                case 5 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:45:5: ^( '%' op1= expression op2= expression )
                    {
                    match(input,21,FOLLOW_21_in_expression283); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression289);
                    op1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression295);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     oe = new OperationExecuter(op1,op2,"%"); 

                    }
                    break;
                case 6 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:46:5: ^( ARITH_NEGATION op1= expression )
                    {
                    match(input,ARITH_NEGATION,FOLLOW_ARITH_NEGATION_in_expression306); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression312);
                    op1=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     oe = new OperationExecuter(op1,null,"ARITH_NEGATION"); 

                    }
                    break;
                case 7 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:47:5: ^( '||' op1= expression op2= expression )
                    {
                    match(input,37,FOLLOW_37_in_expression329); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression335);
                    op1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression341);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     oe = new OperationExecuter(op1,op2,"||"); 

                    }
                    break;
                case 8 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:48:5: ^( '&&' op1= expression op2= expression )
                    {
                    match(input,22,FOLLOW_22_in_expression351); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression357);
                    op1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression363);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     oe = new OperationExecuter(op1,op2,"&&"); 

                    }
                    break;
                case 9 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:49:5: ^( '==' op1= expression op2= expression )
                    {
                    match(input,31,FOLLOW_31_in_expression373); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression379);
                    op1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression385);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     oe = new OperationExecuter(op1,op2,"=="); 

                    }
                    break;
                case 10 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:50:5: ^( '!=' op1= expression op2= expression )
                    {
                    match(input,20,FOLLOW_20_in_expression395); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression401);
                    op1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression407);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     oe = new OperationExecuter(op1,op2,"!="); 

                    }
                    break;
                case 11 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:51:5: ^( '>=' op1= expression op2= expression )
                    {
                    match(input,33,FOLLOW_33_in_expression417); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression423);
                    op1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression429);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     oe = new OperationExecuter(op1,op2,">="); 

                    }
                    break;
                case 12 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:52:5: ^( '<=' op1= expression op2= expression )
                    {
                    match(input,29,FOLLOW_29_in_expression439); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression445);
                    op1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression451);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     oe = new OperationExecuter(op1,op2,"<="); 

                    }
                    break;
                case 13 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:53:5: ^( '>' op1= expression op2= expression )
                    {
                    match(input,32,FOLLOW_32_in_expression461); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression467);
                    op1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression473);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     oe = new OperationExecuter(op1,op2,">"); 

                    }
                    break;
                case 14 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:54:5: ^( '<' op1= expression op2= expression )
                    {
                    match(input,28,FOLLOW_28_in_expression484); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression490);
                    op1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression496);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     oe = new OperationExecuter(op1,op2,"<"); 

                    }
                    break;
                case 15 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:55:5: ^( BOOL_NEGATION op1= expression )
                    {
                    match(input,BOOL_NEGATION,FOLLOW_BOOL_NEGATION_in_expression507); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression513);
                    op1=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     oe = new OperationExecuter(op1,null,"BOOL_NEGATION"); 

                    }
                    break;
                case 16 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:56:5: INTEGER
                    {
                    INTEGER4=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_expression530); 

                     oe = new OperationExecuter((INTEGER4!=null?INTEGER4.getText():null),"INTEGER"); 

                    }
                    break;
                case 17 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:57:5: BOOL
                    {
                    BOOL5=(CommonTree)match(input,BOOL,FOLLOW_BOOL_in_expression573); 

                     oe = new OperationExecuter((BOOL5!=null?BOOL5.getText():null),"BOOL"); 

                    }
                    break;
                case 18 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:58:5: IDENT
                    {
                    IDENT6=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_expression618); 

                     oe = new OperationExecuter((IDENT6!=null?IDENT6.getText():null),"IDENT"); 

                    }
                    break;

            }


            result = oe.doOperation();

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


 

    public static final BitSet FOLLOW_declaration_in_evaluator57 = new BitSet(new long[]{0x0000001C40000002L});
    public static final BitSet FOLLOW_ifStatement_in_evaluator61 = new BitSet(new long[]{0x0000000840000002L});
    public static final BitSet FOLLOW_assignment_in_evaluator65 = new BitSet(new long[]{0x0000000840000002L});
    public static final BitSet FOLLOW_36_in_declaration85 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_declaration88 = new BitSet(new long[]{0x0000000000000408L});
    public static final BitSet FOLLOW_34_in_declaration100 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_declaration102 = new BitSet(new long[]{0x0000000000000408L});
    public static final BitSet FOLLOW_35_in_ifStatement125 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_ifStatement129 = new BitSet(new long[]{0x0000003FFFFFFFF0L});
    public static final BitSet FOLLOW_30_in_assignment150 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_assignment152 = new BitSet(new long[]{0x00000023BDF00C70L});
    public static final BitSet FOLLOW_expression_in_assignment156 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_24_in_expression189 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression195 = new BitSet(new long[]{0x00000023BDF00C70L});
    public static final BitSet FOLLOW_expression_in_expression201 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_26_in_expression214 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression220 = new BitSet(new long[]{0x00000023BDF00C70L});
    public static final BitSet FOLLOW_expression_in_expression226 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_23_in_expression237 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression243 = new BitSet(new long[]{0x00000023BDF00C70L});
    public static final BitSet FOLLOW_expression_in_expression249 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_27_in_expression260 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression266 = new BitSet(new long[]{0x00000023BDF00C70L});
    public static final BitSet FOLLOW_expression_in_expression272 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_21_in_expression283 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression289 = new BitSet(new long[]{0x00000023BDF00C70L});
    public static final BitSet FOLLOW_expression_in_expression295 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARITH_NEGATION_in_expression306 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression312 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_37_in_expression329 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression335 = new BitSet(new long[]{0x00000023BDF00C70L});
    public static final BitSet FOLLOW_expression_in_expression341 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_22_in_expression351 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression357 = new BitSet(new long[]{0x00000023BDF00C70L});
    public static final BitSet FOLLOW_expression_in_expression363 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_31_in_expression373 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression379 = new BitSet(new long[]{0x00000023BDF00C70L});
    public static final BitSet FOLLOW_expression_in_expression385 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_20_in_expression395 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression401 = new BitSet(new long[]{0x00000023BDF00C70L});
    public static final BitSet FOLLOW_expression_in_expression407 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_33_in_expression417 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression423 = new BitSet(new long[]{0x00000023BDF00C70L});
    public static final BitSet FOLLOW_expression_in_expression429 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_29_in_expression439 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression445 = new BitSet(new long[]{0x00000023BDF00C70L});
    public static final BitSet FOLLOW_expression_in_expression451 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_32_in_expression461 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression467 = new BitSet(new long[]{0x00000023BDF00C70L});
    public static final BitSet FOLLOW_expression_in_expression473 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_28_in_expression484 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression490 = new BitSet(new long[]{0x00000023BDF00C70L});
    public static final BitSet FOLLOW_expression_in_expression496 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOOL_NEGATION_in_expression507 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression513 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTEGER_in_expression530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_expression573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_expression618 = new BitSet(new long[]{0x0000000000000002L});

}