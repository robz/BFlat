// $ANTLR 3.4 /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g 2011-11-25 11:07:17

  package a.b.c;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class BFlatGrammarLexer extends Lexer {
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
    public String getGrammarFileName() { return "/v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g"; }

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:11:7: ( '!' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:11:9: '!'
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
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:12:7: ( '!=' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:12:9: '!='
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
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:13:7: ( '%' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:13:9: '%'
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
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:14:7: ( '&&' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:14:9: '&&'
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
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:15:7: ( '*' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:15:9: '*'
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
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:16:7: ( '+' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:16:9: '+'
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
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:17:7: ( ',' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:17:9: ','
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
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:18:7: ( '-' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:18:9: '-'
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
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:19:7: ( '/' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:19:9: '/'
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
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:20:7: ( '<' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:20:9: '<'
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
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:21:7: ( '<=' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:21:9: '<='
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
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:22:7: ( '=' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:22:9: '='
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
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:23:7: ( '==' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:23:9: '=='
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
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:24:7: ( '>' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:24:9: '>'
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
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:25:7: ( '>=' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:25:9: '>='
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
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:26:7: ( 'boolean' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:26:9: 'boolean'
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
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:27:7: ( 'else' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:27:9: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:28:7: ( 'funct' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:28:9: 'funct'
            {
            match("funct"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:29:7: ( 'function' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:29:9: 'function'
            {
            match("function"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:30:7: ( 'if' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:30:9: 'if'
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
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:31:7: ( 'int' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:31:9: 'int'
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
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:32:7: ( 'lambda' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:32:9: 'lambda'
            {
            match("lambda"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:33:7: ( 'while' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:33:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:34:7: ( '||' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:34:9: '||'
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
    // $ANTLR end "T__50"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:183:17: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:
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
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:184:16: ( ( '0' .. '9' ) )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:
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
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:185:9: ( ( DIGIT )+ )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:185:11: ( DIGIT )+
            {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:185:11: ( DIGIT )+
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
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:
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
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:186:6: ( 'true' | 'false' )
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
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:186:8: 'true'
                    {
                    match("true"); 



                    }
                    break;
                case 2 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:186:17: 'false'
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
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:187:7: ( ( LETTER ) ( LETTER | DIGIT )* )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:187:9: ( LETTER ) ( LETTER | DIGIT )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:187:18: ( LETTER | DIGIT )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:
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
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:195:5: ( ';' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:195:7: ';'
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
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:196:6: ( '(' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:196:8: '('
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
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:197:6: ( ')' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:197:8: ')'
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
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:198:8: ( '{' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:198:10: '{'
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
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:199:8: ( '}' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:199:10: '}'
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
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:202:4: ( ( ' ' | '\\r' | '\\n' | '\\f' | '\\t' )+ )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:202:6: ( ' ' | '\\r' | '\\n' | '\\f' | '\\t' )+
            {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:202:6: ( ' ' | '\\r' | '\\n' | '\\f' | '\\t' )+
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
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:
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
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:203:9: ( '//' ( . )* ( '\\r' | '\\n' ) )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:203:11: '//' ( . )* ( '\\r' | '\\n' )
            {
            match("//"); 



            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:203:16: ( . )*
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
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:203:16: .
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
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:204:18: ( '/*' ( . )* '*/' )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:204:20: '/*' ( . )* '*/'
            {
            match("/*"); 



            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:204:25: ( . )*
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
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:204:25: .
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
        // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:1:8: ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | INTEGER | BOOL | IDENT | EOL | LPAR | RPAR | LBRACE | RBRACE | WS | COMMENT | MULTILINE_COMMENT )
        int alt7=35;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:1:10: T__27
                {
                mT__27(); 


                }
                break;
            case 2 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:1:16: T__28
                {
                mT__28(); 


                }
                break;
            case 3 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:1:22: T__29
                {
                mT__29(); 


                }
                break;
            case 4 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:1:28: T__30
                {
                mT__30(); 


                }
                break;
            case 5 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:1:34: T__31
                {
                mT__31(); 


                }
                break;
            case 6 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:1:40: T__32
                {
                mT__32(); 


                }
                break;
            case 7 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:1:46: T__33
                {
                mT__33(); 


                }
                break;
            case 8 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:1:52: T__34
                {
                mT__34(); 


                }
                break;
            case 9 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:1:58: T__35
                {
                mT__35(); 


                }
                break;
            case 10 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:1:64: T__36
                {
                mT__36(); 


                }
                break;
            case 11 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:1:70: T__37
                {
                mT__37(); 


                }
                break;
            case 12 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:1:76: T__38
                {
                mT__38(); 


                }
                break;
            case 13 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:1:82: T__39
                {
                mT__39(); 


                }
                break;
            case 14 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:1:88: T__40
                {
                mT__40(); 


                }
                break;
            case 15 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:1:94: T__41
                {
                mT__41(); 


                }
                break;
            case 16 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:1:100: T__42
                {
                mT__42(); 


                }
                break;
            case 17 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:1:106: T__43
                {
                mT__43(); 


                }
                break;
            case 18 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:1:112: T__44
                {
                mT__44(); 


                }
                break;
            case 19 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:1:118: T__45
                {
                mT__45(); 


                }
                break;
            case 20 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:1:124: T__46
                {
                mT__46(); 


                }
                break;
            case 21 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:1:130: T__47
                {
                mT__47(); 


                }
                break;
            case 22 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:1:136: T__48
                {
                mT__48(); 


                }
                break;
            case 23 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:1:142: T__49
                {
                mT__49(); 


                }
                break;
            case 24 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:1:148: T__50
                {
                mT__50(); 


                }
                break;
            case 25 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:1:154: INTEGER
                {
                mINTEGER(); 


                }
                break;
            case 26 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:1:162: BOOL
                {
                mBOOL(); 


                }
                break;
            case 27 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:1:167: IDENT
                {
                mIDENT(); 


                }
                break;
            case 28 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:1:173: EOL
                {
                mEOL(); 


                }
                break;
            case 29 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:1:177: LPAR
                {
                mLPAR(); 


                }
                break;
            case 30 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:1:182: RPAR
                {
                mRPAR(); 


                }
                break;
            case 31 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:1:187: LBRACE
                {
                mLBRACE(); 


                }
                break;
            case 32 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:1:194: RBRACE
                {
                mRBRACE(); 


                }
                break;
            case 33 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:1:201: WS
                {
                mWS(); 


                }
                break;
            case 34 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:1:204: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 35 :
                // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace3/BFlat/src/a/b/c/BFlatGrammar.g:1:212: MULTILINE_COMMENT
                {
                mMULTILINE_COMMENT(); 


                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\1\uffff\1\35\6\uffff\1\40\1\42\1\44\1\46\6\25\2\uffff\1\25\22\uffff"+
        "\4\25\1\64\10\25\1\uffff\1\75\4\25\1\102\2\25\1\uffff\2\25\1\107"+
        "\1\25\1\uffff\1\112\1\107\1\25\1\114\1\uffff\2\25\1\uffff\1\117"+
        "\1\uffff\1\120\1\25\2\uffff\1\122\1\uffff";
    static final String DFA7_eofS =
        "\123\uffff";
    static final String DFA7_minS =
        "\1\11\1\75\6\uffff\1\52\3\75\1\157\1\154\1\141\1\146\1\141\1\150"+
        "\2\uffff\1\162\22\uffff\1\157\1\163\1\156\1\154\1\60\1\164\1\155"+
        "\1\151\1\165\1\154\1\145\1\143\1\163\1\uffff\1\60\1\142\1\154\2"+
        "\145\1\60\1\164\1\145\1\uffff\1\144\1\145\1\60\1\141\1\uffff\2\60"+
        "\1\141\1\60\1\uffff\1\156\1\157\1\uffff\1\60\1\uffff\1\60\1\156"+
        "\2\uffff\1\60\1\uffff";
    static final String DFA7_maxS =
        "\1\175\1\75\6\uffff\1\57\3\75\1\157\1\154\1\165\1\156\1\141\1\150"+
        "\2\uffff\1\162\22\uffff\1\157\1\163\1\156\1\154\1\172\1\164\1\155"+
        "\1\151\1\165\1\154\1\145\1\143\1\163\1\uffff\1\172\1\142\1\154\2"+
        "\145\1\172\1\164\1\145\1\uffff\1\144\1\145\1\172\1\141\1\uffff\2"+
        "\172\1\141\1\172\1\uffff\1\156\1\157\1\uffff\1\172\1\uffff\1\172"+
        "\1\156\2\uffff\1\172\1\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\12\uffff\1\30\1\31\1\uffff\1\33"+
        "\1\34\1\35\1\36\1\37\1\40\1\41\1\2\1\1\1\42\1\43\1\11\1\13\1\12"+
        "\1\15\1\14\1\17\1\16\15\uffff\1\24\10\uffff\1\25\4\uffff\1\21\4"+
        "\uffff\1\32\2\uffff\1\22\1\uffff\1\27\2\uffff\1\26\1\20\1\uffff"+
        "\1\23";
    static final String DFA7_specialS =
        "\123\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\33\1\uffff\2\33\22\uffff\1\33\1\1\3\uffff\1\2\1\3\1\uffff"+
            "\1\27\1\30\1\4\1\5\1\6\1\7\1\uffff\1\10\12\23\1\uffff\1\26\1"+
            "\11\1\12\1\13\2\uffff\32\25\6\uffff\1\25\1\14\2\25\1\15\1\16"+
            "\2\25\1\17\2\25\1\20\7\25\1\24\2\25\1\21\3\25\1\31\1\22\1\32",
            "\1\34",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\37\4\uffff\1\36",
            "\1\41",
            "\1\43",
            "\1\45",
            "\1\47",
            "\1\50",
            "\1\52\23\uffff\1\51",
            "\1\53\7\uffff\1\54",
            "\1\55",
            "\1\56",
            "",
            "",
            "\1\57",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "\1\103",
            "\1\104",
            "",
            "\1\105",
            "\1\106",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "\1\110",
            "",
            "\12\25\7\uffff\32\25\6\uffff\10\25\1\111\21\25",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "\1\113",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "",
            "\1\115",
            "\1\116",
            "",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "\1\121",
            "",
            "",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | INTEGER | BOOL | IDENT | EOL | LPAR | RPAR | LBRACE | RBRACE | WS | COMMENT | MULTILINE_COMMENT );";
        }
    }
 

}