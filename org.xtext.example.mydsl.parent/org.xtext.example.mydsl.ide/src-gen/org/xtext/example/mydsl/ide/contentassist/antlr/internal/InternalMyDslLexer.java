package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int RULE_ID=4;
    public static final int RULE_EOL=5;
    public static final int RULE_WS=6;
    public static final int RULE_SL_COMMENT=7;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__10=10;

    // delegates
    // delegators

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:11:6: ( 'Feature:' )
            // InternalMyDsl.g:11:8: 'Feature:'
            {
            match("Feature:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:12:6: ( 'Background:' )
            // InternalMyDsl.g:12:8: 'Background:'
            {
            match("Background:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13:7: ( 'Scenario:' )
            // InternalMyDsl.g:13:9: 'Scenario:'
            {
            match("Scenario:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:14:7: ( 'Scenario Outline:' )
            // InternalMyDsl.g:14:9: 'Scenario Outline:'
            {
            match("Scenario Outline:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15:7: ( 'Given' )
            // InternalMyDsl.g:15:9: 'Given'
            {
            match("Given"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:16:7: ( 'When' )
            // InternalMyDsl.g:16:9: 'When'
            {
            match("When"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:17:7: ( 'Then' )
            // InternalMyDsl.g:17:9: 'Then'
            {
            match("Then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:18:7: ( 'And' )
            // InternalMyDsl.g:18:9: 'And'
            {
            match("And"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:19:7: ( 'But' )
            // InternalMyDsl.g:19:9: 'But'
            {
            match("But"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:20:7: ( '*' )
            // InternalMyDsl.g:20:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:21:7: ( '@' )
            // InternalMyDsl.g:21:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2249:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '0' .. '9' )* )
            // InternalMyDsl.g:2249:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '0' .. '9' )*
            {
            // InternalMyDsl.g:2249:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:2249:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( input.LA(1)=='.'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:2249:44: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='.'||(LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( input.LA(1)=='.'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2251:9: ( ( ' ' | '\\t' )+ )
            // InternalMyDsl.g:2251:11: ( ' ' | '\\t' )+
            {
            // InternalMyDsl.g:2251:11: ( ' ' | '\\t' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\t'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2253:17: ( '#' (~ ( ( '\\r' | '\\n' ) ) )* RULE_EOL )
            // InternalMyDsl.g:2253:19: '#' (~ ( ( '\\r' | '\\n' ) ) )* RULE_EOL
            {
            match('#'); 
            // InternalMyDsl.g:2253:23: (~ ( ( '\\r' | '\\n' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:2253:23: ~ ( ( '\\r' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            mRULE_EOL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_EOL"
    public final void mRULE_EOL() throws RecognitionException {
        try {
            int _type = RULE_EOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2255:10: ( ( '\\r\\n' )+ )
            // InternalMyDsl.g:2255:12: ( '\\r\\n' )+
            {
            // InternalMyDsl.g:2255:12: ( '\\r\\n' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\r') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:2255:12: '\\r\\n'
            	    {
            	    match("\r\n"); 


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EOL"

    public void mTokens() throws RecognitionException {
        // InternalMyDsl.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | RULE_ID | RULE_WS | RULE_SL_COMMENT | RULE_EOL )
        int alt6=15;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // InternalMyDsl.g:1:10: T__8
                {
                mT__8(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:15: T__9
                {
                mT__9(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:20: T__10
                {
                mT__10(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:26: T__11
                {
                mT__11(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:32: T__12
                {
                mT__12(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:38: T__13
                {
                mT__13(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:44: T__14
                {
                mT__14(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:50: T__15
                {
                mT__15(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:56: T__16
                {
                mT__16(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:62: T__17
                {
                mT__17(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:68: T__18
                {
                mT__18(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:74: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:82: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:90: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 15 :
                // InternalMyDsl.g:1:106: RULE_EOL
                {
                mRULE_EOL(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\uffff\7\12\6\uffff\12\12\1\40\4\12\1\45\2\12\1\uffff\2\12\1\52\1\53\1\uffff\3\12\1\57\2\uffff\3\12\1\uffff\3\12\1\uffff\3\12\2\uffff\1\12\1\uffff";
    static final String DFA6_eofS =
        "\73\uffff";
    static final String DFA6_minS =
        "\1\11\1\145\1\141\1\143\1\151\2\150\1\156\6\uffff\1\141\1\143\1\164\1\145\1\166\2\145\1\144\1\164\1\153\1\56\1\156\1\145\2\156\1\56\1\165\1\147\1\uffff\1\141\1\156\2\56\1\uffff\3\162\1\56\2\uffff\1\145\1\157\1\151\1\uffff\1\72\1\165\1\157\1\uffff\1\156\1\40\1\144\2\uffff\1\72\1\uffff";
    static final String DFA6_maxS =
        "\1\172\1\145\1\165\1\143\1\151\2\150\1\156\6\uffff\1\141\1\143\1\164\1\145\1\166\2\145\1\144\1\164\1\153\1\172\1\156\1\145\2\156\1\172\1\165\1\147\1\uffff\1\141\1\156\2\172\1\uffff\3\162\1\172\2\uffff\1\145\1\157\1\151\1\uffff\1\72\1\165\1\157\1\uffff\1\156\1\72\1\144\2\uffff\1\72\1\uffff";
    static final String DFA6_acceptS =
        "\10\uffff\1\12\1\13\1\14\1\15\1\16\1\17\22\uffff\1\11\4\uffff\1\10\4\uffff\1\6\1\7\3\uffff\1\5\3\uffff\1\1\3\uffff\1\3\1\4\1\uffff\1\2";
    static final String DFA6_specialS =
        "\73\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\13\3\uffff\1\15\22\uffff\1\13\2\uffff\1\14\6\uffff\1\10\3\uffff\1\12\21\uffff\1\11\1\7\1\2\3\12\1\1\1\4\13\12\1\3\1\6\2\12\1\5\3\12\3\uffff\2\12\1\uffff\32\12",
            "\1\16",
            "\1\17\23\uffff\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\12\1\uffff\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\12\1\uffff\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\1\46",
            "\1\47",
            "",
            "\1\50",
            "\1\51",
            "\1\12\1\uffff\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\1\12\1\uffff\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\12\1\uffff\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "",
            "",
            "\1\60",
            "\1\61",
            "\1\62",
            "",
            "\1\63",
            "\1\64",
            "\1\65",
            "",
            "\1\66",
            "\1\70\31\uffff\1\67",
            "\1\71",
            "",
            "",
            "\1\72",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | RULE_ID | RULE_WS | RULE_SL_COMMENT | RULE_EOL );";
        }
    }
 

}