// $ANTLR 3.4 /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g 2011-11-18 02:19:42

  package a.b.c;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class BFlatGrammarParser extends Parser {
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
    public String getGrammarFileName() { return "/v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g"; }


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:23:1: program : ( declaration )* ( statement )* EOF !;
    public final BFlatGrammarParser.program_return program() throws RecognitionException {
        BFlatGrammarParser.program_return retval = new BFlatGrammarParser.program_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOF3=null;
        BFlatGrammarParser.declaration_return declaration1 =null;

        BFlatGrammarParser.statement_return statement2 =null;


        CommonTree EOF3_tree=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:24:3: ( ( declaration )* ( statement )* EOF !)
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:24:5: ( declaration )* ( statement )* EOF !
            {
            root_0 = (CommonTree)adaptor.nil();


            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:24:5: ( declaration )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= 32 && LA1_0 <= 33)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:24:5: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_program73);
            	    declaration1=declaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, declaration1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:24:18: ( statement )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IDENT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:24:18: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_program76);
            	    statement2=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement2.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_program79); 

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


    public static class declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaration"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:29:1: declaration : ( 'int' ^| 'boolean' ^) IDENT EOL !;
    public final BFlatGrammarParser.declaration_return declaration() throws RecognitionException {
        BFlatGrammarParser.declaration_return retval = new BFlatGrammarParser.declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal4=null;
        Token string_literal5=null;
        Token IDENT6=null;
        Token EOL7=null;

        CommonTree string_literal4_tree=null;
        CommonTree string_literal5_tree=null;
        CommonTree IDENT6_tree=null;
        CommonTree EOL7_tree=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:30:3: ( ( 'int' ^| 'boolean' ^) IDENT EOL !)
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:30:5: ( 'int' ^| 'boolean' ^) IDENT EOL !
            {
            root_0 = (CommonTree)adaptor.nil();


            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:30:5: ( 'int' ^| 'boolean' ^)
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
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:30:6: 'int' ^
                    {
                    string_literal4=(Token)match(input,33,FOLLOW_33_in_declaration97); 
                    string_literal4_tree = 
                    (CommonTree)adaptor.create(string_literal4)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal4_tree, root_0);


                    }
                    break;
                case 2 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:30:15: 'boolean' ^
                    {
                    string_literal5=(Token)match(input,32,FOLLOW_32_in_declaration102); 
                    string_literal5_tree = 
                    (CommonTree)adaptor.create(string_literal5)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal5_tree, root_0);


                    }
                    break;

            }


            IDENT6=(Token)match(input,IDENT,FOLLOW_IDENT_in_declaration106); 
            IDENT6_tree = 
            (CommonTree)adaptor.create(IDENT6)
            ;
            adaptor.addChild(root_0, IDENT6_tree);


            EOL7=(Token)match(input,EOL,FOLLOW_EOL_in_declaration108); 

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
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:32:1: statement : assignment EOL !;
    public final BFlatGrammarParser.statement_return statement() throws RecognitionException {
        BFlatGrammarParser.statement_return retval = new BFlatGrammarParser.statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOL9=null;
        BFlatGrammarParser.assignment_return assignment8 =null;


        CommonTree EOL9_tree=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:33:3: ( assignment EOL !)
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:33:5: assignment EOL !
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_assignment_in_statement121);
            assignment8=assignment();

            state._fsp--;

            adaptor.addChild(root_0, assignment8.getTree());

            EOL9=(Token)match(input,EOL,FOLLOW_EOL_in_statement123); 

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


    public static class assignment_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:35:1: assignment : IDENT ( '=' ^) expression ;
    public final BFlatGrammarParser.assignment_return assignment() throws RecognitionException {
        BFlatGrammarParser.assignment_return retval = new BFlatGrammarParser.assignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENT10=null;
        Token char_literal11=null;
        BFlatGrammarParser.expression_return expression12 =null;


        CommonTree IDENT10_tree=null;
        CommonTree char_literal11_tree=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:36:3: ( IDENT ( '=' ^) expression )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:36:5: IDENT ( '=' ^) expression
            {
            root_0 = (CommonTree)adaptor.nil();


            IDENT10=(Token)match(input,IDENT,FOLLOW_IDENT_in_assignment134); 
            IDENT10_tree = 
            (CommonTree)adaptor.create(IDENT10)
            ;
            adaptor.addChild(root_0, IDENT10_tree);


            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:36:11: ( '=' ^)
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:36:12: '=' ^
            {
            char_literal11=(Token)match(input,28,FOLLOW_28_in_assignment137); 
            char_literal11_tree = 
            (CommonTree)adaptor.create(char_literal11)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(char_literal11_tree, root_0);


            }


            pushFollow(FOLLOW_expression_in_assignment141);
            expression12=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression12.getTree());

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


    public static class term_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:41:1: term : ( IDENT | ( LPAR ! expression RPAR !) | INTEGER | BOOL );
    public final BFlatGrammarParser.term_return term() throws RecognitionException {
        BFlatGrammarParser.term_return retval = new BFlatGrammarParser.term_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENT13=null;
        Token LPAR14=null;
        Token RPAR16=null;
        Token INTEGER17=null;
        Token BOOL18=null;
        BFlatGrammarParser.expression_return expression15 =null;


        CommonTree IDENT13_tree=null;
        CommonTree LPAR14_tree=null;
        CommonTree RPAR16_tree=null;
        CommonTree INTEGER17_tree=null;
        CommonTree BOOL18_tree=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:42:3: ( IDENT | ( LPAR ! expression RPAR !) | INTEGER | BOOL )
            int alt4=4;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt4=1;
                }
                break;
            case LPAR:
                {
                alt4=2;
                }
                break;
            case INTEGER:
                {
                alt4=3;
                }
                break;
            case BOOL:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:42:5: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    IDENT13=(Token)match(input,IDENT,FOLLOW_IDENT_in_term159); 
                    IDENT13_tree = 
                    (CommonTree)adaptor.create(IDENT13)
                    ;
                    adaptor.addChild(root_0, IDENT13_tree);


                    }
                    break;
                case 2 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:42:13: ( LPAR ! expression RPAR !)
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:42:13: ( LPAR ! expression RPAR !)
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:42:14: LPAR ! expression RPAR !
                    {
                    LPAR14=(Token)match(input,LPAR,FOLLOW_LPAR_in_term164); 

                    pushFollow(FOLLOW_expression_in_term167);
                    expression15=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression15.getTree());

                    RPAR16=(Token)match(input,RPAR,FOLLOW_RPAR_in_term169); 

                    }


                    }
                    break;
                case 3 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:42:40: INTEGER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    INTEGER17=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_term175); 
                    INTEGER17_tree = 
                    (CommonTree)adaptor.create(INTEGER17)
                    ;
                    adaptor.addChild(root_0, INTEGER17_tree);


                    }
                    break;
                case 4 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:42:50: BOOL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    BOOL18=(Token)match(input,BOOL,FOLLOW_BOOL_in_term179); 
                    BOOL18_tree = 
                    (CommonTree)adaptor.create(BOOL18)
                    ;
                    adaptor.addChild(root_0, BOOL18_tree);


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
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:45:1: unary : ( '+' !| negation ^)* term ;
    public final BFlatGrammarParser.unary_return unary() throws RecognitionException {
        BFlatGrammarParser.unary_return retval = new BFlatGrammarParser.unary_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal19=null;
        BFlatGrammarParser.negation_return negation20 =null;

        BFlatGrammarParser.term_return term21 =null;


        CommonTree char_literal19_tree=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:46:3: ( ( '+' !| negation ^)* term )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:46:5: ( '+' !| negation ^)* term
            {
            root_0 = (CommonTree)adaptor.nil();


            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:46:5: ( '+' !| negation ^)*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }
                else if ( (LA5_0==24) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:46:6: '+' !
            	    {
            	    char_literal19=(Token)match(input,23,FOLLOW_23_in_unary195); 

            	    }
            	    break;
            	case 2 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:46:13: negation ^
            	    {
            	    pushFollow(FOLLOW_negation_in_unary200);
            	    negation20=negation();

            	    state._fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(negation20.getTree(), root_0);

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            pushFollow(FOLLOW_term_in_unary205);
            term21=term();

            state._fsp--;

            adaptor.addChild(root_0, term21.getTree());

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


    public static class negation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "negation"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:49:1: negation : '-' -> NEGATION ;
    public final BFlatGrammarParser.negation_return negation() throws RecognitionException {
        BFlatGrammarParser.negation_return retval = new BFlatGrammarParser.negation_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal22=null;

        CommonTree char_literal22_tree=null;
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:50:3: ( '-' -> NEGATION )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:50:5: '-'
            {
            char_literal22=(Token)match(input,24,FOLLOW_24_in_negation219);  
            stream_24.add(char_literal22);


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
            // 50:9: -> NEGATION
            {
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(NEGATION, "NEGATION")
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
    // $ANTLR end "negation"


    public static class mult_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mult"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:53:1: mult : unary ( ( '*' ^| '/' ^| '%' ^) unary )* ;
    public final BFlatGrammarParser.mult_return mult() throws RecognitionException {
        BFlatGrammarParser.mult_return retval = new BFlatGrammarParser.mult_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal24=null;
        Token char_literal25=null;
        Token char_literal26=null;
        BFlatGrammarParser.unary_return unary23 =null;

        BFlatGrammarParser.unary_return unary27 =null;


        CommonTree char_literal24_tree=null;
        CommonTree char_literal25_tree=null;
        CommonTree char_literal26_tree=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:54:3: ( unary ( ( '*' ^| '/' ^| '%' ^) unary )* )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:54:5: unary ( ( '*' ^| '/' ^| '%' ^) unary )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_unary_in_mult237);
            unary23=unary();

            state._fsp--;

            adaptor.addChild(root_0, unary23.getTree());

            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:54:11: ( ( '*' ^| '/' ^| '%' ^) unary )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20||LA7_0==22||LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:54:12: ( '*' ^| '/' ^| '%' ^) unary
            	    {
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:54:12: ( '*' ^| '/' ^| '%' ^)
            	    int alt6=3;
            	    switch ( input.LA(1) ) {
            	    case 22:
            	        {
            	        alt6=1;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt6=2;
            	        }
            	        break;
            	    case 20:
            	        {
            	        alt6=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt6) {
            	        case 1 :
            	            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:54:13: '*' ^
            	            {
            	            char_literal24=(Token)match(input,22,FOLLOW_22_in_mult241); 
            	            char_literal24_tree = 
            	            (CommonTree)adaptor.create(char_literal24)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal24_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:54:20: '/' ^
            	            {
            	            char_literal25=(Token)match(input,25,FOLLOW_25_in_mult246); 
            	            char_literal25_tree = 
            	            (CommonTree)adaptor.create(char_literal25)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal25_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:54:27: '%' ^
            	            {
            	            char_literal26=(Token)match(input,20,FOLLOW_20_in_mult251); 
            	            char_literal26_tree = 
            	            (CommonTree)adaptor.create(char_literal26)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal26_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_unary_in_mult255);
            	    unary27=unary();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unary27.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:57:1: add : mult ( ( '+' | '-' ) ^ mult )* ;
    public final BFlatGrammarParser.add_return add() throws RecognitionException {
        BFlatGrammarParser.add_return retval = new BFlatGrammarParser.add_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set29=null;
        BFlatGrammarParser.mult_return mult28 =null;

        BFlatGrammarParser.mult_return mult30 =null;


        CommonTree set29_tree=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:58:3: ( mult ( ( '+' | '-' ) ^ mult )* )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:58:5: mult ( ( '+' | '-' ) ^ mult )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_mult_in_add271);
            mult28=mult();

            state._fsp--;

            adaptor.addChild(root_0, mult28.getTree());

            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:58:10: ( ( '+' | '-' ) ^ mult )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= 23 && LA8_0 <= 24)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:58:11: ( '+' | '-' ) ^ mult
            	    {
            	    set29=(Token)input.LT(1);

            	    set29=(Token)input.LT(1);

            	    if ( (input.LA(1) >= 23 && input.LA(1) <= 24) ) {
            	        input.consume();
            	        root_0 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(set29)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_mult_in_add283);
            	    mult30=mult();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mult30.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:61:1: relation : add ( ( '<' | '>' | '<=' | '>=' | '==' | '!=' ) ^ add )* ;
    public final BFlatGrammarParser.relation_return relation() throws RecognitionException {
        BFlatGrammarParser.relation_return retval = new BFlatGrammarParser.relation_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set32=null;
        BFlatGrammarParser.add_return add31 =null;

        BFlatGrammarParser.add_return add33 =null;


        CommonTree set32_tree=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:62:3: ( add ( ( '<' | '>' | '<=' | '>=' | '==' | '!=' ) ^ add )* )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:62:5: add ( ( '<' | '>' | '<=' | '>=' | '==' | '!=' ) ^ add )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_add_in_relation299);
            add31=add();

            state._fsp--;

            adaptor.addChild(root_0, add31.getTree());

            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:62:9: ( ( '<' | '>' | '<=' | '>=' | '==' | '!=' ) ^ add )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19||(LA9_0 >= 26 && LA9_0 <= 27)||(LA9_0 >= 29 && LA9_0 <= 31)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:62:10: ( '<' | '>' | '<=' | '>=' | '==' | '!=' ) ^ add
            	    {
            	    set32=(Token)input.LT(1);

            	    set32=(Token)input.LT(1);

            	    if ( input.LA(1)==19||(input.LA(1) >= 26 && input.LA(1) <= 27)||(input.LA(1) >= 29 && input.LA(1) <= 31) ) {
            	        input.consume();
            	        root_0 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(set32)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_add_in_relation327);
            	    add33=add();

            	    state._fsp--;

            	    adaptor.addChild(root_0, add33.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:65:1: conjunction : relation ( '&&' ^ relation )* ;
    public final BFlatGrammarParser.conjunction_return conjunction() throws RecognitionException {
        BFlatGrammarParser.conjunction_return retval = new BFlatGrammarParser.conjunction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal35=null;
        BFlatGrammarParser.relation_return relation34 =null;

        BFlatGrammarParser.relation_return relation36 =null;


        CommonTree string_literal35_tree=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:66:3: ( relation ( '&&' ^ relation )* )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:66:5: relation ( '&&' ^ relation )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_relation_in_conjunction343);
            relation34=relation();

            state._fsp--;

            adaptor.addChild(root_0, relation34.getTree());

            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:66:14: ( '&&' ^ relation )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:66:15: '&&' ^ relation
            	    {
            	    string_literal35=(Token)match(input,21,FOLLOW_21_in_conjunction346); 
            	    string_literal35_tree = 
            	    (CommonTree)adaptor.create(string_literal35)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal35_tree, root_0);


            	    pushFollow(FOLLOW_relation_in_conjunction349);
            	    relation36=relation();

            	    state._fsp--;

            	    adaptor.addChild(root_0, relation36.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:69:1: expression : ( conjunction ( '||' ^ conjunction )* ) ;
    public final BFlatGrammarParser.expression_return expression() throws RecognitionException {
        BFlatGrammarParser.expression_return retval = new BFlatGrammarParser.expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal38=null;
        BFlatGrammarParser.conjunction_return conjunction37 =null;

        BFlatGrammarParser.conjunction_return conjunction39 =null;


        CommonTree string_literal38_tree=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:70:3: ( ( conjunction ( '||' ^ conjunction )* ) )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:70:5: ( conjunction ( '||' ^ conjunction )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:70:5: ( conjunction ( '||' ^ conjunction )* )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:70:6: conjunction ( '||' ^ conjunction )*
            {
            pushFollow(FOLLOW_conjunction_in_expression365);
            conjunction37=conjunction();

            state._fsp--;

            adaptor.addChild(root_0, conjunction37.getTree());

            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:70:18: ( '||' ^ conjunction )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==34) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:70:19: '||' ^ conjunction
            	    {
            	    string_literal38=(Token)match(input,34,FOLLOW_34_in_expression368); 
            	    string_literal38_tree = 
            	    (CommonTree)adaptor.create(string_literal38)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal38_tree, root_0);


            	    pushFollow(FOLLOW_conjunction_in_expression371);
            	    conjunction39=conjunction();

            	    state._fsp--;

            	    adaptor.addChild(root_0, conjunction39.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
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


 

    public static final BitSet FOLLOW_declaration_in_program73 = new BitSet(new long[]{0x0000000300000100L});
    public static final BitSet FOLLOW_statement_in_program76 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EOF_in_program79 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_declaration97 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_32_in_declaration102 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_IDENT_in_declaration106 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EOL_in_declaration108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement121 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EOL_in_statement123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_assignment134 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_assignment137 = new BitSet(new long[]{0x0000000001801310L});
    public static final BitSet FOLLOW_expression_in_assignment141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_term159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAR_in_term164 = new BitSet(new long[]{0x0000000001801310L});
    public static final BitSet FOLLOW_expression_in_term167 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RPAR_in_term169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_term175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_term179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_unary195 = new BitSet(new long[]{0x0000000001801310L});
    public static final BitSet FOLLOW_negation_in_unary200 = new BitSet(new long[]{0x0000000001801310L});
    public static final BitSet FOLLOW_term_in_unary205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_negation219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_mult237 = new BitSet(new long[]{0x0000000002500002L});
    public static final BitSet FOLLOW_22_in_mult241 = new BitSet(new long[]{0x0000000001801310L});
    public static final BitSet FOLLOW_25_in_mult246 = new BitSet(new long[]{0x0000000001801310L});
    public static final BitSet FOLLOW_20_in_mult251 = new BitSet(new long[]{0x0000000001801310L});
    public static final BitSet FOLLOW_unary_in_mult255 = new BitSet(new long[]{0x0000000002500002L});
    public static final BitSet FOLLOW_mult_in_add271 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_set_in_add274 = new BitSet(new long[]{0x0000000001801310L});
    public static final BitSet FOLLOW_mult_in_add283 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_add_in_relation299 = new BitSet(new long[]{0x00000000EC080002L});
    public static final BitSet FOLLOW_set_in_relation302 = new BitSet(new long[]{0x0000000001801310L});
    public static final BitSet FOLLOW_add_in_relation327 = new BitSet(new long[]{0x00000000EC080002L});
    public static final BitSet FOLLOW_relation_in_conjunction343 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_conjunction346 = new BitSet(new long[]{0x0000000001801310L});
    public static final BitSet FOLLOW_relation_in_conjunction349 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_conjunction_in_expression365 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_expression368 = new BitSet(new long[]{0x0000000001801310L});
    public static final BitSet FOLLOW_conjunction_in_expression371 = new BitSet(new long[]{0x0000000400000002L});

}