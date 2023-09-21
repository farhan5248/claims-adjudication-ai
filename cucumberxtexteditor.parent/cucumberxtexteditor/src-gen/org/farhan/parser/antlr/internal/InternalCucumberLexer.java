package org.farhan.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCucumberLexer extends Lexer {
    public static final int T__9=9;
    public static final int RULE_EOL=5;
    public static final int RULE_WS=7;
    public static final int RULE_WORD=6;
    public static final int RULE_COMMENT=8;
    public static final int RULE_TAG=4;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__10=10;

    // delegates
    // delegators

    public InternalCucumberLexer() {;} 
    public InternalCucumberLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCucumberLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalCucumber.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:11:6: ( 'Feature:' )
            // InternalCucumber.g:11:8: 'Feature:'
            {
            match("Feature:"); 


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
            // InternalCucumber.g:12:7: ( 'Background:' )
            // InternalCucumber.g:12:9: 'Background:'
            {
            match("Background:"); 


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
            // InternalCucumber.g:13:7: ( 'Scenario:' )
            // InternalCucumber.g:13:9: 'Scenario:'
            {
            match("Scenario:"); 


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
            // InternalCucumber.g:14:7: ( 'Given' )
            // InternalCucumber.g:14:9: 'Given'
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
            // InternalCucumber.g:15:7: ( 'When' )
            // InternalCucumber.g:15:9: 'When'
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
            // InternalCucumber.g:16:7: ( 'Then' )
            // InternalCucumber.g:16:9: 'Then'
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
            // InternalCucumber.g:17:7: ( 'And' )
            // InternalCucumber.g:17:9: 'And'
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
            // InternalCucumber.g:18:7: ( 'But' )
            // InternalCucumber.g:18:9: 'But'
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
            // InternalCucumber.g:19:7: ( '*' )
            // InternalCucumber.g:19:9: '*'
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:564:9: ( ( ' ' | '\\t' )+ )
            // InternalCucumber.g:564:11: ( ' ' | '\\t' )+
            {
            // InternalCucumber.g:564:11: ( ' ' | '\\t' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\t'||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCucumber.g:
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
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_EOL"
    public final void mRULE_EOL() throws RecognitionException {
        try {
            int _type = RULE_EOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:566:10: ( ( '\\r' | '\\n' )+ )
            // InternalCucumber.g:566:12: ( '\\r' | '\\n' )+
            {
            // InternalCucumber.g:566:12: ( '\\r' | '\\n' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\n'||LA2_0=='\r') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCucumber.g:
            	    {
            	    if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EOL"

    // $ANTLR start "RULE_COMMENT"
    public final void mRULE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:568:14: ( '#' (~ ( ( '\\r' | '\\n' ) ) )* RULE_EOL )
            // InternalCucumber.g:568:16: '#' (~ ( ( '\\r' | '\\n' ) ) )* RULE_EOL
            {
            match('#'); 
            // InternalCucumber.g:568:20: (~ ( ( '\\r' | '\\n' ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCucumber.g:568:20: ~ ( ( '\\r' | '\\n' ) )
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
            	    break loop3;
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
    // $ANTLR end "RULE_COMMENT"

    // $ANTLR start "RULE_WORD"
    public final void mRULE_WORD() throws RecognitionException {
        try {
            int _type = RULE_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:570:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '\\'' )+ )
            // InternalCucumber.g:570:13: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '\\'' )+
            {
            // InternalCucumber.g:570:13: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '\\'' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\''||(LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCucumber.g:
            	    {
            	    if ( input.LA(1)=='\''||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WORD"

    // $ANTLR start "RULE_TAG"
    public final void mRULE_TAG() throws RecognitionException {
        try {
            int _type = RULE_TAG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCucumber.g:572:10: ( '@' RULE_WORD )
            // InternalCucumber.g:572:12: '@' RULE_WORD
            {
            match('@'); 
            mRULE_WORD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TAG"

    public void mTokens() throws RecognitionException {
        // InternalCucumber.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | RULE_WS | RULE_EOL | RULE_COMMENT | RULE_WORD | RULE_TAG )
        int alt5=14;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // InternalCucumber.g:1:10: T__9
                {
                mT__9(); 

                }
                break;
            case 2 :
                // InternalCucumber.g:1:15: T__10
                {
                mT__10(); 

                }
                break;
            case 3 :
                // InternalCucumber.g:1:21: T__11
                {
                mT__11(); 

                }
                break;
            case 4 :
                // InternalCucumber.g:1:27: T__12
                {
                mT__12(); 

                }
                break;
            case 5 :
                // InternalCucumber.g:1:33: T__13
                {
                mT__13(); 

                }
                break;
            case 6 :
                // InternalCucumber.g:1:39: T__14
                {
                mT__14(); 

                }
                break;
            case 7 :
                // InternalCucumber.g:1:45: T__15
                {
                mT__15(); 

                }
                break;
            case 8 :
                // InternalCucumber.g:1:51: T__16
                {
                mT__16(); 

                }
                break;
            case 9 :
                // InternalCucumber.g:1:57: T__17
                {
                mT__17(); 

                }
                break;
            case 10 :
                // InternalCucumber.g:1:63: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 11 :
                // InternalCucumber.g:1:71: RULE_EOL
                {
                mRULE_EOL(); 

                }
                break;
            case 12 :
                // InternalCucumber.g:1:80: RULE_COMMENT
                {
                mRULE_COMMENT(); 

                }
                break;
            case 13 :
                // InternalCucumber.g:1:93: RULE_WORD
                {
                mRULE_WORD(); 

                }
                break;
            case 14 :
                // InternalCucumber.g:1:103: RULE_TAG
                {
                mRULE_TAG(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\1\uffff\7\14\6\uffff\12\14\1\40\4\14\1\45\2\14\1\uffff\2\14\1\52\1\53\1\uffff\3\14\1\57\2\uffff\3\14\1\uffff\3\14\1\uffff\3\14\1\uffff\1\14\1\uffff";
    static final String DFA5_eofS =
        "\72\uffff";
    static final String DFA5_minS =
        "\1\11\1\145\1\141\1\143\1\151\2\150\1\156\6\uffff\1\141\1\143\1\164\1\145\1\166\2\145\1\144\1\164\1\153\1\47\1\156\1\145\2\156\1\47\1\165\1\147\1\uffff\1\141\1\156\2\47\1\uffff\3\162\1\47\2\uffff\1\145\1\157\1\151\1\uffff\1\72\1\165\1\157\1\uffff\1\156\1\72\1\144\1\uffff\1\72\1\uffff";
    static final String DFA5_maxS =
        "\1\172\1\145\1\165\1\143\1\151\2\150\1\156\6\uffff\1\141\1\143\1\164\1\145\1\166\2\145\1\144\1\164\1\153\1\172\1\156\1\145\2\156\1\172\1\165\1\147\1\uffff\1\141\1\156\2\172\1\uffff\3\162\1\172\2\uffff\1\145\1\157\1\151\1\uffff\1\72\1\165\1\157\1\uffff\1\156\1\72\1\144\1\uffff\1\72\1\uffff";
    static final String DFA5_acceptS =
        "\10\uffff\1\11\1\12\1\13\1\14\1\15\1\16\22\uffff\1\10\4\uffff\1\7\4\uffff\1\5\1\6\3\uffff\1\4\3\uffff\1\1\3\uffff\1\3\1\uffff\1\2";
    static final String DFA5_specialS =
        "\72\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\11\1\12\2\uffff\1\12\22\uffff\1\11\2\uffff\1\13\3\uffff\1\14\2\uffff\1\10\5\uffff\12\14\6\uffff\1\15\1\7\1\2\3\14\1\1\1\4\13\14\1\3\1\6\2\14\1\5\3\14\6\uffff\32\14",
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
            "\1\14\10\uffff\12\14\7\uffff\32\14\6\uffff\32\14",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\14\10\uffff\12\14\7\uffff\32\14\6\uffff\32\14",
            "\1\46",
            "\1\47",
            "",
            "\1\50",
            "\1\51",
            "\1\14\10\uffff\12\14\7\uffff\32\14\6\uffff\32\14",
            "\1\14\10\uffff\12\14\7\uffff\32\14\6\uffff\32\14",
            "",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\14\10\uffff\12\14\7\uffff\32\14\6\uffff\32\14",
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
            "\1\67",
            "\1\70",
            "",
            "\1\71",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | RULE_WS | RULE_EOL | RULE_COMMENT | RULE_WORD | RULE_TAG );";
        }
    }
 

}