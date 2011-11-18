// $ANTLR 3.4 /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g 2011-11-18 02:19:43

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BOOL", "COMMENT", "DIGIT", "EOL", "IDENT", "INTEGER", "LBRACE", "LETTER", "LPAR", "MULTILINE_COMMENT", "NEG", "NEGATION", "RBRACE", "RPAR", "WS", "'!='", "'%'", "'&&'", "'*'", "'+'", "'-'", "'/'", "'<'", "'<='", "'='", "'=='", "'>'", "'>='", "'boolean'", "'int'", "'||'"
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
    public static final int BOOL=4;
    public static final int COMMENT=5;
    public static final int DIGIT=6;
    public static final int EOL=7;
    public static final int IDENT=8;
    public static final int INTEGER=9;
    public static final int LBRACE=10;
    public static final int LETTER=11;
    public static final int LPAR=12;
    public static final int MULTILINE_COMMENT=13;
    public static final int NEG=14;
    public static final int NEGATION=15;
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


      GrammarTester.Scope scope = new GrammarTester.Scope();



    // $ANTLR start "evaluator"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:19:1: evaluator returns [int result] : ( declaration )* ( assignment )* ;
    public final int evaluator() throws RecognitionException {
        int result = 0;


        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:20:3: ( ( declaration )* ( assignment )* )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:20:5: ( declaration )* ( assignment )*
            {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:20:5: ( declaration )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= 32 && LA1_0 <= 33)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:20:5: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_evaluator63);
            	    declaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:20:18: ( assignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==28) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:20:18: assignment
            	    {
            	    pushFollow(FOLLOW_assignment_in_evaluator66);
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
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:23:1: declaration : ( ^( 'int' IDENT ) | ^( 'boolean' IDENT ) );
    public final void declaration() throws RecognitionException {
        CommonTree IDENT1=null;
        CommonTree IDENT2=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:24:3: ( ^( 'int' IDENT ) | ^( 'boolean' IDENT ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==33) ) {
                alt3=1;
            }
            else if ( (LA3_0==32) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:24:5: ^( 'int' IDENT )
                    {
                    match(input,33,FOLLOW_33_in_declaration85); 

                    match(input, Token.DOWN, null); 
                    IDENT1=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_declaration87); 

                    match(input, Token.UP, null); 


                     scope.add((IDENT1!=null?IDENT1.getText():null), new Integer(0)); 

                    }
                    break;
                case 2 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:25:5: ^( 'boolean' IDENT )
                    {
                    match(input,32,FOLLOW_32_in_declaration97); 

                    match(input, Token.DOWN, null); 
                    IDENT2=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_declaration99); 

                    match(input, Token.UP, null); 


                     scope.add((IDENT2!=null?IDENT2.getText():null), new Boolean(false)); 

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



    // $ANTLR start "assignment"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:28:1: assignment : ^( '=' IDENT e= expression ) ;
    public final void assignment() throws RecognitionException {
        CommonTree IDENT3=null;
        Object e =null;


        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:29:3: ( ^( '=' IDENT e= expression ) )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:29:5: ^( '=' IDENT e= expression )
            {
            match(input,28,FOLLOW_28_in_assignment119); 

            match(input, Token.DOWN, null); 
            IDENT3=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_assignment121); 

            pushFollow(FOLLOW_expression_in_assignment125);
            e=expression();

            state._fsp--;


            match(input, Token.UP, null); 


             scope.set((IDENT3!=null?IDENT3.getText():null), e); 

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
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:32:1: expression returns [Object result] : ( ^( '+' op1= expression op2= expression ) | ^( '-' op1= expression op2= expression ) | ^( '*' op1= expression op2= expression ) | ^( '/' op1= expression op2= expression ) | ^( '%' op1= expression op2= expression ) | ^( NEGATION op1= expression ) | ^( '||' op1= expression op2= expression ) | ^( '&&' op1= expression op2= expression ) | ^( '==' op1= expression op2= expression ) | ^( '!=' op1= expression op2= expression ) | ^( '>=' op1= expression op2= expression ) | ^( '<=' op1= expression op2= expression ) | ^( '>' op1= expression op2= expression ) | ^( '<' op1= expression op2= expression ) | INTEGER | BOOL | IDENT );
    public final Object expression() throws RecognitionException {
        Object result = null;


        CommonTree INTEGER4=null;
        CommonTree BOOL5=null;
        CommonTree IDENT6=null;
        Object op1 =null;

        Object op2 =null;


        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:33:3: ( ^( '+' op1= expression op2= expression ) | ^( '-' op1= expression op2= expression ) | ^( '*' op1= expression op2= expression ) | ^( '/' op1= expression op2= expression ) | ^( '%' op1= expression op2= expression ) | ^( NEGATION op1= expression ) | ^( '||' op1= expression op2= expression ) | ^( '&&' op1= expression op2= expression ) | ^( '==' op1= expression op2= expression ) | ^( '!=' op1= expression op2= expression ) | ^( '>=' op1= expression op2= expression ) | ^( '<=' op1= expression op2= expression ) | ^( '>' op1= expression op2= expression ) | ^( '<' op1= expression op2= expression ) | INTEGER | BOOL | IDENT )
            int alt4=17;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt4=1;
                }
                break;
            case 24:
                {
                alt4=2;
                }
                break;
            case 22:
                {
                alt4=3;
                }
                break;
            case 25:
                {
                alt4=4;
                }
                break;
            case 20:
                {
                alt4=5;
                }
                break;
            case NEGATION:
                {
                alt4=6;
                }
                break;
            case 34:
                {
                alt4=7;
                }
                break;
            case 21:
                {
                alt4=8;
                }
                break;
            case 29:
                {
                alt4=9;
                }
                break;
            case 19:
                {
                alt4=10;
                }
                break;
            case 31:
                {
                alt4=11;
                }
                break;
            case 27:
                {
                alt4=12;
                }
                break;
            case 30:
                {
                alt4=13;
                }
                break;
            case 26:
                {
                alt4=14;
                }
                break;
            case INTEGER:
                {
                alt4=15;
                }
                break;
            case BOOL:
                {
                alt4=16;
                }
                break;
            case IDENT:
                {
                alt4=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:33:5: ^( '+' op1= expression op2= expression )
                    {
                    match(input,23,FOLLOW_23_in_expression147); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression153);
                    op1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression159);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     result = (Integer)op1 + (Integer)op2; 

                    }
                    break;
                case 2 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:34:5: ^( '-' op1= expression op2= expression )
                    {
                    match(input,24,FOLLOW_24_in_expression169); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression175);
                    op1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression181);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     result = (Integer)op1 - (Integer)op2; 

                    }
                    break;
                case 3 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:35:5: ^( '*' op1= expression op2= expression )
                    {
                    match(input,22,FOLLOW_22_in_expression191); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression197);
                    op1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression203);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     result = (Integer)op1 * (Integer)op2; 

                    }
                    break;
                case 4 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:36:5: ^( '/' op1= expression op2= expression )
                    {
                    match(input,25,FOLLOW_25_in_expression213); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression219);
                    op1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression225);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     result = (Integer)op1 / (Integer)op2; 

                    }
                    break;
                case 5 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:37:5: ^( '%' op1= expression op2= expression )
                    {
                    match(input,20,FOLLOW_20_in_expression235); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression241);
                    op1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression247);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     result = (Integer)op1 % (Integer)op2; 

                    }
                    break;
                case 6 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:38:5: ^( NEGATION op1= expression )
                    {
                    match(input,NEGATION,FOLLOW_NEGATION_in_expression257); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression263);
                    op1=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     result = -(Integer)op1; 

                    }
                    break;
                case 7 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:39:5: ^( '||' op1= expression op2= expression )
                    {
                    match(input,34,FOLLOW_34_in_expression273); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression279);
                    op1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression285);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     result = ((Boolean)op1 || (Boolean)op2); 

                    }
                    break;
                case 8 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:40:5: ^( '&&' op1= expression op2= expression )
                    {
                    match(input,21,FOLLOW_21_in_expression295); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression301);
                    op1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression307);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     result = ((Boolean)op1 && (Boolean)op2); 

                    }
                    break;
                case 9 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:41:5: ^( '==' op1= expression op2= expression )
                    {
                    match(input,29,FOLLOW_29_in_expression317); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression323);
                    op1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression329);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     result = op1.equals(op2); 

                    }
                    break;
                case 10 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:42:5: ^( '!=' op1= expression op2= expression )
                    {
                    match(input,19,FOLLOW_19_in_expression339); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression345);
                    op1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression351);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     result = !op1.equals(op2); 

                    }
                    break;
                case 11 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:43:5: ^( '>=' op1= expression op2= expression )
                    {
                    match(input,31,FOLLOW_31_in_expression361); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression367);
                    op1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression373);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     result = ((Integer)op1 >= (Integer)op2); 

                    }
                    break;
                case 12 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:44:5: ^( '<=' op1= expression op2= expression )
                    {
                    match(input,27,FOLLOW_27_in_expression383); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression389);
                    op1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression395);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     result = ((Integer)op1 <= (Integer)op2); 

                    }
                    break;
                case 13 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:45:5: ^( '>' op1= expression op2= expression )
                    {
                    match(input,30,FOLLOW_30_in_expression405); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression411);
                    op1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression417);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     result = ((Integer)op1 > (Integer)op2); 

                    }
                    break;
                case 14 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:46:5: ^( '<' op1= expression op2= expression )
                    {
                    match(input,26,FOLLOW_26_in_expression427); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression433);
                    op1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression439);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     result = ((Integer)op1 < (Integer)op2); 

                    }
                    break;
                case 15 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:47:5: INTEGER
                    {
                    INTEGER4=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_expression448); 

                     result = Integer.parseInt((INTEGER4!=null?INTEGER4.getText():null)); 

                    }
                    break;
                case 16 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:48:5: BOOL
                    {
                    BOOL5=(CommonTree)match(input,BOOL,FOLLOW_BOOL_in_expression457); 

                     result = Boolean.parseBoolean((BOOL5!=null?BOOL5.getText():null)); 

                    }
                    break;
                case 17 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/EvaluatorWalker.g:49:5: IDENT
                    {
                    IDENT6=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_expression465); 

                     result = scope.get((IDENT6!=null?IDENT6.getText():null)); 

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
        return result;
    }
    // $ANTLR end "expression"

    // Delegated rules


 

    public static final BitSet FOLLOW_declaration_in_evaluator63 = new BitSet(new long[]{0x0000000310000002L});
    public static final BitSet FOLLOW_assignment_in_evaluator66 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_33_in_declaration85 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_declaration87 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_32_in_declaration97 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_declaration99 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_28_in_assignment119 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_assignment121 = new BitSet(new long[]{0x00000004EFF88310L});
    public static final BitSet FOLLOW_expression_in_assignment125 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_23_in_expression147 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression153 = new BitSet(new long[]{0x00000004EFF88310L});
    public static final BitSet FOLLOW_expression_in_expression159 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_24_in_expression169 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression175 = new BitSet(new long[]{0x00000004EFF88310L});
    public static final BitSet FOLLOW_expression_in_expression181 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_22_in_expression191 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression197 = new BitSet(new long[]{0x00000004EFF88310L});
    public static final BitSet FOLLOW_expression_in_expression203 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_25_in_expression213 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression219 = new BitSet(new long[]{0x00000004EFF88310L});
    public static final BitSet FOLLOW_expression_in_expression225 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_20_in_expression235 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression241 = new BitSet(new long[]{0x00000004EFF88310L});
    public static final BitSet FOLLOW_expression_in_expression247 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEGATION_in_expression257 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression263 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_34_in_expression273 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression279 = new BitSet(new long[]{0x00000004EFF88310L});
    public static final BitSet FOLLOW_expression_in_expression285 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_21_in_expression295 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression301 = new BitSet(new long[]{0x00000004EFF88310L});
    public static final BitSet FOLLOW_expression_in_expression307 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_29_in_expression317 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression323 = new BitSet(new long[]{0x00000004EFF88310L});
    public static final BitSet FOLLOW_expression_in_expression329 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_19_in_expression339 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression345 = new BitSet(new long[]{0x00000004EFF88310L});
    public static final BitSet FOLLOW_expression_in_expression351 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_31_in_expression361 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression367 = new BitSet(new long[]{0x00000004EFF88310L});
    public static final BitSet FOLLOW_expression_in_expression373 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_27_in_expression383 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression389 = new BitSet(new long[]{0x00000004EFF88310L});
    public static final BitSet FOLLOW_expression_in_expression395 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_30_in_expression405 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression411 = new BitSet(new long[]{0x00000004EFF88310L});
    public static final BitSet FOLLOW_expression_in_expression417 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_26_in_expression427 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression433 = new BitSet(new long[]{0x00000004EFF88310L});
    public static final BitSet FOLLOW_expression_in_expression439 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTEGER_in_expression448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_expression457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_expression465 = new BitSet(new long[]{0x0000000000000002L});

}