// $ANTLR 3.4 /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g 2011-11-18 05:28:03

  package a.b.c;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class BFlatGrammarParser extends Parser {
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
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:24:1: program : ( declaration )* ( statement )* ;
    public final BFlatGrammarParser.program_return program() throws RecognitionException {
        BFlatGrammarParser.program_return retval = new BFlatGrammarParser.program_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        BFlatGrammarParser.declaration_return declaration1 =null;

        BFlatGrammarParser.statement_return statement2 =null;



        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:25:3: ( ( declaration )* ( statement )* )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:25:5: ( declaration )* ( statement )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:25:5: ( declaration )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==34||LA1_0==36) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:25:5: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_program78);
            	    declaration1=declaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, declaration1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:25:18: ( statement )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IDENT||LA2_0==35) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:25:18: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_program81);
            	    statement2=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement2.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "program"


    public static class declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaration"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:44:1: declaration : ( 'int' ^| 'boolean' ^) IDENT ( ',' ! IDENT )* EOL !;
    public final BFlatGrammarParser.declaration_return declaration() throws RecognitionException {
        BFlatGrammarParser.declaration_return retval = new BFlatGrammarParser.declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal3=null;
        Token string_literal4=null;
        Token IDENT5=null;
        Token char_literal6=null;
        Token IDENT7=null;
        Token EOL8=null;

        CommonTree string_literal3_tree=null;
        CommonTree string_literal4_tree=null;
        CommonTree IDENT5_tree=null;
        CommonTree char_literal6_tree=null;
        CommonTree IDENT7_tree=null;
        CommonTree EOL8_tree=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:45:3: ( ( 'int' ^| 'boolean' ^) IDENT ( ',' ! IDENT )* EOL !)
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:45:5: ( 'int' ^| 'boolean' ^) IDENT ( ',' ! IDENT )* EOL !
            {
            root_0 = (CommonTree)adaptor.nil();


            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:45:5: ( 'int' ^| 'boolean' ^)
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==36) ) {
                alt3=1;
            }
            else if ( (LA3_0==34) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:45:6: 'int' ^
                    {
                    string_literal3=(Token)match(input,36,FOLLOW_36_in_declaration102); 
                    string_literal3_tree = 
                    (CommonTree)adaptor.create(string_literal3)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal3_tree, root_0);


                    }
                    break;
                case 2 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:45:15: 'boolean' ^
                    {
                    string_literal4=(Token)match(input,34,FOLLOW_34_in_declaration107); 
                    string_literal4_tree = 
                    (CommonTree)adaptor.create(string_literal4)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal4_tree, root_0);


                    }
                    break;

            }


            IDENT5=(Token)match(input,IDENT,FOLLOW_IDENT_in_declaration111); 
            IDENT5_tree = 
            (CommonTree)adaptor.create(IDENT5)
            ;
            adaptor.addChild(root_0, IDENT5_tree);


            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:45:33: ( ',' ! IDENT )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:45:34: ',' ! IDENT
            	    {
            	    char_literal6=(Token)match(input,25,FOLLOW_25_in_declaration114); 

            	    IDENT7=(Token)match(input,IDENT,FOLLOW_IDENT_in_declaration117); 
            	    IDENT7_tree = 
            	    (CommonTree)adaptor.create(IDENT7)
            	    ;
            	    adaptor.addChild(root_0, IDENT7_tree);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            EOL8=(Token)match(input,EOL,FOLLOW_EOL_in_declaration121); 

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
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:47:1: statement : ( ifStatement | assignment EOL !) ;
    public final BFlatGrammarParser.statement_return statement() throws RecognitionException {
        BFlatGrammarParser.statement_return retval = new BFlatGrammarParser.statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOL11=null;
        BFlatGrammarParser.ifStatement_return ifStatement9 =null;

        BFlatGrammarParser.assignment_return assignment10 =null;


        CommonTree EOL11_tree=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:48:3: ( ( ifStatement | assignment EOL !) )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:48:5: ( ifStatement | assignment EOL !)
            {
            root_0 = (CommonTree)adaptor.nil();


            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:48:5: ( ifStatement | assignment EOL !)
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==35) ) {
                alt5=1;
            }
            else if ( (LA5_0==IDENT) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:48:6: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement134);
                    ifStatement9=ifStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, ifStatement9.getTree());

                    }
                    break;
                case 2 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:48:20: assignment EOL !
                    {
                    pushFollow(FOLLOW_assignment_in_statement138);
                    assignment10=assignment();

                    state._fsp--;

                    adaptor.addChild(root_0, assignment10.getTree());

                    EOL11=(Token)match(input,EOL,FOLLOW_EOL_in_statement140); 

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
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:50:1: ifStatement : ( 'if' ^) LPAR ! expression RPAR ! LBRACE ! ( statement )* RBRACE !;
    public final BFlatGrammarParser.ifStatement_return ifStatement() throws RecognitionException {
        BFlatGrammarParser.ifStatement_return retval = new BFlatGrammarParser.ifStatement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal12=null;
        Token LPAR13=null;
        Token RPAR15=null;
        Token LBRACE16=null;
        Token RBRACE18=null;
        BFlatGrammarParser.expression_return expression14 =null;

        BFlatGrammarParser.statement_return statement17 =null;


        CommonTree string_literal12_tree=null;
        CommonTree LPAR13_tree=null;
        CommonTree RPAR15_tree=null;
        CommonTree LBRACE16_tree=null;
        CommonTree RBRACE18_tree=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:51:5: ( ( 'if' ^) LPAR ! expression RPAR ! LBRACE ! ( statement )* RBRACE !)
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:51:7: ( 'if' ^) LPAR ! expression RPAR ! LBRACE ! ( statement )* RBRACE !
            {
            root_0 = (CommonTree)adaptor.nil();


            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:51:7: ( 'if' ^)
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:51:8: 'if' ^
            {
            string_literal12=(Token)match(input,35,FOLLOW_35_in_ifStatement157); 
            string_literal12_tree = 
            (CommonTree)adaptor.create(string_literal12)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal12_tree, root_0);


            }


            LPAR13=(Token)match(input,LPAR,FOLLOW_LPAR_in_ifStatement161); 

            pushFollow(FOLLOW_expression_in_ifStatement164);
            expression14=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression14.getTree());

            RPAR15=(Token)match(input,RPAR,FOLLOW_RPAR_in_ifStatement166); 

            LBRACE16=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_ifStatement169); 

            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:51:46: ( statement )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==IDENT||LA6_0==35) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:51:46: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_ifStatement172);
            	    statement17=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement17.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            RBRACE18=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_ifStatement176); 

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


    public static class assignment_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:54:1: assignment : IDENT ( '=' ^) expression ;
    public final BFlatGrammarParser.assignment_return assignment() throws RecognitionException {
        BFlatGrammarParser.assignment_return retval = new BFlatGrammarParser.assignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENT19=null;
        Token char_literal20=null;
        BFlatGrammarParser.expression_return expression21 =null;


        CommonTree IDENT19_tree=null;
        CommonTree char_literal20_tree=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:55:3: ( IDENT ( '=' ^) expression )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:55:5: IDENT ( '=' ^) expression
            {
            root_0 = (CommonTree)adaptor.nil();


            IDENT19=(Token)match(input,IDENT,FOLLOW_IDENT_in_assignment193); 
            IDENT19_tree = 
            (CommonTree)adaptor.create(IDENT19)
            ;
            adaptor.addChild(root_0, IDENT19_tree);


            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:55:11: ( '=' ^)
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:55:12: '=' ^
            {
            char_literal20=(Token)match(input,30,FOLLOW_30_in_assignment196); 
            char_literal20_tree = 
            (CommonTree)adaptor.create(char_literal20)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(char_literal20_tree, root_0);


            }


            pushFollow(FOLLOW_expression_in_assignment200);
            expression21=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression21.getTree());

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
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:60:1: term : ( IDENT | ( LPAR ! expression RPAR !) | INTEGER | BOOL );
    public final BFlatGrammarParser.term_return term() throws RecognitionException {
        BFlatGrammarParser.term_return retval = new BFlatGrammarParser.term_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENT22=null;
        Token LPAR23=null;
        Token RPAR25=null;
        Token INTEGER26=null;
        Token BOOL27=null;
        BFlatGrammarParser.expression_return expression24 =null;


        CommonTree IDENT22_tree=null;
        CommonTree LPAR23_tree=null;
        CommonTree RPAR25_tree=null;
        CommonTree INTEGER26_tree=null;
        CommonTree BOOL27_tree=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:61:3: ( IDENT | ( LPAR ! expression RPAR !) | INTEGER | BOOL )
            int alt7=4;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt7=1;
                }
                break;
            case LPAR:
                {
                alt7=2;
                }
                break;
            case INTEGER:
                {
                alt7=3;
                }
                break;
            case BOOL:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:61:5: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    IDENT22=(Token)match(input,IDENT,FOLLOW_IDENT_in_term218); 
                    IDENT22_tree = 
                    (CommonTree)adaptor.create(IDENT22)
                    ;
                    adaptor.addChild(root_0, IDENT22_tree);


                    }
                    break;
                case 2 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:61:13: ( LPAR ! expression RPAR !)
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:61:13: ( LPAR ! expression RPAR !)
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:61:14: LPAR ! expression RPAR !
                    {
                    LPAR23=(Token)match(input,LPAR,FOLLOW_LPAR_in_term223); 

                    pushFollow(FOLLOW_expression_in_term226);
                    expression24=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression24.getTree());

                    RPAR25=(Token)match(input,RPAR,FOLLOW_RPAR_in_term228); 

                    }


                    }
                    break;
                case 3 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:61:40: INTEGER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    INTEGER26=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_term234); 
                    INTEGER26_tree = 
                    (CommonTree)adaptor.create(INTEGER26)
                    ;
                    adaptor.addChild(root_0, INTEGER26_tree);


                    }
                    break;
                case 4 :
                    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:61:50: BOOL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    BOOL27=(Token)match(input,BOOL,FOLLOW_BOOL_in_term238); 
                    BOOL27_tree = 
                    (CommonTree)adaptor.create(BOOL27)
                    ;
                    adaptor.addChild(root_0, BOOL27_tree);


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
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:64:1: unary : ( '+' !| arithNegation ^| boolNegation ^)* term ;
    public final BFlatGrammarParser.unary_return unary() throws RecognitionException {
        BFlatGrammarParser.unary_return retval = new BFlatGrammarParser.unary_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal28=null;
        BFlatGrammarParser.arithNegation_return arithNegation29 =null;

        BFlatGrammarParser.boolNegation_return boolNegation30 =null;

        BFlatGrammarParser.term_return term31 =null;


        CommonTree char_literal28_tree=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:65:3: ( ( '+' !| arithNegation ^| boolNegation ^)* term )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:65:5: ( '+' !| arithNegation ^| boolNegation ^)* term
            {
            root_0 = (CommonTree)adaptor.nil();


            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:65:5: ( '+' !| arithNegation ^| boolNegation ^)*
            loop8:
            do {
                int alt8=4;
                switch ( input.LA(1) ) {
                case 24:
                    {
                    alt8=1;
                    }
                    break;
                case 26:
                    {
                    alt8=2;
                    }
                    break;
                case 19:
                    {
                    alt8=3;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:65:6: '+' !
            	    {
            	    char_literal28=(Token)match(input,24,FOLLOW_24_in_unary255); 

            	    }
            	    break;
            	case 2 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:65:13: arithNegation ^
            	    {
            	    pushFollow(FOLLOW_arithNegation_in_unary260);
            	    arithNegation29=arithNegation();

            	    state._fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(arithNegation29.getTree(), root_0);

            	    }
            	    break;
            	case 3 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:65:30: boolNegation ^
            	    {
            	    pushFollow(FOLLOW_boolNegation_in_unary265);
            	    boolNegation30=boolNegation();

            	    state._fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(boolNegation30.getTree(), root_0);

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            pushFollow(FOLLOW_term_in_unary270);
            term31=term();

            state._fsp--;

            adaptor.addChild(root_0, term31.getTree());

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
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:68:1: boolNegation : '!' -> BOOL_NEGATION ;
    public final BFlatGrammarParser.boolNegation_return boolNegation() throws RecognitionException {
        BFlatGrammarParser.boolNegation_return retval = new BFlatGrammarParser.boolNegation_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal32=null;

        CommonTree char_literal32_tree=null;
        RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:69:3: ( '!' -> BOOL_NEGATION )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:69:5: '!'
            {
            char_literal32=(Token)match(input,19,FOLLOW_19_in_boolNegation283);  
            stream_19.add(char_literal32);


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
            // 69:9: -> BOOL_NEGATION
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
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:72:1: arithNegation : '-' -> ARITH_NEGATION ;
    public final BFlatGrammarParser.arithNegation_return arithNegation() throws RecognitionException {
        BFlatGrammarParser.arithNegation_return retval = new BFlatGrammarParser.arithNegation_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal33=null;

        CommonTree char_literal33_tree=null;
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:73:3: ( '-' -> ARITH_NEGATION )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:73:5: '-'
            {
            char_literal33=(Token)match(input,26,FOLLOW_26_in_arithNegation303);  
            stream_26.add(char_literal33);


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
            // 73:9: -> ARITH_NEGATION
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
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:76:1: mult : unary ( ( '*' | '/' | '%' ) ^ unary )* ;
    public final BFlatGrammarParser.mult_return mult() throws RecognitionException {
        BFlatGrammarParser.mult_return retval = new BFlatGrammarParser.mult_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set35=null;
        BFlatGrammarParser.unary_return unary34 =null;

        BFlatGrammarParser.unary_return unary36 =null;


        CommonTree set35_tree=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:77:3: ( unary ( ( '*' | '/' | '%' ) ^ unary )* )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:77:5: unary ( ( '*' | '/' | '%' ) ^ unary )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_unary_in_mult322);
            unary34=unary();

            state._fsp--;

            adaptor.addChild(root_0, unary34.getTree());

            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:77:11: ( ( '*' | '/' | '%' ) ^ unary )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21||LA9_0==23||LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:77:12: ( '*' | '/' | '%' ) ^ unary
            	    {
            	    set35=(Token)input.LT(1);

            	    set35=(Token)input.LT(1);

            	    if ( input.LA(1)==21||input.LA(1)==23||input.LA(1)==27 ) {
            	        input.consume();
            	        root_0 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(set35)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unary_in_mult338);
            	    unary36=unary();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unary36.getTree());

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
    // $ANTLR end "mult"


    public static class add_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "add"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:80:1: add : mult ( ( '+' | '-' ) ^ mult )* ;
    public final BFlatGrammarParser.add_return add() throws RecognitionException {
        BFlatGrammarParser.add_return retval = new BFlatGrammarParser.add_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set38=null;
        BFlatGrammarParser.mult_return mult37 =null;

        BFlatGrammarParser.mult_return mult39 =null;


        CommonTree set38_tree=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:81:3: ( mult ( ( '+' | '-' ) ^ mult )* )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:81:5: mult ( ( '+' | '-' ) ^ mult )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_mult_in_add354);
            mult37=mult();

            state._fsp--;

            adaptor.addChild(root_0, mult37.getTree());

            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:81:10: ( ( '+' | '-' ) ^ mult )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24||LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:81:11: ( '+' | '-' ) ^ mult
            	    {
            	    set38=(Token)input.LT(1);

            	    set38=(Token)input.LT(1);

            	    if ( input.LA(1)==24||input.LA(1)==26 ) {
            	        input.consume();
            	        root_0 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(set38)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_mult_in_add366);
            	    mult39=mult();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mult39.getTree());

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
    // $ANTLR end "add"


    public static class relation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relation"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:84:1: relation : add ( ( '<' | '>' | '<=' | '>=' | '==' | '!=' ) ^ add )* ;
    public final BFlatGrammarParser.relation_return relation() throws RecognitionException {
        BFlatGrammarParser.relation_return retval = new BFlatGrammarParser.relation_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set41=null;
        BFlatGrammarParser.add_return add40 =null;

        BFlatGrammarParser.add_return add42 =null;


        CommonTree set41_tree=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:85:3: ( add ( ( '<' | '>' | '<=' | '>=' | '==' | '!=' ) ^ add )* )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:85:5: add ( ( '<' | '>' | '<=' | '>=' | '==' | '!=' ) ^ add )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_add_in_relation382);
            add40=add();

            state._fsp--;

            adaptor.addChild(root_0, add40.getTree());

            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:85:9: ( ( '<' | '>' | '<=' | '>=' | '==' | '!=' ) ^ add )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20||(LA11_0 >= 28 && LA11_0 <= 29)||(LA11_0 >= 31 && LA11_0 <= 33)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:85:10: ( '<' | '>' | '<=' | '>=' | '==' | '!=' ) ^ add
            	    {
            	    set41=(Token)input.LT(1);

            	    set41=(Token)input.LT(1);

            	    if ( input.LA(1)==20||(input.LA(1) >= 28 && input.LA(1) <= 29)||(input.LA(1) >= 31 && input.LA(1) <= 33) ) {
            	        input.consume();
            	        root_0 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(set41)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_add_in_relation410);
            	    add42=add();

            	    state._fsp--;

            	    adaptor.addChild(root_0, add42.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:88:1: conjunction : relation ( '&&' ^ relation )* ;
    public final BFlatGrammarParser.conjunction_return conjunction() throws RecognitionException {
        BFlatGrammarParser.conjunction_return retval = new BFlatGrammarParser.conjunction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal44=null;
        BFlatGrammarParser.relation_return relation43 =null;

        BFlatGrammarParser.relation_return relation45 =null;


        CommonTree string_literal44_tree=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:89:3: ( relation ( '&&' ^ relation )* )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:89:5: relation ( '&&' ^ relation )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_relation_in_conjunction426);
            relation43=relation();

            state._fsp--;

            adaptor.addChild(root_0, relation43.getTree());

            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:89:14: ( '&&' ^ relation )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:89:15: '&&' ^ relation
            	    {
            	    string_literal44=(Token)match(input,22,FOLLOW_22_in_conjunction429); 
            	    string_literal44_tree = 
            	    (CommonTree)adaptor.create(string_literal44)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal44_tree, root_0);


            	    pushFollow(FOLLOW_relation_in_conjunction432);
            	    relation45=relation();

            	    state._fsp--;

            	    adaptor.addChild(root_0, relation45.getTree());

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
    // $ANTLR end "conjunction"


    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:92:1: expression : ( conjunction ( '||' ^ conjunction )* ) ;
    public final BFlatGrammarParser.expression_return expression() throws RecognitionException {
        BFlatGrammarParser.expression_return retval = new BFlatGrammarParser.expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal47=null;
        BFlatGrammarParser.conjunction_return conjunction46 =null;

        BFlatGrammarParser.conjunction_return conjunction48 =null;


        CommonTree string_literal47_tree=null;

        try {
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:93:3: ( ( conjunction ( '||' ^ conjunction )* ) )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:93:5: ( conjunction ( '||' ^ conjunction )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:93:5: ( conjunction ( '||' ^ conjunction )* )
            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:93:6: conjunction ( '||' ^ conjunction )*
            {
            pushFollow(FOLLOW_conjunction_in_expression448);
            conjunction46=conjunction();

            state._fsp--;

            adaptor.addChild(root_0, conjunction46.getTree());

            // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:93:18: ( '||' ^ conjunction )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==37) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /v/filer4b/v38q001/rjnevels/Desktop/Antlr Eclipse Test/workspace/BFlat/src/a/b/c/BFlatGrammar.g:93:19: '||' ^ conjunction
            	    {
            	    string_literal47=(Token)match(input,37,FOLLOW_37_in_expression451); 
            	    string_literal47_tree = 
            	    (CommonTree)adaptor.create(string_literal47)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal47_tree, root_0);


            	    pushFollow(FOLLOW_conjunction_in_expression454);
            	    conjunction48=conjunction();

            	    state._fsp--;

            	    adaptor.addChild(root_0, conjunction48.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
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


 

    public static final BitSet FOLLOW_declaration_in_program78 = new BitSet(new long[]{0x0000001C00000402L});
    public static final BitSet FOLLOW_statement_in_program81 = new BitSet(new long[]{0x0000000800000402L});
    public static final BitSet FOLLOW_36_in_declaration102 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_34_in_declaration107 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_IDENT_in_declaration111 = new BitSet(new long[]{0x0000000002000200L});
    public static final BitSet FOLLOW_25_in_declaration114 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_IDENT_in_declaration117 = new BitSet(new long[]{0x0000000002000200L});
    public static final BitSet FOLLOW_EOL_in_declaration121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement138 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_EOL_in_statement140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ifStatement157 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LPAR_in_ifStatement161 = new BitSet(new long[]{0x0000000005084C20L});
    public static final BitSet FOLLOW_expression_in_ifStatement164 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RPAR_in_ifStatement166 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LBRACE_in_ifStatement169 = new BitSet(new long[]{0x0000000800010400L});
    public static final BitSet FOLLOW_statement_in_ifStatement172 = new BitSet(new long[]{0x0000000800010400L});
    public static final BitSet FOLLOW_RBRACE_in_ifStatement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_assignment193 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_assignment196 = new BitSet(new long[]{0x0000000005084C20L});
    public static final BitSet FOLLOW_expression_in_assignment200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_term218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAR_in_term223 = new BitSet(new long[]{0x0000000005084C20L});
    public static final BitSet FOLLOW_expression_in_term226 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RPAR_in_term228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_term234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_term238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_unary255 = new BitSet(new long[]{0x0000000005084C20L});
    public static final BitSet FOLLOW_arithNegation_in_unary260 = new BitSet(new long[]{0x0000000005084C20L});
    public static final BitSet FOLLOW_boolNegation_in_unary265 = new BitSet(new long[]{0x0000000005084C20L});
    public static final BitSet FOLLOW_term_in_unary270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_boolNegation283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_arithNegation303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_mult322 = new BitSet(new long[]{0x0000000008A00002L});
    public static final BitSet FOLLOW_set_in_mult325 = new BitSet(new long[]{0x0000000005084C20L});
    public static final BitSet FOLLOW_unary_in_mult338 = new BitSet(new long[]{0x0000000008A00002L});
    public static final BitSet FOLLOW_mult_in_add354 = new BitSet(new long[]{0x0000000005000002L});
    public static final BitSet FOLLOW_set_in_add357 = new BitSet(new long[]{0x0000000005084C20L});
    public static final BitSet FOLLOW_mult_in_add366 = new BitSet(new long[]{0x0000000005000002L});
    public static final BitSet FOLLOW_add_in_relation382 = new BitSet(new long[]{0x00000003B0100002L});
    public static final BitSet FOLLOW_set_in_relation385 = new BitSet(new long[]{0x0000000005084C20L});
    public static final BitSet FOLLOW_add_in_relation410 = new BitSet(new long[]{0x00000003B0100002L});
    public static final BitSet FOLLOW_relation_in_conjunction426 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_conjunction429 = new BitSet(new long[]{0x0000000005084C20L});
    public static final BitSet FOLLOW_relation_in_conjunction432 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_conjunction_in_expression448 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_expression451 = new BitSet(new long[]{0x0000000005084C20L});
    public static final BitSet FOLLOW_conjunction_in_expression454 = new BitSet(new long[]{0x0000002000000002L});

}