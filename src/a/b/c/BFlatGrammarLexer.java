// $ANTLR 3.4 /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g 2011-11-18 05:28:04

  package a.b.c;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class BFlatGrammarLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public BFlatGrammarLexer() {} 
    public BFlatGrammarLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public BFlatGrammarLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g"; }

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:11:7: ( '!' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:11:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:12:7: ( '!=' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:12:9: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:13:7: ( '%' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:13:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:14:7: ( '&&' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:14:9: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:15:7: ( '*' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:15:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:16:7: ( '+' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:16:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:17:7: ( ',' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:17:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:18:7: ( '-' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:18:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:19:7: ( '/' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:19:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:20:7: ( '<' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:20:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:21:7: ( '<=' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:21:9: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:22:7: ( '=' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:22:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:23:7: ( '==' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:23:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:24:7: ( '>' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:24:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:25:7: ( '>=' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:25:9: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:26:7: ( 'boolean' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:26:9: 'boolean'
            {
            match("boolean"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:27:7: ( 'if' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:27:9: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:28:7: ( 'int' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:28:9: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:29:7: ( '||' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:29:9: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:98:17: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:99:16: ( ( '0' .. '9' ) )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:100:9: ( ( DIGIT )+ )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:100:11: ( DIGIT )+
            {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:100:11: ( DIGIT )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "BOOL"
    public final void mBOOL() throws RecognitionException {
        try {
            int _type = BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:101:6: ( 'true' | 'false' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='t') ) {
                alt2=1;
            }
            else if ( (LA2_0=='f') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:101:8: 'true'
                    {
                    match("true"); 



                    }
                    break;
                case 2 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:101:17: 'false'
                    {
                    match("false"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOL"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:102:7: ( LETTER ( LETTER | DIGIT )* )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:102:9: LETTER ( LETTER | DIGIT )*
            {
            mLETTER(); 


            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:102:15: ( LETTER | DIGIT )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "EOL"
    public final void mEOL() throws RecognitionException {
        try {
            int _type = EOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:110:5: ( ';' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:110:7: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EOL"

    // $ANTLR start "LPAR"
    public final void mLPAR() throws RecognitionException {
        try {
            int _type = LPAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:111:6: ( '(' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:111:8: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAR"

    // $ANTLR start "RPAR"
    public final void mRPAR() throws RecognitionException {
        try {
            int _type = RPAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:112:6: ( ')' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:112:8: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAR"

    // $ANTLR start "LBRACE"
    public final void mLBRACE() throws RecognitionException {
        try {
            int _type = LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:113:8: ( '{' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:113:10: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LBRACE"

    // $ANTLR start "RBRACE"
    public final void mRBRACE() throws RecognitionException {
        try {
            int _type = RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:114:8: ( '}' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:114:10: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RBRACE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:117:4: ( ( ' ' | '\\r' | '\\n' | '\\f' | '\\t' )+ )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:117:6: ( ' ' | '\\r' | '\\n' | '\\f' | '\\t' )+
            {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:117:6: ( ' ' | '\\r' | '\\n' | '\\f' | '\\t' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '\t' && LA4_0 <= '\n')||(LA4_0 >= '\f' && LA4_0 <= '\r')||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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


            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:118:9: ( '//' ( . )* ( '\\r' | '\\n' ) )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:118:11: '//' ( . )* ( '\\r' | '\\n' )
            {
            match("//"); 



            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:118:16: ( . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\n'||LA5_0=='\r') ) {
                    alt5=2;
                }
                else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:118:16: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "MULTILINE_COMMENT"
    public final void mMULTILINE_COMMENT() throws RecognitionException {
        try {
            int _type = MULTILINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:119:18: ( '/*' ( . )* '*/' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:119:20: '/*' ( . )* '*/'
            {
            match("/*"); 



            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:119:25: ( . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1 >= '\u0000' && LA6_1 <= '.')||(LA6_1 >= '0' && LA6_1 <= '\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0 >= '\u0000' && LA6_0 <= ')')||(LA6_0 >= '+' && LA6_0 <= '\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:119:25: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match("*/"); 



            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MULTILINE_COMMENT"

    public void mTokens() throws RecognitionException {
        // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:1:8: ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | INTEGER | BOOL | IDENT | EOL | LPAR | RPAR | LBRACE | RBRACE | WS | COMMENT | MULTILINE_COMMENT )
        int alt7=30;
        switch ( input.LA(1) ) {
        case '!':
            {
            int LA7_1 = input.LA(2);

            if ( (LA7_1=='=') ) {
                alt7=2;
            }
            else {
                alt7=1;
            }
            }
            break;
        case '%':
            {
            alt7=3;
            }
            break;
        case '&':
            {
            alt7=4;
            }
            break;
        case '*':
            {
            alt7=5;
            }
            break;
        case '+':
            {
            alt7=6;
            }
            break;
        case ',':
            {
            alt7=7;
            }
            break;
        case '-':
            {
            alt7=8;
            }
            break;
        case '/':
            {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt7=29;
                }
                break;
            case '*':
                {
                alt7=30;
                }
                break;
            default:
                alt7=9;
            }

            }
            break;
        case '<':
            {
            int LA7_9 = input.LA(2);

            if ( (LA7_9=='=') ) {
                alt7=11;
            }
            else {
                alt7=10;
            }
            }
            break;
        case '=':
            {
            int LA7_10 = input.LA(2);

            if ( (LA7_10=='=') ) {
                alt7=13;
            }
            else {
                alt7=12;
            }
            }
            break;
        case '>':
            {
            int LA7_11 = input.LA(2);

            if ( (LA7_11=='=') ) {
                alt7=15;
            }
            else {
                alt7=14;
            }
            }
            break;
        case 'b':
            {
            int LA7_12 = input.LA(2);

            if ( (LA7_12=='o') ) {
                int LA7_36 = input.LA(3);

                if ( (LA7_36=='o') ) {
                    int LA7_41 = input.LA(4);

                    if ( (LA7_41=='l') ) {
                        int LA7_46 = input.LA(5);

                        if ( (LA7_46=='e') ) {
                            int LA7_50 = input.LA(6);

                            if ( (LA7_50=='a') ) {
                                int LA7_53 = input.LA(7);

                                if ( (LA7_53=='n') ) {
                                    int LA7_54 = input.LA(8);

                                    if ( ((LA7_54 >= '0' && LA7_54 <= '9')||(LA7_54 >= 'A' && LA7_54 <= 'Z')||(LA7_54 >= 'a' && LA7_54 <= 'z')) ) {
                                        alt7=22;
                                    }
                                    else {
                                        alt7=16;
                                    }
                                }
                                else {
                                    alt7=22;
                                }
                            }
                            else {
                                alt7=22;
                            }
                        }
                        else {
                            alt7=22;
                        }
                    }
                    else {
                        alt7=22;
                    }
                }
                else {
                    alt7=22;
                }
            }
            else {
                alt7=22;
            }
            }
            break;
        case 'i':
            {
            switch ( input.LA(2) ) {
            case 'f':
                {
                int LA7_37 = input.LA(3);

                if ( ((LA7_37 >= '0' && LA7_37 <= '9')||(LA7_37 >= 'A' && LA7_37 <= 'Z')||(LA7_37 >= 'a' && LA7_37 <= 'z')) ) {
                    alt7=22;
                }
                else {
                    alt7=17;
                }
                }
                break;
            case 'n':
                {
                int LA7_38 = input.LA(3);

                if ( (LA7_38=='t') ) {
                    int LA7_43 = input.LA(4);

                    if ( ((LA7_43 >= '0' && LA7_43 <= '9')||(LA7_43 >= 'A' && LA7_43 <= 'Z')||(LA7_43 >= 'a' && LA7_43 <= 'z')) ) {
                        alt7=22;
                    }
                    else {
                        alt7=18;
                    }
                }
                else {
                    alt7=22;
                }
                }
                break;
            default:
                alt7=22;
            }

            }
            break;
        case '|':
            {
            alt7=19;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt7=20;
            }
            break;
        case 't':
            {
            int LA7_16 = input.LA(2);

            if ( (LA7_16=='r') ) {
                int LA7_39 = input.LA(3);

                if ( (LA7_39=='u') ) {
                    int LA7_44 = input.LA(4);

                    if ( (LA7_44=='e') ) {
                        int LA7_48 = input.LA(5);

                        if ( ((LA7_48 >= '0' && LA7_48 <= '9')||(LA7_48 >= 'A' && LA7_48 <= 'Z')||(LA7_48 >= 'a' && LA7_48 <= 'z')) ) {
                            alt7=22;
                        }
                        else {
                            alt7=21;
                        }
                    }
                    else {
                        alt7=22;
                    }
                }
                else {
                    alt7=22;
                }
            }
            else {
                alt7=22;
            }
            }
            break;
        case 'f':
            {
            int LA7_17 = input.LA(2);

            if ( (LA7_17=='a') ) {
                int LA7_40 = input.LA(3);

                if ( (LA7_40=='l') ) {
                    int LA7_45 = input.LA(4);

                    if ( (LA7_45=='s') ) {
                        int LA7_49 = input.LA(5);

                        if ( (LA7_49=='e') ) {
                            int LA7_52 = input.LA(6);

                            if ( ((LA7_52 >= '0' && LA7_52 <= '9')||(LA7_52 >= 'A' && LA7_52 <= 'Z')||(LA7_52 >= 'a' && LA7_52 <= 'z')) ) {
                                alt7=22;
                            }
                            else {
                                alt7=21;
                            }
                        }
                        else {
                            alt7=22;
                        }
                    }
                    else {
                        alt7=22;
                    }
                }
                else {
                    alt7=22;
                }
            }
            else {
                alt7=22;
            }
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case 'a':
        case 'c':
        case 'd':
        case 'e':
        case 'g':
        case 'h':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt7=22;
            }
            break;
        case ';':
            {
            alt7=23;
            }
            break;
        case '(':
            {
            alt7=24;
            }
            break;
        case ')':
            {
            alt7=25;
            }
            break;
        case '{':
            {
            alt7=26;
            }
            break;
        case '}':
            {
            alt7=27;
            }
            break;
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
            {
            alt7=28;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 7, 0, input);

            throw nvae;

        }

        switch (alt7) {
            case 1 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:1:10: T__19
                {
                mT__19(); 


                }
                break;
            case 2 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:1:16: T__20
                {
                mT__20(); 


                }
                break;
            case 3 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:1:22: T__21
                {
                mT__21(); 


                }
                break;
            case 4 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:1:28: T__22
                {
                mT__22(); 


                }
                break;
            case 5 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:1:34: T__23
                {
                mT__23(); 


                }
                break;
            case 6 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:1:40: T__24
                {
                mT__24(); 


                }
                break;
            case 7 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:1:46: T__25
                {
                mT__25(); 


                }
                break;
            case 8 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:1:52: T__26
                {
                mT__26(); 


                }
                break;
            case 9 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:1:58: T__27
                {
                mT__27(); 


                }
                break;
            case 10 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:1:64: T__28
                {
                mT__28(); 


                }
                break;
            case 11 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:1:70: T__29
                {
                mT__29(); 


                }
                break;
            case 12 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:1:76: T__30
                {
                mT__30(); 


                }
                break;
            case 13 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:1:82: T__31
                {
                mT__31(); 


                }
                break;
            case 14 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:1:88: T__32
                {
                mT__32(); 


                }
                break;
            case 15 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:1:94: T__33
                {
                mT__33(); 


                }
                break;
            case 16 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:1:100: T__34
                {
                mT__34(); 


                }
                break;
            case 17 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:1:106: T__35
                {
                mT__35(); 


                }
                break;
            case 18 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:1:112: T__36
                {
                mT__36(); 


                }
                break;
            case 19 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:1:118: T__37
                {
                mT__37(); 


                }
                break;
            case 20 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:1:124: INTEGER
                {
                mINTEGER(); 


                }
                break;
            case 21 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:1:132: BOOL
                {
                mBOOL(); 


                }
                break;
            case 22 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:1:137: IDENT
                {
                mIDENT(); 


                }
                break;
            case 23 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:1:143: EOL
                {
                mEOL(); 


                }
                break;
            case 24 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:1:147: LPAR
                {
                mLPAR(); 


                }
                break;
            case 25 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:1:152: RPAR
                {
                mRPAR(); 


                }
                break;
            case 26 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:1:157: LBRACE
                {
                mLBRACE(); 


                }
                break;
            case 27 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:1:164: RBRACE
                {
                mRBRACE(); 


                }
                break;
            case 28 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:1:171: WS
                {
                mWS(); 


                }
                break;
            case 29 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:1:174: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 30 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:1:182: MULTILINE_COMMENT
                {
                mMULTILINE_COMMENT(); 


                }
                break;

        }

    }


 

}