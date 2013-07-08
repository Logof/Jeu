// $ANTLR 3.4 /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g 2013-03-04 17:26:37

  package org.tmatesoft.sqljet.core.internal.lang;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "ABORT", "ADD", "AFTER", "ALIAS", "ALL", "ALTER", "AMPERSAND", "ANALYZE", "AND", "APOSTROPHE", "AS", "ASC", "ASTERISK", "AT", "ATTACH", "AUTOINCREMENT", "B", "BACKSLASH", "BEFORE", "BEGIN", "BETWEEN", "BIND", "BIND_NAME", "BLOB", "BLOB_LITERAL", "BY", "C", "CASCADE", "CASE", "CAST", "CHECK", "COLLATE", "COLON", "COLUMN", "COLUMNS", "COLUMN_CONSTRAINT", "COLUMN_EXPRESSION", "COMMA", "COMMENT", "COMMIT", "CONFLICT", "CONSTRAINT", "CONSTRAINTS", "CREATE", "CREATE_INDEX", "CREATE_TABLE", "CREATE_TRIGGER", "CREATE_VIEW", "CROSS", "CURRENT_DATE", "CURRENT_TIME", "CURRENT_TIMESTAMP", "D", "DATABASE", "DEFAULT", "DEFERRABLE", "DEFERRED", "DELETE", "DESC", "DETACH", "DISTINCT", "DOLLAR", "DOT", "DOUBLE_PIPE", "DROP", "DROP_INDEX", "DROP_TABLE", "E", "EACH", "ELSE", "END", "EQUALS", "EQUALS2", "ESCAPE", "EXCEPT", "EXCLUSIVE", "EXISTS", "EXPLAIN", "F", "FAIL", "FLOAT", "FLOAT_EXP", "FLOAT_LITERAL", "FOR", "FOREIGN", "FROM", "FUNCTION_EXPRESSION", "FUNCTION_LITERAL", "G", "GLOB", "GREATER", "GREATER_OR_EQ", "GROUP", "H", "HAVING", "I", "ID", "ID_CORE", "ID_LITERAL", "ID_PLAIN", "ID_QUOTED", "ID_QUOTED_APOSTROPHE", "ID_QUOTED_CORE", "ID_QUOTED_CORE_APOSTROPHE", "ID_QUOTED_CORE_SQUARE", "ID_QUOTED_SQUARE", "ID_START", "IF", "IGNORE", "IMMEDIATE", "IN", "INDEX", "INDEXED", "INITIALLY", "INNER", "INSERT", "INSTEAD", "INTEGER", "INTEGER_LITERAL", "INTERSECT", "INTO", "IN_TABLE", "IN_VALUES", "IS", "ISNULL", "IS_NOT", "IS_NULL", "J", "JOIN", "K", "KEY", "L", "LEFT", "LESS", "LESS_OR_EQ", "LIKE", "LIMIT", "LINE_COMMENT", "LPAREN", "LPAREN_SQUARE", "M", "MATCH", "MINUS", "N", "NATURAL", "NOT", "NOTNULL", "NOT_EQUALS", "NOT_EQUALS2", "NOT_NULL", "NULL", "O", "OF", "OFFSET", "ON", "OPTIONS", "OR", "ORDER", "ORDERING", "OUTER", "P", "PERCENT", "PIPE", "PLAN", "PLUS", "PRAGMA", "PRIMARY", "Q", "QUERY", "QUESTION", "QUOTE_DOUBLE", "QUOTE_SINGLE", "R", "RAISE", "REFERENCES", "REGEXP", "REINDEX", "RELEASE", "RENAME", "REPLACE", "RESTRICT", "ROLLBACK", "ROW", "RPAREN", "RPAREN_SQUARE", "S", "SAVEPOINT", "SELECT", "SELECT_CORE", "SEMI", "SET", "SHIFT_LEFT", "SHIFT_RIGHT", "SLASH", "STATEMENT", "STRING", "STRING_CORE", "STRING_CORE_DOUBLE", "STRING_CORE_SINGLE", "STRING_DOUBLE", "STRING_ESCAPE_DOUBLE", "STRING_ESCAPE_SINGLE", "STRING_LITERAL", "STRING_SINGLE", "T", "TABLE", "TABLE_CONSTRAINT", "TEMPORARY", "THEN", "TILDA", "TO", "TRANSACTION", "TRIGGER", "TYPE", "TYPE_PARAMS", "U", "UNDERSCORE", "UNION", "UNIQUE", "UPDATE", "USING", "V", "VACUUM", "VALUES", "VIEW", "VIRTUAL", "W", "WHEN", "WHERE", "WS", "X", "Y", "Z"
    };

    public static final int EOF=-1;
    public static final int A=4;
    public static final int ABORT=5;
    public static final int ADD=6;
    public static final int AFTER=7;
    public static final int ALIAS=8;
    public static final int ALL=9;
    public static final int ALTER=10;
    public static final int AMPERSAND=11;
    public static final int ANALYZE=12;
    public static final int AND=13;
    public static final int APOSTROPHE=14;
    public static final int AS=15;
    public static final int ASC=16;
    public static final int ASTERISK=17;
    public static final int AT=18;
    public static final int ATTACH=19;
    public static final int AUTOINCREMENT=20;
    public static final int B=21;
    public static final int BACKSLASH=22;
    public static final int BEFORE=23;
    public static final int BEGIN=24;
    public static final int BETWEEN=25;
    public static final int BIND=26;
    public static final int BIND_NAME=27;
    public static final int BLOB=28;
    public static final int BLOB_LITERAL=29;
    public static final int BY=30;
    public static final int C=31;
    public static final int CASCADE=32;
    public static final int CASE=33;
    public static final int CAST=34;
    public static final int CHECK=35;
    public static final int COLLATE=36;
    public static final int COLON=37;
    public static final int COLUMN=38;
    public static final int COLUMNS=39;
    public static final int COLUMN_CONSTRAINT=40;
    public static final int COLUMN_EXPRESSION=41;
    public static final int COMMA=42;
    public static final int COMMENT=43;
    public static final int COMMIT=44;
    public static final int CONFLICT=45;
    public static final int CONSTRAINT=46;
    public static final int CONSTRAINTS=47;
    public static final int CREATE=48;
    public static final int CREATE_INDEX=49;
    public static final int CREATE_TABLE=50;
    public static final int CREATE_TRIGGER=51;
    public static final int CREATE_VIEW=52;
    public static final int CROSS=53;
    public static final int CURRENT_DATE=54;
    public static final int CURRENT_TIME=55;
    public static final int CURRENT_TIMESTAMP=56;
    public static final int D=57;
    public static final int DATABASE=58;
    public static final int DEFAULT=59;
    public static final int DEFERRABLE=60;
    public static final int DEFERRED=61;
    public static final int DELETE=62;
    public static final int DESC=63;
    public static final int DETACH=64;
    public static final int DISTINCT=65;
    public static final int DOLLAR=66;
    public static final int DOT=67;
    public static final int DOUBLE_PIPE=68;
    public static final int DROP=69;
    public static final int DROP_INDEX=70;
    public static final int DROP_TABLE=71;
    public static final int E=72;
    public static final int EACH=73;
    public static final int ELSE=74;
    public static final int END=75;
    public static final int EQUALS=76;
    public static final int EQUALS2=77;
    public static final int ESCAPE=78;
    public static final int EXCEPT=79;
    public static final int EXCLUSIVE=80;
    public static final int EXISTS=81;
    public static final int EXPLAIN=82;
    public static final int F=83;
    public static final int FAIL=84;
    public static final int FLOAT=85;
    public static final int FLOAT_EXP=86;
    public static final int FLOAT_LITERAL=87;
    public static final int FOR=88;
    public static final int FOREIGN=89;
    public static final int FROM=90;
    public static final int FUNCTION_EXPRESSION=91;
    public static final int FUNCTION_LITERAL=92;
    public static final int G=93;
    public static final int GLOB=94;
    public static final int GREATER=95;
    public static final int GREATER_OR_EQ=96;
    public static final int GROUP=97;
    public static final int H=98;
    public static final int HAVING=99;
    public static final int I=100;
    public static final int ID=101;
    public static final int ID_CORE=102;
    public static final int ID_LITERAL=103;
    public static final int ID_PLAIN=104;
    public static final int ID_QUOTED=105;
    public static final int ID_QUOTED_APOSTROPHE=106;
    public static final int ID_QUOTED_CORE=107;
    public static final int ID_QUOTED_CORE_APOSTROPHE=108;
    public static final int ID_QUOTED_CORE_SQUARE=109;
    public static final int ID_QUOTED_SQUARE=110;
    public static final int ID_START=111;
    public static final int IF=112;
    public static final int IGNORE=113;
    public static final int IMMEDIATE=114;
    public static final int IN=115;
    public static final int INDEX=116;
    public static final int INDEXED=117;
    public static final int INITIALLY=118;
    public static final int INNER=119;
    public static final int INSERT=120;
    public static final int INSTEAD=121;
    public static final int INTEGER=122;
    public static final int INTEGER_LITERAL=123;
    public static final int INTERSECT=124;
    public static final int INTO=125;
    public static final int IN_TABLE=126;
    public static final int IN_VALUES=127;
    public static final int IS=128;
    public static final int ISNULL=129;
    public static final int IS_NOT=130;
    public static final int IS_NULL=131;
    public static final int J=132;
    public static final int JOIN=133;
    public static final int K=134;
    public static final int KEY=135;
    public static final int L=136;
    public static final int LEFT=137;
    public static final int LESS=138;
    public static final int LESS_OR_EQ=139;
    public static final int LIKE=140;
    public static final int LIMIT=141;
    public static final int LINE_COMMENT=142;
    public static final int LPAREN=143;
    public static final int LPAREN_SQUARE=144;
    public static final int M=145;
    public static final int MATCH=146;
    public static final int MINUS=147;
    public static final int N=148;
    public static final int NATURAL=149;
    public static final int NOT=150;
    public static final int NOTNULL=151;
    public static final int NOT_EQUALS=152;
    public static final int NOT_EQUALS2=153;
    public static final int NOT_NULL=154;
    public static final int NULL=155;
    public static final int O=156;
    public static final int OF=157;
    public static final int OFFSET=158;
    public static final int ON=159;
    public static final int OPTIONS=160;
    public static final int OR=161;
    public static final int ORDER=162;
    public static final int ORDERING=163;
    public static final int OUTER=164;
    public static final int P=165;
    public static final int PERCENT=166;
    public static final int PIPE=167;
    public static final int PLAN=168;
    public static final int PLUS=169;
    public static final int PRAGMA=170;
    public static final int PRIMARY=171;
    public static final int Q=172;
    public static final int QUERY=173;
    public static final int QUESTION=174;
    public static final int QUOTE_DOUBLE=175;
    public static final int QUOTE_SINGLE=176;
    public static final int R=177;
    public static final int RAISE=178;
    public static final int REFERENCES=179;
    public static final int REGEXP=180;
    public static final int REINDEX=181;
    public static final int RELEASE=182;
    public static final int RENAME=183;
    public static final int REPLACE=184;
    public static final int RESTRICT=185;
    public static final int ROLLBACK=186;
    public static final int ROW=187;
    public static final int RPAREN=188;
    public static final int RPAREN_SQUARE=189;
    public static final int S=190;
    public static final int SAVEPOINT=191;
    public static final int SELECT=192;
    public static final int SELECT_CORE=193;
    public static final int SEMI=194;
    public static final int SET=195;
    public static final int SHIFT_LEFT=196;
    public static final int SHIFT_RIGHT=197;
    public static final int SLASH=198;
    public static final int STATEMENT=199;
    public static final int STRING=200;
    public static final int STRING_CORE=201;
    public static final int STRING_CORE_DOUBLE=202;
    public static final int STRING_CORE_SINGLE=203;
    public static final int STRING_DOUBLE=204;
    public static final int STRING_ESCAPE_DOUBLE=205;
    public static final int STRING_ESCAPE_SINGLE=206;
    public static final int STRING_LITERAL=207;
    public static final int STRING_SINGLE=208;
    public static final int T=209;
    public static final int TABLE=210;
    public static final int TABLE_CONSTRAINT=211;
    public static final int TEMPORARY=212;
    public static final int THEN=213;
    public static final int TILDA=214;
    public static final int TO=215;
    public static final int TRANSACTION=216;
    public static final int TRIGGER=217;
    public static final int TYPE=218;
    public static final int TYPE_PARAMS=219;
    public static final int U=220;
    public static final int UNDERSCORE=221;
    public static final int UNION=222;
    public static final int UNIQUE=223;
    public static final int UPDATE=224;
    public static final int USING=225;
    public static final int V=226;
    public static final int VACUUM=227;
    public static final int VALUES=228;
    public static final int VIEW=229;
    public static final int VIRTUAL=230;
    public static final int W=231;
    public static final int WHEN=232;
    public static final int WHERE=233;
    public static final int WS=234;
    public static final int X=235;
    public static final int Y=236;
    public static final int Z=237;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public SqlParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public SqlParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return SqlParser.tokenNames; }
    public String getGrammarFileName() { return "/home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g"; }



    // Disable error recovery.
    protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
        throw new MismatchedTokenException(ttype, input);
    }

    // Delegate error reporting to caller.
    public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
        final StringBuilder buffer = new StringBuilder();
        buffer.append("[").append(getErrorHeader(e)).append("] ");
        buffer.append(getErrorMessage(e, tokenNames));
        if(e.token!=null) {
          final CharStream stream = e.token.getInputStream();
          if(stream!=null) {
            int size = stream.size();
            if(size>0) {
              buffer.append("\n").append(stream.substring(0, size-1));
            }
          }
        }
        throw new SqlJetParserException(buffer.toString(), e);
    }

    // unquotes identifier
    private String unquoteId(String id) {
      if(id==null) {
        return null;
      }
      int len = id.length();
      if(len==0) {
        return "";
      }
      char first = id.charAt(0);
      char last = id.charAt(len-1);
      switch(first) {
        case '[' :
          first = ']';
        case '\'' :
        case '"' :
        case '`' :
          if(first==last) {
            return id.substring(1,len-1);
          }
        default:
          return id;
      }
    }



    public static class sql_stmt_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sql_stmt_list"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:142:1: sql_stmt_list : sql_stmt ( SEMI ! ( sql_stmt SEMI !)* )? EOF !;
    public final SqlParser.sql_stmt_list_return sql_stmt_list() throws RecognitionException {
        SqlParser.sql_stmt_list_return retval = new SqlParser.sql_stmt_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SEMI2=null;
        Token SEMI4=null;
        Token EOF5=null;
        SqlParser.sql_stmt_return sql_stmt1 =null;

        SqlParser.sql_stmt_return sql_stmt3 =null;


        Object SEMI2_tree=null;
        Object SEMI4_tree=null;
        Object EOF5_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:142:14: ( sql_stmt ( SEMI ! ( sql_stmt SEMI !)* )? EOF !)
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:142:16: sql_stmt ( SEMI ! ( sql_stmt SEMI !)* )? EOF !
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_sql_stmt_in_sql_stmt_list223);
            sql_stmt1=sql_stmt();

            state._fsp--;

            adaptor.addChild(root_0, sql_stmt1.getTree());

            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:142:25: ( SEMI ! ( sql_stmt SEMI !)* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==SEMI) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:142:26: SEMI ! ( sql_stmt SEMI !)*
                    {
                    SEMI2=(Token)match(input,SEMI,FOLLOW_SEMI_in_sql_stmt_list226); 

                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:142:32: ( sql_stmt SEMI !)*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==ALTER||LA1_0==ANALYZE||LA1_0==ATTACH||LA1_0==BEGIN||LA1_0==COMMIT||LA1_0==CREATE||LA1_0==DELETE||LA1_0==DETACH||LA1_0==DROP||LA1_0==END||LA1_0==EXPLAIN||LA1_0==INSERT||LA1_0==PRAGMA||(LA1_0 >= REINDEX && LA1_0 <= RELEASE)||LA1_0==REPLACE||LA1_0==ROLLBACK||(LA1_0 >= SAVEPOINT && LA1_0 <= SELECT)||LA1_0==UPDATE||LA1_0==VACUUM) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:142:33: sql_stmt SEMI !
                    	    {
                    	    pushFollow(FOLLOW_sql_stmt_in_sql_stmt_list230);
                    	    sql_stmt3=sql_stmt();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, sql_stmt3.getTree());

                    	    SEMI4=(Token)match(input,SEMI,FOLLOW_SEMI_in_sql_stmt_list232); 

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }


            EOF5=(Token)match(input,EOF,FOLLOW_EOF_in_sql_stmt_list240); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sql_stmt_list"


    public static class sql_stmt_itself_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sql_stmt_itself"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:144:1: sql_stmt_itself : sql_stmt ( SEMI !)? EOF !;
    public final SqlParser.sql_stmt_itself_return sql_stmt_itself() throws RecognitionException {
        SqlParser.sql_stmt_itself_return retval = new SqlParser.sql_stmt_itself_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SEMI7=null;
        Token EOF8=null;
        SqlParser.sql_stmt_return sql_stmt6 =null;


        Object SEMI7_tree=null;
        Object EOF8_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:144:16: ( sql_stmt ( SEMI !)? EOF !)
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:144:18: sql_stmt ( SEMI !)? EOF !
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_sql_stmt_in_sql_stmt_itself248);
            sql_stmt6=sql_stmt();

            state._fsp--;

            adaptor.addChild(root_0, sql_stmt6.getTree());

            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:144:27: ( SEMI !)?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==SEMI) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:144:28: SEMI !
                    {
                    SEMI7=(Token)match(input,SEMI,FOLLOW_SEMI_in_sql_stmt_itself251); 

                    }
                    break;

            }


            EOF8=(Token)match(input,EOF,FOLLOW_EOF_in_sql_stmt_itself256); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sql_stmt_itself"


    public static class sql_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sql_stmt"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:146:1: sql_stmt : ( EXPLAIN ( QUERY PLAN )? )? sql_stmt_core ;
    public final SqlParser.sql_stmt_return sql_stmt() throws RecognitionException {
        SqlParser.sql_stmt_return retval = new SqlParser.sql_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EXPLAIN9=null;
        Token QUERY10=null;
        Token PLAN11=null;
        SqlParser.sql_stmt_core_return sql_stmt_core12 =null;


        Object EXPLAIN9_tree=null;
        Object QUERY10_tree=null;
        Object PLAN11_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:146:9: ( ( EXPLAIN ( QUERY PLAN )? )? sql_stmt_core )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:146:11: ( EXPLAIN ( QUERY PLAN )? )? sql_stmt_core
            {
            root_0 = (Object)adaptor.nil();


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:146:11: ( EXPLAIN ( QUERY PLAN )? )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==EXPLAIN) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:146:12: EXPLAIN ( QUERY PLAN )?
                    {
                    EXPLAIN9=(Token)match(input,EXPLAIN,FOLLOW_EXPLAIN_in_sql_stmt265); 
                    EXPLAIN9_tree = 
                    (Object)adaptor.create(EXPLAIN9)
                    ;
                    adaptor.addChild(root_0, EXPLAIN9_tree);


                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:146:20: ( QUERY PLAN )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==QUERY) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:146:21: QUERY PLAN
                            {
                            QUERY10=(Token)match(input,QUERY,FOLLOW_QUERY_in_sql_stmt268); 
                            QUERY10_tree = 
                            (Object)adaptor.create(QUERY10)
                            ;
                            adaptor.addChild(root_0, QUERY10_tree);


                            PLAN11=(Token)match(input,PLAN,FOLLOW_PLAN_in_sql_stmt270); 
                            PLAN11_tree = 
                            (Object)adaptor.create(PLAN11)
                            ;
                            adaptor.addChild(root_0, PLAN11_tree);


                            }
                            break;

                    }


                    }
                    break;

            }


            pushFollow(FOLLOW_sql_stmt_core_in_sql_stmt276);
            sql_stmt_core12=sql_stmt_core();

            state._fsp--;

            adaptor.addChild(root_0, sql_stmt_core12.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sql_stmt"


    public static class sql_stmt_core_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sql_stmt_core"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:148:1: sql_stmt_core : ( pragma_stmt | attach_stmt | detach_stmt | analyze_stmt | reindex_stmt | vacuum_stmt | select_stmt | insert_stmt | update_stmt | delete_stmt | begin_stmt | commit_stmt | rollback_stmt | savepoint_stmt | release_stmt | create_virtual_table_stmt | create_table_stmt | drop_table_stmt | alter_table_stmt | create_view_stmt | drop_view_stmt | create_index_stmt | drop_index_stmt | create_trigger_stmt | drop_trigger_stmt );
    public final SqlParser.sql_stmt_core_return sql_stmt_core() throws RecognitionException {
        SqlParser.sql_stmt_core_return retval = new SqlParser.sql_stmt_core_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SqlParser.pragma_stmt_return pragma_stmt13 =null;

        SqlParser.attach_stmt_return attach_stmt14 =null;

        SqlParser.detach_stmt_return detach_stmt15 =null;

        SqlParser.analyze_stmt_return analyze_stmt16 =null;

        SqlParser.reindex_stmt_return reindex_stmt17 =null;

        SqlParser.vacuum_stmt_return vacuum_stmt18 =null;

        SqlParser.select_stmt_return select_stmt19 =null;

        SqlParser.insert_stmt_return insert_stmt20 =null;

        SqlParser.update_stmt_return update_stmt21 =null;

        SqlParser.delete_stmt_return delete_stmt22 =null;

        SqlParser.begin_stmt_return begin_stmt23 =null;

        SqlParser.commit_stmt_return commit_stmt24 =null;

        SqlParser.rollback_stmt_return rollback_stmt25 =null;

        SqlParser.savepoint_stmt_return savepoint_stmt26 =null;

        SqlParser.release_stmt_return release_stmt27 =null;

        SqlParser.create_virtual_table_stmt_return create_virtual_table_stmt28 =null;

        SqlParser.create_table_stmt_return create_table_stmt29 =null;

        SqlParser.drop_table_stmt_return drop_table_stmt30 =null;

        SqlParser.alter_table_stmt_return alter_table_stmt31 =null;

        SqlParser.create_view_stmt_return create_view_stmt32 =null;

        SqlParser.drop_view_stmt_return drop_view_stmt33 =null;

        SqlParser.create_index_stmt_return create_index_stmt34 =null;

        SqlParser.drop_index_stmt_return drop_index_stmt35 =null;

        SqlParser.create_trigger_stmt_return create_trigger_stmt36 =null;

        SqlParser.drop_trigger_stmt_return drop_trigger_stmt37 =null;



        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:149:3: ( pragma_stmt | attach_stmt | detach_stmt | analyze_stmt | reindex_stmt | vacuum_stmt | select_stmt | insert_stmt | update_stmt | delete_stmt | begin_stmt | commit_stmt | rollback_stmt | savepoint_stmt | release_stmt | create_virtual_table_stmt | create_table_stmt | drop_table_stmt | alter_table_stmt | create_view_stmt | drop_view_stmt | create_index_stmt | drop_index_stmt | create_trigger_stmt | drop_trigger_stmt )
            int alt6=25;
            switch ( input.LA(1) ) {
            case PRAGMA:
                {
                alt6=1;
                }
                break;
            case ATTACH:
                {
                alt6=2;
                }
                break;
            case DETACH:
                {
                alt6=3;
                }
                break;
            case ANALYZE:
                {
                alt6=4;
                }
                break;
            case REINDEX:
                {
                alt6=5;
                }
                break;
            case VACUUM:
                {
                alt6=6;
                }
                break;
            case SELECT:
                {
                alt6=7;
                }
                break;
            case INSERT:
            case REPLACE:
                {
                alt6=8;
                }
                break;
            case UPDATE:
                {
                alt6=9;
                }
                break;
            case DELETE:
                {
                alt6=10;
                }
                break;
            case BEGIN:
                {
                alt6=11;
                }
                break;
            case COMMIT:
            case END:
                {
                alt6=12;
                }
                break;
            case ROLLBACK:
                {
                alt6=13;
                }
                break;
            case SAVEPOINT:
                {
                alt6=14;
                }
                break;
            case RELEASE:
                {
                alt6=15;
                }
                break;
            case CREATE:
                {
                switch ( input.LA(2) ) {
                case VIRTUAL:
                    {
                    alt6=16;
                    }
                    break;
                case TEMPORARY:
                    {
                    switch ( input.LA(3) ) {
                    case TABLE:
                        {
                        alt6=17;
                        }
                        break;
                    case VIEW:
                        {
                        alt6=20;
                        }
                        break;
                    case TRIGGER:
                        {
                        alt6=24;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 21, input);

                        throw nvae;

                    }

                    }
                    break;
                case TABLE:
                    {
                    alt6=17;
                    }
                    break;
                case VIEW:
                    {
                    alt6=20;
                    }
                    break;
                case INDEX:
                case UNIQUE:
                    {
                    alt6=22;
                    }
                    break;
                case TRIGGER:
                    {
                    alt6=24;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 17, input);

                    throw nvae;

                }

                }
                break;
            case DROP:
                {
                switch ( input.LA(2) ) {
                case TABLE:
                    {
                    alt6=18;
                    }
                    break;
                case VIEW:
                    {
                    alt6=21;
                    }
                    break;
                case INDEX:
                    {
                    alt6=23;
                    }
                    break;
                case TRIGGER:
                    {
                    alt6=25;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 18, input);

                    throw nvae;

                }

                }
                break;
            case ALTER:
                {
                alt6=19;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:149:5: pragma_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_pragma_stmt_in_sql_stmt_core286);
                    pragma_stmt13=pragma_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, pragma_stmt13.getTree());

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:150:5: attach_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_attach_stmt_in_sql_stmt_core292);
                    attach_stmt14=attach_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, attach_stmt14.getTree());

                    }
                    break;
                case 3 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:151:5: detach_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_detach_stmt_in_sql_stmt_core298);
                    detach_stmt15=detach_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, detach_stmt15.getTree());

                    }
                    break;
                case 4 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:152:5: analyze_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_analyze_stmt_in_sql_stmt_core304);
                    analyze_stmt16=analyze_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, analyze_stmt16.getTree());

                    }
                    break;
                case 5 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:153:5: reindex_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_reindex_stmt_in_sql_stmt_core310);
                    reindex_stmt17=reindex_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, reindex_stmt17.getTree());

                    }
                    break;
                case 6 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:154:5: vacuum_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_vacuum_stmt_in_sql_stmt_core316);
                    vacuum_stmt18=vacuum_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, vacuum_stmt18.getTree());

                    }
                    break;
                case 7 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:156:5: select_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_select_stmt_in_sql_stmt_core323);
                    select_stmt19=select_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, select_stmt19.getTree());

                    }
                    break;
                case 8 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:157:5: insert_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_insert_stmt_in_sql_stmt_core329);
                    insert_stmt20=insert_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, insert_stmt20.getTree());

                    }
                    break;
                case 9 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:158:5: update_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_update_stmt_in_sql_stmt_core335);
                    update_stmt21=update_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, update_stmt21.getTree());

                    }
                    break;
                case 10 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:159:5: delete_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_delete_stmt_in_sql_stmt_core341);
                    delete_stmt22=delete_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_stmt22.getTree());

                    }
                    break;
                case 11 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:160:5: begin_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_begin_stmt_in_sql_stmt_core347);
                    begin_stmt23=begin_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, begin_stmt23.getTree());

                    }
                    break;
                case 12 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:161:5: commit_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_commit_stmt_in_sql_stmt_core353);
                    commit_stmt24=commit_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, commit_stmt24.getTree());

                    }
                    break;
                case 13 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:162:5: rollback_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_rollback_stmt_in_sql_stmt_core359);
                    rollback_stmt25=rollback_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, rollback_stmt25.getTree());

                    }
                    break;
                case 14 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:163:5: savepoint_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_savepoint_stmt_in_sql_stmt_core365);
                    savepoint_stmt26=savepoint_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, savepoint_stmt26.getTree());

                    }
                    break;
                case 15 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:164:5: release_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_release_stmt_in_sql_stmt_core371);
                    release_stmt27=release_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, release_stmt27.getTree());

                    }
                    break;
                case 16 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:166:5: create_virtual_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_create_virtual_table_stmt_in_sql_stmt_core378);
                    create_virtual_table_stmt28=create_virtual_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_virtual_table_stmt28.getTree());

                    }
                    break;
                case 17 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:167:5: create_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_create_table_stmt_in_sql_stmt_core384);
                    create_table_stmt29=create_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_table_stmt29.getTree());

                    }
                    break;
                case 18 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:168:5: drop_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_drop_table_stmt_in_sql_stmt_core390);
                    drop_table_stmt30=drop_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_table_stmt30.getTree());

                    }
                    break;
                case 19 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:169:5: alter_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_alter_table_stmt_in_sql_stmt_core396);
                    alter_table_stmt31=alter_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, alter_table_stmt31.getTree());

                    }
                    break;
                case 20 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:170:5: create_view_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_create_view_stmt_in_sql_stmt_core402);
                    create_view_stmt32=create_view_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_view_stmt32.getTree());

                    }
                    break;
                case 21 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:171:5: drop_view_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_drop_view_stmt_in_sql_stmt_core408);
                    drop_view_stmt33=drop_view_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_view_stmt33.getTree());

                    }
                    break;
                case 22 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:172:5: create_index_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_create_index_stmt_in_sql_stmt_core414);
                    create_index_stmt34=create_index_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_index_stmt34.getTree());

                    }
                    break;
                case 23 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:173:5: drop_index_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_drop_index_stmt_in_sql_stmt_core420);
                    drop_index_stmt35=drop_index_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_index_stmt35.getTree());

                    }
                    break;
                case 24 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:174:5: create_trigger_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_create_trigger_stmt_in_sql_stmt_core426);
                    create_trigger_stmt36=create_trigger_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_trigger_stmt36.getTree());

                    }
                    break;
                case 25 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:175:5: drop_trigger_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_drop_trigger_stmt_in_sql_stmt_core432);
                    drop_trigger_stmt37=drop_trigger_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_trigger_stmt37.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sql_stmt_core"


    public static class schema_create_table_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "schema_create_table_stmt"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:178:1: schema_create_table_stmt : ( create_virtual_table_stmt | create_table_stmt );
    public final SqlParser.schema_create_table_stmt_return schema_create_table_stmt() throws RecognitionException {
        SqlParser.schema_create_table_stmt_return retval = new SqlParser.schema_create_table_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SqlParser.create_virtual_table_stmt_return create_virtual_table_stmt38 =null;

        SqlParser.create_table_stmt_return create_table_stmt39 =null;



        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:178:25: ( create_virtual_table_stmt | create_table_stmt )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==CREATE) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==VIRTUAL) ) {
                    alt7=1;
                }
                else if ( (LA7_1==TABLE||LA7_1==TEMPORARY) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:178:27: create_virtual_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_create_virtual_table_stmt_in_schema_create_table_stmt442);
                    create_virtual_table_stmt38=create_virtual_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_virtual_table_stmt38.getTree());

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:178:55: create_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_create_table_stmt_in_schema_create_table_stmt446);
                    create_table_stmt39=create_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_table_stmt39.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "schema_create_table_stmt"


    public static class qualified_table_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "qualified_table_name"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:180:1: qualified_table_name : (database_name= id DOT )? table_name= id ( INDEXED BY index_name= id | NOT INDEXED )? ;
    public final SqlParser.qualified_table_name_return qualified_table_name() throws RecognitionException {
        SqlParser.qualified_table_name_return retval = new SqlParser.qualified_table_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOT40=null;
        Token INDEXED41=null;
        Token BY42=null;
        Token NOT43=null;
        Token INDEXED44=null;
        SqlParser.id_return database_name =null;

        SqlParser.id_return table_name =null;

        SqlParser.id_return index_name =null;


        Object DOT40_tree=null;
        Object INDEXED41_tree=null;
        Object BY42_tree=null;
        Object NOT43_tree=null;
        Object INDEXED44_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:180:21: ( (database_name= id DOT )? table_name= id ( INDEXED BY index_name= id | NOT INDEXED )? )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:180:23: (database_name= id DOT )? table_name= id ( INDEXED BY index_name= id | NOT INDEXED )?
            {
            root_0 = (Object)adaptor.nil();


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:180:23: (database_name= id DOT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ID||LA8_0==STRING) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==DOT) ) {
                    alt8=1;
                }
            }
            else if ( ((LA8_0 >= ABORT && LA8_0 <= AFTER)||(LA8_0 >= ALL && LA8_0 <= ALTER)||(LA8_0 >= ANALYZE && LA8_0 <= AND)||(LA8_0 >= AS && LA8_0 <= ASC)||(LA8_0 >= ATTACH && LA8_0 <= AUTOINCREMENT)||(LA8_0 >= BEFORE && LA8_0 <= BETWEEN)||LA8_0==BY||(LA8_0 >= CASCADE && LA8_0 <= COLLATE)||LA8_0==COLUMN||(LA8_0 >= COMMIT && LA8_0 <= CONSTRAINT)||LA8_0==CREATE||(LA8_0 >= CROSS && LA8_0 <= CURRENT_TIMESTAMP)||(LA8_0 >= DATABASE && LA8_0 <= DISTINCT)||LA8_0==DROP||(LA8_0 >= EACH && LA8_0 <= END)||(LA8_0 >= ESCAPE && LA8_0 <= EXPLAIN)||LA8_0==FAIL||(LA8_0 >= FOR && LA8_0 <= FROM)||LA8_0==GROUP||LA8_0==HAVING||(LA8_0 >= IF && LA8_0 <= IMMEDIATE)||(LA8_0 >= INDEX && LA8_0 <= INSTEAD)||(LA8_0 >= INTERSECT && LA8_0 <= INTO)||LA8_0==IS||LA8_0==JOIN||LA8_0==KEY||LA8_0==LEFT||LA8_0==LIMIT||LA8_0==NATURAL||LA8_0==NULL||(LA8_0 >= OF && LA8_0 <= ON)||(LA8_0 >= OR && LA8_0 <= ORDER)||LA8_0==OUTER||LA8_0==PLAN||(LA8_0 >= PRAGMA && LA8_0 <= PRIMARY)||LA8_0==QUERY||(LA8_0 >= RAISE && LA8_0 <= REFERENCES)||(LA8_0 >= REINDEX && LA8_0 <= ROW)||(LA8_0 >= SAVEPOINT && LA8_0 <= SELECT)||LA8_0==SET||LA8_0==TABLE||(LA8_0 >= TEMPORARY && LA8_0 <= THEN)||(LA8_0 >= TO && LA8_0 <= TRIGGER)||(LA8_0 >= UNION && LA8_0 <= USING)||(LA8_0 >= VACUUM && LA8_0 <= VIRTUAL)||(LA8_0 >= WHEN && LA8_0 <= WHERE)) ) {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==DOT) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:180:24: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_qualified_table_name456);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());

                    DOT40=(Token)match(input,DOT,FOLLOW_DOT_in_qualified_table_name458); 
                    DOT40_tree = 
                    (Object)adaptor.create(DOT40)
                    ;
                    adaptor.addChild(root_0, DOT40_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_id_in_qualified_table_name464);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());

            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:180:61: ( INDEXED BY index_name= id | NOT INDEXED )?
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==INDEXED) ) {
                alt9=1;
            }
            else if ( (LA9_0==NOT) ) {
                alt9=2;
            }
            switch (alt9) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:180:62: INDEXED BY index_name= id
                    {
                    INDEXED41=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_qualified_table_name467); 
                    INDEXED41_tree = 
                    (Object)adaptor.create(INDEXED41)
                    ;
                    adaptor.addChild(root_0, INDEXED41_tree);


                    BY42=(Token)match(input,BY,FOLLOW_BY_in_qualified_table_name469); 
                    BY42_tree = 
                    (Object)adaptor.create(BY42)
                    ;
                    adaptor.addChild(root_0, BY42_tree);


                    pushFollow(FOLLOW_id_in_qualified_table_name473);
                    index_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, index_name.getTree());

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:180:89: NOT INDEXED
                    {
                    NOT43=(Token)match(input,NOT,FOLLOW_NOT_in_qualified_table_name477); 
                    NOT43_tree = 
                    (Object)adaptor.create(NOT43)
                    ;
                    adaptor.addChild(root_0, NOT43_tree);


                    INDEXED44=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_qualified_table_name479); 
                    INDEXED44_tree = 
                    (Object)adaptor.create(INDEXED44)
                    ;
                    adaptor.addChild(root_0, INDEXED44_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "qualified_table_name"


    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:182:1: expr : or_subexpr ( OR ^ or_subexpr )* ;
    public final SqlParser.expr_return expr() throws RecognitionException {
        SqlParser.expr_return retval = new SqlParser.expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OR46=null;
        SqlParser.or_subexpr_return or_subexpr45 =null;

        SqlParser.or_subexpr_return or_subexpr47 =null;


        Object OR46_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:182:5: ( or_subexpr ( OR ^ or_subexpr )* )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:182:7: or_subexpr ( OR ^ or_subexpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_or_subexpr_in_expr488);
            or_subexpr45=or_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, or_subexpr45.getTree());

            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:182:18: ( OR ^ or_subexpr )*
            loop10:
            do {
                int alt10=2;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:182:19: OR ^ or_subexpr
            	    {
            	    OR46=(Token)match(input,OR,FOLLOW_OR_in_expr491); 
            	    OR46_tree = 
            	    (Object)adaptor.create(OR46)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(OR46_tree, root_0);


            	    pushFollow(FOLLOW_or_subexpr_in_expr494);
            	    or_subexpr47=or_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, or_subexpr47.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class or_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "or_subexpr"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:184:1: or_subexpr : and_subexpr ( AND ^ and_subexpr )* ;
    public final SqlParser.or_subexpr_return or_subexpr() throws RecognitionException {
        SqlParser.or_subexpr_return retval = new SqlParser.or_subexpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AND49=null;
        SqlParser.and_subexpr_return and_subexpr48 =null;

        SqlParser.and_subexpr_return and_subexpr50 =null;


        Object AND49_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:184:11: ( and_subexpr ( AND ^ and_subexpr )* )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:184:13: and_subexpr ( AND ^ and_subexpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_and_subexpr_in_or_subexpr503);
            and_subexpr48=and_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, and_subexpr48.getTree());

            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:184:25: ( AND ^ and_subexpr )*
            loop11:
            do {
                int alt11=2;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:184:26: AND ^ and_subexpr
            	    {
            	    AND49=(Token)match(input,AND,FOLLOW_AND_in_or_subexpr506); 
            	    AND49_tree = 
            	    (Object)adaptor.create(AND49)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(AND49_tree, root_0);


            	    pushFollow(FOLLOW_and_subexpr_in_or_subexpr509);
            	    and_subexpr50=and_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, and_subexpr50.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "or_subexpr"


    public static class and_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "and_subexpr"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:186:1: and_subexpr : eq_subexpr ( cond_expr ^)? ;
    public final SqlParser.and_subexpr_return and_subexpr() throws RecognitionException {
        SqlParser.and_subexpr_return retval = new SqlParser.and_subexpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SqlParser.eq_subexpr_return eq_subexpr51 =null;

        SqlParser.cond_expr_return cond_expr52 =null;



        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:186:12: ( eq_subexpr ( cond_expr ^)? )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:186:14: eq_subexpr ( cond_expr ^)?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_eq_subexpr_in_and_subexpr518);
            eq_subexpr51=eq_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, eq_subexpr51.getTree());

            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:186:34: ( cond_expr ^)?
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:186:34: cond_expr ^
                    {
                    pushFollow(FOLLOW_cond_expr_in_and_subexpr520);
                    cond_expr52=cond_expr();

                    state._fsp--;

                    root_0 = (Object)adaptor.becomeRoot(cond_expr52.getTree(), root_0);

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "and_subexpr"


    public static class cond_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cond_expr"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:188:1: cond_expr : ( ( NOT )? match_op match_expr= eq_subexpr ( ESCAPE escape_expr= eq_subexpr )? -> ^( match_op $match_expr ( NOT )? ( ^( ESCAPE $escape_expr) )? ) | ( NOT )? IN LPAREN expr ( COMMA expr )* RPAREN -> ^( IN_VALUES ( NOT )? ^( IN ( expr )+ ) ) | ( NOT )? IN (database_name= id DOT )? table_name= id -> ^( IN_TABLE ( NOT )? ^( IN ^( $table_name ( $database_name)? ) ) ) | ( NOT )? IN ^ LPAREN ! ( select_stmt )? RPAREN !| ( NOT )? EQUALS ^ LPAREN ! ( select_stmt )? RPAREN !| ( ISNULL -> IS_NULL | NOTNULL -> NOT_NULL | IS NULL -> IS_NULL | NOT NULL -> NOT_NULL | IS NOT NULL -> NOT_NULL ) | IS NOT ^ eq_subexpr | ( NOT )? BETWEEN e1= eq_subexpr AND e2= eq_subexpr -> ^( BETWEEN ( NOT )? ^( AND $e1 $e2) ) | ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) ^ eq_subexpr )+ );
    public final SqlParser.cond_expr_return cond_expr() throws RecognitionException {
        SqlParser.cond_expr_return retval = new SqlParser.cond_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NOT53=null;
        Token ESCAPE55=null;
        Token NOT56=null;
        Token IN57=null;
        Token LPAREN58=null;
        Token COMMA60=null;
        Token RPAREN62=null;
        Token NOT63=null;
        Token IN64=null;
        Token DOT65=null;
        Token NOT66=null;
        Token IN67=null;
        Token LPAREN68=null;
        Token RPAREN70=null;
        Token NOT71=null;
        Token EQUALS72=null;
        Token LPAREN73=null;
        Token RPAREN75=null;
        Token ISNULL76=null;
        Token NOTNULL77=null;
        Token IS78=null;
        Token NULL79=null;
        Token NOT80=null;
        Token NULL81=null;
        Token IS82=null;
        Token NOT83=null;
        Token NULL84=null;
        Token IS85=null;
        Token NOT86=null;
        Token NOT88=null;
        Token BETWEEN89=null;
        Token AND90=null;
        Token set91=null;
        SqlParser.eq_subexpr_return match_expr =null;

        SqlParser.eq_subexpr_return escape_expr =null;

        SqlParser.id_return database_name =null;

        SqlParser.id_return table_name =null;

        SqlParser.eq_subexpr_return e1 =null;

        SqlParser.eq_subexpr_return e2 =null;

        SqlParser.match_op_return match_op54 =null;

        SqlParser.expr_return expr59 =null;

        SqlParser.expr_return expr61 =null;

        SqlParser.select_stmt_return select_stmt69 =null;

        SqlParser.select_stmt_return select_stmt74 =null;

        SqlParser.eq_subexpr_return eq_subexpr87 =null;

        SqlParser.eq_subexpr_return eq_subexpr92 =null;


        Object NOT53_tree=null;
        Object ESCAPE55_tree=null;
        Object NOT56_tree=null;
        Object IN57_tree=null;
        Object LPAREN58_tree=null;
        Object COMMA60_tree=null;
        Object RPAREN62_tree=null;
        Object NOT63_tree=null;
        Object IN64_tree=null;
        Object DOT65_tree=null;
        Object NOT66_tree=null;
        Object IN67_tree=null;
        Object LPAREN68_tree=null;
        Object RPAREN70_tree=null;
        Object NOT71_tree=null;
        Object EQUALS72_tree=null;
        Object LPAREN73_tree=null;
        Object RPAREN75_tree=null;
        Object ISNULL76_tree=null;
        Object NOTNULL77_tree=null;
        Object IS78_tree=null;
        Object NULL79_tree=null;
        Object NOT80_tree=null;
        Object NULL81_tree=null;
        Object IS82_tree=null;
        Object NOT83_tree=null;
        Object NULL84_tree=null;
        Object IS85_tree=null;
        Object NOT86_tree=null;
        Object NOT88_tree=null;
        Object BETWEEN89_tree=null;
        Object AND90_tree=null;
        Object set91_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_ESCAPE=new RewriteRuleTokenStream(adaptor,"token ESCAPE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
        RewriteRuleTokenStream stream_ISNULL=new RewriteRuleTokenStream(adaptor,"token ISNULL");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_NOTNULL=new RewriteRuleTokenStream(adaptor,"token NOTNULL");
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_BETWEEN=new RewriteRuleTokenStream(adaptor,"token BETWEEN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_match_op=new RewriteRuleSubtreeStream(adaptor,"rule match_op");
        RewriteRuleSubtreeStream stream_eq_subexpr=new RewriteRuleSubtreeStream(adaptor,"rule eq_subexpr");
        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:189:3: ( ( NOT )? match_op match_expr= eq_subexpr ( ESCAPE escape_expr= eq_subexpr )? -> ^( match_op $match_expr ( NOT )? ( ^( ESCAPE $escape_expr) )? ) | ( NOT )? IN LPAREN expr ( COMMA expr )* RPAREN -> ^( IN_VALUES ( NOT )? ^( IN ( expr )+ ) ) | ( NOT )? IN (database_name= id DOT )? table_name= id -> ^( IN_TABLE ( NOT )? ^( IN ^( $table_name ( $database_name)? ) ) ) | ( NOT )? IN ^ LPAREN ! ( select_stmt )? RPAREN !| ( NOT )? EQUALS ^ LPAREN ! ( select_stmt )? RPAREN !| ( ISNULL -> IS_NULL | NOTNULL -> NOT_NULL | IS NULL -> IS_NULL | NOT NULL -> NOT_NULL | IS NOT NULL -> NOT_NULL ) | IS NOT ^ eq_subexpr | ( NOT )? BETWEEN e1= eq_subexpr AND e2= eq_subexpr -> ^( BETWEEN ( NOT )? ^( AND $e1 $e2) ) | ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) ^ eq_subexpr )+ )
            int alt26=9;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:189:5: ( NOT )? match_op match_expr= eq_subexpr ( ESCAPE escape_expr= eq_subexpr )?
                    {
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:189:5: ( NOT )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==NOT) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:189:5: NOT
                            {
                            NOT53=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr532);  
                            stream_NOT.add(NOT53);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_match_op_in_cond_expr535);
                    match_op54=match_op();

                    state._fsp--;

                    stream_match_op.add(match_op54.getTree());

                    pushFollow(FOLLOW_eq_subexpr_in_cond_expr539);
                    match_expr=eq_subexpr();

                    state._fsp--;

                    stream_eq_subexpr.add(match_expr.getTree());

                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:189:41: ( ESCAPE escape_expr= eq_subexpr )?
                    int alt14=2;
                    alt14 = dfa14.predict(input);
                    switch (alt14) {
                        case 1 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:189:42: ESCAPE escape_expr= eq_subexpr
                            {
                            ESCAPE55=(Token)match(input,ESCAPE,FOLLOW_ESCAPE_in_cond_expr542);  
                            stream_ESCAPE.add(ESCAPE55);


                            pushFollow(FOLLOW_eq_subexpr_in_cond_expr546);
                            escape_expr=eq_subexpr();

                            state._fsp--;

                            stream_eq_subexpr.add(escape_expr.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: NOT, escape_expr, match_expr, ESCAPE, match_op
                    // token labels: 
                    // rule labels: retval, match_expr, escape_expr
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_match_expr=new RewriteRuleSubtreeStream(adaptor,"rule match_expr",match_expr!=null?match_expr.tree:null);
                    RewriteRuleSubtreeStream stream_escape_expr=new RewriteRuleSubtreeStream(adaptor,"rule escape_expr",escape_expr!=null?escape_expr.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 189:74: -> ^( match_op $match_expr ( NOT )? ( ^( ESCAPE $escape_expr) )? )
                    {
                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:189:77: ^( match_op $match_expr ( NOT )? ( ^( ESCAPE $escape_expr) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_match_op.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_match_expr.nextTree());

                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:189:100: ( NOT )?
                        if ( stream_NOT.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_NOT.nextNode()
                            );

                        }
                        stream_NOT.reset();

                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:189:105: ( ^( ESCAPE $escape_expr) )?
                        if ( stream_escape_expr.hasNext()||stream_ESCAPE.hasNext() ) {
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:189:105: ^( ESCAPE $escape_expr)
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot(
                            stream_ESCAPE.nextNode()
                            , root_2);

                            adaptor.addChild(root_2, stream_escape_expr.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_escape_expr.reset();
                        stream_ESCAPE.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:190:5: ( NOT )? IN LPAREN expr ( COMMA expr )* RPAREN
                    {
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:190:5: ( NOT )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==NOT) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:190:5: NOT
                            {
                            NOT56=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr574);  
                            stream_NOT.add(NOT56);


                            }
                            break;

                    }


                    IN57=(Token)match(input,IN,FOLLOW_IN_in_cond_expr577);  
                    stream_IN.add(IN57);


                    LPAREN58=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cond_expr579);  
                    stream_LPAREN.add(LPAREN58);


                    pushFollow(FOLLOW_expr_in_cond_expr581);
                    expr59=expr();

                    state._fsp--;

                    stream_expr.add(expr59.getTree());

                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:190:25: ( COMMA expr )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==COMMA) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:190:26: COMMA expr
                    	    {
                    	    COMMA60=(Token)match(input,COMMA,FOLLOW_COMMA_in_cond_expr584);  
                    	    stream_COMMA.add(COMMA60);


                    	    pushFollow(FOLLOW_expr_in_cond_expr586);
                    	    expr61=expr();

                    	    state._fsp--;

                    	    stream_expr.add(expr61.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    RPAREN62=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cond_expr590);  
                    stream_RPAREN.add(RPAREN62);


                    // AST REWRITE
                    // elements: expr, IN, NOT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 190:46: -> ^( IN_VALUES ( NOT )? ^( IN ( expr )+ ) )
                    {
                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:190:49: ^( IN_VALUES ( NOT )? ^( IN ( expr )+ ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(IN_VALUES, "IN_VALUES")
                        , root_1);

                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:190:61: ( NOT )?
                        if ( stream_NOT.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_NOT.nextNode()
                            );

                        }
                        stream_NOT.reset();

                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:190:66: ^( IN ( expr )+ )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        stream_IN.nextNode()
                        , root_2);

                        if ( !(stream_expr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_2, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:191:5: ( NOT )? IN (database_name= id DOT )? table_name= id
                    {
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:191:5: ( NOT )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==NOT) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:191:5: NOT
                            {
                            NOT63=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr612);  
                            stream_NOT.add(NOT63);


                            }
                            break;

                    }


                    IN64=(Token)match(input,IN,FOLLOW_IN_in_cond_expr615);  
                    stream_IN.add(IN64);


                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:191:13: (database_name= id DOT )?
                    int alt18=2;
                    alt18 = dfa18.predict(input);
                    switch (alt18) {
                        case 1 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:191:14: database_name= id DOT
                            {
                            pushFollow(FOLLOW_id_in_cond_expr620);
                            database_name=id();

                            state._fsp--;

                            stream_id.add(database_name.getTree());

                            DOT65=(Token)match(input,DOT,FOLLOW_DOT_in_cond_expr622);  
                            stream_DOT.add(DOT65);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_id_in_cond_expr628);
                    table_name=id();

                    state._fsp--;

                    stream_id.add(table_name.getTree());

                    // AST REWRITE
                    // elements: database_name, IN, NOT, table_name
                    // token labels: 
                    // rule labels: database_name, retval, table_name
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_table_name=new RewriteRuleSubtreeStream(adaptor,"rule table_name",table_name!=null?table_name.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 191:51: -> ^( IN_TABLE ( NOT )? ^( IN ^( $table_name ( $database_name)? ) ) )
                    {
                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:191:54: ^( IN_TABLE ( NOT )? ^( IN ^( $table_name ( $database_name)? ) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(IN_TABLE, "IN_TABLE")
                        , root_1);

                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:191:65: ( NOT )?
                        if ( stream_NOT.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_NOT.nextNode()
                            );

                        }
                        stream_NOT.reset();

                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:191:70: ^( IN ^( $table_name ( $database_name)? ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        stream_IN.nextNode()
                        , root_2);

                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:191:75: ^( $table_name ( $database_name)? )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_3);

                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:191:90: ( $database_name)?
                        if ( stream_database_name.hasNext() ) {
                            adaptor.addChild(root_3, stream_database_name.nextTree());

                        }
                        stream_database_name.reset();

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:192:5: ( NOT )? IN ^ LPAREN ! ( select_stmt )? RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:192:5: ( NOT )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==NOT) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:192:5: NOT
                            {
                            NOT66=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr656); 
                            NOT66_tree = 
                            (Object)adaptor.create(NOT66)
                            ;
                            adaptor.addChild(root_0, NOT66_tree);


                            }
                            break;

                    }


                    IN67=(Token)match(input,IN,FOLLOW_IN_in_cond_expr659); 
                    IN67_tree = 
                    (Object)adaptor.create(IN67)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(IN67_tree, root_0);


                    LPAREN68=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cond_expr662); 

                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:192:22: ( select_stmt )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==SELECT) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:192:22: select_stmt
                            {
                            pushFollow(FOLLOW_select_stmt_in_cond_expr665);
                            select_stmt69=select_stmt();

                            state._fsp--;

                            adaptor.addChild(root_0, select_stmt69.getTree());

                            }
                            break;

                    }


                    RPAREN70=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cond_expr668); 

                    }
                    break;
                case 5 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:193:5: ( NOT )? EQUALS ^ LPAREN ! ( select_stmt )? RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:193:5: ( NOT )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==NOT) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:193:5: NOT
                            {
                            NOT71=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr675); 
                            NOT71_tree = 
                            (Object)adaptor.create(NOT71)
                            ;
                            adaptor.addChild(root_0, NOT71_tree);


                            }
                            break;

                    }


                    EQUALS72=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_cond_expr678); 
                    EQUALS72_tree = 
                    (Object)adaptor.create(EQUALS72)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(EQUALS72_tree, root_0);


                    LPAREN73=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cond_expr681); 

                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:193:26: ( select_stmt )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==SELECT) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:193:26: select_stmt
                            {
                            pushFollow(FOLLOW_select_stmt_in_cond_expr684);
                            select_stmt74=select_stmt();

                            state._fsp--;

                            adaptor.addChild(root_0, select_stmt74.getTree());

                            }
                            break;

                    }


                    RPAREN75=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cond_expr687); 

                    }
                    break;
                case 6 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:194:5: ( ISNULL -> IS_NULL | NOTNULL -> NOT_NULL | IS NULL -> IS_NULL | NOT NULL -> NOT_NULL | IS NOT NULL -> NOT_NULL )
                    {
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:194:5: ( ISNULL -> IS_NULL | NOTNULL -> NOT_NULL | IS NULL -> IS_NULL | NOT NULL -> NOT_NULL | IS NOT NULL -> NOT_NULL )
                    int alt23=5;
                    switch ( input.LA(1) ) {
                    case ISNULL:
                        {
                        alt23=1;
                        }
                        break;
                    case NOTNULL:
                        {
                        alt23=2;
                        }
                        break;
                    case IS:
                        {
                        int LA23_3 = input.LA(2);

                        if ( (LA23_3==NULL) ) {
                            alt23=3;
                        }
                        else if ( (LA23_3==NOT) ) {
                            alt23=5;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 23, 3, input);

                            throw nvae;

                        }
                        }
                        break;
                    case NOT:
                        {
                        alt23=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;

                    }

                    switch (alt23) {
                        case 1 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:194:6: ISNULL
                            {
                            ISNULL76=(Token)match(input,ISNULL,FOLLOW_ISNULL_in_cond_expr695);  
                            stream_ISNULL.add(ISNULL76);


                            // AST REWRITE
                            // elements: 
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 194:13: -> IS_NULL
                            {
                                adaptor.addChild(root_0, 
                                (Object)adaptor.create(IS_NULL, "IS_NULL")
                                );

                            }


                            retval.tree = root_0;

                            }
                            break;
                        case 2 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:194:26: NOTNULL
                            {
                            NOTNULL77=(Token)match(input,NOTNULL,FOLLOW_NOTNULL_in_cond_expr703);  
                            stream_NOTNULL.add(NOTNULL77);


                            // AST REWRITE
                            // elements: 
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 194:34: -> NOT_NULL
                            {
                                adaptor.addChild(root_0, 
                                (Object)adaptor.create(NOT_NULL, "NOT_NULL")
                                );

                            }


                            retval.tree = root_0;

                            }
                            break;
                        case 3 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:194:48: IS NULL
                            {
                            IS78=(Token)match(input,IS,FOLLOW_IS_in_cond_expr711);  
                            stream_IS.add(IS78);


                            NULL79=(Token)match(input,NULL,FOLLOW_NULL_in_cond_expr713);  
                            stream_NULL.add(NULL79);


                            // AST REWRITE
                            // elements: 
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 194:56: -> IS_NULL
                            {
                                adaptor.addChild(root_0, 
                                (Object)adaptor.create(IS_NULL, "IS_NULL")
                                );

                            }


                            retval.tree = root_0;

                            }
                            break;
                        case 4 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:194:69: NOT NULL
                            {
                            NOT80=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr721);  
                            stream_NOT.add(NOT80);


                            NULL81=(Token)match(input,NULL,FOLLOW_NULL_in_cond_expr723);  
                            stream_NULL.add(NULL81);


                            // AST REWRITE
                            // elements: 
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 194:78: -> NOT_NULL
                            {
                                adaptor.addChild(root_0, 
                                (Object)adaptor.create(NOT_NULL, "NOT_NULL")
                                );

                            }


                            retval.tree = root_0;

                            }
                            break;
                        case 5 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:194:92: IS NOT NULL
                            {
                            IS82=(Token)match(input,IS,FOLLOW_IS_in_cond_expr731);  
                            stream_IS.add(IS82);


                            NOT83=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr733);  
                            stream_NOT.add(NOT83);


                            NULL84=(Token)match(input,NULL,FOLLOW_NULL_in_cond_expr735);  
                            stream_NULL.add(NULL84);


                            // AST REWRITE
                            // elements: 
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 194:104: -> NOT_NULL
                            {
                                adaptor.addChild(root_0, 
                                (Object)adaptor.create(NOT_NULL, "NOT_NULL")
                                );

                            }


                            retval.tree = root_0;

                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:195:5: IS NOT ^ eq_subexpr
                    {
                    root_0 = (Object)adaptor.nil();


                    IS85=(Token)match(input,IS,FOLLOW_IS_in_cond_expr746); 
                    IS85_tree = 
                    (Object)adaptor.create(IS85)
                    ;
                    adaptor.addChild(root_0, IS85_tree);


                    NOT86=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr748); 
                    NOT86_tree = 
                    (Object)adaptor.create(NOT86)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(NOT86_tree, root_0);


                    pushFollow(FOLLOW_eq_subexpr_in_cond_expr751);
                    eq_subexpr87=eq_subexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, eq_subexpr87.getTree());

                    }
                    break;
                case 8 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:196:5: ( NOT )? BETWEEN e1= eq_subexpr AND e2= eq_subexpr
                    {
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:196:5: ( NOT )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==NOT) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:196:5: NOT
                            {
                            NOT88=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr757);  
                            stream_NOT.add(NOT88);


                            }
                            break;

                    }


                    BETWEEN89=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_cond_expr760);  
                    stream_BETWEEN.add(BETWEEN89);


                    pushFollow(FOLLOW_eq_subexpr_in_cond_expr764);
                    e1=eq_subexpr();

                    state._fsp--;

                    stream_eq_subexpr.add(e1.getTree());

                    AND90=(Token)match(input,AND,FOLLOW_AND_in_cond_expr766);  
                    stream_AND.add(AND90);


                    pushFollow(FOLLOW_eq_subexpr_in_cond_expr770);
                    e2=eq_subexpr();

                    state._fsp--;

                    stream_eq_subexpr.add(e2.getTree());

                    // AST REWRITE
                    // elements: e1, e2, NOT, BETWEEN, AND
                    // token labels: 
                    // rule labels: retval, e1, e2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.tree:null);
                    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 196:50: -> ^( BETWEEN ( NOT )? ^( AND $e1 $e2) )
                    {
                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:196:53: ^( BETWEEN ( NOT )? ^( AND $e1 $e2) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_BETWEEN.nextNode()
                        , root_1);

                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:196:63: ( NOT )?
                        if ( stream_NOT.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_NOT.nextNode()
                            );

                        }
                        stream_NOT.reset();

                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:196:68: ^( AND $e1 $e2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        stream_AND.nextNode()
                        , root_2);

                        adaptor.addChild(root_2, stream_e1.nextTree());

                        adaptor.addChild(root_2, stream_e2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 9 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:197:5: ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) ^ eq_subexpr )+
                    {
                    root_0 = (Object)adaptor.nil();


                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:197:5: ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) ^ eq_subexpr )+
                    int cnt25=0;
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( ((LA25_0 >= EQUALS && LA25_0 <= EQUALS2)||(LA25_0 >= NOT_EQUALS && LA25_0 <= NOT_EQUALS2)) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:197:6: ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) ^ eq_subexpr
                    	    {
                    	    set91=(Token)input.LT(1);

                    	    set91=(Token)input.LT(1);

                    	    if ( (input.LA(1) >= EQUALS && input.LA(1) <= EQUALS2)||(input.LA(1) >= NOT_EQUALS && input.LA(1) <= NOT_EQUALS2) ) {
                    	        input.consume();
                    	        root_0 = (Object)adaptor.becomeRoot(
                    	        (Object)adaptor.create(set91)
                    	        , root_0);
                    	        state.errorRecovery=false;
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }


                    	    pushFollow(FOLLOW_eq_subexpr_in_cond_expr813);
                    	    eq_subexpr92=eq_subexpr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, eq_subexpr92.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt25 >= 1 ) break loop25;
                                EarlyExitException eee =
                                    new EarlyExitException(25, input);
                                throw eee;
                        }
                        cnt25++;
                    } while (true);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "cond_expr"


    public static class match_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "match_op"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:200:1: match_op : ( LIKE | GLOB | REGEXP | MATCH );
    public final SqlParser.match_op_return match_op() throws RecognitionException {
        SqlParser.match_op_return retval = new SqlParser.match_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set93=null;

        Object set93_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:200:9: ( LIKE | GLOB | REGEXP | MATCH )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            root_0 = (Object)adaptor.nil();


            set93=(Token)input.LT(1);

            if ( input.LA(1)==GLOB||input.LA(1)==LIKE||input.LA(1)==MATCH||input.LA(1)==REGEXP ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set93)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "match_op"


    public static class eq_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "eq_subexpr"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:202:1: eq_subexpr : neq_subexpr ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) ^ neq_subexpr )* ;
    public final SqlParser.eq_subexpr_return eq_subexpr() throws RecognitionException {
        SqlParser.eq_subexpr_return retval = new SqlParser.eq_subexpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set95=null;
        SqlParser.neq_subexpr_return neq_subexpr94 =null;

        SqlParser.neq_subexpr_return neq_subexpr96 =null;


        Object set95_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:202:11: ( neq_subexpr ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) ^ neq_subexpr )* )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:202:13: neq_subexpr ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) ^ neq_subexpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_neq_subexpr_in_eq_subexpr846);
            neq_subexpr94=neq_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, neq_subexpr94.getTree());

            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:202:25: ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) ^ neq_subexpr )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0 >= GREATER && LA27_0 <= GREATER_OR_EQ)||(LA27_0 >= LESS && LA27_0 <= LESS_OR_EQ)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:202:26: ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) ^ neq_subexpr
            	    {
            	    set95=(Token)input.LT(1);

            	    set95=(Token)input.LT(1);

            	    if ( (input.LA(1) >= GREATER && input.LA(1) <= GREATER_OR_EQ)||(input.LA(1) >= LESS && input.LA(1) <= LESS_OR_EQ) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set95)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_neq_subexpr_in_eq_subexpr866);
            	    neq_subexpr96=neq_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, neq_subexpr96.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "eq_subexpr"


    public static class neq_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "neq_subexpr"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:204:1: neq_subexpr : bit_subexpr ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) ^ bit_subexpr )* ;
    public final SqlParser.neq_subexpr_return neq_subexpr() throws RecognitionException {
        SqlParser.neq_subexpr_return retval = new SqlParser.neq_subexpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set98=null;
        SqlParser.bit_subexpr_return bit_subexpr97 =null;

        SqlParser.bit_subexpr_return bit_subexpr99 =null;


        Object set98_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:204:12: ( bit_subexpr ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) ^ bit_subexpr )* )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:204:14: bit_subexpr ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) ^ bit_subexpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_bit_subexpr_in_neq_subexpr875);
            bit_subexpr97=bit_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, bit_subexpr97.getTree());

            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:204:26: ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) ^ bit_subexpr )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==AMPERSAND||LA28_0==PIPE||(LA28_0 >= SHIFT_LEFT && LA28_0 <= SHIFT_RIGHT)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:204:27: ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) ^ bit_subexpr
            	    {
            	    set98=(Token)input.LT(1);

            	    set98=(Token)input.LT(1);

            	    if ( input.LA(1)==AMPERSAND||input.LA(1)==PIPE||(input.LA(1) >= SHIFT_LEFT && input.LA(1) <= SHIFT_RIGHT) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set98)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_bit_subexpr_in_neq_subexpr895);
            	    bit_subexpr99=bit_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bit_subexpr99.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "neq_subexpr"


    public static class bit_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bit_subexpr"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:206:1: bit_subexpr : add_subexpr ( ( PLUS | MINUS ) ^ add_subexpr )* ;
    public final SqlParser.bit_subexpr_return bit_subexpr() throws RecognitionException {
        SqlParser.bit_subexpr_return retval = new SqlParser.bit_subexpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set101=null;
        SqlParser.add_subexpr_return add_subexpr100 =null;

        SqlParser.add_subexpr_return add_subexpr102 =null;


        Object set101_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:206:12: ( add_subexpr ( ( PLUS | MINUS ) ^ add_subexpr )* )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:206:14: add_subexpr ( ( PLUS | MINUS ) ^ add_subexpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_add_subexpr_in_bit_subexpr904);
            add_subexpr100=add_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, add_subexpr100.getTree());

            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:206:26: ( ( PLUS | MINUS ) ^ add_subexpr )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==MINUS||LA29_0==PLUS) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:206:27: ( PLUS | MINUS ) ^ add_subexpr
            	    {
            	    set101=(Token)input.LT(1);

            	    set101=(Token)input.LT(1);

            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set101)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_add_subexpr_in_bit_subexpr916);
            	    add_subexpr102=add_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, add_subexpr102.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bit_subexpr"


    public static class add_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "add_subexpr"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:208:1: add_subexpr : mul_subexpr ( ( ASTERISK | SLASH | PERCENT ) ^ mul_subexpr )* ;
    public final SqlParser.add_subexpr_return add_subexpr() throws RecognitionException {
        SqlParser.add_subexpr_return retval = new SqlParser.add_subexpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set104=null;
        SqlParser.mul_subexpr_return mul_subexpr103 =null;

        SqlParser.mul_subexpr_return mul_subexpr105 =null;


        Object set104_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:208:12: ( mul_subexpr ( ( ASTERISK | SLASH | PERCENT ) ^ mul_subexpr )* )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:208:14: mul_subexpr ( ( ASTERISK | SLASH | PERCENT ) ^ mul_subexpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_mul_subexpr_in_add_subexpr925);
            mul_subexpr103=mul_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, mul_subexpr103.getTree());

            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:208:26: ( ( ASTERISK | SLASH | PERCENT ) ^ mul_subexpr )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==ASTERISK||LA30_0==PERCENT||LA30_0==SLASH) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:208:27: ( ASTERISK | SLASH | PERCENT ) ^ mul_subexpr
            	    {
            	    set104=(Token)input.LT(1);

            	    set104=(Token)input.LT(1);

            	    if ( input.LA(1)==ASTERISK||input.LA(1)==PERCENT||input.LA(1)==SLASH ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set104)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_mul_subexpr_in_add_subexpr941);
            	    mul_subexpr105=mul_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mul_subexpr105.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "add_subexpr"


    public static class mul_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mul_subexpr"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:210:1: mul_subexpr : con_subexpr ( DOUBLE_PIPE ^ con_subexpr )* ;
    public final SqlParser.mul_subexpr_return mul_subexpr() throws RecognitionException {
        SqlParser.mul_subexpr_return retval = new SqlParser.mul_subexpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOUBLE_PIPE107=null;
        SqlParser.con_subexpr_return con_subexpr106 =null;

        SqlParser.con_subexpr_return con_subexpr108 =null;


        Object DOUBLE_PIPE107_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:210:12: ( con_subexpr ( DOUBLE_PIPE ^ con_subexpr )* )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:210:14: con_subexpr ( DOUBLE_PIPE ^ con_subexpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_con_subexpr_in_mul_subexpr950);
            con_subexpr106=con_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, con_subexpr106.getTree());

            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:210:26: ( DOUBLE_PIPE ^ con_subexpr )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==DOUBLE_PIPE) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:210:27: DOUBLE_PIPE ^ con_subexpr
            	    {
            	    DOUBLE_PIPE107=(Token)match(input,DOUBLE_PIPE,FOLLOW_DOUBLE_PIPE_in_mul_subexpr953); 
            	    DOUBLE_PIPE107_tree = 
            	    (Object)adaptor.create(DOUBLE_PIPE107)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(DOUBLE_PIPE107_tree, root_0);


            	    pushFollow(FOLLOW_con_subexpr_in_mul_subexpr956);
            	    con_subexpr108=con_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, con_subexpr108.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "mul_subexpr"


    public static class con_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "con_subexpr"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:212:1: con_subexpr : ( unary_subexpr | unary_op unary_subexpr -> ^( unary_op unary_subexpr ) );
    public final SqlParser.con_subexpr_return con_subexpr() throws RecognitionException {
        SqlParser.con_subexpr_return retval = new SqlParser.con_subexpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SqlParser.unary_subexpr_return unary_subexpr109 =null;

        SqlParser.unary_op_return unary_op110 =null;

        SqlParser.unary_subexpr_return unary_subexpr111 =null;


        RewriteRuleSubtreeStream stream_unary_subexpr=new RewriteRuleSubtreeStream(adaptor,"rule unary_subexpr");
        RewriteRuleSubtreeStream stream_unary_op=new RewriteRuleSubtreeStream(adaptor,"rule unary_op");
        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:212:12: ( unary_subexpr | unary_op unary_subexpr -> ^( unary_op unary_subexpr ) )
            int alt32=2;
            switch ( input.LA(1) ) {
            case ABORT:
            case ADD:
            case AFTER:
            case ALL:
            case ALTER:
            case ANALYZE:
            case AND:
            case AS:
            case ASC:
            case AT:
            case ATTACH:
            case AUTOINCREMENT:
            case BEFORE:
            case BEGIN:
            case BETWEEN:
            case BLOB:
            case BY:
            case CASCADE:
            case CASE:
            case CAST:
            case CHECK:
            case COLLATE:
            case COLON:
            case COLUMN:
            case COMMIT:
            case CONFLICT:
            case CONSTRAINT:
            case CREATE:
            case CROSS:
            case CURRENT_DATE:
            case CURRENT_TIME:
            case CURRENT_TIMESTAMP:
            case DATABASE:
            case DEFAULT:
            case DEFERRABLE:
            case DEFERRED:
            case DELETE:
            case DESC:
            case DETACH:
            case DISTINCT:
            case DROP:
            case EACH:
            case ELSE:
            case END:
            case ESCAPE:
            case EXCEPT:
            case EXCLUSIVE:
            case EXISTS:
            case EXPLAIN:
            case FAIL:
            case FLOAT:
            case FOR:
            case FOREIGN:
            case FROM:
            case GROUP:
            case HAVING:
            case ID:
            case IF:
            case IGNORE:
            case IMMEDIATE:
            case INDEX:
            case INDEXED:
            case INITIALLY:
            case INNER:
            case INSERT:
            case INSTEAD:
            case INTEGER:
            case INTERSECT:
            case INTO:
            case IS:
            case JOIN:
            case KEY:
            case LEFT:
            case LIMIT:
            case LPAREN:
            case NATURAL:
            case NULL:
            case OF:
            case OFFSET:
            case ON:
            case OR:
            case ORDER:
            case OUTER:
            case PLAN:
            case PRAGMA:
            case PRIMARY:
            case QUERY:
            case QUESTION:
            case RAISE:
            case REFERENCES:
            case REINDEX:
            case RELEASE:
            case RENAME:
            case REPLACE:
            case RESTRICT:
            case ROLLBACK:
            case ROW:
            case SAVEPOINT:
            case SELECT:
            case SET:
            case STRING:
            case TABLE:
            case TEMPORARY:
            case THEN:
            case TO:
            case TRANSACTION:
            case TRIGGER:
            case UNION:
            case UNIQUE:
            case UPDATE:
            case USING:
            case VACUUM:
            case VALUES:
            case VIEW:
            case VIRTUAL:
            case WHEN:
            case WHERE:
                {
                alt32=1;
                }
                break;
            case NOT:
                {
                int LA32_16 = input.LA(2);

                if ( (LA32_16==EXISTS) ) {
                    int LA32_21 = input.LA(3);

                    if ( (LA32_21==LPAREN) ) {
                        int LA32_40 = input.LA(4);

                        if ( (LA32_40==SELECT) ) {
                            alt32=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 32, 40, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA32_21==DOT) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 21, input);

                        throw nvae;

                    }
                }
                else if ( ((LA32_16 >= ABORT && LA32_16 <= AFTER)||(LA32_16 >= ALL && LA32_16 <= ALTER)||(LA32_16 >= ANALYZE && LA32_16 <= AND)||(LA32_16 >= AS && LA32_16 <= ASC)||(LA32_16 >= AT && LA32_16 <= AUTOINCREMENT)||(LA32_16 >= BEFORE && LA32_16 <= BETWEEN)||LA32_16==BLOB||LA32_16==BY||(LA32_16 >= CASCADE && LA32_16 <= COLUMN)||(LA32_16 >= COMMIT && LA32_16 <= CONSTRAINT)||LA32_16==CREATE||(LA32_16 >= CROSS && LA32_16 <= CURRENT_TIMESTAMP)||(LA32_16 >= DATABASE && LA32_16 <= DISTINCT)||LA32_16==DROP||(LA32_16 >= EACH && LA32_16 <= END)||(LA32_16 >= ESCAPE && LA32_16 <= EXCLUSIVE)||LA32_16==EXPLAIN||(LA32_16 >= FAIL && LA32_16 <= FLOAT)||(LA32_16 >= FOR && LA32_16 <= FROM)||LA32_16==GROUP||LA32_16==HAVING||LA32_16==ID||(LA32_16 >= IF && LA32_16 <= IMMEDIATE)||(LA32_16 >= INDEX && LA32_16 <= INTEGER)||(LA32_16 >= INTERSECT && LA32_16 <= INTO)||LA32_16==IS||LA32_16==JOIN||LA32_16==KEY||LA32_16==LEFT||LA32_16==LIMIT||LA32_16==LPAREN||(LA32_16 >= NATURAL && LA32_16 <= NOT)||LA32_16==NULL||(LA32_16 >= OF && LA32_16 <= ON)||(LA32_16 >= OR && LA32_16 <= ORDER)||LA32_16==OUTER||LA32_16==PLAN||(LA32_16 >= PRAGMA && LA32_16 <= PRIMARY)||(LA32_16 >= QUERY && LA32_16 <= QUESTION)||(LA32_16 >= RAISE && LA32_16 <= REFERENCES)||(LA32_16 >= REINDEX && LA32_16 <= ROW)||(LA32_16 >= SAVEPOINT && LA32_16 <= SELECT)||LA32_16==SET||LA32_16==STRING||LA32_16==TABLE||(LA32_16 >= TEMPORARY && LA32_16 <= THEN)||(LA32_16 >= TO && LA32_16 <= TRIGGER)||(LA32_16 >= UNION && LA32_16 <= USING)||(LA32_16 >= VACUUM && LA32_16 <= VIRTUAL)||(LA32_16 >= WHEN && LA32_16 <= WHERE)) ) {
                    alt32=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 16, input);

                    throw nvae;

                }
                }
                break;
            case MINUS:
            case PLUS:
            case TILDA:
                {
                alt32=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }

            switch (alt32) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:212:14: unary_subexpr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_unary_subexpr_in_con_subexpr965);
                    unary_subexpr109=unary_subexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, unary_subexpr109.getTree());

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:212:30: unary_op unary_subexpr
                    {
                    pushFollow(FOLLOW_unary_op_in_con_subexpr969);
                    unary_op110=unary_op();

                    state._fsp--;

                    stream_unary_op.add(unary_op110.getTree());

                    pushFollow(FOLLOW_unary_subexpr_in_con_subexpr971);
                    unary_subexpr111=unary_subexpr();

                    state._fsp--;

                    stream_unary_subexpr.add(unary_subexpr111.getTree());

                    // AST REWRITE
                    // elements: unary_subexpr, unary_op
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 212:53: -> ^( unary_op unary_subexpr )
                    {
                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:212:56: ^( unary_op unary_subexpr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_unary_op.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_unary_subexpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "con_subexpr"


    public static class unary_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary_op"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:214:1: unary_op : ( PLUS | MINUS | TILDA | NOT );
    public final SqlParser.unary_op_return unary_op() throws RecognitionException {
        SqlParser.unary_op_return retval = new SqlParser.unary_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set112=null;

        Object set112_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:214:9: ( PLUS | MINUS | TILDA | NOT )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            root_0 = (Object)adaptor.nil();


            set112=(Token)input.LT(1);

            if ( input.LA(1)==MINUS||input.LA(1)==NOT||input.LA(1)==PLUS||input.LA(1)==TILDA ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set112)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unary_op"


    public static class unary_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary_subexpr"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:216:1: unary_subexpr : atom_expr ( COLLATE ^collation_name= ID )? ;
    public final SqlParser.unary_subexpr_return unary_subexpr() throws RecognitionException {
        SqlParser.unary_subexpr_return retval = new SqlParser.unary_subexpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token collation_name=null;
        Token COLLATE114=null;
        SqlParser.atom_expr_return atom_expr113 =null;


        Object collation_name_tree=null;
        Object COLLATE114_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:216:14: ( atom_expr ( COLLATE ^collation_name= ID )? )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:216:16: atom_expr ( COLLATE ^collation_name= ID )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_atom_expr_in_unary_subexpr1005);
            atom_expr113=atom_expr();

            state._fsp--;

            adaptor.addChild(root_0, atom_expr113.getTree());

            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:216:26: ( COLLATE ^collation_name= ID )?
            int alt33=2;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:216:27: COLLATE ^collation_name= ID
                    {
                    COLLATE114=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_unary_subexpr1008); 
                    COLLATE114_tree = 
                    (Object)adaptor.create(COLLATE114)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(COLLATE114_tree, root_0);


                    collation_name=(Token)match(input,ID,FOLLOW_ID_in_unary_subexpr1013); 
                    collation_name_tree = 
                    (Object)adaptor.create(collation_name)
                    ;
                    adaptor.addChild(root_0, collation_name_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unary_subexpr"


    public static class atom_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom_expr"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:218:1: atom_expr : ( literal_value | bind_parameter | ( (database_name= id DOT )? table_name= id DOT )? column_name= ID -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) ) |name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN -> ^( FUNCTION_EXPRESSION $name ( DISTINCT )? ( $args)* ( ASTERISK )? ) | LPAREN ! expr RPAREN !| CAST ^ LPAREN ! expr AS ! type_name RPAREN !| ( ( NOT )? EXISTS )? LPAREN select_stmt RPAREN | CASE (case_expr= expr )? ( when_expr )+ ( ELSE else_expr= expr )? END -> ^( CASE ( $case_expr)? ( when_expr )+ ( $else_expr)? ) | raise_function );
    public final SqlParser.atom_expr_return atom_expr() throws RecognitionException {
        SqlParser.atom_expr_return retval = new SqlParser.atom_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token column_name=null;
        Token name=null;
        Token DOT117=null;
        Token DOT118=null;
        Token LPAREN119=null;
        Token DISTINCT120=null;
        Token COMMA121=null;
        Token ASTERISK122=null;
        Token RPAREN123=null;
        Token LPAREN124=null;
        Token RPAREN126=null;
        Token CAST127=null;
        Token LPAREN128=null;
        Token AS130=null;
        Token RPAREN132=null;
        Token NOT133=null;
        Token EXISTS134=null;
        Token LPAREN135=null;
        Token RPAREN137=null;
        Token CASE138=null;
        Token ELSE140=null;
        Token END141=null;
        List list_args=null;
        SqlParser.id_return database_name =null;

        SqlParser.id_return table_name =null;

        SqlParser.expr_return case_expr =null;

        SqlParser.expr_return else_expr =null;

        SqlParser.literal_value_return literal_value115 =null;

        SqlParser.bind_parameter_return bind_parameter116 =null;

        SqlParser.expr_return expr125 =null;

        SqlParser.expr_return expr129 =null;

        SqlParser.type_name_return type_name131 =null;

        SqlParser.select_stmt_return select_stmt136 =null;

        SqlParser.when_expr_return when_expr139 =null;

        SqlParser.raise_function_return raise_function142 =null;

        RuleReturnScope args = null;
        Object column_name_tree=null;
        Object name_tree=null;
        Object DOT117_tree=null;
        Object DOT118_tree=null;
        Object LPAREN119_tree=null;
        Object DISTINCT120_tree=null;
        Object COMMA121_tree=null;
        Object ASTERISK122_tree=null;
        Object RPAREN123_tree=null;
        Object LPAREN124_tree=null;
        Object RPAREN126_tree=null;
        Object CAST127_tree=null;
        Object LPAREN128_tree=null;
        Object AS130_tree=null;
        Object RPAREN132_tree=null;
        Object NOT133_tree=null;
        Object EXISTS134_tree=null;
        Object LPAREN135_tree=null;
        Object RPAREN137_tree=null;
        Object CASE138_tree=null;
        Object ELSE140_tree=null;
        Object END141_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_DISTINCT=new RewriteRuleTokenStream(adaptor,"token DISTINCT");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_ASTERISK=new RewriteRuleTokenStream(adaptor,"token ASTERISK");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_CASE=new RewriteRuleTokenStream(adaptor,"token CASE");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_when_expr=new RewriteRuleSubtreeStream(adaptor,"rule when_expr");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:219:3: ( literal_value | bind_parameter | ( (database_name= id DOT )? table_name= id DOT )? column_name= ID -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) ) |name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN -> ^( FUNCTION_EXPRESSION $name ( DISTINCT )? ( $args)* ( ASTERISK )? ) | LPAREN ! expr RPAREN !| CAST ^ LPAREN ! expr AS ! type_name RPAREN !| ( ( NOT )? EXISTS )? LPAREN select_stmt RPAREN | CASE (case_expr= expr )? ( when_expr )+ ( ELSE else_expr= expr )? END -> ^( CASE ( $case_expr)? ( when_expr )+ ( $else_expr)? ) | raise_function )
            int alt44=9;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:219:5: literal_value
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_literal_value_in_atom_expr1025);
                    literal_value115=literal_value();

                    state._fsp--;

                    adaptor.addChild(root_0, literal_value115.getTree());

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:220:5: bind_parameter
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_bind_parameter_in_atom_expr1031);
                    bind_parameter116=bind_parameter();

                    state._fsp--;

                    adaptor.addChild(root_0, bind_parameter116.getTree());

                    }
                    break;
                case 3 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:221:5: ( (database_name= id DOT )? table_name= id DOT )? column_name= ID
                    {
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:221:5: ( (database_name= id DOT )? table_name= id DOT )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==ID) ) {
                        int LA35_1 = input.LA(2);

                        if ( (LA35_1==DOT) ) {
                            alt35=1;
                        }
                    }
                    else if ( ((LA35_0 >= ABORT && LA35_0 <= AFTER)||(LA35_0 >= ALL && LA35_0 <= ALTER)||(LA35_0 >= ANALYZE && LA35_0 <= AND)||(LA35_0 >= AS && LA35_0 <= ASC)||(LA35_0 >= ATTACH && LA35_0 <= AUTOINCREMENT)||(LA35_0 >= BEFORE && LA35_0 <= BETWEEN)||LA35_0==BY||(LA35_0 >= CASCADE && LA35_0 <= COLLATE)||LA35_0==COLUMN||(LA35_0 >= COMMIT && LA35_0 <= CONSTRAINT)||LA35_0==CREATE||(LA35_0 >= CROSS && LA35_0 <= CURRENT_TIMESTAMP)||(LA35_0 >= DATABASE && LA35_0 <= DISTINCT)||LA35_0==DROP||(LA35_0 >= EACH && LA35_0 <= END)||(LA35_0 >= ESCAPE && LA35_0 <= EXPLAIN)||LA35_0==FAIL||(LA35_0 >= FOR && LA35_0 <= FROM)||LA35_0==GROUP||LA35_0==HAVING||(LA35_0 >= IF && LA35_0 <= IMMEDIATE)||(LA35_0 >= INDEX && LA35_0 <= INSTEAD)||(LA35_0 >= INTERSECT && LA35_0 <= INTO)||LA35_0==IS||LA35_0==JOIN||LA35_0==KEY||LA35_0==LEFT||LA35_0==LIMIT||LA35_0==NATURAL||LA35_0==NULL||(LA35_0 >= OF && LA35_0 <= ON)||(LA35_0 >= OR && LA35_0 <= ORDER)||LA35_0==OUTER||LA35_0==PLAN||(LA35_0 >= PRAGMA && LA35_0 <= PRIMARY)||LA35_0==QUERY||(LA35_0 >= RAISE && LA35_0 <= REFERENCES)||(LA35_0 >= REINDEX && LA35_0 <= ROW)||(LA35_0 >= SAVEPOINT && LA35_0 <= SELECT)||LA35_0==SET||LA35_0==STRING||LA35_0==TABLE||(LA35_0 >= TEMPORARY && LA35_0 <= THEN)||(LA35_0 >= TO && LA35_0 <= TRIGGER)||(LA35_0 >= UNION && LA35_0 <= USING)||(LA35_0 >= VACUUM && LA35_0 <= VIRTUAL)||(LA35_0 >= WHEN && LA35_0 <= WHERE)) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:221:6: (database_name= id DOT )? table_name= id DOT
                            {
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:221:6: (database_name= id DOT )?
                            int alt34=2;
                            alt34 = dfa34.predict(input);
                            switch (alt34) {
                                case 1 :
                                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:221:7: database_name= id DOT
                                    {
                                    pushFollow(FOLLOW_id_in_atom_expr1041);
                                    database_name=id();

                                    state._fsp--;

                                    stream_id.add(database_name.getTree());

                                    DOT117=(Token)match(input,DOT,FOLLOW_DOT_in_atom_expr1043);  
                                    stream_DOT.add(DOT117);


                                    }
                                    break;

                            }


                            pushFollow(FOLLOW_id_in_atom_expr1049);
                            table_name=id();

                            state._fsp--;

                            stream_id.add(table_name.getTree());

                            DOT118=(Token)match(input,DOT,FOLLOW_DOT_in_atom_expr1051);  
                            stream_DOT.add(DOT118);


                            }
                            break;

                    }


                    column_name=(Token)match(input,ID,FOLLOW_ID_in_atom_expr1057);  
                    stream_ID.add(column_name);


                    // AST REWRITE
                    // elements: column_name, database_name, table_name
                    // token labels: column_name
                    // rule labels: database_name, retval, table_name
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_column_name=new RewriteRuleTokenStream(adaptor,"token column_name",column_name);
                    RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_table_name=new RewriteRuleSubtreeStream(adaptor,"rule table_name",table_name!=null?table_name.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 221:65: -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) )
                    {
                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:221:68: ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(COLUMN_EXPRESSION, "COLUMN_EXPRESSION")
                        , root_1);

                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:221:88: ^( $column_name ( ^( $table_name ( $database_name)? ) )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_column_name.nextNode(), root_2);

                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:221:103: ( ^( $table_name ( $database_name)? ) )?
                        if ( stream_database_name.hasNext()||stream_table_name.hasNext() ) {
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:221:103: ^( $table_name ( $database_name)? )
                            {
                            Object root_3 = (Object)adaptor.nil();
                            root_3 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_3);

                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:221:118: ( $database_name)?
                            if ( stream_database_name.hasNext() ) {
                                adaptor.addChild(root_3, stream_database_name.nextTree());

                            }
                            stream_database_name.reset();

                            adaptor.addChild(root_2, root_3);
                            }

                        }
                        stream_database_name.reset();
                        stream_table_name.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:222:5: name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN
                    {
                    name=(Token)match(input,ID,FOLLOW_ID_in_atom_expr1086);  
                    stream_ID.add(name);


                    LPAREN119=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr1088);  
                    stream_LPAREN.add(LPAREN119);


                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:222:20: ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )?
                    int alt38=3;
                    int LA38_0 = input.LA(1);

                    if ( ((LA38_0 >= ABORT && LA38_0 <= AFTER)||(LA38_0 >= ALL && LA38_0 <= ALTER)||(LA38_0 >= ANALYZE && LA38_0 <= AND)||(LA38_0 >= AS && LA38_0 <= ASC)||(LA38_0 >= AT && LA38_0 <= AUTOINCREMENT)||(LA38_0 >= BEFORE && LA38_0 <= BETWEEN)||LA38_0==BLOB||LA38_0==BY||(LA38_0 >= CASCADE && LA38_0 <= COLUMN)||(LA38_0 >= COMMIT && LA38_0 <= CONSTRAINT)||LA38_0==CREATE||(LA38_0 >= CROSS && LA38_0 <= CURRENT_TIMESTAMP)||(LA38_0 >= DATABASE && LA38_0 <= DISTINCT)||LA38_0==DROP||(LA38_0 >= EACH && LA38_0 <= END)||(LA38_0 >= ESCAPE && LA38_0 <= EXPLAIN)||(LA38_0 >= FAIL && LA38_0 <= FLOAT)||(LA38_0 >= FOR && LA38_0 <= FROM)||LA38_0==GROUP||LA38_0==HAVING||LA38_0==ID||(LA38_0 >= IF && LA38_0 <= IMMEDIATE)||(LA38_0 >= INDEX && LA38_0 <= INTEGER)||(LA38_0 >= INTERSECT && LA38_0 <= INTO)||LA38_0==IS||LA38_0==JOIN||LA38_0==KEY||LA38_0==LEFT||LA38_0==LIMIT||LA38_0==LPAREN||LA38_0==MINUS||(LA38_0 >= NATURAL && LA38_0 <= NOT)||LA38_0==NULL||(LA38_0 >= OF && LA38_0 <= ON)||(LA38_0 >= OR && LA38_0 <= ORDER)||LA38_0==OUTER||(LA38_0 >= PLAN && LA38_0 <= PRIMARY)||(LA38_0 >= QUERY && LA38_0 <= QUESTION)||(LA38_0 >= RAISE && LA38_0 <= REFERENCES)||(LA38_0 >= REINDEX && LA38_0 <= ROW)||(LA38_0 >= SAVEPOINT && LA38_0 <= SELECT)||LA38_0==SET||LA38_0==STRING||LA38_0==TABLE||(LA38_0 >= TEMPORARY && LA38_0 <= TRIGGER)||(LA38_0 >= UNION && LA38_0 <= USING)||(LA38_0 >= VACUUM && LA38_0 <= VIRTUAL)||(LA38_0 >= WHEN && LA38_0 <= WHERE)) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==ASTERISK) ) {
                        alt38=2;
                    }
                    switch (alt38) {
                        case 1 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:222:21: ( DISTINCT )? args+= expr ( COMMA args+= expr )*
                            {
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:222:21: ( DISTINCT )?
                            int alt36=2;
                            int LA36_0 = input.LA(1);

                            if ( (LA36_0==DISTINCT) ) {
                                int LA36_1 = input.LA(2);

                                if ( ((LA36_1 >= ABORT && LA36_1 <= AFTER)||(LA36_1 >= ALL && LA36_1 <= ALTER)||(LA36_1 >= ANALYZE && LA36_1 <= AND)||(LA36_1 >= AS && LA36_1 <= ASC)||(LA36_1 >= AT && LA36_1 <= AUTOINCREMENT)||(LA36_1 >= BEFORE && LA36_1 <= BETWEEN)||LA36_1==BLOB||LA36_1==BY||(LA36_1 >= CASCADE && LA36_1 <= COLUMN)||(LA36_1 >= COMMIT && LA36_1 <= CONSTRAINT)||LA36_1==CREATE||(LA36_1 >= CROSS && LA36_1 <= CURRENT_TIMESTAMP)||(LA36_1 >= DATABASE && LA36_1 <= DISTINCT)||LA36_1==DROP||(LA36_1 >= EACH && LA36_1 <= END)||(LA36_1 >= ESCAPE && LA36_1 <= EXPLAIN)||(LA36_1 >= FAIL && LA36_1 <= FLOAT)||(LA36_1 >= FOR && LA36_1 <= FROM)||LA36_1==GROUP||LA36_1==HAVING||LA36_1==ID||(LA36_1 >= IF && LA36_1 <= IMMEDIATE)||(LA36_1 >= INDEX && LA36_1 <= INTEGER)||(LA36_1 >= INTERSECT && LA36_1 <= INTO)||LA36_1==IS||LA36_1==JOIN||LA36_1==KEY||LA36_1==LEFT||LA36_1==LIMIT||LA36_1==LPAREN||LA36_1==MINUS||(LA36_1 >= NATURAL && LA36_1 <= NOT)||LA36_1==NULL||(LA36_1 >= OF && LA36_1 <= ON)||(LA36_1 >= OR && LA36_1 <= ORDER)||LA36_1==OUTER||(LA36_1 >= PLAN && LA36_1 <= PRIMARY)||(LA36_1 >= QUERY && LA36_1 <= QUESTION)||(LA36_1 >= RAISE && LA36_1 <= REFERENCES)||(LA36_1 >= REINDEX && LA36_1 <= ROW)||(LA36_1 >= SAVEPOINT && LA36_1 <= SELECT)||LA36_1==SET||LA36_1==STRING||LA36_1==TABLE||(LA36_1 >= TEMPORARY && LA36_1 <= TRIGGER)||(LA36_1 >= UNION && LA36_1 <= USING)||(LA36_1 >= VACUUM && LA36_1 <= VIRTUAL)||(LA36_1 >= WHEN && LA36_1 <= WHERE)) ) {
                                    alt36=1;
                                }
                            }
                            switch (alt36) {
                                case 1 :
                                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:222:21: DISTINCT
                                    {
                                    DISTINCT120=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_atom_expr1091);  
                                    stream_DISTINCT.add(DISTINCT120);


                                    }
                                    break;

                            }


                            pushFollow(FOLLOW_expr_in_atom_expr1096);
                            args=expr();

                            state._fsp--;

                            stream_expr.add(args.getTree());
                            if (list_args==null) list_args=new ArrayList();
                            list_args.add(args.getTree());


                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:222:42: ( COMMA args+= expr )*
                            loop37:
                            do {
                                int alt37=2;
                                int LA37_0 = input.LA(1);

                                if ( (LA37_0==COMMA) ) {
                                    alt37=1;
                                }


                                switch (alt37) {
                            	case 1 :
                            	    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:222:43: COMMA args+= expr
                            	    {
                            	    COMMA121=(Token)match(input,COMMA,FOLLOW_COMMA_in_atom_expr1099);  
                            	    stream_COMMA.add(COMMA121);


                            	    pushFollow(FOLLOW_expr_in_atom_expr1103);
                            	    args=expr();

                            	    state._fsp--;

                            	    stream_expr.add(args.getTree());
                            	    if (list_args==null) list_args=new ArrayList();
                            	    list_args.add(args.getTree());


                            	    }
                            	    break;

                            	default :
                            	    break loop37;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:222:64: ASTERISK
                            {
                            ASTERISK122=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_atom_expr1109);  
                            stream_ASTERISK.add(ASTERISK122);


                            }
                            break;

                    }


                    RPAREN123=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr1113);  
                    stream_RPAREN.add(RPAREN123);


                    // AST REWRITE
                    // elements: name, ASTERISK, args, DISTINCT
                    // token labels: name
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: args
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"token args",list_args);
                    root_0 = (Object)adaptor.nil();
                    // 222:82: -> ^( FUNCTION_EXPRESSION $name ( DISTINCT )? ( $args)* ( ASTERISK )? )
                    {
                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:222:85: ^( FUNCTION_EXPRESSION $name ( DISTINCT )? ( $args)* ( ASTERISK )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FUNCTION_EXPRESSION, "FUNCTION_EXPRESSION")
                        , root_1);

                        adaptor.addChild(root_1, stream_name.nextNode());

                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:222:113: ( DISTINCT )?
                        if ( stream_DISTINCT.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_DISTINCT.nextNode()
                            );

                        }
                        stream_DISTINCT.reset();

                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:222:124: ( $args)*
                        while ( stream_args.hasNext() ) {
                            adaptor.addChild(root_1, stream_args.nextTree());

                        }
                        stream_args.reset();

                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:222:130: ( ASTERISK )?
                        if ( stream_ASTERISK.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_ASTERISK.nextNode()
                            );

                        }
                        stream_ASTERISK.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:223:5: LPAREN ! expr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    LPAREN124=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr1138); 

                    pushFollow(FOLLOW_expr_in_atom_expr1141);
                    expr125=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr125.getTree());

                    RPAREN126=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr1143); 

                    }
                    break;
                case 6 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:224:5: CAST ^ LPAREN ! expr AS ! type_name RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    CAST127=(Token)match(input,CAST,FOLLOW_CAST_in_atom_expr1150); 
                    CAST127_tree = 
                    (Object)adaptor.create(CAST127)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CAST127_tree, root_0);


                    LPAREN128=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr1153); 

                    pushFollow(FOLLOW_expr_in_atom_expr1156);
                    expr129=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr129.getTree());

                    AS130=(Token)match(input,AS,FOLLOW_AS_in_atom_expr1158); 

                    pushFollow(FOLLOW_type_name_in_atom_expr1161);
                    type_name131=type_name();

                    state._fsp--;

                    adaptor.addChild(root_0, type_name131.getTree());

                    RPAREN132=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr1163); 

                    }
                    break;
                case 7 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:225:5: ( ( NOT )? EXISTS )? LPAREN select_stmt RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:225:5: ( ( NOT )? EXISTS )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==EXISTS||LA40_0==NOT) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:225:6: ( NOT )? EXISTS
                            {
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:225:6: ( NOT )?
                            int alt39=2;
                            int LA39_0 = input.LA(1);

                            if ( (LA39_0==NOT) ) {
                                alt39=1;
                            }
                            switch (alt39) {
                                case 1 :
                                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:225:7: NOT
                                    {
                                    NOT133=(Token)match(input,NOT,FOLLOW_NOT_in_atom_expr1172); 
                                    NOT133_tree = 
                                    (Object)adaptor.create(NOT133)
                                    ;
                                    adaptor.addChild(root_0, NOT133_tree);


                                    }
                                    break;

                            }


                            EXISTS134=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_atom_expr1176); 
                            EXISTS134_tree = 
                            (Object)adaptor.create(EXISTS134)
                            ;
                            adaptor.addChild(root_0, EXISTS134_tree);


                            }
                            break;

                    }


                    LPAREN135=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr1180); 
                    LPAREN135_tree = 
                    (Object)adaptor.create(LPAREN135)
                    ;
                    adaptor.addChild(root_0, LPAREN135_tree);


                    pushFollow(FOLLOW_select_stmt_in_atom_expr1182);
                    select_stmt136=select_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, select_stmt136.getTree());

                    RPAREN137=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr1184); 
                    RPAREN137_tree = 
                    (Object)adaptor.create(RPAREN137)
                    ;
                    adaptor.addChild(root_0, RPAREN137_tree);


                    }
                    break;
                case 8 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:226:5: CASE (case_expr= expr )? ( when_expr )+ ( ELSE else_expr= expr )? END
                    {
                    CASE138=(Token)match(input,CASE,FOLLOW_CASE_in_atom_expr1190);  
                    stream_CASE.add(CASE138);


                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:226:10: (case_expr= expr )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( ((LA41_0 >= ABORT && LA41_0 <= AFTER)||(LA41_0 >= ALL && LA41_0 <= ALTER)||(LA41_0 >= ANALYZE && LA41_0 <= AND)||(LA41_0 >= AS && LA41_0 <= ASC)||(LA41_0 >= AT && LA41_0 <= AUTOINCREMENT)||(LA41_0 >= BEFORE && LA41_0 <= BETWEEN)||LA41_0==BLOB||LA41_0==BY||(LA41_0 >= CASCADE && LA41_0 <= COLUMN)||(LA41_0 >= COMMIT && LA41_0 <= CONSTRAINT)||LA41_0==CREATE||(LA41_0 >= CROSS && LA41_0 <= CURRENT_TIMESTAMP)||(LA41_0 >= DATABASE && LA41_0 <= DISTINCT)||LA41_0==DROP||(LA41_0 >= EACH && LA41_0 <= END)||(LA41_0 >= ESCAPE && LA41_0 <= EXPLAIN)||(LA41_0 >= FAIL && LA41_0 <= FLOAT)||(LA41_0 >= FOR && LA41_0 <= FROM)||LA41_0==GROUP||LA41_0==HAVING||LA41_0==ID||(LA41_0 >= IF && LA41_0 <= IMMEDIATE)||(LA41_0 >= INDEX && LA41_0 <= INTEGER)||(LA41_0 >= INTERSECT && LA41_0 <= INTO)||LA41_0==IS||LA41_0==JOIN||LA41_0==KEY||LA41_0==LEFT||LA41_0==LIMIT||LA41_0==LPAREN||LA41_0==MINUS||(LA41_0 >= NATURAL && LA41_0 <= NOT)||LA41_0==NULL||(LA41_0 >= OF && LA41_0 <= ON)||(LA41_0 >= OR && LA41_0 <= ORDER)||LA41_0==OUTER||(LA41_0 >= PLAN && LA41_0 <= PRIMARY)||(LA41_0 >= QUERY && LA41_0 <= QUESTION)||(LA41_0 >= RAISE && LA41_0 <= REFERENCES)||(LA41_0 >= REINDEX && LA41_0 <= ROW)||(LA41_0 >= SAVEPOINT && LA41_0 <= SELECT)||LA41_0==SET||LA41_0==STRING||LA41_0==TABLE||(LA41_0 >= TEMPORARY && LA41_0 <= TRIGGER)||(LA41_0 >= UNION && LA41_0 <= USING)||(LA41_0 >= VACUUM && LA41_0 <= VIRTUAL)||LA41_0==WHERE) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==WHEN) ) {
                        int LA41_19 = input.LA(2);

                        if ( (LA41_19==DOT) ) {
                            alt41=1;
                        }
                    }
                    switch (alt41) {
                        case 1 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:226:11: case_expr= expr
                            {
                            pushFollow(FOLLOW_expr_in_atom_expr1195);
                            case_expr=expr();

                            state._fsp--;

                            stream_expr.add(case_expr.getTree());

                            }
                            break;

                    }


                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:226:28: ( when_expr )+
                    int cnt42=0;
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==WHEN) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:226:28: when_expr
                    	    {
                    	    pushFollow(FOLLOW_when_expr_in_atom_expr1199);
                    	    when_expr139=when_expr();

                    	    state._fsp--;

                    	    stream_when_expr.add(when_expr139.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt42 >= 1 ) break loop42;
                                EarlyExitException eee =
                                    new EarlyExitException(42, input);
                                throw eee;
                        }
                        cnt42++;
                    } while (true);


                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:226:39: ( ELSE else_expr= expr )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==ELSE) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:226:40: ELSE else_expr= expr
                            {
                            ELSE140=(Token)match(input,ELSE,FOLLOW_ELSE_in_atom_expr1203);  
                            stream_ELSE.add(ELSE140);


                            pushFollow(FOLLOW_expr_in_atom_expr1207);
                            else_expr=expr();

                            state._fsp--;

                            stream_expr.add(else_expr.getTree());

                            }
                            break;

                    }


                    END141=(Token)match(input,END,FOLLOW_END_in_atom_expr1211);  
                    stream_END.add(END141);


                    // AST REWRITE
                    // elements: when_expr, else_expr, CASE, case_expr
                    // token labels: 
                    // rule labels: retval, case_expr, else_expr
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_case_expr=new RewriteRuleSubtreeStream(adaptor,"rule case_expr",case_expr!=null?case_expr.tree:null);
                    RewriteRuleSubtreeStream stream_else_expr=new RewriteRuleSubtreeStream(adaptor,"rule else_expr",else_expr!=null?else_expr.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 226:66: -> ^( CASE ( $case_expr)? ( when_expr )+ ( $else_expr)? )
                    {
                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:226:69: ^( CASE ( $case_expr)? ( when_expr )+ ( $else_expr)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_CASE.nextNode()
                        , root_1);

                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:226:77: ( $case_expr)?
                        if ( stream_case_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_case_expr.nextTree());

                        }
                        stream_case_expr.reset();

                        if ( !(stream_when_expr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_when_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_when_expr.nextTree());

                        }
                        stream_when_expr.reset();

                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:226:100: ( $else_expr)?
                        if ( stream_else_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_else_expr.nextTree());

                        }
                        stream_else_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 9 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:227:5: raise_function
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_raise_function_in_atom_expr1234);
                    raise_function142=raise_function();

                    state._fsp--;

                    adaptor.addChild(root_0, raise_function142.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom_expr"


    public static class when_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "when_expr"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:230:1: when_expr : WHEN e1= expr THEN e2= expr -> ^( WHEN $e1 $e2) ;
    public final SqlParser.when_expr_return when_expr() throws RecognitionException {
        SqlParser.when_expr_return retval = new SqlParser.when_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WHEN143=null;
        Token THEN144=null;
        SqlParser.expr_return e1 =null;

        SqlParser.expr_return e2 =null;


        Object WHEN143_tree=null;
        Object THEN144_tree=null;
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleTokenStream stream_WHEN=new RewriteRuleTokenStream(adaptor,"token WHEN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:230:10: ( WHEN e1= expr THEN e2= expr -> ^( WHEN $e1 $e2) )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:230:12: WHEN e1= expr THEN e2= expr
            {
            WHEN143=(Token)match(input,WHEN,FOLLOW_WHEN_in_when_expr1244);  
            stream_WHEN.add(WHEN143);


            pushFollow(FOLLOW_expr_in_when_expr1248);
            e1=expr();

            state._fsp--;

            stream_expr.add(e1.getTree());

            THEN144=(Token)match(input,THEN,FOLLOW_THEN_in_when_expr1250);  
            stream_THEN.add(THEN144);


            pushFollow(FOLLOW_expr_in_when_expr1254);
            e2=expr();

            state._fsp--;

            stream_expr.add(e2.getTree());

            // AST REWRITE
            // elements: e2, WHEN, e1
            // token labels: 
            // rule labels: retval, e1, e2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.tree:null);
            RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

            root_0 = (Object)adaptor.nil();
            // 230:38: -> ^( WHEN $e1 $e2)
            {
                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:230:41: ^( WHEN $e1 $e2)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_WHEN.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_e1.nextTree());

                adaptor.addChild(root_1, stream_e2.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "when_expr"


    public static class literal_value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "literal_value"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:232:1: literal_value : ( INTEGER -> ^( INTEGER_LITERAL INTEGER ) | FLOAT -> ^( FLOAT_LITERAL FLOAT ) | STRING -> ^( STRING_LITERAL STRING ) | BLOB -> ^( BLOB_LITERAL BLOB ) | NULL | CURRENT_TIME -> ^( FUNCTION_LITERAL CURRENT_TIME ) | CURRENT_DATE -> ^( FUNCTION_LITERAL CURRENT_DATE ) | CURRENT_TIMESTAMP -> ^( FUNCTION_LITERAL CURRENT_TIMESTAMP ) );
    public final SqlParser.literal_value_return literal_value() throws RecognitionException {
        SqlParser.literal_value_return retval = new SqlParser.literal_value_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTEGER145=null;
        Token FLOAT146=null;
        Token STRING147=null;
        Token BLOB148=null;
        Token NULL149=null;
        Token CURRENT_TIME150=null;
        Token CURRENT_DATE151=null;
        Token CURRENT_TIMESTAMP152=null;

        Object INTEGER145_tree=null;
        Object FLOAT146_tree=null;
        Object STRING147_tree=null;
        Object BLOB148_tree=null;
        Object NULL149_tree=null;
        Object CURRENT_TIME150_tree=null;
        Object CURRENT_DATE151_tree=null;
        Object CURRENT_TIMESTAMP152_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_BLOB=new RewriteRuleTokenStream(adaptor,"token BLOB");
        RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
        RewriteRuleTokenStream stream_CURRENT_TIMESTAMP=new RewriteRuleTokenStream(adaptor,"token CURRENT_TIMESTAMP");
        RewriteRuleTokenStream stream_CURRENT_DATE=new RewriteRuleTokenStream(adaptor,"token CURRENT_DATE");
        RewriteRuleTokenStream stream_CURRENT_TIME=new RewriteRuleTokenStream(adaptor,"token CURRENT_TIME");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:233:3: ( INTEGER -> ^( INTEGER_LITERAL INTEGER ) | FLOAT -> ^( FLOAT_LITERAL FLOAT ) | STRING -> ^( STRING_LITERAL STRING ) | BLOB -> ^( BLOB_LITERAL BLOB ) | NULL | CURRENT_TIME -> ^( FUNCTION_LITERAL CURRENT_TIME ) | CURRENT_DATE -> ^( FUNCTION_LITERAL CURRENT_DATE ) | CURRENT_TIMESTAMP -> ^( FUNCTION_LITERAL CURRENT_TIMESTAMP ) )
            int alt45=8;
            switch ( input.LA(1) ) {
            case INTEGER:
                {
                alt45=1;
                }
                break;
            case FLOAT:
                {
                alt45=2;
                }
                break;
            case STRING:
                {
                alt45=3;
                }
                break;
            case BLOB:
                {
                alt45=4;
                }
                break;
            case NULL:
                {
                alt45=5;
                }
                break;
            case CURRENT_TIME:
                {
                alt45=6;
                }
                break;
            case CURRENT_DATE:
                {
                alt45=7;
                }
                break;
            case CURRENT_TIMESTAMP:
                {
                alt45=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;

            }

            switch (alt45) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:233:5: INTEGER
                    {
                    INTEGER145=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_literal_value1276);  
                    stream_INTEGER.add(INTEGER145);


                    // AST REWRITE
                    // elements: INTEGER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 233:13: -> ^( INTEGER_LITERAL INTEGER )
                    {
                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:233:16: ^( INTEGER_LITERAL INTEGER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(INTEGER_LITERAL, "INTEGER_LITERAL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_INTEGER.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:234:5: FLOAT
                    {
                    FLOAT146=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_literal_value1290);  
                    stream_FLOAT.add(FLOAT146);


                    // AST REWRITE
                    // elements: FLOAT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 234:11: -> ^( FLOAT_LITERAL FLOAT )
                    {
                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:234:14: ^( FLOAT_LITERAL FLOAT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FLOAT_LITERAL, "FLOAT_LITERAL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_FLOAT.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:235:5: STRING
                    {
                    STRING147=(Token)match(input,STRING,FOLLOW_STRING_in_literal_value1304);  
                    stream_STRING.add(STRING147);


                    // AST REWRITE
                    // elements: STRING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 235:12: -> ^( STRING_LITERAL STRING )
                    {
                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:235:15: ^( STRING_LITERAL STRING )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(STRING_LITERAL, "STRING_LITERAL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_STRING.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:236:5: BLOB
                    {
                    BLOB148=(Token)match(input,BLOB,FOLLOW_BLOB_in_literal_value1318);  
                    stream_BLOB.add(BLOB148);


                    // AST REWRITE
                    // elements: BLOB
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 236:10: -> ^( BLOB_LITERAL BLOB )
                    {
                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:236:13: ^( BLOB_LITERAL BLOB )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(BLOB_LITERAL, "BLOB_LITERAL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_BLOB.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:237:5: NULL
                    {
                    root_0 = (Object)adaptor.nil();


                    NULL149=(Token)match(input,NULL,FOLLOW_NULL_in_literal_value1332); 
                    NULL149_tree = 
                    (Object)adaptor.create(NULL149)
                    ;
                    adaptor.addChild(root_0, NULL149_tree);


                    }
                    break;
                case 6 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:238:5: CURRENT_TIME
                    {
                    CURRENT_TIME150=(Token)match(input,CURRENT_TIME,FOLLOW_CURRENT_TIME_in_literal_value1338);  
                    stream_CURRENT_TIME.add(CURRENT_TIME150);


                    // AST REWRITE
                    // elements: CURRENT_TIME
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 238:18: -> ^( FUNCTION_LITERAL CURRENT_TIME )
                    {
                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:238:21: ^( FUNCTION_LITERAL CURRENT_TIME )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FUNCTION_LITERAL, "FUNCTION_LITERAL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_CURRENT_TIME.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 7 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:239:5: CURRENT_DATE
                    {
                    CURRENT_DATE151=(Token)match(input,CURRENT_DATE,FOLLOW_CURRENT_DATE_in_literal_value1352);  
                    stream_CURRENT_DATE.add(CURRENT_DATE151);


                    // AST REWRITE
                    // elements: CURRENT_DATE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 239:18: -> ^( FUNCTION_LITERAL CURRENT_DATE )
                    {
                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:239:21: ^( FUNCTION_LITERAL CURRENT_DATE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FUNCTION_LITERAL, "FUNCTION_LITERAL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_CURRENT_DATE.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 8 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:240:5: CURRENT_TIMESTAMP
                    {
                    CURRENT_TIMESTAMP152=(Token)match(input,CURRENT_TIMESTAMP,FOLLOW_CURRENT_TIMESTAMP_in_literal_value1366);  
                    stream_CURRENT_TIMESTAMP.add(CURRENT_TIMESTAMP152);


                    // AST REWRITE
                    // elements: CURRENT_TIMESTAMP
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 240:23: -> ^( FUNCTION_LITERAL CURRENT_TIMESTAMP )
                    {
                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:240:26: ^( FUNCTION_LITERAL CURRENT_TIMESTAMP )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FUNCTION_LITERAL, "FUNCTION_LITERAL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_CURRENT_TIMESTAMP.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "literal_value"


    public static class bind_parameter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bind_parameter"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:243:1: bind_parameter : ( QUESTION -> BIND | QUESTION position= INTEGER -> ^( BIND $position) | COLON name= id -> ^( BIND_NAME $name) | AT name= id -> ^( BIND_NAME $name) );
    public final SqlParser.bind_parameter_return bind_parameter() throws RecognitionException {
        SqlParser.bind_parameter_return retval = new SqlParser.bind_parameter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token position=null;
        Token QUESTION153=null;
        Token QUESTION154=null;
        Token COLON155=null;
        Token AT156=null;
        SqlParser.id_return name =null;


        Object position_tree=null;
        Object QUESTION153_tree=null;
        Object QUESTION154_tree=null;
        Object COLON155_tree=null;
        Object AT156_tree=null;
        RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_QUESTION=new RewriteRuleTokenStream(adaptor,"token QUESTION");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:244:3: ( QUESTION -> BIND | QUESTION position= INTEGER -> ^( BIND $position) | COLON name= id -> ^( BIND_NAME $name) | AT name= id -> ^( BIND_NAME $name) )
            int alt46=4;
            switch ( input.LA(1) ) {
            case QUESTION:
                {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==INTEGER) ) {
                    alt46=2;
                }
                else if ( (LA46_1==EOF||(LA46_1 >= ABORT && LA46_1 <= AFTER)||(LA46_1 >= ALL && LA46_1 <= AND)||(LA46_1 >= AS && LA46_1 <= ASTERISK)||(LA46_1 >= ATTACH && LA46_1 <= AUTOINCREMENT)||(LA46_1 >= BEFORE && LA46_1 <= BETWEEN)||LA46_1==BY||(LA46_1 >= CASCADE && LA46_1 <= COLLATE)||LA46_1==COLUMN||LA46_1==COMMA||(LA46_1 >= COMMIT && LA46_1 <= CONSTRAINT)||LA46_1==CREATE||(LA46_1 >= CROSS && LA46_1 <= CURRENT_TIMESTAMP)||(LA46_1 >= DATABASE && LA46_1 <= DISTINCT)||(LA46_1 >= DOUBLE_PIPE && LA46_1 <= DROP)||(LA46_1 >= EACH && LA46_1 <= EXPLAIN)||LA46_1==FAIL||(LA46_1 >= FOR && LA46_1 <= FROM)||(LA46_1 >= GLOB && LA46_1 <= GROUP)||LA46_1==HAVING||LA46_1==ID||(LA46_1 >= IF && LA46_1 <= INSTEAD)||(LA46_1 >= INTERSECT && LA46_1 <= INTO)||(LA46_1 >= IS && LA46_1 <= ISNULL)||LA46_1==JOIN||LA46_1==KEY||(LA46_1 >= LEFT && LA46_1 <= LIMIT)||(LA46_1 >= MATCH && LA46_1 <= MINUS)||(LA46_1 >= NATURAL && LA46_1 <= NOT_EQUALS2)||LA46_1==NULL||(LA46_1 >= OF && LA46_1 <= ON)||(LA46_1 >= OR && LA46_1 <= ORDER)||LA46_1==OUTER||(LA46_1 >= PERCENT && LA46_1 <= PRIMARY)||LA46_1==QUERY||(LA46_1 >= RAISE && LA46_1 <= RPAREN)||(LA46_1 >= SAVEPOINT && LA46_1 <= SELECT)||(LA46_1 >= SEMI && LA46_1 <= SLASH)||LA46_1==STRING||LA46_1==TABLE||(LA46_1 >= TEMPORARY && LA46_1 <= THEN)||(LA46_1 >= TO && LA46_1 <= TRIGGER)||(LA46_1 >= UNION && LA46_1 <= USING)||(LA46_1 >= VACUUM && LA46_1 <= VIRTUAL)||(LA46_1 >= WHEN && LA46_1 <= WHERE)) ) {
                    alt46=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 1, input);

                    throw nvae;

                }
                }
                break;
            case COLON:
                {
                alt46=3;
                }
                break;
            case AT:
                {
                alt46=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;

            }

            switch (alt46) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:244:5: QUESTION
                    {
                    QUESTION153=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_bind_parameter1387);  
                    stream_QUESTION.add(QUESTION153);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 244:14: -> BIND
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(BIND, "BIND")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:245:5: QUESTION position= INTEGER
                    {
                    QUESTION154=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_bind_parameter1397);  
                    stream_QUESTION.add(QUESTION154);


                    position=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_bind_parameter1401);  
                    stream_INTEGER.add(position);


                    // AST REWRITE
                    // elements: position
                    // token labels: position
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_position=new RewriteRuleTokenStream(adaptor,"token position",position);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 245:31: -> ^( BIND $position)
                    {
                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:245:34: ^( BIND $position)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(BIND, "BIND")
                        , root_1);

                        adaptor.addChild(root_1, stream_position.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:246:5: COLON name= id
                    {
                    COLON155=(Token)match(input,COLON,FOLLOW_COLON_in_bind_parameter1416);  
                    stream_COLON.add(COLON155);


                    pushFollow(FOLLOW_id_in_bind_parameter1420);
                    name=id();

                    state._fsp--;

                    stream_id.add(name.getTree());

                    // AST REWRITE
                    // elements: name
                    // token labels: 
                    // rule labels: retval, name
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 246:19: -> ^( BIND_NAME $name)
                    {
                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:246:22: ^( BIND_NAME $name)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(BIND_NAME, "BIND_NAME")
                        , root_1);

                        adaptor.addChild(root_1, stream_name.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:247:5: AT name= id
                    {
                    AT156=(Token)match(input,AT,FOLLOW_AT_in_bind_parameter1435);  
                    stream_AT.add(AT156);


                    pushFollow(FOLLOW_id_in_bind_parameter1439);
                    name=id();

                    state._fsp--;

                    stream_id.add(name.getTree());

                    // AST REWRITE
                    // elements: name
                    // token labels: 
                    // rule labels: retval, name
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 247:16: -> ^( BIND_NAME $name)
                    {
                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:247:19: ^( BIND_NAME $name)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(BIND_NAME, "BIND_NAME")
                        , root_1);

                        adaptor.addChild(root_1, stream_name.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bind_parameter"


    public static class raise_function_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "raise_function"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:252:1: raise_function : RAISE ^ LPAREN ! ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA !error_message= STRING ) RPAREN !;
    public final SqlParser.raise_function_return raise_function() throws RecognitionException {
        SqlParser.raise_function_return retval = new SqlParser.raise_function_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token error_message=null;
        Token RAISE157=null;
        Token LPAREN158=null;
        Token IGNORE159=null;
        Token set160=null;
        Token COMMA161=null;
        Token RPAREN162=null;

        Object error_message_tree=null;
        Object RAISE157_tree=null;
        Object LPAREN158_tree=null;
        Object IGNORE159_tree=null;
        Object set160_tree=null;
        Object COMMA161_tree=null;
        Object RPAREN162_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:252:15: ( RAISE ^ LPAREN ! ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA !error_message= STRING ) RPAREN !)
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:252:17: RAISE ^ LPAREN ! ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA !error_message= STRING ) RPAREN !
            {
            root_0 = (Object)adaptor.nil();


            RAISE157=(Token)match(input,RAISE,FOLLOW_RAISE_in_raise_function1460); 
            RAISE157_tree = 
            (Object)adaptor.create(RAISE157)
            ;
            root_0 = (Object)adaptor.becomeRoot(RAISE157_tree, root_0);


            LPAREN158=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_raise_function1463); 

            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:252:32: ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA !error_message= STRING )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==IGNORE) ) {
                alt47=1;
            }
            else if ( (LA47_0==ABORT||LA47_0==FAIL||LA47_0==ROLLBACK) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;

            }
            switch (alt47) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:252:33: IGNORE
                    {
                    IGNORE159=(Token)match(input,IGNORE,FOLLOW_IGNORE_in_raise_function1467); 
                    IGNORE159_tree = 
                    (Object)adaptor.create(IGNORE159)
                    ;
                    adaptor.addChild(root_0, IGNORE159_tree);


                    }
                    break;
                case 2 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:252:42: ( ROLLBACK | ABORT | FAIL ) COMMA !error_message= STRING
                    {
                    set160=(Token)input.LT(1);

                    if ( input.LA(1)==ABORT||input.LA(1)==FAIL||input.LA(1)==ROLLBACK ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set160)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    COMMA161=(Token)match(input,COMMA,FOLLOW_COMMA_in_raise_function1483); 

                    error_message=(Token)match(input,STRING,FOLLOW_STRING_in_raise_function1488); 
                    error_message_tree = 
                    (Object)adaptor.create(error_message)
                    ;
                    adaptor.addChild(root_0, error_message_tree);


                    }
                    break;

            }


            RPAREN162=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_raise_function1491); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "raise_function"


    public static class type_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_name"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:254:1: type_name : (names+= ID )+ ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )? -> ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ ) ;
    public final SqlParser.type_name_return type_name() throws RecognitionException {
        SqlParser.type_name_return retval = new SqlParser.type_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LPAREN163=null;
        Token COMMA164=null;
        Token RPAREN165=null;
        Token names=null;
        List list_names=null;
        SqlParser.signed_number_return size1 =null;

        SqlParser.signed_number_return size2 =null;


        Object LPAREN163_tree=null;
        Object COMMA164_tree=null;
        Object RPAREN165_tree=null;
        Object names_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_signed_number=new RewriteRuleSubtreeStream(adaptor,"rule signed_number");
        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:254:10: ( (names+= ID )+ ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )? -> ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ ) )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:254:12: (names+= ID )+ ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )?
            {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:254:17: (names+= ID )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==ID) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:254:17: names+= ID
            	    {
            	    names=(Token)match(input,ID,FOLLOW_ID_in_type_name1501);  
            	    stream_ID.add(names);

            	    if (list_names==null) list_names=new ArrayList();
            	    list_names.add(names);


            	    }
            	    break;

            	default :
            	    if ( cnt48 >= 1 ) break loop48;
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
            } while (true);


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:254:23: ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==LPAREN) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:254:24: LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN
                    {
                    LPAREN163=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_type_name1505);  
                    stream_LPAREN.add(LPAREN163);


                    pushFollow(FOLLOW_signed_number_in_type_name1509);
                    size1=signed_number();

                    state._fsp--;

                    stream_signed_number.add(size1.getTree());

                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:254:51: ( COMMA size2= signed_number )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==COMMA) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:254:52: COMMA size2= signed_number
                            {
                            COMMA164=(Token)match(input,COMMA,FOLLOW_COMMA_in_type_name1512);  
                            stream_COMMA.add(COMMA164);


                            pushFollow(FOLLOW_signed_number_in_type_name1516);
                            size2=signed_number();

                            state._fsp--;

                            stream_signed_number.add(size2.getTree());

                            }
                            break;

                    }


                    RPAREN165=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_type_name1520);  
                    stream_RPAREN.add(RPAREN165);


                    }
                    break;

            }


            // AST REWRITE
            // elements: size2, names, size1
            // token labels: 
            // rule labels: retval, size2, size1
            // token list labels: names
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_names=new RewriteRuleTokenStream(adaptor,"token names", list_names);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_size2=new RewriteRuleSubtreeStream(adaptor,"rule size2",size2!=null?size2.tree:null);
            RewriteRuleSubtreeStream stream_size1=new RewriteRuleSubtreeStream(adaptor,"rule size1",size1!=null?size1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 255:50: -> ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ )
            {
                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:255:4: ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TYPE, "TYPE")
                , root_1);

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:255:11: ^( TYPE_PARAMS ( $size1)? ( $size2)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TYPE_PARAMS, "TYPE_PARAMS")
                , root_2);

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:255:26: ( $size1)?
                if ( stream_size1.hasNext() ) {
                    adaptor.addChild(root_2, stream_size1.nextTree());

                }
                stream_size1.reset();

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:255:34: ( $size2)?
                if ( stream_size2.hasNext() ) {
                    adaptor.addChild(root_2, stream_size2.nextTree());

                }
                stream_size2.reset();

                adaptor.addChild(root_1, root_2);
                }

                if ( !(stream_names.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_names.hasNext() ) {
                    adaptor.addChild(root_1, stream_names.nextNode());

                }
                stream_names.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type_name"


    public static class signed_number_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "signed_number"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:257:1: signed_number : ( PLUS | MINUS )? ( INTEGER | FLOAT ) ;
    public final SqlParser.signed_number_return signed_number() throws RecognitionException {
        SqlParser.signed_number_return retval = new SqlParser.signed_number_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set166=null;
        Token set167=null;

        Object set166_tree=null;
        Object set167_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:257:14: ( ( PLUS | MINUS )? ( INTEGER | FLOAT ) )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:257:16: ( PLUS | MINUS )? ( INTEGER | FLOAT )
            {
            root_0 = (Object)adaptor.nil();


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:257:16: ( PLUS | MINUS )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==MINUS||LA51_0==PLUS) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
                    {
                    set166=(Token)input.LT(1);

                    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set166)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            set167=(Token)input.LT(1);

            if ( input.LA(1)==FLOAT||input.LA(1)==INTEGER ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set167)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "signed_number"


    public static class pragma_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pragma_stmt"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:260:1: pragma_stmt : PRAGMA (database_name= id DOT )? pragma_name= id ( EQUALS pragma_value | LPAREN pragma_value RPAREN )? -> ^( PRAGMA ^( $pragma_name ( $database_name)? ) ( pragma_value )? ) ;
    public final SqlParser.pragma_stmt_return pragma_stmt() throws RecognitionException {
        SqlParser.pragma_stmt_return retval = new SqlParser.pragma_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PRAGMA168=null;
        Token DOT169=null;
        Token EQUALS170=null;
        Token LPAREN172=null;
        Token RPAREN174=null;
        SqlParser.id_return database_name =null;

        SqlParser.id_return pragma_name =null;

        SqlParser.pragma_value_return pragma_value171 =null;

        SqlParser.pragma_value_return pragma_value173 =null;


        Object PRAGMA168_tree=null;
        Object DOT169_tree=null;
        Object EQUALS170_tree=null;
        Object LPAREN172_tree=null;
        Object RPAREN174_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_PRAGMA=new RewriteRuleTokenStream(adaptor,"token PRAGMA");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_pragma_value=new RewriteRuleSubtreeStream(adaptor,"rule pragma_value");
        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:260:12: ( PRAGMA (database_name= id DOT )? pragma_name= id ( EQUALS pragma_value | LPAREN pragma_value RPAREN )? -> ^( PRAGMA ^( $pragma_name ( $database_name)? ) ( pragma_value )? ) )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:260:14: PRAGMA (database_name= id DOT )? pragma_name= id ( EQUALS pragma_value | LPAREN pragma_value RPAREN )?
            {
            PRAGMA168=(Token)match(input,PRAGMA,FOLLOW_PRAGMA_in_pragma_stmt1574);  
            stream_PRAGMA.add(PRAGMA168);


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:260:21: (database_name= id DOT )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==ID||LA52_0==STRING) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==DOT) ) {
                    alt52=1;
                }
            }
            else if ( ((LA52_0 >= ABORT && LA52_0 <= AFTER)||(LA52_0 >= ALL && LA52_0 <= ALTER)||(LA52_0 >= ANALYZE && LA52_0 <= AND)||(LA52_0 >= AS && LA52_0 <= ASC)||(LA52_0 >= ATTACH && LA52_0 <= AUTOINCREMENT)||(LA52_0 >= BEFORE && LA52_0 <= BETWEEN)||LA52_0==BY||(LA52_0 >= CASCADE && LA52_0 <= COLLATE)||LA52_0==COLUMN||(LA52_0 >= COMMIT && LA52_0 <= CONSTRAINT)||LA52_0==CREATE||(LA52_0 >= CROSS && LA52_0 <= CURRENT_TIMESTAMP)||(LA52_0 >= DATABASE && LA52_0 <= DISTINCT)||LA52_0==DROP||(LA52_0 >= EACH && LA52_0 <= END)||(LA52_0 >= ESCAPE && LA52_0 <= EXPLAIN)||LA52_0==FAIL||(LA52_0 >= FOR && LA52_0 <= FROM)||LA52_0==GROUP||LA52_0==HAVING||(LA52_0 >= IF && LA52_0 <= IMMEDIATE)||(LA52_0 >= INDEX && LA52_0 <= INSTEAD)||(LA52_0 >= INTERSECT && LA52_0 <= INTO)||LA52_0==IS||LA52_0==JOIN||LA52_0==KEY||LA52_0==LEFT||LA52_0==LIMIT||LA52_0==NATURAL||LA52_0==NULL||(LA52_0 >= OF && LA52_0 <= ON)||(LA52_0 >= OR && LA52_0 <= ORDER)||LA52_0==OUTER||LA52_0==PLAN||(LA52_0 >= PRAGMA && LA52_0 <= PRIMARY)||LA52_0==QUERY||(LA52_0 >= RAISE && LA52_0 <= REFERENCES)||(LA52_0 >= REINDEX && LA52_0 <= ROW)||(LA52_0 >= SAVEPOINT && LA52_0 <= SELECT)||LA52_0==SET||LA52_0==TABLE||(LA52_0 >= TEMPORARY && LA52_0 <= THEN)||(LA52_0 >= TO && LA52_0 <= TRIGGER)||(LA52_0 >= UNION && LA52_0 <= USING)||(LA52_0 >= VACUUM && LA52_0 <= VIRTUAL)||(LA52_0 >= WHEN && LA52_0 <= WHERE)) ) {
                int LA52_2 = input.LA(2);

                if ( (LA52_2==DOT) ) {
                    alt52=1;
                }
            }
            switch (alt52) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:260:22: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_pragma_stmt1579);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());

                    DOT169=(Token)match(input,DOT,FOLLOW_DOT_in_pragma_stmt1581);  
                    stream_DOT.add(DOT169);


                    }
                    break;

            }


            pushFollow(FOLLOW_id_in_pragma_stmt1587);
            pragma_name=id();

            state._fsp--;

            stream_id.add(pragma_name.getTree());

            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:260:60: ( EQUALS pragma_value | LPAREN pragma_value RPAREN )?
            int alt53=3;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==EQUALS) ) {
                alt53=1;
            }
            else if ( (LA53_0==LPAREN) ) {
                alt53=2;
            }
            switch (alt53) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:260:61: EQUALS pragma_value
                    {
                    EQUALS170=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_pragma_stmt1590);  
                    stream_EQUALS.add(EQUALS170);


                    pushFollow(FOLLOW_pragma_value_in_pragma_stmt1592);
                    pragma_value171=pragma_value();

                    state._fsp--;

                    stream_pragma_value.add(pragma_value171.getTree());

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:260:83: LPAREN pragma_value RPAREN
                    {
                    LPAREN172=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_pragma_stmt1596);  
                    stream_LPAREN.add(LPAREN172);


                    pushFollow(FOLLOW_pragma_value_in_pragma_stmt1598);
                    pragma_value173=pragma_value();

                    state._fsp--;

                    stream_pragma_value.add(pragma_value173.getTree());

                    RPAREN174=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_pragma_stmt1600);  
                    stream_RPAREN.add(RPAREN174);


                    }
                    break;

            }


            // AST REWRITE
            // elements: pragma_value, database_name, PRAGMA, pragma_name
            // token labels: 
            // rule labels: database_name, retval, pragma_name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_pragma_name=new RewriteRuleSubtreeStream(adaptor,"rule pragma_name",pragma_name!=null?pragma_name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 261:59: -> ^( PRAGMA ^( $pragma_name ( $database_name)? ) ( pragma_value )? )
            {
                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:261:4: ^( PRAGMA ^( $pragma_name ( $database_name)? ) ( pragma_value )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_PRAGMA.nextNode()
                , root_1);

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:261:13: ^( $pragma_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_pragma_name.nextNode(), root_2);

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:261:29: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:261:45: ( pragma_value )?
                if ( stream_pragma_value.hasNext() ) {
                    adaptor.addChild(root_1, stream_pragma_value.nextTree());

                }
                stream_pragma_value.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pragma_stmt"


    public static class pragma_value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pragma_value"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:263:1: pragma_value : ( signed_number -> ^( FLOAT_LITERAL signed_number ) | ID -> ^( ID_LITERAL ID ) | STRING -> ^( STRING_LITERAL STRING ) );
    public final SqlParser.pragma_value_return pragma_value() throws RecognitionException {
        SqlParser.pragma_value_return retval = new SqlParser.pragma_value_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID176=null;
        Token STRING177=null;
        SqlParser.signed_number_return signed_number175 =null;


        Object ID176_tree=null;
        Object STRING177_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_signed_number=new RewriteRuleSubtreeStream(adaptor,"rule signed_number");
        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:264:2: ( signed_number -> ^( FLOAT_LITERAL signed_number ) | ID -> ^( ID_LITERAL ID ) | STRING -> ^( STRING_LITERAL STRING ) )
            int alt54=3;
            switch ( input.LA(1) ) {
            case FLOAT:
            case INTEGER:
            case MINUS:
            case PLUS:
                {
                alt54=1;
                }
                break;
            case ID:
                {
                alt54=2;
                }
                break;
            case STRING:
                {
                alt54=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;

            }

            switch (alt54) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:264:4: signed_number
                    {
                    pushFollow(FOLLOW_signed_number_in_pragma_value1629);
                    signed_number175=signed_number();

                    state._fsp--;

                    stream_signed_number.add(signed_number175.getTree());

                    // AST REWRITE
                    // elements: signed_number
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 264:18: -> ^( FLOAT_LITERAL signed_number )
                    {
                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:264:21: ^( FLOAT_LITERAL signed_number )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FLOAT_LITERAL, "FLOAT_LITERAL")
                        , root_1);

                        adaptor.addChild(root_1, stream_signed_number.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:265:4: ID
                    {
                    ID176=(Token)match(input,ID,FOLLOW_ID_in_pragma_value1642);  
                    stream_ID.add(ID176);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 265:7: -> ^( ID_LITERAL ID )
                    {
                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:265:10: ^( ID_LITERAL ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ID_LITERAL, "ID_LITERAL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:266:4: STRING
                    {
                    STRING177=(Token)match(input,STRING,FOLLOW_STRING_in_pragma_value1655);  
                    stream_STRING.add(STRING177);


                    // AST REWRITE
                    // elements: STRING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 266:11: -> ^( STRING_LITERAL STRING )
                    {
                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:266:14: ^( STRING_LITERAL STRING )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(STRING_LITERAL, "STRING_LITERAL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_STRING.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pragma_value"


    public static class attach_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attach_stmt"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:270:1: attach_stmt : ATTACH ( DATABASE )? filename= id AS database_name= id ;
    public final SqlParser.attach_stmt_return attach_stmt() throws RecognitionException {
        SqlParser.attach_stmt_return retval = new SqlParser.attach_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ATTACH178=null;
        Token DATABASE179=null;
        Token AS180=null;
        SqlParser.id_return filename =null;

        SqlParser.id_return database_name =null;


        Object ATTACH178_tree=null;
        Object DATABASE179_tree=null;
        Object AS180_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:270:12: ( ATTACH ( DATABASE )? filename= id AS database_name= id )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:270:14: ATTACH ( DATABASE )? filename= id AS database_name= id
            {
            root_0 = (Object)adaptor.nil();


            ATTACH178=(Token)match(input,ATTACH,FOLLOW_ATTACH_in_attach_stmt1673); 
            ATTACH178_tree = 
            (Object)adaptor.create(ATTACH178)
            ;
            adaptor.addChild(root_0, ATTACH178_tree);


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:270:21: ( DATABASE )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==DATABASE) ) {
                int LA55_1 = input.LA(2);

                if ( ((LA55_1 >= ABORT && LA55_1 <= AFTER)||(LA55_1 >= ALL && LA55_1 <= ALTER)||(LA55_1 >= ANALYZE && LA55_1 <= AND)||LA55_1==ASC||(LA55_1 >= ATTACH && LA55_1 <= AUTOINCREMENT)||(LA55_1 >= BEFORE && LA55_1 <= BETWEEN)||LA55_1==BY||(LA55_1 >= CASCADE && LA55_1 <= COLLATE)||LA55_1==COLUMN||(LA55_1 >= COMMIT && LA55_1 <= CONSTRAINT)||LA55_1==CREATE||(LA55_1 >= CROSS && LA55_1 <= CURRENT_TIMESTAMP)||(LA55_1 >= DATABASE && LA55_1 <= DISTINCT)||LA55_1==DROP||(LA55_1 >= EACH && LA55_1 <= END)||(LA55_1 >= ESCAPE && LA55_1 <= EXPLAIN)||LA55_1==FAIL||(LA55_1 >= FOR && LA55_1 <= FROM)||LA55_1==GROUP||LA55_1==HAVING||LA55_1==ID||(LA55_1 >= IF && LA55_1 <= IMMEDIATE)||(LA55_1 >= INDEX && LA55_1 <= INSTEAD)||(LA55_1 >= INTERSECT && LA55_1 <= INTO)||LA55_1==IS||LA55_1==JOIN||LA55_1==KEY||LA55_1==LEFT||LA55_1==LIMIT||LA55_1==NATURAL||LA55_1==NULL||(LA55_1 >= OF && LA55_1 <= ON)||(LA55_1 >= OR && LA55_1 <= ORDER)||LA55_1==OUTER||LA55_1==PLAN||(LA55_1 >= PRAGMA && LA55_1 <= PRIMARY)||LA55_1==QUERY||(LA55_1 >= RAISE && LA55_1 <= REFERENCES)||(LA55_1 >= REINDEX && LA55_1 <= ROW)||(LA55_1 >= SAVEPOINT && LA55_1 <= SELECT)||LA55_1==SET||LA55_1==STRING||LA55_1==TABLE||(LA55_1 >= TEMPORARY && LA55_1 <= THEN)||(LA55_1 >= TO && LA55_1 <= TRIGGER)||(LA55_1 >= UNION && LA55_1 <= USING)||(LA55_1 >= VACUUM && LA55_1 <= VIRTUAL)||(LA55_1 >= WHEN && LA55_1 <= WHERE)) ) {
                    alt55=1;
                }
                else if ( (LA55_1==AS) ) {
                    int LA55_5 = input.LA(3);

                    if ( (LA55_5==AS) ) {
                        int LA55_7 = input.LA(4);

                        if ( ((LA55_7 >= ABORT && LA55_7 <= AFTER)||(LA55_7 >= ALL && LA55_7 <= ALTER)||(LA55_7 >= ANALYZE && LA55_7 <= AND)||(LA55_7 >= AS && LA55_7 <= ASC)||(LA55_7 >= ATTACH && LA55_7 <= AUTOINCREMENT)||(LA55_7 >= BEFORE && LA55_7 <= BETWEEN)||LA55_7==BY||(LA55_7 >= CASCADE && LA55_7 <= COLLATE)||LA55_7==COLUMN||(LA55_7 >= COMMIT && LA55_7 <= CONSTRAINT)||LA55_7==CREATE||(LA55_7 >= CROSS && LA55_7 <= CURRENT_TIMESTAMP)||(LA55_7 >= DATABASE && LA55_7 <= DISTINCT)||LA55_7==DROP||(LA55_7 >= EACH && LA55_7 <= END)||(LA55_7 >= ESCAPE && LA55_7 <= EXPLAIN)||LA55_7==FAIL||(LA55_7 >= FOR && LA55_7 <= FROM)||LA55_7==GROUP||LA55_7==HAVING||LA55_7==ID||(LA55_7 >= IF && LA55_7 <= IMMEDIATE)||(LA55_7 >= INDEX && LA55_7 <= INSTEAD)||(LA55_7 >= INTERSECT && LA55_7 <= INTO)||LA55_7==IS||LA55_7==JOIN||LA55_7==KEY||LA55_7==LEFT||LA55_7==LIMIT||LA55_7==NATURAL||LA55_7==NULL||(LA55_7 >= OF && LA55_7 <= ON)||(LA55_7 >= OR && LA55_7 <= ORDER)||LA55_7==OUTER||LA55_7==PLAN||(LA55_7 >= PRAGMA && LA55_7 <= PRIMARY)||LA55_7==QUERY||(LA55_7 >= RAISE && LA55_7 <= REFERENCES)||(LA55_7 >= REINDEX && LA55_7 <= ROW)||(LA55_7 >= SAVEPOINT && LA55_7 <= SELECT)||LA55_7==SET||LA55_7==STRING||LA55_7==TABLE||(LA55_7 >= TEMPORARY && LA55_7 <= THEN)||(LA55_7 >= TO && LA55_7 <= TRIGGER)||(LA55_7 >= UNION && LA55_7 <= USING)||(LA55_7 >= VACUUM && LA55_7 <= VIRTUAL)||(LA55_7 >= WHEN && LA55_7 <= WHERE)) ) {
                            alt55=1;
                        }
                    }
                }
            }
            switch (alt55) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:270:22: DATABASE
                    {
                    DATABASE179=(Token)match(input,DATABASE,FOLLOW_DATABASE_in_attach_stmt1676); 
                    DATABASE179_tree = 
                    (Object)adaptor.create(DATABASE179)
                    ;
                    adaptor.addChild(root_0, DATABASE179_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_id_in_attach_stmt1682);
            filename=id();

            state._fsp--;

            adaptor.addChild(root_0, filename.getTree());

            AS180=(Token)match(input,AS,FOLLOW_AS_in_attach_stmt1684); 
            AS180_tree = 
            (Object)adaptor.create(AS180)
            ;
            adaptor.addChild(root_0, AS180_tree);


            pushFollow(FOLLOW_id_in_attach_stmt1688);
            database_name=id();

            state._fsp--;

            adaptor.addChild(root_0, database_name.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "attach_stmt"


    public static class detach_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "detach_stmt"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:273:1: detach_stmt : DETACH ( DATABASE )? database_name= id ;
    public final SqlParser.detach_stmt_return detach_stmt() throws RecognitionException {
        SqlParser.detach_stmt_return retval = new SqlParser.detach_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DETACH181=null;
        Token DATABASE182=null;
        SqlParser.id_return database_name =null;


        Object DETACH181_tree=null;
        Object DATABASE182_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:273:12: ( DETACH ( DATABASE )? database_name= id )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:273:14: DETACH ( DATABASE )? database_name= id
            {
            root_0 = (Object)adaptor.nil();


            DETACH181=(Token)match(input,DETACH,FOLLOW_DETACH_in_detach_stmt1696); 
            DETACH181_tree = 
            (Object)adaptor.create(DETACH181)
            ;
            adaptor.addChild(root_0, DETACH181_tree);


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:273:21: ( DATABASE )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==DATABASE) ) {
                int LA56_1 = input.LA(2);

                if ( ((LA56_1 >= ABORT && LA56_1 <= AFTER)||(LA56_1 >= ALL && LA56_1 <= ALTER)||(LA56_1 >= ANALYZE && LA56_1 <= AND)||(LA56_1 >= AS && LA56_1 <= ASC)||(LA56_1 >= ATTACH && LA56_1 <= AUTOINCREMENT)||(LA56_1 >= BEFORE && LA56_1 <= BETWEEN)||LA56_1==BY||(LA56_1 >= CASCADE && LA56_1 <= COLLATE)||LA56_1==COLUMN||(LA56_1 >= COMMIT && LA56_1 <= CONSTRAINT)||LA56_1==CREATE||(LA56_1 >= CROSS && LA56_1 <= CURRENT_TIMESTAMP)||(LA56_1 >= DATABASE && LA56_1 <= DISTINCT)||LA56_1==DROP||(LA56_1 >= EACH && LA56_1 <= END)||(LA56_1 >= ESCAPE && LA56_1 <= EXPLAIN)||LA56_1==FAIL||(LA56_1 >= FOR && LA56_1 <= FROM)||LA56_1==GROUP||LA56_1==HAVING||LA56_1==ID||(LA56_1 >= IF && LA56_1 <= IMMEDIATE)||(LA56_1 >= INDEX && LA56_1 <= INSTEAD)||(LA56_1 >= INTERSECT && LA56_1 <= INTO)||LA56_1==IS||LA56_1==JOIN||LA56_1==KEY||LA56_1==LEFT||LA56_1==LIMIT||LA56_1==NATURAL||LA56_1==NULL||(LA56_1 >= OF && LA56_1 <= ON)||(LA56_1 >= OR && LA56_1 <= ORDER)||LA56_1==OUTER||LA56_1==PLAN||(LA56_1 >= PRAGMA && LA56_1 <= PRIMARY)||LA56_1==QUERY||(LA56_1 >= RAISE && LA56_1 <= REFERENCES)||(LA56_1 >= REINDEX && LA56_1 <= ROW)||(LA56_1 >= SAVEPOINT && LA56_1 <= SELECT)||LA56_1==SET||LA56_1==STRING||LA56_1==TABLE||(LA56_1 >= TEMPORARY && LA56_1 <= THEN)||(LA56_1 >= TO && LA56_1 <= TRIGGER)||(LA56_1 >= UNION && LA56_1 <= USING)||(LA56_1 >= VACUUM && LA56_1 <= VIRTUAL)||(LA56_1 >= WHEN && LA56_1 <= WHERE)) ) {
                    alt56=1;
                }
            }
            switch (alt56) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:273:22: DATABASE
                    {
                    DATABASE182=(Token)match(input,DATABASE,FOLLOW_DATABASE_in_detach_stmt1699); 
                    DATABASE182_tree = 
                    (Object)adaptor.create(DATABASE182)
                    ;
                    adaptor.addChild(root_0, DATABASE182_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_id_in_detach_stmt1705);
            database_name=id();

            state._fsp--;

            adaptor.addChild(root_0, database_name.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "detach_stmt"


    public static class analyze_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "analyze_stmt"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:276:1: analyze_stmt : ANALYZE (database_or_table_name= id |database_name= id DOT table_name= id )? ;
    public final SqlParser.analyze_stmt_return analyze_stmt() throws RecognitionException {
        SqlParser.analyze_stmt_return retval = new SqlParser.analyze_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ANALYZE183=null;
        Token DOT184=null;
        SqlParser.id_return database_or_table_name =null;

        SqlParser.id_return database_name =null;

        SqlParser.id_return table_name =null;


        Object ANALYZE183_tree=null;
        Object DOT184_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:276:13: ( ANALYZE (database_or_table_name= id |database_name= id DOT table_name= id )? )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:276:15: ANALYZE (database_or_table_name= id |database_name= id DOT table_name= id )?
            {
            root_0 = (Object)adaptor.nil();


            ANALYZE183=(Token)match(input,ANALYZE,FOLLOW_ANALYZE_in_analyze_stmt1713); 
            ANALYZE183_tree = 
            (Object)adaptor.create(ANALYZE183)
            ;
            adaptor.addChild(root_0, ANALYZE183_tree);


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:276:23: (database_or_table_name= id |database_name= id DOT table_name= id )?
            int alt57=3;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==ID||LA57_0==STRING) ) {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==EOF||LA57_1==SEMI) ) {
                    alt57=1;
                }
                else if ( (LA57_1==DOT) ) {
                    alt57=2;
                }
            }
            else if ( ((LA57_0 >= ABORT && LA57_0 <= AFTER)||(LA57_0 >= ALL && LA57_0 <= ALTER)||(LA57_0 >= ANALYZE && LA57_0 <= AND)||(LA57_0 >= AS && LA57_0 <= ASC)||(LA57_0 >= ATTACH && LA57_0 <= AUTOINCREMENT)||(LA57_0 >= BEFORE && LA57_0 <= BETWEEN)||LA57_0==BY||(LA57_0 >= CASCADE && LA57_0 <= COLLATE)||LA57_0==COLUMN||(LA57_0 >= COMMIT && LA57_0 <= CONSTRAINT)||LA57_0==CREATE||(LA57_0 >= CROSS && LA57_0 <= CURRENT_TIMESTAMP)||(LA57_0 >= DATABASE && LA57_0 <= DISTINCT)||LA57_0==DROP||(LA57_0 >= EACH && LA57_0 <= END)||(LA57_0 >= ESCAPE && LA57_0 <= EXPLAIN)||LA57_0==FAIL||(LA57_0 >= FOR && LA57_0 <= FROM)||LA57_0==GROUP||LA57_0==HAVING||(LA57_0 >= IF && LA57_0 <= IMMEDIATE)||(LA57_0 >= INDEX && LA57_0 <= INSTEAD)||(LA57_0 >= INTERSECT && LA57_0 <= INTO)||LA57_0==IS||LA57_0==JOIN||LA57_0==KEY||LA57_0==LEFT||LA57_0==LIMIT||LA57_0==NATURAL||LA57_0==NULL||(LA57_0 >= OF && LA57_0 <= ON)||(LA57_0 >= OR && LA57_0 <= ORDER)||LA57_0==OUTER||LA57_0==PLAN||(LA57_0 >= PRAGMA && LA57_0 <= PRIMARY)||LA57_0==QUERY||(LA57_0 >= RAISE && LA57_0 <= REFERENCES)||(LA57_0 >= REINDEX && LA57_0 <= ROW)||(LA57_0 >= SAVEPOINT && LA57_0 <= SELECT)||LA57_0==SET||LA57_0==TABLE||(LA57_0 >= TEMPORARY && LA57_0 <= THEN)||(LA57_0 >= TO && LA57_0 <= TRIGGER)||(LA57_0 >= UNION && LA57_0 <= USING)||(LA57_0 >= VACUUM && LA57_0 <= VIRTUAL)||(LA57_0 >= WHEN && LA57_0 <= WHERE)) ) {
                int LA57_2 = input.LA(2);

                if ( (LA57_2==EOF||LA57_2==SEMI) ) {
                    alt57=1;
                }
                else if ( (LA57_2==DOT) ) {
                    alt57=2;
                }
            }
            switch (alt57) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:276:24: database_or_table_name= id
                    {
                    pushFollow(FOLLOW_id_in_analyze_stmt1718);
                    database_or_table_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_or_table_name.getTree());

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:276:52: database_name= id DOT table_name= id
                    {
                    pushFollow(FOLLOW_id_in_analyze_stmt1724);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());

                    DOT184=(Token)match(input,DOT,FOLLOW_DOT_in_analyze_stmt1726); 
                    DOT184_tree = 
                    (Object)adaptor.create(DOT184)
                    ;
                    adaptor.addChild(root_0, DOT184_tree);


                    pushFollow(FOLLOW_id_in_analyze_stmt1730);
                    table_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, table_name.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "analyze_stmt"


    public static class reindex_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "reindex_stmt"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:279:1: reindex_stmt : REINDEX (database_name= id DOT )? collation_or_table_or_index_name= id ;
    public final SqlParser.reindex_stmt_return reindex_stmt() throws RecognitionException {
        SqlParser.reindex_stmt_return retval = new SqlParser.reindex_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token REINDEX185=null;
        Token DOT186=null;
        SqlParser.id_return database_name =null;

        SqlParser.id_return collation_or_table_or_index_name =null;


        Object REINDEX185_tree=null;
        Object DOT186_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:279:13: ( REINDEX (database_name= id DOT )? collation_or_table_or_index_name= id )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:279:15: REINDEX (database_name= id DOT )? collation_or_table_or_index_name= id
            {
            root_0 = (Object)adaptor.nil();


            REINDEX185=(Token)match(input,REINDEX,FOLLOW_REINDEX_in_reindex_stmt1740); 
            REINDEX185_tree = 
            (Object)adaptor.create(REINDEX185)
            ;
            adaptor.addChild(root_0, REINDEX185_tree);


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:279:23: (database_name= id DOT )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==ID||LA58_0==STRING) ) {
                int LA58_1 = input.LA(2);

                if ( (LA58_1==DOT) ) {
                    alt58=1;
                }
            }
            else if ( ((LA58_0 >= ABORT && LA58_0 <= AFTER)||(LA58_0 >= ALL && LA58_0 <= ALTER)||(LA58_0 >= ANALYZE && LA58_0 <= AND)||(LA58_0 >= AS && LA58_0 <= ASC)||(LA58_0 >= ATTACH && LA58_0 <= AUTOINCREMENT)||(LA58_0 >= BEFORE && LA58_0 <= BETWEEN)||LA58_0==BY||(LA58_0 >= CASCADE && LA58_0 <= COLLATE)||LA58_0==COLUMN||(LA58_0 >= COMMIT && LA58_0 <= CONSTRAINT)||LA58_0==CREATE||(LA58_0 >= CROSS && LA58_0 <= CURRENT_TIMESTAMP)||(LA58_0 >= DATABASE && LA58_0 <= DISTINCT)||LA58_0==DROP||(LA58_0 >= EACH && LA58_0 <= END)||(LA58_0 >= ESCAPE && LA58_0 <= EXPLAIN)||LA58_0==FAIL||(LA58_0 >= FOR && LA58_0 <= FROM)||LA58_0==GROUP||LA58_0==HAVING||(LA58_0 >= IF && LA58_0 <= IMMEDIATE)||(LA58_0 >= INDEX && LA58_0 <= INSTEAD)||(LA58_0 >= INTERSECT && LA58_0 <= INTO)||LA58_0==IS||LA58_0==JOIN||LA58_0==KEY||LA58_0==LEFT||LA58_0==LIMIT||LA58_0==NATURAL||LA58_0==NULL||(LA58_0 >= OF && LA58_0 <= ON)||(LA58_0 >= OR && LA58_0 <= ORDER)||LA58_0==OUTER||LA58_0==PLAN||(LA58_0 >= PRAGMA && LA58_0 <= PRIMARY)||LA58_0==QUERY||(LA58_0 >= RAISE && LA58_0 <= REFERENCES)||(LA58_0 >= REINDEX && LA58_0 <= ROW)||(LA58_0 >= SAVEPOINT && LA58_0 <= SELECT)||LA58_0==SET||LA58_0==TABLE||(LA58_0 >= TEMPORARY && LA58_0 <= THEN)||(LA58_0 >= TO && LA58_0 <= TRIGGER)||(LA58_0 >= UNION && LA58_0 <= USING)||(LA58_0 >= VACUUM && LA58_0 <= VIRTUAL)||(LA58_0 >= WHEN && LA58_0 <= WHERE)) ) {
                int LA58_2 = input.LA(2);

                if ( (LA58_2==DOT) ) {
                    alt58=1;
                }
            }
            switch (alt58) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:279:24: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_reindex_stmt1745);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());

                    DOT186=(Token)match(input,DOT,FOLLOW_DOT_in_reindex_stmt1747); 
                    DOT186_tree = 
                    (Object)adaptor.create(DOT186)
                    ;
                    adaptor.addChild(root_0, DOT186_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_id_in_reindex_stmt1753);
            collation_or_table_or_index_name=id();

            state._fsp--;

            adaptor.addChild(root_0, collation_or_table_or_index_name.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "reindex_stmt"


    public static class vacuum_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "vacuum_stmt"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:282:1: vacuum_stmt : VACUUM ;
    public final SqlParser.vacuum_stmt_return vacuum_stmt() throws RecognitionException {
        SqlParser.vacuum_stmt_return retval = new SqlParser.vacuum_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VACUUM187=null;

        Object VACUUM187_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:282:12: ( VACUUM )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:282:14: VACUUM
            {
            root_0 = (Object)adaptor.nil();


            VACUUM187=(Token)match(input,VACUUM,FOLLOW_VACUUM_in_vacuum_stmt1761); 
            VACUUM187_tree = 
            (Object)adaptor.create(VACUUM187)
            ;
            adaptor.addChild(root_0, VACUUM187_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "vacuum_stmt"


    public static class operation_conflict_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "operation_conflict_clause"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:288:1: operation_conflict_clause : OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) ;
    public final SqlParser.operation_conflict_clause_return operation_conflict_clause() throws RecognitionException {
        SqlParser.operation_conflict_clause_return retval = new SqlParser.operation_conflict_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OR188=null;
        Token set189=null;

        Object OR188_tree=null;
        Object set189_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:288:26: ( OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:288:28: OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE )
            {
            root_0 = (Object)adaptor.nil();


            OR188=(Token)match(input,OR,FOLLOW_OR_in_operation_conflict_clause1772); 
            OR188_tree = 
            (Object)adaptor.create(OR188)
            ;
            adaptor.addChild(root_0, OR188_tree);


            set189=(Token)input.LT(1);

            if ( input.LA(1)==ABORT||input.LA(1)==FAIL||input.LA(1)==IGNORE||input.LA(1)==REPLACE||input.LA(1)==ROLLBACK ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set189)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "operation_conflict_clause"


    public static class ordering_term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ordering_term"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:290:1: ordering_term : expr ( ASC | DESC )? -> ^( ORDERING expr ( ASC )? ( DESC )? ) ;
    public final SqlParser.ordering_term_return ordering_term() throws RecognitionException {
        SqlParser.ordering_term_return retval = new SqlParser.ordering_term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ASC191=null;
        Token DESC192=null;
        SqlParser.expr_return expr190 =null;


        Object ASC191_tree=null;
        Object DESC192_tree=null;
        RewriteRuleTokenStream stream_ASC=new RewriteRuleTokenStream(adaptor,"token ASC");
        RewriteRuleTokenStream stream_DESC=new RewriteRuleTokenStream(adaptor,"token DESC");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:290:14: ( expr ( ASC | DESC )? -> ^( ORDERING expr ( ASC )? ( DESC )? ) )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:290:16: expr ( ASC | DESC )?
            {
            pushFollow(FOLLOW_expr_in_ordering_term1799);
            expr190=expr();

            state._fsp--;

            stream_expr.add(expr190.getTree());

            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:290:82: ( ASC | DESC )?
            int alt59=3;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==ASC) ) {
                alt59=1;
            }
            else if ( (LA59_0==DESC) ) {
                alt59=2;
            }
            switch (alt59) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:290:83: ASC
                    {
                    ASC191=(Token)match(input,ASC,FOLLOW_ASC_in_ordering_term1804);  
                    stream_ASC.add(ASC191);


                    }
                    break;
                case 2 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:290:89: DESC
                    {
                    DESC192=(Token)match(input,DESC,FOLLOW_DESC_in_ordering_term1808);  
                    stream_DESC.add(DESC192);


                    }
                    break;

            }


            // AST REWRITE
            // elements: DESC, ASC, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 291:35: -> ^( ORDERING expr ( ASC )? ( DESC )? )
            {
                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:291:4: ^( ORDERING expr ( ASC )? ( DESC )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ORDERING, "ORDERING")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:291:20: ( ASC )?
                if ( stream_ASC.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ASC.nextNode()
                    );

                }
                stream_ASC.reset();

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:291:27: ( DESC )?
                if ( stream_DESC.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_DESC.nextNode()
                    );

                }
                stream_DESC.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ordering_term"


    public static class operation_limited_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "operation_limited_clause"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:293:1: operation_limited_clause : ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? ;
    public final SqlParser.operation_limited_clause_return operation_limited_clause() throws RecognitionException {
        SqlParser.operation_limited_clause_return retval = new SqlParser.operation_limited_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token limit=null;
        Token offset=null;
        Token ORDER193=null;
        Token BY194=null;
        Token COMMA196=null;
        Token LIMIT198=null;
        Token set199=null;
        SqlParser.ordering_term_return ordering_term195 =null;

        SqlParser.ordering_term_return ordering_term197 =null;


        Object limit_tree=null;
        Object offset_tree=null;
        Object ORDER193_tree=null;
        Object BY194_tree=null;
        Object COMMA196_tree=null;
        Object LIMIT198_tree=null;
        Object set199_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:293:25: ( ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:294:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )?
            {
            root_0 = (Object)adaptor.nil();


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:294:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==ORDER) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:294:4: ORDER BY ordering_term ( COMMA ordering_term )*
                    {
                    ORDER193=(Token)match(input,ORDER,FOLLOW_ORDER_in_operation_limited_clause1838); 
                    ORDER193_tree = 
                    (Object)adaptor.create(ORDER193)
                    ;
                    adaptor.addChild(root_0, ORDER193_tree);


                    BY194=(Token)match(input,BY,FOLLOW_BY_in_operation_limited_clause1840); 
                    BY194_tree = 
                    (Object)adaptor.create(BY194)
                    ;
                    adaptor.addChild(root_0, BY194_tree);


                    pushFollow(FOLLOW_ordering_term_in_operation_limited_clause1842);
                    ordering_term195=ordering_term();

                    state._fsp--;

                    adaptor.addChild(root_0, ordering_term195.getTree());

                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:294:27: ( COMMA ordering_term )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==COMMA) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:294:28: COMMA ordering_term
                    	    {
                    	    COMMA196=(Token)match(input,COMMA,FOLLOW_COMMA_in_operation_limited_clause1845); 
                    	    COMMA196_tree = 
                    	    (Object)adaptor.create(COMMA196)
                    	    ;
                    	    adaptor.addChild(root_0, COMMA196_tree);


                    	    pushFollow(FOLLOW_ordering_term_in_operation_limited_clause1847);
                    	    ordering_term197=ordering_term();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, ordering_term197.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);


                    }
                    break;

            }


            LIMIT198=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_operation_limited_clause1855); 
            LIMIT198_tree = 
            (Object)adaptor.create(LIMIT198)
            ;
            adaptor.addChild(root_0, LIMIT198_tree);


            limit=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_operation_limited_clause1859); 
            limit_tree = 
            (Object)adaptor.create(limit)
            ;
            adaptor.addChild(root_0, limit_tree);


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:295:23: ( ( OFFSET | COMMA ) offset= INTEGER )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==COMMA||LA62_0==OFFSET) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:295:24: ( OFFSET | COMMA ) offset= INTEGER
                    {
                    set199=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==OFFSET ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set199)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    offset=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_operation_limited_clause1872); 
                    offset_tree = 
                    (Object)adaptor.create(offset)
                    ;
                    adaptor.addChild(root_0, offset_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "operation_limited_clause"


    public static class select_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "select_stmt"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:298:1: select_stmt : select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )? -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? ) ;
    public final SqlParser.select_stmt_return select_stmt() throws RecognitionException {
        SqlParser.select_stmt_return retval = new SqlParser.select_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token limit=null;
        Token offset=null;
        Token ORDER201=null;
        Token BY202=null;
        Token COMMA204=null;
        Token LIMIT206=null;
        Token OFFSET207=null;
        Token COMMA208=null;
        SqlParser.select_list_return select_list200 =null;

        SqlParser.ordering_term_return ordering_term203 =null;

        SqlParser.ordering_term_return ordering_term205 =null;


        Object limit_tree=null;
        Object offset_tree=null;
        Object ORDER201_tree=null;
        Object BY202_tree=null;
        Object COMMA204_tree=null;
        Object LIMIT206_tree=null;
        Object OFFSET207_tree=null;
        Object COMMA208_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
        RewriteRuleTokenStream stream_ORDER=new RewriteRuleTokenStream(adaptor,"token ORDER");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LIMIT=new RewriteRuleTokenStream(adaptor,"token LIMIT");
        RewriteRuleTokenStream stream_OFFSET=new RewriteRuleTokenStream(adaptor,"token OFFSET");
        RewriteRuleSubtreeStream stream_select_list=new RewriteRuleSubtreeStream(adaptor,"rule select_list");
        RewriteRuleSubtreeStream stream_ordering_term=new RewriteRuleSubtreeStream(adaptor,"rule ordering_term");
        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:298:12: ( select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )? -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? ) )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:298:14: select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )?
            {
            pushFollow(FOLLOW_select_list_in_select_stmt1882);
            select_list200=select_list();

            state._fsp--;

            stream_select_list.add(select_list200.getTree());

            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:299:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==ORDER) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:299:4: ORDER BY ordering_term ( COMMA ordering_term )*
                    {
                    ORDER201=(Token)match(input,ORDER,FOLLOW_ORDER_in_select_stmt1887);  
                    stream_ORDER.add(ORDER201);


                    BY202=(Token)match(input,BY,FOLLOW_BY_in_select_stmt1889);  
                    stream_BY.add(BY202);


                    pushFollow(FOLLOW_ordering_term_in_select_stmt1891);
                    ordering_term203=ordering_term();

                    state._fsp--;

                    stream_ordering_term.add(ordering_term203.getTree());

                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:299:27: ( COMMA ordering_term )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==COMMA) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:299:28: COMMA ordering_term
                    	    {
                    	    COMMA204=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_stmt1894);  
                    	    stream_COMMA.add(COMMA204);


                    	    pushFollow(FOLLOW_ordering_term_in_select_stmt1896);
                    	    ordering_term205=ordering_term();

                    	    state._fsp--;

                    	    stream_ordering_term.add(ordering_term205.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);


                    }
                    break;

            }


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:300:3: ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==LIMIT) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:300:4: LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )?
                    {
                    LIMIT206=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_select_stmt1905);  
                    stream_LIMIT.add(LIMIT206);


                    limit=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_select_stmt1909);  
                    stream_INTEGER.add(limit);


                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:300:24: ( ( OFFSET | COMMA ) offset= INTEGER )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==COMMA||LA66_0==OFFSET) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:300:25: ( OFFSET | COMMA ) offset= INTEGER
                            {
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:300:25: ( OFFSET | COMMA )
                            int alt65=2;
                            int LA65_0 = input.LA(1);

                            if ( (LA65_0==OFFSET) ) {
                                alt65=1;
                            }
                            else if ( (LA65_0==COMMA) ) {
                                alt65=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 65, 0, input);

                                throw nvae;

                            }
                            switch (alt65) {
                                case 1 :
                                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:300:26: OFFSET
                                    {
                                    OFFSET207=(Token)match(input,OFFSET,FOLLOW_OFFSET_in_select_stmt1913);  
                                    stream_OFFSET.add(OFFSET207);


                                    }
                                    break;
                                case 2 :
                                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:300:35: COMMA
                                    {
                                    COMMA208=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_stmt1917);  
                                    stream_COMMA.add(COMMA208);


                                    }
                                    break;

                            }


                            offset=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_select_stmt1922);  
                            stream_INTEGER.add(offset);


                            }
                            break;

                    }


                    }
                    break;

            }


            // AST REWRITE
            // elements: LIMIT, ordering_term, ORDER, select_list, limit, offset
            // token labels: limit, offset
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_limit=new RewriteRuleTokenStream(adaptor,"token limit",limit);
            RewriteRuleTokenStream stream_offset=new RewriteRuleTokenStream(adaptor,"token offset",offset);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 301:2: -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? )
            {
                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:301:4: ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SELECT, "SELECT")
                , root_1);

                adaptor.addChild(root_1, stream_select_list.nextTree());

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:302:22: ( ^( ORDER ( ordering_term )+ ) )?
                if ( stream_ordering_term.hasNext()||stream_ORDER.hasNext() ) {
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:302:22: ^( ORDER ( ordering_term )+ )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    stream_ORDER.nextNode()
                    , root_2);

                    if ( !(stream_ordering_term.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_ordering_term.hasNext() ) {
                        adaptor.addChild(root_2, stream_ordering_term.nextTree());

                    }
                    stream_ordering_term.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_ordering_term.reset();
                stream_ORDER.reset();

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:302:47: ( ^( LIMIT $limit ( $offset)? ) )?
                if ( stream_LIMIT.hasNext()||stream_limit.hasNext()||stream_offset.hasNext() ) {
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:302:47: ^( LIMIT $limit ( $offset)? )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    stream_LIMIT.nextNode()
                    , root_2);

                    adaptor.addChild(root_2, stream_limit.nextNode());

                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:302:63: ( $offset)?
                    if ( stream_offset.hasNext() ) {
                        adaptor.addChild(root_2, stream_offset.nextNode());

                    }
                    stream_offset.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_LIMIT.reset();
                stream_limit.reset();
                stream_offset.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "select_stmt"


    public static class select_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "select_list"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:305:1: select_list : select_core ( select_op ^ select_core )* ;
    public final SqlParser.select_list_return select_list() throws RecognitionException {
        SqlParser.select_list_return retval = new SqlParser.select_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SqlParser.select_core_return select_core209 =null;

        SqlParser.select_op_return select_op210 =null;

        SqlParser.select_core_return select_core211 =null;



        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:305:12: ( select_core ( select_op ^ select_core )* )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:306:3: select_core ( select_op ^ select_core )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_select_core_in_select_list1967);
            select_core209=select_core();

            state._fsp--;

            adaptor.addChild(root_0, select_core209.getTree());

            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:306:15: ( select_op ^ select_core )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==EXCEPT||LA68_0==INTERSECT||LA68_0==UNION) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:306:16: select_op ^ select_core
            	    {
            	    pushFollow(FOLLOW_select_op_in_select_list1970);
            	    select_op210=select_op();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(select_op210.getTree(), root_0);

            	    pushFollow(FOLLOW_select_core_in_select_list1973);
            	    select_core211=select_core();

            	    state._fsp--;

            	    adaptor.addChild(root_0, select_core211.getTree());

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "select_list"


    public static class select_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "select_op"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:308:1: select_op : ( UNION ^ ( ALL )? | INTERSECT | EXCEPT );
    public final SqlParser.select_op_return select_op() throws RecognitionException {
        SqlParser.select_op_return retval = new SqlParser.select_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token UNION212=null;
        Token ALL213=null;
        Token INTERSECT214=null;
        Token EXCEPT215=null;

        Object UNION212_tree=null;
        Object ALL213_tree=null;
        Object INTERSECT214_tree=null;
        Object EXCEPT215_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:308:10: ( UNION ^ ( ALL )? | INTERSECT | EXCEPT )
            int alt70=3;
            switch ( input.LA(1) ) {
            case UNION:
                {
                alt70=1;
                }
                break;
            case INTERSECT:
                {
                alt70=2;
                }
                break;
            case EXCEPT:
                {
                alt70=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;

            }

            switch (alt70) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:308:12: UNION ^ ( ALL )?
                    {
                    root_0 = (Object)adaptor.nil();


                    UNION212=(Token)match(input,UNION,FOLLOW_UNION_in_select_op1982); 
                    UNION212_tree = 
                    (Object)adaptor.create(UNION212)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(UNION212_tree, root_0);


                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:308:19: ( ALL )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==ALL) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:308:20: ALL
                            {
                            ALL213=(Token)match(input,ALL,FOLLOW_ALL_in_select_op1986); 
                            ALL213_tree = 
                            (Object)adaptor.create(ALL213)
                            ;
                            adaptor.addChild(root_0, ALL213_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:308:28: INTERSECT
                    {
                    root_0 = (Object)adaptor.nil();


                    INTERSECT214=(Token)match(input,INTERSECT,FOLLOW_INTERSECT_in_select_op1992); 
                    INTERSECT214_tree = 
                    (Object)adaptor.create(INTERSECT214)
                    ;
                    adaptor.addChild(root_0, INTERSECT214_tree);


                    }
                    break;
                case 3 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:308:40: EXCEPT
                    {
                    root_0 = (Object)adaptor.nil();


                    EXCEPT215=(Token)match(input,EXCEPT,FOLLOW_EXCEPT_in_select_op1996); 
                    EXCEPT215_tree = 
                    (Object)adaptor.create(EXCEPT215)
                    ;
                    adaptor.addChild(root_0, EXCEPT215_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "select_op"


    public static class select_core_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "select_core"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:310:1: select_core : SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )? -> ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? ) ;
    public final SqlParser.select_core_return select_core() throws RecognitionException {
        SqlParser.select_core_return retval = new SqlParser.select_core_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SELECT216=null;
        Token ALL217=null;
        Token DISTINCT218=null;
        Token COMMA220=null;
        Token FROM222=null;
        Token WHERE224=null;
        Token GROUP225=null;
        Token BY226=null;
        Token COMMA228=null;
        Token HAVING230=null;
        SqlParser.expr_return where_expr =null;

        SqlParser.expr_return having_expr =null;

        SqlParser.result_column_return result_column219 =null;

        SqlParser.result_column_return result_column221 =null;

        SqlParser.join_source_return join_source223 =null;

        SqlParser.ordering_term_return ordering_term227 =null;

        SqlParser.ordering_term_return ordering_term229 =null;


        Object SELECT216_tree=null;
        Object ALL217_tree=null;
        Object DISTINCT218_tree=null;
        Object COMMA220_tree=null;
        Object FROM222_tree=null;
        Object WHERE224_tree=null;
        Object GROUP225_tree=null;
        Object BY226_tree=null;
        Object COMMA228_tree=null;
        Object HAVING230_tree=null;
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleTokenStream stream_GROUP=new RewriteRuleTokenStream(adaptor,"token GROUP");
        RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
        RewriteRuleTokenStream stream_HAVING=new RewriteRuleTokenStream(adaptor,"token HAVING");
        RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_SELECT=new RewriteRuleTokenStream(adaptor,"token SELECT");
        RewriteRuleTokenStream stream_DISTINCT=new RewriteRuleTokenStream(adaptor,"token DISTINCT");
        RewriteRuleTokenStream stream_ALL=new RewriteRuleTokenStream(adaptor,"token ALL");
        RewriteRuleSubtreeStream stream_ordering_term=new RewriteRuleSubtreeStream(adaptor,"rule ordering_term");
        RewriteRuleSubtreeStream stream_result_column=new RewriteRuleSubtreeStream(adaptor,"rule result_column");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_join_source=new RewriteRuleSubtreeStream(adaptor,"rule join_source");
        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:310:12: ( SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )? -> ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? ) )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:311:3: SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )?
            {
            SELECT216=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_core2005);  
            stream_SELECT.add(SELECT216);


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:311:10: ( ALL | DISTINCT )?
            int alt71=3;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:311:11: ALL
                    {
                    ALL217=(Token)match(input,ALL,FOLLOW_ALL_in_select_core2008);  
                    stream_ALL.add(ALL217);


                    }
                    break;
                case 2 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:311:17: DISTINCT
                    {
                    DISTINCT218=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_select_core2012);  
                    stream_DISTINCT.add(DISTINCT218);


                    }
                    break;

            }


            pushFollow(FOLLOW_result_column_in_select_core2016);
            result_column219=result_column();

            state._fsp--;

            stream_result_column.add(result_column219.getTree());

            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:311:42: ( COMMA result_column )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==COMMA) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:311:43: COMMA result_column
            	    {
            	    COMMA220=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_core2019);  
            	    stream_COMMA.add(COMMA220);


            	    pushFollow(FOLLOW_result_column_in_select_core2021);
            	    result_column221=result_column();

            	    state._fsp--;

            	    stream_result_column.add(result_column221.getTree());

            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:311:65: ( FROM join_source )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==FROM) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:311:66: FROM join_source
                    {
                    FROM222=(Token)match(input,FROM,FOLLOW_FROM_in_select_core2026);  
                    stream_FROM.add(FROM222);


                    pushFollow(FOLLOW_join_source_in_select_core2028);
                    join_source223=join_source();

                    state._fsp--;

                    stream_join_source.add(join_source223.getTree());

                    }
                    break;

            }


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:311:85: ( WHERE where_expr= expr )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==WHERE) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:311:86: WHERE where_expr= expr
                    {
                    WHERE224=(Token)match(input,WHERE,FOLLOW_WHERE_in_select_core2033);  
                    stream_WHERE.add(WHERE224);


                    pushFollow(FOLLOW_expr_in_select_core2037);
                    where_expr=expr();

                    state._fsp--;

                    stream_expr.add(where_expr.getTree());

                    }
                    break;

            }


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:312:3: ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==GROUP) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:312:5: GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )?
                    {
                    GROUP225=(Token)match(input,GROUP,FOLLOW_GROUP_in_select_core2045);  
                    stream_GROUP.add(GROUP225);


                    BY226=(Token)match(input,BY,FOLLOW_BY_in_select_core2047);  
                    stream_BY.add(BY226);


                    pushFollow(FOLLOW_ordering_term_in_select_core2049);
                    ordering_term227=ordering_term();

                    state._fsp--;

                    stream_ordering_term.add(ordering_term227.getTree());

                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:312:28: ( COMMA ordering_term )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==COMMA) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:312:29: COMMA ordering_term
                    	    {
                    	    COMMA228=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_core2052);  
                    	    stream_COMMA.add(COMMA228);


                    	    pushFollow(FOLLOW_ordering_term_in_select_core2054);
                    	    ordering_term229=ordering_term();

                    	    state._fsp--;

                    	    stream_ordering_term.add(ordering_term229.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop75;
                        }
                    } while (true);


                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:312:51: ( HAVING having_expr= expr )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==HAVING) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:312:52: HAVING having_expr= expr
                            {
                            HAVING230=(Token)match(input,HAVING,FOLLOW_HAVING_in_select_core2059);  
                            stream_HAVING.add(HAVING230);


                            pushFollow(FOLLOW_expr_in_select_core2063);
                            having_expr=expr();

                            state._fsp--;

                            stream_expr.add(having_expr.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }


            // AST REWRITE
            // elements: WHERE, DISTINCT, ordering_term, join_source, FROM, result_column, having_expr, GROUP, where_expr, HAVING
            // token labels: 
            // rule labels: retval, having_expr, where_expr
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_having_expr=new RewriteRuleSubtreeStream(adaptor,"rule having_expr",having_expr!=null?having_expr.tree:null);
            RewriteRuleSubtreeStream stream_where_expr=new RewriteRuleSubtreeStream(adaptor,"rule where_expr",where_expr!=null?where_expr.tree:null);

            root_0 = (Object)adaptor.nil();
            // 313:2: -> ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? )
            {
                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:313:4: ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SELECT_CORE, "SELECT_CORE")
                , root_1);

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:314:15: ( DISTINCT )?
                if ( stream_DISTINCT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_DISTINCT.nextNode()
                    );

                }
                stream_DISTINCT.reset();

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:314:27: ^( COLUMNS ( result_column )+ )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COLUMNS, "COLUMNS")
                , root_2);

                if ( !(stream_result_column.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_result_column.hasNext() ) {
                    adaptor.addChild(root_2, stream_result_column.nextTree());

                }
                stream_result_column.reset();

                adaptor.addChild(root_1, root_2);
                }

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:314:53: ( ^( FROM join_source ) )?
                if ( stream_join_source.hasNext()||stream_FROM.hasNext() ) {
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:314:53: ^( FROM join_source )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    stream_FROM.nextNode()
                    , root_2);

                    adaptor.addChild(root_2, stream_join_source.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_join_source.reset();
                stream_FROM.reset();

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:314:74: ( ^( WHERE $where_expr) )?
                if ( stream_WHERE.hasNext()||stream_where_expr.hasNext() ) {
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:314:74: ^( WHERE $where_expr)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    stream_WHERE.nextNode()
                    , root_2);

                    adaptor.addChild(root_2, stream_where_expr.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_WHERE.reset();
                stream_where_expr.reset();

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:315:3: ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )?
                if ( stream_ordering_term.hasNext()||stream_having_expr.hasNext()||stream_GROUP.hasNext()||stream_HAVING.hasNext() ) {
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:315:3: ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    stream_GROUP.nextNode()
                    , root_2);

                    if ( !(stream_ordering_term.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_ordering_term.hasNext() ) {
                        adaptor.addChild(root_2, stream_ordering_term.nextTree());

                    }
                    stream_ordering_term.reset();

                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:315:26: ( ^( HAVING $having_expr) )?
                    if ( stream_having_expr.hasNext()||stream_HAVING.hasNext() ) {
                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:315:26: ^( HAVING $having_expr)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(
                        stream_HAVING.nextNode()
                        , root_3);

                        adaptor.addChild(root_3, stream_having_expr.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                    }
                    stream_having_expr.reset();
                    stream_HAVING.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_ordering_term.reset();
                stream_having_expr.reset();
                stream_GROUP.reset();
                stream_HAVING.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "select_core"


    public static class result_column_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "result_column"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:318:1: result_column : ( ASTERISK |table_name= id DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= id )? -> ^( ALIAS expr ( $column_alias)? ) );
    public final SqlParser.result_column_return result_column() throws RecognitionException {
        SqlParser.result_column_return retval = new SqlParser.result_column_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ASTERISK231=null;
        Token DOT232=null;
        Token ASTERISK233=null;
        Token AS235=null;
        SqlParser.id_return table_name =null;

        SqlParser.id_return column_alias =null;

        SqlParser.expr_return expr234 =null;


        Object ASTERISK231_tree=null;
        Object DOT232_tree=null;
        Object ASTERISK233_tree=null;
        Object AS235_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_ASTERISK=new RewriteRuleTokenStream(adaptor,"token ASTERISK");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:319:3: ( ASTERISK |table_name= id DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= id )? -> ^( ALIAS expr ( $column_alias)? ) )
            int alt80=3;
            alt80 = dfa80.predict(input);
            switch (alt80) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:319:5: ASTERISK
                    {
                    root_0 = (Object)adaptor.nil();


                    ASTERISK231=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_result_column2133); 
                    ASTERISK231_tree = 
                    (Object)adaptor.create(ASTERISK231)
                    ;
                    adaptor.addChild(root_0, ASTERISK231_tree);


                    }
                    break;
                case 2 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:320:5: table_name= id DOT ASTERISK
                    {
                    pushFollow(FOLLOW_id_in_result_column2141);
                    table_name=id();

                    state._fsp--;

                    stream_id.add(table_name.getTree());

                    DOT232=(Token)match(input,DOT,FOLLOW_DOT_in_result_column2143);  
                    stream_DOT.add(DOT232);


                    ASTERISK233=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_result_column2145);  
                    stream_ASTERISK.add(ASTERISK233);


                    // AST REWRITE
                    // elements: table_name, ASTERISK
                    // token labels: 
                    // rule labels: retval, table_name
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_table_name=new RewriteRuleSubtreeStream(adaptor,"rule table_name",table_name!=null?table_name.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 320:32: -> ^( ASTERISK $table_name)
                    {
                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:320:35: ^( ASTERISK $table_name)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ASTERISK.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_table_name.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:321:5: expr ( ( AS )? column_alias= id )?
                    {
                    pushFollow(FOLLOW_expr_in_result_column2160);
                    expr234=expr();

                    state._fsp--;

                    stream_expr.add(expr234.getTree());

                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:321:10: ( ( AS )? column_alias= id )?
                    int alt79=2;
                    alt79 = dfa79.predict(input);
                    switch (alt79) {
                        case 1 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:321:11: ( AS )? column_alias= id
                            {
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:321:11: ( AS )?
                            int alt78=2;
                            alt78 = dfa78.predict(input);
                            switch (alt78) {
                                case 1 :
                                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:321:12: AS
                                    {
                                    AS235=(Token)match(input,AS,FOLLOW_AS_in_result_column2164);  
                                    stream_AS.add(AS235);


                                    }
                                    break;

                            }


                            pushFollow(FOLLOW_id_in_result_column2170);
                            column_alias=id();

                            state._fsp--;

                            stream_id.add(column_alias.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: expr, column_alias
                    // token labels: 
                    // rule labels: retval, column_alias
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_column_alias=new RewriteRuleSubtreeStream(adaptor,"rule column_alias",column_alias!=null?column_alias.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 321:35: -> ^( ALIAS expr ( $column_alias)? )
                    {
                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:321:38: ^( ALIAS expr ( $column_alias)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ALIAS, "ALIAS")
                        , root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:321:52: ( $column_alias)?
                        if ( stream_column_alias.hasNext() ) {
                            adaptor.addChild(root_1, stream_column_alias.nextTree());

                        }
                        stream_column_alias.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "result_column"


    public static class join_source_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "join_source"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:323:1: join_source : single_source ( join_op ^ single_source ( join_constraint )? )* ;
    public final SqlParser.join_source_return join_source() throws RecognitionException {
        SqlParser.join_source_return retval = new SqlParser.join_source_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SqlParser.single_source_return single_source236 =null;

        SqlParser.join_op_return join_op237 =null;

        SqlParser.single_source_return single_source238 =null;

        SqlParser.join_constraint_return join_constraint239 =null;



        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:323:12: ( single_source ( join_op ^ single_source ( join_constraint )? )* )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:323:14: single_source ( join_op ^ single_source ( join_constraint )? )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_single_source_in_join_source2191);
            single_source236=single_source();

            state._fsp--;

            adaptor.addChild(root_0, single_source236.getTree());

            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:323:28: ( join_op ^ single_source ( join_constraint )? )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==COMMA||LA82_0==CROSS||LA82_0==INNER||LA82_0==JOIN||LA82_0==LEFT||LA82_0==NATURAL||LA82_0==OUTER) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:323:29: join_op ^ single_source ( join_constraint )?
            	    {
            	    pushFollow(FOLLOW_join_op_in_join_source2194);
            	    join_op237=join_op();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(join_op237.getTree(), root_0);

            	    pushFollow(FOLLOW_single_source_in_join_source2197);
            	    single_source238=single_source();

            	    state._fsp--;

            	    adaptor.addChild(root_0, single_source238.getTree());

            	    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:323:52: ( join_constraint )?
            	    int alt81=2;
            	    int LA81_0 = input.LA(1);

            	    if ( (LA81_0==ON||LA81_0==USING) ) {
            	        alt81=1;
            	    }
            	    switch (alt81) {
            	        case 1 :
            	            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:323:53: join_constraint
            	            {
            	            pushFollow(FOLLOW_join_constraint_in_join_source2200);
            	            join_constraint239=join_constraint();

            	            state._fsp--;

            	            adaptor.addChild(root_0, join_constraint239.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "join_source"


    public static class single_source_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "single_source"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:325:1: single_source : ( (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )? -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? ) | LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )? -> ^( ALIAS select_stmt ( $table_alias)? ) | LPAREN ! join_source RPAREN !);
    public final SqlParser.single_source_return single_source() throws RecognitionException {
        SqlParser.single_source_return retval = new SqlParser.single_source_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token table_name=null;
        Token table_alias=null;
        Token DOT240=null;
        Token AS241=null;
        Token INDEXED242=null;
        Token BY243=null;
        Token NOT244=null;
        Token INDEXED245=null;
        Token LPAREN246=null;
        Token RPAREN248=null;
        Token AS249=null;
        Token LPAREN250=null;
        Token RPAREN252=null;
        SqlParser.id_return database_name =null;

        SqlParser.id_return index_name =null;

        SqlParser.select_stmt_return select_stmt247 =null;

        SqlParser.join_source_return join_source251 =null;


        Object table_name_tree=null;
        Object table_alias_tree=null;
        Object DOT240_tree=null;
        Object AS241_tree=null;
        Object INDEXED242_tree=null;
        Object BY243_tree=null;
        Object NOT244_tree=null;
        Object INDEXED245_tree=null;
        Object LPAREN246_tree=null;
        Object RPAREN248_tree=null;
        Object AS249_tree=null;
        Object LPAREN250_tree=null;
        Object RPAREN252_tree=null;
        RewriteRuleTokenStream stream_INDEXED=new RewriteRuleTokenStream(adaptor,"token INDEXED");
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_select_stmt=new RewriteRuleSubtreeStream(adaptor,"rule select_stmt");
        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:326:3: ( (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )? -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? ) | LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )? -> ^( ALIAS select_stmt ( $table_alias)? ) | LPAREN ! join_source RPAREN !)
            int alt89=3;
            int LA89_0 = input.LA(1);

            if ( ((LA89_0 >= ABORT && LA89_0 <= AFTER)||(LA89_0 >= ALL && LA89_0 <= ALTER)||(LA89_0 >= ANALYZE && LA89_0 <= AND)||(LA89_0 >= AS && LA89_0 <= ASC)||(LA89_0 >= ATTACH && LA89_0 <= AUTOINCREMENT)||(LA89_0 >= BEFORE && LA89_0 <= BETWEEN)||LA89_0==BY||(LA89_0 >= CASCADE && LA89_0 <= COLLATE)||LA89_0==COLUMN||(LA89_0 >= COMMIT && LA89_0 <= CONSTRAINT)||LA89_0==CREATE||(LA89_0 >= CROSS && LA89_0 <= CURRENT_TIMESTAMP)||(LA89_0 >= DATABASE && LA89_0 <= DISTINCT)||LA89_0==DROP||(LA89_0 >= EACH && LA89_0 <= END)||(LA89_0 >= ESCAPE && LA89_0 <= EXPLAIN)||LA89_0==FAIL||(LA89_0 >= FOR && LA89_0 <= FROM)||LA89_0==GROUP||LA89_0==HAVING||LA89_0==ID||(LA89_0 >= IF && LA89_0 <= IMMEDIATE)||(LA89_0 >= INDEX && LA89_0 <= INSTEAD)||(LA89_0 >= INTERSECT && LA89_0 <= INTO)||LA89_0==IS||LA89_0==JOIN||LA89_0==KEY||LA89_0==LEFT||LA89_0==LIMIT||LA89_0==NATURAL||LA89_0==NULL||(LA89_0 >= OF && LA89_0 <= ON)||(LA89_0 >= OR && LA89_0 <= ORDER)||LA89_0==OUTER||LA89_0==PLAN||(LA89_0 >= PRAGMA && LA89_0 <= PRIMARY)||LA89_0==QUERY||(LA89_0 >= RAISE && LA89_0 <= REFERENCES)||(LA89_0 >= REINDEX && LA89_0 <= ROW)||(LA89_0 >= SAVEPOINT && LA89_0 <= SELECT)||LA89_0==SET||LA89_0==STRING||LA89_0==TABLE||(LA89_0 >= TEMPORARY && LA89_0 <= THEN)||(LA89_0 >= TO && LA89_0 <= TRIGGER)||(LA89_0 >= UNION && LA89_0 <= USING)||(LA89_0 >= VACUUM && LA89_0 <= VIRTUAL)||(LA89_0 >= WHEN && LA89_0 <= WHERE)) ) {
                alt89=1;
            }
            else if ( (LA89_0==LPAREN) ) {
                int LA89_4 = input.LA(2);

                if ( (LA89_4==SELECT) ) {
                    int LA89_5 = input.LA(3);

                    if ( ((LA89_5 >= ABORT && LA89_5 <= AFTER)||(LA89_5 >= ALL && LA89_5 <= ALTER)||(LA89_5 >= ANALYZE && LA89_5 <= AND)||(LA89_5 >= AS && LA89_5 <= AUTOINCREMENT)||(LA89_5 >= BEFORE && LA89_5 <= BETWEEN)||LA89_5==BLOB||LA89_5==BY||(LA89_5 >= CASCADE && LA89_5 <= COLUMN)||(LA89_5 >= COMMIT && LA89_5 <= CONSTRAINT)||LA89_5==CREATE||(LA89_5 >= CROSS && LA89_5 <= CURRENT_TIMESTAMP)||(LA89_5 >= DATABASE && LA89_5 <= DISTINCT)||LA89_5==DROP||(LA89_5 >= EACH && LA89_5 <= END)||(LA89_5 >= ESCAPE && LA89_5 <= EXPLAIN)||(LA89_5 >= FAIL && LA89_5 <= FLOAT)||(LA89_5 >= FOR && LA89_5 <= FROM)||LA89_5==GROUP||LA89_5==HAVING||LA89_5==ID||(LA89_5 >= IF && LA89_5 <= IMMEDIATE)||(LA89_5 >= INDEX && LA89_5 <= INTEGER)||(LA89_5 >= INTERSECT && LA89_5 <= INTO)||LA89_5==IS||LA89_5==JOIN||LA89_5==KEY||LA89_5==LEFT||LA89_5==LIMIT||LA89_5==LPAREN||LA89_5==MINUS||(LA89_5 >= NATURAL && LA89_5 <= NOT)||LA89_5==NULL||(LA89_5 >= OF && LA89_5 <= ON)||(LA89_5 >= OR && LA89_5 <= ORDER)||LA89_5==OUTER||(LA89_5 >= PLAN && LA89_5 <= PRIMARY)||(LA89_5 >= QUERY && LA89_5 <= QUESTION)||(LA89_5 >= RAISE && LA89_5 <= REFERENCES)||(LA89_5 >= REINDEX && LA89_5 <= ROW)||(LA89_5 >= SAVEPOINT && LA89_5 <= SELECT)||LA89_5==SET||LA89_5==STRING||LA89_5==TABLE||(LA89_5 >= TEMPORARY && LA89_5 <= TRIGGER)||(LA89_5 >= UNION && LA89_5 <= USING)||(LA89_5 >= VACUUM && LA89_5 <= VIRTUAL)||(LA89_5 >= WHEN && LA89_5 <= WHERE)) ) {
                        alt89=2;
                    }
                    else if ( (LA89_5==DOT) ) {
                        alt89=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 89, 5, input);

                        throw nvae;

                    }
                }
                else if ( ((LA89_4 >= ABORT && LA89_4 <= AFTER)||(LA89_4 >= ALL && LA89_4 <= ALTER)||(LA89_4 >= ANALYZE && LA89_4 <= AND)||(LA89_4 >= AS && LA89_4 <= ASC)||(LA89_4 >= ATTACH && LA89_4 <= AUTOINCREMENT)||(LA89_4 >= BEFORE && LA89_4 <= BETWEEN)||LA89_4==BY||(LA89_4 >= CASCADE && LA89_4 <= COLLATE)||LA89_4==COLUMN||(LA89_4 >= COMMIT && LA89_4 <= CONSTRAINT)||LA89_4==CREATE||(LA89_4 >= CROSS && LA89_4 <= CURRENT_TIMESTAMP)||(LA89_4 >= DATABASE && LA89_4 <= DISTINCT)||LA89_4==DROP||(LA89_4 >= EACH && LA89_4 <= END)||(LA89_4 >= ESCAPE && LA89_4 <= EXPLAIN)||LA89_4==FAIL||(LA89_4 >= FOR && LA89_4 <= FROM)||LA89_4==GROUP||LA89_4==HAVING||LA89_4==ID||(LA89_4 >= IF && LA89_4 <= IMMEDIATE)||(LA89_4 >= INDEX && LA89_4 <= INSTEAD)||(LA89_4 >= INTERSECT && LA89_4 <= INTO)||LA89_4==IS||LA89_4==JOIN||LA89_4==KEY||LA89_4==LEFT||LA89_4==LIMIT||LA89_4==LPAREN||LA89_4==NATURAL||LA89_4==NULL||(LA89_4 >= OF && LA89_4 <= ON)||(LA89_4 >= OR && LA89_4 <= ORDER)||LA89_4==OUTER||LA89_4==PLAN||(LA89_4 >= PRAGMA && LA89_4 <= PRIMARY)||LA89_4==QUERY||(LA89_4 >= RAISE && LA89_4 <= REFERENCES)||(LA89_4 >= REINDEX && LA89_4 <= ROW)||LA89_4==SAVEPOINT||LA89_4==SET||LA89_4==STRING||LA89_4==TABLE||(LA89_4 >= TEMPORARY && LA89_4 <= THEN)||(LA89_4 >= TO && LA89_4 <= TRIGGER)||(LA89_4 >= UNION && LA89_4 <= USING)||(LA89_4 >= VACUUM && LA89_4 <= VIRTUAL)||(LA89_4 >= WHEN && LA89_4 <= WHERE)) ) {
                    alt89=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 89, 4, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;

            }
            switch (alt89) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:326:5: (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )?
                    {
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:326:5: (database_name= id DOT )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==ID) ) {
                        int LA83_1 = input.LA(2);

                        if ( (LA83_1==DOT) ) {
                            alt83=1;
                        }
                    }
                    else if ( ((LA83_0 >= ABORT && LA83_0 <= AFTER)||(LA83_0 >= ALL && LA83_0 <= ALTER)||(LA83_0 >= ANALYZE && LA83_0 <= AND)||(LA83_0 >= AS && LA83_0 <= ASC)||(LA83_0 >= ATTACH && LA83_0 <= AUTOINCREMENT)||(LA83_0 >= BEFORE && LA83_0 <= BETWEEN)||LA83_0==BY||(LA83_0 >= CASCADE && LA83_0 <= COLLATE)||LA83_0==COLUMN||(LA83_0 >= COMMIT && LA83_0 <= CONSTRAINT)||LA83_0==CREATE||(LA83_0 >= CROSS && LA83_0 <= CURRENT_TIMESTAMP)||(LA83_0 >= DATABASE && LA83_0 <= DISTINCT)||LA83_0==DROP||(LA83_0 >= EACH && LA83_0 <= END)||(LA83_0 >= ESCAPE && LA83_0 <= EXPLAIN)||LA83_0==FAIL||(LA83_0 >= FOR && LA83_0 <= FROM)||LA83_0==GROUP||LA83_0==HAVING||(LA83_0 >= IF && LA83_0 <= IMMEDIATE)||(LA83_0 >= INDEX && LA83_0 <= INSTEAD)||(LA83_0 >= INTERSECT && LA83_0 <= INTO)||LA83_0==IS||LA83_0==JOIN||LA83_0==KEY||LA83_0==LEFT||LA83_0==LIMIT||LA83_0==NATURAL||LA83_0==NULL||(LA83_0 >= OF && LA83_0 <= ON)||(LA83_0 >= OR && LA83_0 <= ORDER)||LA83_0==OUTER||LA83_0==PLAN||(LA83_0 >= PRAGMA && LA83_0 <= PRIMARY)||LA83_0==QUERY||(LA83_0 >= RAISE && LA83_0 <= REFERENCES)||(LA83_0 >= REINDEX && LA83_0 <= ROW)||(LA83_0 >= SAVEPOINT && LA83_0 <= SELECT)||LA83_0==SET||LA83_0==STRING||LA83_0==TABLE||(LA83_0 >= TEMPORARY && LA83_0 <= THEN)||(LA83_0 >= TO && LA83_0 <= TRIGGER)||(LA83_0 >= UNION && LA83_0 <= USING)||(LA83_0 >= VACUUM && LA83_0 <= VIRTUAL)||(LA83_0 >= WHEN && LA83_0 <= WHERE)) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:326:6: database_name= id DOT
                            {
                            pushFollow(FOLLOW_id_in_single_source2217);
                            database_name=id();

                            state._fsp--;

                            stream_id.add(database_name.getTree());

                            DOT240=(Token)match(input,DOT,FOLLOW_DOT_in_single_source2219);  
                            stream_DOT.add(DOT240);


                            }
                            break;

                    }


                    table_name=(Token)match(input,ID,FOLLOW_ID_in_single_source2225);  
                    stream_ID.add(table_name);


                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:326:43: ( ( AS )? table_alias= ID )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==AS||LA85_0==ID) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:326:44: ( AS )? table_alias= ID
                            {
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:326:44: ( AS )?
                            int alt84=2;
                            int LA84_0 = input.LA(1);

                            if ( (LA84_0==AS) ) {
                                alt84=1;
                            }
                            switch (alt84) {
                                case 1 :
                                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:326:45: AS
                                    {
                                    AS241=(Token)match(input,AS,FOLLOW_AS_in_single_source2229);  
                                    stream_AS.add(AS241);


                                    }
                                    break;

                            }


                            table_alias=(Token)match(input,ID,FOLLOW_ID_in_single_source2235);  
                            stream_ID.add(table_alias);


                            }
                            break;

                    }


                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:326:67: ( INDEXED BY index_name= id | NOT INDEXED )?
                    int alt86=3;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==INDEXED) ) {
                        alt86=1;
                    }
                    else if ( (LA86_0==NOT) ) {
                        alt86=2;
                    }
                    switch (alt86) {
                        case 1 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:326:68: INDEXED BY index_name= id
                            {
                            INDEXED242=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_single_source2240);  
                            stream_INDEXED.add(INDEXED242);


                            BY243=(Token)match(input,BY,FOLLOW_BY_in_single_source2242);  
                            stream_BY.add(BY243);


                            pushFollow(FOLLOW_id_in_single_source2246);
                            index_name=id();

                            state._fsp--;

                            stream_id.add(index_name.getTree());

                            }
                            break;
                        case 2 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:326:95: NOT INDEXED
                            {
                            NOT244=(Token)match(input,NOT,FOLLOW_NOT_in_single_source2250);  
                            stream_NOT.add(NOT244);


                            INDEXED245=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_single_source2252);  
                            stream_INDEXED.add(INDEXED245);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: INDEXED, table_name, NOT, index_name, table_alias, database_name
                    // token labels: table_name, table_alias
                    // rule labels: database_name, index_name, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_table_name=new RewriteRuleTokenStream(adaptor,"token table_name",table_name);
                    RewriteRuleTokenStream stream_table_alias=new RewriteRuleTokenStream(adaptor,"token table_alias",table_alias);
                    RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
                    RewriteRuleSubtreeStream stream_index_name=new RewriteRuleSubtreeStream(adaptor,"rule index_name",index_name!=null?index_name.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 327:3: -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? )
                    {
                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:327:6: ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ALIAS, "ALIAS")
                        , root_1);

                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:327:14: ^( $table_name ( $database_name)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:327:29: ( $database_name)?
                        if ( stream_database_name.hasNext() ) {
                            adaptor.addChild(root_2, stream_database_name.nextTree());

                        }
                        stream_database_name.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:327:46: ( $table_alias)?
                        if ( stream_table_alias.hasNext() ) {
                            adaptor.addChild(root_1, stream_table_alias.nextNode());

                        }
                        stream_table_alias.reset();

                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:327:59: ( ^( INDEXED ( NOT )? ( $index_name)? ) )?
                        if ( stream_INDEXED.hasNext()||stream_NOT.hasNext()||stream_index_name.hasNext() ) {
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:327:59: ^( INDEXED ( NOT )? ( $index_name)? )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot(
                            stream_INDEXED.nextNode()
                            , root_2);

                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:327:69: ( NOT )?
                            if ( stream_NOT.hasNext() ) {
                                adaptor.addChild(root_2, 
                                stream_NOT.nextNode()
                                );

                            }
                            stream_NOT.reset();

                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:327:75: ( $index_name)?
                            if ( stream_index_name.hasNext() ) {
                                adaptor.addChild(root_2, stream_index_name.nextTree());

                            }
                            stream_index_name.reset();

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_INDEXED.reset();
                        stream_NOT.reset();
                        stream_index_name.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:328:5: LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )?
                    {
                    LPAREN246=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_single_source2293);  
                    stream_LPAREN.add(LPAREN246);


                    pushFollow(FOLLOW_select_stmt_in_single_source2295);
                    select_stmt247=select_stmt();

                    state._fsp--;

                    stream_select_stmt.add(select_stmt247.getTree());

                    RPAREN248=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_single_source2297);  
                    stream_RPAREN.add(RPAREN248);


                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:328:31: ( ( AS )? table_alias= ID )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==AS||LA88_0==ID) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:328:32: ( AS )? table_alias= ID
                            {
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:328:32: ( AS )?
                            int alt87=2;
                            int LA87_0 = input.LA(1);

                            if ( (LA87_0==AS) ) {
                                alt87=1;
                            }
                            switch (alt87) {
                                case 1 :
                                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:328:33: AS
                                    {
                                    AS249=(Token)match(input,AS,FOLLOW_AS_in_single_source2301);  
                                    stream_AS.add(AS249);


                                    }
                                    break;

                            }


                            table_alias=(Token)match(input,ID,FOLLOW_ID_in_single_source2307);  
                            stream_ID.add(table_alias);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: select_stmt, table_alias
                    // token labels: table_alias
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_table_alias=new RewriteRuleTokenStream(adaptor,"token table_alias",table_alias);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 329:3: -> ^( ALIAS select_stmt ( $table_alias)? )
                    {
                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:329:6: ^( ALIAS select_stmt ( $table_alias)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ALIAS, "ALIAS")
                        , root_1);

                        adaptor.addChild(root_1, stream_select_stmt.nextTree());

                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:329:27: ( $table_alias)?
                        if ( stream_table_alias.hasNext() ) {
                            adaptor.addChild(root_1, stream_table_alias.nextNode());

                        }
                        stream_table_alias.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:330:5: LPAREN ! join_source RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    LPAREN250=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_single_source2329); 

                    pushFollow(FOLLOW_join_source_in_single_source2332);
                    join_source251=join_source();

                    state._fsp--;

                    adaptor.addChild(root_0, join_source251.getTree());

                    RPAREN252=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_single_source2334); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "single_source"


    public static class join_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "join_op"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:332:1: join_op : ( COMMA | ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN ^);
    public final SqlParser.join_op_return join_op() throws RecognitionException {
        SqlParser.join_op_return retval = new SqlParser.join_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA253=null;
        Token NATURAL254=null;
        Token LEFT255=null;
        Token OUTER256=null;
        Token INNER257=null;
        Token CROSS258=null;
        Token JOIN259=null;

        Object COMMA253_tree=null;
        Object NATURAL254_tree=null;
        Object LEFT255_tree=null;
        Object OUTER256_tree=null;
        Object INNER257_tree=null;
        Object CROSS258_tree=null;
        Object JOIN259_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:333:3: ( COMMA | ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN ^)
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==COMMA) ) {
                alt94=1;
            }
            else if ( (LA94_0==CROSS||LA94_0==INNER||LA94_0==JOIN||LA94_0==LEFT||LA94_0==NATURAL||LA94_0==OUTER) ) {
                alt94=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;

            }
            switch (alt94) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:333:5: COMMA
                    {
                    root_0 = (Object)adaptor.nil();


                    COMMA253=(Token)match(input,COMMA,FOLLOW_COMMA_in_join_op2345); 
                    COMMA253_tree = 
                    (Object)adaptor.create(COMMA253)
                    ;
                    adaptor.addChild(root_0, COMMA253_tree);


                    }
                    break;
                case 2 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:334:5: ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN ^
                    {
                    root_0 = (Object)adaptor.nil();


                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:334:5: ( NATURAL )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==NATURAL) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:334:6: NATURAL
                            {
                            NATURAL254=(Token)match(input,NATURAL,FOLLOW_NATURAL_in_join_op2352); 
                            NATURAL254_tree = 
                            (Object)adaptor.create(NATURAL254)
                            ;
                            adaptor.addChild(root_0, NATURAL254_tree);


                            }
                            break;

                    }


                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:334:16: ( ( LEFT )? ( OUTER )? | INNER | CROSS )
                    int alt93=3;
                    switch ( input.LA(1) ) {
                    case JOIN:
                    case LEFT:
                    case OUTER:
                        {
                        alt93=1;
                        }
                        break;
                    case INNER:
                        {
                        alt93=2;
                        }
                        break;
                    case CROSS:
                        {
                        alt93=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 93, 0, input);

                        throw nvae;

                    }

                    switch (alt93) {
                        case 1 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:334:17: ( LEFT )? ( OUTER )?
                            {
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:334:17: ( LEFT )?
                            int alt91=2;
                            int LA91_0 = input.LA(1);

                            if ( (LA91_0==LEFT) ) {
                                alt91=1;
                            }
                            switch (alt91) {
                                case 1 :
                                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:334:18: LEFT
                                    {
                                    LEFT255=(Token)match(input,LEFT,FOLLOW_LEFT_in_join_op2358); 
                                    LEFT255_tree = 
                                    (Object)adaptor.create(LEFT255)
                                    ;
                                    adaptor.addChild(root_0, LEFT255_tree);


                                    }
                                    break;

                            }


                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:334:25: ( OUTER )?
                            int alt92=2;
                            int LA92_0 = input.LA(1);

                            if ( (LA92_0==OUTER) ) {
                                alt92=1;
                            }
                            switch (alt92) {
                                case 1 :
                                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:334:26: OUTER
                                    {
                                    OUTER256=(Token)match(input,OUTER,FOLLOW_OUTER_in_join_op2363); 
                                    OUTER256_tree = 
                                    (Object)adaptor.create(OUTER256)
                                    ;
                                    adaptor.addChild(root_0, OUTER256_tree);


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:334:36: INNER
                            {
                            INNER257=(Token)match(input,INNER,FOLLOW_INNER_in_join_op2369); 
                            INNER257_tree = 
                            (Object)adaptor.create(INNER257)
                            ;
                            adaptor.addChild(root_0, INNER257_tree);


                            }
                            break;
                        case 3 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:334:44: CROSS
                            {
                            CROSS258=(Token)match(input,CROSS,FOLLOW_CROSS_in_join_op2373); 
                            CROSS258_tree = 
                            (Object)adaptor.create(CROSS258)
                            ;
                            adaptor.addChild(root_0, CROSS258_tree);


                            }
                            break;

                    }


                    JOIN259=(Token)match(input,JOIN,FOLLOW_JOIN_in_join_op2376); 
                    JOIN259_tree = 
                    (Object)adaptor.create(JOIN259)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(JOIN259_tree, root_0);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "join_op"


    public static class join_constraint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "join_constraint"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:336:1: join_constraint : ( ON ^ expr | USING LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN -> ^( USING ( $column_names)+ ) );
    public final SqlParser.join_constraint_return join_constraint() throws RecognitionException {
        SqlParser.join_constraint_return retval = new SqlParser.join_constraint_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ON260=null;
        Token USING262=null;
        Token LPAREN263=null;
        Token COMMA264=null;
        Token RPAREN265=null;
        List list_column_names=null;
        SqlParser.expr_return expr261 =null;

        RuleReturnScope column_names = null;
        Object ON260_tree=null;
        Object USING262_tree=null;
        Object LPAREN263_tree=null;
        Object COMMA264_tree=null;
        Object RPAREN265_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_USING=new RewriteRuleTokenStream(adaptor,"token USING");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:337:3: ( ON ^ expr | USING LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN -> ^( USING ( $column_names)+ ) )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==ON) ) {
                alt96=1;
            }
            else if ( (LA96_0==USING) ) {
                alt96=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;

            }
            switch (alt96) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:337:5: ON ^ expr
                    {
                    root_0 = (Object)adaptor.nil();


                    ON260=(Token)match(input,ON,FOLLOW_ON_in_join_constraint2387); 
                    ON260_tree = 
                    (Object)adaptor.create(ON260)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ON260_tree, root_0);


                    pushFollow(FOLLOW_expr_in_join_constraint2390);
                    expr261=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr261.getTree());

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:338:5: USING LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN
                    {
                    USING262=(Token)match(input,USING,FOLLOW_USING_in_join_constraint2396);  
                    stream_USING.add(USING262);


                    LPAREN263=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_join_constraint2398);  
                    stream_LPAREN.add(LPAREN263);


                    pushFollow(FOLLOW_id_in_join_constraint2402);
                    column_names=id();

                    state._fsp--;

                    stream_id.add(column_names.getTree());
                    if (list_column_names==null) list_column_names=new ArrayList();
                    list_column_names.add(column_names.getTree());


                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:338:35: ( COMMA column_names+= id )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==COMMA) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:338:36: COMMA column_names+= id
                    	    {
                    	    COMMA264=(Token)match(input,COMMA,FOLLOW_COMMA_in_join_constraint2405);  
                    	    stream_COMMA.add(COMMA264);


                    	    pushFollow(FOLLOW_id_in_join_constraint2409);
                    	    column_names=id();

                    	    state._fsp--;

                    	    stream_id.add(column_names.getTree());
                    	    if (list_column_names==null) list_column_names=new ArrayList();
                    	    list_column_names.add(column_names.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop95;
                        }
                    } while (true);


                    RPAREN265=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_join_constraint2413);  
                    stream_RPAREN.add(RPAREN265);


                    // AST REWRITE
                    // elements: USING, column_names
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: column_names
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_column_names=new RewriteRuleSubtreeStream(adaptor,"token column_names",list_column_names);
                    root_0 = (Object)adaptor.nil();
                    // 338:68: -> ^( USING ( $column_names)+ )
                    {
                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:338:71: ^( USING ( $column_names)+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_USING.nextNode()
                        , root_1);

                        if ( !(stream_column_names.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_column_names.hasNext() ) {
                            adaptor.addChild(root_1, stream_column_names.nextTree());

                        }
                        stream_column_names.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "join_constraint"


    public static class insert_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "insert_stmt"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:341:1: insert_stmt : ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= id DOT )? table_name= id ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES ) ;
    public final SqlParser.insert_stmt_return insert_stmt() throws RecognitionException {
        SqlParser.insert_stmt_return retval = new SqlParser.insert_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INSERT266=null;
        Token REPLACE268=null;
        Token INTO269=null;
        Token DOT270=null;
        Token LPAREN271=null;
        Token COMMA272=null;
        Token RPAREN273=null;
        Token VALUES274=null;
        Token LPAREN275=null;
        Token COMMA276=null;
        Token RPAREN277=null;
        Token DEFAULT279=null;
        Token VALUES280=null;
        List list_column_names=null;
        List list_values=null;
        SqlParser.id_return database_name =null;

        SqlParser.id_return table_name =null;

        SqlParser.operation_conflict_clause_return operation_conflict_clause267 =null;

        SqlParser.select_stmt_return select_stmt278 =null;

        RuleReturnScope column_names = null;
        RuleReturnScope values = null;
        Object INSERT266_tree=null;
        Object REPLACE268_tree=null;
        Object INTO269_tree=null;
        Object DOT270_tree=null;
        Object LPAREN271_tree=null;
        Object COMMA272_tree=null;
        Object RPAREN273_tree=null;
        Object VALUES274_tree=null;
        Object LPAREN275_tree=null;
        Object COMMA276_tree=null;
        Object RPAREN277_tree=null;
        Object DEFAULT279_tree=null;
        Object VALUES280_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:341:12: ( ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= id DOT )? table_name= id ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES ) )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:341:14: ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= id DOT )? table_name= id ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES )
            {
            root_0 = (Object)adaptor.nil();


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:341:14: ( INSERT ( operation_conflict_clause )? | REPLACE )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==INSERT) ) {
                alt98=1;
            }
            else if ( (LA98_0==REPLACE) ) {
                alt98=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;

            }
            switch (alt98) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:341:15: INSERT ( operation_conflict_clause )?
                    {
                    INSERT266=(Token)match(input,INSERT,FOLLOW_INSERT_in_insert_stmt2432); 
                    INSERT266_tree = 
                    (Object)adaptor.create(INSERT266)
                    ;
                    adaptor.addChild(root_0, INSERT266_tree);


                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:341:22: ( operation_conflict_clause )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==OR) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:341:23: operation_conflict_clause
                            {
                            pushFollow(FOLLOW_operation_conflict_clause_in_insert_stmt2435);
                            operation_conflict_clause267=operation_conflict_clause();

                            state._fsp--;

                            adaptor.addChild(root_0, operation_conflict_clause267.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:341:53: REPLACE
                    {
                    REPLACE268=(Token)match(input,REPLACE,FOLLOW_REPLACE_in_insert_stmt2441); 
                    REPLACE268_tree = 
                    (Object)adaptor.create(REPLACE268)
                    ;
                    adaptor.addChild(root_0, REPLACE268_tree);


                    }
                    break;

            }


            INTO269=(Token)match(input,INTO,FOLLOW_INTO_in_insert_stmt2444); 
            INTO269_tree = 
            (Object)adaptor.create(INTO269)
            ;
            adaptor.addChild(root_0, INTO269_tree);


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:341:67: (database_name= id DOT )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==ID||LA99_0==STRING) ) {
                int LA99_1 = input.LA(2);

                if ( (LA99_1==DOT) ) {
                    alt99=1;
                }
            }
            else if ( ((LA99_0 >= ABORT && LA99_0 <= AFTER)||(LA99_0 >= ALL && LA99_0 <= ALTER)||(LA99_0 >= ANALYZE && LA99_0 <= AND)||(LA99_0 >= AS && LA99_0 <= ASC)||(LA99_0 >= ATTACH && LA99_0 <= AUTOINCREMENT)||(LA99_0 >= BEFORE && LA99_0 <= BETWEEN)||LA99_0==BY||(LA99_0 >= CASCADE && LA99_0 <= COLLATE)||LA99_0==COLUMN||(LA99_0 >= COMMIT && LA99_0 <= CONSTRAINT)||LA99_0==CREATE||(LA99_0 >= CROSS && LA99_0 <= CURRENT_TIMESTAMP)||(LA99_0 >= DATABASE && LA99_0 <= DISTINCT)||LA99_0==DROP||(LA99_0 >= EACH && LA99_0 <= END)||(LA99_0 >= ESCAPE && LA99_0 <= EXPLAIN)||LA99_0==FAIL||(LA99_0 >= FOR && LA99_0 <= FROM)||LA99_0==GROUP||LA99_0==HAVING||(LA99_0 >= IF && LA99_0 <= IMMEDIATE)||(LA99_0 >= INDEX && LA99_0 <= INSTEAD)||(LA99_0 >= INTERSECT && LA99_0 <= INTO)||LA99_0==IS||LA99_0==JOIN||LA99_0==KEY||LA99_0==LEFT||LA99_0==LIMIT||LA99_0==NATURAL||LA99_0==NULL||(LA99_0 >= OF && LA99_0 <= ON)||(LA99_0 >= OR && LA99_0 <= ORDER)||LA99_0==OUTER||LA99_0==PLAN||(LA99_0 >= PRAGMA && LA99_0 <= PRIMARY)||LA99_0==QUERY||(LA99_0 >= RAISE && LA99_0 <= REFERENCES)||(LA99_0 >= REINDEX && LA99_0 <= ROW)||(LA99_0 >= SAVEPOINT && LA99_0 <= SELECT)||LA99_0==SET||LA99_0==TABLE||(LA99_0 >= TEMPORARY && LA99_0 <= THEN)||(LA99_0 >= TO && LA99_0 <= TRIGGER)||(LA99_0 >= UNION && LA99_0 <= USING)||(LA99_0 >= VACUUM && LA99_0 <= VIRTUAL)||(LA99_0 >= WHEN && LA99_0 <= WHERE)) ) {
                int LA99_2 = input.LA(2);

                if ( (LA99_2==DOT) ) {
                    alt99=1;
                }
            }
            switch (alt99) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:341:68: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_insert_stmt2449);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());

                    DOT270=(Token)match(input,DOT,FOLLOW_DOT_in_insert_stmt2451); 
                    DOT270_tree = 
                    (Object)adaptor.create(DOT270)
                    ;
                    adaptor.addChild(root_0, DOT270_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_id_in_insert_stmt2457);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());

            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:342:3: ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==LPAREN||LA104_0==SELECT||LA104_0==VALUES) ) {
                alt104=1;
            }
            else if ( (LA104_0==DEFAULT) ) {
                alt104=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;

            }
            switch (alt104) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:342:5: ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt )
                    {
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:342:5: ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==LPAREN) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:342:6: LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN
                            {
                            LPAREN271=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_stmt2464); 
                            LPAREN271_tree = 
                            (Object)adaptor.create(LPAREN271)
                            ;
                            adaptor.addChild(root_0, LPAREN271_tree);


                            pushFollow(FOLLOW_id_in_insert_stmt2468);
                            column_names=id();

                            state._fsp--;

                            adaptor.addChild(root_0, column_names.getTree());
                            if (list_column_names==null) list_column_names=new ArrayList();
                            list_column_names.add(column_names.getTree());


                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:342:30: ( COMMA column_names+= id )*
                            loop100:
                            do {
                                int alt100=2;
                                int LA100_0 = input.LA(1);

                                if ( (LA100_0==COMMA) ) {
                                    alt100=1;
                                }


                                switch (alt100) {
                            	case 1 :
                            	    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:342:31: COMMA column_names+= id
                            	    {
                            	    COMMA272=(Token)match(input,COMMA,FOLLOW_COMMA_in_insert_stmt2471); 
                            	    COMMA272_tree = 
                            	    (Object)adaptor.create(COMMA272)
                            	    ;
                            	    adaptor.addChild(root_0, COMMA272_tree);


                            	    pushFollow(FOLLOW_id_in_insert_stmt2475);
                            	    column_names=id();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, column_names.getTree());
                            	    if (list_column_names==null) list_column_names=new ArrayList();
                            	    list_column_names.add(column_names.getTree());


                            	    }
                            	    break;

                            	default :
                            	    break loop100;
                                }
                            } while (true);


                            RPAREN273=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_stmt2479); 
                            RPAREN273_tree = 
                            (Object)adaptor.create(RPAREN273)
                            ;
                            adaptor.addChild(root_0, RPAREN273_tree);


                            }
                            break;

                    }


                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:343:5: ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt )
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==VALUES) ) {
                        alt103=1;
                    }
                    else if ( (LA103_0==SELECT) ) {
                        alt103=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 103, 0, input);

                        throw nvae;

                    }
                    switch (alt103) {
                        case 1 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:343:6: VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN
                            {
                            VALUES274=(Token)match(input,VALUES,FOLLOW_VALUES_in_insert_stmt2488); 
                            VALUES274_tree = 
                            (Object)adaptor.create(VALUES274)
                            ;
                            adaptor.addChild(root_0, VALUES274_tree);


                            LPAREN275=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_stmt2490); 
                            LPAREN275_tree = 
                            (Object)adaptor.create(LPAREN275)
                            ;
                            adaptor.addChild(root_0, LPAREN275_tree);


                            pushFollow(FOLLOW_expr_in_insert_stmt2494);
                            values=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, values.getTree());
                            if (list_values==null) list_values=new ArrayList();
                            list_values.add(values.getTree());


                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:343:33: ( COMMA values+= expr )*
                            loop102:
                            do {
                                int alt102=2;
                                int LA102_0 = input.LA(1);

                                if ( (LA102_0==COMMA) ) {
                                    alt102=1;
                                }


                                switch (alt102) {
                            	case 1 :
                            	    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:343:34: COMMA values+= expr
                            	    {
                            	    COMMA276=(Token)match(input,COMMA,FOLLOW_COMMA_in_insert_stmt2497); 
                            	    COMMA276_tree = 
                            	    (Object)adaptor.create(COMMA276)
                            	    ;
                            	    adaptor.addChild(root_0, COMMA276_tree);


                            	    pushFollow(FOLLOW_expr_in_insert_stmt2501);
                            	    values=expr();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, values.getTree());
                            	    if (list_values==null) list_values=new ArrayList();
                            	    list_values.add(values.getTree());


                            	    }
                            	    break;

                            	default :
                            	    break loop102;
                                }
                            } while (true);


                            RPAREN277=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_stmt2505); 
                            RPAREN277_tree = 
                            (Object)adaptor.create(RPAREN277)
                            ;
                            adaptor.addChild(root_0, RPAREN277_tree);


                            }
                            break;
                        case 2 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:343:64: select_stmt
                            {
                            pushFollow(FOLLOW_select_stmt_in_insert_stmt2509);
                            select_stmt278=select_stmt();

                            state._fsp--;

                            adaptor.addChild(root_0, select_stmt278.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:344:5: DEFAULT VALUES
                    {
                    DEFAULT279=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_insert_stmt2516); 
                    DEFAULT279_tree = 
                    (Object)adaptor.create(DEFAULT279)
                    ;
                    adaptor.addChild(root_0, DEFAULT279_tree);


                    VALUES280=(Token)match(input,VALUES,FOLLOW_VALUES_in_insert_stmt2518); 
                    VALUES280_tree = 
                    (Object)adaptor.create(VALUES280)
                    ;
                    adaptor.addChild(root_0, VALUES280_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "insert_stmt"


    public static class update_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "update_stmt"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:347:1: update_stmt : UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )? ;
    public final SqlParser.update_stmt_return update_stmt() throws RecognitionException {
        SqlParser.update_stmt_return retval = new SqlParser.update_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token UPDATE281=null;
        Token SET284=null;
        Token COMMA285=null;
        Token WHERE286=null;
        List list_values=null;
        SqlParser.operation_conflict_clause_return operation_conflict_clause282 =null;

        SqlParser.qualified_table_name_return qualified_table_name283 =null;

        SqlParser.expr_return expr287 =null;

        SqlParser.operation_limited_clause_return operation_limited_clause288 =null;

        RuleReturnScope values = null;
        Object UPDATE281_tree=null;
        Object SET284_tree=null;
        Object COMMA285_tree=null;
        Object WHERE286_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:347:12: ( UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )? )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:347:14: UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )?
            {
            root_0 = (Object)adaptor.nil();


            UPDATE281=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_update_stmt2528); 
            UPDATE281_tree = 
            (Object)adaptor.create(UPDATE281)
            ;
            adaptor.addChild(root_0, UPDATE281_tree);


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:347:21: ( operation_conflict_clause )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==OR) ) {
                int LA105_1 = input.LA(2);

                if ( (LA105_1==ABORT||LA105_1==FAIL||LA105_1==IGNORE||LA105_1==REPLACE||LA105_1==ROLLBACK) ) {
                    alt105=1;
                }
            }
            switch (alt105) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:347:22: operation_conflict_clause
                    {
                    pushFollow(FOLLOW_operation_conflict_clause_in_update_stmt2531);
                    operation_conflict_clause282=operation_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, operation_conflict_clause282.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_qualified_table_name_in_update_stmt2535);
            qualified_table_name283=qualified_table_name();

            state._fsp--;

            adaptor.addChild(root_0, qualified_table_name283.getTree());

            SET284=(Token)match(input,SET,FOLLOW_SET_in_update_stmt2539); 
            SET284_tree = 
            (Object)adaptor.create(SET284)
            ;
            adaptor.addChild(root_0, SET284_tree);


            pushFollow(FOLLOW_update_set_in_update_stmt2543);
            values=update_set();

            state._fsp--;

            adaptor.addChild(root_0, values.getTree());
            if (list_values==null) list_values=new ArrayList();
            list_values.add(values.getTree());


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:348:26: ( COMMA values+= update_set )*
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==COMMA) ) {
                    alt106=1;
                }


                switch (alt106) {
            	case 1 :
            	    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:348:27: COMMA values+= update_set
            	    {
            	    COMMA285=(Token)match(input,COMMA,FOLLOW_COMMA_in_update_stmt2546); 
            	    COMMA285_tree = 
            	    (Object)adaptor.create(COMMA285)
            	    ;
            	    adaptor.addChild(root_0, COMMA285_tree);


            	    pushFollow(FOLLOW_update_set_in_update_stmt2550);
            	    values=update_set();

            	    state._fsp--;

            	    adaptor.addChild(root_0, values.getTree());
            	    if (list_values==null) list_values=new ArrayList();
            	    list_values.add(values.getTree());


            	    }
            	    break;

            	default :
            	    break loop106;
                }
            } while (true);


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:348:54: ( WHERE expr )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==WHERE) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:348:55: WHERE expr
                    {
                    WHERE286=(Token)match(input,WHERE,FOLLOW_WHERE_in_update_stmt2555); 
                    WHERE286_tree = 
                    (Object)adaptor.create(WHERE286)
                    ;
                    adaptor.addChild(root_0, WHERE286_tree);


                    pushFollow(FOLLOW_expr_in_update_stmt2557);
                    expr287=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr287.getTree());

                    }
                    break;

            }


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:348:68: ( operation_limited_clause )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==LIMIT||LA108_0==ORDER) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:348:69: operation_limited_clause
                    {
                    pushFollow(FOLLOW_operation_limited_clause_in_update_stmt2562);
                    operation_limited_clause288=operation_limited_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, operation_limited_clause288.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "update_stmt"


    public static class update_set_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "update_set"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:350:1: update_set : column_name= id EQUALS expr ;
    public final SqlParser.update_set_return update_set() throws RecognitionException {
        SqlParser.update_set_return retval = new SqlParser.update_set_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EQUALS289=null;
        SqlParser.id_return column_name =null;

        SqlParser.expr_return expr290 =null;


        Object EQUALS289_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:350:11: (column_name= id EQUALS expr )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:350:13: column_name= id EQUALS expr
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_id_in_update_set2573);
            column_name=id();

            state._fsp--;

            adaptor.addChild(root_0, column_name.getTree());

            EQUALS289=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_update_set2575); 
            EQUALS289_tree = 
            (Object)adaptor.create(EQUALS289)
            ;
            adaptor.addChild(root_0, EQUALS289_tree);


            pushFollow(FOLLOW_expr_in_update_set2577);
            expr290=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr290.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "update_set"


    public static class delete_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "delete_stmt"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:353:1: delete_stmt : DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )? ;
    public final SqlParser.delete_stmt_return delete_stmt() throws RecognitionException {
        SqlParser.delete_stmt_return retval = new SqlParser.delete_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DELETE291=null;
        Token FROM292=null;
        Token WHERE294=null;
        SqlParser.qualified_table_name_return qualified_table_name293 =null;

        SqlParser.expr_return expr295 =null;

        SqlParser.operation_limited_clause_return operation_limited_clause296 =null;


        Object DELETE291_tree=null;
        Object FROM292_tree=null;
        Object WHERE294_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:353:12: ( DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )? )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:353:14: DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )?
            {
            root_0 = (Object)adaptor.nil();


            DELETE291=(Token)match(input,DELETE,FOLLOW_DELETE_in_delete_stmt2585); 
            DELETE291_tree = 
            (Object)adaptor.create(DELETE291)
            ;
            adaptor.addChild(root_0, DELETE291_tree);


            FROM292=(Token)match(input,FROM,FOLLOW_FROM_in_delete_stmt2587); 
            FROM292_tree = 
            (Object)adaptor.create(FROM292)
            ;
            adaptor.addChild(root_0, FROM292_tree);


            pushFollow(FOLLOW_qualified_table_name_in_delete_stmt2589);
            qualified_table_name293=qualified_table_name();

            state._fsp--;

            adaptor.addChild(root_0, qualified_table_name293.getTree());

            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:353:47: ( WHERE expr )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==WHERE) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:353:48: WHERE expr
                    {
                    WHERE294=(Token)match(input,WHERE,FOLLOW_WHERE_in_delete_stmt2592); 
                    WHERE294_tree = 
                    (Object)adaptor.create(WHERE294)
                    ;
                    adaptor.addChild(root_0, WHERE294_tree);


                    pushFollow(FOLLOW_expr_in_delete_stmt2594);
                    expr295=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr295.getTree());

                    }
                    break;

            }


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:353:61: ( operation_limited_clause )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==LIMIT||LA110_0==ORDER) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:353:62: operation_limited_clause
                    {
                    pushFollow(FOLLOW_operation_limited_clause_in_delete_stmt2599);
                    operation_limited_clause296=operation_limited_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, operation_limited_clause296.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "delete_stmt"


    public static class begin_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "begin_stmt"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:356:1: begin_stmt : BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )? ;
    public final SqlParser.begin_stmt_return begin_stmt() throws RecognitionException {
        SqlParser.begin_stmt_return retval = new SqlParser.begin_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BEGIN297=null;
        Token set298=null;
        Token TRANSACTION299=null;

        Object BEGIN297_tree=null;
        Object set298_tree=null;
        Object TRANSACTION299_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:356:11: ( BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )? )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:356:13: BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )?
            {
            root_0 = (Object)adaptor.nil();


            BEGIN297=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_begin_stmt2609); 
            BEGIN297_tree = 
            (Object)adaptor.create(BEGIN297)
            ;
            adaptor.addChild(root_0, BEGIN297_tree);


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:356:19: ( DEFERRED | IMMEDIATE | EXCLUSIVE )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==DEFERRED||LA111_0==EXCLUSIVE||LA111_0==IMMEDIATE) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
                    {
                    set298=(Token)input.LT(1);

                    if ( input.LA(1)==DEFERRED||input.LA(1)==EXCLUSIVE||input.LA(1)==IMMEDIATE ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set298)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:356:55: ( TRANSACTION )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==TRANSACTION) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:356:56: TRANSACTION
                    {
                    TRANSACTION299=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_begin_stmt2625); 
                    TRANSACTION299_tree = 
                    (Object)adaptor.create(TRANSACTION299)
                    ;
                    adaptor.addChild(root_0, TRANSACTION299_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "begin_stmt"


    public static class commit_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "commit_stmt"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:359:1: commit_stmt : ( COMMIT | END ) ( TRANSACTION )? ;
    public final SqlParser.commit_stmt_return commit_stmt() throws RecognitionException {
        SqlParser.commit_stmt_return retval = new SqlParser.commit_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set300=null;
        Token TRANSACTION301=null;

        Object set300_tree=null;
        Object TRANSACTION301_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:359:12: ( ( COMMIT | END ) ( TRANSACTION )? )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:359:14: ( COMMIT | END ) ( TRANSACTION )?
            {
            root_0 = (Object)adaptor.nil();


            set300=(Token)input.LT(1);

            if ( input.LA(1)==COMMIT||input.LA(1)==END ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set300)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:359:29: ( TRANSACTION )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==TRANSACTION) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:359:30: TRANSACTION
                    {
                    TRANSACTION301=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_commit_stmt2644); 
                    TRANSACTION301_tree = 
                    (Object)adaptor.create(TRANSACTION301)
                    ;
                    adaptor.addChild(root_0, TRANSACTION301_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "commit_stmt"


    public static class rollback_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rollback_stmt"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:362:1: rollback_stmt : ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= id )? ;
    public final SqlParser.rollback_stmt_return rollback_stmt() throws RecognitionException {
        SqlParser.rollback_stmt_return retval = new SqlParser.rollback_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ROLLBACK302=null;
        Token TRANSACTION303=null;
        Token TO304=null;
        Token SAVEPOINT305=null;
        SqlParser.id_return savepoint_name =null;


        Object ROLLBACK302_tree=null;
        Object TRANSACTION303_tree=null;
        Object TO304_tree=null;
        Object SAVEPOINT305_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:362:14: ( ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= id )? )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:362:16: ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= id )?
            {
            root_0 = (Object)adaptor.nil();


            ROLLBACK302=(Token)match(input,ROLLBACK,FOLLOW_ROLLBACK_in_rollback_stmt2654); 
            ROLLBACK302_tree = 
            (Object)adaptor.create(ROLLBACK302)
            ;
            adaptor.addChild(root_0, ROLLBACK302_tree);


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:362:25: ( TRANSACTION )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==TRANSACTION) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:362:26: TRANSACTION
                    {
                    TRANSACTION303=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_rollback_stmt2657); 
                    TRANSACTION303_tree = 
                    (Object)adaptor.create(TRANSACTION303)
                    ;
                    adaptor.addChild(root_0, TRANSACTION303_tree);


                    }
                    break;

            }


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:362:40: ( TO ( SAVEPOINT )? savepoint_name= id )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==TO) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:362:41: TO ( SAVEPOINT )? savepoint_name= id
                    {
                    TO304=(Token)match(input,TO,FOLLOW_TO_in_rollback_stmt2662); 
                    TO304_tree = 
                    (Object)adaptor.create(TO304)
                    ;
                    adaptor.addChild(root_0, TO304_tree);


                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:362:44: ( SAVEPOINT )?
                    int alt115=2;
                    int LA115_0 = input.LA(1);

                    if ( (LA115_0==SAVEPOINT) ) {
                        int LA115_1 = input.LA(2);

                        if ( ((LA115_1 >= ABORT && LA115_1 <= AFTER)||(LA115_1 >= ALL && LA115_1 <= ALTER)||(LA115_1 >= ANALYZE && LA115_1 <= AND)||(LA115_1 >= AS && LA115_1 <= ASC)||(LA115_1 >= ATTACH && LA115_1 <= AUTOINCREMENT)||(LA115_1 >= BEFORE && LA115_1 <= BETWEEN)||LA115_1==BY||(LA115_1 >= CASCADE && LA115_1 <= COLLATE)||LA115_1==COLUMN||(LA115_1 >= COMMIT && LA115_1 <= CONSTRAINT)||LA115_1==CREATE||(LA115_1 >= CROSS && LA115_1 <= CURRENT_TIMESTAMP)||(LA115_1 >= DATABASE && LA115_1 <= DISTINCT)||LA115_1==DROP||(LA115_1 >= EACH && LA115_1 <= END)||(LA115_1 >= ESCAPE && LA115_1 <= EXPLAIN)||LA115_1==FAIL||(LA115_1 >= FOR && LA115_1 <= FROM)||LA115_1==GROUP||LA115_1==HAVING||LA115_1==ID||(LA115_1 >= IF && LA115_1 <= IMMEDIATE)||(LA115_1 >= INDEX && LA115_1 <= INSTEAD)||(LA115_1 >= INTERSECT && LA115_1 <= INTO)||LA115_1==IS||LA115_1==JOIN||LA115_1==KEY||LA115_1==LEFT||LA115_1==LIMIT||LA115_1==NATURAL||LA115_1==NULL||(LA115_1 >= OF && LA115_1 <= ON)||(LA115_1 >= OR && LA115_1 <= ORDER)||LA115_1==OUTER||LA115_1==PLAN||(LA115_1 >= PRAGMA && LA115_1 <= PRIMARY)||LA115_1==QUERY||(LA115_1 >= RAISE && LA115_1 <= REFERENCES)||(LA115_1 >= REINDEX && LA115_1 <= ROW)||(LA115_1 >= SAVEPOINT && LA115_1 <= SELECT)||LA115_1==SET||LA115_1==STRING||LA115_1==TABLE||(LA115_1 >= TEMPORARY && LA115_1 <= THEN)||(LA115_1 >= TO && LA115_1 <= TRIGGER)||(LA115_1 >= UNION && LA115_1 <= USING)||(LA115_1 >= VACUUM && LA115_1 <= VIRTUAL)||(LA115_1 >= WHEN && LA115_1 <= WHERE)) ) {
                            alt115=1;
                        }
                    }
                    switch (alt115) {
                        case 1 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:362:45: SAVEPOINT
                            {
                            SAVEPOINT305=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_rollback_stmt2665); 
                            SAVEPOINT305_tree = 
                            (Object)adaptor.create(SAVEPOINT305)
                            ;
                            adaptor.addChild(root_0, SAVEPOINT305_tree);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_id_in_rollback_stmt2671);
                    savepoint_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, savepoint_name.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "rollback_stmt"


    public static class savepoint_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "savepoint_stmt"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:365:1: savepoint_stmt : SAVEPOINT savepoint_name= id ;
    public final SqlParser.savepoint_stmt_return savepoint_stmt() throws RecognitionException {
        SqlParser.savepoint_stmt_return retval = new SqlParser.savepoint_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SAVEPOINT306=null;
        SqlParser.id_return savepoint_name =null;


        Object SAVEPOINT306_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:365:15: ( SAVEPOINT savepoint_name= id )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:365:17: SAVEPOINT savepoint_name= id
            {
            root_0 = (Object)adaptor.nil();


            SAVEPOINT306=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_savepoint_stmt2681); 
            SAVEPOINT306_tree = 
            (Object)adaptor.create(SAVEPOINT306)
            ;
            adaptor.addChild(root_0, SAVEPOINT306_tree);


            pushFollow(FOLLOW_id_in_savepoint_stmt2685);
            savepoint_name=id();

            state._fsp--;

            adaptor.addChild(root_0, savepoint_name.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "savepoint_stmt"


    public static class release_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "release_stmt"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:368:1: release_stmt : RELEASE ( SAVEPOINT )? savepoint_name= id ;
    public final SqlParser.release_stmt_return release_stmt() throws RecognitionException {
        SqlParser.release_stmt_return retval = new SqlParser.release_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RELEASE307=null;
        Token SAVEPOINT308=null;
        SqlParser.id_return savepoint_name =null;


        Object RELEASE307_tree=null;
        Object SAVEPOINT308_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:368:13: ( RELEASE ( SAVEPOINT )? savepoint_name= id )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:368:15: RELEASE ( SAVEPOINT )? savepoint_name= id
            {
            root_0 = (Object)adaptor.nil();


            RELEASE307=(Token)match(input,RELEASE,FOLLOW_RELEASE_in_release_stmt2693); 
            RELEASE307_tree = 
            (Object)adaptor.create(RELEASE307)
            ;
            adaptor.addChild(root_0, RELEASE307_tree);


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:368:23: ( SAVEPOINT )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==SAVEPOINT) ) {
                int LA117_1 = input.LA(2);

                if ( ((LA117_1 >= ABORT && LA117_1 <= AFTER)||(LA117_1 >= ALL && LA117_1 <= ALTER)||(LA117_1 >= ANALYZE && LA117_1 <= AND)||(LA117_1 >= AS && LA117_1 <= ASC)||(LA117_1 >= ATTACH && LA117_1 <= AUTOINCREMENT)||(LA117_1 >= BEFORE && LA117_1 <= BETWEEN)||LA117_1==BY||(LA117_1 >= CASCADE && LA117_1 <= COLLATE)||LA117_1==COLUMN||(LA117_1 >= COMMIT && LA117_1 <= CONSTRAINT)||LA117_1==CREATE||(LA117_1 >= CROSS && LA117_1 <= CURRENT_TIMESTAMP)||(LA117_1 >= DATABASE && LA117_1 <= DISTINCT)||LA117_1==DROP||(LA117_1 >= EACH && LA117_1 <= END)||(LA117_1 >= ESCAPE && LA117_1 <= EXPLAIN)||LA117_1==FAIL||(LA117_1 >= FOR && LA117_1 <= FROM)||LA117_1==GROUP||LA117_1==HAVING||LA117_1==ID||(LA117_1 >= IF && LA117_1 <= IMMEDIATE)||(LA117_1 >= INDEX && LA117_1 <= INSTEAD)||(LA117_1 >= INTERSECT && LA117_1 <= INTO)||LA117_1==IS||LA117_1==JOIN||LA117_1==KEY||LA117_1==LEFT||LA117_1==LIMIT||LA117_1==NATURAL||LA117_1==NULL||(LA117_1 >= OF && LA117_1 <= ON)||(LA117_1 >= OR && LA117_1 <= ORDER)||LA117_1==OUTER||LA117_1==PLAN||(LA117_1 >= PRAGMA && LA117_1 <= PRIMARY)||LA117_1==QUERY||(LA117_1 >= RAISE && LA117_1 <= REFERENCES)||(LA117_1 >= REINDEX && LA117_1 <= ROW)||(LA117_1 >= SAVEPOINT && LA117_1 <= SELECT)||LA117_1==SET||LA117_1==STRING||LA117_1==TABLE||(LA117_1 >= TEMPORARY && LA117_1 <= THEN)||(LA117_1 >= TO && LA117_1 <= TRIGGER)||(LA117_1 >= UNION && LA117_1 <= USING)||(LA117_1 >= VACUUM && LA117_1 <= VIRTUAL)||(LA117_1 >= WHEN && LA117_1 <= WHERE)) ) {
                    alt117=1;
                }
            }
            switch (alt117) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:368:24: SAVEPOINT
                    {
                    SAVEPOINT308=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_release_stmt2696); 
                    SAVEPOINT308_tree = 
                    (Object)adaptor.create(SAVEPOINT308)
                    ;
                    adaptor.addChild(root_0, SAVEPOINT308_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_id_in_release_stmt2702);
            savepoint_name=id();

            state._fsp--;

            adaptor.addChild(root_0, savepoint_name.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "release_stmt"


    public static class table_conflict_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table_conflict_clause"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:375:1: table_conflict_clause : ON ! CONFLICT ^ ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) ;
    public final SqlParser.table_conflict_clause_return table_conflict_clause() throws RecognitionException {
        SqlParser.table_conflict_clause_return retval = new SqlParser.table_conflict_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ON309=null;
        Token CONFLICT310=null;
        Token set311=null;

        Object ON309_tree=null;
        Object CONFLICT310_tree=null;
        Object set311_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:375:22: ( ON ! CONFLICT ^ ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:375:24: ON ! CONFLICT ^ ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE )
            {
            root_0 = (Object)adaptor.nil();


            ON309=(Token)match(input,ON,FOLLOW_ON_in_table_conflict_clause2714); 

            CONFLICT310=(Token)match(input,CONFLICT,FOLLOW_CONFLICT_in_table_conflict_clause2717); 
            CONFLICT310_tree = 
            (Object)adaptor.create(CONFLICT310)
            ;
            root_0 = (Object)adaptor.becomeRoot(CONFLICT310_tree, root_0);


            set311=(Token)input.LT(1);

            if ( input.LA(1)==ABORT||input.LA(1)==FAIL||input.LA(1)==IGNORE||input.LA(1)==REPLACE||input.LA(1)==ROLLBACK ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set311)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "table_conflict_clause"


    public static class create_virtual_table_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "create_virtual_table_stmt"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:379:1: create_virtual_table_stmt : CREATE VIRTUAL TABLE (database_name= id DOT )? table_name= id USING module_name= id ( LPAREN column_def ( COMMA column_def )* RPAREN )? -> ^( CREATE_TABLE ^( OPTIONS VIRTUAL ) ^( $table_name ( $database_name)? ) ^( $module_name) ( ^( COLUMNS ( column_def )+ ) )? ) ;
    public final SqlParser.create_virtual_table_stmt_return create_virtual_table_stmt() throws RecognitionException {
        SqlParser.create_virtual_table_stmt_return retval = new SqlParser.create_virtual_table_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CREATE312=null;
        Token VIRTUAL313=null;
        Token TABLE314=null;
        Token DOT315=null;
        Token USING316=null;
        Token LPAREN317=null;
        Token COMMA319=null;
        Token RPAREN321=null;
        SqlParser.id_return database_name =null;

        SqlParser.id_return table_name =null;

        SqlParser.id_return module_name =null;

        SqlParser.column_def_return column_def318 =null;

        SqlParser.column_def_return column_def320 =null;


        Object CREATE312_tree=null;
        Object VIRTUAL313_tree=null;
        Object TABLE314_tree=null;
        Object DOT315_tree=null;
        Object USING316_tree=null;
        Object LPAREN317_tree=null;
        Object COMMA319_tree=null;
        Object RPAREN321_tree=null;
        RewriteRuleTokenStream stream_TABLE=new RewriteRuleTokenStream(adaptor,"token TABLE");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_USING=new RewriteRuleTokenStream(adaptor,"token USING");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_VIRTUAL=new RewriteRuleTokenStream(adaptor,"token VIRTUAL");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_column_def=new RewriteRuleSubtreeStream(adaptor,"rule column_def");
        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:379:26: ( CREATE VIRTUAL TABLE (database_name= id DOT )? table_name= id USING module_name= id ( LPAREN column_def ( COMMA column_def )* RPAREN )? -> ^( CREATE_TABLE ^( OPTIONS VIRTUAL ) ^( $table_name ( $database_name)? ) ^( $module_name) ( ^( COLUMNS ( column_def )+ ) )? ) )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:379:28: CREATE VIRTUAL TABLE (database_name= id DOT )? table_name= id USING module_name= id ( LPAREN column_def ( COMMA column_def )* RPAREN )?
            {
            CREATE312=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_virtual_table_stmt2747);  
            stream_CREATE.add(CREATE312);


            VIRTUAL313=(Token)match(input,VIRTUAL,FOLLOW_VIRTUAL_in_create_virtual_table_stmt2749);  
            stream_VIRTUAL.add(VIRTUAL313);


            TABLE314=(Token)match(input,TABLE,FOLLOW_TABLE_in_create_virtual_table_stmt2751);  
            stream_TABLE.add(TABLE314);


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:379:49: (database_name= id DOT )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==ID||LA118_0==STRING) ) {
                int LA118_1 = input.LA(2);

                if ( (LA118_1==DOT) ) {
                    alt118=1;
                }
            }
            else if ( ((LA118_0 >= ABORT && LA118_0 <= AFTER)||(LA118_0 >= ALL && LA118_0 <= ALTER)||(LA118_0 >= ANALYZE && LA118_0 <= AND)||(LA118_0 >= AS && LA118_0 <= ASC)||(LA118_0 >= ATTACH && LA118_0 <= AUTOINCREMENT)||(LA118_0 >= BEFORE && LA118_0 <= BETWEEN)||LA118_0==BY||(LA118_0 >= CASCADE && LA118_0 <= COLLATE)||LA118_0==COLUMN||(LA118_0 >= COMMIT && LA118_0 <= CONSTRAINT)||LA118_0==CREATE||(LA118_0 >= CROSS && LA118_0 <= CURRENT_TIMESTAMP)||(LA118_0 >= DATABASE && LA118_0 <= DISTINCT)||LA118_0==DROP||(LA118_0 >= EACH && LA118_0 <= END)||(LA118_0 >= ESCAPE && LA118_0 <= EXPLAIN)||LA118_0==FAIL||(LA118_0 >= FOR && LA118_0 <= FROM)||LA118_0==GROUP||LA118_0==HAVING||(LA118_0 >= IF && LA118_0 <= IMMEDIATE)||(LA118_0 >= INDEX && LA118_0 <= INSTEAD)||(LA118_0 >= INTERSECT && LA118_0 <= INTO)||LA118_0==IS||LA118_0==JOIN||LA118_0==KEY||LA118_0==LEFT||LA118_0==LIMIT||LA118_0==NATURAL||LA118_0==NULL||(LA118_0 >= OF && LA118_0 <= ON)||(LA118_0 >= OR && LA118_0 <= ORDER)||LA118_0==OUTER||LA118_0==PLAN||(LA118_0 >= PRAGMA && LA118_0 <= PRIMARY)||LA118_0==QUERY||(LA118_0 >= RAISE && LA118_0 <= REFERENCES)||(LA118_0 >= REINDEX && LA118_0 <= ROW)||(LA118_0 >= SAVEPOINT && LA118_0 <= SELECT)||LA118_0==SET||LA118_0==TABLE||(LA118_0 >= TEMPORARY && LA118_0 <= THEN)||(LA118_0 >= TO && LA118_0 <= TRIGGER)||(LA118_0 >= UNION && LA118_0 <= USING)||(LA118_0 >= VACUUM && LA118_0 <= VIRTUAL)||(LA118_0 >= WHEN && LA118_0 <= WHERE)) ) {
                int LA118_2 = input.LA(2);

                if ( (LA118_2==DOT) ) {
                    alt118=1;
                }
            }
            switch (alt118) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:379:50: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_virtual_table_stmt2756);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());

                    DOT315=(Token)match(input,DOT,FOLLOW_DOT_in_create_virtual_table_stmt2758);  
                    stream_DOT.add(DOT315);


                    }
                    break;

            }


            pushFollow(FOLLOW_id_in_create_virtual_table_stmt2764);
            table_name=id();

            state._fsp--;

            stream_id.add(table_name.getTree());

            USING316=(Token)match(input,USING,FOLLOW_USING_in_create_virtual_table_stmt2768);  
            stream_USING.add(USING316);


            pushFollow(FOLLOW_id_in_create_virtual_table_stmt2772);
            module_name=id();

            state._fsp--;

            stream_id.add(module_name.getTree());

            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:380:24: ( LPAREN column_def ( COMMA column_def )* RPAREN )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==LPAREN) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:380:25: LPAREN column_def ( COMMA column_def )* RPAREN
                    {
                    LPAREN317=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_virtual_table_stmt2775);  
                    stream_LPAREN.add(LPAREN317);


                    pushFollow(FOLLOW_column_def_in_create_virtual_table_stmt2777);
                    column_def318=column_def();

                    state._fsp--;

                    stream_column_def.add(column_def318.getTree());

                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:380:43: ( COMMA column_def )*
                    loop119:
                    do {
                        int alt119=2;
                        int LA119_0 = input.LA(1);

                        if ( (LA119_0==COMMA) ) {
                            alt119=1;
                        }


                        switch (alt119) {
                    	case 1 :
                    	    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:380:44: COMMA column_def
                    	    {
                    	    COMMA319=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_virtual_table_stmt2780);  
                    	    stream_COMMA.add(COMMA319);


                    	    pushFollow(FOLLOW_column_def_in_create_virtual_table_stmt2782);
                    	    column_def320=column_def();

                    	    state._fsp--;

                    	    stream_column_def.add(column_def320.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop119;
                        }
                    } while (true);


                    RPAREN321=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_virtual_table_stmt2786);  
                    stream_RPAREN.add(RPAREN321);


                    }
                    break;

            }


            // AST REWRITE
            // elements: VIRTUAL, table_name, column_def, module_name, database_name
            // token labels: 
            // rule labels: database_name, retval, table_name, module_name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_table_name=new RewriteRuleSubtreeStream(adaptor,"rule table_name",table_name!=null?table_name.tree:null);
            RewriteRuleSubtreeStream stream_module_name=new RewriteRuleSubtreeStream(adaptor,"rule module_name",module_name!=null?module_name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 381:3: -> ^( CREATE_TABLE ^( OPTIONS VIRTUAL ) ^( $table_name ( $database_name)? ) ^( $module_name) ( ^( COLUMNS ( column_def )+ ) )? )
            {
                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:381:6: ^( CREATE_TABLE ^( OPTIONS VIRTUAL ) ^( $table_name ( $database_name)? ) ^( $module_name) ( ^( COLUMNS ( column_def )+ ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CREATE_TABLE, "CREATE_TABLE")
                , root_1);

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:381:21: ^( OPTIONS VIRTUAL )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(OPTIONS, "OPTIONS")
                , root_2);

                adaptor.addChild(root_2, 
                stream_VIRTUAL.nextNode()
                );

                adaptor.addChild(root_1, root_2);
                }

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:381:40: ^( $table_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:381:55: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:381:71: ^( $module_name)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_module_name.nextNode(), root_2);

                adaptor.addChild(root_1, root_2);
                }

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:381:87: ( ^( COLUMNS ( column_def )+ ) )?
                if ( stream_column_def.hasNext() ) {
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:381:87: ^( COLUMNS ( column_def )+ )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    (Object)adaptor.create(COLUMNS, "COLUMNS")
                    , root_2);

                    if ( !(stream_column_def.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_column_def.hasNext() ) {
                        adaptor.addChild(root_2, stream_column_def.nextTree());

                    }
                    stream_column_def.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_column_def.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "create_virtual_table_stmt"


    public static class create_table_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "create_table_stmt"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:384:1: create_table_stmt : CREATE ( TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= id DOT )? table_name= id ( LPAREN column_def ( COMMA column_def )* ( ( COMMA )? table_constraint )* RPAREN | AS select_stmt ) -> ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? ) ;
    public final SqlParser.create_table_stmt_return create_table_stmt() throws RecognitionException {
        SqlParser.create_table_stmt_return retval = new SqlParser.create_table_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CREATE322=null;
        Token TEMPORARY323=null;
        Token TABLE324=null;
        Token IF325=null;
        Token NOT326=null;
        Token EXISTS327=null;
        Token DOT328=null;
        Token LPAREN329=null;
        Token COMMA331=null;
        Token COMMA333=null;
        Token RPAREN335=null;
        Token AS336=null;
        SqlParser.id_return database_name =null;

        SqlParser.id_return table_name =null;

        SqlParser.column_def_return column_def330 =null;

        SqlParser.column_def_return column_def332 =null;

        SqlParser.table_constraint_return table_constraint334 =null;

        SqlParser.select_stmt_return select_stmt337 =null;


        Object CREATE322_tree=null;
        Object TEMPORARY323_tree=null;
        Object TABLE324_tree=null;
        Object IF325_tree=null;
        Object NOT326_tree=null;
        Object EXISTS327_tree=null;
        Object DOT328_tree=null;
        Object LPAREN329_tree=null;
        Object COMMA331_tree=null;
        Object COMMA333_tree=null;
        Object RPAREN335_tree=null;
        Object AS336_tree=null;
        RewriteRuleTokenStream stream_TABLE=new RewriteRuleTokenStream(adaptor,"token TABLE");
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_TEMPORARY=new RewriteRuleTokenStream(adaptor,"token TEMPORARY");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_select_stmt=new RewriteRuleSubtreeStream(adaptor,"rule select_stmt");
        RewriteRuleSubtreeStream stream_column_def=new RewriteRuleSubtreeStream(adaptor,"rule column_def");
        RewriteRuleSubtreeStream stream_table_constraint=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint");
        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:384:18: ( CREATE ( TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= id DOT )? table_name= id ( LPAREN column_def ( COMMA column_def )* ( ( COMMA )? table_constraint )* RPAREN | AS select_stmt ) -> ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? ) )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:384:20: CREATE ( TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= id DOT )? table_name= id ( LPAREN column_def ( COMMA column_def )* ( ( COMMA )? table_constraint )* RPAREN | AS select_stmt )
            {
            CREATE322=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_table_stmt2832);  
            stream_CREATE.add(CREATE322);


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:384:27: ( TEMPORARY )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==TEMPORARY) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:384:27: TEMPORARY
                    {
                    TEMPORARY323=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_table_stmt2834);  
                    stream_TEMPORARY.add(TEMPORARY323);


                    }
                    break;

            }


            TABLE324=(Token)match(input,TABLE,FOLLOW_TABLE_in_create_table_stmt2837);  
            stream_TABLE.add(TABLE324);


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:384:44: ( IF NOT EXISTS )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==IF) ) {
                int LA122_1 = input.LA(2);

                if ( (LA122_1==NOT) ) {
                    alt122=1;
                }
            }
            switch (alt122) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:384:45: IF NOT EXISTS
                    {
                    IF325=(Token)match(input,IF,FOLLOW_IF_in_create_table_stmt2840);  
                    stream_IF.add(IF325);


                    NOT326=(Token)match(input,NOT,FOLLOW_NOT_in_create_table_stmt2842);  
                    stream_NOT.add(NOT326);


                    EXISTS327=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_table_stmt2844);  
                    stream_EXISTS.add(EXISTS327);


                    }
                    break;

            }


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:384:61: (database_name= id DOT )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==ID||LA123_0==STRING) ) {
                int LA123_1 = input.LA(2);

                if ( (LA123_1==DOT) ) {
                    alt123=1;
                }
            }
            else if ( ((LA123_0 >= ABORT && LA123_0 <= AFTER)||(LA123_0 >= ALL && LA123_0 <= ALTER)||(LA123_0 >= ANALYZE && LA123_0 <= AND)||(LA123_0 >= AS && LA123_0 <= ASC)||(LA123_0 >= ATTACH && LA123_0 <= AUTOINCREMENT)||(LA123_0 >= BEFORE && LA123_0 <= BETWEEN)||LA123_0==BY||(LA123_0 >= CASCADE && LA123_0 <= COLLATE)||LA123_0==COLUMN||(LA123_0 >= COMMIT && LA123_0 <= CONSTRAINT)||LA123_0==CREATE||(LA123_0 >= CROSS && LA123_0 <= CURRENT_TIMESTAMP)||(LA123_0 >= DATABASE && LA123_0 <= DISTINCT)||LA123_0==DROP||(LA123_0 >= EACH && LA123_0 <= END)||(LA123_0 >= ESCAPE && LA123_0 <= EXPLAIN)||LA123_0==FAIL||(LA123_0 >= FOR && LA123_0 <= FROM)||LA123_0==GROUP||LA123_0==HAVING||(LA123_0 >= IF && LA123_0 <= IMMEDIATE)||(LA123_0 >= INDEX && LA123_0 <= INSTEAD)||(LA123_0 >= INTERSECT && LA123_0 <= INTO)||LA123_0==IS||LA123_0==JOIN||LA123_0==KEY||LA123_0==LEFT||LA123_0==LIMIT||LA123_0==NATURAL||LA123_0==NULL||(LA123_0 >= OF && LA123_0 <= ON)||(LA123_0 >= OR && LA123_0 <= ORDER)||LA123_0==OUTER||LA123_0==PLAN||(LA123_0 >= PRAGMA && LA123_0 <= PRIMARY)||LA123_0==QUERY||(LA123_0 >= RAISE && LA123_0 <= REFERENCES)||(LA123_0 >= REINDEX && LA123_0 <= ROW)||(LA123_0 >= SAVEPOINT && LA123_0 <= SELECT)||LA123_0==SET||LA123_0==TABLE||(LA123_0 >= TEMPORARY && LA123_0 <= THEN)||(LA123_0 >= TO && LA123_0 <= TRIGGER)||(LA123_0 >= UNION && LA123_0 <= USING)||(LA123_0 >= VACUUM && LA123_0 <= VIRTUAL)||(LA123_0 >= WHEN && LA123_0 <= WHERE)) ) {
                int LA123_2 = input.LA(2);

                if ( (LA123_2==DOT) ) {
                    alt123=1;
                }
            }
            switch (alt123) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:384:62: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_table_stmt2851);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());

                    DOT328=(Token)match(input,DOT,FOLLOW_DOT_in_create_table_stmt2853);  
                    stream_DOT.add(DOT328);


                    }
                    break;

            }


            pushFollow(FOLLOW_id_in_create_table_stmt2859);
            table_name=id();

            state._fsp--;

            stream_id.add(table_name.getTree());

            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:385:3: ( LPAREN column_def ( COMMA column_def )* ( ( COMMA )? table_constraint )* RPAREN | AS select_stmt )
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==LPAREN) ) {
                alt127=1;
            }
            else if ( (LA127_0==AS) ) {
                alt127=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;

            }
            switch (alt127) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:385:5: LPAREN column_def ( COMMA column_def )* ( ( COMMA )? table_constraint )* RPAREN
                    {
                    LPAREN329=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_table_stmt2865);  
                    stream_LPAREN.add(LPAREN329);


                    pushFollow(FOLLOW_column_def_in_create_table_stmt2867);
                    column_def330=column_def();

                    state._fsp--;

                    stream_column_def.add(column_def330.getTree());

                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:385:23: ( COMMA column_def )*
                    loop124:
                    do {
                        int alt124=2;
                        alt124 = dfa124.predict(input);
                        switch (alt124) {
                    	case 1 :
                    	    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:385:24: COMMA column_def
                    	    {
                    	    COMMA331=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_table_stmt2870);  
                    	    stream_COMMA.add(COMMA331);


                    	    pushFollow(FOLLOW_column_def_in_create_table_stmt2872);
                    	    column_def332=column_def();

                    	    state._fsp--;

                    	    stream_column_def.add(column_def332.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop124;
                        }
                    } while (true);


                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:385:43: ( ( COMMA )? table_constraint )*
                    loop126:
                    do {
                        int alt126=2;
                        int LA126_0 = input.LA(1);

                        if ( (LA126_0==CHECK||LA126_0==COMMA||LA126_0==CONSTRAINT||LA126_0==FOREIGN||LA126_0==PRIMARY||LA126_0==UNIQUE) ) {
                            alt126=1;
                        }


                        switch (alt126) {
                    	case 1 :
                    	    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:385:44: ( COMMA )? table_constraint
                    	    {
                    	    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:385:44: ( COMMA )?
                    	    int alt125=2;
                    	    int LA125_0 = input.LA(1);

                    	    if ( (LA125_0==COMMA) ) {
                    	        alt125=1;
                    	    }
                    	    switch (alt125) {
                    	        case 1 :
                    	            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:385:44: COMMA
                    	            {
                    	            COMMA333=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_table_stmt2877);  
                    	            stream_COMMA.add(COMMA333);


                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_table_constraint_in_create_table_stmt2880);
                    	    table_constraint334=table_constraint();

                    	    state._fsp--;

                    	    stream_table_constraint.add(table_constraint334.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop126;
                        }
                    } while (true);


                    RPAREN335=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_table_stmt2884);  
                    stream_RPAREN.add(RPAREN335);


                    }
                    break;
                case 2 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:386:5: AS select_stmt
                    {
                    AS336=(Token)match(input,AS,FOLLOW_AS_in_create_table_stmt2890);  
                    stream_AS.add(AS336);


                    pushFollow(FOLLOW_select_stmt_in_create_table_stmt2892);
                    select_stmt337=select_stmt();

                    state._fsp--;

                    stream_select_stmt.add(select_stmt337.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: column_def, EXISTS, table_constraint, database_name, select_stmt, table_name, TEMPORARY
            // token labels: 
            // rule labels: database_name, retval, table_name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_table_name=new RewriteRuleSubtreeStream(adaptor,"rule table_name",table_name!=null?table_name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 387:74: -> ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? )
            {
                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:387:4: ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CREATE_TABLE, "CREATE_TABLE")
                , root_1);

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:387:19: ^( OPTIONS ( TEMPORARY )? ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(OPTIONS, "OPTIONS")
                , root_2);

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:387:29: ( TEMPORARY )?
                if ( stream_TEMPORARY.hasNext() ) {
                    adaptor.addChild(root_2, 
                    stream_TEMPORARY.nextNode()
                    );

                }
                stream_TEMPORARY.reset();

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:387:40: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, 
                    stream_EXISTS.nextNode()
                    );

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:387:49: ^( $table_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:387:64: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:388:3: ( ^( COLUMNS ( column_def )+ ) )?
                if ( stream_column_def.hasNext() ) {
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:388:3: ^( COLUMNS ( column_def )+ )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    (Object)adaptor.create(COLUMNS, "COLUMNS")
                    , root_2);

                    if ( !(stream_column_def.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_column_def.hasNext() ) {
                        adaptor.addChild(root_2, stream_column_def.nextTree());

                    }
                    stream_column_def.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_column_def.reset();

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:388:27: ( ^( CONSTRAINTS ( table_constraint )* ) )?
                if ( stream_table_constraint.hasNext() ) {
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:388:27: ^( CONSTRAINTS ( table_constraint )* )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    (Object)adaptor.create(CONSTRAINTS, "CONSTRAINTS")
                    , root_2);

                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:388:41: ( table_constraint )*
                    while ( stream_table_constraint.hasNext() ) {
                        adaptor.addChild(root_2, stream_table_constraint.nextTree());

                    }
                    stream_table_constraint.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_table_constraint.reset();

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:388:61: ( select_stmt )?
                if ( stream_select_stmt.hasNext() ) {
                    adaptor.addChild(root_1, stream_select_stmt.nextTree());

                }
                stream_select_stmt.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "create_table_stmt"


    public static class column_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column_def"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:390:1: column_def : name= id_column_def ( type_name )? ( column_constraint )* -> ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? ) ;
    public final SqlParser.column_def_return column_def() throws RecognitionException {
        SqlParser.column_def_return retval = new SqlParser.column_def_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SqlParser.id_column_def_return name =null;

        SqlParser.type_name_return type_name338 =null;

        SqlParser.column_constraint_return column_constraint339 =null;


        RewriteRuleSubtreeStream stream_column_constraint=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint");
        RewriteRuleSubtreeStream stream_id_column_def=new RewriteRuleSubtreeStream(adaptor,"rule id_column_def");
        RewriteRuleSubtreeStream stream_type_name=new RewriteRuleSubtreeStream(adaptor,"rule type_name");
        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:390:11: (name= id_column_def ( type_name )? ( column_constraint )* -> ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? ) )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:390:13: name= id_column_def ( type_name )? ( column_constraint )*
            {
            pushFollow(FOLLOW_id_column_def_in_column_def2948);
            name=id_column_def();

            state._fsp--;

            stream_id_column_def.add(name.getTree());

            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:390:32: ( type_name )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==ID) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:390:32: type_name
                    {
                    pushFollow(FOLLOW_type_name_in_column_def2950);
                    type_name338=type_name();

                    state._fsp--;

                    stream_type_name.add(type_name338.getTree());

                    }
                    break;

            }


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:390:43: ( column_constraint )*
            loop129:
            do {
                int alt129=2;
                alt129 = dfa129.predict(input);
                switch (alt129) {
            	case 1 :
            	    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:390:43: column_constraint
            	    {
            	    pushFollow(FOLLOW_column_constraint_in_column_def2953);
            	    column_constraint339=column_constraint();

            	    state._fsp--;

            	    stream_column_constraint.add(column_constraint339.getTree());

            	    }
            	    break;

            	default :
            	    break loop129;
                }
            } while (true);


            // AST REWRITE
            // elements: name, type_name, column_constraint
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 391:57: -> ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? )
            {
                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:391:4: ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_name.nextNode(), root_1);

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:391:12: ^( CONSTRAINTS ( column_constraint )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CONSTRAINTS, "CONSTRAINTS")
                , root_2);

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:391:26: ( column_constraint )*
                while ( stream_column_constraint.hasNext() ) {
                    adaptor.addChild(root_2, stream_column_constraint.nextTree());

                }
                stream_column_constraint.reset();

                adaptor.addChild(root_1, root_2);
                }

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:391:46: ( type_name )?
                if ( stream_type_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_type_name.nextTree());

                }
                stream_type_name.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "column_def"


    public static class column_constraint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column_constraint"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:393:1: column_constraint : ( CONSTRAINT name= id )? ( column_constraint_pk | column_constraint_not_null | column_constraint_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause ) -> ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? ) ;
    public final SqlParser.column_constraint_return column_constraint() throws RecognitionException {
        SqlParser.column_constraint_return retval = new SqlParser.column_constraint_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CONSTRAINT340=null;
        SqlParser.id_return name =null;

        SqlParser.column_constraint_pk_return column_constraint_pk341 =null;

        SqlParser.column_constraint_not_null_return column_constraint_not_null342 =null;

        SqlParser.column_constraint_null_return column_constraint_null343 =null;

        SqlParser.column_constraint_unique_return column_constraint_unique344 =null;

        SqlParser.column_constraint_check_return column_constraint_check345 =null;

        SqlParser.column_constraint_default_return column_constraint_default346 =null;

        SqlParser.column_constraint_collate_return column_constraint_collate347 =null;

        SqlParser.fk_clause_return fk_clause348 =null;


        Object CONSTRAINT340_tree=null;
        RewriteRuleTokenStream stream_CONSTRAINT=new RewriteRuleTokenStream(adaptor,"token CONSTRAINT");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_column_constraint_default=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint_default");
        RewriteRuleSubtreeStream stream_column_constraint_check=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint_check");
        RewriteRuleSubtreeStream stream_column_constraint_pk=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint_pk");
        RewriteRuleSubtreeStream stream_column_constraint_null=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint_null");
        RewriteRuleSubtreeStream stream_column_constraint_collate=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint_collate");
        RewriteRuleSubtreeStream stream_column_constraint_unique=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint_unique");
        RewriteRuleSubtreeStream stream_fk_clause=new RewriteRuleSubtreeStream(adaptor,"rule fk_clause");
        RewriteRuleSubtreeStream stream_column_constraint_not_null=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint_not_null");
        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:393:18: ( ( CONSTRAINT name= id )? ( column_constraint_pk | column_constraint_not_null | column_constraint_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause ) -> ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? ) )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:393:20: ( CONSTRAINT name= id )? ( column_constraint_pk | column_constraint_not_null | column_constraint_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause )
            {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:393:20: ( CONSTRAINT name= id )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==CONSTRAINT) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:393:21: CONSTRAINT name= id
                    {
                    CONSTRAINT340=(Token)match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_column_constraint2979);  
                    stream_CONSTRAINT.add(CONSTRAINT340);


                    pushFollow(FOLLOW_id_in_column_constraint2983);
                    name=id();

                    state._fsp--;

                    stream_id.add(name.getTree());

                    }
                    break;

            }


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:394:3: ( column_constraint_pk | column_constraint_not_null | column_constraint_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause )
            int alt131=8;
            switch ( input.LA(1) ) {
            case PRIMARY:
                {
                alt131=1;
                }
                break;
            case NOT:
                {
                alt131=2;
                }
                break;
            case NULL:
                {
                alt131=3;
                }
                break;
            case UNIQUE:
                {
                alt131=4;
                }
                break;
            case CHECK:
                {
                alt131=5;
                }
                break;
            case DEFAULT:
                {
                alt131=6;
                }
                break;
            case COLLATE:
                {
                alt131=7;
                }
                break;
            case REFERENCES:
                {
                alt131=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 131, 0, input);

                throw nvae;

            }

            switch (alt131) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:394:5: column_constraint_pk
                    {
                    pushFollow(FOLLOW_column_constraint_pk_in_column_constraint2991);
                    column_constraint_pk341=column_constraint_pk();

                    state._fsp--;

                    stream_column_constraint_pk.add(column_constraint_pk341.getTree());

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:395:5: column_constraint_not_null
                    {
                    pushFollow(FOLLOW_column_constraint_not_null_in_column_constraint2997);
                    column_constraint_not_null342=column_constraint_not_null();

                    state._fsp--;

                    stream_column_constraint_not_null.add(column_constraint_not_null342.getTree());

                    }
                    break;
                case 3 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:396:5: column_constraint_null
                    {
                    pushFollow(FOLLOW_column_constraint_null_in_column_constraint3003);
                    column_constraint_null343=column_constraint_null();

                    state._fsp--;

                    stream_column_constraint_null.add(column_constraint_null343.getTree());

                    }
                    break;
                case 4 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:397:5: column_constraint_unique
                    {
                    pushFollow(FOLLOW_column_constraint_unique_in_column_constraint3009);
                    column_constraint_unique344=column_constraint_unique();

                    state._fsp--;

                    stream_column_constraint_unique.add(column_constraint_unique344.getTree());

                    }
                    break;
                case 5 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:398:5: column_constraint_check
                    {
                    pushFollow(FOLLOW_column_constraint_check_in_column_constraint3015);
                    column_constraint_check345=column_constraint_check();

                    state._fsp--;

                    stream_column_constraint_check.add(column_constraint_check345.getTree());

                    }
                    break;
                case 6 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:399:5: column_constraint_default
                    {
                    pushFollow(FOLLOW_column_constraint_default_in_column_constraint3021);
                    column_constraint_default346=column_constraint_default();

                    state._fsp--;

                    stream_column_constraint_default.add(column_constraint_default346.getTree());

                    }
                    break;
                case 7 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:400:5: column_constraint_collate
                    {
                    pushFollow(FOLLOW_column_constraint_collate_in_column_constraint3027);
                    column_constraint_collate347=column_constraint_collate();

                    state._fsp--;

                    stream_column_constraint_collate.add(column_constraint_collate347.getTree());

                    }
                    break;
                case 8 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:401:5: fk_clause
                    {
                    pushFollow(FOLLOW_fk_clause_in_column_constraint3033);
                    fk_clause348=fk_clause();

                    state._fsp--;

                    stream_fk_clause.add(fk_clause348.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: column_constraint_collate, column_constraint_pk, fk_clause, column_constraint_null, column_constraint_check, column_constraint_not_null, name, column_constraint_unique, column_constraint_default
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 402:10: -> ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? )
            {
                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:402:4: ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COLUMN_CONSTRAINT, "COLUMN_CONSTRAINT")
                , root_1);

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:403:3: ( column_constraint_pk )?
                if ( stream_column_constraint_pk.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_pk.nextTree());

                }
                stream_column_constraint_pk.reset();

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:404:3: ( column_constraint_not_null )?
                if ( stream_column_constraint_not_null.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_not_null.nextTree());

                }
                stream_column_constraint_not_null.reset();

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:405:3: ( column_constraint_null )?
                if ( stream_column_constraint_null.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_null.nextTree());

                }
                stream_column_constraint_null.reset();

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:406:3: ( column_constraint_unique )?
                if ( stream_column_constraint_unique.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_unique.nextTree());

                }
                stream_column_constraint_unique.reset();

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:407:3: ( column_constraint_check )?
                if ( stream_column_constraint_check.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_check.nextTree());

                }
                stream_column_constraint_check.reset();

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:408:3: ( column_constraint_default )?
                if ( stream_column_constraint_default.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_default.nextTree());

                }
                stream_column_constraint_default.reset();

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:409:3: ( column_constraint_collate )?
                if ( stream_column_constraint_collate.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_collate.nextTree());

                }
                stream_column_constraint_collate.reset();

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:410:3: ( fk_clause )?
                if ( stream_fk_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_fk_clause.nextTree());

                }
                stream_fk_clause.reset();

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:411:4: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.nextTree());

                }
                stream_name.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "column_constraint"


    public static class column_constraint_pk_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column_constraint_pk"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:413:1: column_constraint_pk : PRIMARY ^ KEY ! ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )? ;
    public final SqlParser.column_constraint_pk_return column_constraint_pk() throws RecognitionException {
        SqlParser.column_constraint_pk_return retval = new SqlParser.column_constraint_pk_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PRIMARY349=null;
        Token KEY350=null;
        Token set351=null;
        Token AUTOINCREMENT353=null;
        SqlParser.table_conflict_clause_return table_conflict_clause352 =null;


        Object PRIMARY349_tree=null;
        Object KEY350_tree=null;
        Object set351_tree=null;
        Object AUTOINCREMENT353_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:413:21: ( PRIMARY ^ KEY ! ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )? )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:413:23: PRIMARY ^ KEY ! ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )?
            {
            root_0 = (Object)adaptor.nil();


            PRIMARY349=(Token)match(input,PRIMARY,FOLLOW_PRIMARY_in_column_constraint_pk3093); 
            PRIMARY349_tree = 
            (Object)adaptor.create(PRIMARY349)
            ;
            root_0 = (Object)adaptor.becomeRoot(PRIMARY349_tree, root_0);


            KEY350=(Token)match(input,KEY,FOLLOW_KEY_in_column_constraint_pk3096); 

            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:413:37: ( ASC | DESC )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==ASC||LA132_0==DESC) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
                    {
                    set351=(Token)input.LT(1);

                    if ( input.LA(1)==ASC||input.LA(1)==DESC ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set351)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:413:51: ( table_conflict_clause )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==ON) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:413:51: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_pk3108);
                    table_conflict_clause352=table_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, table_conflict_clause352.getTree());

                    }
                    break;

            }


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:413:74: ( AUTOINCREMENT )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==AUTOINCREMENT) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:413:75: AUTOINCREMENT
                    {
                    AUTOINCREMENT353=(Token)match(input,AUTOINCREMENT,FOLLOW_AUTOINCREMENT_in_column_constraint_pk3112); 
                    AUTOINCREMENT353_tree = 
                    (Object)adaptor.create(AUTOINCREMENT353)
                    ;
                    adaptor.addChild(root_0, AUTOINCREMENT353_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "column_constraint_pk"


    public static class column_constraint_not_null_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column_constraint_not_null"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:415:1: column_constraint_not_null : NOT NULL ( table_conflict_clause )? -> ^( NOT_NULL ( table_conflict_clause )? ) ;
    public final SqlParser.column_constraint_not_null_return column_constraint_not_null() throws RecognitionException {
        SqlParser.column_constraint_not_null_return retval = new SqlParser.column_constraint_not_null_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NOT354=null;
        Token NULL355=null;
        SqlParser.table_conflict_clause_return table_conflict_clause356 =null;


        Object NOT354_tree=null;
        Object NULL355_tree=null;
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
        RewriteRuleSubtreeStream stream_table_conflict_clause=new RewriteRuleSubtreeStream(adaptor,"rule table_conflict_clause");
        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:415:27: ( NOT NULL ( table_conflict_clause )? -> ^( NOT_NULL ( table_conflict_clause )? ) )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:415:29: NOT NULL ( table_conflict_clause )?
            {
            NOT354=(Token)match(input,NOT,FOLLOW_NOT_in_column_constraint_not_null3121);  
            stream_NOT.add(NOT354);


            NULL355=(Token)match(input,NULL,FOLLOW_NULL_in_column_constraint_not_null3123);  
            stream_NULL.add(NULL355);


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:415:38: ( table_conflict_clause )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==ON) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:415:38: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_not_null3125);
                    table_conflict_clause356=table_conflict_clause();

                    state._fsp--;

                    stream_table_conflict_clause.add(table_conflict_clause356.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: table_conflict_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 415:61: -> ^( NOT_NULL ( table_conflict_clause )? )
            {
                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:415:64: ^( NOT_NULL ( table_conflict_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(NOT_NULL, "NOT_NULL")
                , root_1);

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:415:75: ( table_conflict_clause )?
                if ( stream_table_conflict_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_conflict_clause.nextTree());

                }
                stream_table_conflict_clause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "column_constraint_not_null"


    public static class column_constraint_null_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column_constraint_null"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:417:1: column_constraint_null : NULL ( table_conflict_clause )? -> ^( IS_NULL ( table_conflict_clause )? ) ;
    public final SqlParser.column_constraint_null_return column_constraint_null() throws RecognitionException {
        SqlParser.column_constraint_null_return retval = new SqlParser.column_constraint_null_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NULL357=null;
        SqlParser.table_conflict_clause_return table_conflict_clause358 =null;


        Object NULL357_tree=null;
        RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
        RewriteRuleSubtreeStream stream_table_conflict_clause=new RewriteRuleSubtreeStream(adaptor,"rule table_conflict_clause");
        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:417:23: ( NULL ( table_conflict_clause )? -> ^( IS_NULL ( table_conflict_clause )? ) )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:417:25: NULL ( table_conflict_clause )?
            {
            NULL357=(Token)match(input,NULL,FOLLOW_NULL_in_column_constraint_null3142);  
            stream_NULL.add(NULL357);


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:417:30: ( table_conflict_clause )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==ON) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:417:30: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_null3144);
                    table_conflict_clause358=table_conflict_clause();

                    state._fsp--;

                    stream_table_conflict_clause.add(table_conflict_clause358.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: table_conflict_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 417:53: -> ^( IS_NULL ( table_conflict_clause )? )
            {
                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:417:56: ^( IS_NULL ( table_conflict_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IS_NULL, "IS_NULL")
                , root_1);

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:417:66: ( table_conflict_clause )?
                if ( stream_table_conflict_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_conflict_clause.nextTree());

                }
                stream_table_conflict_clause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "column_constraint_null"


    public static class column_constraint_unique_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column_constraint_unique"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:419:1: column_constraint_unique : UNIQUE ^ ( table_conflict_clause )? ;
    public final SqlParser.column_constraint_unique_return column_constraint_unique() throws RecognitionException {
        SqlParser.column_constraint_unique_return retval = new SqlParser.column_constraint_unique_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token UNIQUE359=null;
        SqlParser.table_conflict_clause_return table_conflict_clause360 =null;


        Object UNIQUE359_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:419:25: ( UNIQUE ^ ( table_conflict_clause )? )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:419:27: UNIQUE ^ ( table_conflict_clause )?
            {
            root_0 = (Object)adaptor.nil();


            UNIQUE359=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_column_constraint_unique3161); 
            UNIQUE359_tree = 
            (Object)adaptor.create(UNIQUE359)
            ;
            root_0 = (Object)adaptor.becomeRoot(UNIQUE359_tree, root_0);


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:419:35: ( table_conflict_clause )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==ON) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:419:35: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_unique3164);
                    table_conflict_clause360=table_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, table_conflict_clause360.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "column_constraint_unique"


    public static class column_constraint_check_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column_constraint_check"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:421:1: column_constraint_check : CHECK ^ LPAREN ! expr RPAREN !;
    public final SqlParser.column_constraint_check_return column_constraint_check() throws RecognitionException {
        SqlParser.column_constraint_check_return retval = new SqlParser.column_constraint_check_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CHECK361=null;
        Token LPAREN362=null;
        Token RPAREN364=null;
        SqlParser.expr_return expr363 =null;


        Object CHECK361_tree=null;
        Object LPAREN362_tree=null;
        Object RPAREN364_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:421:24: ( CHECK ^ LPAREN ! expr RPAREN !)
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:421:26: CHECK ^ LPAREN ! expr RPAREN !
            {
            root_0 = (Object)adaptor.nil();


            CHECK361=(Token)match(input,CHECK,FOLLOW_CHECK_in_column_constraint_check3172); 
            CHECK361_tree = 
            (Object)adaptor.create(CHECK361)
            ;
            root_0 = (Object)adaptor.becomeRoot(CHECK361_tree, root_0);


            LPAREN362=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_column_constraint_check3175); 

            pushFollow(FOLLOW_expr_in_column_constraint_check3178);
            expr363=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr363.getTree());

            RPAREN364=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_column_constraint_check3180); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "column_constraint_check"


    public static class numeric_literal_value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "numeric_literal_value"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:423:1: numeric_literal_value : ( INTEGER -> ^( INTEGER_LITERAL INTEGER ) | FLOAT -> ^( FLOAT_LITERAL FLOAT ) );
    public final SqlParser.numeric_literal_value_return numeric_literal_value() throws RecognitionException {
        SqlParser.numeric_literal_value_return retval = new SqlParser.numeric_literal_value_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTEGER365=null;
        Token FLOAT366=null;

        Object INTEGER365_tree=null;
        Object FLOAT366_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:424:3: ( INTEGER -> ^( INTEGER_LITERAL INTEGER ) | FLOAT -> ^( FLOAT_LITERAL FLOAT ) )
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==INTEGER) ) {
                alt138=1;
            }
            else if ( (LA138_0==FLOAT) ) {
                alt138=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 138, 0, input);

                throw nvae;

            }
            switch (alt138) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:424:5: INTEGER
                    {
                    INTEGER365=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_numeric_literal_value3191);  
                    stream_INTEGER.add(INTEGER365);


                    // AST REWRITE
                    // elements: INTEGER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 424:13: -> ^( INTEGER_LITERAL INTEGER )
                    {
                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:424:16: ^( INTEGER_LITERAL INTEGER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(INTEGER_LITERAL, "INTEGER_LITERAL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_INTEGER.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:425:5: FLOAT
                    {
                    FLOAT366=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_numeric_literal_value3205);  
                    stream_FLOAT.add(FLOAT366);


                    // AST REWRITE
                    // elements: FLOAT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 425:11: -> ^( FLOAT_LITERAL FLOAT )
                    {
                        // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:425:14: ^( FLOAT_LITERAL FLOAT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FLOAT_LITERAL, "FLOAT_LITERAL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_FLOAT.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "numeric_literal_value"


    public static class signed_default_number_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "signed_default_number"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:428:1: signed_default_number : ( PLUS | MINUS ) ^ numeric_literal_value ;
    public final SqlParser.signed_default_number_return signed_default_number() throws RecognitionException {
        SqlParser.signed_default_number_return retval = new SqlParser.signed_default_number_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set367=null;
        SqlParser.numeric_literal_value_return numeric_literal_value368 =null;


        Object set367_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:428:22: ( ( PLUS | MINUS ) ^ numeric_literal_value )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:428:24: ( PLUS | MINUS ) ^ numeric_literal_value
            {
            root_0 = (Object)adaptor.nil();


            set367=(Token)input.LT(1);

            set367=(Token)input.LT(1);

            if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
                input.consume();
                root_0 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(set367)
                , root_0);
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            pushFollow(FOLLOW_numeric_literal_value_in_signed_default_number3232);
            numeric_literal_value368=numeric_literal_value();

            state._fsp--;

            adaptor.addChild(root_0, numeric_literal_value368.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "signed_default_number"


    public static class column_constraint_default_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column_constraint_default"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:431:1: column_constraint_default : DEFAULT ^ ( signed_default_number | literal_value | LPAREN ! expr RPAREN !) ;
    public final SqlParser.column_constraint_default_return column_constraint_default() throws RecognitionException {
        SqlParser.column_constraint_default_return retval = new SqlParser.column_constraint_default_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DEFAULT369=null;
        Token LPAREN372=null;
        Token RPAREN374=null;
        SqlParser.signed_default_number_return signed_default_number370 =null;

        SqlParser.literal_value_return literal_value371 =null;

        SqlParser.expr_return expr373 =null;


        Object DEFAULT369_tree=null;
        Object LPAREN372_tree=null;
        Object RPAREN374_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:431:26: ( DEFAULT ^ ( signed_default_number | literal_value | LPAREN ! expr RPAREN !) )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:431:28: DEFAULT ^ ( signed_default_number | literal_value | LPAREN ! expr RPAREN !)
            {
            root_0 = (Object)adaptor.nil();


            DEFAULT369=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_column_constraint_default3240); 
            DEFAULT369_tree = 
            (Object)adaptor.create(DEFAULT369)
            ;
            root_0 = (Object)adaptor.becomeRoot(DEFAULT369_tree, root_0);


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:431:37: ( signed_default_number | literal_value | LPAREN ! expr RPAREN !)
            int alt139=3;
            switch ( input.LA(1) ) {
            case MINUS:
            case PLUS:
                {
                alt139=1;
                }
                break;
            case BLOB:
            case CURRENT_DATE:
            case CURRENT_TIME:
            case CURRENT_TIMESTAMP:
            case FLOAT:
            case INTEGER:
            case NULL:
            case STRING:
                {
                alt139=2;
                }
                break;
            case LPAREN:
                {
                alt139=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 139, 0, input);

                throw nvae;

            }

            switch (alt139) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:431:38: signed_default_number
                    {
                    pushFollow(FOLLOW_signed_default_number_in_column_constraint_default3244);
                    signed_default_number370=signed_default_number();

                    state._fsp--;

                    adaptor.addChild(root_0, signed_default_number370.getTree());

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:431:62: literal_value
                    {
                    pushFollow(FOLLOW_literal_value_in_column_constraint_default3248);
                    literal_value371=literal_value();

                    state._fsp--;

                    adaptor.addChild(root_0, literal_value371.getTree());

                    }
                    break;
                case 3 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:431:78: LPAREN ! expr RPAREN !
                    {
                    LPAREN372=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_column_constraint_default3252); 

                    pushFollow(FOLLOW_expr_in_column_constraint_default3255);
                    expr373=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr373.getTree());

                    RPAREN374=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_column_constraint_default3257); 

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "column_constraint_default"


    public static class column_constraint_collate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column_constraint_collate"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:433:1: column_constraint_collate : COLLATE ^collation_name= id ;
    public final SqlParser.column_constraint_collate_return column_constraint_collate() throws RecognitionException {
        SqlParser.column_constraint_collate_return retval = new SqlParser.column_constraint_collate_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COLLATE375=null;
        SqlParser.id_return collation_name =null;


        Object COLLATE375_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:433:26: ( COLLATE ^collation_name= id )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:433:28: COLLATE ^collation_name= id
            {
            root_0 = (Object)adaptor.nil();


            COLLATE375=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_column_constraint_collate3266); 
            COLLATE375_tree = 
            (Object)adaptor.create(COLLATE375)
            ;
            root_0 = (Object)adaptor.becomeRoot(COLLATE375_tree, root_0);


            pushFollow(FOLLOW_id_in_column_constraint_collate3271);
            collation_name=id();

            state._fsp--;

            adaptor.addChild(root_0, collation_name.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "column_constraint_collate"


    public static class table_constraint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table_constraint"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:435:1: table_constraint : ( CONSTRAINT name= id )? ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk ) -> ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? ) ;
    public final SqlParser.table_constraint_return table_constraint() throws RecognitionException {
        SqlParser.table_constraint_return retval = new SqlParser.table_constraint_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CONSTRAINT376=null;
        SqlParser.id_return name =null;

        SqlParser.table_constraint_pk_return table_constraint_pk377 =null;

        SqlParser.table_constraint_unique_return table_constraint_unique378 =null;

        SqlParser.table_constraint_check_return table_constraint_check379 =null;

        SqlParser.table_constraint_fk_return table_constraint_fk380 =null;


        Object CONSTRAINT376_tree=null;
        RewriteRuleTokenStream stream_CONSTRAINT=new RewriteRuleTokenStream(adaptor,"token CONSTRAINT");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_table_constraint_pk=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint_pk");
        RewriteRuleSubtreeStream stream_table_constraint_fk=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint_fk");
        RewriteRuleSubtreeStream stream_table_constraint_unique=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint_unique");
        RewriteRuleSubtreeStream stream_table_constraint_check=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint_check");
        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:435:17: ( ( CONSTRAINT name= id )? ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk ) -> ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? ) )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:435:19: ( CONSTRAINT name= id )? ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk )
            {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:435:19: ( CONSTRAINT name= id )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==CONSTRAINT) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:435:20: CONSTRAINT name= id
                    {
                    CONSTRAINT376=(Token)match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_table_constraint3280);  
                    stream_CONSTRAINT.add(CONSTRAINT376);


                    pushFollow(FOLLOW_id_in_table_constraint3284);
                    name=id();

                    state._fsp--;

                    stream_id.add(name.getTree());

                    }
                    break;

            }


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:436:3: ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk )
            int alt141=4;
            switch ( input.LA(1) ) {
            case PRIMARY:
                {
                alt141=1;
                }
                break;
            case UNIQUE:
                {
                alt141=2;
                }
                break;
            case CHECK:
                {
                alt141=3;
                }
                break;
            case FOREIGN:
                {
                alt141=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 141, 0, input);

                throw nvae;

            }

            switch (alt141) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:436:5: table_constraint_pk
                    {
                    pushFollow(FOLLOW_table_constraint_pk_in_table_constraint3292);
                    table_constraint_pk377=table_constraint_pk();

                    state._fsp--;

                    stream_table_constraint_pk.add(table_constraint_pk377.getTree());

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:437:5: table_constraint_unique
                    {
                    pushFollow(FOLLOW_table_constraint_unique_in_table_constraint3298);
                    table_constraint_unique378=table_constraint_unique();

                    state._fsp--;

                    stream_table_constraint_unique.add(table_constraint_unique378.getTree());

                    }
                    break;
                case 3 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:438:5: table_constraint_check
                    {
                    pushFollow(FOLLOW_table_constraint_check_in_table_constraint3304);
                    table_constraint_check379=table_constraint_check();

                    state._fsp--;

                    stream_table_constraint_check.add(table_constraint_check379.getTree());

                    }
                    break;
                case 4 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:439:5: table_constraint_fk
                    {
                    pushFollow(FOLLOW_table_constraint_fk_in_table_constraint3310);
                    table_constraint_fk380=table_constraint_fk();

                    state._fsp--;

                    stream_table_constraint_fk.add(table_constraint_fk380.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: table_constraint_unique, table_constraint_pk, name, table_constraint_check, table_constraint_fk
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 440:10: -> ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? )
            {
                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:440:4: ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TABLE_CONSTRAINT, "TABLE_CONSTRAINT")
                , root_1);

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:441:3: ( table_constraint_pk )?
                if ( stream_table_constraint_pk.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_pk.nextTree());

                }
                stream_table_constraint_pk.reset();

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:442:3: ( table_constraint_unique )?
                if ( stream_table_constraint_unique.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_unique.nextTree());

                }
                stream_table_constraint_unique.reset();

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:443:3: ( table_constraint_check )?
                if ( stream_table_constraint_check.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_check.nextTree());

                }
                stream_table_constraint_check.reset();

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:444:3: ( table_constraint_fk )?
                if ( stream_table_constraint_fk.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_fk.nextTree());

                }
                stream_table_constraint_fk.reset();

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:445:4: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.nextTree());

                }
                stream_name.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "table_constraint"


    public static class table_constraint_pk_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table_constraint_pk"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:447:1: table_constraint_pk : PRIMARY KEY LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) ;
    public final SqlParser.table_constraint_pk_return table_constraint_pk() throws RecognitionException {
        SqlParser.table_constraint_pk_return retval = new SqlParser.table_constraint_pk_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PRIMARY381=null;
        Token KEY382=null;
        Token LPAREN383=null;
        Token COMMA384=null;
        Token RPAREN385=null;
        List list_indexed_columns=null;
        SqlParser.table_conflict_clause_return table_conflict_clause386 =null;

        RuleReturnScope indexed_columns = null;
        Object PRIMARY381_tree=null;
        Object KEY382_tree=null;
        Object LPAREN383_tree=null;
        Object COMMA384_tree=null;
        Object RPAREN385_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_PRIMARY=new RewriteRuleTokenStream(adaptor,"token PRIMARY");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_table_conflict_clause=new RewriteRuleSubtreeStream(adaptor,"rule table_conflict_clause");
        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:447:20: ( PRIMARY KEY LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:447:22: PRIMARY KEY LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )?
            {
            PRIMARY381=(Token)match(input,PRIMARY,FOLLOW_PRIMARY_in_table_constraint_pk3350);  
            stream_PRIMARY.add(PRIMARY381);


            KEY382=(Token)match(input,KEY,FOLLOW_KEY_in_table_constraint_pk3352);  
            stream_KEY.add(KEY382);


            LPAREN383=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_pk3356);  
            stream_LPAREN.add(LPAREN383);


            pushFollow(FOLLOW_id_in_table_constraint_pk3360);
            indexed_columns=id();

            state._fsp--;

            stream_id.add(indexed_columns.getTree());
            if (list_indexed_columns==null) list_indexed_columns=new ArrayList();
            list_indexed_columns.add(indexed_columns.getTree());


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:448:30: ( COMMA indexed_columns+= id )*
            loop142:
            do {
                int alt142=2;
                int LA142_0 = input.LA(1);

                if ( (LA142_0==COMMA) ) {
                    alt142=1;
                }


                switch (alt142) {
            	case 1 :
            	    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:448:31: COMMA indexed_columns+= id
            	    {
            	    COMMA384=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_constraint_pk3363);  
            	    stream_COMMA.add(COMMA384);


            	    pushFollow(FOLLOW_id_in_table_constraint_pk3367);
            	    indexed_columns=id();

            	    state._fsp--;

            	    stream_id.add(indexed_columns.getTree());
            	    if (list_indexed_columns==null) list_indexed_columns=new ArrayList();
            	    list_indexed_columns.add(indexed_columns.getTree());


            	    }
            	    break;

            	default :
            	    break loop142;
                }
            } while (true);


            RPAREN385=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_pk3371);  
            stream_RPAREN.add(RPAREN385);


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:448:66: ( table_conflict_clause )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==ON) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:448:66: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_table_constraint_pk3373);
                    table_conflict_clause386=table_conflict_clause();

                    state._fsp--;

                    stream_table_conflict_clause.add(table_conflict_clause386.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: table_conflict_clause, PRIMARY, indexed_columns
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: indexed_columns
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_indexed_columns=new RewriteRuleSubtreeStream(adaptor,"token indexed_columns",list_indexed_columns);
            root_0 = (Object)adaptor.nil();
            // 449:66: -> ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
            {
                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:449:4: ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_PRIMARY.nextNode()
                , root_1);

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:449:14: ^( COLUMNS ( $indexed_columns)+ )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COLUMNS, "COLUMNS")
                , root_2);

                if ( !(stream_indexed_columns.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_indexed_columns.hasNext() ) {
                    adaptor.addChild(root_2, stream_indexed_columns.nextTree());

                }
                stream_indexed_columns.reset();

                adaptor.addChild(root_1, root_2);
                }

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:449:43: ( table_conflict_clause )?
                if ( stream_table_conflict_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_conflict_clause.nextTree());

                }
                stream_table_conflict_clause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "table_constraint_pk"


    public static class table_constraint_unique_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table_constraint_unique"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:451:1: table_constraint_unique : UNIQUE LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) ;
    public final SqlParser.table_constraint_unique_return table_constraint_unique() throws RecognitionException {
        SqlParser.table_constraint_unique_return retval = new SqlParser.table_constraint_unique_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token UNIQUE387=null;
        Token LPAREN388=null;
        Token COMMA389=null;
        Token RPAREN390=null;
        List list_indexed_columns=null;
        SqlParser.table_conflict_clause_return table_conflict_clause391 =null;

        RuleReturnScope indexed_columns = null;
        Object UNIQUE387_tree=null;
        Object LPAREN388_tree=null;
        Object COMMA389_tree=null;
        Object RPAREN390_tree=null;
        RewriteRuleTokenStream stream_UNIQUE=new RewriteRuleTokenStream(adaptor,"token UNIQUE");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_table_conflict_clause=new RewriteRuleSubtreeStream(adaptor,"rule table_conflict_clause");
        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:451:24: ( UNIQUE LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:451:26: UNIQUE LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )?
            {
            UNIQUE387=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_table_constraint_unique3398);  
            stream_UNIQUE.add(UNIQUE387);


            LPAREN388=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_unique3402);  
            stream_LPAREN.add(LPAREN388);


            pushFollow(FOLLOW_id_in_table_constraint_unique3406);
            indexed_columns=id();

            state._fsp--;

            stream_id.add(indexed_columns.getTree());
            if (list_indexed_columns==null) list_indexed_columns=new ArrayList();
            list_indexed_columns.add(indexed_columns.getTree());


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:452:30: ( COMMA indexed_columns+= id )*
            loop144:
            do {
                int alt144=2;
                int LA144_0 = input.LA(1);

                if ( (LA144_0==COMMA) ) {
                    alt144=1;
                }


                switch (alt144) {
            	case 1 :
            	    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:452:31: COMMA indexed_columns+= id
            	    {
            	    COMMA389=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_constraint_unique3409);  
            	    stream_COMMA.add(COMMA389);


            	    pushFollow(FOLLOW_id_in_table_constraint_unique3413);
            	    indexed_columns=id();

            	    state._fsp--;

            	    stream_id.add(indexed_columns.getTree());
            	    if (list_indexed_columns==null) list_indexed_columns=new ArrayList();
            	    list_indexed_columns.add(indexed_columns.getTree());


            	    }
            	    break;

            	default :
            	    break loop144;
                }
            } while (true);


            RPAREN390=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_unique3417);  
            stream_RPAREN.add(RPAREN390);


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:452:66: ( table_conflict_clause )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==ON) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:452:66: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_table_constraint_unique3419);
                    table_conflict_clause391=table_conflict_clause();

                    state._fsp--;

                    stream_table_conflict_clause.add(table_conflict_clause391.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: indexed_columns, table_conflict_clause, UNIQUE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: indexed_columns
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_indexed_columns=new RewriteRuleSubtreeStream(adaptor,"token indexed_columns",list_indexed_columns);
            root_0 = (Object)adaptor.nil();
            // 453:65: -> ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
            {
                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:453:4: ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_UNIQUE.nextNode()
                , root_1);

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:453:13: ^( COLUMNS ( $indexed_columns)+ )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COLUMNS, "COLUMNS")
                , root_2);

                if ( !(stream_indexed_columns.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_indexed_columns.hasNext() ) {
                    adaptor.addChild(root_2, stream_indexed_columns.nextTree());

                }
                stream_indexed_columns.reset();

                adaptor.addChild(root_1, root_2);
                }

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:453:42: ( table_conflict_clause )?
                if ( stream_table_conflict_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_conflict_clause.nextTree());

                }
                stream_table_conflict_clause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "table_constraint_unique"


    public static class table_constraint_check_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table_constraint_check"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:455:1: table_constraint_check : CHECK ^ LPAREN ! expr RPAREN !;
    public final SqlParser.table_constraint_check_return table_constraint_check() throws RecognitionException {
        SqlParser.table_constraint_check_return retval = new SqlParser.table_constraint_check_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CHECK392=null;
        Token LPAREN393=null;
        Token RPAREN395=null;
        SqlParser.expr_return expr394 =null;


        Object CHECK392_tree=null;
        Object LPAREN393_tree=null;
        Object RPAREN395_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:455:23: ( CHECK ^ LPAREN ! expr RPAREN !)
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:455:25: CHECK ^ LPAREN ! expr RPAREN !
            {
            root_0 = (Object)adaptor.nil();


            CHECK392=(Token)match(input,CHECK,FOLLOW_CHECK_in_table_constraint_check3444); 
            CHECK392_tree = 
            (Object)adaptor.create(CHECK392)
            ;
            root_0 = (Object)adaptor.becomeRoot(CHECK392_tree, root_0);


            LPAREN393=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_check3447); 

            pushFollow(FOLLOW_expr_in_table_constraint_check3450);
            expr394=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr394.getTree());

            RPAREN395=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_check3452); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "table_constraint_check"


    public static class table_constraint_fk_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table_constraint_fk"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:457:1: table_constraint_fk : FOREIGN KEY LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN fk_clause -> ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause ) ;
    public final SqlParser.table_constraint_fk_return table_constraint_fk() throws RecognitionException {
        SqlParser.table_constraint_fk_return retval = new SqlParser.table_constraint_fk_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token FOREIGN396=null;
        Token KEY397=null;
        Token LPAREN398=null;
        Token COMMA399=null;
        Token RPAREN400=null;
        List list_column_names=null;
        SqlParser.fk_clause_return fk_clause401 =null;

        RuleReturnScope column_names = null;
        Object FOREIGN396_tree=null;
        Object KEY397_tree=null;
        Object LPAREN398_tree=null;
        Object COMMA399_tree=null;
        Object RPAREN400_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_FOREIGN=new RewriteRuleTokenStream(adaptor,"token FOREIGN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_fk_clause=new RewriteRuleSubtreeStream(adaptor,"rule fk_clause");
        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:457:20: ( FOREIGN KEY LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN fk_clause -> ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause ) )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:457:22: FOREIGN KEY LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN fk_clause
            {
            FOREIGN396=(Token)match(input,FOREIGN,FOLLOW_FOREIGN_in_table_constraint_fk3460);  
            stream_FOREIGN.add(FOREIGN396);


            KEY397=(Token)match(input,KEY,FOLLOW_KEY_in_table_constraint_fk3462);  
            stream_KEY.add(KEY397);


            LPAREN398=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_fk3464);  
            stream_LPAREN.add(LPAREN398);


            pushFollow(FOLLOW_id_in_table_constraint_fk3468);
            column_names=id();

            state._fsp--;

            stream_id.add(column_names.getTree());
            if (list_column_names==null) list_column_names=new ArrayList();
            list_column_names.add(column_names.getTree());


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:457:58: ( COMMA column_names+= id )*
            loop146:
            do {
                int alt146=2;
                int LA146_0 = input.LA(1);

                if ( (LA146_0==COMMA) ) {
                    alt146=1;
                }


                switch (alt146) {
            	case 1 :
            	    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:457:59: COMMA column_names+= id
            	    {
            	    COMMA399=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_constraint_fk3471);  
            	    stream_COMMA.add(COMMA399);


            	    pushFollow(FOLLOW_id_in_table_constraint_fk3475);
            	    column_names=id();

            	    state._fsp--;

            	    stream_id.add(column_names.getTree());
            	    if (list_column_names==null) list_column_names=new ArrayList();
            	    list_column_names.add(column_names.getTree());


            	    }
            	    break;

            	default :
            	    break loop146;
                }
            } while (true);


            RPAREN400=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_fk3479);  
            stream_RPAREN.add(RPAREN400);


            pushFollow(FOLLOW_fk_clause_in_table_constraint_fk3481);
            fk_clause401=fk_clause();

            state._fsp--;

            stream_fk_clause.add(fk_clause401.getTree());

            // AST REWRITE
            // elements: FOREIGN, fk_clause, column_names
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: column_names
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_column_names=new RewriteRuleSubtreeStream(adaptor,"token column_names",list_column_names);
            root_0 = (Object)adaptor.nil();
            // 458:50: -> ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause )
            {
                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:458:4: ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_FOREIGN.nextNode()
                , root_1);

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:458:14: ^( COLUMNS ( $column_names)+ )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COLUMNS, "COLUMNS")
                , root_2);

                if ( !(stream_column_names.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_column_names.hasNext() ) {
                    adaptor.addChild(root_2, stream_column_names.nextTree());

                }
                stream_column_names.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_fk_clause.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "table_constraint_fk"


    public static class fk_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fk_clause"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:460:1: fk_clause : REFERENCES foreign_table= id ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( fk_clause_action )* ( fk_clause_deferrable )? -> ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )* ( fk_clause_deferrable )? ) ;
    public final SqlParser.fk_clause_return fk_clause() throws RecognitionException {
        SqlParser.fk_clause_return retval = new SqlParser.fk_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token REFERENCES402=null;
        Token LPAREN403=null;
        Token COMMA404=null;
        Token RPAREN405=null;
        List list_column_names=null;
        SqlParser.id_return foreign_table =null;

        SqlParser.fk_clause_action_return fk_clause_action406 =null;

        SqlParser.fk_clause_deferrable_return fk_clause_deferrable407 =null;

        RuleReturnScope column_names = null;
        Object REFERENCES402_tree=null;
        Object LPAREN403_tree=null;
        Object COMMA404_tree=null;
        Object RPAREN405_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_REFERENCES=new RewriteRuleTokenStream(adaptor,"token REFERENCES");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_fk_clause_action=new RewriteRuleSubtreeStream(adaptor,"rule fk_clause_action");
        RewriteRuleSubtreeStream stream_fk_clause_deferrable=new RewriteRuleSubtreeStream(adaptor,"rule fk_clause_deferrable");
        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:460:10: ( REFERENCES foreign_table= id ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( fk_clause_action )* ( fk_clause_deferrable )? -> ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )* ( fk_clause_deferrable )? ) )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:460:12: REFERENCES foreign_table= id ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( fk_clause_action )* ( fk_clause_deferrable )?
            {
            REFERENCES402=(Token)match(input,REFERENCES,FOLLOW_REFERENCES_in_fk_clause3504);  
            stream_REFERENCES.add(REFERENCES402);


            pushFollow(FOLLOW_id_in_fk_clause3508);
            foreign_table=id();

            state._fsp--;

            stream_id.add(foreign_table.getTree());

            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:460:40: ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==LPAREN) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:460:41: LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN
                    {
                    LPAREN403=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_fk_clause3511);  
                    stream_LPAREN.add(LPAREN403);


                    pushFollow(FOLLOW_id_in_fk_clause3515);
                    column_names=id();

                    state._fsp--;

                    stream_id.add(column_names.getTree());
                    if (list_column_names==null) list_column_names=new ArrayList();
                    list_column_names.add(column_names.getTree());


                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:460:65: ( COMMA column_names+= id )*
                    loop147:
                    do {
                        int alt147=2;
                        int LA147_0 = input.LA(1);

                        if ( (LA147_0==COMMA) ) {
                            alt147=1;
                        }


                        switch (alt147) {
                    	case 1 :
                    	    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:460:66: COMMA column_names+= id
                    	    {
                    	    COMMA404=(Token)match(input,COMMA,FOLLOW_COMMA_in_fk_clause3518);  
                    	    stream_COMMA.add(COMMA404);


                    	    pushFollow(FOLLOW_id_in_fk_clause3522);
                    	    column_names=id();

                    	    state._fsp--;

                    	    stream_id.add(column_names.getTree());
                    	    if (list_column_names==null) list_column_names=new ArrayList();
                    	    list_column_names.add(column_names.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop147;
                        }
                    } while (true);


                    RPAREN405=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_fk_clause3526);  
                    stream_RPAREN.add(RPAREN405);


                    }
                    break;

            }


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:461:3: ( fk_clause_action )*
            loop149:
            do {
                int alt149=2;
                int LA149_0 = input.LA(1);

                if ( (LA149_0==MATCH||LA149_0==ON) ) {
                    alt149=1;
                }


                switch (alt149) {
            	case 1 :
            	    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:461:3: fk_clause_action
            	    {
            	    pushFollow(FOLLOW_fk_clause_action_in_fk_clause3532);
            	    fk_clause_action406=fk_clause_action();

            	    state._fsp--;

            	    stream_fk_clause_action.add(fk_clause_action406.getTree());

            	    }
            	    break;

            	default :
            	    break loop149;
                }
            } while (true);


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:461:21: ( fk_clause_deferrable )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==NOT) ) {
                int LA150_1 = input.LA(2);

                if ( (LA150_1==DEFERRABLE) ) {
                    alt150=1;
                }
            }
            else if ( (LA150_0==DEFERRABLE) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:461:21: fk_clause_deferrable
                    {
                    pushFollow(FOLLOW_fk_clause_deferrable_in_fk_clause3535);
                    fk_clause_deferrable407=fk_clause_deferrable();

                    state._fsp--;

                    stream_fk_clause_deferrable.add(fk_clause_deferrable407.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: fk_clause_deferrable, fk_clause_action, REFERENCES, foreign_table, column_names
            // token labels: 
            // rule labels: retval, foreign_table
            // token list labels: 
            // rule list labels: column_names
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_foreign_table=new RewriteRuleSubtreeStream(adaptor,"rule foreign_table",foreign_table!=null?foreign_table.tree:null);
            RewriteRuleSubtreeStream stream_column_names=new RewriteRuleSubtreeStream(adaptor,"token column_names",list_column_names);
            root_0 = (Object)adaptor.nil();
            // 462:98: -> ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )* ( fk_clause_deferrable )? )
            {
                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:462:4: ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )* ( fk_clause_deferrable )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_REFERENCES.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_foreign_table.nextTree());

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:462:32: ^( COLUMNS ( $column_names)+ )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COLUMNS, "COLUMNS")
                , root_2);

                if ( !(stream_column_names.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_column_names.hasNext() ) {
                    adaptor.addChild(root_2, stream_column_names.nextTree());

                }
                stream_column_names.reset();

                adaptor.addChild(root_1, root_2);
                }

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:462:58: ( fk_clause_action )*
                while ( stream_fk_clause_action.hasNext() ) {
                    adaptor.addChild(root_1, stream_fk_clause_action.nextTree());

                }
                stream_fk_clause_action.reset();

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:462:76: ( fk_clause_deferrable )?
                if ( stream_fk_clause_deferrable.hasNext() ) {
                    adaptor.addChild(root_1, stream_fk_clause_deferrable.nextTree());

                }
                stream_fk_clause_deferrable.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fk_clause"


    public static class fk_clause_action_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fk_clause_action"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:464:1: fk_clause_action : ( ON ^ ( DELETE | UPDATE | INSERT ) ( SET ! NULL | SET ! DEFAULT | CASCADE | RESTRICT ) | MATCH ^ id );
    public final SqlParser.fk_clause_action_return fk_clause_action() throws RecognitionException {
        SqlParser.fk_clause_action_return retval = new SqlParser.fk_clause_action_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ON408=null;
        Token set409=null;
        Token SET410=null;
        Token NULL411=null;
        Token SET412=null;
        Token DEFAULT413=null;
        Token CASCADE414=null;
        Token RESTRICT415=null;
        Token MATCH416=null;
        SqlParser.id_return id417 =null;


        Object ON408_tree=null;
        Object set409_tree=null;
        Object SET410_tree=null;
        Object NULL411_tree=null;
        Object SET412_tree=null;
        Object DEFAULT413_tree=null;
        Object CASCADE414_tree=null;
        Object RESTRICT415_tree=null;
        Object MATCH416_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:465:3: ( ON ^ ( DELETE | UPDATE | INSERT ) ( SET ! NULL | SET ! DEFAULT | CASCADE | RESTRICT ) | MATCH ^ id )
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==ON) ) {
                alt152=1;
            }
            else if ( (LA152_0==MATCH) ) {
                alt152=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 152, 0, input);

                throw nvae;

            }
            switch (alt152) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:465:5: ON ^ ( DELETE | UPDATE | INSERT ) ( SET ! NULL | SET ! DEFAULT | CASCADE | RESTRICT )
                    {
                    root_0 = (Object)adaptor.nil();


                    ON408=(Token)match(input,ON,FOLLOW_ON_in_fk_clause_action3569); 
                    ON408_tree = 
                    (Object)adaptor.create(ON408)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ON408_tree, root_0);


                    set409=(Token)input.LT(1);

                    if ( input.LA(1)==DELETE||input.LA(1)==INSERT||input.LA(1)==UPDATE ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set409)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:465:36: ( SET ! NULL | SET ! DEFAULT | CASCADE | RESTRICT )
                    int alt151=4;
                    switch ( input.LA(1) ) {
                    case SET:
                        {
                        int LA151_1 = input.LA(2);

                        if ( (LA151_1==NULL) ) {
                            alt151=1;
                        }
                        else if ( (LA151_1==DEFAULT) ) {
                            alt151=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 151, 1, input);

                            throw nvae;

                        }
                        }
                        break;
                    case CASCADE:
                        {
                        alt151=3;
                        }
                        break;
                    case RESTRICT:
                        {
                        alt151=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 151, 0, input);

                        throw nvae;

                    }

                    switch (alt151) {
                        case 1 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:465:37: SET ! NULL
                            {
                            SET410=(Token)match(input,SET,FOLLOW_SET_in_fk_clause_action3585); 

                            NULL411=(Token)match(input,NULL,FOLLOW_NULL_in_fk_clause_action3588); 
                            NULL411_tree = 
                            (Object)adaptor.create(NULL411)
                            ;
                            adaptor.addChild(root_0, NULL411_tree);


                            }
                            break;
                        case 2 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:465:49: SET ! DEFAULT
                            {
                            SET412=(Token)match(input,SET,FOLLOW_SET_in_fk_clause_action3592); 

                            DEFAULT413=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_fk_clause_action3595); 
                            DEFAULT413_tree = 
                            (Object)adaptor.create(DEFAULT413)
                            ;
                            adaptor.addChild(root_0, DEFAULT413_tree);


                            }
                            break;
                        case 3 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:465:64: CASCADE
                            {
                            CASCADE414=(Token)match(input,CASCADE,FOLLOW_CASCADE_in_fk_clause_action3599); 
                            CASCADE414_tree = 
                            (Object)adaptor.create(CASCADE414)
                            ;
                            adaptor.addChild(root_0, CASCADE414_tree);


                            }
                            break;
                        case 4 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:465:74: RESTRICT
                            {
                            RESTRICT415=(Token)match(input,RESTRICT,FOLLOW_RESTRICT_in_fk_clause_action3603); 
                            RESTRICT415_tree = 
                            (Object)adaptor.create(RESTRICT415)
                            ;
                            adaptor.addChild(root_0, RESTRICT415_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:466:5: MATCH ^ id
                    {
                    root_0 = (Object)adaptor.nil();


                    MATCH416=(Token)match(input,MATCH,FOLLOW_MATCH_in_fk_clause_action3610); 
                    MATCH416_tree = 
                    (Object)adaptor.create(MATCH416)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(MATCH416_tree, root_0);


                    pushFollow(FOLLOW_id_in_fk_clause_action3613);
                    id417=id();

                    state._fsp--;

                    adaptor.addChild(root_0, id417.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fk_clause_action"


    public static class fk_clause_deferrable_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fk_clause_deferrable"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:468:1: fk_clause_deferrable : ( NOT )? DEFERRABLE ^ ( INITIALLY ! DEFERRED | INITIALLY ! IMMEDIATE )? ;
    public final SqlParser.fk_clause_deferrable_return fk_clause_deferrable() throws RecognitionException {
        SqlParser.fk_clause_deferrable_return retval = new SqlParser.fk_clause_deferrable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NOT418=null;
        Token DEFERRABLE419=null;
        Token INITIALLY420=null;
        Token DEFERRED421=null;
        Token INITIALLY422=null;
        Token IMMEDIATE423=null;

        Object NOT418_tree=null;
        Object DEFERRABLE419_tree=null;
        Object INITIALLY420_tree=null;
        Object DEFERRED421_tree=null;
        Object INITIALLY422_tree=null;
        Object IMMEDIATE423_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:468:21: ( ( NOT )? DEFERRABLE ^ ( INITIALLY ! DEFERRED | INITIALLY ! IMMEDIATE )? )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:468:23: ( NOT )? DEFERRABLE ^ ( INITIALLY ! DEFERRED | INITIALLY ! IMMEDIATE )?
            {
            root_0 = (Object)adaptor.nil();


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:468:23: ( NOT )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==NOT) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:468:24: NOT
                    {
                    NOT418=(Token)match(input,NOT,FOLLOW_NOT_in_fk_clause_deferrable3621); 
                    NOT418_tree = 
                    (Object)adaptor.create(NOT418)
                    ;
                    adaptor.addChild(root_0, NOT418_tree);


                    }
                    break;

            }


            DEFERRABLE419=(Token)match(input,DEFERRABLE,FOLLOW_DEFERRABLE_in_fk_clause_deferrable3625); 
            DEFERRABLE419_tree = 
            (Object)adaptor.create(DEFERRABLE419)
            ;
            root_0 = (Object)adaptor.becomeRoot(DEFERRABLE419_tree, root_0);


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:468:42: ( INITIALLY ! DEFERRED | INITIALLY ! IMMEDIATE )?
            int alt154=3;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==INITIALLY) ) {
                int LA154_1 = input.LA(2);

                if ( (LA154_1==DEFERRED) ) {
                    alt154=1;
                }
                else if ( (LA154_1==IMMEDIATE) ) {
                    alt154=2;
                }
            }
            switch (alt154) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:468:43: INITIALLY ! DEFERRED
                    {
                    INITIALLY420=(Token)match(input,INITIALLY,FOLLOW_INITIALLY_in_fk_clause_deferrable3629); 

                    DEFERRED421=(Token)match(input,DEFERRED,FOLLOW_DEFERRED_in_fk_clause_deferrable3632); 
                    DEFERRED421_tree = 
                    (Object)adaptor.create(DEFERRED421)
                    ;
                    adaptor.addChild(root_0, DEFERRED421_tree);


                    }
                    break;
                case 2 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:468:65: INITIALLY ! IMMEDIATE
                    {
                    INITIALLY422=(Token)match(input,INITIALLY,FOLLOW_INITIALLY_in_fk_clause_deferrable3636); 

                    IMMEDIATE423=(Token)match(input,IMMEDIATE,FOLLOW_IMMEDIATE_in_fk_clause_deferrable3639); 
                    IMMEDIATE423_tree = 
                    (Object)adaptor.create(IMMEDIATE423)
                    ;
                    adaptor.addChild(root_0, IMMEDIATE423_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fk_clause_deferrable"


    public static class drop_table_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "drop_table_stmt"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:471:1: drop_table_stmt : DROP TABLE ( IF EXISTS )? (database_name= id DOT )? table_name= id -> ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) ) ;
    public final SqlParser.drop_table_stmt_return drop_table_stmt() throws RecognitionException {
        SqlParser.drop_table_stmt_return retval = new SqlParser.drop_table_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DROP424=null;
        Token TABLE425=null;
        Token IF426=null;
        Token EXISTS427=null;
        Token DOT428=null;
        SqlParser.id_return database_name =null;

        SqlParser.id_return table_name =null;


        Object DROP424_tree=null;
        Object TABLE425_tree=null;
        Object IF426_tree=null;
        Object EXISTS427_tree=null;
        Object DOT428_tree=null;
        RewriteRuleTokenStream stream_TABLE=new RewriteRuleTokenStream(adaptor,"token TABLE");
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:471:16: ( DROP TABLE ( IF EXISTS )? (database_name= id DOT )? table_name= id -> ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) ) )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:471:18: DROP TABLE ( IF EXISTS )? (database_name= id DOT )? table_name= id
            {
            DROP424=(Token)match(input,DROP,FOLLOW_DROP_in_drop_table_stmt3649);  
            stream_DROP.add(DROP424);


            TABLE425=(Token)match(input,TABLE,FOLLOW_TABLE_in_drop_table_stmt3651);  
            stream_TABLE.add(TABLE425);


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:471:29: ( IF EXISTS )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==IF) ) {
                int LA155_1 = input.LA(2);

                if ( (LA155_1==EXISTS) ) {
                    alt155=1;
                }
            }
            switch (alt155) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:471:30: IF EXISTS
                    {
                    IF426=(Token)match(input,IF,FOLLOW_IF_in_drop_table_stmt3654);  
                    stream_IF.add(IF426);


                    EXISTS427=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_table_stmt3656);  
                    stream_EXISTS.add(EXISTS427);


                    }
                    break;

            }


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:471:42: (database_name= id DOT )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==ID||LA156_0==STRING) ) {
                int LA156_1 = input.LA(2);

                if ( (LA156_1==DOT) ) {
                    alt156=1;
                }
            }
            else if ( ((LA156_0 >= ABORT && LA156_0 <= AFTER)||(LA156_0 >= ALL && LA156_0 <= ALTER)||(LA156_0 >= ANALYZE && LA156_0 <= AND)||(LA156_0 >= AS && LA156_0 <= ASC)||(LA156_0 >= ATTACH && LA156_0 <= AUTOINCREMENT)||(LA156_0 >= BEFORE && LA156_0 <= BETWEEN)||LA156_0==BY||(LA156_0 >= CASCADE && LA156_0 <= COLLATE)||LA156_0==COLUMN||(LA156_0 >= COMMIT && LA156_0 <= CONSTRAINT)||LA156_0==CREATE||(LA156_0 >= CROSS && LA156_0 <= CURRENT_TIMESTAMP)||(LA156_0 >= DATABASE && LA156_0 <= DISTINCT)||LA156_0==DROP||(LA156_0 >= EACH && LA156_0 <= END)||(LA156_0 >= ESCAPE && LA156_0 <= EXPLAIN)||LA156_0==FAIL||(LA156_0 >= FOR && LA156_0 <= FROM)||LA156_0==GROUP||LA156_0==HAVING||(LA156_0 >= IF && LA156_0 <= IMMEDIATE)||(LA156_0 >= INDEX && LA156_0 <= INSTEAD)||(LA156_0 >= INTERSECT && LA156_0 <= INTO)||LA156_0==IS||LA156_0==JOIN||LA156_0==KEY||LA156_0==LEFT||LA156_0==LIMIT||LA156_0==NATURAL||LA156_0==NULL||(LA156_0 >= OF && LA156_0 <= ON)||(LA156_0 >= OR && LA156_0 <= ORDER)||LA156_0==OUTER||LA156_0==PLAN||(LA156_0 >= PRAGMA && LA156_0 <= PRIMARY)||LA156_0==QUERY||(LA156_0 >= RAISE && LA156_0 <= REFERENCES)||(LA156_0 >= REINDEX && LA156_0 <= ROW)||(LA156_0 >= SAVEPOINT && LA156_0 <= SELECT)||LA156_0==SET||LA156_0==TABLE||(LA156_0 >= TEMPORARY && LA156_0 <= THEN)||(LA156_0 >= TO && LA156_0 <= TRIGGER)||(LA156_0 >= UNION && LA156_0 <= USING)||(LA156_0 >= VACUUM && LA156_0 <= VIRTUAL)||(LA156_0 >= WHEN && LA156_0 <= WHERE)) ) {
                int LA156_2 = input.LA(2);

                if ( (LA156_2==DOT) ) {
                    alt156=1;
                }
            }
            switch (alt156) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:471:43: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_table_stmt3663);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());

                    DOT428=(Token)match(input,DOT,FOLLOW_DOT_in_drop_table_stmt3665);  
                    stream_DOT.add(DOT428);


                    }
                    break;

            }


            pushFollow(FOLLOW_id_in_drop_table_stmt3671);
            table_name=id();

            state._fsp--;

            stream_id.add(table_name.getTree());

            // AST REWRITE
            // elements: database_name, EXISTS, table_name
            // token labels: 
            // rule labels: database_name, retval, table_name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_table_name=new RewriteRuleSubtreeStream(adaptor,"rule table_name",table_name!=null?table_name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 472:67: -> ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) )
            {
                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:472:4: ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DROP_TABLE, "DROP_TABLE")
                , root_1);

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:472:17: ^( OPTIONS ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(OPTIONS, "OPTIONS")
                , root_2);

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:472:27: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, 
                    stream_EXISTS.nextNode()
                    );

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:472:36: ^( $table_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:472:51: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "drop_table_stmt"


    public static class alter_table_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alter_table_stmt"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:475:1: alter_table_stmt : ALTER TABLE (database_name= id DOT )? table_name= id ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def ) ;
    public final SqlParser.alter_table_stmt_return alter_table_stmt() throws RecognitionException {
        SqlParser.alter_table_stmt_return retval = new SqlParser.alter_table_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ALTER429=null;
        Token TABLE430=null;
        Token DOT431=null;
        Token RENAME432=null;
        Token TO433=null;
        Token ADD434=null;
        Token COLUMN435=null;
        SqlParser.id_return database_name =null;

        SqlParser.id_return table_name =null;

        SqlParser.id_return new_table_name =null;

        SqlParser.column_def_return column_def436 =null;


        Object ALTER429_tree=null;
        Object TABLE430_tree=null;
        Object DOT431_tree=null;
        Object RENAME432_tree=null;
        Object TO433_tree=null;
        Object ADD434_tree=null;
        Object COLUMN435_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:475:17: ( ALTER TABLE (database_name= id DOT )? table_name= id ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def ) )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:475:19: ALTER TABLE (database_name= id DOT )? table_name= id ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def )
            {
            root_0 = (Object)adaptor.nil();


            ALTER429=(Token)match(input,ALTER,FOLLOW_ALTER_in_alter_table_stmt3701); 
            ALTER429_tree = 
            (Object)adaptor.create(ALTER429)
            ;
            adaptor.addChild(root_0, ALTER429_tree);


            TABLE430=(Token)match(input,TABLE,FOLLOW_TABLE_in_alter_table_stmt3703); 
            TABLE430_tree = 
            (Object)adaptor.create(TABLE430)
            ;
            adaptor.addChild(root_0, TABLE430_tree);


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:475:31: (database_name= id DOT )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==ID||LA157_0==STRING) ) {
                int LA157_1 = input.LA(2);

                if ( (LA157_1==DOT) ) {
                    alt157=1;
                }
            }
            else if ( ((LA157_0 >= ABORT && LA157_0 <= AFTER)||(LA157_0 >= ALL && LA157_0 <= ALTER)||(LA157_0 >= ANALYZE && LA157_0 <= AND)||(LA157_0 >= AS && LA157_0 <= ASC)||(LA157_0 >= ATTACH && LA157_0 <= AUTOINCREMENT)||(LA157_0 >= BEFORE && LA157_0 <= BETWEEN)||LA157_0==BY||(LA157_0 >= CASCADE && LA157_0 <= COLLATE)||LA157_0==COLUMN||(LA157_0 >= COMMIT && LA157_0 <= CONSTRAINT)||LA157_0==CREATE||(LA157_0 >= CROSS && LA157_0 <= CURRENT_TIMESTAMP)||(LA157_0 >= DATABASE && LA157_0 <= DISTINCT)||LA157_0==DROP||(LA157_0 >= EACH && LA157_0 <= END)||(LA157_0 >= ESCAPE && LA157_0 <= EXPLAIN)||LA157_0==FAIL||(LA157_0 >= FOR && LA157_0 <= FROM)||LA157_0==GROUP||LA157_0==HAVING||(LA157_0 >= IF && LA157_0 <= IMMEDIATE)||(LA157_0 >= INDEX && LA157_0 <= INSTEAD)||(LA157_0 >= INTERSECT && LA157_0 <= INTO)||LA157_0==IS||LA157_0==JOIN||LA157_0==KEY||LA157_0==LEFT||LA157_0==LIMIT||LA157_0==NATURAL||LA157_0==NULL||(LA157_0 >= OF && LA157_0 <= ON)||(LA157_0 >= OR && LA157_0 <= ORDER)||LA157_0==OUTER||LA157_0==PLAN||(LA157_0 >= PRAGMA && LA157_0 <= PRIMARY)||LA157_0==QUERY||(LA157_0 >= RAISE && LA157_0 <= REFERENCES)||(LA157_0 >= REINDEX && LA157_0 <= ROW)||(LA157_0 >= SAVEPOINT && LA157_0 <= SELECT)||LA157_0==SET||LA157_0==TABLE||(LA157_0 >= TEMPORARY && LA157_0 <= THEN)||(LA157_0 >= TO && LA157_0 <= TRIGGER)||(LA157_0 >= UNION && LA157_0 <= USING)||(LA157_0 >= VACUUM && LA157_0 <= VIRTUAL)||(LA157_0 >= WHEN && LA157_0 <= WHERE)) ) {
                int LA157_2 = input.LA(2);

                if ( (LA157_2==DOT) ) {
                    alt157=1;
                }
            }
            switch (alt157) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:475:32: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_alter_table_stmt3708);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());

                    DOT431=(Token)match(input,DOT,FOLLOW_DOT_in_alter_table_stmt3710); 
                    DOT431_tree = 
                    (Object)adaptor.create(DOT431)
                    ;
                    adaptor.addChild(root_0, DOT431_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_id_in_alter_table_stmt3716);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());

            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:475:69: ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def )
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==RENAME) ) {
                alt159=1;
            }
            else if ( (LA159_0==ADD) ) {
                alt159=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 159, 0, input);

                throw nvae;

            }
            switch (alt159) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:475:70: RENAME TO new_table_name= id
                    {
                    RENAME432=(Token)match(input,RENAME,FOLLOW_RENAME_in_alter_table_stmt3719); 
                    RENAME432_tree = 
                    (Object)adaptor.create(RENAME432)
                    ;
                    adaptor.addChild(root_0, RENAME432_tree);


                    TO433=(Token)match(input,TO,FOLLOW_TO_in_alter_table_stmt3721); 
                    TO433_tree = 
                    (Object)adaptor.create(TO433)
                    ;
                    adaptor.addChild(root_0, TO433_tree);


                    pushFollow(FOLLOW_id_in_alter_table_stmt3725);
                    new_table_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, new_table_name.getTree());

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:475:100: ADD ( COLUMN )? column_def
                    {
                    ADD434=(Token)match(input,ADD,FOLLOW_ADD_in_alter_table_stmt3729); 
                    ADD434_tree = 
                    (Object)adaptor.create(ADD434)
                    ;
                    adaptor.addChild(root_0, ADD434_tree);


                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:475:104: ( COLUMN )?
                    int alt158=2;
                    int LA158_0 = input.LA(1);

                    if ( (LA158_0==COLUMN) ) {
                        alt158=1;
                    }
                    switch (alt158) {
                        case 1 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:475:105: COLUMN
                            {
                            COLUMN435=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_alter_table_stmt3732); 
                            COLUMN435_tree = 
                            (Object)adaptor.create(COLUMN435)
                            ;
                            adaptor.addChild(root_0, COLUMN435_tree);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_column_def_in_alter_table_stmt3736);
                    column_def436=column_def();

                    state._fsp--;

                    adaptor.addChild(root_0, column_def436.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "alter_table_stmt"


    public static class create_view_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "create_view_stmt"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:478:1: create_view_stmt : CREATE ( TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= id DOT )? view_name= id AS t= select_stmt -> ^( CREATE_VIEW ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $view_name ( $database_name)? ) ^( STATEMENT $t) ) ;
    public final SqlParser.create_view_stmt_return create_view_stmt() throws RecognitionException {
        SqlParser.create_view_stmt_return retval = new SqlParser.create_view_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CREATE437=null;
        Token TEMPORARY438=null;
        Token VIEW439=null;
        Token IF440=null;
        Token NOT441=null;
        Token EXISTS442=null;
        Token DOT443=null;
        Token AS444=null;
        SqlParser.id_return database_name =null;

        SqlParser.id_return view_name =null;

        SqlParser.select_stmt_return t =null;


        Object CREATE437_tree=null;
        Object TEMPORARY438_tree=null;
        Object VIEW439_tree=null;
        Object IF440_tree=null;
        Object NOT441_tree=null;
        Object EXISTS442_tree=null;
        Object DOT443_tree=null;
        Object AS444_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_VIEW=new RewriteRuleTokenStream(adaptor,"token VIEW");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_TEMPORARY=new RewriteRuleTokenStream(adaptor,"token TEMPORARY");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_select_stmt=new RewriteRuleSubtreeStream(adaptor,"rule select_stmt");
        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:478:17: ( CREATE ( TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= id DOT )? view_name= id AS t= select_stmt -> ^( CREATE_VIEW ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $view_name ( $database_name)? ) ^( STATEMENT $t) ) )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:478:19: CREATE ( TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= id DOT )? view_name= id AS t= select_stmt
            {
            CREATE437=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_view_stmt3745);  
            stream_CREATE.add(CREATE437);


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:478:26: ( TEMPORARY )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==TEMPORARY) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:478:26: TEMPORARY
                    {
                    TEMPORARY438=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_view_stmt3747);  
                    stream_TEMPORARY.add(TEMPORARY438);


                    }
                    break;

            }


            VIEW439=(Token)match(input,VIEW,FOLLOW_VIEW_in_create_view_stmt3750);  
            stream_VIEW.add(VIEW439);


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:478:42: ( IF NOT EXISTS )?
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==IF) ) {
                int LA161_1 = input.LA(2);

                if ( (LA161_1==NOT) ) {
                    alt161=1;
                }
            }
            switch (alt161) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:478:43: IF NOT EXISTS
                    {
                    IF440=(Token)match(input,IF,FOLLOW_IF_in_create_view_stmt3753);  
                    stream_IF.add(IF440);


                    NOT441=(Token)match(input,NOT,FOLLOW_NOT_in_create_view_stmt3755);  
                    stream_NOT.add(NOT441);


                    EXISTS442=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_view_stmt3757);  
                    stream_EXISTS.add(EXISTS442);


                    }
                    break;

            }


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:478:59: (database_name= id DOT )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==ID||LA162_0==STRING) ) {
                int LA162_1 = input.LA(2);

                if ( (LA162_1==DOT) ) {
                    alt162=1;
                }
            }
            else if ( ((LA162_0 >= ABORT && LA162_0 <= AFTER)||(LA162_0 >= ALL && LA162_0 <= ALTER)||(LA162_0 >= ANALYZE && LA162_0 <= AND)||(LA162_0 >= AS && LA162_0 <= ASC)||(LA162_0 >= ATTACH && LA162_0 <= AUTOINCREMENT)||(LA162_0 >= BEFORE && LA162_0 <= BETWEEN)||LA162_0==BY||(LA162_0 >= CASCADE && LA162_0 <= COLLATE)||LA162_0==COLUMN||(LA162_0 >= COMMIT && LA162_0 <= CONSTRAINT)||LA162_0==CREATE||(LA162_0 >= CROSS && LA162_0 <= CURRENT_TIMESTAMP)||(LA162_0 >= DATABASE && LA162_0 <= DISTINCT)||LA162_0==DROP||(LA162_0 >= EACH && LA162_0 <= END)||(LA162_0 >= ESCAPE && LA162_0 <= EXPLAIN)||LA162_0==FAIL||(LA162_0 >= FOR && LA162_0 <= FROM)||LA162_0==GROUP||LA162_0==HAVING||(LA162_0 >= IF && LA162_0 <= IMMEDIATE)||(LA162_0 >= INDEX && LA162_0 <= INSTEAD)||(LA162_0 >= INTERSECT && LA162_0 <= INTO)||LA162_0==IS||LA162_0==JOIN||LA162_0==KEY||LA162_0==LEFT||LA162_0==LIMIT||LA162_0==NATURAL||LA162_0==NULL||(LA162_0 >= OF && LA162_0 <= ON)||(LA162_0 >= OR && LA162_0 <= ORDER)||LA162_0==OUTER||LA162_0==PLAN||(LA162_0 >= PRAGMA && LA162_0 <= PRIMARY)||LA162_0==QUERY||(LA162_0 >= RAISE && LA162_0 <= REFERENCES)||(LA162_0 >= REINDEX && LA162_0 <= ROW)||(LA162_0 >= SAVEPOINT && LA162_0 <= SELECT)||LA162_0==SET||LA162_0==TABLE||(LA162_0 >= TEMPORARY && LA162_0 <= THEN)||(LA162_0 >= TO && LA162_0 <= TRIGGER)||(LA162_0 >= UNION && LA162_0 <= USING)||(LA162_0 >= VACUUM && LA162_0 <= VIRTUAL)||(LA162_0 >= WHEN && LA162_0 <= WHERE)) ) {
                int LA162_2 = input.LA(2);

                if ( (LA162_2==DOT) ) {
                    alt162=1;
                }
            }
            switch (alt162) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:478:60: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_view_stmt3764);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());

                    DOT443=(Token)match(input,DOT,FOLLOW_DOT_in_create_view_stmt3766);  
                    stream_DOT.add(DOT443);


                    }
                    break;

            }


            pushFollow(FOLLOW_id_in_create_view_stmt3772);
            view_name=id();

            state._fsp--;

            stream_id.add(view_name.getTree());

            AS444=(Token)match(input,AS,FOLLOW_AS_in_create_view_stmt3774);  
            stream_AS.add(AS444);


            pushFollow(FOLLOW_select_stmt_in_create_view_stmt3778);
            t=select_stmt();

            state._fsp--;

            stream_select_stmt.add(t.getTree());

            // AST REWRITE
            // elements: t, database_name, view_name, TEMPORARY, EXISTS
            // token labels: 
            // rule labels: view_name, database_name, retval, t
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_view_name=new RewriteRuleSubtreeStream(adaptor,"rule view_name",view_name!=null?view_name.tree:null);
            RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.tree:null);

            root_0 = (Object)adaptor.nil();
            // 479:94: -> ^( CREATE_VIEW ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $view_name ( $database_name)? ) ^( STATEMENT $t) )
            {
                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:479:4: ^( CREATE_VIEW ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $view_name ( $database_name)? ) ^( STATEMENT $t) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CREATE_VIEW, "CREATE_VIEW")
                , root_1);

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:479:18: ^( OPTIONS ( TEMPORARY )? ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(OPTIONS, "OPTIONS")
                , root_2);

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:479:28: ( TEMPORARY )?
                if ( stream_TEMPORARY.hasNext() ) {
                    adaptor.addChild(root_2, 
                    stream_TEMPORARY.nextNode()
                    );

                }
                stream_TEMPORARY.reset();

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:479:39: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, 
                    stream_EXISTS.nextNode()
                    );

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:479:48: ^( $view_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_view_name.nextNode(), root_2);

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:479:62: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:479:78: ^( STATEMENT $t)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(STATEMENT, "STATEMENT")
                , root_2);

                adaptor.addChild(root_2, stream_t.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "create_view_stmt"


    public static class drop_view_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "drop_view_stmt"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:483:1: drop_view_stmt : DROP VIEW ( IF EXISTS )? (database_name= id DOT )? view_name= id ;
    public final SqlParser.drop_view_stmt_return drop_view_stmt() throws RecognitionException {
        SqlParser.drop_view_stmt_return retval = new SqlParser.drop_view_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DROP445=null;
        Token VIEW446=null;
        Token IF447=null;
        Token EXISTS448=null;
        Token DOT449=null;
        SqlParser.id_return database_name =null;

        SqlParser.id_return view_name =null;


        Object DROP445_tree=null;
        Object VIEW446_tree=null;
        Object IF447_tree=null;
        Object EXISTS448_tree=null;
        Object DOT449_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:483:15: ( DROP VIEW ( IF EXISTS )? (database_name= id DOT )? view_name= id )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:483:17: DROP VIEW ( IF EXISTS )? (database_name= id DOT )? view_name= id
            {
            root_0 = (Object)adaptor.nil();


            DROP445=(Token)match(input,DROP,FOLLOW_DROP_in_drop_view_stmt3819); 
            DROP445_tree = 
            (Object)adaptor.create(DROP445)
            ;
            adaptor.addChild(root_0, DROP445_tree);


            VIEW446=(Token)match(input,VIEW,FOLLOW_VIEW_in_drop_view_stmt3821); 
            VIEW446_tree = 
            (Object)adaptor.create(VIEW446)
            ;
            adaptor.addChild(root_0, VIEW446_tree);


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:483:27: ( IF EXISTS )?
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==IF) ) {
                int LA163_1 = input.LA(2);

                if ( (LA163_1==EXISTS) ) {
                    alt163=1;
                }
            }
            switch (alt163) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:483:28: IF EXISTS
                    {
                    IF447=(Token)match(input,IF,FOLLOW_IF_in_drop_view_stmt3824); 
                    IF447_tree = 
                    (Object)adaptor.create(IF447)
                    ;
                    adaptor.addChild(root_0, IF447_tree);


                    EXISTS448=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_view_stmt3826); 
                    EXISTS448_tree = 
                    (Object)adaptor.create(EXISTS448)
                    ;
                    adaptor.addChild(root_0, EXISTS448_tree);


                    }
                    break;

            }


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:483:40: (database_name= id DOT )?
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==ID||LA164_0==STRING) ) {
                int LA164_1 = input.LA(2);

                if ( (LA164_1==DOT) ) {
                    alt164=1;
                }
            }
            else if ( ((LA164_0 >= ABORT && LA164_0 <= AFTER)||(LA164_0 >= ALL && LA164_0 <= ALTER)||(LA164_0 >= ANALYZE && LA164_0 <= AND)||(LA164_0 >= AS && LA164_0 <= ASC)||(LA164_0 >= ATTACH && LA164_0 <= AUTOINCREMENT)||(LA164_0 >= BEFORE && LA164_0 <= BETWEEN)||LA164_0==BY||(LA164_0 >= CASCADE && LA164_0 <= COLLATE)||LA164_0==COLUMN||(LA164_0 >= COMMIT && LA164_0 <= CONSTRAINT)||LA164_0==CREATE||(LA164_0 >= CROSS && LA164_0 <= CURRENT_TIMESTAMP)||(LA164_0 >= DATABASE && LA164_0 <= DISTINCT)||LA164_0==DROP||(LA164_0 >= EACH && LA164_0 <= END)||(LA164_0 >= ESCAPE && LA164_0 <= EXPLAIN)||LA164_0==FAIL||(LA164_0 >= FOR && LA164_0 <= FROM)||LA164_0==GROUP||LA164_0==HAVING||(LA164_0 >= IF && LA164_0 <= IMMEDIATE)||(LA164_0 >= INDEX && LA164_0 <= INSTEAD)||(LA164_0 >= INTERSECT && LA164_0 <= INTO)||LA164_0==IS||LA164_0==JOIN||LA164_0==KEY||LA164_0==LEFT||LA164_0==LIMIT||LA164_0==NATURAL||LA164_0==NULL||(LA164_0 >= OF && LA164_0 <= ON)||(LA164_0 >= OR && LA164_0 <= ORDER)||LA164_0==OUTER||LA164_0==PLAN||(LA164_0 >= PRAGMA && LA164_0 <= PRIMARY)||LA164_0==QUERY||(LA164_0 >= RAISE && LA164_0 <= REFERENCES)||(LA164_0 >= REINDEX && LA164_0 <= ROW)||(LA164_0 >= SAVEPOINT && LA164_0 <= SELECT)||LA164_0==SET||LA164_0==TABLE||(LA164_0 >= TEMPORARY && LA164_0 <= THEN)||(LA164_0 >= TO && LA164_0 <= TRIGGER)||(LA164_0 >= UNION && LA164_0 <= USING)||(LA164_0 >= VACUUM && LA164_0 <= VIRTUAL)||(LA164_0 >= WHEN && LA164_0 <= WHERE)) ) {
                int LA164_2 = input.LA(2);

                if ( (LA164_2==DOT) ) {
                    alt164=1;
                }
            }
            switch (alt164) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:483:41: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_view_stmt3833);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());

                    DOT449=(Token)match(input,DOT,FOLLOW_DOT_in_drop_view_stmt3835); 
                    DOT449_tree = 
                    (Object)adaptor.create(DOT449)
                    ;
                    adaptor.addChild(root_0, DOT449_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_id_in_drop_view_stmt3841);
            view_name=id();

            state._fsp--;

            adaptor.addChild(root_0, view_name.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "drop_view_stmt"


    public static class create_index_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "create_index_stmt"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:486:1: create_index_stmt : CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= id DOT )? index_name= id ON table_name= id LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN -> ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? ) ;
    public final SqlParser.create_index_stmt_return create_index_stmt() throws RecognitionException {
        SqlParser.create_index_stmt_return retval = new SqlParser.create_index_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CREATE450=null;
        Token UNIQUE451=null;
        Token INDEX452=null;
        Token IF453=null;
        Token NOT454=null;
        Token EXISTS455=null;
        Token DOT456=null;
        Token ON457=null;
        Token LPAREN458=null;
        Token COMMA459=null;
        Token RPAREN460=null;
        List list_columns=null;
        SqlParser.id_return database_name =null;

        SqlParser.id_return index_name =null;

        SqlParser.id_return table_name =null;

        RuleReturnScope columns = null;
        Object CREATE450_tree=null;
        Object UNIQUE451_tree=null;
        Object INDEX452_tree=null;
        Object IF453_tree=null;
        Object NOT454_tree=null;
        Object EXISTS455_tree=null;
        Object DOT456_tree=null;
        Object ON457_tree=null;
        Object LPAREN458_tree=null;
        Object COMMA459_tree=null;
        Object RPAREN460_tree=null;
        RewriteRuleTokenStream stream_INDEX=new RewriteRuleTokenStream(adaptor,"token INDEX");
        RewriteRuleTokenStream stream_ON=new RewriteRuleTokenStream(adaptor,"token ON");
        RewriteRuleTokenStream stream_UNIQUE=new RewriteRuleTokenStream(adaptor,"token UNIQUE");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_indexed_column=new RewriteRuleSubtreeStream(adaptor,"rule indexed_column");
        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:486:18: ( CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= id DOT )? index_name= id ON table_name= id LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN -> ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? ) )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:486:20: CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= id DOT )? index_name= id ON table_name= id LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN
            {
            CREATE450=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_index_stmt3849);  
            stream_CREATE.add(CREATE450);


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:486:27: ( UNIQUE )?
            int alt165=2;
            int LA165_0 = input.LA(1);

            if ( (LA165_0==UNIQUE) ) {
                alt165=1;
            }
            switch (alt165) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:486:28: UNIQUE
                    {
                    UNIQUE451=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_create_index_stmt3852);  
                    stream_UNIQUE.add(UNIQUE451);


                    }
                    break;

            }


            INDEX452=(Token)match(input,INDEX,FOLLOW_INDEX_in_create_index_stmt3856);  
            stream_INDEX.add(INDEX452);


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:486:43: ( IF NOT EXISTS )?
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( (LA166_0==IF) ) {
                int LA166_1 = input.LA(2);

                if ( (LA166_1==NOT) ) {
                    alt166=1;
                }
            }
            switch (alt166) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:486:44: IF NOT EXISTS
                    {
                    IF453=(Token)match(input,IF,FOLLOW_IF_in_create_index_stmt3859);  
                    stream_IF.add(IF453);


                    NOT454=(Token)match(input,NOT,FOLLOW_NOT_in_create_index_stmt3861);  
                    stream_NOT.add(NOT454);


                    EXISTS455=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_index_stmt3863);  
                    stream_EXISTS.add(EXISTS455);


                    }
                    break;

            }


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:486:60: (database_name= id DOT )?
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==ID||LA167_0==STRING) ) {
                int LA167_1 = input.LA(2);

                if ( (LA167_1==DOT) ) {
                    alt167=1;
                }
            }
            else if ( ((LA167_0 >= ABORT && LA167_0 <= AFTER)||(LA167_0 >= ALL && LA167_0 <= ALTER)||(LA167_0 >= ANALYZE && LA167_0 <= AND)||(LA167_0 >= AS && LA167_0 <= ASC)||(LA167_0 >= ATTACH && LA167_0 <= AUTOINCREMENT)||(LA167_0 >= BEFORE && LA167_0 <= BETWEEN)||LA167_0==BY||(LA167_0 >= CASCADE && LA167_0 <= COLLATE)||LA167_0==COLUMN||(LA167_0 >= COMMIT && LA167_0 <= CONSTRAINT)||LA167_0==CREATE||(LA167_0 >= CROSS && LA167_0 <= CURRENT_TIMESTAMP)||(LA167_0 >= DATABASE && LA167_0 <= DISTINCT)||LA167_0==DROP||(LA167_0 >= EACH && LA167_0 <= END)||(LA167_0 >= ESCAPE && LA167_0 <= EXPLAIN)||LA167_0==FAIL||(LA167_0 >= FOR && LA167_0 <= FROM)||LA167_0==GROUP||LA167_0==HAVING||(LA167_0 >= IF && LA167_0 <= IMMEDIATE)||(LA167_0 >= INDEX && LA167_0 <= INSTEAD)||(LA167_0 >= INTERSECT && LA167_0 <= INTO)||LA167_0==IS||LA167_0==JOIN||LA167_0==KEY||LA167_0==LEFT||LA167_0==LIMIT||LA167_0==NATURAL||LA167_0==NULL||(LA167_0 >= OF && LA167_0 <= ON)||(LA167_0 >= OR && LA167_0 <= ORDER)||LA167_0==OUTER||LA167_0==PLAN||(LA167_0 >= PRAGMA && LA167_0 <= PRIMARY)||LA167_0==QUERY||(LA167_0 >= RAISE && LA167_0 <= REFERENCES)||(LA167_0 >= REINDEX && LA167_0 <= ROW)||(LA167_0 >= SAVEPOINT && LA167_0 <= SELECT)||LA167_0==SET||LA167_0==TABLE||(LA167_0 >= TEMPORARY && LA167_0 <= THEN)||(LA167_0 >= TO && LA167_0 <= TRIGGER)||(LA167_0 >= UNION && LA167_0 <= USING)||(LA167_0 >= VACUUM && LA167_0 <= VIRTUAL)||(LA167_0 >= WHEN && LA167_0 <= WHERE)) ) {
                int LA167_2 = input.LA(2);

                if ( (LA167_2==DOT) ) {
                    alt167=1;
                }
            }
            switch (alt167) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:486:61: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_index_stmt3870);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());

                    DOT456=(Token)match(input,DOT,FOLLOW_DOT_in_create_index_stmt3872);  
                    stream_DOT.add(DOT456);


                    }
                    break;

            }


            pushFollow(FOLLOW_id_in_create_index_stmt3878);
            index_name=id();

            state._fsp--;

            stream_id.add(index_name.getTree());

            ON457=(Token)match(input,ON,FOLLOW_ON_in_create_index_stmt3882);  
            stream_ON.add(ON457);


            pushFollow(FOLLOW_id_in_create_index_stmt3886);
            table_name=id();

            state._fsp--;

            stream_id.add(table_name.getTree());

            LPAREN458=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_index_stmt3888);  
            stream_LPAREN.add(LPAREN458);


            pushFollow(FOLLOW_indexed_column_in_create_index_stmt3892);
            columns=indexed_column();

            state._fsp--;

            stream_indexed_column.add(columns.getTree());
            if (list_columns==null) list_columns=new ArrayList();
            list_columns.add(columns.getTree());


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:487:51: ( COMMA columns+= indexed_column )*
            loop168:
            do {
                int alt168=2;
                int LA168_0 = input.LA(1);

                if ( (LA168_0==COMMA) ) {
                    alt168=1;
                }


                switch (alt168) {
            	case 1 :
            	    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:487:52: COMMA columns+= indexed_column
            	    {
            	    COMMA459=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_index_stmt3895);  
            	    stream_COMMA.add(COMMA459);


            	    pushFollow(FOLLOW_indexed_column_in_create_index_stmt3899);
            	    columns=indexed_column();

            	    state._fsp--;

            	    stream_indexed_column.add(columns.getTree());
            	    if (list_columns==null) list_columns=new ArrayList();
            	    list_columns.add(columns.getTree());


            	    }
            	    break;

            	default :
            	    break loop168;
                }
            } while (true);


            RPAREN460=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_index_stmt3903);  
            stream_RPAREN.add(RPAREN460);


            // AST REWRITE
            // elements: table_name, columns, database_name, EXISTS, UNIQUE, index_name
            // token labels: 
            // rule labels: index_name, database_name, retval, table_name
            // token list labels: 
            // rule list labels: columns
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_index_name=new RewriteRuleSubtreeStream(adaptor,"rule index_name",index_name!=null?index_name.tree:null);
            RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_table_name=new RewriteRuleSubtreeStream(adaptor,"rule table_name",table_name!=null?table_name.tree:null);
            RewriteRuleSubtreeStream stream_columns=new RewriteRuleSubtreeStream(adaptor,"token columns",list_columns);
            root_0 = (Object)adaptor.nil();
            // 488:111: -> ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? )
            {
                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:488:4: ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CREATE_INDEX, "CREATE_INDEX")
                , root_1);

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:488:19: ^( OPTIONS ( UNIQUE )? ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(OPTIONS, "OPTIONS")
                , root_2);

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:488:29: ( UNIQUE )?
                if ( stream_UNIQUE.hasNext() ) {
                    adaptor.addChild(root_2, 
                    stream_UNIQUE.nextNode()
                    );

                }
                stream_UNIQUE.reset();

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:488:37: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, 
                    stream_EXISTS.nextNode()
                    );

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:488:46: ^( $index_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_index_name.nextNode(), root_2);

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:488:61: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_table_name.nextTree());

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:488:89: ( ^( COLUMNS ( $columns)+ ) )?
                if ( stream_columns.hasNext() ) {
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:488:89: ^( COLUMNS ( $columns)+ )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    (Object)adaptor.create(COLUMNS, "COLUMNS")
                    , root_2);

                    if ( !(stream_columns.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_columns.hasNext() ) {
                        adaptor.addChild(root_2, stream_columns.nextTree());

                    }
                    stream_columns.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_columns.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "create_index_stmt"


    public static class indexed_column_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "indexed_column"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:490:1: indexed_column : column_name= id ( COLLATE collation_name= id )? ( ASC | DESC )? -> ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? ) ;
    public final SqlParser.indexed_column_return indexed_column() throws RecognitionException {
        SqlParser.indexed_column_return retval = new SqlParser.indexed_column_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COLLATE461=null;
        Token ASC462=null;
        Token DESC463=null;
        SqlParser.id_return column_name =null;

        SqlParser.id_return collation_name =null;


        Object COLLATE461_tree=null;
        Object ASC462_tree=null;
        Object DESC463_tree=null;
        RewriteRuleTokenStream stream_ASC=new RewriteRuleTokenStream(adaptor,"token ASC");
        RewriteRuleTokenStream stream_DESC=new RewriteRuleTokenStream(adaptor,"token DESC");
        RewriteRuleTokenStream stream_COLLATE=new RewriteRuleTokenStream(adaptor,"token COLLATE");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:490:15: (column_name= id ( COLLATE collation_name= id )? ( ASC | DESC )? -> ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? ) )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:490:17: column_name= id ( COLLATE collation_name= id )? ( ASC | DESC )?
            {
            pushFollow(FOLLOW_id_in_indexed_column3949);
            column_name=id();

            state._fsp--;

            stream_id.add(column_name.getTree());

            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:490:32: ( COLLATE collation_name= id )?
            int alt169=2;
            int LA169_0 = input.LA(1);

            if ( (LA169_0==COLLATE) ) {
                alt169=1;
            }
            switch (alt169) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:490:33: COLLATE collation_name= id
                    {
                    COLLATE461=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_indexed_column3952);  
                    stream_COLLATE.add(COLLATE461);


                    pushFollow(FOLLOW_id_in_indexed_column3956);
                    collation_name=id();

                    state._fsp--;

                    stream_id.add(collation_name.getTree());

                    }
                    break;

            }


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:490:61: ( ASC | DESC )?
            int alt170=3;
            int LA170_0 = input.LA(1);

            if ( (LA170_0==ASC) ) {
                alt170=1;
            }
            else if ( (LA170_0==DESC) ) {
                alt170=2;
            }
            switch (alt170) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:490:62: ASC
                    {
                    ASC462=(Token)match(input,ASC,FOLLOW_ASC_in_indexed_column3961);  
                    stream_ASC.add(ASC462);


                    }
                    break;
                case 2 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:490:68: DESC
                    {
                    DESC463=(Token)match(input,DESC,FOLLOW_DESC_in_indexed_column3965);  
                    stream_DESC.add(DESC463);


                    }
                    break;

            }


            // AST REWRITE
            // elements: collation_name, COLLATE, column_name, ASC, DESC
            // token labels: 
            // rule labels: retval, collation_name, column_name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_collation_name=new RewriteRuleSubtreeStream(adaptor,"rule collation_name",collation_name!=null?collation_name.tree:null);
            RewriteRuleSubtreeStream stream_column_name=new RewriteRuleSubtreeStream(adaptor,"rule column_name",column_name!=null?column_name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 491:58: -> ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? )
            {
                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:491:4: ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_column_name.nextNode(), root_1);

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:491:19: ( ^( COLLATE $collation_name) )?
                if ( stream_collation_name.hasNext()||stream_COLLATE.hasNext() ) {
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:491:19: ^( COLLATE $collation_name)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    stream_COLLATE.nextNode()
                    , root_2);

                    adaptor.addChild(root_2, stream_collation_name.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_collation_name.reset();
                stream_COLLATE.reset();

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:491:47: ( ASC )?
                if ( stream_ASC.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ASC.nextNode()
                    );

                }
                stream_ASC.reset();

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:491:52: ( DESC )?
                if ( stream_DESC.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_DESC.nextNode()
                    );

                }
                stream_DESC.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "indexed_column"


    public static class drop_index_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "drop_index_stmt"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:494:1: drop_index_stmt : DROP INDEX ( IF EXISTS )? (database_name= id DOT )? index_name= id -> ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) ) ;
    public final SqlParser.drop_index_stmt_return drop_index_stmt() throws RecognitionException {
        SqlParser.drop_index_stmt_return retval = new SqlParser.drop_index_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DROP464=null;
        Token INDEX465=null;
        Token IF466=null;
        Token EXISTS467=null;
        Token DOT468=null;
        SqlParser.id_return database_name =null;

        SqlParser.id_return index_name =null;


        Object DROP464_tree=null;
        Object INDEX465_tree=null;
        Object IF466_tree=null;
        Object EXISTS467_tree=null;
        Object DOT468_tree=null;
        RewriteRuleTokenStream stream_INDEX=new RewriteRuleTokenStream(adaptor,"token INDEX");
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:494:16: ( DROP INDEX ( IF EXISTS )? (database_name= id DOT )? index_name= id -> ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) ) )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:494:18: DROP INDEX ( IF EXISTS )? (database_name= id DOT )? index_name= id
            {
            DROP464=(Token)match(input,DROP,FOLLOW_DROP_in_drop_index_stmt3996);  
            stream_DROP.add(DROP464);


            INDEX465=(Token)match(input,INDEX,FOLLOW_INDEX_in_drop_index_stmt3998);  
            stream_INDEX.add(INDEX465);


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:494:29: ( IF EXISTS )?
            int alt171=2;
            int LA171_0 = input.LA(1);

            if ( (LA171_0==IF) ) {
                int LA171_1 = input.LA(2);

                if ( (LA171_1==EXISTS) ) {
                    alt171=1;
                }
            }
            switch (alt171) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:494:30: IF EXISTS
                    {
                    IF466=(Token)match(input,IF,FOLLOW_IF_in_drop_index_stmt4001);  
                    stream_IF.add(IF466);


                    EXISTS467=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_index_stmt4003);  
                    stream_EXISTS.add(EXISTS467);


                    }
                    break;

            }


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:494:42: (database_name= id DOT )?
            int alt172=2;
            int LA172_0 = input.LA(1);

            if ( (LA172_0==ID||LA172_0==STRING) ) {
                int LA172_1 = input.LA(2);

                if ( (LA172_1==DOT) ) {
                    alt172=1;
                }
            }
            else if ( ((LA172_0 >= ABORT && LA172_0 <= AFTER)||(LA172_0 >= ALL && LA172_0 <= ALTER)||(LA172_0 >= ANALYZE && LA172_0 <= AND)||(LA172_0 >= AS && LA172_0 <= ASC)||(LA172_0 >= ATTACH && LA172_0 <= AUTOINCREMENT)||(LA172_0 >= BEFORE && LA172_0 <= BETWEEN)||LA172_0==BY||(LA172_0 >= CASCADE && LA172_0 <= COLLATE)||LA172_0==COLUMN||(LA172_0 >= COMMIT && LA172_0 <= CONSTRAINT)||LA172_0==CREATE||(LA172_0 >= CROSS && LA172_0 <= CURRENT_TIMESTAMP)||(LA172_0 >= DATABASE && LA172_0 <= DISTINCT)||LA172_0==DROP||(LA172_0 >= EACH && LA172_0 <= END)||(LA172_0 >= ESCAPE && LA172_0 <= EXPLAIN)||LA172_0==FAIL||(LA172_0 >= FOR && LA172_0 <= FROM)||LA172_0==GROUP||LA172_0==HAVING||(LA172_0 >= IF && LA172_0 <= IMMEDIATE)||(LA172_0 >= INDEX && LA172_0 <= INSTEAD)||(LA172_0 >= INTERSECT && LA172_0 <= INTO)||LA172_0==IS||LA172_0==JOIN||LA172_0==KEY||LA172_0==LEFT||LA172_0==LIMIT||LA172_0==NATURAL||LA172_0==NULL||(LA172_0 >= OF && LA172_0 <= ON)||(LA172_0 >= OR && LA172_0 <= ORDER)||LA172_0==OUTER||LA172_0==PLAN||(LA172_0 >= PRAGMA && LA172_0 <= PRIMARY)||LA172_0==QUERY||(LA172_0 >= RAISE && LA172_0 <= REFERENCES)||(LA172_0 >= REINDEX && LA172_0 <= ROW)||(LA172_0 >= SAVEPOINT && LA172_0 <= SELECT)||LA172_0==SET||LA172_0==TABLE||(LA172_0 >= TEMPORARY && LA172_0 <= THEN)||(LA172_0 >= TO && LA172_0 <= TRIGGER)||(LA172_0 >= UNION && LA172_0 <= USING)||(LA172_0 >= VACUUM && LA172_0 <= VIRTUAL)||(LA172_0 >= WHEN && LA172_0 <= WHERE)) ) {
                int LA172_2 = input.LA(2);

                if ( (LA172_2==DOT) ) {
                    alt172=1;
                }
            }
            switch (alt172) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:494:43: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_index_stmt4010);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());

                    DOT468=(Token)match(input,DOT,FOLLOW_DOT_in_drop_index_stmt4012);  
                    stream_DOT.add(DOT468);


                    }
                    break;

            }


            pushFollow(FOLLOW_id_in_drop_index_stmt4018);
            index_name=id();

            state._fsp--;

            stream_id.add(index_name.getTree());

            // AST REWRITE
            // elements: database_name, index_name, EXISTS
            // token labels: 
            // rule labels: index_name, database_name, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_index_name=new RewriteRuleSubtreeStream(adaptor,"rule index_name",index_name!=null?index_name.tree:null);
            RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 495:67: -> ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) )
            {
                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:495:4: ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DROP_INDEX, "DROP_INDEX")
                , root_1);

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:495:17: ^( OPTIONS ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(OPTIONS, "OPTIONS")
                , root_2);

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:495:27: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, 
                    stream_EXISTS.nextNode()
                    );

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:495:36: ^( $index_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_index_name.nextNode(), root_2);

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:495:51: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "drop_index_stmt"


    public static class create_trigger_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "create_trigger_stmt"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:498:1: create_trigger_stmt : CREATE ( TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= id DOT )? trigger_name= id ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? ) ON table_name= id ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END -> ^( CREATE_TRIGGER ^( OPTIONS ( TEMPORARY )? ) ^( $trigger_name $table_name ( $database_name)? ) ) ;
    public final SqlParser.create_trigger_stmt_return create_trigger_stmt() throws RecognitionException {
        SqlParser.create_trigger_stmt_return retval = new SqlParser.create_trigger_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CREATE469=null;
        Token TEMPORARY470=null;
        Token TRIGGER471=null;
        Token IF472=null;
        Token NOT473=null;
        Token EXISTS474=null;
        Token DOT475=null;
        Token BEFORE476=null;
        Token AFTER477=null;
        Token INSTEAD478=null;
        Token OF479=null;
        Token DELETE480=null;
        Token INSERT481=null;
        Token UPDATE482=null;
        Token OF483=null;
        Token COMMA484=null;
        Token ON485=null;
        Token FOR486=null;
        Token EACH487=null;
        Token ROW488=null;
        Token WHEN489=null;
        Token BEGIN491=null;
        Token SEMI496=null;
        Token END497=null;
        List list_column_names=null;
        SqlParser.id_return database_name =null;

        SqlParser.id_return trigger_name =null;

        SqlParser.id_return table_name =null;

        SqlParser.expr_return expr490 =null;

        SqlParser.update_stmt_return update_stmt492 =null;

        SqlParser.insert_stmt_return insert_stmt493 =null;

        SqlParser.delete_stmt_return delete_stmt494 =null;

        SqlParser.select_stmt_return select_stmt495 =null;

        RuleReturnScope column_names = null;
        Object CREATE469_tree=null;
        Object TEMPORARY470_tree=null;
        Object TRIGGER471_tree=null;
        Object IF472_tree=null;
        Object NOT473_tree=null;
        Object EXISTS474_tree=null;
        Object DOT475_tree=null;
        Object BEFORE476_tree=null;
        Object AFTER477_tree=null;
        Object INSTEAD478_tree=null;
        Object OF479_tree=null;
        Object DELETE480_tree=null;
        Object INSERT481_tree=null;
        Object UPDATE482_tree=null;
        Object OF483_tree=null;
        Object COMMA484_tree=null;
        Object ON485_tree=null;
        Object FOR486_tree=null;
        Object EACH487_tree=null;
        Object ROW488_tree=null;
        Object WHEN489_tree=null;
        Object BEGIN491_tree=null;
        Object SEMI496_tree=null;
        Object END497_tree=null;
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_INSERT=new RewriteRuleTokenStream(adaptor,"token INSERT");
        RewriteRuleTokenStream stream_ROW=new RewriteRuleTokenStream(adaptor,"token ROW");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_WHEN=new RewriteRuleTokenStream(adaptor,"token WHEN");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleTokenStream stream_TRIGGER=new RewriteRuleTokenStream(adaptor,"token TRIGGER");
        RewriteRuleTokenStream stream_ON=new RewriteRuleTokenStream(adaptor,"token ON");
        RewriteRuleTokenStream stream_UPDATE=new RewriteRuleTokenStream(adaptor,"token UPDATE");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_BEFORE=new RewriteRuleTokenStream(adaptor,"token BEFORE");
        RewriteRuleTokenStream stream_DELETE=new RewriteRuleTokenStream(adaptor,"token DELETE");
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_EACH=new RewriteRuleTokenStream(adaptor,"token EACH");
        RewriteRuleTokenStream stream_AFTER=new RewriteRuleTokenStream(adaptor,"token AFTER");
        RewriteRuleTokenStream stream_INSTEAD=new RewriteRuleTokenStream(adaptor,"token INSTEAD");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleTokenStream stream_TEMPORARY=new RewriteRuleTokenStream(adaptor,"token TEMPORARY");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_insert_stmt=new RewriteRuleSubtreeStream(adaptor,"rule insert_stmt");
        RewriteRuleSubtreeStream stream_select_stmt=new RewriteRuleSubtreeStream(adaptor,"rule select_stmt");
        RewriteRuleSubtreeStream stream_delete_stmt=new RewriteRuleSubtreeStream(adaptor,"rule delete_stmt");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_update_stmt=new RewriteRuleSubtreeStream(adaptor,"rule update_stmt");
        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:498:20: ( CREATE ( TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= id DOT )? trigger_name= id ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? ) ON table_name= id ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END -> ^( CREATE_TRIGGER ^( OPTIONS ( TEMPORARY )? ) ^( $trigger_name $table_name ( $database_name)? ) ) )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:498:22: CREATE ( TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= id DOT )? trigger_name= id ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? ) ON table_name= id ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END
            {
            CREATE469=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_trigger_stmt4048);  
            stream_CREATE.add(CREATE469);


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:498:29: ( TEMPORARY )?
            int alt173=2;
            int LA173_0 = input.LA(1);

            if ( (LA173_0==TEMPORARY) ) {
                alt173=1;
            }
            switch (alt173) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:498:29: TEMPORARY
                    {
                    TEMPORARY470=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_trigger_stmt4050);  
                    stream_TEMPORARY.add(TEMPORARY470);


                    }
                    break;

            }


            TRIGGER471=(Token)match(input,TRIGGER,FOLLOW_TRIGGER_in_create_trigger_stmt4053);  
            stream_TRIGGER.add(TRIGGER471);


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:498:48: ( IF NOT EXISTS )?
            int alt174=2;
            int LA174_0 = input.LA(1);

            if ( (LA174_0==IF) ) {
                int LA174_1 = input.LA(2);

                if ( (LA174_1==NOT) ) {
                    alt174=1;
                }
            }
            switch (alt174) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:498:49: IF NOT EXISTS
                    {
                    IF472=(Token)match(input,IF,FOLLOW_IF_in_create_trigger_stmt4056);  
                    stream_IF.add(IF472);


                    NOT473=(Token)match(input,NOT,FOLLOW_NOT_in_create_trigger_stmt4058);  
                    stream_NOT.add(NOT473);


                    EXISTS474=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_trigger_stmt4060);  
                    stream_EXISTS.add(EXISTS474);


                    }
                    break;

            }


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:498:65: (database_name= id DOT )?
            int alt175=2;
            int LA175_0 = input.LA(1);

            if ( (LA175_0==ID||LA175_0==STRING) ) {
                int LA175_1 = input.LA(2);

                if ( (LA175_1==DOT) ) {
                    alt175=1;
                }
            }
            else if ( ((LA175_0 >= ABORT && LA175_0 <= AFTER)||(LA175_0 >= ALL && LA175_0 <= ALTER)||(LA175_0 >= ANALYZE && LA175_0 <= AND)||(LA175_0 >= AS && LA175_0 <= ASC)||(LA175_0 >= ATTACH && LA175_0 <= AUTOINCREMENT)||(LA175_0 >= BEFORE && LA175_0 <= BETWEEN)||LA175_0==BY||(LA175_0 >= CASCADE && LA175_0 <= COLLATE)||LA175_0==COLUMN||(LA175_0 >= COMMIT && LA175_0 <= CONSTRAINT)||LA175_0==CREATE||(LA175_0 >= CROSS && LA175_0 <= CURRENT_TIMESTAMP)||(LA175_0 >= DATABASE && LA175_0 <= DISTINCT)||LA175_0==DROP||(LA175_0 >= EACH && LA175_0 <= END)||(LA175_0 >= ESCAPE && LA175_0 <= EXPLAIN)||LA175_0==FAIL||(LA175_0 >= FOR && LA175_0 <= FROM)||LA175_0==GROUP||LA175_0==HAVING||(LA175_0 >= IF && LA175_0 <= IMMEDIATE)||(LA175_0 >= INDEX && LA175_0 <= INSTEAD)||(LA175_0 >= INTERSECT && LA175_0 <= INTO)||LA175_0==IS||LA175_0==JOIN||LA175_0==KEY||LA175_0==LEFT||LA175_0==LIMIT||LA175_0==NATURAL||LA175_0==NULL||(LA175_0 >= OF && LA175_0 <= ON)||(LA175_0 >= OR && LA175_0 <= ORDER)||LA175_0==OUTER||LA175_0==PLAN||(LA175_0 >= PRAGMA && LA175_0 <= PRIMARY)||LA175_0==QUERY||(LA175_0 >= RAISE && LA175_0 <= REFERENCES)||(LA175_0 >= REINDEX && LA175_0 <= ROW)||(LA175_0 >= SAVEPOINT && LA175_0 <= SELECT)||LA175_0==SET||LA175_0==TABLE||(LA175_0 >= TEMPORARY && LA175_0 <= THEN)||(LA175_0 >= TO && LA175_0 <= TRIGGER)||(LA175_0 >= UNION && LA175_0 <= USING)||(LA175_0 >= VACUUM && LA175_0 <= VIRTUAL)||(LA175_0 >= WHEN && LA175_0 <= WHERE)) ) {
                int LA175_2 = input.LA(2);

                if ( (LA175_2==DOT) ) {
                    alt175=1;
                }
            }
            switch (alt175) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:498:66: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_trigger_stmt4067);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());

                    DOT475=(Token)match(input,DOT,FOLLOW_DOT_in_create_trigger_stmt4069);  
                    stream_DOT.add(DOT475);


                    }
                    break;

            }


            pushFollow(FOLLOW_id_in_create_trigger_stmt4075);
            trigger_name=id();

            state._fsp--;

            stream_id.add(trigger_name.getTree());

            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:499:3: ( BEFORE | AFTER | INSTEAD OF )?
            int alt176=4;
            switch ( input.LA(1) ) {
                case BEFORE:
                    {
                    alt176=1;
                    }
                    break;
                case AFTER:
                    {
                    alt176=2;
                    }
                    break;
                case INSTEAD:
                    {
                    alt176=3;
                    }
                    break;
            }

            switch (alt176) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:499:4: BEFORE
                    {
                    BEFORE476=(Token)match(input,BEFORE,FOLLOW_BEFORE_in_create_trigger_stmt4080);  
                    stream_BEFORE.add(BEFORE476);


                    }
                    break;
                case 2 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:499:13: AFTER
                    {
                    AFTER477=(Token)match(input,AFTER,FOLLOW_AFTER_in_create_trigger_stmt4084);  
                    stream_AFTER.add(AFTER477);


                    }
                    break;
                case 3 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:499:21: INSTEAD OF
                    {
                    INSTEAD478=(Token)match(input,INSTEAD,FOLLOW_INSTEAD_in_create_trigger_stmt4088);  
                    stream_INSTEAD.add(INSTEAD478);


                    OF479=(Token)match(input,OF,FOLLOW_OF_in_create_trigger_stmt4090);  
                    stream_OF.add(OF479);


                    }
                    break;

            }


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:499:34: ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? )
            int alt179=3;
            switch ( input.LA(1) ) {
            case DELETE:
                {
                alt179=1;
                }
                break;
            case INSERT:
                {
                alt179=2;
                }
                break;
            case UPDATE:
                {
                alt179=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 179, 0, input);

                throw nvae;

            }

            switch (alt179) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:499:35: DELETE
                    {
                    DELETE480=(Token)match(input,DELETE,FOLLOW_DELETE_in_create_trigger_stmt4095);  
                    stream_DELETE.add(DELETE480);


                    }
                    break;
                case 2 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:499:44: INSERT
                    {
                    INSERT481=(Token)match(input,INSERT,FOLLOW_INSERT_in_create_trigger_stmt4099);  
                    stream_INSERT.add(INSERT481);


                    }
                    break;
                case 3 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:499:53: UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )?
                    {
                    UPDATE482=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_create_trigger_stmt4103);  
                    stream_UPDATE.add(UPDATE482);


                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:499:60: ( OF column_names+= id ( COMMA column_names+= id )* )?
                    int alt178=2;
                    int LA178_0 = input.LA(1);

                    if ( (LA178_0==OF) ) {
                        alt178=1;
                    }
                    switch (alt178) {
                        case 1 :
                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:499:61: OF column_names+= id ( COMMA column_names+= id )*
                            {
                            OF483=(Token)match(input,OF,FOLLOW_OF_in_create_trigger_stmt4106);  
                            stream_OF.add(OF483);


                            pushFollow(FOLLOW_id_in_create_trigger_stmt4110);
                            column_names=id();

                            state._fsp--;

                            stream_id.add(column_names.getTree());
                            if (list_column_names==null) list_column_names=new ArrayList();
                            list_column_names.add(column_names.getTree());


                            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:499:81: ( COMMA column_names+= id )*
                            loop177:
                            do {
                                int alt177=2;
                                int LA177_0 = input.LA(1);

                                if ( (LA177_0==COMMA) ) {
                                    alt177=1;
                                }


                                switch (alt177) {
                            	case 1 :
                            	    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:499:82: COMMA column_names+= id
                            	    {
                            	    COMMA484=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_trigger_stmt4113);  
                            	    stream_COMMA.add(COMMA484);


                            	    pushFollow(FOLLOW_id_in_create_trigger_stmt4117);
                            	    column_names=id();

                            	    state._fsp--;

                            	    stream_id.add(column_names.getTree());
                            	    if (list_column_names==null) list_column_names=new ArrayList();
                            	    list_column_names.add(column_names.getTree());


                            	    }
                            	    break;

                            	default :
                            	    break loop177;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }


            ON485=(Token)match(input,ON,FOLLOW_ON_in_create_trigger_stmt4126);  
            stream_ON.add(ON485);


            pushFollow(FOLLOW_id_in_create_trigger_stmt4130);
            table_name=id();

            state._fsp--;

            stream_id.add(table_name.getTree());

            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:500:20: ( FOR EACH ROW )?
            int alt180=2;
            int LA180_0 = input.LA(1);

            if ( (LA180_0==FOR) ) {
                alt180=1;
            }
            switch (alt180) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:500:21: FOR EACH ROW
                    {
                    FOR486=(Token)match(input,FOR,FOLLOW_FOR_in_create_trigger_stmt4133);  
                    stream_FOR.add(FOR486);


                    EACH487=(Token)match(input,EACH,FOLLOW_EACH_in_create_trigger_stmt4135);  
                    stream_EACH.add(EACH487);


                    ROW488=(Token)match(input,ROW,FOLLOW_ROW_in_create_trigger_stmt4137);  
                    stream_ROW.add(ROW488);


                    }
                    break;

            }


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:500:36: ( WHEN expr )?
            int alt181=2;
            int LA181_0 = input.LA(1);

            if ( (LA181_0==WHEN) ) {
                alt181=1;
            }
            switch (alt181) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:500:37: WHEN expr
                    {
                    WHEN489=(Token)match(input,WHEN,FOLLOW_WHEN_in_create_trigger_stmt4142);  
                    stream_WHEN.add(WHEN489);


                    pushFollow(FOLLOW_expr_in_create_trigger_stmt4144);
                    expr490=expr();

                    state._fsp--;

                    stream_expr.add(expr490.getTree());

                    }
                    break;

            }


            BEGIN491=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_create_trigger_stmt4150);  
            stream_BEGIN.add(BEGIN491);


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:501:9: ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+
            int cnt183=0;
            loop183:
            do {
                int alt183=2;
                int LA183_0 = input.LA(1);

                if ( (LA183_0==DELETE||LA183_0==INSERT||LA183_0==REPLACE||LA183_0==SELECT||LA183_0==UPDATE) ) {
                    alt183=1;
                }


                switch (alt183) {
            	case 1 :
            	    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:501:10: ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI
            	    {
            	    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:501:10: ( update_stmt | insert_stmt | delete_stmt | select_stmt )
            	    int alt182=4;
            	    switch ( input.LA(1) ) {
            	    case UPDATE:
            	        {
            	        alt182=1;
            	        }
            	        break;
            	    case INSERT:
            	    case REPLACE:
            	        {
            	        alt182=2;
            	        }
            	        break;
            	    case DELETE:
            	        {
            	        alt182=3;
            	        }
            	        break;
            	    case SELECT:
            	        {
            	        alt182=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 182, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt182) {
            	        case 1 :
            	            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:501:11: update_stmt
            	            {
            	            pushFollow(FOLLOW_update_stmt_in_create_trigger_stmt4154);
            	            update_stmt492=update_stmt();

            	            state._fsp--;

            	            stream_update_stmt.add(update_stmt492.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:501:25: insert_stmt
            	            {
            	            pushFollow(FOLLOW_insert_stmt_in_create_trigger_stmt4158);
            	            insert_stmt493=insert_stmt();

            	            state._fsp--;

            	            stream_insert_stmt.add(insert_stmt493.getTree());

            	            }
            	            break;
            	        case 3 :
            	            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:501:39: delete_stmt
            	            {
            	            pushFollow(FOLLOW_delete_stmt_in_create_trigger_stmt4162);
            	            delete_stmt494=delete_stmt();

            	            state._fsp--;

            	            stream_delete_stmt.add(delete_stmt494.getTree());

            	            }
            	            break;
            	        case 4 :
            	            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:501:53: select_stmt
            	            {
            	            pushFollow(FOLLOW_select_stmt_in_create_trigger_stmt4166);
            	            select_stmt495=select_stmt();

            	            state._fsp--;

            	            stream_select_stmt.add(select_stmt495.getTree());

            	            }
            	            break;

            	    }


            	    SEMI496=(Token)match(input,SEMI,FOLLOW_SEMI_in_create_trigger_stmt4169);  
            	    stream_SEMI.add(SEMI496);


            	    }
            	    break;

            	default :
            	    if ( cnt183 >= 1 ) break loop183;
                        EarlyExitException eee =
                            new EarlyExitException(183, input);
                        throw eee;
                }
                cnt183++;
            } while (true);


            END497=(Token)match(input,END,FOLLOW_END_in_create_trigger_stmt4173);  
            stream_END.add(END497);


            // AST REWRITE
            // elements: database_name, trigger_name, table_name, TEMPORARY
            // token labels: 
            // rule labels: database_name, retval, table_name, trigger_name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_table_name=new RewriteRuleSubtreeStream(adaptor,"rule table_name",table_name!=null?table_name.tree:null);
            RewriteRuleSubtreeStream stream_trigger_name=new RewriteRuleSubtreeStream(adaptor,"rule trigger_name",trigger_name!=null?trigger_name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 502:88: -> ^( CREATE_TRIGGER ^( OPTIONS ( TEMPORARY )? ) ^( $trigger_name $table_name ( $database_name)? ) )
            {
                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:502:4: ^( CREATE_TRIGGER ^( OPTIONS ( TEMPORARY )? ) ^( $trigger_name $table_name ( $database_name)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CREATE_TRIGGER, "CREATE_TRIGGER")
                , root_1);

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:502:21: ^( OPTIONS ( TEMPORARY )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(OPTIONS, "OPTIONS")
                , root_2);

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:502:31: ( TEMPORARY )?
                if ( stream_TEMPORARY.hasNext() ) {
                    adaptor.addChild(root_2, 
                    stream_TEMPORARY.nextNode()
                    );

                }
                stream_TEMPORARY.reset();

                adaptor.addChild(root_1, root_2);
                }

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:502:43: ^( $trigger_name $table_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_trigger_name.nextNode(), root_2);

                adaptor.addChild(root_2, stream_table_name.nextTree());

                // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:502:72: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "create_trigger_stmt"


    public static class drop_trigger_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "drop_trigger_stmt"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:505:1: drop_trigger_stmt : DROP TRIGGER ( IF EXISTS )? (database_name= id DOT )? trigger_name= id ;
    public final SqlParser.drop_trigger_stmt_return drop_trigger_stmt() throws RecognitionException {
        SqlParser.drop_trigger_stmt_return retval = new SqlParser.drop_trigger_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DROP498=null;
        Token TRIGGER499=null;
        Token IF500=null;
        Token EXISTS501=null;
        Token DOT502=null;
        SqlParser.id_return database_name =null;

        SqlParser.id_return trigger_name =null;


        Object DROP498_tree=null;
        Object TRIGGER499_tree=null;
        Object IF500_tree=null;
        Object EXISTS501_tree=null;
        Object DOT502_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:505:18: ( DROP TRIGGER ( IF EXISTS )? (database_name= id DOT )? trigger_name= id )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:505:20: DROP TRIGGER ( IF EXISTS )? (database_name= id DOT )? trigger_name= id
            {
            root_0 = (Object)adaptor.nil();


            DROP498=(Token)match(input,DROP,FOLLOW_DROP_in_drop_trigger_stmt4206); 
            DROP498_tree = 
            (Object)adaptor.create(DROP498)
            ;
            adaptor.addChild(root_0, DROP498_tree);


            TRIGGER499=(Token)match(input,TRIGGER,FOLLOW_TRIGGER_in_drop_trigger_stmt4208); 
            TRIGGER499_tree = 
            (Object)adaptor.create(TRIGGER499)
            ;
            adaptor.addChild(root_0, TRIGGER499_tree);


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:505:33: ( IF EXISTS )?
            int alt184=2;
            int LA184_0 = input.LA(1);

            if ( (LA184_0==IF) ) {
                int LA184_1 = input.LA(2);

                if ( (LA184_1==EXISTS) ) {
                    alt184=1;
                }
            }
            switch (alt184) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:505:34: IF EXISTS
                    {
                    IF500=(Token)match(input,IF,FOLLOW_IF_in_drop_trigger_stmt4211); 
                    IF500_tree = 
                    (Object)adaptor.create(IF500)
                    ;
                    adaptor.addChild(root_0, IF500_tree);


                    EXISTS501=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_trigger_stmt4213); 
                    EXISTS501_tree = 
                    (Object)adaptor.create(EXISTS501)
                    ;
                    adaptor.addChild(root_0, EXISTS501_tree);


                    }
                    break;

            }


            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:505:46: (database_name= id DOT )?
            int alt185=2;
            int LA185_0 = input.LA(1);

            if ( (LA185_0==ID||LA185_0==STRING) ) {
                int LA185_1 = input.LA(2);

                if ( (LA185_1==DOT) ) {
                    alt185=1;
                }
            }
            else if ( ((LA185_0 >= ABORT && LA185_0 <= AFTER)||(LA185_0 >= ALL && LA185_0 <= ALTER)||(LA185_0 >= ANALYZE && LA185_0 <= AND)||(LA185_0 >= AS && LA185_0 <= ASC)||(LA185_0 >= ATTACH && LA185_0 <= AUTOINCREMENT)||(LA185_0 >= BEFORE && LA185_0 <= BETWEEN)||LA185_0==BY||(LA185_0 >= CASCADE && LA185_0 <= COLLATE)||LA185_0==COLUMN||(LA185_0 >= COMMIT && LA185_0 <= CONSTRAINT)||LA185_0==CREATE||(LA185_0 >= CROSS && LA185_0 <= CURRENT_TIMESTAMP)||(LA185_0 >= DATABASE && LA185_0 <= DISTINCT)||LA185_0==DROP||(LA185_0 >= EACH && LA185_0 <= END)||(LA185_0 >= ESCAPE && LA185_0 <= EXPLAIN)||LA185_0==FAIL||(LA185_0 >= FOR && LA185_0 <= FROM)||LA185_0==GROUP||LA185_0==HAVING||(LA185_0 >= IF && LA185_0 <= IMMEDIATE)||(LA185_0 >= INDEX && LA185_0 <= INSTEAD)||(LA185_0 >= INTERSECT && LA185_0 <= INTO)||LA185_0==IS||LA185_0==JOIN||LA185_0==KEY||LA185_0==LEFT||LA185_0==LIMIT||LA185_0==NATURAL||LA185_0==NULL||(LA185_0 >= OF && LA185_0 <= ON)||(LA185_0 >= OR && LA185_0 <= ORDER)||LA185_0==OUTER||LA185_0==PLAN||(LA185_0 >= PRAGMA && LA185_0 <= PRIMARY)||LA185_0==QUERY||(LA185_0 >= RAISE && LA185_0 <= REFERENCES)||(LA185_0 >= REINDEX && LA185_0 <= ROW)||(LA185_0 >= SAVEPOINT && LA185_0 <= SELECT)||LA185_0==SET||LA185_0==TABLE||(LA185_0 >= TEMPORARY && LA185_0 <= THEN)||(LA185_0 >= TO && LA185_0 <= TRIGGER)||(LA185_0 >= UNION && LA185_0 <= USING)||(LA185_0 >= VACUUM && LA185_0 <= VIRTUAL)||(LA185_0 >= WHEN && LA185_0 <= WHERE)) ) {
                int LA185_2 = input.LA(2);

                if ( (LA185_2==DOT) ) {
                    alt185=1;
                }
            }
            switch (alt185) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:505:47: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_trigger_stmt4220);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());

                    DOT502=(Token)match(input,DOT,FOLLOW_DOT_in_drop_trigger_stmt4222); 
                    DOT502_tree = 
                    (Object)adaptor.create(DOT502)
                    ;
                    adaptor.addChild(root_0, DOT502_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_id_in_drop_trigger_stmt4228);
            trigger_name=id();

            state._fsp--;

            adaptor.addChild(root_0, trigger_name.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "drop_trigger_stmt"


    public static class id_core_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "id_core"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:508:1: id_core : str= ( ID | STRING ) ;
    public final SqlParser.id_core_return id_core() throws RecognitionException {
        SqlParser.id_core_return retval = new SqlParser.id_core_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token str=null;

        Object str_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:508:8: (str= ( ID | STRING ) )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:508:10: str= ( ID | STRING )
            {
            root_0 = (Object)adaptor.nil();


            str=(Token)input.LT(1);

            if ( input.LA(1)==ID||input.LA(1)==STRING ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(str)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


             str.setText(unquoteId((str!=null?str.getText():null)));

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "id_core"


    public static class id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "id"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:512:1: id : ( id_core | keyword );
    public final SqlParser.id_return id() throws RecognitionException {
        SqlParser.id_return retval = new SqlParser.id_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SqlParser.id_core_return id_core503 =null;

        SqlParser.keyword_return keyword504 =null;



        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:512:3: ( id_core | keyword )
            int alt186=2;
            int LA186_0 = input.LA(1);

            if ( (LA186_0==ID||LA186_0==STRING) ) {
                alt186=1;
            }
            else if ( ((LA186_0 >= ABORT && LA186_0 <= AFTER)||(LA186_0 >= ALL && LA186_0 <= ALTER)||(LA186_0 >= ANALYZE && LA186_0 <= AND)||(LA186_0 >= AS && LA186_0 <= ASC)||(LA186_0 >= ATTACH && LA186_0 <= AUTOINCREMENT)||(LA186_0 >= BEFORE && LA186_0 <= BETWEEN)||LA186_0==BY||(LA186_0 >= CASCADE && LA186_0 <= COLLATE)||LA186_0==COLUMN||(LA186_0 >= COMMIT && LA186_0 <= CONSTRAINT)||LA186_0==CREATE||(LA186_0 >= CROSS && LA186_0 <= CURRENT_TIMESTAMP)||(LA186_0 >= DATABASE && LA186_0 <= DISTINCT)||LA186_0==DROP||(LA186_0 >= EACH && LA186_0 <= END)||(LA186_0 >= ESCAPE && LA186_0 <= EXPLAIN)||LA186_0==FAIL||(LA186_0 >= FOR && LA186_0 <= FROM)||LA186_0==GROUP||LA186_0==HAVING||(LA186_0 >= IF && LA186_0 <= IMMEDIATE)||(LA186_0 >= INDEX && LA186_0 <= INSTEAD)||(LA186_0 >= INTERSECT && LA186_0 <= INTO)||LA186_0==IS||LA186_0==JOIN||LA186_0==KEY||LA186_0==LEFT||LA186_0==LIMIT||LA186_0==NATURAL||LA186_0==NULL||(LA186_0 >= OF && LA186_0 <= ON)||(LA186_0 >= OR && LA186_0 <= ORDER)||LA186_0==OUTER||LA186_0==PLAN||(LA186_0 >= PRAGMA && LA186_0 <= PRIMARY)||LA186_0==QUERY||(LA186_0 >= RAISE && LA186_0 <= REFERENCES)||(LA186_0 >= REINDEX && LA186_0 <= ROW)||(LA186_0 >= SAVEPOINT && LA186_0 <= SELECT)||LA186_0==SET||LA186_0==TABLE||(LA186_0 >= TEMPORARY && LA186_0 <= THEN)||(LA186_0 >= TO && LA186_0 <= TRIGGER)||(LA186_0 >= UNION && LA186_0 <= USING)||(LA186_0 >= VACUUM && LA186_0 <= VIRTUAL)||(LA186_0 >= WHEN && LA186_0 <= WHERE)) ) {
                alt186=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 186, 0, input);

                throw nvae;

            }
            switch (alt186) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:512:5: id_core
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_id_core_in_id4257);
                    id_core503=id_core();

                    state._fsp--;

                    adaptor.addChild(root_0, id_core503.getTree());

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:512:15: keyword
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_keyword_in_id4261);
                    keyword504=keyword();

                    state._fsp--;

                    adaptor.addChild(root_0, keyword504.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "id"


    public static class keyword_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "keyword"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:514:1: keyword : ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GROUP | HAVING | IF | IGNORE | IMMEDIATE | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | JOIN | KEY | LEFT | LIMIT | NATURAL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) ;
    public final SqlParser.keyword_return keyword() throws RecognitionException {
        SqlParser.keyword_return retval = new SqlParser.keyword_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set505=null;

        Object set505_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:514:8: ( ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GROUP | HAVING | IF | IGNORE | IMMEDIATE | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | JOIN | KEY | LEFT | LIMIT | NATURAL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            root_0 = (Object)adaptor.nil();


            set505=(Token)input.LT(1);

            if ( (input.LA(1) >= ABORT && input.LA(1) <= AFTER)||(input.LA(1) >= ALL && input.LA(1) <= ALTER)||(input.LA(1) >= ANALYZE && input.LA(1) <= AND)||(input.LA(1) >= AS && input.LA(1) <= ASC)||(input.LA(1) >= ATTACH && input.LA(1) <= AUTOINCREMENT)||(input.LA(1) >= BEFORE && input.LA(1) <= BETWEEN)||input.LA(1)==BY||(input.LA(1) >= CASCADE && input.LA(1) <= COLLATE)||input.LA(1)==COLUMN||(input.LA(1) >= COMMIT && input.LA(1) <= CONSTRAINT)||input.LA(1)==CREATE||(input.LA(1) >= CROSS && input.LA(1) <= CURRENT_TIMESTAMP)||(input.LA(1) >= DATABASE && input.LA(1) <= DISTINCT)||input.LA(1)==DROP||(input.LA(1) >= EACH && input.LA(1) <= END)||(input.LA(1) >= ESCAPE && input.LA(1) <= EXPLAIN)||input.LA(1)==FAIL||(input.LA(1) >= FOR && input.LA(1) <= FROM)||input.LA(1)==GROUP||input.LA(1)==HAVING||(input.LA(1) >= IF && input.LA(1) <= IMMEDIATE)||(input.LA(1) >= INDEX && input.LA(1) <= INSTEAD)||(input.LA(1) >= INTERSECT && input.LA(1) <= INTO)||input.LA(1)==IS||input.LA(1)==JOIN||input.LA(1)==KEY||input.LA(1)==LEFT||input.LA(1)==LIMIT||input.LA(1)==NATURAL||input.LA(1)==NULL||(input.LA(1) >= OF && input.LA(1) <= ON)||(input.LA(1) >= OR && input.LA(1) <= ORDER)||input.LA(1)==OUTER||input.LA(1)==PLAN||(input.LA(1) >= PRAGMA && input.LA(1) <= PRIMARY)||input.LA(1)==QUERY||(input.LA(1) >= RAISE && input.LA(1) <= REFERENCES)||(input.LA(1) >= REINDEX && input.LA(1) <= ROW)||(input.LA(1) >= SAVEPOINT && input.LA(1) <= SELECT)||input.LA(1)==SET||input.LA(1)==TABLE||(input.LA(1) >= TEMPORARY && input.LA(1) <= THEN)||(input.LA(1) >= TO && input.LA(1) <= TRIGGER)||(input.LA(1) >= UNION && input.LA(1) <= USING)||(input.LA(1) >= VACUUM && input.LA(1) <= VIRTUAL)||(input.LA(1) >= WHEN && input.LA(1) <= WHERE) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set505)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "keyword"


    public static class id_column_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "id_column_def"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:633:1: id_column_def : ( id_core | keyword_column_def );
    public final SqlParser.id_column_def_return id_column_def() throws RecognitionException {
        SqlParser.id_column_def_return retval = new SqlParser.id_column_def_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SqlParser.id_core_return id_core506 =null;

        SqlParser.keyword_column_def_return keyword_column_def507 =null;



        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:633:14: ( id_core | keyword_column_def )
            int alt187=2;
            int LA187_0 = input.LA(1);

            if ( (LA187_0==ID||LA187_0==STRING) ) {
                alt187=1;
            }
            else if ( ((LA187_0 >= ABORT && LA187_0 <= AFTER)||(LA187_0 >= ALL && LA187_0 <= ALTER)||(LA187_0 >= ANALYZE && LA187_0 <= AND)||(LA187_0 >= AS && LA187_0 <= ASC)||(LA187_0 >= ATTACH && LA187_0 <= AUTOINCREMENT)||(LA187_0 >= BEFORE && LA187_0 <= BETWEEN)||LA187_0==BY||(LA187_0 >= CASCADE && LA187_0 <= COLLATE)||(LA187_0 >= COMMIT && LA187_0 <= CONFLICT)||LA187_0==CREATE||(LA187_0 >= CROSS && LA187_0 <= CURRENT_TIMESTAMP)||(LA187_0 >= DATABASE && LA187_0 <= DISTINCT)||LA187_0==DROP||(LA187_0 >= EACH && LA187_0 <= END)||(LA187_0 >= ESCAPE && LA187_0 <= EXPLAIN)||LA187_0==FAIL||(LA187_0 >= FOR && LA187_0 <= FROM)||LA187_0==GLOB||LA187_0==GROUP||LA187_0==HAVING||(LA187_0 >= IF && LA187_0 <= INSTEAD)||(LA187_0 >= INTERSECT && LA187_0 <= INTO)||(LA187_0 >= IS && LA187_0 <= ISNULL)||LA187_0==JOIN||LA187_0==KEY||LA187_0==LEFT||(LA187_0 >= LIKE && LA187_0 <= LIMIT)||LA187_0==MATCH||(LA187_0 >= NATURAL && LA187_0 <= NOTNULL)||LA187_0==NULL||(LA187_0 >= OF && LA187_0 <= ON)||(LA187_0 >= OR && LA187_0 <= ORDER)||LA187_0==OUTER||LA187_0==PLAN||(LA187_0 >= PRAGMA && LA187_0 <= PRIMARY)||LA187_0==QUERY||(LA187_0 >= RAISE && LA187_0 <= ROW)||(LA187_0 >= SAVEPOINT && LA187_0 <= SELECT)||LA187_0==SET||LA187_0==TABLE||(LA187_0 >= TEMPORARY && LA187_0 <= THEN)||(LA187_0 >= TO && LA187_0 <= TRIGGER)||(LA187_0 >= UNION && LA187_0 <= USING)||(LA187_0 >= VACUUM && LA187_0 <= VIRTUAL)||(LA187_0 >= WHEN && LA187_0 <= WHERE)) ) {
                alt187=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 187, 0, input);

                throw nvae;

            }
            switch (alt187) {
                case 1 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:633:16: id_core
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_id_core_in_id_column_def4935);
                    id_core506=id_core();

                    state._fsp--;

                    adaptor.addChild(root_0, id_core506.getTree());

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:633:26: keyword_column_def
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_keyword_column_def_in_id_column_def4939);
                    keyword_column_def507=keyword_column_def();

                    state._fsp--;

                    adaptor.addChild(root_0, keyword_column_def507.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "id_column_def"


    public static class keyword_column_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "keyword_column_def"
    // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:635:1: keyword_column_def : ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COMMIT | CONFLICT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) ;
    public final SqlParser.keyword_column_def_return keyword_column_def() throws RecognitionException {
        SqlParser.keyword_column_def_return retval = new SqlParser.keyword_column_def_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set508=null;

        Object set508_tree=null;

        try {
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:635:19: ( ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COMMIT | CONFLICT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) )
            // /home/alex/sqljet/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            root_0 = (Object)adaptor.nil();


            set508=(Token)input.LT(1);

            if ( (input.LA(1) >= ABORT && input.LA(1) <= AFTER)||(input.LA(1) >= ALL && input.LA(1) <= ALTER)||(input.LA(1) >= ANALYZE && input.LA(1) <= AND)||(input.LA(1) >= AS && input.LA(1) <= ASC)||(input.LA(1) >= ATTACH && input.LA(1) <= AUTOINCREMENT)||(input.LA(1) >= BEFORE && input.LA(1) <= BETWEEN)||input.LA(1)==BY||(input.LA(1) >= CASCADE && input.LA(1) <= COLLATE)||(input.LA(1) >= COMMIT && input.LA(1) <= CONFLICT)||input.LA(1)==CREATE||(input.LA(1) >= CROSS && input.LA(1) <= CURRENT_TIMESTAMP)||(input.LA(1) >= DATABASE && input.LA(1) <= DISTINCT)||input.LA(1)==DROP||(input.LA(1) >= EACH && input.LA(1) <= END)||(input.LA(1) >= ESCAPE && input.LA(1) <= EXPLAIN)||input.LA(1)==FAIL||(input.LA(1) >= FOR && input.LA(1) <= FROM)||input.LA(1)==GLOB||input.LA(1)==GROUP||input.LA(1)==HAVING||(input.LA(1) >= IF && input.LA(1) <= INSTEAD)||(input.LA(1) >= INTERSECT && input.LA(1) <= INTO)||(input.LA(1) >= IS && input.LA(1) <= ISNULL)||input.LA(1)==JOIN||input.LA(1)==KEY||input.LA(1)==LEFT||(input.LA(1) >= LIKE && input.LA(1) <= LIMIT)||input.LA(1)==MATCH||(input.LA(1) >= NATURAL && input.LA(1) <= NOTNULL)||input.LA(1)==NULL||(input.LA(1) >= OF && input.LA(1) <= ON)||(input.LA(1) >= OR && input.LA(1) <= ORDER)||input.LA(1)==OUTER||input.LA(1)==PLAN||(input.LA(1) >= PRAGMA && input.LA(1) <= PRIMARY)||input.LA(1)==QUERY||(input.LA(1) >= RAISE && input.LA(1) <= ROW)||(input.LA(1) >= SAVEPOINT && input.LA(1) <= SELECT)||input.LA(1)==SET||input.LA(1)==TABLE||(input.LA(1) >= TEMPORARY && input.LA(1) <= THEN)||(input.LA(1) >= TO && input.LA(1) <= TRIGGER)||(input.LA(1) >= UNION && input.LA(1) <= USING)||(input.LA(1) >= VACUUM && input.LA(1) <= VIRTUAL)||(input.LA(1) >= WHEN && input.LA(1) <= WHERE) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set508)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "keyword_column_def"

    // Delegated rules


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA80 dfa80 = new DFA80(this);
    protected DFA79 dfa79 = new DFA79(this);
    protected DFA78 dfa78 = new DFA78(this);
    protected DFA124 dfa124 = new DFA124(this);
    protected DFA129 dfa129 = new DFA129(this);
    static final String DFA10_eotS =
        "\146\uffff";
    static final String DFA10_eofS =
        "\1\1\34\uffff\1\1\110\uffff";
    static final String DFA10_minS =
        "\1\5\34\uffff\1\5\2\uffff\2\5\1\36\1\11\2\103\1\36\1\103\76\uffff";
    static final String DFA10_maxS =
        "\1\u00e9\34\uffff\1\u00e9\2\uffff\2\u00e9\1\103\3\u00c0\1\103\1"+
        "\172\76\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\2\51\uffff\1\1\72\uffff";
    static final String DFA10_specialS =
        "\146\uffff}>";
    static final String[] DFA10_transitionS = {
            "\3\1\1\uffff\2\1\1\uffff\2\1\1\uffff\2\1\2\uffff\2\1\2\uffff"+
            "\3\1\4\uffff\1\1\1\uffff\5\1\1\uffff\1\1\3\uffff\1\1\1\uffff"+
            "\3\1\1\uffff\1\1\4\uffff\4\1\1\uffff\10\1\3\uffff\1\1\3\uffff"+
            "\3\1\2\uffff\5\1\1\uffff\1\1\3\uffff\3\1\6\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\1\1\12\uffff\3\1\1\uffff\6\1\2\uffff\2\1\2\uffff"+
            "\1\1\4\uffff\1\1\1\uffff\1\1\1\uffff\1\1\3\uffff\1\1\7\uffff"+
            "\1\1\5\uffff\1\1\1\uffff\3\1\1\uffff\1\35\1\1\1\uffff\1\1\3"+
            "\uffff\1\1\1\uffff\2\1\1\uffff\1\1\4\uffff\2\1\1\uffff\10\1"+
            "\2\uffff\2\1\1\uffff\2\1\4\uffff\1\1\11\uffff\1\1\1\uffff\2"+
            "\1\1\uffff\3\1\4\uffff\4\1\1\uffff\4\1\1\uffff\2\1",
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
            "\3\53\1\uffff\2\53\1\uffff\2\53\1\uffff\2\53\1\uffff\3\53\2"+
            "\uffff\3\53\2\uffff\1\53\1\uffff\1\53\1\uffff\7\53\3\uffff\1"+
            "\1\1\uffff\3\53\1\uffff\1\53\4\uffff\4\53\1\uffff\10\53\3\uffff"+
            "\1\53\3\uffff\3\53\2\uffff\1\53\1\45\3\53\1\uffff\2\53\2\uffff"+
            "\2\53\1\40\6\uffff\1\42\1\uffff\1\53\1\uffff\1\53\12\uffff\3"+
            "\53\1\uffff\7\53\1\uffff\1\44\1\53\2\uffff\1\53\4\uffff\1\53"+
            "\1\uffff\1\53\1\uffff\1\53\3\uffff\1\47\1\uffff\1\53\3\uffff"+
            "\1\53\1\uffff\2\53\4\uffff\1\53\1\uffff\3\53\1\uffff\1\53\1"+
            "\46\1\uffff\1\53\3\uffff\4\53\1\uffff\2\53\3\uffff\2\53\1\uffff"+
            "\7\53\1\1\2\uffff\2\53\1\uffff\1\1\1\53\4\uffff\1\53\11\uffff"+
            "\1\53\1\uffff\6\53\4\uffff\1\43\3\53\1\uffff\4\53\1\uffff\1"+
            "\53\1\41",
            "",
            "",
            "\3\1\1\uffff\2\1\1\uffff\2\1\1\uffff\2\1\2\uffff\2\1\2\uffff"+
            "\3\1\4\uffff\1\1\1\uffff\5\1\1\uffff\1\1\5\uffff\3\1\1\uffff"+
            "\1\1\4\uffff\4\1\1\uffff\10\1\1\uffff\1\53\1\uffff\1\1\3\uffff"+
            "\3\1\2\uffff\5\1\1\uffff\1\1\3\uffff\3\1\6\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\1\1\12\uffff\3\1\1\uffff\6\1\2\uffff\2\1\2\uffff"+
            "\1\1\4\uffff\1\1\1\uffff\1\1\1\uffff\1\1\3\uffff\1\1\1\uffff"+
            "\1\1\5\uffff\1\1\5\uffff\1\1\1\uffff\3\1\1\uffff\2\1\1\uffff"+
            "\1\1\3\uffff\1\1\1\uffff\2\1\1\uffff\1\1\4\uffff\2\1\1\uffff"+
            "\7\1\3\uffff\2\1\2\uffff\1\1\4\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\2\1\1\uffff\3\1\4\uffff\4\1\1\uffff\4\1\1\uffff\2\1",
            "\3\1\1\uffff\2\1\1\uffff\2\1\1\uffff\2\1\1\uffff\3\1\2\uffff"+
            "\3\1\2\uffff\1\1\1\uffff\1\1\1\uffff\7\1\5\uffff\3\1\1\uffff"+
            "\1\1\4\uffff\4\1\1\uffff\10\1\1\uffff\1\53\1\uffff\1\1\3\uffff"+
            "\3\1\2\uffff\5\1\1\uffff\2\1\2\uffff\3\1\6\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\1\1\12\uffff\3\1\1\uffff\7\1\1\uffff\2\1\2\uffff"+
            "\1\1\4\uffff\1\1\1\uffff\1\1\1\uffff\1\1\3\uffff\1\1\1\uffff"+
            "\1\1\3\uffff\1\1\1\uffff\2\1\4\uffff\1\1\1\uffff\3\1\1\uffff"+
            "\2\1\1\uffff\1\1\3\uffff\4\1\1\uffff\2\1\3\uffff\2\1\1\uffff"+
            "\7\1\3\uffff\2\1\2\uffff\1\1\4\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\6\1\4\uffff\4\1\1\uffff\4\1\1\uffff\2\1",
            "\1\1\44\uffff\1\53",
            "\1\1\71\uffff\1\53\174\uffff\1\1",
            "\1\53\174\uffff\1\1",
            "\1\53\174\uffff\1\1",
            "\1\1\44\uffff\1\53",
            "\1\53\66\uffff\1\1",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "()* loopback of 182:18: ( OR ^ or_subexpr )*";
        }
    }
    static final String DFA11_eotS =
        "\147\uffff";
    static final String DFA11_eofS =
        "\1\1\35\uffff\1\1\110\uffff";
    static final String DFA11_minS =
        "\1\5\35\uffff\1\5\2\uffff\2\5\1\36\1\11\2\103\1\36\1\103\76\uffff";
    static final String DFA11_maxS =
        "\1\u00e9\35\uffff\1\u00e9\2\uffff\2\u00e9\1\103\3\u00c0\1\103\1"+
        "\172\76\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\2\52\uffff\1\1\72\uffff";
    static final String DFA11_specialS =
        "\147\uffff}>";
    static final String[] DFA11_transitionS = {
            "\3\1\1\uffff\2\1\1\uffff\1\1\1\36\1\uffff\2\1\2\uffff\2\1\2"+
            "\uffff\3\1\4\uffff\1\1\1\uffff\5\1\1\uffff\1\1\3\uffff\1\1\1"+
            "\uffff\3\1\1\uffff\1\1\4\uffff\4\1\1\uffff\10\1\3\uffff\1\1"+
            "\3\uffff\3\1\2\uffff\5\1\1\uffff\1\1\3\uffff\3\1\6\uffff\1\1"+
            "\1\uffff\1\1\1\uffff\1\1\12\uffff\3\1\1\uffff\6\1\2\uffff\2"+
            "\1\2\uffff\1\1\4\uffff\1\1\1\uffff\1\1\1\uffff\1\1\3\uffff\1"+
            "\1\7\uffff\1\1\5\uffff\1\1\1\uffff\3\1\1\uffff\2\1\1\uffff\1"+
            "\1\3\uffff\1\1\1\uffff\2\1\1\uffff\1\1\4\uffff\2\1\1\uffff\10"+
            "\1\2\uffff\2\1\1\uffff\2\1\4\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\2\1\1\uffff\3\1\4\uffff\4\1\1\uffff\4\1\1\uffff\2\1",
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
            "\3\54\1\uffff\2\54\1\uffff\2\54\1\uffff\2\54\1\uffff\3\54\2"+
            "\uffff\3\54\2\uffff\1\54\1\uffff\1\54\1\uffff\7\54\3\uffff\1"+
            "\1\1\uffff\3\54\1\uffff\1\54\4\uffff\4\54\1\uffff\10\54\3\uffff"+
            "\1\54\3\uffff\3\54\2\uffff\1\54\1\46\3\54\1\uffff\2\54\2\uffff"+
            "\2\54\1\41\6\uffff\1\43\1\uffff\1\54\1\uffff\1\54\12\uffff\3"+
            "\54\1\uffff\7\54\1\uffff\1\45\1\54\2\uffff\1\54\4\uffff\1\54"+
            "\1\uffff\1\54\1\uffff\1\54\3\uffff\1\50\1\uffff\1\54\3\uffff"+
            "\1\54\1\uffff\2\54\4\uffff\1\54\1\uffff\3\54\1\uffff\1\54\1"+
            "\47\1\uffff\1\54\3\uffff\4\54\1\uffff\2\54\3\uffff\2\54\1\uffff"+
            "\7\54\1\1\2\uffff\2\54\1\uffff\1\1\1\54\4\uffff\1\54\11\uffff"+
            "\1\54\1\uffff\6\54\4\uffff\1\44\3\54\1\uffff\4\54\1\uffff\1"+
            "\54\1\42",
            "",
            "",
            "\3\1\1\uffff\2\1\1\uffff\2\1\1\uffff\2\1\2\uffff\2\1\2\uffff"+
            "\3\1\4\uffff\1\1\1\uffff\5\1\1\uffff\1\1\5\uffff\3\1\1\uffff"+
            "\1\1\4\uffff\4\1\1\uffff\10\1\1\uffff\1\54\1\uffff\1\1\3\uffff"+
            "\3\1\2\uffff\5\1\1\uffff\1\1\3\uffff\3\1\6\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\1\1\12\uffff\3\1\1\uffff\6\1\2\uffff\2\1\2\uffff"+
            "\1\1\4\uffff\1\1\1\uffff\1\1\1\uffff\1\1\3\uffff\1\1\1\uffff"+
            "\1\1\5\uffff\1\1\5\uffff\1\1\1\uffff\3\1\1\uffff\2\1\1\uffff"+
            "\1\1\3\uffff\1\1\1\uffff\2\1\1\uffff\1\1\4\uffff\2\1\1\uffff"+
            "\7\1\3\uffff\2\1\2\uffff\1\1\4\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\2\1\1\uffff\3\1\4\uffff\4\1\1\uffff\4\1\1\uffff\2\1",
            "\3\1\1\uffff\2\1\1\uffff\2\1\1\uffff\2\1\1\uffff\3\1\2\uffff"+
            "\3\1\2\uffff\1\1\1\uffff\1\1\1\uffff\7\1\5\uffff\3\1\1\uffff"+
            "\1\1\4\uffff\4\1\1\uffff\10\1\1\uffff\1\54\1\uffff\1\1\3\uffff"+
            "\3\1\2\uffff\5\1\1\uffff\2\1\2\uffff\3\1\6\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\1\1\12\uffff\3\1\1\uffff\7\1\1\uffff\2\1\2\uffff"+
            "\1\1\4\uffff\1\1\1\uffff\1\1\1\uffff\1\1\3\uffff\1\1\1\uffff"+
            "\1\1\3\uffff\1\1\1\uffff\2\1\4\uffff\1\1\1\uffff\3\1\1\uffff"+
            "\2\1\1\uffff\1\1\3\uffff\4\1\1\uffff\2\1\3\uffff\2\1\1\uffff"+
            "\7\1\3\uffff\2\1\2\uffff\1\1\4\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\6\1\4\uffff\4\1\1\uffff\4\1\1\uffff\2\1",
            "\1\1\44\uffff\1\54",
            "\1\1\71\uffff\1\54\174\uffff\1\1",
            "\1\54\174\uffff\1\1",
            "\1\54\174\uffff\1\1",
            "\1\1\44\uffff\1\54",
            "\1\54\66\uffff\1\1",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "()* loopback of 184:25: ( AND ^ and_subexpr )*";
        }
    }
    static final String DFA12_eotS =
        "\176\uffff";
    static final String DFA12_eofS =
        "\1\12\6\uffff\2\12\165\uffff";
    static final String DFA12_minS =
        "\1\5\6\uffff\1\52\1\5\100\uffff\1\5\2\uffff\1\5\1\36\1\11\2\103"+
        "\1\36\1\103\53\uffff";
    static final String DFA12_maxS =
        "\1\u00e9\6\uffff\2\u00e9\100\uffff\1\u00e9\2\uffff\1\u00e9\1\103"+
        "\3\u00c0\1\103\1\172\53\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\10\uffff\1\2\163\uffff";
    static final String DFA12_specialS =
        "\176\uffff}>";
    static final String[] DFA12_transitionS = {
            "\3\12\1\uffff\2\12\1\uffff\2\12\1\uffff\2\12\2\uffff\2\12\2"+
            "\uffff\2\12\1\10\4\uffff\1\12\1\uffff\5\12\1\uffff\1\12\3\uffff"+
            "\1\12\1\uffff\3\12\1\uffff\1\12\4\uffff\4\12\1\uffff\10\12\3"+
            "\uffff\1\12\3\uffff\3\12\2\1\5\12\1\uffff\1\12\3\uffff\3\12"+
            "\3\uffff\1\1\2\uffff\1\12\1\uffff\1\12\1\uffff\1\12\12\uffff"+
            "\3\12\1\1\6\12\2\uffff\2\12\2\uffff\1\7\1\1\3\uffff\1\12\1\uffff"+
            "\1\12\1\uffff\1\12\2\uffff\1\1\1\12\4\uffff\1\1\2\uffff\1\12"+
            "\4\1\1\uffff\1\12\1\uffff\3\12\1\uffff\2\12\1\uffff\1\12\3\uffff"+
            "\1\12\1\uffff\2\12\1\uffff\1\12\4\uffff\2\12\1\1\10\12\2\uffff"+
            "\2\12\1\uffff\2\12\4\uffff\1\12\11\uffff\1\12\1\uffff\2\12\1"+
            "\uffff\3\12\4\uffff\4\12\1\uffff\4\12\1\uffff\2\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12\44\uffff\1\12\12\uffff\1\12\6\uffff\1\12\32\uffff\1\12"+
            "\20\uffff\1\12\10\uffff\1\1\4\uffff\1\1\6\uffff\1\12\31\uffff"+
            "\1\12\5\uffff\1\12\33\uffff\1\12\12\uffff\1\12",
            "\3\1\1\uffff\2\1\1\uffff\2\1\1\uffff\2\1\1\uffff\3\1\2\uffff"+
            "\3\1\2\uffff\1\1\1\uffff\1\1\1\uffff\7\1\3\uffff\1\12\1\uffff"+
            "\3\1\1\uffff\1\1\4\uffff\4\1\1\uffff\10\1\3\uffff\1\1\3\uffff"+
            "\3\1\2\uffff\1\1\1\120\3\1\1\uffff\2\1\2\uffff\2\1\1\111\6\uffff"+
            "\1\115\1\uffff\1\1\1\uffff\1\1\12\uffff\3\1\1\uffff\7\1\1\uffff"+
            "\1\117\1\1\2\uffff\1\1\4\uffff\1\1\1\uffff\1\1\1\uffff\1\1\3"+
            "\uffff\1\122\1\uffff\1\1\3\uffff\1\1\1\uffff\2\1\4\uffff\1\1"+
            "\1\uffff\3\1\1\uffff\1\1\1\121\1\uffff\1\1\3\uffff\4\1\1\uffff"+
            "\2\1\3\uffff\2\1\1\uffff\7\1\1\12\2\uffff\2\1\1\uffff\1\12\1"+
            "\1\4\uffff\1\1\11\uffff\1\1\1\uffff\6\1\4\uffff\1\116\3\1\1"+
            "\uffff\4\1\1\uffff\1\1\1\114",
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
            "\3\12\1\uffff\2\12\1\uffff\2\12\1\uffff\2\12\2\uffff\2\12\2"+
            "\uffff\3\12\4\uffff\1\12\1\uffff\5\12\1\uffff\1\12\5\uffff\3"+
            "\12\1\uffff\1\12\4\uffff\4\12\1\uffff\10\12\1\uffff\1\1\1\uffff"+
            "\1\12\3\uffff\3\12\2\uffff\5\12\1\uffff\1\12\3\uffff\3\12\6"+
            "\uffff\1\12\1\uffff\1\12\1\uffff\1\12\12\uffff\3\12\1\uffff"+
            "\6\12\2\uffff\2\12\2\uffff\1\12\4\uffff\1\12\1\uffff\1\12\1"+
            "\uffff\1\12\3\uffff\1\12\1\uffff\1\12\5\uffff\1\12\5\uffff\1"+
            "\12\1\uffff\3\12\1\uffff\2\12\1\uffff\1\12\3\uffff\1\12\1\uffff"+
            "\2\12\1\uffff\1\12\4\uffff\2\12\1\uffff\7\12\3\uffff\2\12\2"+
            "\uffff\1\12\4\uffff\1\12\11\uffff\1\12\1\uffff\2\12\1\uffff"+
            "\3\12\4\uffff\4\12\1\uffff\4\12\1\uffff\2\12",
            "",
            "",
            "\3\12\1\uffff\2\12\1\uffff\2\12\1\uffff\2\12\1\uffff\3\12\2"+
            "\uffff\3\12\2\uffff\1\12\1\uffff\1\12\1\uffff\7\12\5\uffff\3"+
            "\12\1\uffff\1\12\4\uffff\4\12\1\uffff\10\12\1\uffff\1\1\1\uffff"+
            "\1\12\3\uffff\3\12\2\uffff\5\12\1\uffff\2\12\2\uffff\3\12\6"+
            "\uffff\1\12\1\uffff\1\12\1\uffff\1\12\12\uffff\3\12\1\uffff"+
            "\7\12\1\uffff\2\12\2\uffff\1\12\4\uffff\1\12\1\uffff\1\12\1"+
            "\uffff\1\12\3\uffff\1\12\1\uffff\1\12\3\uffff\1\12\1\uffff\2"+
            "\12\4\uffff\1\12\1\uffff\3\12\1\uffff\2\12\1\uffff\1\12\3\uffff"+
            "\4\12\1\uffff\2\12\3\uffff\2\12\1\uffff\7\12\3\uffff\2\12\2"+
            "\uffff\1\12\4\uffff\1\12\11\uffff\1\12\1\uffff\6\12\4\uffff"+
            "\4\12\1\uffff\4\12\1\uffff\2\12",
            "\1\12\44\uffff\1\1",
            "\1\12\71\uffff\1\1\174\uffff\1\12",
            "\1\1\174\uffff\1\12",
            "\1\1\174\uffff\1\12",
            "\1\12\44\uffff\1\1",
            "\1\1\66\uffff\1\12",
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
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "186:34: ( cond_expr ^)?";
        }
    }
    static final String DFA26_eotS =
        "\u00b1\uffff";
    static final String DFA26_eofS =
        "\u00b1\uffff";
    static final String DFA26_minS =
        "\2\31\1\uffff\2\5\2\uffff\1\u0096\4\uffff\1\5\2\uffff\1\5\2\uffff"+
        "\1\5\24\uffff\2\5\24\uffff\1\5\3\uffff\1\5\157\uffff";
    static final String DFA26_maxS =
        "\2\u00b4\1\uffff\2\u00e9\2\uffff\1\u009b\4\uffff\1\u00e9\2\uffff"+
        "\1\u00e9\2\uffff\1\u00e9\24\uffff\2\u00e9\24\uffff\1\u00e9\3\uffff"+
        "\1\u00e9\157\uffff";
    static final String DFA26_acceptS =
        "\2\uffff\1\1\2\uffff\1\6\2\uffff\1\10\1\11\3\uffff\1\5\2\uffff\1"+
        "\3\32\uffff\1\2\24\uffff\1\4\26\uffff\1\6\1\7\44\uffff\1\2\33\uffff"+
        "\27\5\1\uffff";
    static final String DFA26_specialS =
        "\u00b1\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\10\62\uffff\1\4\1\11\20\uffff\1\2\24\uffff\1\3\14\uffff\1"+
            "\7\1\5\12\uffff\1\2\5\uffff\1\2\3\uffff\1\1\1\5\2\11\32\uffff"+
            "\1\2",
            "\1\10\62\uffff\1\15\21\uffff\1\2\24\uffff\1\14\30\uffff\1\2"+
            "\5\uffff\1\2\10\uffff\1\5\30\uffff\1\2",
            "",
            "\3\20\1\uffff\2\20\1\uffff\2\20\1\uffff\2\20\2\uffff\2\20\2"+
            "\uffff\3\20\4\uffff\1\20\1\uffff\5\20\1\uffff\1\20\5\uffff\3"+
            "\20\1\uffff\1\20\4\uffff\4\20\1\uffff\10\20\3\uffff\1\20\3\uffff"+
            "\3\20\2\uffff\5\20\1\uffff\1\20\3\uffff\3\20\6\uffff\1\20\1"+
            "\uffff\1\20\1\uffff\1\20\12\uffff\3\20\1\uffff\6\20\2\uffff"+
            "\2\20\2\uffff\1\20\4\uffff\1\20\1\uffff\1\20\1\uffff\1\20\3"+
            "\uffff\1\20\1\uffff\1\17\5\uffff\1\20\5\uffff\1\20\1\uffff\3"+
            "\20\1\uffff\2\20\1\uffff\1\20\3\uffff\1\20\1\uffff\2\20\1\uffff"+
            "\1\20\4\uffff\2\20\1\uffff\7\20\3\uffff\2\20\2\uffff\1\20\4"+
            "\uffff\1\20\11\uffff\1\20\1\uffff\2\20\1\uffff\3\20\4\uffff"+
            "\4\20\1\uffff\4\20\1\uffff\2\20",
            "\3\11\1\uffff\2\11\1\uffff\2\11\1\uffff\2\11\1\uffff\3\11\2"+
            "\uffff\3\11\2\uffff\1\11\1\uffff\1\11\1\uffff\7\11\5\uffff\3"+
            "\11\1\uffff\1\11\4\uffff\4\11\1\uffff\10\11\3\uffff\1\11\3\uffff"+
            "\3\11\2\uffff\5\11\1\uffff\2\11\2\uffff\3\11\6\uffff\1\11\1"+
            "\uffff\1\11\1\uffff\1\11\12\uffff\3\11\1\uffff\7\11\1\uffff"+
            "\2\11\2\uffff\1\11\4\uffff\1\11\1\uffff\1\11\1\uffff\1\11\3"+
            "\uffff\1\11\1\uffff\1\22\3\uffff\1\11\1\uffff\2\11\4\uffff\1"+
            "\11\1\uffff\3\11\1\uffff\2\11\1\uffff\1\11\3\uffff\4\11\1\uffff"+
            "\2\11\3\uffff\2\11\1\uffff\7\11\3\uffff\2\11\2\uffff\1\11\4"+
            "\uffff\1\11\11\uffff\1\11\1\uffff\6\11\4\uffff\4\11\1\uffff"+
            "\4\11\1\uffff\2\11",
            "",
            "",
            "\1\47\4\uffff\1\5",
            "",
            "",
            "",
            "",
            "\3\20\1\uffff\2\20\1\uffff\2\20\1\uffff\2\20\2\uffff\2\20\2"+
            "\uffff\3\20\4\uffff\1\20\1\uffff\5\20\1\uffff\1\20\5\uffff\3"+
            "\20\1\uffff\1\20\4\uffff\4\20\1\uffff\10\20\3\uffff\1\20\3\uffff"+
            "\3\20\2\uffff\5\20\1\uffff\1\20\3\uffff\3\20\6\uffff\1\20\1"+
            "\uffff\1\20\1\uffff\1\20\12\uffff\3\20\1\uffff\6\20\2\uffff"+
            "\2\20\2\uffff\1\20\4\uffff\1\20\1\uffff\1\20\1\uffff\1\20\3"+
            "\uffff\1\20\1\uffff\1\50\5\uffff\1\20\5\uffff\1\20\1\uffff\3"+
            "\20\1\uffff\2\20\1\uffff\1\20\3\uffff\1\20\1\uffff\2\20\1\uffff"+
            "\1\20\4\uffff\2\20\1\uffff\7\20\3\uffff\2\20\2\uffff\1\20\4"+
            "\uffff\1\20\11\uffff\1\20\1\uffff\2\20\1\uffff\3\20\4\uffff"+
            "\4\20\1\uffff\4\20\1\uffff\2\20",
            "",
            "",
            "\3\53\1\uffff\2\53\1\uffff\2\53\1\uffff\2\53\1\uffff\3\53\2"+
            "\uffff\3\53\2\uffff\1\53\1\uffff\1\53\1\uffff\7\53\5\uffff\3"+
            "\53\1\uffff\1\53\4\uffff\4\53\1\uffff\10\53\3\uffff\1\53\3\uffff"+
            "\3\53\2\uffff\5\53\1\uffff\2\53\2\uffff\3\53\6\uffff\1\53\1"+
            "\uffff\1\53\1\uffff\1\53\12\uffff\3\53\1\uffff\7\53\1\uffff"+
            "\2\53\2\uffff\1\53\4\uffff\1\53\1\uffff\1\53\1\uffff\1\53\3"+
            "\uffff\1\53\1\uffff\1\53\3\uffff\1\53\1\uffff\2\53\4\uffff\1"+
            "\53\1\uffff\3\53\1\uffff\2\53\1\uffff\1\53\3\uffff\4\53\1\uffff"+
            "\2\53\3\uffff\2\53\1\uffff\7\53\1\100\2\uffff\1\53\1\75\2\uffff"+
            "\1\53\4\uffff\1\53\11\uffff\1\53\1\uffff\6\53\4\uffff\4\53\1"+
            "\uffff\4\53\1\uffff\2\53",
            "",
            "",
            "\3\11\1\uffff\2\11\1\uffff\2\11\1\uffff\2\11\1\uffff\3\11\2"+
            "\uffff\3\11\2\uffff\1\11\1\uffff\1\11\1\uffff\7\11\5\uffff\3"+
            "\11\1\uffff\1\11\4\uffff\4\11\1\uffff\10\11\3\uffff\1\11\3\uffff"+
            "\3\11\2\uffff\5\11\1\uffff\2\11\2\uffff\3\11\6\uffff\1\11\1"+
            "\uffff\1\11\1\uffff\1\11\12\uffff\3\11\1\uffff\7\11\1\uffff"+
            "\2\11\2\uffff\1\11\4\uffff\1\11\1\uffff\1\11\1\uffff\1\11\3"+
            "\uffff\1\11\1\uffff\1\11\3\uffff\1\11\1\uffff\2\11\4\uffff\1"+
            "\11\1\uffff\3\11\1\uffff\2\11\1\uffff\1\11\3\uffff\4\11\1\uffff"+
            "\2\11\3\uffff\2\11\1\uffff\7\11\1\15\2\uffff\1\11\1\101\2\uffff"+
            "\1\11\4\uffff\1\11\11\uffff\1\11\1\uffff\6\11\4\uffff\4\11\1"+
            "\uffff\4\11\1\uffff\2\11",
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
            "",
            "",
            "\3\130\1\uffff\2\130\1\uffff\2\130\1\uffff\2\130\1\uffff\3"+
            "\130\2\uffff\3\130\2\uffff\1\130\1\uffff\1\130\1\uffff\7\130"+
            "\5\uffff\3\130\1\uffff\1\130\4\uffff\4\130\1\uffff\10\130\3"+
            "\uffff\1\130\3\uffff\3\130\2\uffff\5\130\1\uffff\2\130\2\uffff"+
            "\3\130\6\uffff\1\130\1\uffff\1\130\1\uffff\1\130\12\uffff\3"+
            "\130\1\uffff\7\130\1\uffff\2\130\2\uffff\1\130\4\uffff\1\130"+
            "\1\uffff\1\130\1\uffff\1\130\3\uffff\1\130\1\uffff\1\130\3\uffff"+
            "\1\130\1\uffff\2\130\4\uffff\1\127\1\uffff\3\130\1\uffff\2\130"+
            "\1\uffff\1\130\3\uffff\4\130\1\uffff\2\130\3\uffff\2\130\1\uffff"+
            "\7\130\3\uffff\2\130\2\uffff\1\130\4\uffff\1\130\11\uffff\1"+
            "\130\1\uffff\6\130\4\uffff\4\130\1\uffff\4\130\1\uffff\2\130",
            "\3\53\1\uffff\2\53\1\uffff\2\53\1\uffff\2\53\1\uffff\3\53\2"+
            "\uffff\3\53\2\uffff\1\53\1\uffff\1\53\1\uffff\7\53\5\uffff\3"+
            "\53\1\uffff\1\53\4\uffff\4\53\1\uffff\10\53\3\uffff\1\53\3\uffff"+
            "\3\53\2\uffff\5\53\1\uffff\2\53\2\uffff\3\53\6\uffff\1\53\1"+
            "\uffff\1\53\1\uffff\1\53\12\uffff\3\53\1\uffff\7\53\1\uffff"+
            "\2\53\2\uffff\1\53\4\uffff\1\53\1\uffff\1\53\1\uffff\1\53\3"+
            "\uffff\1\53\1\uffff\1\53\3\uffff\1\53\1\uffff\2\53\4\uffff\1"+
            "\53\1\uffff\3\53\1\uffff\2\53\1\uffff\1\53\3\uffff\4\53\1\uffff"+
            "\2\53\3\uffff\2\53\1\uffff\7\53\1\100\2\uffff\1\53\1\175\2\uffff"+
            "\1\53\4\uffff\1\53\11\uffff\1\53\1\uffff\6\53\4\uffff\4\53\1"+
            "\uffff\4\53\1\uffff\2\53",
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
            "",
            "",
            "\3\100\1\uffff\2\100\1\uffff\2\100\1\uffff\6\100\2\uffff\3"+
            "\100\2\uffff\1\100\1\uffff\1\100\1\uffff\7\100\5\uffff\3\100"+
            "\1\uffff\1\100\4\uffff\4\100\1\uffff\10\100\1\uffff\1\53\1\uffff"+
            "\1\100\3\uffff\3\100\2\uffff\5\100\1\uffff\2\100\2\uffff\3\100"+
            "\6\uffff\1\100\1\uffff\1\100\1\uffff\1\100\12\uffff\3\100\1"+
            "\uffff\7\100\1\uffff\2\100\2\uffff\1\100\4\uffff\1\100\1\uffff"+
            "\1\100\1\uffff\1\100\3\uffff\1\100\1\uffff\1\100\3\uffff\1\100"+
            "\1\uffff\2\100\4\uffff\1\100\1\uffff\3\100\1\uffff\2\100\1\uffff"+
            "\1\100\3\uffff\4\100\1\uffff\2\100\3\uffff\2\100\1\uffff\7\100"+
            "\3\uffff\2\100\2\uffff\1\100\4\uffff\1\100\11\uffff\1\100\1"+
            "\uffff\6\100\4\uffff\4\100\1\uffff\4\100\1\uffff\2\100",
            "",
            "",
            "",
            "\3\u00ae\1\uffff\1\u0099\1\u00ae\1\uffff\2\u00ae\1\uffff\2"+
            "\u00ae\1\u009b\1\u00a8\2\u00ae\2\uffff\3\u00ae\2\uffff\1\u00a1"+
            "\1\uffff\1\u00ae\1\uffff\1\u00ae\1\u00ac\1\u00a5\2\u00ae\1\u00a7"+
            "\1\u00ae\5\uffff\3\u00ae\1\uffff\1\u00ae\4\uffff\1\u00ae\1\u00a3"+
            "\1\u00a2\1\u00a4\1\uffff\7\u00ae\1\u009a\1\uffff\1\11\1\uffff"+
            "\1\u00ae\3\uffff\3\u00ae\2\uffff\3\u00ae\1\u00aa\1\u00ae\1\uffff"+
            "\1\u00ae\1\u009f\2\uffff\3\u00ae\6\uffff\1\u00ae\1\uffff\1\u00ae"+
            "\1\uffff\1\u00a0\12\uffff\3\u00ae\1\uffff\6\u00ae\1\u009e\1"+
            "\uffff\2\u00ae\2\uffff\1\u00ae\4\uffff\1\u00ae\1\uffff\1\u00ae"+
            "\1\uffff\1\u00ae\3\uffff\1\u00ae\1\uffff\1\u00a9\3\uffff\1\u00af"+
            "\1\uffff\1\u00ae\1\u00ab\4\uffff\1\u009d\1\uffff\3\u00ae\1\uffff"+
            "\2\u00ae\1\uffff\1\u00ae\3\uffff\1\u00ae\1\u00af\2\u00ae\1\uffff"+
            "\1\u00ae\1\u00a6\3\uffff\1\u00ad\1\u00ae\1\uffff\7\u00ae\3\uffff"+
            "\2\u00ae\2\uffff\1\u00ae\4\uffff\1\u009c\11\uffff\1\u00ae\1"+
            "\uffff\2\u00ae\1\u00af\3\u00ae\4\uffff\4\u00ae\1\uffff\4\u00ae"+
            "\1\uffff\2\u00ae",
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
            "",
            "",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "188:1: cond_expr : ( ( NOT )? match_op match_expr= eq_subexpr ( ESCAPE escape_expr= eq_subexpr )? -> ^( match_op $match_expr ( NOT )? ( ^( ESCAPE $escape_expr) )? ) | ( NOT )? IN LPAREN expr ( COMMA expr )* RPAREN -> ^( IN_VALUES ( NOT )? ^( IN ( expr )+ ) ) | ( NOT )? IN (database_name= id DOT )? table_name= id -> ^( IN_TABLE ( NOT )? ^( IN ^( $table_name ( $database_name)? ) ) ) | ( NOT )? IN ^ LPAREN ! ( select_stmt )? RPAREN !| ( NOT )? EQUALS ^ LPAREN ! ( select_stmt )? RPAREN !| ( ISNULL -> IS_NULL | NOTNULL -> NOT_NULL | IS NULL -> IS_NULL | NOT NULL -> NOT_NULL | IS NOT NULL -> NOT_NULL ) | IS NOT ^ eq_subexpr | ( NOT )? BETWEEN e1= eq_subexpr AND e2= eq_subexpr -> ^( BETWEEN ( NOT )? ^( AND $e1 $e2) ) | ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) ^ eq_subexpr )+ );";
        }
    }
    static final String DFA14_eotS =
        "\150\uffff";
    static final String DFA14_eofS =
        "\2\2\146\uffff";
    static final String DFA14_minS =
        "\2\5\61\uffff\1\5\2\uffff\1\5\1\36\1\11\2\103\1\36\1\103\53\uffff";
    static final String DFA14_maxS =
        "\2\u00e9\61\uffff\1\u00e9\2\uffff\1\u00e9\1\103\3\u00c0\1\103\1"+
        "\172\53\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\36\uffff\1\1\106\uffff";
    static final String DFA14_specialS =
        "\150\uffff}>";
    static final String[] DFA14_transitionS = {
            "\3\2\1\uffff\2\2\1\uffff\2\2\1\uffff\2\2\2\uffff\2\2\2\uffff"+
            "\3\2\4\uffff\1\2\1\uffff\5\2\1\uffff\1\2\3\uffff\1\2\1\uffff"+
            "\3\2\1\uffff\1\2\4\uffff\4\2\1\uffff\10\2\3\uffff\1\2\3\uffff"+
            "\3\2\2\uffff\1\1\4\2\1\uffff\1\2\3\uffff\3\2\6\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\1\2\12\uffff\3\2\1\uffff\6\2\2\uffff\2\2\2\uffff"+
            "\1\2\4\uffff\1\2\1\uffff\1\2\1\uffff\1\2\3\uffff\1\2\7\uffff"+
            "\1\2\5\uffff\1\2\1\uffff\3\2\1\uffff\2\2\1\uffff\1\2\3\uffff"+
            "\1\2\1\uffff\2\2\1\uffff\1\2\4\uffff\2\2\1\uffff\10\2\2\uffff"+
            "\2\2\1\uffff\2\2\4\uffff\1\2\11\uffff\1\2\1\uffff\2\2\1\uffff"+
            "\3\2\4\uffff\4\2\1\uffff\4\2\1\uffff\2\2",
            "\3\41\1\uffff\2\41\1\uffff\2\41\1\uffff\2\41\1\uffff\3\41\2"+
            "\uffff\3\41\2\uffff\1\41\1\uffff\1\41\1\uffff\7\41\3\uffff\1"+
            "\2\1\uffff\3\41\1\uffff\1\41\4\uffff\4\41\1\uffff\10\41\3\uffff"+
            "\1\41\3\uffff\3\41\2\uffff\1\41\1\72\3\41\1\uffff\2\41\2\uffff"+
            "\2\41\1\63\6\uffff\1\67\1\uffff\1\41\1\uffff\1\41\12\uffff\3"+
            "\41\1\uffff\7\41\1\uffff\1\71\1\41\2\uffff\1\41\4\uffff\1\41"+
            "\1\uffff\1\41\1\uffff\1\41\3\uffff\1\74\1\uffff\1\41\3\uffff"+
            "\1\41\1\uffff\2\41\4\uffff\1\41\1\uffff\3\41\1\uffff\1\41\1"+
            "\73\1\uffff\1\41\3\uffff\4\41\1\uffff\2\41\3\uffff\2\41\1\uffff"+
            "\7\41\1\2\2\uffff\2\41\1\uffff\1\2\1\41\4\uffff\1\41\11\uffff"+
            "\1\41\1\uffff\6\41\4\uffff\1\70\3\41\1\uffff\4\41\1\uffff\1"+
            "\41\1\66",
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
            "\3\2\1\uffff\2\2\1\uffff\2\2\1\uffff\2\2\2\uffff\2\2\2\uffff"+
            "\3\2\4\uffff\1\2\1\uffff\5\2\1\uffff\1\2\5\uffff\3\2\1\uffff"+
            "\1\2\4\uffff\4\2\1\uffff\10\2\1\uffff\1\41\1\uffff\1\2\3\uffff"+
            "\3\2\2\uffff\5\2\1\uffff\1\2\3\uffff\3\2\6\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\1\2\12\uffff\3\2\1\uffff\6\2\2\uffff\2\2\2\uffff"+
            "\1\2\4\uffff\1\2\1\uffff\1\2\1\uffff\1\2\3\uffff\1\2\1\uffff"+
            "\1\2\5\uffff\1\2\5\uffff\1\2\1\uffff\3\2\1\uffff\2\2\1\uffff"+
            "\1\2\3\uffff\1\2\1\uffff\2\2\1\uffff\1\2\4\uffff\2\2\1\uffff"+
            "\7\2\3\uffff\2\2\2\uffff\1\2\4\uffff\1\2\11\uffff\1\2\1\uffff"+
            "\2\2\1\uffff\3\2\4\uffff\4\2\1\uffff\4\2\1\uffff\2\2",
            "",
            "",
            "\3\2\1\uffff\2\2\1\uffff\2\2\1\uffff\2\2\1\uffff\3\2\2\uffff"+
            "\3\2\2\uffff\1\2\1\uffff\1\2\1\uffff\7\2\5\uffff\3\2\1\uffff"+
            "\1\2\4\uffff\4\2\1\uffff\10\2\1\uffff\1\41\1\uffff\1\2\3\uffff"+
            "\3\2\2\uffff\5\2\1\uffff\2\2\2\uffff\3\2\6\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\1\2\12\uffff\3\2\1\uffff\7\2\1\uffff\2\2\2\uffff"+
            "\1\2\4\uffff\1\2\1\uffff\1\2\1\uffff\1\2\3\uffff\1\2\1\uffff"+
            "\1\2\3\uffff\1\2\1\uffff\2\2\4\uffff\1\2\1\uffff\3\2\1\uffff"+
            "\2\2\1\uffff\1\2\3\uffff\4\2\1\uffff\2\2\3\uffff\2\2\1\uffff"+
            "\7\2\3\uffff\2\2\2\uffff\1\2\4\uffff\1\2\11\uffff\1\2\1\uffff"+
            "\6\2\4\uffff\4\2\1\uffff\4\2\1\uffff\2\2",
            "\1\2\44\uffff\1\41",
            "\1\2\71\uffff\1\41\174\uffff\1\2",
            "\1\41\174\uffff\1\2",
            "\1\41\174\uffff\1\2",
            "\1\2\44\uffff\1\41",
            "\1\41\66\uffff\1\2",
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
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "189:41: ( ESCAPE escape_expr= eq_subexpr )?";
        }
    }
    static final String DFA18_eotS =
        "\103\uffff";
    static final String DFA18_eofS =
        "\1\uffff\2\4\100\uffff";
    static final String DFA18_minS =
        "\3\5\100\uffff";
    static final String DFA18_maxS =
        "\3\u00e9\100\uffff";
    static final String DFA18_acceptS =
        "\3\uffff\1\1\1\2\76\uffff";
    static final String DFA18_specialS =
        "\103\uffff}>";
    static final String[] DFA18_transitionS = {
            "\3\2\1\uffff\2\2\1\uffff\2\2\1\uffff\2\2\2\uffff\2\2\2\uffff"+
            "\3\2\4\uffff\1\2\1\uffff\5\2\1\uffff\1\2\5\uffff\3\2\1\uffff"+
            "\1\2\4\uffff\4\2\1\uffff\10\2\3\uffff\1\2\3\uffff\3\2\2\uffff"+
            "\5\2\1\uffff\1\2\3\uffff\3\2\6\uffff\1\2\1\uffff\1\2\1\uffff"+
            "\1\1\12\uffff\3\2\1\uffff\6\2\2\uffff\2\2\2\uffff\1\2\4\uffff"+
            "\1\2\1\uffff\1\2\1\uffff\1\2\3\uffff\1\2\7\uffff\1\2\5\uffff"+
            "\1\2\1\uffff\3\2\1\uffff\2\2\1\uffff\1\2\3\uffff\1\2\1\uffff"+
            "\2\2\1\uffff\1\2\4\uffff\2\2\1\uffff\7\2\3\uffff\2\2\2\uffff"+
            "\1\2\4\uffff\1\1\11\uffff\1\2\1\uffff\2\2\1\uffff\3\2\4\uffff"+
            "\4\2\1\uffff\4\2\1\uffff\2\2",
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\2\uffff\2\4\2\uffff"+
            "\3\4\4\uffff\1\4\1\uffff\5\4\1\uffff\1\4\3\uffff\1\4\1\uffff"+
            "\3\4\1\uffff\1\4\4\uffff\4\4\1\uffff\10\4\1\uffff\1\3\1\uffff"+
            "\1\4\3\uffff\3\4\2\uffff\5\4\1\uffff\1\4\3\uffff\3\4\6\uffff"+
            "\1\4\1\uffff\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\6\4\2\uffff"+
            "\2\4\2\uffff\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3\uffff"+
            "\1\4\7\uffff\1\4\5\uffff\1\4\1\uffff\3\4\1\uffff\2\4\1\uffff"+
            "\1\4\3\uffff\1\4\1\uffff\2\4\1\uffff\1\4\4\uffff\2\4\1\uffff"+
            "\10\4\2\uffff\2\4\1\uffff\2\4\4\uffff\1\4\11\uffff\1\4\1\uffff"+
            "\2\4\1\uffff\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\2\uffff\2\4\2\uffff"+
            "\3\4\4\uffff\1\4\1\uffff\5\4\1\uffff\1\4\3\uffff\1\4\1\uffff"+
            "\3\4\1\uffff\1\4\4\uffff\4\4\1\uffff\10\4\1\uffff\1\3\1\uffff"+
            "\1\4\3\uffff\3\4\2\uffff\5\4\1\uffff\1\4\3\uffff\3\4\6\uffff"+
            "\1\4\1\uffff\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\6\4\2\uffff"+
            "\2\4\2\uffff\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3\uffff"+
            "\1\4\7\uffff\1\4\5\uffff\1\4\1\uffff\3\4\1\uffff\2\4\1\uffff"+
            "\1\4\3\uffff\1\4\1\uffff\2\4\1\uffff\1\4\4\uffff\2\4\1\uffff"+
            "\10\4\2\uffff\2\4\1\uffff\2\4\4\uffff\1\4\11\uffff\1\4\1\uffff"+
            "\2\4\1\uffff\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "191:13: (database_name= id DOT )?";
        }
    }
    static final String DFA33_eotS =
        "\75\uffff";
    static final String DFA33_eofS =
        "\2\2\73\uffff";
    static final String DFA33_minS =
        "\1\5\1\52\73\uffff";
    static final String DFA33_maxS =
        "\2\u00e9\73\uffff";
    static final String DFA33_acceptS =
        "\2\uffff\1\2\55\uffff\1\1\14\uffff";
    static final String DFA33_specialS =
        "\75\uffff}>";
    static final String[] DFA33_transitionS = {
            "\3\2\1\uffff\5\2\1\uffff\3\2\1\uffff\2\2\2\uffff\3\2\4\uffff"+
            "\1\2\1\uffff\4\2\1\1\1\uffff\1\2\3\uffff\1\2\1\uffff\3\2\1\uffff"+
            "\1\2\4\uffff\4\2\1\uffff\10\2\2\uffff\2\2\3\uffff\12\2\1\uffff"+
            "\1\2\3\uffff\3\2\3\uffff\4\2\1\uffff\1\2\1\uffff\1\2\12\uffff"+
            "\12\2\2\uffff\2\2\2\uffff\2\2\3\uffff\1\2\1\uffff\1\2\1\uffff"+
            "\5\2\4\uffff\2\2\1\uffff\5\2\1\uffff\1\2\1\uffff\3\2\1\uffff"+
            "\2\2\1\uffff\1\2\1\uffff\6\2\1\uffff\1\2\4\uffff\13\2\2\uffff"+
            "\2\2\1\uffff\5\2\1\uffff\1\2\11\uffff\1\2\1\uffff\2\2\1\uffff"+
            "\3\2\4\uffff\4\2\1\uffff\4\2\1\uffff\2\2",
            "\1\2\44\uffff\1\2\12\uffff\1\2\6\uffff\1\2\3\uffff\1\60\26"+
            "\uffff\1\2\20\uffff\1\2\24\uffff\1\2\31\uffff\1\2\5\uffff\1"+
            "\2\33\uffff\1\2\12\uffff\1\2",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "216:26: ( COLLATE ^collation_name= ID )?";
        }
    }
    static final String DFA44_eotS =
        "\u017e\uffff";
    static final String DFA44_eofS =
        "\3\uffff\1\1\1\uffff\4\1\3\uffff\1\23\u0171\uffff";
    static final String DFA44_minS =
        "\1\5\2\uffff\1\5\1\uffff\4\5\3\uffff\1\5\1\103\1\5\1\103\1\uffff"+
        "\1\5\1\103\u0136\uffff\1\5\64\uffff";
    static final String DFA44_maxS =
        "\1\u00e9\2\uffff\1\u00e9\1\uffff\4\u00e9\3\uffff\1\u00e9\1\u008f"+
        "\1\u00e9\1\u008f\1\uffff\1\u00e9\1\u008f\u0136\uffff\1\u00e9\64"+
        "\uffff";
    static final String DFA44_acceptS =
        "\1\uffff\1\1\7\uffff\1\2\6\uffff\1\7\2\uffff\1\3\u00f0\uffff\1\4"+
        "\60\uffff\1\6\1\uffff\1\5\27\uffff\1\10\24\uffff\1\11\31\uffff";
    static final String DFA44_specialS =
        "\u017e\uffff}>";
    static final String[] DFA44_transitionS = {
            "\3\23\1\uffff\2\23\1\uffff\2\23\1\uffff\2\23\1\uffff\1\11\2"+
            "\23\2\uffff\3\23\2\uffff\1\1\1\uffff\1\23\1\uffff\1\23\1\21"+
            "\1\15\2\23\1\11\1\23\5\uffff\3\23\1\uffff\1\23\4\uffff\1\23"+
            "\1\7\1\6\1\10\1\uffff\10\23\3\uffff\1\23\3\uffff\3\23\2\uffff"+
            "\3\23\1\17\1\23\1\uffff\1\23\1\1\2\uffff\3\23\6\uffff\1\23\1"+
            "\uffff\1\23\1\uffff\1\14\12\uffff\3\23\1\uffff\6\23\1\1\1\uffff"+
            "\2\23\2\uffff\1\23\4\uffff\1\23\1\uffff\1\23\1\uffff\1\23\3"+
            "\uffff\1\23\1\uffff\1\16\5\uffff\1\23\1\20\4\uffff\1\5\1\uffff"+
            "\3\23\1\uffff\2\23\1\uffff\1\23\3\uffff\1\23\1\uffff\2\23\1"+
            "\uffff\1\23\1\11\3\uffff\1\22\1\23\1\uffff\7\23\3\uffff\2\23"+
            "\2\uffff\1\23\4\uffff\1\3\11\uffff\1\23\1\uffff\2\23\1\uffff"+
            "\3\23\4\uffff\4\23\1\uffff\4\23\1\uffff\2\23",
            "",
            "",
            "\3\1\1\uffff\5\1\1\uffff\3\1\1\uffff\2\1\2\uffff\3\1\4\uffff"+
            "\1\1\1\uffff\5\1\1\uffff\1\1\3\uffff\1\1\1\uffff\3\1\1\uffff"+
            "\1\1\4\uffff\4\1\1\uffff\10\1\1\uffff\1\23\2\1\3\uffff\12\1"+
            "\1\uffff\1\1\3\uffff\3\1\3\uffff\4\1\1\uffff\1\1\1\uffff\1\1"+
            "\12\uffff\12\1\2\uffff\2\1\2\uffff\2\1\3\uffff\1\1\1\uffff\1"+
            "\1\1\uffff\5\1\4\uffff\2\1\1\uffff\5\1\1\uffff\1\1\1\uffff\3"+
            "\1\1\uffff\2\1\1\uffff\1\1\1\uffff\6\1\1\uffff\1\1\4\uffff\13"+
            "\1\2\uffff\2\1\1\uffff\5\1\1\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\2\1\1\uffff\3\1\4\uffff\4\1\1\uffff\4\1\1\uffff\2\1",
            "",
            "\3\1\1\uffff\5\1\1\uffff\3\1\1\uffff\2\1\2\uffff\3\1\4\uffff"+
            "\1\1\1\uffff\5\1\1\uffff\1\1\3\uffff\1\1\1\uffff\3\1\1\uffff"+
            "\1\1\4\uffff\4\1\1\uffff\10\1\1\uffff\1\23\2\1\3\uffff\12\1"+
            "\1\uffff\1\1\3\uffff\3\1\3\uffff\4\1\1\uffff\1\1\1\uffff\1\1"+
            "\12\uffff\12\1\2\uffff\2\1\2\uffff\2\1\3\uffff\1\1\1\uffff\1"+
            "\1\1\uffff\5\1\4\uffff\2\1\1\uffff\5\1\1\uffff\1\1\1\uffff\3"+
            "\1\1\uffff\2\1\1\uffff\1\1\1\uffff\6\1\1\uffff\1\1\4\uffff\13"+
            "\1\2\uffff\2\1\1\uffff\5\1\1\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\2\1\1\uffff\3\1\4\uffff\4\1\1\uffff\4\1\1\uffff\2\1",
            "\3\1\1\uffff\5\1\1\uffff\3\1\1\uffff\2\1\2\uffff\3\1\4\uffff"+
            "\1\1\1\uffff\5\1\1\uffff\1\1\3\uffff\1\1\1\uffff\3\1\1\uffff"+
            "\1\1\4\uffff\4\1\1\uffff\10\1\1\uffff\1\23\2\1\3\uffff\12\1"+
            "\1\uffff\1\1\3\uffff\3\1\3\uffff\4\1\1\uffff\1\1\1\uffff\1\1"+
            "\12\uffff\12\1\2\uffff\2\1\2\uffff\2\1\3\uffff\1\1\1\uffff\1"+
            "\1\1\uffff\5\1\4\uffff\2\1\1\uffff\5\1\1\uffff\1\1\1\uffff\3"+
            "\1\1\uffff\2\1\1\uffff\1\1\1\uffff\6\1\1\uffff\1\1\4\uffff\13"+
            "\1\2\uffff\2\1\1\uffff\5\1\1\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\2\1\1\uffff\3\1\4\uffff\4\1\1\uffff\4\1\1\uffff\2\1",
            "\3\1\1\uffff\5\1\1\uffff\3\1\1\uffff\2\1\2\uffff\3\1\4\uffff"+
            "\1\1\1\uffff\5\1\1\uffff\1\1\3\uffff\1\1\1\uffff\3\1\1\uffff"+
            "\1\1\4\uffff\4\1\1\uffff\10\1\1\uffff\1\23\2\1\3\uffff\12\1"+
            "\1\uffff\1\1\3\uffff\3\1\3\uffff\4\1\1\uffff\1\1\1\uffff\1\1"+
            "\12\uffff\12\1\2\uffff\2\1\2\uffff\2\1\3\uffff\1\1\1\uffff\1"+
            "\1\1\uffff\5\1\4\uffff\2\1\1\uffff\5\1\1\uffff\1\1\1\uffff\3"+
            "\1\1\uffff\2\1\1\uffff\1\1\1\uffff\6\1\1\uffff\1\1\4\uffff\13"+
            "\1\2\uffff\2\1\1\uffff\5\1\1\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\2\1\1\uffff\3\1\4\uffff\4\1\1\uffff\4\1\1\uffff\2\1",
            "\3\1\1\uffff\5\1\1\uffff\3\1\1\uffff\2\1\2\uffff\3\1\4\uffff"+
            "\1\1\1\uffff\5\1\1\uffff\1\1\3\uffff\1\1\1\uffff\3\1\1\uffff"+
            "\1\1\4\uffff\4\1\1\uffff\10\1\1\uffff\1\23\2\1\3\uffff\12\1"+
            "\1\uffff\1\1\3\uffff\3\1\3\uffff\4\1\1\uffff\1\1\1\uffff\1\1"+
            "\12\uffff\12\1\2\uffff\2\1\2\uffff\2\1\3\uffff\1\1\1\uffff\1"+
            "\1\1\uffff\5\1\4\uffff\2\1\1\uffff\5\1\1\uffff\1\1\1\uffff\3"+
            "\1\1\uffff\2\1\1\uffff\1\1\1\uffff\6\1\1\uffff\1\1\4\uffff\13"+
            "\1\2\uffff\2\1\1\uffff\5\1\1\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\2\1\1\uffff\3\1\4\uffff\4\1\1\uffff\4\1\1\uffff\2\1",
            "",
            "",
            "",
            "\3\23\1\uffff\5\23\1\uffff\3\23\1\uffff\2\23\2\uffff\3\23\4"+
            "\uffff\1\23\1\uffff\5\23\1\uffff\1\23\3\uffff\1\23\1\uffff\3"+
            "\23\1\uffff\1\23\4\uffff\4\23\1\uffff\10\23\1\uffff\3\23\3\uffff"+
            "\12\23\1\uffff\1\23\3\uffff\3\23\3\uffff\4\23\1\uffff\1\23\1"+
            "\uffff\1\23\12\uffff\12\23\2\uffff\2\23\2\uffff\2\23\3\uffff"+
            "\1\23\1\uffff\1\23\1\uffff\5\23\1\uffff\1\u0104\2\uffff\2\23"+
            "\1\uffff\5\23\1\uffff\1\23\1\uffff\3\23\1\uffff\2\23\1\uffff"+
            "\1\23\1\uffff\6\23\1\uffff\1\23\4\uffff\13\23\2\uffff\2\23\1"+
            "\uffff\5\23\1\uffff\1\23\11\uffff\1\23\1\uffff\2\23\1\uffff"+
            "\3\23\4\uffff\4\23\1\uffff\4\23\1\uffff\2\23",
            "\1\23\113\uffff\1\u0135",
            "\3\u0137\1\uffff\2\u0137\1\uffff\2\u0137\1\uffff\2\u0137\1"+
            "\uffff\3\u0137\2\uffff\3\u0137\2\uffff\1\u0137\1\uffff\1\u0137"+
            "\1\uffff\7\u0137\5\uffff\3\u0137\1\uffff\1\u0137\4\uffff\4\u0137"+
            "\1\uffff\10\u0137\3\uffff\1\u0137\3\uffff\3\u0137\2\uffff\5"+
            "\u0137\1\uffff\2\u0137\2\uffff\3\u0137\6\uffff\1\u0137\1\uffff"+
            "\1\u0137\1\uffff\1\u0137\12\uffff\3\u0137\1\uffff\7\u0137\1"+
            "\uffff\2\u0137\2\uffff\1\u0137\4\uffff\1\u0137\1\uffff\1\u0137"+
            "\1\uffff\1\u0137\3\uffff\1\u0137\1\uffff\1\u0137\3\uffff\1\u0137"+
            "\1\uffff\2\u0137\4\uffff\1\u0137\1\uffff\3\u0137\1\uffff\2\u0137"+
            "\1\uffff\1\u0137\3\uffff\4\u0137\1\uffff\2\u0137\3\uffff\2\u0137"+
            "\1\uffff\7\u0137\3\uffff\1\u0137\1\u0149\2\uffff\1\u0137\4\uffff"+
            "\1\u0137\11\uffff\1\u0137\1\uffff\6\u0137\4\uffff\4\u0137\1"+
            "\uffff\4\u0137\1\uffff\2\u0137",
            "\1\23\113\uffff\1\20",
            "",
            "\3\u014f\1\uffff\2\u014f\1\uffff\2\u014f\1\uffff\2\u014f\1"+
            "\uffff\3\u014f\2\uffff\3\u014f\2\uffff\1\u014f\1\uffff\1\u014f"+
            "\1\uffff\7\u014f\5\uffff\3\u014f\1\uffff\1\u014f\4\uffff\4\u014f"+
            "\1\uffff\10\u014f\1\uffff\1\23\1\uffff\1\u014f\3\uffff\3\u014f"+
            "\2\uffff\5\u014f\1\uffff\2\u014f\2\uffff\3\u014f\6\uffff\1\u014f"+
            "\1\uffff\1\u014f\1\uffff\1\u014f\12\uffff\3\u014f\1\uffff\7"+
            "\u014f\1\uffff\2\u014f\2\uffff\1\u014f\4\uffff\1\u014f\1\uffff"+
            "\1\u014f\1\uffff\1\u014f\3\uffff\1\u014f\1\uffff\1\u014f\3\uffff"+
            "\1\u014f\1\uffff\2\u014f\4\uffff\1\u014f\1\uffff\3\u014f\1\uffff"+
            "\2\u014f\1\uffff\1\u014f\3\uffff\4\u014f\1\uffff\2\u014f\3\uffff"+
            "\2\u014f\1\uffff\7\u014f\3\uffff\2\u014f\2\uffff\1\u014f\4\uffff"+
            "\1\u014f\11\uffff\1\u014f\1\uffff\6\u014f\4\uffff\4\u014f\1"+
            "\uffff\4\u014f\1\uffff\2\u014f",
            "\1\23\113\uffff\1\u0164",
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
            "",
            "",
            "",
            "",
            "\3\20\1\uffff\2\20\1\uffff\2\20\1\uffff\6\20\2\uffff\3\20\2"+
            "\uffff\1\20\1\uffff\1\20\1\uffff\7\20\5\uffff\3\20\1\uffff\1"+
            "\20\4\uffff\4\20\1\uffff\10\20\1\uffff\1\u0137\1\uffff\1\20"+
            "\3\uffff\3\20\2\uffff\5\20\1\uffff\2\20\2\uffff\3\20\6\uffff"+
            "\1\20\1\uffff\1\20\1\uffff\1\20\12\uffff\3\20\1\uffff\7\20\1"+
            "\uffff\2\20\2\uffff\1\20\4\uffff\1\20\1\uffff\1\20\1\uffff\1"+
            "\20\3\uffff\1\20\1\uffff\1\20\3\uffff\1\20\1\uffff\2\20\4\uffff"+
            "\1\20\1\uffff\3\20\1\uffff\2\20\1\uffff\1\20\3\uffff\4\20\1"+
            "\uffff\2\20\3\uffff\2\20\1\uffff\7\20\3\uffff\2\20\2\uffff\1"+
            "\20\4\uffff\1\20\11\uffff\1\20\1\uffff\6\20\4\uffff\4\20\1\uffff"+
            "\4\20\1\uffff\2\20",
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
            ""
    };

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "218:1: atom_expr : ( literal_value | bind_parameter | ( (database_name= id DOT )? table_name= id DOT )? column_name= ID -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) ) |name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN -> ^( FUNCTION_EXPRESSION $name ( DISTINCT )? ( $args)* ( ASTERISK )? ) | LPAREN ! expr RPAREN !| CAST ^ LPAREN ! expr AS ! type_name RPAREN !| ( ( NOT )? EXISTS )? LPAREN select_stmt RPAREN | CASE (case_expr= expr )? ( when_expr )+ ( ELSE else_expr= expr )? END -> ^( CASE ( $case_expr)? ( when_expr )+ ( $else_expr)? ) | raise_function );";
        }
    }
    static final String DFA34_eotS =
        "\153\uffff";
    static final String DFA34_eofS =
        "\5\uffff\1\14\2\uffff\1\14\142\uffff";
    static final String DFA34_minS =
        "\1\5\2\103\3\5\2\uffff\1\5\142\uffff";
    static final String DFA34_maxS =
        "\1\u00e9\2\103\3\u00e9\2\uffff\1\u00e9\142\uffff";
    static final String DFA34_acceptS =
        "\6\uffff\1\1\5\uffff\1\2\136\uffff";
    static final String DFA34_specialS =
        "\153\uffff}>";
    static final String[] DFA34_transitionS = {
            "\3\2\1\uffff\2\2\1\uffff\2\2\1\uffff\2\2\2\uffff\2\2\2\uffff"+
            "\3\2\4\uffff\1\2\1\uffff\5\2\1\uffff\1\2\5\uffff\3\2\1\uffff"+
            "\1\2\4\uffff\4\2\1\uffff\10\2\3\uffff\1\2\3\uffff\3\2\2\uffff"+
            "\5\2\1\uffff\1\2\3\uffff\3\2\6\uffff\1\2\1\uffff\1\2\1\uffff"+
            "\1\1\12\uffff\3\2\1\uffff\6\2\2\uffff\2\2\2\uffff\1\2\4\uffff"+
            "\1\2\1\uffff\1\2\1\uffff\1\2\3\uffff\1\2\7\uffff\1\2\5\uffff"+
            "\1\2\1\uffff\3\2\1\uffff\2\2\1\uffff\1\2\3\uffff\1\2\1\uffff"+
            "\2\2\1\uffff\1\2\4\uffff\2\2\1\uffff\7\2\3\uffff\2\2\2\uffff"+
            "\1\2\4\uffff\1\1\11\uffff\1\2\1\uffff\2\2\1\uffff\3\2\4\uffff"+
            "\4\2\1\uffff\4\2\1\uffff\2\2",
            "\1\3",
            "\1\4",
            "\3\6\1\uffff\2\6\1\uffff\2\6\1\uffff\2\6\2\uffff\2\6\2\uffff"+
            "\3\6\4\uffff\1\6\1\uffff\5\6\1\uffff\1\6\5\uffff\3\6\1\uffff"+
            "\1\6\4\uffff\4\6\1\uffff\10\6\3\uffff\1\6\3\uffff\3\6\2\uffff"+
            "\5\6\1\uffff\1\6\3\uffff\3\6\6\uffff\1\6\1\uffff\1\6\1\uffff"+
            "\1\5\12\uffff\3\6\1\uffff\6\6\2\uffff\2\6\2\uffff\1\6\4\uffff"+
            "\1\6\1\uffff\1\6\1\uffff\1\6\3\uffff\1\6\7\uffff\1\6\5\uffff"+
            "\1\6\1\uffff\3\6\1\uffff\2\6\1\uffff\1\6\3\uffff\1\6\1\uffff"+
            "\2\6\1\uffff\1\6\4\uffff\2\6\1\uffff\7\6\3\uffff\2\6\2\uffff"+
            "\1\6\4\uffff\1\6\11\uffff\1\6\1\uffff\2\6\1\uffff\3\6\4\uffff"+
            "\4\6\1\uffff\4\6\1\uffff\2\6",
            "\3\6\1\uffff\2\6\1\uffff\2\6\1\uffff\2\6\2\uffff\2\6\2\uffff"+
            "\3\6\4\uffff\1\6\1\uffff\5\6\1\uffff\1\6\5\uffff\3\6\1\uffff"+
            "\1\6\4\uffff\4\6\1\uffff\10\6\3\uffff\1\6\3\uffff\3\6\2\uffff"+
            "\5\6\1\uffff\1\6\3\uffff\3\6\6\uffff\1\6\1\uffff\1\6\1\uffff"+
            "\1\10\12\uffff\3\6\1\uffff\6\6\2\uffff\2\6\2\uffff\1\6\4\uffff"+
            "\1\6\1\uffff\1\6\1\uffff\1\6\3\uffff\1\6\7\uffff\1\6\5\uffff"+
            "\1\6\1\uffff\3\6\1\uffff\2\6\1\uffff\1\6\3\uffff\1\6\1\uffff"+
            "\2\6\1\uffff\1\6\4\uffff\2\6\1\uffff\7\6\3\uffff\2\6\2\uffff"+
            "\1\6\4\uffff\1\6\11\uffff\1\6\1\uffff\2\6\1\uffff\3\6\4\uffff"+
            "\4\6\1\uffff\4\6\1\uffff\2\6",
            "\3\14\1\uffff\5\14\1\uffff\3\14\1\uffff\2\14\2\uffff\3\14\4"+
            "\uffff\1\14\1\uffff\5\14\1\uffff\1\14\3\uffff\1\14\1\uffff\3"+
            "\14\1\uffff\1\14\4\uffff\4\14\1\uffff\10\14\1\uffff\1\6\2\14"+
            "\3\uffff\12\14\1\uffff\1\14\3\uffff\3\14\3\uffff\4\14\1\uffff"+
            "\1\14\1\uffff\1\14\12\uffff\12\14\2\uffff\2\14\2\uffff\2\14"+
            "\3\uffff\1\14\1\uffff\1\14\1\uffff\5\14\4\uffff\2\14\1\uffff"+
            "\5\14\1\uffff\1\14\1\uffff\3\14\1\uffff\2\14\1\uffff\1\14\1"+
            "\uffff\6\14\1\uffff\1\14\4\uffff\13\14\2\uffff\2\14\1\uffff"+
            "\5\14\1\uffff\1\14\11\uffff\1\14\1\uffff\2\14\1\uffff\3\14\4"+
            "\uffff\4\14\1\uffff\4\14\1\uffff\2\14",
            "",
            "",
            "\3\14\1\uffff\5\14\1\uffff\3\14\1\uffff\2\14\2\uffff\3\14\4"+
            "\uffff\1\14\1\uffff\5\14\1\uffff\1\14\3\uffff\1\14\1\uffff\3"+
            "\14\1\uffff\1\14\4\uffff\4\14\1\uffff\10\14\1\uffff\1\6\2\14"+
            "\3\uffff\12\14\1\uffff\1\14\3\uffff\3\14\3\uffff\4\14\1\uffff"+
            "\1\14\1\uffff\1\14\12\uffff\12\14\2\uffff\2\14\2\uffff\2\14"+
            "\3\uffff\1\14\1\uffff\1\14\1\uffff\5\14\4\uffff\2\14\1\uffff"+
            "\5\14\1\uffff\1\14\1\uffff\3\14\1\uffff\2\14\1\uffff\1\14\1"+
            "\uffff\6\14\1\uffff\1\14\4\uffff\13\14\2\uffff\2\14\1\uffff"+
            "\5\14\1\uffff\1\14\11\uffff\1\14\1\uffff\2\14\1\uffff\3\14\4"+
            "\uffff\4\14\1\uffff\4\14\1\uffff\2\14",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "221:6: (database_name= id DOT )?";
        }
    }
    static final String DFA71_eotS =
        "\104\uffff";
    static final String DFA71_eofS =
        "\104\uffff";
    static final String DFA71_minS =
        "\3\5\101\uffff";
    static final String DFA71_maxS =
        "\3\u00e9\101\uffff";
    static final String DFA71_acceptS =
        "\3\uffff\1\3\24\uffff\1\1\25\uffff\1\2\25\uffff";
    static final String DFA71_specialS =
        "\104\uffff}>";
    static final String[] DFA71_transitionS = {
            "\3\3\1\uffff\1\1\1\3\1\uffff\2\3\1\uffff\6\3\2\uffff\3\3\2\uffff"+
            "\1\3\1\uffff\1\3\1\uffff\7\3\5\uffff\3\3\1\uffff\1\3\4\uffff"+
            "\4\3\1\uffff\7\3\1\2\3\uffff\1\3\3\uffff\3\3\2\uffff\5\3\1\uffff"+
            "\2\3\2\uffff\3\3\6\uffff\1\3\1\uffff\1\3\1\uffff\1\3\12\uffff"+
            "\3\3\1\uffff\7\3\1\uffff\2\3\2\uffff\1\3\4\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\1\3\3\uffff\1\3\1\uffff\1\3\3\uffff\1\3\1\uffff"+
            "\2\3\4\uffff\1\3\1\uffff\3\3\1\uffff\2\3\1\uffff\1\3\3\uffff"+
            "\4\3\1\uffff\2\3\3\uffff\2\3\1\uffff\7\3\3\uffff\2\3\2\uffff"+
            "\1\3\4\uffff\1\3\11\uffff\1\3\1\uffff\6\3\4\uffff\4\3\1\uffff"+
            "\4\3\1\uffff\2\3",
            "\3\30\1\uffff\2\30\1\uffff\2\30\1\uffff\6\30\2\uffff\3\30\2"+
            "\uffff\1\30\1\uffff\1\30\1\uffff\7\30\5\uffff\3\30\1\uffff\1"+
            "\30\4\uffff\4\30\1\uffff\10\30\1\uffff\1\3\1\uffff\1\30\3\uffff"+
            "\3\30\2\uffff\5\30\1\uffff\2\30\2\uffff\3\30\6\uffff\1\30\1"+
            "\uffff\1\30\1\uffff\1\30\12\uffff\3\30\1\uffff\7\30\1\uffff"+
            "\2\30\2\uffff\1\30\4\uffff\1\30\1\uffff\1\30\1\uffff\1\30\3"+
            "\uffff\1\30\1\uffff\1\30\3\uffff\1\30\1\uffff\2\30\4\uffff\1"+
            "\30\1\uffff\3\30\1\uffff\2\30\1\uffff\1\30\3\uffff\4\30\1\uffff"+
            "\2\30\3\uffff\2\30\1\uffff\7\30\3\uffff\2\30\2\uffff\1\30\4"+
            "\uffff\1\30\11\uffff\1\30\1\uffff\6\30\4\uffff\4\30\1\uffff"+
            "\4\30\1\uffff\2\30",
            "\3\56\1\uffff\2\56\1\uffff\2\56\1\uffff\6\56\2\uffff\3\56\2"+
            "\uffff\1\56\1\uffff\1\56\1\uffff\7\56\5\uffff\3\56\1\uffff\1"+
            "\56\4\uffff\4\56\1\uffff\10\56\1\uffff\1\3\1\uffff\1\56\3\uffff"+
            "\3\56\2\uffff\5\56\1\uffff\2\56\2\uffff\3\56\6\uffff\1\56\1"+
            "\uffff\1\56\1\uffff\1\56\12\uffff\3\56\1\uffff\7\56\1\uffff"+
            "\2\56\2\uffff\1\56\4\uffff\1\56\1\uffff\1\56\1\uffff\1\56\3"+
            "\uffff\1\56\1\uffff\1\56\3\uffff\1\56\1\uffff\2\56\4\uffff\1"+
            "\56\1\uffff\3\56\1\uffff\2\56\1\uffff\1\56\3\uffff\4\56\1\uffff"+
            "\2\56\3\uffff\2\56\1\uffff\7\56\3\uffff\2\56\2\uffff\1\56\4"+
            "\uffff\1\56\11\uffff\1\56\1\uffff\6\56\4\uffff\4\56\1\uffff"+
            "\4\56\1\uffff\2\56",
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
            ""
    };

    static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
    static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
    static final char[] DFA71_min = DFA.unpackEncodedStringToUnsignedChars(DFA71_minS);
    static final char[] DFA71_max = DFA.unpackEncodedStringToUnsignedChars(DFA71_maxS);
    static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
    static final short[] DFA71_special = DFA.unpackEncodedString(DFA71_specialS);
    static final short[][] DFA71_transition;

    static {
        int numStates = DFA71_transitionS.length;
        DFA71_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
        }
    }

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = DFA71_eot;
            this.eof = DFA71_eof;
            this.min = DFA71_min;
            this.max = DFA71_max;
            this.accept = DFA71_accept;
            this.special = DFA71_special;
            this.transition = DFA71_transition;
        }
        public String getDescription() {
            return "311:10: ( ALL | DISTINCT )?";
        }
    }
    static final String DFA80_eotS =
        "\u0126\uffff";
    static final String DFA80_eofS =
        "\2\uffff\2\4\2\uffff\1\4\1\uffff\3\4\u011b\uffff";
    static final String DFA80_minS =
        "\1\5\1\uffff\2\5\2\uffff\1\5\1\uffff\3\5\1\103\4\uffff\1\103\1\uffff"+
        "\1\5\2\103\1\uffff\1\5\40\uffff\1\5\41\uffff\1\5\40\uffff\1\5\40"+
        "\uffff\1\5\40\uffff\1\5\41\uffff\2\5\1\uffff\1\5\26\uffff\2\5\54"+
        "\uffff";
    static final String DFA80_maxS =
        "\1\u00e9\1\uffff\2\u00e9\2\uffff\1\u00e9\1\uffff\3\u00e9\1\u008f"+
        "\4\uffff\1\u008f\1\uffff\1\u00e9\1\u008f\1\103\1\uffff\1\u00e9\40"+
        "\uffff\1\u00e9\41\uffff\1\u00e9\40\uffff\1\u00e9\40\uffff\1\u00e9"+
        "\40\uffff\1\u00e9\41\uffff\2\u00e9\1\uffff\1\u00e9\26\uffff\2\u00e9"+
        "\54\uffff";
    static final String DFA80_acceptS =
        "\1\uffff\1\1\2\uffff\1\3\u00f5\uffff\1\2\53\uffff";
    static final String DFA80_specialS =
        "\u0126\uffff}>";
    static final String[] DFA80_transitionS = {
            "\3\24\1\uffff\2\24\1\uffff\2\24\1\uffff\2\24\1\1\1\4\2\24\2"+
            "\uffff\3\24\2\uffff\1\4\1\uffff\1\24\1\uffff\1\24\1\22\1\13"+
            "\2\24\1\4\1\24\5\uffff\3\24\1\uffff\1\24\4\uffff\1\24\1\11\1"+
            "\10\1\12\1\uffff\10\24\3\uffff\1\24\3\uffff\3\24\2\uffff\3\24"+
            "\1\20\1\24\1\uffff\1\24\1\4\2\uffff\3\24\6\uffff\1\24\1\uffff"+
            "\1\24\1\uffff\1\6\12\uffff\3\24\1\uffff\6\24\1\4\1\uffff\2\24"+
            "\2\uffff\1\24\4\uffff\1\24\1\uffff\1\24\1\uffff\1\24\3\uffff"+
            "\1\24\1\uffff\1\4\3\uffff\1\4\1\uffff\1\24\1\4\4\uffff\1\3\1"+
            "\uffff\3\24\1\uffff\2\24\1\uffff\1\24\3\uffff\1\24\1\4\2\24"+
            "\1\uffff\1\24\1\4\3\uffff\1\23\1\24\1\uffff\7\24\3\uffff\2\24"+
            "\2\uffff\1\24\4\uffff\1\2\11\uffff\1\24\1\uffff\2\24\1\4\3\24"+
            "\4\uffff\4\24\1\uffff\4\24\1\uffff\2\24",
            "",
            "\3\4\1\uffff\5\4\1\uffff\3\4\1\uffff\2\4\2\uffff\3\4\4\uffff"+
            "\1\4\1\uffff\5\4\1\uffff\1\4\3\uffff\1\4\1\uffff\3\4\1\uffff"+
            "\1\4\4\uffff\4\4\1\uffff\10\4\1\uffff\1\26\2\4\3\uffff\12\4"+
            "\1\uffff\1\4\3\uffff\3\4\3\uffff\4\4\1\uffff\1\4\1\uffff\1\4"+
            "\12\uffff\12\4\2\uffff\2\4\2\uffff\2\4\3\uffff\1\4\1\uffff\1"+
            "\4\1\uffff\5\4\4\uffff\2\4\1\uffff\5\4\1\uffff\1\4\1\uffff\3"+
            "\4\1\uffff\2\4\1\uffff\1\4\1\uffff\6\4\1\uffff\1\4\4\uffff\13"+
            "\4\2\uffff\2\4\1\uffff\5\4\1\uffff\1\4\11\uffff\1\4\1\uffff"+
            "\2\4\1\uffff\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
            "\3\4\1\uffff\5\4\1\uffff\3\4\1\uffff\2\4\2\uffff\3\4\4\uffff"+
            "\1\4\1\uffff\5\4\1\uffff\1\4\3\uffff\1\4\1\uffff\3\4\1\uffff"+
            "\1\4\4\uffff\4\4\1\uffff\10\4\1\uffff\1\67\2\4\3\uffff\12\4"+
            "\1\uffff\1\4\3\uffff\3\4\3\uffff\4\4\1\uffff\1\4\1\uffff\1\4"+
            "\12\uffff\12\4\2\uffff\2\4\2\uffff\2\4\3\uffff\1\4\1\uffff\1"+
            "\4\1\uffff\5\4\4\uffff\2\4\1\uffff\5\4\1\uffff\1\4\1\uffff\3"+
            "\4\1\uffff\2\4\1\uffff\1\4\1\uffff\6\4\1\uffff\1\4\4\uffff\13"+
            "\4\2\uffff\2\4\1\uffff\5\4\1\uffff\1\4\11\uffff\1\4\1\uffff"+
            "\2\4\1\uffff\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
            "",
            "",
            "\3\4\1\uffff\5\4\1\uffff\3\4\1\uffff\2\4\2\uffff\3\4\4\uffff"+
            "\1\4\1\uffff\5\4\1\uffff\1\4\3\uffff\1\4\1\uffff\3\4\1\uffff"+
            "\1\4\4\uffff\4\4\1\uffff\10\4\1\uffff\1\131\2\4\3\uffff\12\4"+
            "\1\uffff\1\4\3\uffff\3\4\3\uffff\4\4\1\uffff\1\4\1\uffff\1\4"+
            "\12\uffff\12\4\2\uffff\2\4\2\uffff\2\4\3\uffff\1\4\1\uffff\1"+
            "\4\1\uffff\5\4\1\uffff\1\4\2\uffff\2\4\1\uffff\5\4\1\uffff\1"+
            "\4\1\uffff\3\4\1\uffff\2\4\1\uffff\1\4\1\uffff\6\4\1\uffff\1"+
            "\4\4\uffff\13\4\2\uffff\2\4\1\uffff\5\4\1\uffff\1\4\11\uffff"+
            "\1\4\1\uffff\2\4\1\uffff\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff"+
            "\2\4",
            "",
            "\3\4\1\uffff\5\4\1\uffff\3\4\1\uffff\2\4\2\uffff\3\4\4\uffff"+
            "\1\4\1\uffff\5\4\1\uffff\1\4\3\uffff\1\4\1\uffff\3\4\1\uffff"+
            "\1\4\4\uffff\4\4\1\uffff\10\4\1\uffff\1\172\2\4\3\uffff\12\4"+
            "\1\uffff\1\4\3\uffff\3\4\3\uffff\4\4\1\uffff\1\4\1\uffff\1\4"+
            "\12\uffff\12\4\2\uffff\2\4\2\uffff\2\4\3\uffff\1\4\1\uffff\1"+
            "\4\1\uffff\5\4\4\uffff\2\4\1\uffff\5\4\1\uffff\1\4\1\uffff\3"+
            "\4\1\uffff\2\4\1\uffff\1\4\1\uffff\6\4\1\uffff\1\4\4\uffff\13"+
            "\4\2\uffff\2\4\1\uffff\5\4\1\uffff\1\4\11\uffff\1\4\1\uffff"+
            "\2\4\1\uffff\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
            "\3\4\1\uffff\5\4\1\uffff\3\4\1\uffff\2\4\2\uffff\3\4\4\uffff"+
            "\1\4\1\uffff\5\4\1\uffff\1\4\3\uffff\1\4\1\uffff\3\4\1\uffff"+
            "\1\4\4\uffff\4\4\1\uffff\10\4\1\uffff\1\u009b\2\4\3\uffff\12"+
            "\4\1\uffff\1\4\3\uffff\3\4\3\uffff\4\4\1\uffff\1\4\1\uffff\1"+
            "\4\12\uffff\12\4\2\uffff\2\4\2\uffff\2\4\3\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\5\4\4\uffff\2\4\1\uffff\5\4\1\uffff\1\4\1\uffff"+
            "\3\4\1\uffff\2\4\1\uffff\1\4\1\uffff\6\4\1\uffff\1\4\4\uffff"+
            "\13\4\2\uffff\2\4\1\uffff\5\4\1\uffff\1\4\11\uffff\1\4\1\uffff"+
            "\2\4\1\uffff\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
            "\3\4\1\uffff\5\4\1\uffff\3\4\1\uffff\2\4\2\uffff\3\4\4\uffff"+
            "\1\4\1\uffff\5\4\1\uffff\1\4\3\uffff\1\4\1\uffff\3\4\1\uffff"+
            "\1\4\4\uffff\4\4\1\uffff\10\4\1\uffff\1\u00bc\2\4\3\uffff\12"+
            "\4\1\uffff\1\4\3\uffff\3\4\3\uffff\4\4\1\uffff\1\4\1\uffff\1"+
            "\4\12\uffff\12\4\2\uffff\2\4\2\uffff\2\4\3\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\5\4\4\uffff\2\4\1\uffff\5\4\1\uffff\1\4\1\uffff"+
            "\3\4\1\uffff\2\4\1\uffff\1\4\1\uffff\6\4\1\uffff\1\4\4\uffff"+
            "\13\4\2\uffff\2\4\1\uffff\5\4\1\uffff\1\4\11\uffff\1\4\1\uffff"+
            "\2\4\1\uffff\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
            "\1\u00de\113\uffff\1\4",
            "",
            "",
            "",
            "",
            "\1\u00df\113\uffff\1\4",
            "",
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\1\uffff\3\4\2\uffff"+
            "\3\4\2\uffff\1\4\1\uffff\1\4\1\uffff\7\4\5\uffff\3\4\1\uffff"+
            "\1\4\4\uffff\4\4\1\uffff\10\4\1\uffff\1\u00e1\1\uffff\1\4\3"+
            "\uffff\3\4\2\uffff\5\4\1\uffff\2\4\2\uffff\3\4\6\uffff\1\4\1"+
            "\uffff\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\7\4\1\uffff\2\4"+
            "\2\uffff\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3\uffff\1\4"+
            "\1\uffff\1\4\3\uffff\1\4\1\uffff\2\4\4\uffff\1\4\1\uffff\3\4"+
            "\1\uffff\2\4\1\uffff\1\4\3\uffff\4\4\1\uffff\2\4\3\uffff\2\4"+
            "\1\uffff\7\4\3\uffff\2\4\2\uffff\1\4\4\uffff\1\4\11\uffff\1"+
            "\4\1\uffff\6\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
            "\1\u00f8\113\uffff\1\4",
            "\1\u00f9",
            "",
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\1\u00fa\1\uffff\2"+
            "\4\2\uffff\3\4\4\uffff\1\4\1\uffff\5\4\1\uffff\1\4\5\uffff\3"+
            "\4\1\uffff\1\4\4\uffff\4\4\1\uffff\10\4\3\uffff\1\4\3\uffff"+
            "\3\4\2\uffff\5\4\1\uffff\1\4\3\uffff\3\4\6\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\6\4\2\uffff\2\4\2\uffff"+
            "\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3\uffff\1\4\7\uffff"+
            "\1\4\5\uffff\1\4\1\uffff\3\4\1\uffff\2\4\1\uffff\1\4\3\uffff"+
            "\1\4\1\uffff\2\4\1\uffff\1\4\4\uffff\2\4\1\uffff\7\4\3\uffff"+
            "\2\4\2\uffff\1\4\4\uffff\1\4\11\uffff\1\4\1\uffff\2\4\1\uffff"+
            "\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
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
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\1\u00fa\1\uffff\2"+
            "\4\2\uffff\3\4\4\uffff\1\4\1\uffff\5\4\1\uffff\1\4\5\uffff\3"+
            "\4\1\uffff\1\4\4\uffff\4\4\1\uffff\10\4\3\uffff\1\4\3\uffff"+
            "\3\4\2\uffff\5\4\1\uffff\1\4\3\uffff\3\4\6\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\6\4\2\uffff\2\4\2\uffff"+
            "\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3\uffff\1\4\7\uffff"+
            "\1\4\5\uffff\1\4\1\uffff\3\4\1\uffff\2\4\1\uffff\1\4\3\uffff"+
            "\1\4\1\uffff\2\4\1\uffff\1\4\4\uffff\2\4\1\uffff\7\4\3\uffff"+
            "\2\4\2\uffff\1\4\4\uffff\1\4\11\uffff\1\4\1\uffff\2\4\1\uffff"+
            "\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
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
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\1\u00fa\1\uffff\2"+
            "\4\2\uffff\3\4\4\uffff\1\4\1\uffff\5\4\1\uffff\1\4\5\uffff\3"+
            "\4\1\uffff\1\4\4\uffff\4\4\1\uffff\10\4\3\uffff\1\4\3\uffff"+
            "\3\4\2\uffff\5\4\1\uffff\1\4\3\uffff\3\4\6\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\6\4\2\uffff\2\4\2\uffff"+
            "\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3\uffff\1\4\7\uffff"+
            "\1\4\5\uffff\1\4\1\uffff\3\4\1\uffff\2\4\1\uffff\1\4\3\uffff"+
            "\1\4\1\uffff\2\4\1\uffff\1\4\4\uffff\2\4\1\uffff\7\4\3\uffff"+
            "\2\4\2\uffff\1\4\4\uffff\1\4\11\uffff\1\4\1\uffff\2\4\1\uffff"+
            "\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
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
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\1\u00fa\1\uffff\2"+
            "\4\2\uffff\3\4\4\uffff\1\4\1\uffff\5\4\1\uffff\1\4\5\uffff\3"+
            "\4\1\uffff\1\4\4\uffff\4\4\1\uffff\10\4\3\uffff\1\4\3\uffff"+
            "\3\4\2\uffff\5\4\1\uffff\1\4\3\uffff\3\4\6\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\6\4\2\uffff\2\4\2\uffff"+
            "\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3\uffff\1\4\7\uffff"+
            "\1\4\5\uffff\1\4\1\uffff\3\4\1\uffff\2\4\1\uffff\1\4\3\uffff"+
            "\1\4\1\uffff\2\4\1\uffff\1\4\4\uffff\2\4\1\uffff\7\4\3\uffff"+
            "\2\4\2\uffff\1\4\4\uffff\1\4\11\uffff\1\4\1\uffff\2\4\1\uffff"+
            "\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
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
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\1\u00fa\1\uffff\2"+
            "\4\2\uffff\3\4\4\uffff\1\4\1\uffff\5\4\1\uffff\1\4\5\uffff\3"+
            "\4\1\uffff\1\4\4\uffff\4\4\1\uffff\10\4\3\uffff\1\4\3\uffff"+
            "\3\4\2\uffff\5\4\1\uffff\1\4\3\uffff\3\4\6\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\6\4\2\uffff\2\4\2\uffff"+
            "\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3\uffff\1\4\7\uffff"+
            "\1\4\5\uffff\1\4\1\uffff\3\4\1\uffff\2\4\1\uffff\1\4\3\uffff"+
            "\1\4\1\uffff\2\4\1\uffff\1\4\4\uffff\2\4\1\uffff\7\4\3\uffff"+
            "\2\4\2\uffff\1\4\4\uffff\1\4\11\uffff\1\4\1\uffff\2\4\1\uffff"+
            "\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
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
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\1\u00fa\1\uffff\2"+
            "\4\2\uffff\3\4\4\uffff\1\4\1\uffff\5\4\1\uffff\1\4\5\uffff\3"+
            "\4\1\uffff\1\4\4\uffff\4\4\1\uffff\10\4\3\uffff\1\4\3\uffff"+
            "\3\4\2\uffff\5\4\1\uffff\1\4\3\uffff\3\4\6\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\6\4\2\uffff\2\4\2\uffff"+
            "\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3\uffff\1\4\7\uffff"+
            "\1\4\5\uffff\1\4\1\uffff\3\4\1\uffff\2\4\1\uffff\1\4\3\uffff"+
            "\1\4\1\uffff\2\4\1\uffff\1\4\4\uffff\2\4\1\uffff\7\4\3\uffff"+
            "\2\4\2\uffff\1\4\4\uffff\1\4\11\uffff\1\4\1\uffff\2\4\1\uffff"+
            "\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
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
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\1\u00fa\1\uffff\2"+
            "\4\2\uffff\3\4\4\uffff\1\4\1\uffff\5\4\1\uffff\1\4\5\uffff\3"+
            "\4\1\uffff\1\4\4\uffff\4\4\1\uffff\10\4\3\uffff\1\4\3\uffff"+
            "\3\4\2\uffff\5\4\1\uffff\1\4\3\uffff\3\4\6\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\6\4\2\uffff\2\4\2\uffff"+
            "\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3\uffff\1\4\7\uffff"+
            "\1\4\5\uffff\1\4\1\uffff\3\4\1\uffff\2\4\1\uffff\1\4\3\uffff"+
            "\1\4\1\uffff\2\4\1\uffff\1\4\4\uffff\2\4\1\uffff\7\4\3\uffff"+
            "\2\4\2\uffff\1\4\4\uffff\1\4\11\uffff\1\4\1\uffff\2\4\1\uffff"+
            "\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\1\u00fa\1\uffff\2"+
            "\4\2\uffff\3\4\4\uffff\1\4\1\uffff\5\4\1\uffff\1\4\5\uffff\3"+
            "\4\1\uffff\1\4\4\uffff\4\4\1\uffff\10\4\3\uffff\1\4\3\uffff"+
            "\3\4\2\uffff\5\4\1\uffff\1\4\3\uffff\3\4\6\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\6\4\2\uffff\2\4\2\uffff"+
            "\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3\uffff\1\4\7\uffff"+
            "\1\4\5\uffff\1\4\1\uffff\3\4\1\uffff\2\4\1\uffff\1\4\3\uffff"+
            "\1\4\1\uffff\2\4\1\uffff\1\4\4\uffff\2\4\1\uffff\7\4\3\uffff"+
            "\2\4\2\uffff\1\4\4\uffff\1\4\11\uffff\1\4\1\uffff\2\4\1\uffff"+
            "\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
            "",
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\1\u00fa\1\uffff\2"+
            "\4\2\uffff\3\4\4\uffff\1\4\1\uffff\5\4\1\uffff\1\4\5\uffff\3"+
            "\4\1\uffff\1\4\4\uffff\4\4\1\uffff\10\4\3\uffff\1\4\3\uffff"+
            "\3\4\2\uffff\5\4\1\uffff\1\4\3\uffff\3\4\6\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\6\4\2\uffff\2\4\2\uffff"+
            "\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3\uffff\1\4\7\uffff"+
            "\1\4\5\uffff\1\4\1\uffff\3\4\1\uffff\2\4\1\uffff\1\4\3\uffff"+
            "\1\4\1\uffff\2\4\1\uffff\1\4\4\uffff\2\4\1\uffff\7\4\3\uffff"+
            "\2\4\2\uffff\1\4\4\uffff\1\4\11\uffff\1\4\1\uffff\2\4\1\uffff"+
            "\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
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
            "",
            "",
            "",
            "",
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\1\u00fa\1\uffff\2"+
            "\4\2\uffff\3\4\4\uffff\1\4\1\uffff\5\4\1\uffff\1\4\5\uffff\3"+
            "\4\1\uffff\1\4\4\uffff\4\4\1\uffff\10\4\3\uffff\1\4\3\uffff"+
            "\3\4\2\uffff\5\4\1\uffff\1\4\3\uffff\3\4\6\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\6\4\2\uffff\2\4\2\uffff"+
            "\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3\uffff\1\4\7\uffff"+
            "\1\4\5\uffff\1\4\1\uffff\3\4\1\uffff\2\4\1\uffff\1\4\3\uffff"+
            "\1\4\1\uffff\2\4\1\uffff\1\4\4\uffff\2\4\1\uffff\7\4\3\uffff"+
            "\2\4\2\uffff\1\4\4\uffff\1\4\11\uffff\1\4\1\uffff\2\4\1\uffff"+
            "\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\1\u00fa\1\uffff\2"+
            "\4\2\uffff\3\4\4\uffff\1\4\1\uffff\5\4\1\uffff\1\4\5\uffff\3"+
            "\4\1\uffff\1\4\4\uffff\4\4\1\uffff\10\4\3\uffff\1\4\3\uffff"+
            "\3\4\2\uffff\5\4\1\uffff\1\4\3\uffff\3\4\6\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\6\4\2\uffff\2\4\2\uffff"+
            "\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3\uffff\1\4\7\uffff"+
            "\1\4\5\uffff\1\4\1\uffff\3\4\1\uffff\2\4\1\uffff\1\4\3\uffff"+
            "\1\4\1\uffff\2\4\1\uffff\1\4\4\uffff\2\4\1\uffff\7\4\3\uffff"+
            "\2\4\2\uffff\1\4\4\uffff\1\4\11\uffff\1\4\1\uffff\2\4\1\uffff"+
            "\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA80_eot = DFA.unpackEncodedString(DFA80_eotS);
    static final short[] DFA80_eof = DFA.unpackEncodedString(DFA80_eofS);
    static final char[] DFA80_min = DFA.unpackEncodedStringToUnsignedChars(DFA80_minS);
    static final char[] DFA80_max = DFA.unpackEncodedStringToUnsignedChars(DFA80_maxS);
    static final short[] DFA80_accept = DFA.unpackEncodedString(DFA80_acceptS);
    static final short[] DFA80_special = DFA.unpackEncodedString(DFA80_specialS);
    static final short[][] DFA80_transition;

    static {
        int numStates = DFA80_transitionS.length;
        DFA80_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA80_transition[i] = DFA.unpackEncodedString(DFA80_transitionS[i]);
        }
    }

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = DFA80_eot;
            this.eof = DFA80_eof;
            this.min = DFA80_min;
            this.max = DFA80_max;
            this.accept = DFA80_accept;
            this.special = DFA80_special;
            this.transition = DFA80_transition;
        }
        public String getDescription() {
            return "318:1: result_column : ( ASTERISK |table_name= id DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= id )? -> ^( ALIAS expr ( $column_alias)? ) );";
        }
    }
    static final String DFA79_eotS =
        "\u00dd\uffff";
    static final String DFA79_eofS =
        "\1\4\2\uffff\1\1\1\uffff\7\1\u00d1\uffff";
    static final String DFA79_minS =
        "\1\5\2\uffff\1\5\1\uffff\1\5\1\36\1\11\2\52\1\36\1\52\5\uffff\2"+
        "\5\1\36\1\11\2\103\1\36\1\103\10\uffff\2\5\1\36\1\11\2\103\1\36"+
        "\1\103\u00b4\uffff";
    static final String DFA79_maxS =
        "\1\u00e9\2\uffff\1\u00e9\1\uffff\7\u00e9\5\uffff\2\u00e9\1\103\3"+
        "\u00c0\1\103\1\172\10\uffff\2\u00e9\1\103\3\u00c0\1\103\1\172\u00b4"+
        "\uffff";
    static final String DFA79_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\u00d8\uffff";
    static final String DFA79_specialS =
        "\u00dd\uffff}>";
    static final String[] DFA79_transitionS = {
            "\3\1\1\uffff\2\1\1\uffff\2\1\1\uffff\2\1\2\uffff\2\1\2\uffff"+
            "\3\1\4\uffff\1\1\1\uffff\5\1\1\uffff\1\1\3\uffff\1\4\1\uffff"+
            "\3\1\1\uffff\1\1\4\uffff\4\1\1\uffff\10\1\3\uffff\1\1\3\uffff"+
            "\3\1\2\uffff\1\1\1\11\3\1\1\uffff\1\1\3\uffff\2\1\1\3\6\uffff"+
            "\1\6\1\uffff\1\1\1\uffff\1\1\12\uffff\3\1\1\uffff\6\1\2\uffff"+
            "\1\10\1\1\2\uffff\1\1\4\uffff\1\1\1\uffff\1\1\1\uffff\1\1\3"+
            "\uffff\1\13\7\uffff\1\1\5\uffff\1\1\1\uffff\3\1\1\uffff\1\1"+
            "\1\12\1\uffff\1\1\3\uffff\1\1\1\uffff\2\1\1\uffff\1\1\4\uffff"+
            "\2\1\1\uffff\7\1\1\4\2\uffff\2\1\1\uffff\1\4\1\1\4\uffff\1\1"+
            "\11\uffff\1\1\1\uffff\2\1\1\uffff\3\1\4\uffff\1\7\3\1\1\uffff"+
            "\4\1\1\uffff\1\1\1\5",
            "",
            "",
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\2\uffff\2\4\2\uffff"+
            "\3\4\4\uffff\1\4\1\uffff\5\4\1\uffff\1\4\3\uffff\1\1\1\uffff"+
            "\3\4\1\uffff\1\4\4\uffff\4\4\1\uffff\10\4\3\uffff\1\4\3\uffff"+
            "\3\4\2\uffff\1\4\1\26\3\4\1\uffff\1\4\3\uffff\2\4\1\21\6\uffff"+
            "\1\23\1\uffff\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\6\4\2\uffff"+
            "\1\25\1\4\2\uffff\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3"+
            "\uffff\1\30\1\uffff\1\4\5\uffff\1\4\5\uffff\1\4\1\uffff\3\4"+
            "\1\uffff\1\4\1\27\1\uffff\1\4\3\uffff\1\4\1\uffff\2\4\1\uffff"+
            "\1\4\4\uffff\2\4\1\uffff\7\4\1\1\2\uffff\2\4\1\uffff\1\1\1\4"+
            "\4\uffff\1\4\11\uffff\1\4\1\uffff\2\4\1\uffff\3\4\4\uffff\1"+
            "\24\3\4\1\uffff\4\4\1\uffff\1\4\1\22",
            "",
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\1\uffff\3\4\2\uffff"+
            "\3\4\2\uffff\1\4\1\uffff\1\4\1\uffff\7\4\3\uffff\1\1\1\uffff"+
            "\3\4\1\uffff\1\4\4\uffff\4\4\1\uffff\10\4\3\uffff\1\4\3\uffff"+
            "\3\4\2\uffff\1\4\1\46\3\4\1\uffff\2\4\2\uffff\2\4\1\41\6\uffff"+
            "\1\43\1\uffff\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\7\4\1\uffff"+
            "\1\45\1\4\2\uffff\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3"+
            "\uffff\1\50\1\uffff\1\4\3\uffff\1\4\1\uffff\2\4\4\uffff\1\4"+
            "\1\uffff\3\4\1\uffff\1\4\1\47\1\uffff\1\4\3\uffff\4\4\1\uffff"+
            "\2\4\3\uffff\2\4\1\uffff\7\4\1\1\2\uffff\2\4\1\uffff\1\1\1\4"+
            "\4\uffff\1\4\11\uffff\1\4\1\uffff\6\4\4\uffff\1\44\3\4\1\uffff"+
            "\4\4\1\uffff\1\4\1\42",
            "\1\4\13\uffff\1\1\44\uffff\1\1\12\uffff\1\1\6\uffff\1\1\32"+
            "\uffff\1\1\20\uffff\1\1\24\uffff\1\1\31\uffff\1\1\5\uffff\1"+
            "\1\33\uffff\1\1\12\uffff\1\1",
            "\1\4\40\uffff\1\1\44\uffff\1\1\12\uffff\1\1\6\uffff\1\1\32"+
            "\uffff\1\1\20\uffff\1\1\24\uffff\1\1\31\uffff\1\1\3\uffff\1"+
            "\4\1\uffff\1\1\33\uffff\1\1\12\uffff\1\1",
            "\1\1\44\uffff\1\1\12\uffff\1\1\6\uffff\1\1\32\uffff\1\1\20"+
            "\uffff\1\1\24\uffff\1\1\31\uffff\1\1\3\uffff\1\4\1\uffff\1\1"+
            "\33\uffff\1\1\12\uffff\1\1",
            "\1\1\44\uffff\1\1\12\uffff\1\1\6\uffff\1\1\32\uffff\1\1\20"+
            "\uffff\1\1\24\uffff\1\1\31\uffff\1\1\3\uffff\1\4\1\uffff\1\1"+
            "\33\uffff\1\1\12\uffff\1\1",
            "\1\4\13\uffff\1\1\44\uffff\1\1\12\uffff\1\1\6\uffff\1\1\32"+
            "\uffff\1\1\20\uffff\1\1\24\uffff\1\1\31\uffff\1\1\5\uffff\1"+
            "\1\33\uffff\1\1\12\uffff\1\1",
            "\1\1\44\uffff\1\1\12\uffff\1\1\6\uffff\1\1\30\uffff\1\4\1\uffff"+
            "\1\1\20\uffff\1\1\24\uffff\1\1\31\uffff\1\1\5\uffff\1\1\33\uffff"+
            "\1\1\12\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "\3\1\1\uffff\2\1\1\uffff\2\1\1\uffff\2\1\2\uffff\2\1\2\uffff"+
            "\3\1\4\uffff\1\1\1\uffff\5\1\1\uffff\1\1\5\uffff\3\1\1\uffff"+
            "\1\1\4\uffff\4\1\1\uffff\10\1\1\uffff\1\4\1\uffff\1\1\3\uffff"+
            "\3\1\2\uffff\5\1\1\uffff\1\1\3\uffff\3\1\6\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\1\1\12\uffff\3\1\1\uffff\6\1\2\uffff\2\1\2\uffff"+
            "\1\1\4\uffff\1\1\1\uffff\1\1\1\uffff\1\1\3\uffff\1\1\1\uffff"+
            "\1\1\5\uffff\1\1\5\uffff\1\1\1\uffff\3\1\1\uffff\2\1\1\uffff"+
            "\1\1\3\uffff\1\1\1\uffff\2\1\1\uffff\1\1\4\uffff\2\1\1\uffff"+
            "\7\1\3\uffff\2\1\2\uffff\1\1\4\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\2\1\1\uffff\3\1\4\uffff\4\1\1\uffff\4\1\1\uffff\2\1",
            "\3\1\1\uffff\2\1\1\uffff\2\1\1\uffff\2\1\1\uffff\3\1\2\uffff"+
            "\3\1\2\uffff\1\1\1\uffff\1\1\1\uffff\7\1\5\uffff\3\1\1\uffff"+
            "\1\1\4\uffff\4\1\1\uffff\10\1\1\uffff\1\4\1\uffff\1\1\3\uffff"+
            "\3\1\2\uffff\5\1\1\uffff\2\1\2\uffff\3\1\6\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\1\1\12\uffff\3\1\1\uffff\7\1\1\uffff\2\1\2\uffff"+
            "\1\1\4\uffff\1\1\1\uffff\1\1\1\uffff\1\1\3\uffff\1\1\1\uffff"+
            "\1\1\3\uffff\1\1\1\uffff\2\1\4\uffff\1\1\1\uffff\3\1\1\uffff"+
            "\2\1\1\uffff\1\1\3\uffff\4\1\1\uffff\2\1\3\uffff\2\1\1\uffff"+
            "\7\1\3\uffff\2\1\2\uffff\1\1\4\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\6\1\4\uffff\4\1\1\uffff\4\1\1\uffff\2\1",
            "\1\1\44\uffff\1\4",
            "\1\1\71\uffff\1\4\174\uffff\1\1",
            "\1\4\174\uffff\1\1",
            "\1\4\174\uffff\1\1",
            "\1\1\44\uffff\1\4",
            "\1\4\66\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\1\1\uffff\2\1\1\uffff\2\1\1\uffff\2\1\2\uffff\2\1\2\uffff"+
            "\3\1\4\uffff\1\1\1\uffff\5\1\1\uffff\1\1\5\uffff\3\1\1\uffff"+
            "\1\1\4\uffff\4\1\1\uffff\10\1\1\uffff\1\4\1\uffff\1\1\3\uffff"+
            "\3\1\2\uffff\5\1\1\uffff\1\1\3\uffff\3\1\6\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\1\1\12\uffff\3\1\1\uffff\6\1\2\uffff\2\1\2\uffff"+
            "\1\1\4\uffff\1\1\1\uffff\1\1\1\uffff\1\1\3\uffff\1\1\1\uffff"+
            "\1\1\5\uffff\1\1\5\uffff\1\1\1\uffff\3\1\1\uffff\2\1\1\uffff"+
            "\1\1\3\uffff\1\1\1\uffff\2\1\1\uffff\1\1\4\uffff\2\1\1\uffff"+
            "\7\1\3\uffff\2\1\2\uffff\1\1\4\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\2\1\1\uffff\3\1\4\uffff\4\1\1\uffff\4\1\1\uffff\2\1",
            "\3\1\1\uffff\2\1\1\uffff\2\1\1\uffff\2\1\1\uffff\3\1\2\uffff"+
            "\3\1\2\uffff\1\1\1\uffff\1\1\1\uffff\7\1\5\uffff\3\1\1\uffff"+
            "\1\1\4\uffff\4\1\1\uffff\10\1\1\uffff\1\4\1\uffff\1\1\3\uffff"+
            "\3\1\2\uffff\5\1\1\uffff\2\1\2\uffff\3\1\6\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\1\1\12\uffff\3\1\1\uffff\7\1\1\uffff\2\1\2\uffff"+
            "\1\1\4\uffff\1\1\1\uffff\1\1\1\uffff\1\1\3\uffff\1\1\1\uffff"+
            "\1\1\3\uffff\1\1\1\uffff\2\1\4\uffff\1\1\1\uffff\3\1\1\uffff"+
            "\2\1\1\uffff\1\1\3\uffff\4\1\1\uffff\2\1\3\uffff\2\1\1\uffff"+
            "\7\1\3\uffff\2\1\2\uffff\1\1\4\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\6\1\4\uffff\4\1\1\uffff\4\1\1\uffff\2\1",
            "\1\1\44\uffff\1\4",
            "\1\1\71\uffff\1\4\174\uffff\1\1",
            "\1\4\174\uffff\1\1",
            "\1\4\174\uffff\1\1",
            "\1\1\44\uffff\1\4",
            "\1\4\66\uffff\1\1",
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
            ""
    };

    static final short[] DFA79_eot = DFA.unpackEncodedString(DFA79_eotS);
    static final short[] DFA79_eof = DFA.unpackEncodedString(DFA79_eofS);
    static final char[] DFA79_min = DFA.unpackEncodedStringToUnsignedChars(DFA79_minS);
    static final char[] DFA79_max = DFA.unpackEncodedStringToUnsignedChars(DFA79_maxS);
    static final short[] DFA79_accept = DFA.unpackEncodedString(DFA79_acceptS);
    static final short[] DFA79_special = DFA.unpackEncodedString(DFA79_specialS);
    static final short[][] DFA79_transition;

    static {
        int numStates = DFA79_transitionS.length;
        DFA79_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA79_transition[i] = DFA.unpackEncodedString(DFA79_transitionS[i]);
        }
    }

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = DFA79_eot;
            this.eof = DFA79_eof;
            this.min = DFA79_min;
            this.max = DFA79_max;
            this.accept = DFA79_accept;
            this.special = DFA79_special;
            this.transition = DFA79_transition;
        }
        public String getDescription() {
            return "321:10: ( ( AS )? column_alias= id )?";
        }
    }
    static final String DFA78_eotS =
        "\u00df\uffff";
    static final String DFA78_eofS =
        "\1\uffff\1\2\3\uffff\1\4\1\uffff\7\4\u00d1\uffff";
    static final String DFA78_minS =
        "\2\5\3\uffff\1\5\1\uffff\1\5\1\36\1\11\2\52\1\36\1\52\5\uffff\2"+
        "\5\1\36\1\11\2\103\1\36\1\103\10\uffff\2\5\1\36\1\11\2\103\1\36"+
        "\1\103\u00b4\uffff";
    static final String DFA78_maxS =
        "\2\u00e9\3\uffff\1\u00e9\1\uffff\7\u00e9\5\uffff\2\u00e9\1\103\3"+
        "\u00c0\1\103\1\172\10\uffff\2\u00e9\1\103\3\u00c0\1\103\1\172\u00b4"+
        "\uffff";
    static final String DFA78_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\u00da\uffff";
    static final String DFA78_specialS =
        "\u00df\uffff}>";
    static final String[] DFA78_transitionS = {
            "\3\2\1\uffff\2\2\1\uffff\2\2\1\uffff\1\1\1\2\2\uffff\2\2\2\uffff"+
            "\3\2\4\uffff\1\2\1\uffff\5\2\1\uffff\1\2\5\uffff\3\2\1\uffff"+
            "\1\2\4\uffff\4\2\1\uffff\10\2\3\uffff\1\2\3\uffff\3\2\2\uffff"+
            "\5\2\1\uffff\1\2\3\uffff\3\2\6\uffff\1\2\1\uffff\1\2\1\uffff"+
            "\1\2\12\uffff\3\2\1\uffff\6\2\2\uffff\2\2\2\uffff\1\2\4\uffff"+
            "\1\2\1\uffff\1\2\1\uffff\1\2\3\uffff\1\2\7\uffff\1\2\5\uffff"+
            "\1\2\1\uffff\3\2\1\uffff\2\2\1\uffff\1\2\3\uffff\1\2\1\uffff"+
            "\2\2\1\uffff\1\2\4\uffff\2\2\1\uffff\7\2\3\uffff\2\2\2\uffff"+
            "\1\2\4\uffff\1\2\11\uffff\1\2\1\uffff\2\2\1\uffff\3\2\4\uffff"+
            "\4\2\1\uffff\4\2\1\uffff\2\2",
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\2\uffff\2\4\2\uffff"+
            "\3\4\4\uffff\1\4\1\uffff\5\4\1\uffff\1\4\3\uffff\1\2\1\uffff"+
            "\3\4\1\uffff\1\4\4\uffff\4\4\1\uffff\10\4\3\uffff\1\4\3\uffff"+
            "\3\4\2\uffff\1\4\1\13\3\4\1\uffff\1\4\3\uffff\2\4\1\5\6\uffff"+
            "\1\10\1\uffff\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\6\4\2\uffff"+
            "\1\12\1\4\2\uffff\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3"+
            "\uffff\1\15\7\uffff\1\4\5\uffff\1\4\1\uffff\3\4\1\uffff\1\4"+
            "\1\14\1\uffff\1\4\3\uffff\1\4\1\uffff\2\4\1\uffff\1\4\4\uffff"+
            "\2\4\1\uffff\7\4\1\2\2\uffff\2\4\1\uffff\1\2\1\4\4\uffff\1\4"+
            "\11\uffff\1\4\1\uffff\2\4\1\uffff\3\4\4\uffff\1\11\3\4\1\uffff"+
            "\4\4\1\uffff\1\4\1\7",
            "",
            "",
            "",
            "\3\2\1\uffff\2\2\1\uffff\2\2\1\uffff\2\2\2\uffff\2\2\2\uffff"+
            "\3\2\4\uffff\1\2\1\uffff\5\2\1\uffff\1\2\3\uffff\1\4\1\uffff"+
            "\3\2\1\uffff\1\2\4\uffff\4\2\1\uffff\10\2\3\uffff\1\2\3\uffff"+
            "\3\2\2\uffff\1\2\1\30\3\2\1\uffff\1\2\3\uffff\2\2\1\23\6\uffff"+
            "\1\25\1\uffff\1\2\1\uffff\1\2\12\uffff\3\2\1\uffff\6\2\2\uffff"+
            "\1\27\1\2\2\uffff\1\2\4\uffff\1\2\1\uffff\1\2\1\uffff\1\2\3"+
            "\uffff\1\32\1\uffff\1\2\5\uffff\1\2\5\uffff\1\2\1\uffff\3\2"+
            "\1\uffff\1\2\1\31\1\uffff\1\2\3\uffff\1\2\1\uffff\2\2\1\uffff"+
            "\1\2\4\uffff\2\2\1\uffff\7\2\1\4\2\uffff\2\2\1\uffff\1\4\1\2"+
            "\4\uffff\1\2\11\uffff\1\2\1\uffff\2\2\1\uffff\3\2\4\uffff\1"+
            "\26\3\2\1\uffff\4\2\1\uffff\1\2\1\24",
            "",
            "\3\2\1\uffff\2\2\1\uffff\2\2\1\uffff\2\2\1\uffff\3\2\2\uffff"+
            "\3\2\2\uffff\1\2\1\uffff\1\2\1\uffff\7\2\3\uffff\1\4\1\uffff"+
            "\3\2\1\uffff\1\2\4\uffff\4\2\1\uffff\10\2\3\uffff\1\2\3\uffff"+
            "\3\2\2\uffff\1\2\1\50\3\2\1\uffff\2\2\2\uffff\2\2\1\43\6\uffff"+
            "\1\45\1\uffff\1\2\1\uffff\1\2\12\uffff\3\2\1\uffff\7\2\1\uffff"+
            "\1\47\1\2\2\uffff\1\2\4\uffff\1\2\1\uffff\1\2\1\uffff\1\2\3"+
            "\uffff\1\52\1\uffff\1\2\3\uffff\1\2\1\uffff\2\2\4\uffff\1\2"+
            "\1\uffff\3\2\1\uffff\1\2\1\51\1\uffff\1\2\3\uffff\4\2\1\uffff"+
            "\2\2\3\uffff\2\2\1\uffff\7\2\1\4\2\uffff\2\2\1\uffff\1\4\1\2"+
            "\4\uffff\1\2\11\uffff\1\2\1\uffff\6\2\4\uffff\1\46\3\2\1\uffff"+
            "\4\2\1\uffff\1\2\1\44",
            "\1\2\13\uffff\1\4\44\uffff\1\4\12\uffff\1\4\6\uffff\1\4\32"+
            "\uffff\1\4\20\uffff\1\4\24\uffff\1\4\31\uffff\1\4\5\uffff\1"+
            "\4\33\uffff\1\4\12\uffff\1\4",
            "\1\2\40\uffff\1\4\44\uffff\1\4\12\uffff\1\4\6\uffff\1\4\32"+
            "\uffff\1\4\20\uffff\1\4\24\uffff\1\4\31\uffff\1\4\3\uffff\1"+
            "\2\1\uffff\1\4\33\uffff\1\4\12\uffff\1\4",
            "\1\4\44\uffff\1\4\12\uffff\1\4\6\uffff\1\4\32\uffff\1\4\20"+
            "\uffff\1\4\24\uffff\1\4\31\uffff\1\4\3\uffff\1\2\1\uffff\1\4"+
            "\33\uffff\1\4\12\uffff\1\4",
            "\1\4\44\uffff\1\4\12\uffff\1\4\6\uffff\1\4\32\uffff\1\4\20"+
            "\uffff\1\4\24\uffff\1\4\31\uffff\1\4\3\uffff\1\2\1\uffff\1\4"+
            "\33\uffff\1\4\12\uffff\1\4",
            "\1\2\13\uffff\1\4\44\uffff\1\4\12\uffff\1\4\6\uffff\1\4\32"+
            "\uffff\1\4\20\uffff\1\4\24\uffff\1\4\31\uffff\1\4\5\uffff\1"+
            "\4\33\uffff\1\4\12\uffff\1\4",
            "\1\4\44\uffff\1\4\12\uffff\1\4\6\uffff\1\4\30\uffff\1\2\1\uffff"+
            "\1\4\20\uffff\1\4\24\uffff\1\4\31\uffff\1\4\5\uffff\1\4\33\uffff"+
            "\1\4\12\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\2\uffff\2\4\2\uffff"+
            "\3\4\4\uffff\1\4\1\uffff\5\4\1\uffff\1\4\5\uffff\3\4\1\uffff"+
            "\1\4\4\uffff\4\4\1\uffff\10\4\1\uffff\1\2\1\uffff\1\4\3\uffff"+
            "\3\4\2\uffff\5\4\1\uffff\1\4\3\uffff\3\4\6\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\6\4\2\uffff\2\4\2\uffff"+
            "\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3\uffff\1\4\1\uffff"+
            "\1\4\5\uffff\1\4\5\uffff\1\4\1\uffff\3\4\1\uffff\2\4\1\uffff"+
            "\1\4\3\uffff\1\4\1\uffff\2\4\1\uffff\1\4\4\uffff\2\4\1\uffff"+
            "\7\4\3\uffff\2\4\2\uffff\1\4\4\uffff\1\4\11\uffff\1\4\1\uffff"+
            "\2\4\1\uffff\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\1\uffff\3\4\2\uffff"+
            "\3\4\2\uffff\1\4\1\uffff\1\4\1\uffff\7\4\5\uffff\3\4\1\uffff"+
            "\1\4\4\uffff\4\4\1\uffff\10\4\1\uffff\1\2\1\uffff\1\4\3\uffff"+
            "\3\4\2\uffff\5\4\1\uffff\2\4\2\uffff\3\4\6\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\7\4\1\uffff\2\4\2\uffff"+
            "\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3\uffff\1\4\1\uffff"+
            "\1\4\3\uffff\1\4\1\uffff\2\4\4\uffff\1\4\1\uffff\3\4\1\uffff"+
            "\2\4\1\uffff\1\4\3\uffff\4\4\1\uffff\2\4\3\uffff\2\4\1\uffff"+
            "\7\4\3\uffff\2\4\2\uffff\1\4\4\uffff\1\4\11\uffff\1\4\1\uffff"+
            "\6\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
            "\1\4\44\uffff\1\2",
            "\1\4\71\uffff\1\2\174\uffff\1\4",
            "\1\2\174\uffff\1\4",
            "\1\2\174\uffff\1\4",
            "\1\4\44\uffff\1\2",
            "\1\2\66\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\2\uffff\2\4\2\uffff"+
            "\3\4\4\uffff\1\4\1\uffff\5\4\1\uffff\1\4\5\uffff\3\4\1\uffff"+
            "\1\4\4\uffff\4\4\1\uffff\10\4\1\uffff\1\2\1\uffff\1\4\3\uffff"+
            "\3\4\2\uffff\5\4\1\uffff\1\4\3\uffff\3\4\6\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\6\4\2\uffff\2\4\2\uffff"+
            "\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3\uffff\1\4\1\uffff"+
            "\1\4\5\uffff\1\4\5\uffff\1\4\1\uffff\3\4\1\uffff\2\4\1\uffff"+
            "\1\4\3\uffff\1\4\1\uffff\2\4\1\uffff\1\4\4\uffff\2\4\1\uffff"+
            "\7\4\3\uffff\2\4\2\uffff\1\4\4\uffff\1\4\11\uffff\1\4\1\uffff"+
            "\2\4\1\uffff\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\1\uffff\3\4\2\uffff"+
            "\3\4\2\uffff\1\4\1\uffff\1\4\1\uffff\7\4\5\uffff\3\4\1\uffff"+
            "\1\4\4\uffff\4\4\1\uffff\10\4\1\uffff\1\2\1\uffff\1\4\3\uffff"+
            "\3\4\2\uffff\5\4\1\uffff\2\4\2\uffff\3\4\6\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\7\4\1\uffff\2\4\2\uffff"+
            "\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3\uffff\1\4\1\uffff"+
            "\1\4\3\uffff\1\4\1\uffff\2\4\4\uffff\1\4\1\uffff\3\4\1\uffff"+
            "\2\4\1\uffff\1\4\3\uffff\4\4\1\uffff\2\4\3\uffff\2\4\1\uffff"+
            "\7\4\3\uffff\2\4\2\uffff\1\4\4\uffff\1\4\11\uffff\1\4\1\uffff"+
            "\6\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
            "\1\4\44\uffff\1\2",
            "\1\4\71\uffff\1\2\174\uffff\1\4",
            "\1\2\174\uffff\1\4",
            "\1\2\174\uffff\1\4",
            "\1\4\44\uffff\1\2",
            "\1\2\66\uffff\1\4",
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
            ""
    };

    static final short[] DFA78_eot = DFA.unpackEncodedString(DFA78_eotS);
    static final short[] DFA78_eof = DFA.unpackEncodedString(DFA78_eofS);
    static final char[] DFA78_min = DFA.unpackEncodedStringToUnsignedChars(DFA78_minS);
    static final char[] DFA78_max = DFA.unpackEncodedStringToUnsignedChars(DFA78_maxS);
    static final short[] DFA78_accept = DFA.unpackEncodedString(DFA78_acceptS);
    static final short[] DFA78_special = DFA.unpackEncodedString(DFA78_specialS);
    static final short[][] DFA78_transition;

    static {
        int numStates = DFA78_transitionS.length;
        DFA78_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA78_transition[i] = DFA.unpackEncodedString(DFA78_transitionS[i]);
        }
    }

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = DFA78_eot;
            this.eof = DFA78_eof;
            this.min = DFA78_min;
            this.max = DFA78_max;
            this.accept = DFA78_accept;
            this.special = DFA78_special;
            this.transition = DFA78_transition;
        }
        public String getDescription() {
            return "321:11: ( AS )?";
        }
    }
    static final String DFA124_eotS =
        "\107\uffff";
    static final String DFA124_eofS =
        "\107\uffff";
    static final String DFA124_minS =
        "\1\43\1\5\7\uffff\4\43\72\uffff";
    static final String DFA124_maxS =
        "\1\u00df\1\u00e9\7\uffff\4\u00df\72\uffff";
    static final String DFA124_acceptS =
        "\2\uffff\1\2\12\uffff\1\1\71\uffff";
    static final String DFA124_specialS =
        "\107\uffff}>";
    static final String[] DFA124_transitionS = {
            "\1\2\6\uffff\1\1\3\uffff\1\2\52\uffff\1\2\121\uffff\1\2\20\uffff"+
            "\1\2\42\uffff\1\2",
            "\3\15\1\uffff\2\15\1\uffff\2\15\1\uffff\2\15\2\uffff\2\15\2"+
            "\uffff\3\15\4\uffff\1\15\1\uffff\3\15\1\13\1\15\7\uffff\2\15"+
            "\1\2\1\uffff\1\15\4\uffff\4\15\1\uffff\10\15\3\uffff\1\15\3"+
            "\uffff\3\15\2\uffff\5\15\1\uffff\1\15\3\uffff\1\15\1\14\1\15"+
            "\3\uffff\1\15\2\uffff\1\15\1\uffff\1\15\1\uffff\1\15\12\uffff"+
            "\12\15\2\uffff\2\15\2\uffff\2\15\3\uffff\1\15\1\uffff\1\15\1"+
            "\uffff\1\15\2\uffff\2\15\4\uffff\1\15\2\uffff\3\15\3\uffff\1"+
            "\15\1\uffff\3\15\1\uffff\2\15\1\uffff\1\15\3\uffff\1\15\1\uffff"+
            "\1\15\1\11\1\uffff\1\15\4\uffff\12\15\3\uffff\2\15\2\uffff\1"+
            "\15\4\uffff\1\15\11\uffff\1\15\1\uffff\2\15\1\uffff\3\15\4\uffff"+
            "\1\15\1\12\2\15\1\uffff\4\15\1\uffff\2\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\15\5\uffff\1\15\3\uffff\1\15\14\uffff\1\15\35\uffff\1\15"+
            "\13\uffff\1\15\41\uffff\1\2\16\uffff\1\15\4\uffff\1\15\17\uffff"+
            "\1\15\7\uffff\1\15\10\uffff\1\15\42\uffff\1\15",
            "\2\15\5\uffff\1\15\3\uffff\1\15\14\uffff\1\15\35\uffff\1\15"+
            "\13\uffff\1\15\51\uffff\1\2\6\uffff\1\15\4\uffff\1\15\17\uffff"+
            "\1\15\7\uffff\1\15\10\uffff\1\15\42\uffff\1\15",
            "\2\15\5\uffff\1\15\3\uffff\1\15\14\uffff\1\15\35\uffff\1\15"+
            "\13\uffff\1\15\51\uffff\1\2\6\uffff\1\15\4\uffff\1\15\17\uffff"+
            "\1\15\7\uffff\1\15\10\uffff\1\15\42\uffff\1\15",
            "\2\15\5\uffff\1\15\3\uffff\1\15\14\uffff\1\15\35\uffff\1\15"+
            "\13\uffff\1\15\41\uffff\1\2\16\uffff\1\15\4\uffff\1\15\17\uffff"+
            "\1\15\7\uffff\1\15\10\uffff\1\15\42\uffff\1\15",
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
            "",
            "",
            "",
            ""
    };

    static final short[] DFA124_eot = DFA.unpackEncodedString(DFA124_eotS);
    static final short[] DFA124_eof = DFA.unpackEncodedString(DFA124_eofS);
    static final char[] DFA124_min = DFA.unpackEncodedStringToUnsignedChars(DFA124_minS);
    static final char[] DFA124_max = DFA.unpackEncodedStringToUnsignedChars(DFA124_maxS);
    static final short[] DFA124_accept = DFA.unpackEncodedString(DFA124_acceptS);
    static final short[] DFA124_special = DFA.unpackEncodedString(DFA124_specialS);
    static final short[][] DFA124_transition;

    static {
        int numStates = DFA124_transitionS.length;
        DFA124_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA124_transition[i] = DFA.unpackEncodedString(DFA124_transitionS[i]);
        }
    }

    class DFA124 extends DFA {

        public DFA124(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 124;
            this.eot = DFA124_eot;
            this.eof = DFA124_eof;
            this.min = DFA124_min;
            this.max = DFA124_max;
            this.accept = DFA124_accept;
            this.special = DFA124_special;
            this.transition = DFA124_transition;
        }
        public String getDescription() {
            return "()* loopback of 385:23: ( COMMA column_def )*";
        }
    }
    static final String DFA129_eotS =
        "\u0197\uffff";
    static final String DFA129_eofS =
        "\1\1\4\uffff\1\12\13\uffff\1\12\22\uffff\1\12\10\uffff\1\12\u0169"+
        "\uffff";
    static final String DFA129_minS =
        "\1\43\2\uffff\1\5\1\u0087\1\43\1\u008f\10\uffff\2\43\1\20\20\uffff"+
        "\1\5\1\u0087\1\43\1\u008f\6\uffff\1\u0087\1\43\1\u008f\30\uffff"+
        "\11\13\2\5\1\13\1\103\1\5\1\103\2\5\2\103\1\5\u013c\uffff";
    static final String DFA129_maxS =
        "\1\u00df\2\uffff\1\u00e9\1\u0087\1\u00df\1\u008f\10\uffff\3\u00df"+
        "\20\uffff\1\u00e9\1\u0087\1\u00df\1\u008f\6\uffff\1\u0087\1\u00df"+
        "\1\u008f\30\uffff\11\u00c6\2\u00e9\1\u00c6\1\u008f\1\u00e9\1\u008f"+
        "\2\u00e9\1\u008f\1\103\1\u00e9\u013c\uffff";
    static final String DFA129_acceptS =
        "\1\uffff\1\2\10\uffff\1\1\120\uffff\1\1\20\uffff\2\1\20\uffff\u0119"+
        "\1";
    static final String DFA129_specialS =
        "\u0197\uffff}>";
    static final String[] DFA129_transitionS = {
            "\1\6\1\12\5\uffff\1\1\3\uffff\1\3\14\uffff\1\12\35\uffff\1\1"+
            "\74\uffff\1\12\4\uffff\1\12\17\uffff\1\4\7\uffff\1\12\10\uffff"+
            "\1\1\5\uffff\1\1\34\uffff\1\5",
            "",
            "",
            "\3\20\1\uffff\2\20\1\uffff\2\20\1\uffff\2\20\2\uffff\2\20\2"+
            "\uffff\3\20\4\uffff\1\20\1\uffff\5\20\1\uffff\1\20\5\uffff\3"+
            "\20\1\uffff\1\20\4\uffff\4\20\1\uffff\10\20\3\uffff\1\20\3\uffff"+
            "\3\20\2\uffff\5\20\1\uffff\1\20\3\uffff\3\20\6\uffff\1\20\1"+
            "\uffff\1\20\1\uffff\1\17\12\uffff\3\20\1\uffff\6\20\2\uffff"+
            "\2\20\2\uffff\1\20\4\uffff\1\20\1\uffff\1\20\1\uffff\1\20\3"+
            "\uffff\1\20\7\uffff\1\20\5\uffff\1\20\1\uffff\3\20\1\uffff\2"+
            "\20\1\uffff\1\20\3\uffff\1\20\1\uffff\2\20\1\uffff\1\20\4\uffff"+
            "\2\20\1\uffff\7\20\3\uffff\2\20\2\uffff\1\20\4\uffff\1\17\11"+
            "\uffff\1\20\1\uffff\2\20\1\uffff\3\20\4\uffff\4\20\1\uffff\4"+
            "\20\1\uffff\2\20",
            "\1\21",
            "\2\12\5\uffff\1\12\3\uffff\1\12\14\uffff\1\12\35\uffff\1\12"+
            "\65\uffff\1\1\6\uffff\1\12\4\uffff\1\12\3\uffff\1\12\13\uffff"+
            "\1\12\7\uffff\1\12\10\uffff\1\12\5\uffff\1\12\34\uffff\1\12",
            "\1\42",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\45\1\12\26\uffff\1\12\35\uffff\1\1\74\uffff\1\12\4\uffff"+
            "\1\12\17\uffff\1\43\7\uffff\1\12\53\uffff\1\44",
            "\1\56\1\12\26\uffff\1\12\35\uffff\1\1\74\uffff\1\12\4\uffff"+
            "\1\12\17\uffff\1\54\7\uffff\1\12\53\uffff\1\55",
            "\1\12\3\uffff\1\12\16\uffff\2\12\5\uffff\1\12\3\uffff\1\12"+
            "\14\uffff\1\12\3\uffff\1\12\31\uffff\1\12\65\uffff\1\1\6\uffff"+
            "\1\12\4\uffff\1\12\3\uffff\1\12\13\uffff\1\12\7\uffff\1\12\10"+
            "\uffff\1\12\5\uffff\1\12\34\uffff\1\12",
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
            "\3\131\1\uffff\2\131\1\uffff\2\131\1\uffff\2\131\1\uffff\1"+
            "\121\2\131\2\uffff\3\131\2\uffff\1\112\1\uffff\1\131\1\uffff"+
            "\1\131\1\127\1\123\2\131\1\120\1\131\5\uffff\3\131\1\uffff\1"+
            "\131\4\uffff\1\131\1\115\1\114\1\116\1\uffff\10\131\3\uffff"+
            "\1\131\3\uffff\3\131\2\uffff\3\131\1\125\1\131\1\uffff\1\131"+
            "\1\110\2\uffff\3\131\6\uffff\1\131\1\uffff\1\131\1\uffff\1\122"+
            "\12\uffff\3\131\1\uffff\6\131\1\107\1\uffff\2\131\2\uffff\1"+
            "\131\4\uffff\1\131\1\uffff\1\131\1\uffff\1\131\3\uffff\1\131"+
            "\1\uffff\1\124\3\uffff\1\132\1\uffff\1\131\1\126\4\uffff\1\113"+
            "\1\uffff\3\131\1\uffff\2\131\1\uffff\1\131\3\uffff\1\131\1\132"+
            "\2\131\1\uffff\1\131\1\117\3\uffff\1\130\1\131\1\uffff\7\131"+
            "\3\uffff\2\131\2\uffff\1\131\4\uffff\1\111\11\uffff\1\131\1"+
            "\uffff\2\131\1\132\3\131\4\uffff\4\131\1\uffff\4\131\1\uffff"+
            "\2\131",
            "\1\133",
            "\2\12\5\uffff\1\12\3\uffff\1\12\14\uffff\1\12\35\uffff\1\12"+
            "\65\uffff\1\1\6\uffff\1\12\4\uffff\1\12\3\uffff\1\12\13\uffff"+
            "\1\12\7\uffff\1\12\10\uffff\1\12\5\uffff\1\12\34\uffff\1\12",
            "\1\154",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\155",
            "\2\12\5\uffff\1\12\3\uffff\1\12\14\uffff\1\12\35\uffff\1\12"+
            "\65\uffff\1\1\6\uffff\1\12\4\uffff\1\12\3\uffff\1\12\13\uffff"+
            "\1\12\7\uffff\1\12\10\uffff\1\12\5\uffff\1\12\34\uffff\1\12",
            "\1\176",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0083\1\uffff\1\u008e\3\uffff\1\u0081\7\uffff\1\u008c\12"+
            "\uffff\1\177\37\uffff\1\u0080\7\uffff\1\u0088\1\u008d\20\uffff"+
            "\1\u0086\2\u0084\22\uffff\1\u0087\14\uffff\1\u008b\1\u0089\10"+
            "\uffff\2\u0084\1\u0086\5\uffff\1\u0086\1\u0082\2\uffff\1\u0085"+
            "\1\u008a\2\u008d\7\uffff\1\u008f\4\uffff\1\u0081\1\u0083\1\uffff"+
            "\1\u0082\12\uffff\1\u0086\7\uffff\1\u0090\7\uffff\2\u0083\1"+
            "\u0081",
            "\1\u0095\1\uffff\1\u00a0\3\uffff\1\u0093\7\uffff\1\u009e\12"+
            "\uffff\1\u0091\37\uffff\1\u0092\7\uffff\1\u009a\1\u009f\20\uffff"+
            "\1\u0098\2\u0096\22\uffff\1\u0099\14\uffff\1\u009d\1\u009b\10"+
            "\uffff\2\u0096\1\u0098\5\uffff\1\u0098\1\u0094\2\uffff\1\u0097"+
            "\1\u009c\2\u009f\7\uffff\1\u00a1\4\uffff\1\u0093\1\u0095\1\uffff"+
            "\1\u0094\12\uffff\1\u0098\7\uffff\1\u00a2\7\uffff\2\u0095\1"+
            "\u0093",
            "\1\u00a7\1\uffff\1\u00b2\3\uffff\1\u00a5\7\uffff\1\u00b0\12"+
            "\uffff\1\u00a3\36\uffff\1\u00b5\1\u00a4\7\uffff\1\u00ac\1\u00b1"+
            "\20\uffff\1\u00aa\2\u00a8\22\uffff\1\u00ab\14\uffff\1\u00af"+
            "\1\u00ad\10\uffff\2\u00a8\1\u00aa\5\uffff\1\u00aa\1\u00a6\2"+
            "\uffff\1\u00a9\1\u00ae\2\u00b1\7\uffff\1\u00b3\4\uffff\1\u00a5"+
            "\1\u00a7\1\uffff\1\u00a6\12\uffff\1\u00aa\7\uffff\1\u00b4\7"+
            "\uffff\2\u00a7\1\u00a5",
            "\1\u00ba\1\uffff\1\u00c5\3\uffff\1\u00b8\7\uffff\1\u00c3\12"+
            "\uffff\1\u00b6\37\uffff\1\u00b7\7\uffff\1\u00bf\1\u00c4\20\uffff"+
            "\1\u00bd\2\u00bb\22\uffff\1\u00be\14\uffff\1\u00c2\1\u00c0\10"+
            "\uffff\2\u00bb\1\u00bd\5\uffff\1\u00bd\1\u00b9\2\uffff\1\u00bc"+
            "\1\u00c1\2\u00c4\7\uffff\1\u00c6\4\uffff\1\u00b8\1\u00ba\1\uffff"+
            "\1\u00b9\12\uffff\1\u00bd\7\uffff\1\u00c7\7\uffff\2\u00ba\1"+
            "\u00b8",
            "\1\u00cc\1\uffff\1\u00d7\3\uffff\1\u00ca\7\uffff\1\u00d5\12"+
            "\uffff\1\u00c8\36\uffff\1\u00da\1\u00c9\7\uffff\1\u00d1\1\u00d6"+
            "\20\uffff\1\u00cf\2\u00cd\22\uffff\1\u00d0\14\uffff\1\u00d4"+
            "\1\u00d2\10\uffff\2\u00cd\1\u00cf\5\uffff\1\u00cf\1\u00cb\2"+
            "\uffff\1\u00ce\1\u00d3\2\u00d6\7\uffff\1\u00d8\4\uffff\1\u00ca"+
            "\1\u00cc\1\uffff\1\u00cb\12\uffff\1\u00cf\7\uffff\1\u00d9\7"+
            "\uffff\2\u00cc\1\u00ca",
            "\1\u00df\1\uffff\1\u00ea\3\uffff\1\u00dd\7\uffff\1\u00e8\12"+
            "\uffff\1\u00db\36\uffff\1\u00ed\1\u00dc\7\uffff\1\u00e4\1\u00e9"+
            "\20\uffff\1\u00e2\2\u00e0\22\uffff\1\u00e3\14\uffff\1\u00e7"+
            "\1\u00e5\10\uffff\2\u00e0\1\u00e2\5\uffff\1\u00e2\1\u00de\2"+
            "\uffff\1\u00e1\1\u00e6\2\u00e9\7\uffff\1\u00eb\4\uffff\1\u00dd"+
            "\1\u00df\1\uffff\1\u00de\12\uffff\1\u00e2\7\uffff\1\u00ec\7"+
            "\uffff\2\u00df\1\u00dd",
            "\1\u00f2\1\uffff\1\u00fd\3\uffff\1\u00f0\7\uffff\1\u00fb\12"+
            "\uffff\1\u00ee\36\uffff\1\u0100\1\u00ef\7\uffff\1\u00f7\1\u00fc"+
            "\20\uffff\1\u00f5\2\u00f3\22\uffff\1\u00f6\14\uffff\1\u00fa"+
            "\1\u00f8\10\uffff\2\u00f3\1\u00f5\5\uffff\1\u00f5\1\u00f1\2"+
            "\uffff\1\u00f4\1\u00f9\2\u00fc\7\uffff\1\u00fe\4\uffff\1\u00f0"+
            "\1\u00f2\1\uffff\1\u00f1\12\uffff\1\u00f5\7\uffff\1\u00ff\7"+
            "\uffff\2\u00f2\1\u00f0",
            "\1\u0105\1\uffff\1\u0110\3\uffff\1\u0103\7\uffff\1\u010e\12"+
            "\uffff\1\u0101\36\uffff\1\u0113\1\u0102\7\uffff\1\u010a\1\u010f"+
            "\20\uffff\1\u0108\2\u0106\22\uffff\1\u0109\14\uffff\1\u010d"+
            "\1\u010b\10\uffff\2\u0106\1\u0108\5\uffff\1\u0108\1\u0104\2"+
            "\uffff\1\u0107\1\u010c\2\u010f\7\uffff\1\u0111\4\uffff\1\u0103"+
            "\1\u0105\1\uffff\1\u0104\12\uffff\1\u0108\7\uffff\1\u0112\7"+
            "\uffff\2\u0105\1\u0103",
            "\1\u0119\1\uffff\1\u0124\3\uffff\1\u0117\7\uffff\1\u0122\12"+
            "\uffff\1\u0115\37\uffff\1\u0116\7\uffff\1\u011e\1\u0123\20\uffff"+
            "\1\u011c\2\u011a\22\uffff\1\u011d\6\uffff\1\u0114\5\uffff\1"+
            "\u0121\1\u011f\10\uffff\2\u011a\1\u011c\5\uffff\1\u011c\1\u0118"+
            "\2\uffff\1\u011b\1\u0120\2\u0123\7\uffff\1\u0125\4\uffff\1\u0117"+
            "\1\u0119\1\uffff\1\u0118\12\uffff\1\u011c\7\uffff\1\u0126\7"+
            "\uffff\2\u0119\1\u0117",
            "\3\u0128\1\uffff\2\u0128\1\uffff\2\u0128\1\uffff\2\u0128\2"+
            "\uffff\2\u0128\2\uffff\3\u0128\4\uffff\1\u0128\1\uffff\5\u0128"+
            "\1\uffff\1\u0128\5\uffff\3\u0128\1\uffff\1\u0128\4\uffff\4\u0128"+
            "\1\uffff\10\u0128\3\uffff\1\u0128\3\uffff\3\u0128\2\uffff\5"+
            "\u0128\1\uffff\1\u0128\3\uffff\3\u0128\6\uffff\1\u0128\1\uffff"+
            "\1\u0128\1\uffff\1\u0127\12\uffff\3\u0128\1\uffff\6\u0128\2"+
            "\uffff\2\u0128\2\uffff\1\u0128\4\uffff\1\u0128\1\uffff\1\u0128"+
            "\1\uffff\1\u0128\3\uffff\1\u0128\7\uffff\1\u0128\5\uffff\1\u0128"+
            "\1\uffff\3\u0128\1\uffff\2\u0128\1\uffff\1\u0128\3\uffff\1\u0128"+
            "\1\uffff\2\u0128\1\uffff\1\u0128\4\uffff\2\u0128\1\uffff\7\u0128"+
            "\3\uffff\2\u0128\2\uffff\1\u0128\4\uffff\1\u0127\11\uffff\1"+
            "\u0128\1\uffff\2\u0128\1\uffff\3\u0128\4\uffff\4\u0128\1\uffff"+
            "\4\u0128\1\uffff\2\u0128",
            "\3\u012a\1\uffff\2\u012a\1\uffff\2\u012a\1\uffff\2\u012a\2"+
            "\uffff\2\u012a\2\uffff\3\u012a\4\uffff\1\u012a\1\uffff\5\u012a"+
            "\1\uffff\1\u012a\5\uffff\3\u012a\1\uffff\1\u012a\4\uffff\4\u012a"+
            "\1\uffff\10\u012a\3\uffff\1\u012a\3\uffff\3\u012a\2\uffff\5"+
            "\u012a\1\uffff\1\u012a\3\uffff\3\u012a\6\uffff\1\u012a\1\uffff"+
            "\1\u012a\1\uffff\1\u0129\12\uffff\3\u012a\1\uffff\6\u012a\2"+
            "\uffff\2\u012a\2\uffff\1\u012a\4\uffff\1\u012a\1\uffff\1\u012a"+
            "\1\uffff\1\u012a\3\uffff\1\u012a\7\uffff\1\u012a\5\uffff\1\u012a"+
            "\1\uffff\3\u012a\1\uffff\2\u012a\1\uffff\1\u012a\3\uffff\1\u012a"+
            "\1\uffff\2\u012a\1\uffff\1\u012a\4\uffff\2\u012a\1\uffff\7\u012a"+
            "\3\uffff\2\u012a\2\uffff\1\u012a\4\uffff\1\u0129\11\uffff\1"+
            "\u012a\1\uffff\2\u012a\1\uffff\3\u012a\4\uffff\4\u012a\1\uffff"+
            "\4\u012a\1\uffff\2\u012a",
            "\1\u0131\1\uffff\1\u013c\3\uffff\1\u012f\7\uffff\1\u013a\12"+
            "\uffff\1\u012d\36\uffff\1\u012c\1\u012e\7\uffff\1\u0136\1\u013b"+
            "\20\uffff\1\u0134\2\u0132\22\uffff\1\u0135\14\uffff\1\u0139"+
            "\1\u0137\10\uffff\2\u0132\1\u0134\2\uffff\1\u012b\2\uffff\1"+
            "\u0134\1\u0130\2\uffff\1\u0133\1\u0138\2\u013b\7\uffff\1\u013d"+
            "\4\uffff\1\u012f\1\u0131\1\uffff\1\u0130\12\uffff\1\u0134\7"+
            "\uffff\1\u013e\7\uffff\2\u0131\1\u012f",
            "\1\u0140\113\uffff\1\u013f",
            "\3\u0155\1\uffff\2\u0155\1\uffff\2\u0155\1\uffff\2\u0155\1"+
            "\uffff\1\u014b\2\u0155\2\uffff\3\u0155\2\uffff\1\u0144\1\uffff"+
            "\1\u0155\1\uffff\1\u0155\1\u0151\1\u014d\2\u0155\1\u014a\1\u0155"+
            "\5\uffff\3\u0155\1\uffff\1\u0155\4\uffff\1\u0155\1\u0147\1\u0146"+
            "\1\u0148\1\uffff\10\u0155\3\uffff\1\u0155\3\uffff\3\u0155\2"+
            "\uffff\3\u0155\1\u014f\1\u0155\1\uffff\1\u0155\1\u0142\2\uffff"+
            "\3\u0155\6\uffff\1\u0155\1\uffff\1\u0155\1\uffff\1\u014c\12"+
            "\uffff\3\u0155\1\uffff\6\u0155\1\u0141\1\uffff\2\u0155\2\uffff"+
            "\1\u0155\4\uffff\1\u0155\1\uffff\1\u0155\1\uffff\1\u0155\3\uffff"+
            "\1\u0155\1\uffff\1\u014e\3\uffff\1\u0154\1\uffff\1\u0155\1\u0150"+
            "\4\uffff\1\u0145\1\uffff\3\u0155\1\uffff\2\u0155\1\uffff\1\u0155"+
            "\3\uffff\1\u0155\1\u0154\2\u0155\1\uffff\1\u0155\1\u0149\3\uffff"+
            "\1\u0152\1\u0155\1\uffff\7\u0155\3\uffff\1\u0155\1\u0153\2\uffff"+
            "\1\u0155\4\uffff\1\u0143\11\uffff\1\u0155\1\uffff\2\u0155\1"+
            "\u0154\3\u0155\4\uffff\4\u0155\1\uffff\4\u0155\1\uffff\2\u0155",
            "\1\u0156\113\uffff\1\u0157",
            "\3\u016a\1\uffff\2\u016a\1\uffff\2\u016a\1\uffff\2\u016a\1"+
            "\uffff\1\u0163\2\u016a\2\uffff\3\u016a\2\uffff\1\u015c\1\uffff"+
            "\1\u016a\1\uffff\1\u016a\1\u0167\1\u0165\2\u016a\1\u0162\1\u016a"+
            "\5\uffff\3\u016a\1\uffff\1\u016a\4\uffff\1\u016a\1\u015f\1\u015e"+
            "\1\u0160\1\uffff\10\u016a\3\uffff\1\u016a\3\uffff\3\u016a\2"+
            "\uffff\3\u016a\1\u0158\1\u016a\1\uffff\1\u016a\1\u015a\2\uffff"+
            "\3\u016a\6\uffff\1\u016a\1\uffff\1\u016a\1\uffff\1\u0164\12"+
            "\uffff\3\u016a\1\uffff\6\u016a\1\u0159\1\uffff\2\u016a\2\uffff"+
            "\1\u016a\4\uffff\1\u016a\1\uffff\1\u016a\1\uffff\1\u016a\3\uffff"+
            "\1\u016a\1\uffff\1\u0166\5\uffff\1\u016a\1\u0168\4\uffff\1\u015d"+
            "\1\uffff\3\u016a\1\uffff\2\u016a\1\uffff\1\u016a\3\uffff\1\u016a"+
            "\1\uffff\2\u016a\1\uffff\1\u016a\1\u0161\3\uffff\1\u0169\1\u016a"+
            "\1\uffff\7\u016a\3\uffff\2\u016a\2\uffff\1\u016a\4\uffff\1\u015b"+
            "\11\uffff\1\u016a\1\uffff\2\u016a\1\uffff\3\u016a\4\uffff\4"+
            "\u016a\1\uffff\4\u016a\1\uffff\2\u016a",
            "\3\u0180\1\uffff\2\u0180\1\uffff\2\u0180\1\uffff\2\u0180\1"+
            "\uffff\1\u0176\2\u0180\2\uffff\3\u0180\2\uffff\1\u016f\1\uffff"+
            "\1\u0180\1\uffff\1\u0180\1\u017c\1\u0178\2\u0180\1\u0175\1\u0180"+
            "\5\uffff\3\u0180\1\uffff\1\u0180\4\uffff\1\u0180\1\u0172\1\u0171"+
            "\1\u0173\1\uffff\10\u0180\1\uffff\1\u016b\1\uffff\1\u0180\3"+
            "\uffff\3\u0180\2\uffff\3\u0180\1\u017a\1\u0180\1\uffff\1\u0180"+
            "\1\u016d\2\uffff\3\u0180\6\uffff\1\u0180\1\uffff\1\u0180\1\uffff"+
            "\1\u0177\12\uffff\3\u0180\1\uffff\6\u0180\1\u016c\1\uffff\2"+
            "\u0180\2\uffff\1\u0180\4\uffff\1\u0180\1\uffff\1\u0180\1\uffff"+
            "\1\u0180\3\uffff\1\u0180\1\uffff\1\u0179\3\uffff\1\u017f\1\uffff"+
            "\1\u0180\1\u017b\4\uffff\1\u0170\1\uffff\3\u0180\1\uffff\2\u0180"+
            "\1\uffff\1\u0180\3\uffff\1\u0180\1\u017f\2\u0180\1\uffff\1\u0180"+
            "\1\u0174\3\uffff\1\u017d\1\u0180\1\uffff\7\u0180\3\uffff\2\u0180"+
            "\2\uffff\1\u0180\4\uffff\1\u016e\11\uffff\1\u0180\1\uffff\2"+
            "\u0180\1\u017f\3\u0180\4\uffff\4\u0180\1\uffff\4\u0180\1\uffff"+
            "\1\u017e\1\u0180",
            "\1\u0182\113\uffff\1\u0181",
            "\1\u0183",
            "\3\u0196\1\uffff\2\u0196\1\uffff\2\u0196\1\uffff\2\u0196\1"+
            "\uffff\1\u018e\2\u0196\2\uffff\3\u0196\2\uffff\1\u0187\1\uffff"+
            "\1\u0196\1\uffff\1\u0196\1\u0194\1\u0190\2\u0196\1\u018d\1\u0196"+
            "\5\uffff\3\u0196\1\uffff\1\u0196\4\uffff\1\u0196\1\u018a\1\u0189"+
            "\1\u018b\1\uffff\10\u0196\3\uffff\1\u0196\3\uffff\3\u0196\2"+
            "\uffff\3\u0196\1\u0192\1\u0196\1\uffff\1\u0196\1\u0185\2\uffff"+
            "\3\u0196\6\uffff\1\u0196\1\uffff\1\u0196\1\uffff\1\u018f\12"+
            "\uffff\3\u0196\1\uffff\6\u0196\1\u0184\1\uffff\2\u0196\2\uffff"+
            "\1\u0196\4\uffff\1\u0196\1\uffff\1\u0196\1\uffff\1\u0196\3\uffff"+
            "\1\u0196\1\uffff\1\u0191\5\uffff\1\u0196\1\u0193\4\uffff\1\u0188"+
            "\1\uffff\3\u0196\1\uffff\2\u0196\1\uffff\1\u0196\3\uffff\1\u0196"+
            "\1\uffff\2\u0196\1\uffff\1\u0196\1\u018c\3\uffff\1\u0195\1\u0196"+
            "\1\uffff\7\u0196\3\uffff\2\u0196\2\uffff\1\u0196\4\uffff\1\u0186"+
            "\11\uffff\1\u0196\1\uffff\2\u0196\1\uffff\3\u0196\4\uffff\4"+
            "\u0196\1\uffff\4\u0196\1\uffff\2\u0196",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA129_eot = DFA.unpackEncodedString(DFA129_eotS);
    static final short[] DFA129_eof = DFA.unpackEncodedString(DFA129_eofS);
    static final char[] DFA129_min = DFA.unpackEncodedStringToUnsignedChars(DFA129_minS);
    static final char[] DFA129_max = DFA.unpackEncodedStringToUnsignedChars(DFA129_maxS);
    static final short[] DFA129_accept = DFA.unpackEncodedString(DFA129_acceptS);
    static final short[] DFA129_special = DFA.unpackEncodedString(DFA129_specialS);
    static final short[][] DFA129_transition;

    static {
        int numStates = DFA129_transitionS.length;
        DFA129_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA129_transition[i] = DFA.unpackEncodedString(DFA129_transitionS[i]);
        }
    }

    class DFA129 extends DFA {

        public DFA129(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 129;
            this.eot = DFA129_eot;
            this.eof = DFA129_eof;
            this.min = DFA129_min;
            this.max = DFA129_max;
            this.accept = DFA129_accept;
            this.special = DFA129_special;
            this.transition = DFA129_transition;
        }
        public String getDescription() {
            return "()* loopback of 390:43: ( column_constraint )*";
        }
    }
 

    public static final BitSet FOLLOW_sql_stmt_in_sql_stmt_list223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_sql_stmt_list226 = new BitSet(new long[]{0x4001100001081400L,0x0100000000040821L,0x8560040000000000L,0x0000000900000001L});
    public static final BitSet FOLLOW_sql_stmt_in_sql_stmt_list230 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_sql_stmt_list232 = new BitSet(new long[]{0x4001100001081400L,0x0100000000040821L,0x8560040000000000L,0x0000000900000001L});
    public static final BitSet FOLLOW_EOF_in_sql_stmt_list240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sql_stmt_in_sql_stmt_itself248 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_sql_stmt_itself251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_sql_stmt_itself256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPLAIN_in_sql_stmt265 = new BitSet(new long[]{0x4001100001081400L,0x0100000000000821L,0x8560240000000000L,0x0000000900000001L});
    public static final BitSet FOLLOW_QUERY_in_sql_stmt268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_PLAN_in_sql_stmt270 = new BitSet(new long[]{0x4001100001081400L,0x0100000000000821L,0x8560040000000000L,0x0000000900000001L});
    public static final BitSet FOLLOW_sql_stmt_core_in_sql_stmt276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_stmt_in_sql_stmt_core286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attach_stmt_in_sql_stmt_core292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_detach_stmt_in_sql_stmt_core298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_analyze_stmt_in_sql_stmt_core304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reindex_stmt_in_sql_stmt_core310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vacuum_stmt_in_sql_stmt_core316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_stmt_in_sql_stmt_core323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_stmt_in_sql_stmt_core329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_stmt_in_sql_stmt_core335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_stmt_in_sql_stmt_core341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_begin_stmt_in_sql_stmt_core347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commit_stmt_in_sql_stmt_core353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rollback_stmt_in_sql_stmt_core359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_savepoint_stmt_in_sql_stmt_core365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_release_stmt_in_sql_stmt_core371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_virtual_table_stmt_in_sql_stmt_core378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_table_stmt_in_sql_stmt_core384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_table_stmt_in_sql_stmt_core390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alter_table_stmt_in_sql_stmt_core396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_view_stmt_in_sql_stmt_core402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_view_stmt_in_sql_stmt_core408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_index_stmt_in_sql_stmt_core414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_index_stmt_in_sql_stmt_core420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_trigger_stmt_in_sql_stmt_core426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_trigger_stmt_in_sql_stmt_core432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_virtual_table_stmt_in_schema_create_table_stmt442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_table_stmt_in_schema_create_table_stmt446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_qualified_table_name456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_qualified_table_name458 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_qualified_table_name464 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_INDEXED_in_qualified_table_name467 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_BY_in_qualified_table_name469 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_qualified_table_name473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_qualified_table_name477 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_INDEXED_in_qualified_table_name479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_subexpr_in_expr488 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_OR_in_expr491 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_or_subexpr_in_expr494 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_and_subexpr_in_or_subexpr503 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_AND_in_or_subexpr506 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_and_subexpr_in_or_subexpr509 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr518 = new BitSet(new long[]{0x0000000002000002L,0x0008000040003000L,0x0010000003C41003L});
    public static final BitSet FOLLOW_cond_expr_in_and_subexpr520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr532 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L,0x0010000000041000L});
    public static final BitSet FOLLOW_match_op_in_cond_expr535 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr539 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_ESCAPE_in_cond_expr542 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr574 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_IN_in_cond_expr577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_cond_expr579 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_cond_expr581 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_COMMA_in_cond_expr584 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_cond_expr586 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_cond_expr590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr612 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_IN_in_cond_expr615 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_cond_expr620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_cond_expr622 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_cond_expr628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr656 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_IN_in_cond_expr659 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_cond_expr662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_select_stmt_in_cond_expr665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_cond_expr668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr675 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_EQUALS_in_cond_expr678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_cond_expr681 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_select_stmt_in_cond_expr684 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_cond_expr687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISNULL_in_cond_expr695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTNULL_in_cond_expr703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_cond_expr711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_NULL_in_cond_expr713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_NULL_in_cond_expr723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_cond_expr731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_NOT_in_cond_expr733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_NULL_in_cond_expr735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_cond_expr746 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_NOT_in_cond_expr748 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr757 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_BETWEEN_in_cond_expr760 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr764 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_AND_in_cond_expr766 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_cond_expr796 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr813 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L,0x0000000003000000L});
    public static final BitSet FOLLOW_neq_subexpr_in_eq_subexpr846 = new BitSet(new long[]{0x0000000000000002L,0x0000000180000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_set_in_eq_subexpr849 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_neq_subexpr_in_eq_subexpr866 = new BitSet(new long[]{0x0000000000000002L,0x0000000180000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_bit_subexpr_in_neq_subexpr875 = new BitSet(new long[]{0x0000000000000802L,0x0000000000000000L,0x0000008000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_set_in_neq_subexpr878 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_bit_subexpr_in_neq_subexpr895 = new BitSet(new long[]{0x0000000000000802L,0x0000000000000000L,0x0000008000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_add_subexpr_in_bit_subexpr904 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000020000080000L});
    public static final BitSet FOLLOW_set_in_bit_subexpr907 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_add_subexpr_in_bit_subexpr916 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000020000080000L});
    public static final BitSet FOLLOW_mul_subexpr_in_add_subexpr925 = new BitSet(new long[]{0x0000000000020002L,0x0000000000000000L,0x0000004000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_set_in_add_subexpr928 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_mul_subexpr_in_add_subexpr941 = new BitSet(new long[]{0x0000000000020002L,0x0000000000000000L,0x0000004000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_con_subexpr_in_mul_subexpr950 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_DOUBLE_PIPE_in_mul_subexpr953 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_con_subexpr_in_mul_subexpr956 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_unary_subexpr_in_con_subexpr965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_op_in_con_subexpr969 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6D16E860A2A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_unary_subexpr_in_con_subexpr971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_expr_in_unary_subexpr1005 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_COLLATE_in_unary_subexpr1008 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_ID_in_unary_subexpr1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_value_in_atom_expr1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bind_parameter_in_atom_expr1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_atom_expr1041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_atom_expr1043 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_atom_expr1049 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_atom_expr1051 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_ID_in_atom_expr1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom_expr1086 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr1088 = new BitSet(new long[]{0xFDE1707F539FB6E0L,0x37F7002A0737CE23L,0x9FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_DISTINCT_in_atom_expr1091 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_atom_expr1096 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_COMMA_in_atom_expr1099 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_atom_expr1103 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_ASTERISK_in_atom_expr1109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr1138 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_atom_expr1141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_atom_expr1150 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr1153 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_atom_expr1156 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_AS_in_atom_expr1158 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_type_name_in_atom_expr1161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_atom_expr1172 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_EXISTS_in_atom_expr1176 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr1180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_select_stmt_in_atom_expr1182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_atom_expr1190 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_atom_expr1195 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_when_expr_in_atom_expr1199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_ELSE_in_atom_expr1203 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_atom_expr1207 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_END_in_atom_expr1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_raise_function_in_atom_expr1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHEN_in_when_expr1244 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_when_expr1248 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_THEN_in_when_expr1250 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_when_expr1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_literal_value1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_literal_value1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal_value1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOB_in_literal_value1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_literal_value1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_TIME_in_literal_value1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_DATE_in_literal_value1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_TIMESTAMP_in_literal_value1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_bind_parameter1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_bind_parameter1397 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_bind_parameter1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_bind_parameter1416 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_bind_parameter1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_bind_parameter1435 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_bind_parameter1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAISE_in_raise_function1460 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_raise_function1463 = new BitSet(new long[]{0x0000000000000020L,0x0002000000100000L,0x0400000000000000L});
    public static final BitSet FOLLOW_IGNORE_in_raise_function1467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_set_in_raise_function1471 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_COMMA_in_raise_function1483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_STRING_in_raise_function1488 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_raise_function1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type_name1501 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_type_name1505 = new BitSet(new long[]{0x0000000000000000L,0x0400000000200000L,0x0000020000080000L});
    public static final BitSet FOLLOW_signed_number_in_type_name1509 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_COMMA_in_type_name1512 = new BitSet(new long[]{0x0000000000000000L,0x0400000000200000L,0x0000020000080000L});
    public static final BitSet FOLLOW_signed_number_in_type_name1516 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_type_name1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_signed_number1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_in_pragma_stmt1574 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_pragma_stmt1579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_pragma_stmt1581 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_pragma_stmt1587 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L,0x0000000000008000L});
    public static final BitSet FOLLOW_EQUALS_in_pragma_stmt1590 = new BitSet(new long[]{0x0000000000000000L,0x0400002000200000L,0x0000020000080000L,0x0000000000000100L});
    public static final BitSet FOLLOW_pragma_value_in_pragma_stmt1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_pragma_stmt1596 = new BitSet(new long[]{0x0000000000000000L,0x0400002000200000L,0x0000020000080000L,0x0000000000000100L});
    public static final BitSet FOLLOW_pragma_value_in_pragma_stmt1598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_pragma_stmt1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signed_number_in_pragma_value1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_pragma_value1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_pragma_value1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTACH_in_attach_stmt1673 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_DATABASE_in_attach_stmt1676 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_attach_stmt1682 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_AS_in_attach_stmt1684 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_attach_stmt1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DETACH_in_detach_stmt1696 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_DATABASE_in_detach_stmt1699 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_detach_stmt1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANALYZE_in_analyze_stmt1713 = new BitSet(new long[]{0xFDE1705F4399B6E2L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_analyze_stmt1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_analyze_stmt1724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_analyze_stmt1726 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_analyze_stmt1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REINDEX_in_reindex_stmt1740 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_reindex_stmt1745 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_reindex_stmt1747 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_reindex_stmt1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VACUUM_in_vacuum_stmt1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_operation_conflict_clause1772 = new BitSet(new long[]{0x0000000000000020L,0x0002000000100000L,0x0500000000000000L});
    public static final BitSet FOLLOW_set_in_operation_conflict_clause1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_ordering_term1799 = new BitSet(new long[]{0x8000000000010002L});
    public static final BitSet FOLLOW_ASC_in_ordering_term1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESC_in_ordering_term1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDER_in_operation_limited_clause1838 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_BY_in_operation_limited_clause1840 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_ordering_term_in_operation_limited_clause1842 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_operation_limited_clause1845 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_ordering_term_in_operation_limited_clause1847 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_LIMIT_in_operation_limited_clause1855 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_operation_limited_clause1859 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_set_in_operation_limited_clause1862 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_operation_limited_clause1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_list_in_select_stmt1882 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000400002000L});
    public static final BitSet FOLLOW_ORDER_in_select_stmt1887 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_BY_in_select_stmt1889 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_ordering_term_in_select_stmt1891 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_select_stmt1894 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_ordering_term_in_select_stmt1896 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_LIMIT_in_select_stmt1905 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_select_stmt1909 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_OFFSET_in_select_stmt1913 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_COMMA_in_select_stmt1917 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_select_stmt1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_core_in_select_list1967 = new BitSet(new long[]{0x0000000000000002L,0x1000000000008000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_select_op_in_select_list1970 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_select_core_in_select_list1973 = new BitSet(new long[]{0x0000000000000002L,0x1000000000008000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_UNION_in_select_op1982 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_ALL_in_select_op1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERSECT_in_select_op1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCEPT_in_select_op1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_core2005 = new BitSet(new long[]{0xFDE1707F539FB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_ALL_in_select_core2008 = new BitSet(new long[]{0xFDE1707F539FB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_DISTINCT_in_select_core2012 = new BitSet(new long[]{0xFDE1707F539FB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_result_column_in_select_core2016 = new BitSet(new long[]{0x0000040000000002L,0x0000000204000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_COMMA_in_select_core2019 = new BitSet(new long[]{0xFDE1707F539FB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_result_column_in_select_core2021 = new BitSet(new long[]{0x0000040000000002L,0x0000000204000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_FROM_in_select_core2026 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E820A2A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_join_source_in_select_core2028 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_WHERE_in_select_core2033 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_select_core2037 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_GROUP_in_select_core2045 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_BY_in_select_core2047 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_ordering_term_in_select_core2049 = new BitSet(new long[]{0x0000040000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_COMMA_in_select_core2052 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_ordering_term_in_select_core2054 = new BitSet(new long[]{0x0000040000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_HAVING_in_select_core2059 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_select_core2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASTERISK_in_result_column2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_result_column2141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_result_column2143 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ASTERISK_in_result_column2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_result_column2160 = new BitSet(new long[]{0xFDE1705F4399B6E2L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_AS_in_result_column2164 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_result_column2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_source_in_join_source2191 = new BitSet(new long[]{0x0020040000000002L,0x0080000000000000L,0x0000001000200220L});
    public static final BitSet FOLLOW_join_op_in_join_source2194 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E820A2A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_single_source_in_join_source2197 = new BitSet(new long[]{0x0020040000000002L,0x0080000000000000L,0x0000001080200220L,0x0000000200000000L});
    public static final BitSet FOLLOW_join_constraint_in_join_source2200 = new BitSet(new long[]{0x0020040000000002L,0x0080000000000000L,0x0000001000200220L});
    public static final BitSet FOLLOW_id_in_single_source2217 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_single_source2219 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_ID_in_single_source2225 = new BitSet(new long[]{0x0000000000008002L,0x0020002000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_AS_in_single_source2229 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_ID_in_single_source2235 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_INDEXED_in_single_source2240 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_BY_in_single_source2242 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_single_source2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_single_source2250 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_INDEXED_in_single_source2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_single_source2293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_select_stmt_in_single_source2295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_single_source2297 = new BitSet(new long[]{0x0000000000008002L,0x0000002000000000L});
    public static final BitSet FOLLOW_AS_in_single_source2301 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_ID_in_single_source2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_single_source2329 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E820A2A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_join_source_in_single_source2332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_single_source2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_join_op2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NATURAL_in_join_op2352 = new BitSet(new long[]{0x0020000000000000L,0x0080000000000000L,0x0000001000000220L});
    public static final BitSet FOLLOW_LEFT_in_join_op2358 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000020L});
    public static final BitSet FOLLOW_OUTER_in_join_op2363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_INNER_in_join_op2369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_CROSS_in_join_op2373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_JOIN_in_join_op2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_join_constraint2387 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_join_constraint2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USING_in_join_constraint2396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_join_constraint2398 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_join_constraint2402 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_COMMA_in_join_constraint2405 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_join_constraint2409 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_join_constraint2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert_stmt2432 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_operation_conflict_clause_in_insert_stmt2435 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_REPLACE_in_insert_stmt2441 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_INTO_in_insert_stmt2444 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_insert_stmt2449 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_insert_stmt2451 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_insert_stmt2457 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000008000L,0x0000001000000001L});
    public static final BitSet FOLLOW_LPAREN_in_insert_stmt2464 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_insert_stmt2468 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_COMMA_in_insert_stmt2471 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_insert_stmt2475 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_stmt2479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000001L});
    public static final BitSet FOLLOW_VALUES_in_insert_stmt2488 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_stmt2490 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_insert_stmt2494 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_COMMA_in_insert_stmt2497 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_insert_stmt2501 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_stmt2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_stmt_in_insert_stmt2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_insert_stmt2516 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_VALUES_in_insert_stmt2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_update_stmt2528 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_operation_conflict_clause_in_update_stmt2531 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_qualified_table_name_in_update_stmt2535 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SET_in_update_stmt2539 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_update_set_in_update_stmt2543 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000000L,0x0000000400002000L,0x0000020000000000L});
    public static final BitSet FOLLOW_COMMA_in_update_stmt2546 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_update_set_in_update_stmt2550 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000000L,0x0000000400002000L,0x0000020000000000L});
    public static final BitSet FOLLOW_WHERE_in_update_stmt2555 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_update_stmt2557 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000400002000L});
    public static final BitSet FOLLOW_operation_limited_clause_in_update_stmt2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_update_set2573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_EQUALS_in_update_set2575 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_update_set2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete_stmt2585 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_FROM_in_delete_stmt2587 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_qualified_table_name_in_delete_stmt2589 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000400002000L,0x0000020000000000L});
    public static final BitSet FOLLOW_WHERE_in_delete_stmt2592 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_delete_stmt2594 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000400002000L});
    public static final BitSet FOLLOW_operation_limited_clause_in_delete_stmt2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_begin_stmt2609 = new BitSet(new long[]{0x2000000000000002L,0x0004000000010000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_TRANSACTION_in_begin_stmt2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_commit_stmt2635 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_TRANSACTION_in_commit_stmt2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROLLBACK_in_rollback_stmt2654 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_TRANSACTION_in_rollback_stmt2657 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_TO_in_rollback_stmt2662 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_SAVEPOINT_in_rollback_stmt2665 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_rollback_stmt2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAVEPOINT_in_savepoint_stmt2681 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_savepoint_stmt2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELEASE_in_release_stmt2693 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_SAVEPOINT_in_release_stmt2696 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_release_stmt2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_table_conflict_clause2714 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_CONFLICT_in_table_conflict_clause2717 = new BitSet(new long[]{0x0000000000000020L,0x0002000000100000L,0x0500000000000000L});
    public static final BitSet FOLLOW_set_in_table_conflict_clause2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_virtual_table_stmt2747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_VIRTUAL_in_create_virtual_table_stmt2749 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_TABLE_in_create_virtual_table_stmt2751 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_create_virtual_table_stmt2756 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_create_virtual_table_stmt2758 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_create_virtual_table_stmt2764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_USING_in_create_virtual_table_stmt2768 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_create_virtual_table_stmt2772 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_create_virtual_table_stmt2775 = new BitSet(new long[]{0xFDE1301F4399B6E0L,0x33FF002A4717CE23L,0x8FFC2D16E8E432A3L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_column_def_in_create_virtual_table_stmt2777 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_COMMA_in_create_virtual_table_stmt2780 = new BitSet(new long[]{0xFDE1301F4399B6E0L,0x33FF002A4717CE23L,0x8FFC2D16E8E432A3L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_column_def_in_create_virtual_table_stmt2782 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_virtual_table_stmt2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_table_stmt2832 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000140000L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_table_stmt2834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_TABLE_in_create_table_stmt2837 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_IF_in_create_table_stmt2840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_NOT_in_create_table_stmt2842 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_EXISTS_in_create_table_stmt2844 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_create_table_stmt2851 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_create_table_stmt2853 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_create_table_stmt2859 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_create_table_stmt2865 = new BitSet(new long[]{0xFDE1301F4399B6E0L,0x33FF002A4717CE23L,0x8FFC2D16E8E432A3L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_column_def_in_create_table_stmt2867 = new BitSet(new long[]{0x0000440800000000L,0x0000000002000000L,0x1000080000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_create_table_stmt2870 = new BitSet(new long[]{0xFDE1301F4399B6E0L,0x33FF002A4717CE23L,0x8FFC2D16E8E432A3L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_column_def_in_create_table_stmt2872 = new BitSet(new long[]{0x0000440800000000L,0x0000000002000000L,0x1000080000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_create_table_stmt2877 = new BitSet(new long[]{0x0000400800000000L,0x0000000002000000L,0x0000080000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_table_constraint_in_create_table_stmt2880 = new BitSet(new long[]{0x0000440800000000L,0x0000000002000000L,0x1000080000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_table_stmt2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_create_table_stmt2890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_select_stmt_in_create_table_stmt2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_column_def_in_column_def2948 = new BitSet(new long[]{0x0800401800000002L,0x0000002000000000L,0x0008080008400000L,0x0000000080000000L});
    public static final BitSet FOLLOW_type_name_in_column_def2950 = new BitSet(new long[]{0x0800401800000002L,0x0000000000000000L,0x0008080008400000L,0x0000000080000000L});
    public static final BitSet FOLLOW_column_constraint_in_column_def2953 = new BitSet(new long[]{0x0800401800000002L,0x0000000000000000L,0x0008080008400000L,0x0000000080000000L});
    public static final BitSet FOLLOW_CONSTRAINT_in_column_constraint2979 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_column_constraint2983 = new BitSet(new long[]{0x0800001800000000L,0x0000000000000000L,0x0008080008400000L,0x0000000080000000L});
    public static final BitSet FOLLOW_column_constraint_pk_in_column_constraint2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_not_null_in_column_constraint2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_null_in_column_constraint3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_unique_in_column_constraint3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_check_in_column_constraint3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_default_in_column_constraint3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_collate_in_column_constraint3027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fk_clause_in_column_constraint3033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMARY_in_column_constraint_pk3093 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEY_in_column_constraint_pk3096 = new BitSet(new long[]{0x8000000000110002L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_pk3108 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_AUTOINCREMENT_in_column_constraint_pk3112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_column_constraint_not_null3121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_NULL_in_column_constraint_not_null3123 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_not_null3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_column_constraint_null3142 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_null3144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIQUE_in_column_constraint_unique3161 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_unique3164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHECK_in_column_constraint_check3172 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_column_constraint_check3175 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_column_constraint_check3178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_column_constraint_check3180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_numeric_literal_value3191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_numeric_literal_value3205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_signed_default_number3223 = new BitSet(new long[]{0x0000000000000000L,0x0400000000200000L});
    public static final BitSet FOLLOW_numeric_literal_value_in_signed_default_number3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_column_constraint_default3240 = new BitSet(new long[]{0x01C0000010000000L,0x0400000000200000L,0x0000020008088000L,0x0000000000000100L});
    public static final BitSet FOLLOW_signed_default_number_in_column_constraint_default3244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_value_in_column_constraint_default3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_column_constraint_default3252 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_column_constraint_default3255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_column_constraint_default3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLLATE_in_column_constraint_collate3266 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_column_constraint_collate3271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRAINT_in_table_constraint3280 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_table_constraint3284 = new BitSet(new long[]{0x0000000800000000L,0x0000000002000000L,0x0000080000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_table_constraint_pk_in_table_constraint3292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_constraint_unique_in_table_constraint3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_constraint_check_in_table_constraint3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_constraint_fk_in_table_constraint3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMARY_in_table_constraint_pk3350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEY_in_table_constraint_pk3352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_pk3356 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_table_constraint_pk3360 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_COMMA_in_table_constraint_pk3363 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_table_constraint_pk3367 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_pk3371 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_table_conflict_clause_in_table_constraint_pk3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIQUE_in_table_constraint_unique3398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_unique3402 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_table_constraint_unique3406 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_COMMA_in_table_constraint_unique3409 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_table_constraint_unique3413 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_unique3417 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_table_conflict_clause_in_table_constraint_unique3419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHECK_in_table_constraint_check3444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_check3447 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_table_constraint_check3450 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_check3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREIGN_in_table_constraint_fk3460 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEY_in_table_constraint_fk3462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_fk3464 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_table_constraint_fk3468 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_COMMA_in_table_constraint_fk3471 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_table_constraint_fk3475 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_fk3479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_fk_clause_in_table_constraint_fk3481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REFERENCES_in_fk_clause3504 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_fk_clause3508 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000000L,0x0000000080448000L});
    public static final BitSet FOLLOW_LPAREN_in_fk_clause3511 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_fk_clause3515 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_COMMA_in_fk_clause3518 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_fk_clause3522 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_fk_clause3526 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000000L,0x0000000080440000L});
    public static final BitSet FOLLOW_fk_clause_action_in_fk_clause3532 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000000L,0x0000000080440000L});
    public static final BitSet FOLLOW_fk_clause_deferrable_in_fk_clause3535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_fk_clause_action3569 = new BitSet(new long[]{0x4000000000000000L,0x0100000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_set_in_fk_clause_action3572 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000000L,0x0200000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SET_in_fk_clause_action3585 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_NULL_in_fk_clause_action3588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_fk_clause_action3592 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_DEFAULT_in_fk_clause_action3595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASCADE_in_fk_clause_action3599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RESTRICT_in_fk_clause_action3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MATCH_in_fk_clause_action3610 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_fk_clause_action3613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_fk_clause_deferrable3621 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_DEFERRABLE_in_fk_clause_deferrable3625 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_INITIALLY_in_fk_clause_deferrable3629 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_DEFERRED_in_fk_clause_deferrable3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INITIALLY_in_fk_clause_deferrable3636 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_IMMEDIATE_in_fk_clause_deferrable3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_table_stmt3649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_TABLE_in_drop_table_stmt3651 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_IF_in_drop_table_stmt3654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_table_stmt3656 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_drop_table_stmt3663 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_drop_table_stmt3665 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_drop_table_stmt3671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALTER_in_alter_table_stmt3701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_TABLE_in_alter_table_stmt3703 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_alter_table_stmt3708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_alter_table_stmt3710 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_alter_table_stmt3716 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_RENAME_in_alter_table_stmt3719 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_TO_in_alter_table_stmt3721 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_alter_table_stmt3725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_alter_table_stmt3729 = new BitSet(new long[]{0xFDE1305F4399B6E0L,0x33FF002A4717CE23L,0x8FFC2D16E8E432A3L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_COLUMN_in_alter_table_stmt3732 = new BitSet(new long[]{0xFDE1301F4399B6E0L,0x33FF002A4717CE23L,0x8FFC2D16E8E432A3L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_column_def_in_alter_table_stmt3736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_view_stmt3745 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000100000L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_view_stmt3747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_VIEW_in_create_view_stmt3750 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_IF_in_create_view_stmt3753 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_NOT_in_create_view_stmt3755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_EXISTS_in_create_view_stmt3757 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_create_view_stmt3764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_create_view_stmt3766 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_create_view_stmt3772 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_AS_in_create_view_stmt3774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_select_stmt_in_create_view_stmt3778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_view_stmt3819 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_VIEW_in_drop_view_stmt3821 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_IF_in_drop_view_stmt3824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_view_stmt3826 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_drop_view_stmt3833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_drop_view_stmt3835 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_drop_view_stmt3841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_index_stmt3849 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_UNIQUE_in_create_index_stmt3852 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_INDEX_in_create_index_stmt3856 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_IF_in_create_index_stmt3859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_NOT_in_create_index_stmt3861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_EXISTS_in_create_index_stmt3863 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_create_index_stmt3870 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_create_index_stmt3872 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_create_index_stmt3878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_ON_in_create_index_stmt3882 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_create_index_stmt3886 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_create_index_stmt3888 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_indexed_column_in_create_index_stmt3892 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_COMMA_in_create_index_stmt3895 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_indexed_column_in_create_index_stmt3899 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_index_stmt3903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_indexed_column3949 = new BitSet(new long[]{0x8000001000010002L});
    public static final BitSet FOLLOW_COLLATE_in_indexed_column3952 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_indexed_column3956 = new BitSet(new long[]{0x8000000000010002L});
    public static final BitSet FOLLOW_ASC_in_indexed_column3961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESC_in_indexed_column3965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_index_stmt3996 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_INDEX_in_drop_index_stmt3998 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_IF_in_drop_index_stmt4001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_index_stmt4003 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_drop_index_stmt4010 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_drop_index_stmt4012 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_drop_index_stmt4018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_trigger_stmt4048 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002100000L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_trigger_stmt4050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_TRIGGER_in_create_trigger_stmt4053 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_IF_in_create_trigger_stmt4056 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_NOT_in_create_trigger_stmt4058 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_EXISTS_in_create_trigger_stmt4060 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt4067 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_create_trigger_stmt4069 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt4075 = new BitSet(new long[]{0x4000000000800080L,0x0300000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_BEFORE_in_create_trigger_stmt4080 = new BitSet(new long[]{0x4000000000000000L,0x0100000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_AFTER_in_create_trigger_stmt4084 = new BitSet(new long[]{0x4000000000000000L,0x0100000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_INSTEAD_in_create_trigger_stmt4088 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_OF_in_create_trigger_stmt4090 = new BitSet(new long[]{0x4000000000000000L,0x0100000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_DELETE_in_create_trigger_stmt4095 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_INSERT_in_create_trigger_stmt4099 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_UPDATE_in_create_trigger_stmt4103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000A0000000L});
    public static final BitSet FOLLOW_OF_in_create_trigger_stmt4106 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt4110 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_create_trigger_stmt4113 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt4117 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_ON_in_create_trigger_stmt4126 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt4130 = new BitSet(new long[]{0x0000000001000000L,0x0000000001000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_FOR_in_create_trigger_stmt4133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_EACH_in_create_trigger_stmt4135 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_ROW_in_create_trigger_stmt4137 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_WHEN_in_create_trigger_stmt4142 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_create_trigger_stmt4144 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_BEGIN_in_create_trigger_stmt4150 = new BitSet(new long[]{0x4000000000000000L,0x0100000000000000L,0x0100000000000000L,0x0000000100000001L});
    public static final BitSet FOLLOW_update_stmt_in_create_trigger_stmt4154 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_insert_stmt_in_create_trigger_stmt4158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_delete_stmt_in_create_trigger_stmt4162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_select_stmt_in_create_trigger_stmt4166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_create_trigger_stmt4169 = new BitSet(new long[]{0x4000000000000000L,0x0100000000000800L,0x0100000000000000L,0x0000000100000001L});
    public static final BitSet FOLLOW_END_in_create_trigger_stmt4173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_trigger_stmt4206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_TRIGGER_in_drop_trigger_stmt4208 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_IF_in_drop_trigger_stmt4211 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_trigger_stmt4213 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_drop_trigger_stmt4220 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_drop_trigger_stmt4222 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_drop_trigger_stmt4228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_id_core4238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_core_in_id4257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_id4261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_core_in_id_column_def4935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_column_def_in_id_column_def4939 = new BitSet(new long[]{0x0000000000000002L});

}