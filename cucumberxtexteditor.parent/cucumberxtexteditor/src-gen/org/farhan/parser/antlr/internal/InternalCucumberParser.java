package org.farhan.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.farhan.services.CucumberGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCucumberParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EOL", "RULE_ID", "RULE_WS", "RULE_SL_COMMENT", "'Feature:'", "'Background:'", "'Scenario:'", "'Scenario Outline:'", "'Examples:'", "'|'", "'\"\"\"'", "'Given'", "'When'", "'Then'", "'And'", "'But'", "'*'", "'@'"
    };
    public static final int RULE_SL_COMMENT=7;
    public static final int T__19=19;
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
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int RULE_ID=5;
    public static final int RULE_EOL=4;
    public static final int RULE_WS=6;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalCucumberParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCucumberParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCucumberParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCucumber.g"; }



     	private CucumberGrammarAccess grammarAccess;

        public InternalCucumberParser(TokenStream input, CucumberGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Feature";
       	}

       	@Override
       	protected CucumberGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFeature"
    // InternalCucumber.g:64:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalCucumber.g:64:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalCucumber.g:65:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalCucumber.g:71:1: ruleFeature returns [EObject current=null] : ( ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Feature:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_abstractScenarios_6_0= ruleAbstractScenario ) )* ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token this_EOL_1=null;
        Token otherlv_2=null;
        Token this_EOL_4=null;
        EObject lv_tags_0_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_statements_5_0 = null;

        EObject lv_abstractScenarios_6_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:77:2: ( ( ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Feature:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_abstractScenarios_6_0= ruleAbstractScenario ) )* ) )
            // InternalCucumber.g:78:2: ( ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Feature:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_abstractScenarios_6_0= ruleAbstractScenario ) )* )
            {
            // InternalCucumber.g:78:2: ( ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Feature:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_abstractScenarios_6_0= ruleAbstractScenario ) )* )
            // InternalCucumber.g:79:3: ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Feature:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_abstractScenarios_6_0= ruleAbstractScenario ) )*
            {
            // InternalCucumber.g:79:3: ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCucumber.g:80:4: ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL
                    {
                    // InternalCucumber.g:80:4: ( (lv_tags_0_0= ruleTag ) )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==21) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalCucumber.g:81:5: (lv_tags_0_0= ruleTag )
                    	    {
                    	    // InternalCucumber.g:81:5: (lv_tags_0_0= ruleTag )
                    	    // InternalCucumber.g:82:6: lv_tags_0_0= ruleTag
                    	    {

                    	    						newCompositeNode(grammarAccess.getFeatureAccess().getTagsTagParserRuleCall_0_0_0());
                    	    					
                    	    pushFollow(FOLLOW_3);
                    	    lv_tags_0_0=ruleTag();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getFeatureRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"tags",
                    	    							lv_tags_0_0,
                    	    							"org.farhan.Cucumber.Tag");
                    	    						afterParserOrEnumRuleCall();
                    	    					

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

                    this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_4); 

                    				newLeafNode(this_EOL_1, grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,8,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getFeatureKeyword_1());
            		
            // InternalCucumber.g:108:3: ( (lv_name_3_0= rulePhrase ) )
            // InternalCucumber.g:109:4: (lv_name_3_0= rulePhrase )
            {
            // InternalCucumber.g:109:4: (lv_name_3_0= rulePhrase )
            // InternalCucumber.g:110:5: lv_name_3_0= rulePhrase
            {

            					newCompositeNode(grammarAccess.getFeatureAccess().getNamePhraseParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_3_0=rulePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.farhan.Cucumber.Phrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_4=(Token)match(input,RULE_EOL,FOLLOW_7); 

            			newLeafNode(this_EOL_4, grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_3());
            		
            // InternalCucumber.g:131:3: ( (lv_statements_5_0= ruleStatement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCucumber.g:132:4: (lv_statements_5_0= ruleStatement )
            	    {
            	    // InternalCucumber.g:132:4: (lv_statements_5_0= ruleStatement )
            	    // InternalCucumber.g:133:5: lv_statements_5_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureAccess().getStatementsStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_statements_5_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_5_0,
            	    						"org.farhan.Cucumber.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalCucumber.g:150:3: ( (lv_abstractScenarios_6_0= ruleAbstractScenario ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=9 && LA4_0<=11)||LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCucumber.g:151:4: (lv_abstractScenarios_6_0= ruleAbstractScenario )
            	    {
            	    // InternalCucumber.g:151:4: (lv_abstractScenarios_6_0= ruleAbstractScenario )
            	    // InternalCucumber.g:152:5: lv_abstractScenarios_6_0= ruleAbstractScenario
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureAccess().getAbstractScenariosAbstractScenarioParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_abstractScenarios_6_0=ruleAbstractScenario();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"abstractScenarios",
            	    						lv_abstractScenarios_6_0,
            	    						"org.farhan.Cucumber.AbstractScenario");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleAbstractScenario"
    // InternalCucumber.g:173:1: entryRuleAbstractScenario returns [EObject current=null] : iv_ruleAbstractScenario= ruleAbstractScenario EOF ;
    public final EObject entryRuleAbstractScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractScenario = null;


        try {
            // InternalCucumber.g:173:57: (iv_ruleAbstractScenario= ruleAbstractScenario EOF )
            // InternalCucumber.g:174:2: iv_ruleAbstractScenario= ruleAbstractScenario EOF
            {
             newCompositeNode(grammarAccess.getAbstractScenarioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractScenario=ruleAbstractScenario();

            state._fsp--;

             current =iv_ruleAbstractScenario; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractScenario"


    // $ANTLR start "ruleAbstractScenario"
    // InternalCucumber.g:180:1: ruleAbstractScenario returns [EObject current=null] : (this_Background_0= ruleBackground | this_Scenario_1= ruleScenario | this_ScenarioOutline_2= ruleScenarioOutline ) ;
    public final EObject ruleAbstractScenario() throws RecognitionException {
        EObject current = null;

        EObject this_Background_0 = null;

        EObject this_Scenario_1 = null;

        EObject this_ScenarioOutline_2 = null;



        	enterRule();

        try {
            // InternalCucumber.g:186:2: ( (this_Background_0= ruleBackground | this_Scenario_1= ruleScenario | this_ScenarioOutline_2= ruleScenarioOutline ) )
            // InternalCucumber.g:187:2: (this_Background_0= ruleBackground | this_Scenario_1= ruleScenario | this_ScenarioOutline_2= ruleScenarioOutline )
            {
            // InternalCucumber.g:187:2: (this_Background_0= ruleBackground | this_Scenario_1= ruleScenario | this_ScenarioOutline_2= ruleScenarioOutline )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalCucumber.g:188:3: this_Background_0= ruleBackground
                    {

                    			newCompositeNode(grammarAccess.getAbstractScenarioAccess().getBackgroundParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Background_0=ruleBackground();

                    state._fsp--;


                    			current = this_Background_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCucumber.g:197:3: this_Scenario_1= ruleScenario
                    {

                    			newCompositeNode(grammarAccess.getAbstractScenarioAccess().getScenarioParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Scenario_1=ruleScenario();

                    state._fsp--;


                    			current = this_Scenario_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCucumber.g:206:3: this_ScenarioOutline_2= ruleScenarioOutline
                    {

                    			newCompositeNode(grammarAccess.getAbstractScenarioAccess().getScenarioOutlineParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScenarioOutline_2=ruleScenarioOutline();

                    state._fsp--;


                    			current = this_ScenarioOutline_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractScenario"


    // $ANTLR start "entryRuleBackground"
    // InternalCucumber.g:218:1: entryRuleBackground returns [EObject current=null] : iv_ruleBackground= ruleBackground EOF ;
    public final EObject entryRuleBackground() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackground = null;


        try {
            // InternalCucumber.g:218:51: (iv_ruleBackground= ruleBackground EOF )
            // InternalCucumber.g:219:2: iv_ruleBackground= ruleBackground EOF
            {
             newCompositeNode(grammarAccess.getBackgroundRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBackground=ruleBackground();

            state._fsp--;

             current =iv_ruleBackground; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBackground"


    // $ANTLR start "ruleBackground"
    // InternalCucumber.g:225:1: ruleBackground returns [EObject current=null] : (otherlv_0= 'Background:' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )* ( (lv_steps_4_0= ruleStep ) )* ) ;
    public final EObject ruleBackground() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_EOL_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_statements_3_0 = null;

        EObject lv_steps_4_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:231:2: ( (otherlv_0= 'Background:' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )* ( (lv_steps_4_0= ruleStep ) )* ) )
            // InternalCucumber.g:232:2: (otherlv_0= 'Background:' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )* ( (lv_steps_4_0= ruleStep ) )* )
            {
            // InternalCucumber.g:232:2: (otherlv_0= 'Background:' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )* ( (lv_steps_4_0= ruleStep ) )* )
            // InternalCucumber.g:233:3: otherlv_0= 'Background:' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( (lv_statements_3_0= ruleStatement ) )* ( (lv_steps_4_0= ruleStep ) )*
            {
            otherlv_0=(Token)match(input,9,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBackgroundAccess().getBackgroundKeyword_0());
            		
            // InternalCucumber.g:237:3: ( (lv_name_1_0= rulePhrase ) )
            // InternalCucumber.g:238:4: (lv_name_1_0= rulePhrase )
            {
            // InternalCucumber.g:238:4: (lv_name_1_0= rulePhrase )
            // InternalCucumber.g:239:5: lv_name_1_0= rulePhrase
            {

            					newCompositeNode(grammarAccess.getBackgroundAccess().getNamePhraseParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_1_0=rulePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBackgroundRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.farhan.Cucumber.Phrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_2=(Token)match(input,RULE_EOL,FOLLOW_9); 

            			newLeafNode(this_EOL_2, grammarAccess.getBackgroundAccess().getEOLTerminalRuleCall_2());
            		
            // InternalCucumber.g:260:3: ( (lv_statements_3_0= ruleStatement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCucumber.g:261:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalCucumber.g:261:4: (lv_statements_3_0= ruleStatement )
            	    // InternalCucumber.g:262:5: lv_statements_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getBackgroundAccess().getStatementsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_statements_3_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBackgroundRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_3_0,
            	    						"org.farhan.Cucumber.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalCucumber.g:279:3: ( (lv_steps_4_0= ruleStep ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=15 && LA7_0<=20)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCucumber.g:280:4: (lv_steps_4_0= ruleStep )
            	    {
            	    // InternalCucumber.g:280:4: (lv_steps_4_0= ruleStep )
            	    // InternalCucumber.g:281:5: lv_steps_4_0= ruleStep
            	    {

            	    					newCompositeNode(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_steps_4_0=ruleStep();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBackgroundRule());
            	    					}
            	    					add(
            	    						current,
            	    						"steps",
            	    						lv_steps_4_0,
            	    						"org.farhan.Cucumber.Step");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBackground"


    // $ANTLR start "entryRuleScenario"
    // InternalCucumber.g:302:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // InternalCucumber.g:302:49: (iv_ruleScenario= ruleScenario EOF )
            // InternalCucumber.g:303:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // InternalCucumber.g:309:1: ruleScenario returns [EObject current=null] : ( ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Scenario:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token this_EOL_1=null;
        Token otherlv_2=null;
        Token this_EOL_4=null;
        EObject lv_tags_0_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_statements_5_0 = null;

        EObject lv_steps_6_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:315:2: ( ( ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Scenario:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* ) )
            // InternalCucumber.g:316:2: ( ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Scenario:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* )
            {
            // InternalCucumber.g:316:2: ( ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Scenario:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* )
            // InternalCucumber.g:317:3: ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Scenario:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )*
            {
            // InternalCucumber.g:317:3: ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCucumber.g:318:4: ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL
                    {
                    // InternalCucumber.g:318:4: ( (lv_tags_0_0= ruleTag ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==21) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalCucumber.g:319:5: (lv_tags_0_0= ruleTag )
                    	    {
                    	    // InternalCucumber.g:319:5: (lv_tags_0_0= ruleTag )
                    	    // InternalCucumber.g:320:6: lv_tags_0_0= ruleTag
                    	    {

                    	    						newCompositeNode(grammarAccess.getScenarioAccess().getTagsTagParserRuleCall_0_0_0());
                    	    					
                    	    pushFollow(FOLLOW_3);
                    	    lv_tags_0_0=ruleTag();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getScenarioRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"tags",
                    	    							lv_tags_0_0,
                    	    							"org.farhan.Cucumber.Tag");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_11); 

                    				newLeafNode(this_EOL_1, grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,10,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getScenarioKeyword_1());
            		
            // InternalCucumber.g:346:3: ( (lv_name_3_0= rulePhrase ) )
            // InternalCucumber.g:347:4: (lv_name_3_0= rulePhrase )
            {
            // InternalCucumber.g:347:4: (lv_name_3_0= rulePhrase )
            // InternalCucumber.g:348:5: lv_name_3_0= rulePhrase
            {

            					newCompositeNode(grammarAccess.getScenarioAccess().getNamePhraseParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_3_0=rulePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.farhan.Cucumber.Phrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_4=(Token)match(input,RULE_EOL,FOLLOW_9); 

            			newLeafNode(this_EOL_4, grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_3());
            		
            // InternalCucumber.g:369:3: ( (lv_statements_5_0= ruleStatement ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCucumber.g:370:4: (lv_statements_5_0= ruleStatement )
            	    {
            	    // InternalCucumber.g:370:4: (lv_statements_5_0= ruleStatement )
            	    // InternalCucumber.g:371:5: lv_statements_5_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioAccess().getStatementsStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_statements_5_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_5_0,
            	    						"org.farhan.Cucumber.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalCucumber.g:388:3: ( (lv_steps_6_0= ruleStep ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=15 && LA11_0<=20)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCucumber.g:389:4: (lv_steps_6_0= ruleStep )
            	    {
            	    // InternalCucumber.g:389:4: (lv_steps_6_0= ruleStep )
            	    // InternalCucumber.g:390:5: lv_steps_6_0= ruleStep
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_steps_6_0=ruleStep();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioRule());
            	    					}
            	    					add(
            	    						current,
            	    						"steps",
            	    						lv_steps_6_0,
            	    						"org.farhan.Cucumber.Step");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleScenarioOutline"
    // InternalCucumber.g:411:1: entryRuleScenarioOutline returns [EObject current=null] : iv_ruleScenarioOutline= ruleScenarioOutline EOF ;
    public final EObject entryRuleScenarioOutline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenarioOutline = null;


        try {
            // InternalCucumber.g:411:56: (iv_ruleScenarioOutline= ruleScenarioOutline EOF )
            // InternalCucumber.g:412:2: iv_ruleScenarioOutline= ruleScenarioOutline EOF
            {
             newCompositeNode(grammarAccess.getScenarioOutlineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScenarioOutline=ruleScenarioOutline();

            state._fsp--;

             current =iv_ruleScenarioOutline; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScenarioOutline"


    // $ANTLR start "ruleScenarioOutline"
    // InternalCucumber.g:418:1: ruleScenarioOutline returns [EObject current=null] : ( ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Scenario Outline:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* ( (lv_examples_7_0= ruleExamples ) )+ ) ;
    public final EObject ruleScenarioOutline() throws RecognitionException {
        EObject current = null;

        Token this_EOL_1=null;
        Token otherlv_2=null;
        Token this_EOL_4=null;
        EObject lv_tags_0_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_statements_5_0 = null;

        EObject lv_steps_6_0 = null;

        EObject lv_examples_7_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:424:2: ( ( ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Scenario Outline:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* ( (lv_examples_7_0= ruleExamples ) )+ ) )
            // InternalCucumber.g:425:2: ( ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Scenario Outline:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* ( (lv_examples_7_0= ruleExamples ) )+ )
            {
            // InternalCucumber.g:425:2: ( ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Scenario Outline:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* ( (lv_examples_7_0= ruleExamples ) )+ )
            // InternalCucumber.g:426:3: ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Scenario Outline:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_steps_6_0= ruleStep ) )* ( (lv_examples_7_0= ruleExamples ) )+
            {
            // InternalCucumber.g:426:3: ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCucumber.g:427:4: ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL
                    {
                    // InternalCucumber.g:427:4: ( (lv_tags_0_0= ruleTag ) )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==21) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalCucumber.g:428:5: (lv_tags_0_0= ruleTag )
                    	    {
                    	    // InternalCucumber.g:428:5: (lv_tags_0_0= ruleTag )
                    	    // InternalCucumber.g:429:6: lv_tags_0_0= ruleTag
                    	    {

                    	    						newCompositeNode(grammarAccess.getScenarioOutlineAccess().getTagsTagParserRuleCall_0_0_0());
                    	    					
                    	    pushFollow(FOLLOW_3);
                    	    lv_tags_0_0=ruleTag();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"tags",
                    	    							lv_tags_0_0,
                    	    							"org.farhan.Cucumber.Tag");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);

                    this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_12); 

                    				newLeafNode(this_EOL_1, grammarAccess.getScenarioOutlineAccess().getEOLTerminalRuleCall_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getScenarioOutlineAccess().getScenarioOutlineKeyword_1());
            		
            // InternalCucumber.g:455:3: ( (lv_name_3_0= rulePhrase ) )
            // InternalCucumber.g:456:4: (lv_name_3_0= rulePhrase )
            {
            // InternalCucumber.g:456:4: (lv_name_3_0= rulePhrase )
            // InternalCucumber.g:457:5: lv_name_3_0= rulePhrase
            {

            					newCompositeNode(grammarAccess.getScenarioOutlineAccess().getNamePhraseParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_3_0=rulePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.farhan.Cucumber.Phrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_4=(Token)match(input,RULE_EOL,FOLLOW_13); 

            			newLeafNode(this_EOL_4, grammarAccess.getScenarioOutlineAccess().getEOLTerminalRuleCall_3());
            		
            // InternalCucumber.g:478:3: ( (lv_statements_5_0= ruleStatement ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCucumber.g:479:4: (lv_statements_5_0= ruleStatement )
            	    {
            	    // InternalCucumber.g:479:4: (lv_statements_5_0= ruleStatement )
            	    // InternalCucumber.g:480:5: lv_statements_5_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioOutlineAccess().getStatementsStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_statements_5_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_5_0,
            	    						"org.farhan.Cucumber.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalCucumber.g:497:3: ( (lv_steps_6_0= ruleStep ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=15 && LA15_0<=20)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCucumber.g:498:4: (lv_steps_6_0= ruleStep )
            	    {
            	    // InternalCucumber.g:498:4: (lv_steps_6_0= ruleStep )
            	    // InternalCucumber.g:499:5: lv_steps_6_0= ruleStep
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioOutlineAccess().getStepsStepParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_steps_6_0=ruleStep();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"steps",
            	    						lv_steps_6_0,
            	    						"org.farhan.Cucumber.Step");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalCucumber.g:516:3: ( (lv_examples_7_0= ruleExamples ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                alt16 = dfa16.predict(input);
                switch (alt16) {
            	case 1 :
            	    // InternalCucumber.g:517:4: (lv_examples_7_0= ruleExamples )
            	    {
            	    // InternalCucumber.g:517:4: (lv_examples_7_0= ruleExamples )
            	    // InternalCucumber.g:518:5: lv_examples_7_0= ruleExamples
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioOutlineAccess().getExamplesExamplesParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_examples_7_0=ruleExamples();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"examples",
            	    						lv_examples_7_0,
            	    						"org.farhan.Cucumber.Examples");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScenarioOutline"


    // $ANTLR start "entryRuleExamples"
    // InternalCucumber.g:539:1: entryRuleExamples returns [EObject current=null] : iv_ruleExamples= ruleExamples EOF ;
    public final EObject entryRuleExamples() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExamples = null;


        try {
            // InternalCucumber.g:539:49: (iv_ruleExamples= ruleExamples EOF )
            // InternalCucumber.g:540:2: iv_ruleExamples= ruleExamples EOF
            {
             newCompositeNode(grammarAccess.getExamplesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExamples=ruleExamples();

            state._fsp--;

             current =iv_ruleExamples; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExamples"


    // $ANTLR start "ruleExamples"
    // InternalCucumber.g:546:1: ruleExamples returns [EObject current=null] : ( ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Examples:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_theExamplesTable_6_0= ruleExamplesTable ) ) ) ;
    public final EObject ruleExamples() throws RecognitionException {
        EObject current = null;

        Token this_EOL_1=null;
        Token otherlv_2=null;
        Token this_EOL_4=null;
        EObject lv_tags_0_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_statements_5_0 = null;

        EObject lv_theExamplesTable_6_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:552:2: ( ( ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Examples:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_theExamplesTable_6_0= ruleExamplesTable ) ) ) )
            // InternalCucumber.g:553:2: ( ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Examples:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_theExamplesTable_6_0= ruleExamplesTable ) ) )
            {
            // InternalCucumber.g:553:2: ( ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Examples:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_theExamplesTable_6_0= ruleExamplesTable ) ) )
            // InternalCucumber.g:554:3: ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )? otherlv_2= 'Examples:' ( (lv_name_3_0= rulePhrase ) ) this_EOL_4= RULE_EOL ( (lv_statements_5_0= ruleStatement ) )* ( (lv_theExamplesTable_6_0= ruleExamplesTable ) )
            {
            // InternalCucumber.g:554:3: ( ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==21) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCucumber.g:555:4: ( (lv_tags_0_0= ruleTag ) )+ this_EOL_1= RULE_EOL
                    {
                    // InternalCucumber.g:555:4: ( (lv_tags_0_0= ruleTag ) )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==21) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalCucumber.g:556:5: (lv_tags_0_0= ruleTag )
                    	    {
                    	    // InternalCucumber.g:556:5: (lv_tags_0_0= ruleTag )
                    	    // InternalCucumber.g:557:6: lv_tags_0_0= ruleTag
                    	    {

                    	    						newCompositeNode(grammarAccess.getExamplesAccess().getTagsTagParserRuleCall_0_0_0());
                    	    					
                    	    pushFollow(FOLLOW_3);
                    	    lv_tags_0_0=ruleTag();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getExamplesRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"tags",
                    	    							lv_tags_0_0,
                    	    							"org.farhan.Cucumber.Tag");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);

                    this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_15); 

                    				newLeafNode(this_EOL_1, grammarAccess.getExamplesAccess().getEOLTerminalRuleCall_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getExamplesAccess().getExamplesKeyword_1());
            		
            // InternalCucumber.g:583:3: ( (lv_name_3_0= rulePhrase ) )
            // InternalCucumber.g:584:4: (lv_name_3_0= rulePhrase )
            {
            // InternalCucumber.g:584:4: (lv_name_3_0= rulePhrase )
            // InternalCucumber.g:585:5: lv_name_3_0= rulePhrase
            {

            					newCompositeNode(grammarAccess.getExamplesAccess().getNamePhraseParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_3_0=rulePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExamplesRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.farhan.Cucumber.Phrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_4=(Token)match(input,RULE_EOL,FOLLOW_16); 

            			newLeafNode(this_EOL_4, grammarAccess.getExamplesAccess().getEOLTerminalRuleCall_3());
            		
            // InternalCucumber.g:606:3: ( (lv_statements_5_0= ruleStatement ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCucumber.g:607:4: (lv_statements_5_0= ruleStatement )
            	    {
            	    // InternalCucumber.g:607:4: (lv_statements_5_0= ruleStatement )
            	    // InternalCucumber.g:608:5: lv_statements_5_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getExamplesAccess().getStatementsStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_statements_5_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExamplesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_5_0,
            	    						"org.farhan.Cucumber.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalCucumber.g:625:3: ( (lv_theExamplesTable_6_0= ruleExamplesTable ) )
            // InternalCucumber.g:626:4: (lv_theExamplesTable_6_0= ruleExamplesTable )
            {
            // InternalCucumber.g:626:4: (lv_theExamplesTable_6_0= ruleExamplesTable )
            // InternalCucumber.g:627:5: lv_theExamplesTable_6_0= ruleExamplesTable
            {

            					newCompositeNode(grammarAccess.getExamplesAccess().getTheExamplesTableExamplesTableParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_theExamplesTable_6_0=ruleExamplesTable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExamplesRule());
            					}
            					set(
            						current,
            						"theExamplesTable",
            						lv_theExamplesTable_6_0,
            						"org.farhan.Cucumber.ExamplesTable");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExamples"


    // $ANTLR start "entryRuleExamplesTable"
    // InternalCucumber.g:648:1: entryRuleExamplesTable returns [EObject current=null] : iv_ruleExamplesTable= ruleExamplesTable EOF ;
    public final EObject entryRuleExamplesTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExamplesTable = null;


        try {
            // InternalCucumber.g:648:54: (iv_ruleExamplesTable= ruleExamplesTable EOF )
            // InternalCucumber.g:649:2: iv_ruleExamplesTable= ruleExamplesTable EOF
            {
             newCompositeNode(grammarAccess.getExamplesTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExamplesTable=ruleExamplesTable();

            state._fsp--;

             current =iv_ruleExamplesTable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExamplesTable"


    // $ANTLR start "ruleExamplesTable"
    // InternalCucumber.g:655:1: ruleExamplesTable returns [EObject current=null] : ( (lv_rows_0_0= ruleRow ) )+ ;
    public final EObject ruleExamplesTable() throws RecognitionException {
        EObject current = null;

        EObject lv_rows_0_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:661:2: ( ( (lv_rows_0_0= ruleRow ) )+ )
            // InternalCucumber.g:662:2: ( (lv_rows_0_0= ruleRow ) )+
            {
            // InternalCucumber.g:662:2: ( (lv_rows_0_0= ruleRow ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==13) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCucumber.g:663:3: (lv_rows_0_0= ruleRow )
            	    {
            	    // InternalCucumber.g:663:3: (lv_rows_0_0= ruleRow )
            	    // InternalCucumber.g:664:4: lv_rows_0_0= ruleRow
            	    {

            	    				newCompositeNode(grammarAccess.getExamplesTableAccess().getRowsRowParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_17);
            	    lv_rows_0_0=ruleRow();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getExamplesTableRule());
            	    				}
            	    				add(
            	    					current,
            	    					"rows",
            	    					lv_rows_0_0,
            	    					"org.farhan.Cucumber.Row");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExamplesTable"


    // $ANTLR start "entryRuleStepTable"
    // InternalCucumber.g:684:1: entryRuleStepTable returns [EObject current=null] : iv_ruleStepTable= ruleStepTable EOF ;
    public final EObject entryRuleStepTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStepTable = null;


        try {
            // InternalCucumber.g:684:50: (iv_ruleStepTable= ruleStepTable EOF )
            // InternalCucumber.g:685:2: iv_ruleStepTable= ruleStepTable EOF
            {
             newCompositeNode(grammarAccess.getStepTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStepTable=ruleStepTable();

            state._fsp--;

             current =iv_ruleStepTable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStepTable"


    // $ANTLR start "ruleStepTable"
    // InternalCucumber.g:691:1: ruleStepTable returns [EObject current=null] : ( (lv_rows_0_0= ruleRow ) )+ ;
    public final EObject ruleStepTable() throws RecognitionException {
        EObject current = null;

        EObject lv_rows_0_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:697:2: ( ( (lv_rows_0_0= ruleRow ) )+ )
            // InternalCucumber.g:698:2: ( (lv_rows_0_0= ruleRow ) )+
            {
            // InternalCucumber.g:698:2: ( (lv_rows_0_0= ruleRow ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==13) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalCucumber.g:699:3: (lv_rows_0_0= ruleRow )
            	    {
            	    // InternalCucumber.g:699:3: (lv_rows_0_0= ruleRow )
            	    // InternalCucumber.g:700:4: lv_rows_0_0= ruleRow
            	    {

            	    				newCompositeNode(grammarAccess.getStepTableAccess().getRowsRowParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_17);
            	    lv_rows_0_0=ruleRow();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getStepTableRule());
            	    				}
            	    				add(
            	    					current,
            	    					"rows",
            	    					lv_rows_0_0,
            	    					"org.farhan.Cucumber.Row");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStepTable"


    // $ANTLR start "entryRuleRow"
    // InternalCucumber.g:720:1: entryRuleRow returns [EObject current=null] : iv_ruleRow= ruleRow EOF ;
    public final EObject entryRuleRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRow = null;


        try {
            // InternalCucumber.g:720:44: (iv_ruleRow= ruleRow EOF )
            // InternalCucumber.g:721:2: iv_ruleRow= ruleRow EOF
            {
             newCompositeNode(grammarAccess.getRowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRow=ruleRow();

            state._fsp--;

             current =iv_ruleRow; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRow"


    // $ANTLR start "ruleRow"
    // InternalCucumber.g:727:1: ruleRow returns [EObject current=null] : ( ( (lv_cells_0_0= ruleCell ) )+ otherlv_1= '|' this_EOL_2= RULE_EOL ) ;
    public final EObject ruleRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_EOL_2=null;
        EObject lv_cells_0_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:733:2: ( ( ( (lv_cells_0_0= ruleCell ) )+ otherlv_1= '|' this_EOL_2= RULE_EOL ) )
            // InternalCucumber.g:734:2: ( ( (lv_cells_0_0= ruleCell ) )+ otherlv_1= '|' this_EOL_2= RULE_EOL )
            {
            // InternalCucumber.g:734:2: ( ( (lv_cells_0_0= ruleCell ) )+ otherlv_1= '|' this_EOL_2= RULE_EOL )
            // InternalCucumber.g:735:3: ( (lv_cells_0_0= ruleCell ) )+ otherlv_1= '|' this_EOL_2= RULE_EOL
            {
            // InternalCucumber.g:735:3: ( (lv_cells_0_0= ruleCell ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==13) ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1==RULE_ID) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // InternalCucumber.g:736:4: (lv_cells_0_0= ruleCell )
            	    {
            	    // InternalCucumber.g:736:4: (lv_cells_0_0= ruleCell )
            	    // InternalCucumber.g:737:5: lv_cells_0_0= ruleCell
            	    {

            	    					newCompositeNode(grammarAccess.getRowAccess().getCellsCellParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_cells_0_0=ruleCell();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRowRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cells",
            	    						lv_cells_0_0,
            	    						"org.farhan.Cucumber.Cell");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            otherlv_1=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getRowAccess().getVerticalLineKeyword_1());
            		
            this_EOL_2=(Token)match(input,RULE_EOL,FOLLOW_2); 

            			newLeafNode(this_EOL_2, grammarAccess.getRowAccess().getEOLTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRow"


    // $ANTLR start "entryRuleCell"
    // InternalCucumber.g:766:1: entryRuleCell returns [EObject current=null] : iv_ruleCell= ruleCell EOF ;
    public final EObject entryRuleCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCell = null;


        try {
            // InternalCucumber.g:766:45: (iv_ruleCell= ruleCell EOF )
            // InternalCucumber.g:767:2: iv_ruleCell= ruleCell EOF
            {
             newCompositeNode(grammarAccess.getCellRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCell=ruleCell();

            state._fsp--;

             current =iv_ruleCell; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCell"


    // $ANTLR start "ruleCell"
    // InternalCucumber.g:773:1: ruleCell returns [EObject current=null] : ( ( (lv_cell_0_0= '|' ) ) ( (lv_name_1_0= rulePhrase ) ) ) ;
    public final EObject ruleCell() throws RecognitionException {
        EObject current = null;

        Token lv_cell_0_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:779:2: ( ( ( (lv_cell_0_0= '|' ) ) ( (lv_name_1_0= rulePhrase ) ) ) )
            // InternalCucumber.g:780:2: ( ( (lv_cell_0_0= '|' ) ) ( (lv_name_1_0= rulePhrase ) ) )
            {
            // InternalCucumber.g:780:2: ( ( (lv_cell_0_0= '|' ) ) ( (lv_name_1_0= rulePhrase ) ) )
            // InternalCucumber.g:781:3: ( (lv_cell_0_0= '|' ) ) ( (lv_name_1_0= rulePhrase ) )
            {
            // InternalCucumber.g:781:3: ( (lv_cell_0_0= '|' ) )
            // InternalCucumber.g:782:4: (lv_cell_0_0= '|' )
            {
            // InternalCucumber.g:782:4: (lv_cell_0_0= '|' )
            // InternalCucumber.g:783:5: lv_cell_0_0= '|'
            {
            lv_cell_0_0=(Token)match(input,13,FOLLOW_5); 

            					newLeafNode(lv_cell_0_0, grammarAccess.getCellAccess().getCellVerticalLineKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCellRule());
            					}
            					setWithLastConsumed(current, "cell", lv_cell_0_0, "|");
            				

            }


            }

            // InternalCucumber.g:795:3: ( (lv_name_1_0= rulePhrase ) )
            // InternalCucumber.g:796:4: (lv_name_1_0= rulePhrase )
            {
            // InternalCucumber.g:796:4: (lv_name_1_0= rulePhrase )
            // InternalCucumber.g:797:5: lv_name_1_0= rulePhrase
            {

            					newCompositeNode(grammarAccess.getCellAccess().getNamePhraseParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=rulePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCellRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.farhan.Cucumber.Phrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCell"


    // $ANTLR start "entryRuleStep"
    // InternalCucumber.g:818:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalCucumber.g:818:45: (iv_ruleStep= ruleStep EOF )
            // InternalCucumber.g:819:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // InternalCucumber.g:825:1: ruleStep returns [EObject current=null] : (this_Given_0= ruleGiven | this_When_1= ruleWhen | this_Then_2= ruleThen | this_And_3= ruleAnd | this_But_4= ruleBut | this_Asterisk_5= ruleAsterisk ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        EObject this_Given_0 = null;

        EObject this_When_1 = null;

        EObject this_Then_2 = null;

        EObject this_And_3 = null;

        EObject this_But_4 = null;

        EObject this_Asterisk_5 = null;



        	enterRule();

        try {
            // InternalCucumber.g:831:2: ( (this_Given_0= ruleGiven | this_When_1= ruleWhen | this_Then_2= ruleThen | this_And_3= ruleAnd | this_But_4= ruleBut | this_Asterisk_5= ruleAsterisk ) )
            // InternalCucumber.g:832:2: (this_Given_0= ruleGiven | this_When_1= ruleWhen | this_Then_2= ruleThen | this_And_3= ruleAnd | this_But_4= ruleBut | this_Asterisk_5= ruleAsterisk )
            {
            // InternalCucumber.g:832:2: (this_Given_0= ruleGiven | this_When_1= ruleWhen | this_Then_2= ruleThen | this_And_3= ruleAnd | this_But_4= ruleBut | this_Asterisk_5= ruleAsterisk )
            int alt23=6;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt23=1;
                }
                break;
            case 16:
                {
                alt23=2;
                }
                break;
            case 17:
                {
                alt23=3;
                }
                break;
            case 18:
                {
                alt23=4;
                }
                break;
            case 19:
                {
                alt23=5;
                }
                break;
            case 20:
                {
                alt23=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalCucumber.g:833:3: this_Given_0= ruleGiven
                    {

                    			newCompositeNode(grammarAccess.getStepAccess().getGivenParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Given_0=ruleGiven();

                    state._fsp--;


                    			current = this_Given_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCucumber.g:842:3: this_When_1= ruleWhen
                    {

                    			newCompositeNode(grammarAccess.getStepAccess().getWhenParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_When_1=ruleWhen();

                    state._fsp--;


                    			current = this_When_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCucumber.g:851:3: this_Then_2= ruleThen
                    {

                    			newCompositeNode(grammarAccess.getStepAccess().getThenParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Then_2=ruleThen();

                    state._fsp--;


                    			current = this_Then_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCucumber.g:860:3: this_And_3= ruleAnd
                    {

                    			newCompositeNode(grammarAccess.getStepAccess().getAndParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_And_3=ruleAnd();

                    state._fsp--;


                    			current = this_And_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalCucumber.g:869:3: this_But_4= ruleBut
                    {

                    			newCompositeNode(grammarAccess.getStepAccess().getButParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_But_4=ruleBut();

                    state._fsp--;


                    			current = this_But_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalCucumber.g:878:3: this_Asterisk_5= ruleAsterisk
                    {

                    			newCompositeNode(grammarAccess.getStepAccess().getAsteriskParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Asterisk_5=ruleAsterisk();

                    state._fsp--;


                    			current = this_Asterisk_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleDocString"
    // InternalCucumber.g:890:1: entryRuleDocString returns [EObject current=null] : iv_ruleDocString= ruleDocString EOF ;
    public final EObject entryRuleDocString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocString = null;


        try {
            // InternalCucumber.g:890:50: (iv_ruleDocString= ruleDocString EOF )
            // InternalCucumber.g:891:2: iv_ruleDocString= ruleDocString EOF
            {
             newCompositeNode(grammarAccess.getDocStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocString=ruleDocString();

            state._fsp--;

             current =iv_ruleDocString; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDocString"


    // $ANTLR start "ruleDocString"
    // InternalCucumber.g:897:1: ruleDocString returns [EObject current=null] : (otherlv_0= '\"\"\"' this_EOL_1= RULE_EOL ( (lv_statements_2_0= ruleStatement ) )+ otherlv_3= '\"\"\"' this_EOL_4= RULE_EOL ) ;
    public final EObject ruleDocString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_EOL_1=null;
        Token otherlv_3=null;
        Token this_EOL_4=null;
        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:903:2: ( (otherlv_0= '\"\"\"' this_EOL_1= RULE_EOL ( (lv_statements_2_0= ruleStatement ) )+ otherlv_3= '\"\"\"' this_EOL_4= RULE_EOL ) )
            // InternalCucumber.g:904:2: (otherlv_0= '\"\"\"' this_EOL_1= RULE_EOL ( (lv_statements_2_0= ruleStatement ) )+ otherlv_3= '\"\"\"' this_EOL_4= RULE_EOL )
            {
            // InternalCucumber.g:904:2: (otherlv_0= '\"\"\"' this_EOL_1= RULE_EOL ( (lv_statements_2_0= ruleStatement ) )+ otherlv_3= '\"\"\"' this_EOL_4= RULE_EOL )
            // InternalCucumber.g:905:3: otherlv_0= '\"\"\"' this_EOL_1= RULE_EOL ( (lv_statements_2_0= ruleStatement ) )+ otherlv_3= '\"\"\"' this_EOL_4= RULE_EOL
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDocStringAccess().getQuotationMarkQuotationMarkQuotationMarkKeyword_0());
            		
            this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_5); 

            			newLeafNode(this_EOL_1, grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_1());
            		
            // InternalCucumber.g:913:3: ( (lv_statements_2_0= ruleStatement ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalCucumber.g:914:4: (lv_statements_2_0= ruleStatement )
            	    {
            	    // InternalCucumber.g:914:4: (lv_statements_2_0= ruleStatement )
            	    // InternalCucumber.g:915:5: lv_statements_2_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getDocStringAccess().getStatementsStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_statements_2_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDocStringRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_2_0,
            	    						"org.farhan.Cucumber.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getDocStringAccess().getQuotationMarkQuotationMarkQuotationMarkKeyword_3());
            		
            this_EOL_4=(Token)match(input,RULE_EOL,FOLLOW_2); 

            			newLeafNode(this_EOL_4, grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDocString"


    // $ANTLR start "entryRuleGiven"
    // InternalCucumber.g:944:1: entryRuleGiven returns [EObject current=null] : iv_ruleGiven= ruleGiven EOF ;
    public final EObject entryRuleGiven() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGiven = null;


        try {
            // InternalCucumber.g:944:46: (iv_ruleGiven= ruleGiven EOF )
            // InternalCucumber.g:945:2: iv_ruleGiven= ruleGiven EOF
            {
             newCompositeNode(grammarAccess.getGivenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGiven=ruleGiven();

            state._fsp--;

             current =iv_ruleGiven; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGiven"


    // $ANTLR start "ruleGiven"
    // InternalCucumber.g:951:1: ruleGiven returns [EObject current=null] : (otherlv_0= 'Given' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( ( (lv_theStepTable_3_0= ruleStepTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? ) ;
    public final EObject ruleGiven() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_EOL_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_theStepTable_3_0 = null;

        EObject lv_theDocString_4_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:957:2: ( (otherlv_0= 'Given' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( ( (lv_theStepTable_3_0= ruleStepTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? ) )
            // InternalCucumber.g:958:2: (otherlv_0= 'Given' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( ( (lv_theStepTable_3_0= ruleStepTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? )
            {
            // InternalCucumber.g:958:2: (otherlv_0= 'Given' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( ( (lv_theStepTable_3_0= ruleStepTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? )
            // InternalCucumber.g:959:3: otherlv_0= 'Given' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( ( (lv_theStepTable_3_0= ruleStepTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getGivenAccess().getGivenKeyword_0());
            		
            // InternalCucumber.g:963:3: ( (lv_name_1_0= rulePhrase ) )
            // InternalCucumber.g:964:4: (lv_name_1_0= rulePhrase )
            {
            // InternalCucumber.g:964:4: (lv_name_1_0= rulePhrase )
            // InternalCucumber.g:965:5: lv_name_1_0= rulePhrase
            {

            					newCompositeNode(grammarAccess.getGivenAccess().getNamePhraseParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_1_0=rulePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGivenRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.farhan.Cucumber.Phrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_2=(Token)match(input,RULE_EOL,FOLLOW_19); 

            			newLeafNode(this_EOL_2, grammarAccess.getGivenAccess().getEOLTerminalRuleCall_2());
            		
            // InternalCucumber.g:986:3: ( ( (lv_theStepTable_3_0= ruleStepTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )?
            int alt25=3;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==13) ) {
                alt25=1;
            }
            else if ( (LA25_0==14) ) {
                alt25=2;
            }
            switch (alt25) {
                case 1 :
                    // InternalCucumber.g:987:4: ( (lv_theStepTable_3_0= ruleStepTable ) )
                    {
                    // InternalCucumber.g:987:4: ( (lv_theStepTable_3_0= ruleStepTable ) )
                    // InternalCucumber.g:988:5: (lv_theStepTable_3_0= ruleStepTable )
                    {
                    // InternalCucumber.g:988:5: (lv_theStepTable_3_0= ruleStepTable )
                    // InternalCucumber.g:989:6: lv_theStepTable_3_0= ruleStepTable
                    {

                    						newCompositeNode(grammarAccess.getGivenAccess().getTheStepTableStepTableParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_theStepTable_3_0=ruleStepTable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGivenRule());
                    						}
                    						set(
                    							current,
                    							"theStepTable",
                    							lv_theStepTable_3_0,
                    							"org.farhan.Cucumber.StepTable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:1007:4: ( (lv_theDocString_4_0= ruleDocString ) )
                    {
                    // InternalCucumber.g:1007:4: ( (lv_theDocString_4_0= ruleDocString ) )
                    // InternalCucumber.g:1008:5: (lv_theDocString_4_0= ruleDocString )
                    {
                    // InternalCucumber.g:1008:5: (lv_theDocString_4_0= ruleDocString )
                    // InternalCucumber.g:1009:6: lv_theDocString_4_0= ruleDocString
                    {

                    						newCompositeNode(grammarAccess.getGivenAccess().getTheDocStringDocStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_theDocString_4_0=ruleDocString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGivenRule());
                    						}
                    						set(
                    							current,
                    							"theDocString",
                    							lv_theDocString_4_0,
                    							"org.farhan.Cucumber.DocString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGiven"


    // $ANTLR start "entryRuleWhen"
    // InternalCucumber.g:1031:1: entryRuleWhen returns [EObject current=null] : iv_ruleWhen= ruleWhen EOF ;
    public final EObject entryRuleWhen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhen = null;


        try {
            // InternalCucumber.g:1031:45: (iv_ruleWhen= ruleWhen EOF )
            // InternalCucumber.g:1032:2: iv_ruleWhen= ruleWhen EOF
            {
             newCompositeNode(grammarAccess.getWhenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhen=ruleWhen();

            state._fsp--;

             current =iv_ruleWhen; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhen"


    // $ANTLR start "ruleWhen"
    // InternalCucumber.g:1038:1: ruleWhen returns [EObject current=null] : (otherlv_0= 'When' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( ( (lv_theStepTable_3_0= ruleStepTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? ) ;
    public final EObject ruleWhen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_EOL_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_theStepTable_3_0 = null;

        EObject lv_theDocString_4_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:1044:2: ( (otherlv_0= 'When' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( ( (lv_theStepTable_3_0= ruleStepTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? ) )
            // InternalCucumber.g:1045:2: (otherlv_0= 'When' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( ( (lv_theStepTable_3_0= ruleStepTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? )
            {
            // InternalCucumber.g:1045:2: (otherlv_0= 'When' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( ( (lv_theStepTable_3_0= ruleStepTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? )
            // InternalCucumber.g:1046:3: otherlv_0= 'When' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( ( (lv_theStepTable_3_0= ruleStepTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getWhenAccess().getWhenKeyword_0());
            		
            // InternalCucumber.g:1050:3: ( (lv_name_1_0= rulePhrase ) )
            // InternalCucumber.g:1051:4: (lv_name_1_0= rulePhrase )
            {
            // InternalCucumber.g:1051:4: (lv_name_1_0= rulePhrase )
            // InternalCucumber.g:1052:5: lv_name_1_0= rulePhrase
            {

            					newCompositeNode(grammarAccess.getWhenAccess().getNamePhraseParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_1_0=rulePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhenRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.farhan.Cucumber.Phrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_2=(Token)match(input,RULE_EOL,FOLLOW_19); 

            			newLeafNode(this_EOL_2, grammarAccess.getWhenAccess().getEOLTerminalRuleCall_2());
            		
            // InternalCucumber.g:1073:3: ( ( (lv_theStepTable_3_0= ruleStepTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )?
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==13) ) {
                alt26=1;
            }
            else if ( (LA26_0==14) ) {
                alt26=2;
            }
            switch (alt26) {
                case 1 :
                    // InternalCucumber.g:1074:4: ( (lv_theStepTable_3_0= ruleStepTable ) )
                    {
                    // InternalCucumber.g:1074:4: ( (lv_theStepTable_3_0= ruleStepTable ) )
                    // InternalCucumber.g:1075:5: (lv_theStepTable_3_0= ruleStepTable )
                    {
                    // InternalCucumber.g:1075:5: (lv_theStepTable_3_0= ruleStepTable )
                    // InternalCucumber.g:1076:6: lv_theStepTable_3_0= ruleStepTable
                    {

                    						newCompositeNode(grammarAccess.getWhenAccess().getTheStepTableStepTableParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_theStepTable_3_0=ruleStepTable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWhenRule());
                    						}
                    						set(
                    							current,
                    							"theStepTable",
                    							lv_theStepTable_3_0,
                    							"org.farhan.Cucumber.StepTable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:1094:4: ( (lv_theDocString_4_0= ruleDocString ) )
                    {
                    // InternalCucumber.g:1094:4: ( (lv_theDocString_4_0= ruleDocString ) )
                    // InternalCucumber.g:1095:5: (lv_theDocString_4_0= ruleDocString )
                    {
                    // InternalCucumber.g:1095:5: (lv_theDocString_4_0= ruleDocString )
                    // InternalCucumber.g:1096:6: lv_theDocString_4_0= ruleDocString
                    {

                    						newCompositeNode(grammarAccess.getWhenAccess().getTheDocStringDocStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_theDocString_4_0=ruleDocString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWhenRule());
                    						}
                    						set(
                    							current,
                    							"theDocString",
                    							lv_theDocString_4_0,
                    							"org.farhan.Cucumber.DocString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhen"


    // $ANTLR start "entryRuleThen"
    // InternalCucumber.g:1118:1: entryRuleThen returns [EObject current=null] : iv_ruleThen= ruleThen EOF ;
    public final EObject entryRuleThen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThen = null;


        try {
            // InternalCucumber.g:1118:45: (iv_ruleThen= ruleThen EOF )
            // InternalCucumber.g:1119:2: iv_ruleThen= ruleThen EOF
            {
             newCompositeNode(grammarAccess.getThenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThen=ruleThen();

            state._fsp--;

             current =iv_ruleThen; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleThen"


    // $ANTLR start "ruleThen"
    // InternalCucumber.g:1125:1: ruleThen returns [EObject current=null] : (otherlv_0= 'Then' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( ( (lv_theStepTable_3_0= ruleStepTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? ) ;
    public final EObject ruleThen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_EOL_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_theStepTable_3_0 = null;

        EObject lv_theDocString_4_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:1131:2: ( (otherlv_0= 'Then' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( ( (lv_theStepTable_3_0= ruleStepTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? ) )
            // InternalCucumber.g:1132:2: (otherlv_0= 'Then' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( ( (lv_theStepTable_3_0= ruleStepTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? )
            {
            // InternalCucumber.g:1132:2: (otherlv_0= 'Then' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( ( (lv_theStepTable_3_0= ruleStepTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? )
            // InternalCucumber.g:1133:3: otherlv_0= 'Then' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( ( (lv_theStepTable_3_0= ruleStepTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getThenAccess().getThenKeyword_0());
            		
            // InternalCucumber.g:1137:3: ( (lv_name_1_0= rulePhrase ) )
            // InternalCucumber.g:1138:4: (lv_name_1_0= rulePhrase )
            {
            // InternalCucumber.g:1138:4: (lv_name_1_0= rulePhrase )
            // InternalCucumber.g:1139:5: lv_name_1_0= rulePhrase
            {

            					newCompositeNode(grammarAccess.getThenAccess().getNamePhraseParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_1_0=rulePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getThenRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.farhan.Cucumber.Phrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_2=(Token)match(input,RULE_EOL,FOLLOW_19); 

            			newLeafNode(this_EOL_2, grammarAccess.getThenAccess().getEOLTerminalRuleCall_2());
            		
            // InternalCucumber.g:1160:3: ( ( (lv_theStepTable_3_0= ruleStepTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )?
            int alt27=3;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==13) ) {
                alt27=1;
            }
            else if ( (LA27_0==14) ) {
                alt27=2;
            }
            switch (alt27) {
                case 1 :
                    // InternalCucumber.g:1161:4: ( (lv_theStepTable_3_0= ruleStepTable ) )
                    {
                    // InternalCucumber.g:1161:4: ( (lv_theStepTable_3_0= ruleStepTable ) )
                    // InternalCucumber.g:1162:5: (lv_theStepTable_3_0= ruleStepTable )
                    {
                    // InternalCucumber.g:1162:5: (lv_theStepTable_3_0= ruleStepTable )
                    // InternalCucumber.g:1163:6: lv_theStepTable_3_0= ruleStepTable
                    {

                    						newCompositeNode(grammarAccess.getThenAccess().getTheStepTableStepTableParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_theStepTable_3_0=ruleStepTable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getThenRule());
                    						}
                    						set(
                    							current,
                    							"theStepTable",
                    							lv_theStepTable_3_0,
                    							"org.farhan.Cucumber.StepTable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:1181:4: ( (lv_theDocString_4_0= ruleDocString ) )
                    {
                    // InternalCucumber.g:1181:4: ( (lv_theDocString_4_0= ruleDocString ) )
                    // InternalCucumber.g:1182:5: (lv_theDocString_4_0= ruleDocString )
                    {
                    // InternalCucumber.g:1182:5: (lv_theDocString_4_0= ruleDocString )
                    // InternalCucumber.g:1183:6: lv_theDocString_4_0= ruleDocString
                    {

                    						newCompositeNode(grammarAccess.getThenAccess().getTheDocStringDocStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_theDocString_4_0=ruleDocString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getThenRule());
                    						}
                    						set(
                    							current,
                    							"theDocString",
                    							lv_theDocString_4_0,
                    							"org.farhan.Cucumber.DocString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleThen"


    // $ANTLR start "entryRuleAnd"
    // InternalCucumber.g:1205:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalCucumber.g:1205:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalCucumber.g:1206:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalCucumber.g:1212:1: ruleAnd returns [EObject current=null] : (otherlv_0= 'And' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( ( (lv_theStepTable_3_0= ruleStepTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_EOL_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_theStepTable_3_0 = null;

        EObject lv_theDocString_4_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:1218:2: ( (otherlv_0= 'And' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( ( (lv_theStepTable_3_0= ruleStepTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? ) )
            // InternalCucumber.g:1219:2: (otherlv_0= 'And' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( ( (lv_theStepTable_3_0= ruleStepTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? )
            {
            // InternalCucumber.g:1219:2: (otherlv_0= 'And' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( ( (lv_theStepTable_3_0= ruleStepTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? )
            // InternalCucumber.g:1220:3: otherlv_0= 'And' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( ( (lv_theStepTable_3_0= ruleStepTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAndAccess().getAndKeyword_0());
            		
            // InternalCucumber.g:1224:3: ( (lv_name_1_0= rulePhrase ) )
            // InternalCucumber.g:1225:4: (lv_name_1_0= rulePhrase )
            {
            // InternalCucumber.g:1225:4: (lv_name_1_0= rulePhrase )
            // InternalCucumber.g:1226:5: lv_name_1_0= rulePhrase
            {

            					newCompositeNode(grammarAccess.getAndAccess().getNamePhraseParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_1_0=rulePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAndRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.farhan.Cucumber.Phrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_2=(Token)match(input,RULE_EOL,FOLLOW_19); 

            			newLeafNode(this_EOL_2, grammarAccess.getAndAccess().getEOLTerminalRuleCall_2());
            		
            // InternalCucumber.g:1247:3: ( ( (lv_theStepTable_3_0= ruleStepTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )?
            int alt28=3;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==13) ) {
                alt28=1;
            }
            else if ( (LA28_0==14) ) {
                alt28=2;
            }
            switch (alt28) {
                case 1 :
                    // InternalCucumber.g:1248:4: ( (lv_theStepTable_3_0= ruleStepTable ) )
                    {
                    // InternalCucumber.g:1248:4: ( (lv_theStepTable_3_0= ruleStepTable ) )
                    // InternalCucumber.g:1249:5: (lv_theStepTable_3_0= ruleStepTable )
                    {
                    // InternalCucumber.g:1249:5: (lv_theStepTable_3_0= ruleStepTable )
                    // InternalCucumber.g:1250:6: lv_theStepTable_3_0= ruleStepTable
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getTheStepTableStepTableParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_theStepTable_3_0=ruleStepTable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndRule());
                    						}
                    						set(
                    							current,
                    							"theStepTable",
                    							lv_theStepTable_3_0,
                    							"org.farhan.Cucumber.StepTable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:1268:4: ( (lv_theDocString_4_0= ruleDocString ) )
                    {
                    // InternalCucumber.g:1268:4: ( (lv_theDocString_4_0= ruleDocString ) )
                    // InternalCucumber.g:1269:5: (lv_theDocString_4_0= ruleDocString )
                    {
                    // InternalCucumber.g:1269:5: (lv_theDocString_4_0= ruleDocString )
                    // InternalCucumber.g:1270:6: lv_theDocString_4_0= ruleDocString
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getTheDocStringDocStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_theDocString_4_0=ruleDocString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndRule());
                    						}
                    						set(
                    							current,
                    							"theDocString",
                    							lv_theDocString_4_0,
                    							"org.farhan.Cucumber.DocString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleBut"
    // InternalCucumber.g:1292:1: entryRuleBut returns [EObject current=null] : iv_ruleBut= ruleBut EOF ;
    public final EObject entryRuleBut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBut = null;


        try {
            // InternalCucumber.g:1292:44: (iv_ruleBut= ruleBut EOF )
            // InternalCucumber.g:1293:2: iv_ruleBut= ruleBut EOF
            {
             newCompositeNode(grammarAccess.getButRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBut=ruleBut();

            state._fsp--;

             current =iv_ruleBut; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBut"


    // $ANTLR start "ruleBut"
    // InternalCucumber.g:1299:1: ruleBut returns [EObject current=null] : (otherlv_0= 'But' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( ( (lv_theStepTable_3_0= ruleStepTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? ) ;
    public final EObject ruleBut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_EOL_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_theStepTable_3_0 = null;

        EObject lv_theDocString_4_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:1305:2: ( (otherlv_0= 'But' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( ( (lv_theStepTable_3_0= ruleStepTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? ) )
            // InternalCucumber.g:1306:2: (otherlv_0= 'But' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( ( (lv_theStepTable_3_0= ruleStepTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? )
            {
            // InternalCucumber.g:1306:2: (otherlv_0= 'But' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( ( (lv_theStepTable_3_0= ruleStepTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? )
            // InternalCucumber.g:1307:3: otherlv_0= 'But' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( ( (lv_theStepTable_3_0= ruleStepTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getButAccess().getButKeyword_0());
            		
            // InternalCucumber.g:1311:3: ( (lv_name_1_0= rulePhrase ) )
            // InternalCucumber.g:1312:4: (lv_name_1_0= rulePhrase )
            {
            // InternalCucumber.g:1312:4: (lv_name_1_0= rulePhrase )
            // InternalCucumber.g:1313:5: lv_name_1_0= rulePhrase
            {

            					newCompositeNode(grammarAccess.getButAccess().getNamePhraseParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_1_0=rulePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getButRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.farhan.Cucumber.Phrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_2=(Token)match(input,RULE_EOL,FOLLOW_19); 

            			newLeafNode(this_EOL_2, grammarAccess.getButAccess().getEOLTerminalRuleCall_2());
            		
            // InternalCucumber.g:1334:3: ( ( (lv_theStepTable_3_0= ruleStepTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )?
            int alt29=3;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==13) ) {
                alt29=1;
            }
            else if ( (LA29_0==14) ) {
                alt29=2;
            }
            switch (alt29) {
                case 1 :
                    // InternalCucumber.g:1335:4: ( (lv_theStepTable_3_0= ruleStepTable ) )
                    {
                    // InternalCucumber.g:1335:4: ( (lv_theStepTable_3_0= ruleStepTable ) )
                    // InternalCucumber.g:1336:5: (lv_theStepTable_3_0= ruleStepTable )
                    {
                    // InternalCucumber.g:1336:5: (lv_theStepTable_3_0= ruleStepTable )
                    // InternalCucumber.g:1337:6: lv_theStepTable_3_0= ruleStepTable
                    {

                    						newCompositeNode(grammarAccess.getButAccess().getTheStepTableStepTableParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_theStepTable_3_0=ruleStepTable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getButRule());
                    						}
                    						set(
                    							current,
                    							"theStepTable",
                    							lv_theStepTable_3_0,
                    							"org.farhan.Cucumber.StepTable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:1355:4: ( (lv_theDocString_4_0= ruleDocString ) )
                    {
                    // InternalCucumber.g:1355:4: ( (lv_theDocString_4_0= ruleDocString ) )
                    // InternalCucumber.g:1356:5: (lv_theDocString_4_0= ruleDocString )
                    {
                    // InternalCucumber.g:1356:5: (lv_theDocString_4_0= ruleDocString )
                    // InternalCucumber.g:1357:6: lv_theDocString_4_0= ruleDocString
                    {

                    						newCompositeNode(grammarAccess.getButAccess().getTheDocStringDocStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_theDocString_4_0=ruleDocString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getButRule());
                    						}
                    						set(
                    							current,
                    							"theDocString",
                    							lv_theDocString_4_0,
                    							"org.farhan.Cucumber.DocString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBut"


    // $ANTLR start "entryRuleAsterisk"
    // InternalCucumber.g:1379:1: entryRuleAsterisk returns [EObject current=null] : iv_ruleAsterisk= ruleAsterisk EOF ;
    public final EObject entryRuleAsterisk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsterisk = null;


        try {
            // InternalCucumber.g:1379:49: (iv_ruleAsterisk= ruleAsterisk EOF )
            // InternalCucumber.g:1380:2: iv_ruleAsterisk= ruleAsterisk EOF
            {
             newCompositeNode(grammarAccess.getAsteriskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAsterisk=ruleAsterisk();

            state._fsp--;

             current =iv_ruleAsterisk; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAsterisk"


    // $ANTLR start "ruleAsterisk"
    // InternalCucumber.g:1386:1: ruleAsterisk returns [EObject current=null] : (otherlv_0= '*' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( ( (lv_theStepTable_3_0= ruleStepTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? ) ;
    public final EObject ruleAsterisk() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_EOL_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_theStepTable_3_0 = null;

        EObject lv_theDocString_4_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:1392:2: ( (otherlv_0= '*' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( ( (lv_theStepTable_3_0= ruleStepTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? ) )
            // InternalCucumber.g:1393:2: (otherlv_0= '*' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( ( (lv_theStepTable_3_0= ruleStepTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? )
            {
            // InternalCucumber.g:1393:2: (otherlv_0= '*' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( ( (lv_theStepTable_3_0= ruleStepTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )? )
            // InternalCucumber.g:1394:3: otherlv_0= '*' ( (lv_name_1_0= rulePhrase ) ) this_EOL_2= RULE_EOL ( ( (lv_theStepTable_3_0= ruleStepTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAsteriskAccess().getAsteriskKeyword_0());
            		
            // InternalCucumber.g:1398:3: ( (lv_name_1_0= rulePhrase ) )
            // InternalCucumber.g:1399:4: (lv_name_1_0= rulePhrase )
            {
            // InternalCucumber.g:1399:4: (lv_name_1_0= rulePhrase )
            // InternalCucumber.g:1400:5: lv_name_1_0= rulePhrase
            {

            					newCompositeNode(grammarAccess.getAsteriskAccess().getNamePhraseParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_1_0=rulePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAsteriskRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.farhan.Cucumber.Phrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_2=(Token)match(input,RULE_EOL,FOLLOW_19); 

            			newLeafNode(this_EOL_2, grammarAccess.getAsteriskAccess().getEOLTerminalRuleCall_2());
            		
            // InternalCucumber.g:1421:3: ( ( (lv_theStepTable_3_0= ruleStepTable ) ) | ( (lv_theDocString_4_0= ruleDocString ) ) )?
            int alt30=3;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==13) ) {
                alt30=1;
            }
            else if ( (LA30_0==14) ) {
                alt30=2;
            }
            switch (alt30) {
                case 1 :
                    // InternalCucumber.g:1422:4: ( (lv_theStepTable_3_0= ruleStepTable ) )
                    {
                    // InternalCucumber.g:1422:4: ( (lv_theStepTable_3_0= ruleStepTable ) )
                    // InternalCucumber.g:1423:5: (lv_theStepTable_3_0= ruleStepTable )
                    {
                    // InternalCucumber.g:1423:5: (lv_theStepTable_3_0= ruleStepTable )
                    // InternalCucumber.g:1424:6: lv_theStepTable_3_0= ruleStepTable
                    {

                    						newCompositeNode(grammarAccess.getAsteriskAccess().getTheStepTableStepTableParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_theStepTable_3_0=ruleStepTable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAsteriskRule());
                    						}
                    						set(
                    							current,
                    							"theStepTable",
                    							lv_theStepTable_3_0,
                    							"org.farhan.Cucumber.StepTable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:1442:4: ( (lv_theDocString_4_0= ruleDocString ) )
                    {
                    // InternalCucumber.g:1442:4: ( (lv_theDocString_4_0= ruleDocString ) )
                    // InternalCucumber.g:1443:5: (lv_theDocString_4_0= ruleDocString )
                    {
                    // InternalCucumber.g:1443:5: (lv_theDocString_4_0= ruleDocString )
                    // InternalCucumber.g:1444:6: lv_theDocString_4_0= ruleDocString
                    {

                    						newCompositeNode(grammarAccess.getAsteriskAccess().getTheDocStringDocStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_theDocString_4_0=ruleDocString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAsteriskRule());
                    						}
                    						set(
                    							current,
                    							"theDocString",
                    							lv_theDocString_4_0,
                    							"org.farhan.Cucumber.DocString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAsterisk"


    // $ANTLR start "entryRuleStatement"
    // InternalCucumber.g:1466:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalCucumber.g:1466:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalCucumber.g:1467:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalCucumber.g:1473:1: ruleStatement returns [EObject current=null] : ( ( (lv_name_0_0= rulePhrase ) ) this_EOL_1= RULE_EOL ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token this_EOL_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalCucumber.g:1479:2: ( ( ( (lv_name_0_0= rulePhrase ) ) this_EOL_1= RULE_EOL ) )
            // InternalCucumber.g:1480:2: ( ( (lv_name_0_0= rulePhrase ) ) this_EOL_1= RULE_EOL )
            {
            // InternalCucumber.g:1480:2: ( ( (lv_name_0_0= rulePhrase ) ) this_EOL_1= RULE_EOL )
            // InternalCucumber.g:1481:3: ( (lv_name_0_0= rulePhrase ) ) this_EOL_1= RULE_EOL
            {
            // InternalCucumber.g:1481:3: ( (lv_name_0_0= rulePhrase ) )
            // InternalCucumber.g:1482:4: (lv_name_0_0= rulePhrase )
            {
            // InternalCucumber.g:1482:4: (lv_name_0_0= rulePhrase )
            // InternalCucumber.g:1483:5: lv_name_0_0= rulePhrase
            {

            					newCompositeNode(grammarAccess.getStatementAccess().getNamePhraseParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_0_0=rulePhrase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatementRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.farhan.Cucumber.Phrase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_2); 

            			newLeafNode(this_EOL_1, grammarAccess.getStatementAccess().getEOLTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRulePhrase"
    // InternalCucumber.g:1508:1: entryRulePhrase returns [String current=null] : iv_rulePhrase= rulePhrase EOF ;
    public final String entryRulePhrase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePhrase = null;


        try {
            // InternalCucumber.g:1508:46: (iv_rulePhrase= rulePhrase EOF )
            // InternalCucumber.g:1509:2: iv_rulePhrase= rulePhrase EOF
            {
             newCompositeNode(grammarAccess.getPhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhrase=rulePhrase();

            state._fsp--;

             current =iv_rulePhrase.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePhrase"


    // $ANTLR start "rulePhrase"
    // InternalCucumber.g:1515:1: rulePhrase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID )+ ;
    public final AntlrDatatypeRuleToken rulePhrase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalCucumber.g:1521:2: ( (this_ID_0= RULE_ID )+ )
            // InternalCucumber.g:1522:2: (this_ID_0= RULE_ID )+
            {
            // InternalCucumber.g:1522:2: (this_ID_0= RULE_ID )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalCucumber.g:1523:3: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            	    			current.merge(this_ID_0);
            	    		

            	    			newLeafNode(this_ID_0, grammarAccess.getPhraseAccess().getIDTerminalRuleCall());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePhrase"


    // $ANTLR start "entryRuleTag"
    // InternalCucumber.g:1534:1: entryRuleTag returns [EObject current=null] : iv_ruleTag= ruleTag EOF ;
    public final EObject entryRuleTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTag = null;


        try {
            // InternalCucumber.g:1534:44: (iv_ruleTag= ruleTag EOF )
            // InternalCucumber.g:1535:2: iv_ruleTag= ruleTag EOF
            {
             newCompositeNode(grammarAccess.getTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTag=ruleTag();

            state._fsp--;

             current =iv_ruleTag; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // InternalCucumber.g:1541:1: ruleTag returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalCucumber.g:1547:2: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalCucumber.g:1548:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalCucumber.g:1548:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalCucumber.g:1549:3: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTagAccess().getCommercialAtKeyword_0());
            		
            // InternalCucumber.g:1553:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCucumber.g:1554:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCucumber.g:1554:4: (lv_name_1_0= RULE_ID )
            // InternalCucumber.g:1555:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTagAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTagRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.farhan.Cucumber.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTag"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\1\11\1\uffff\1\5\2\uffff\1\4\1\12";
    static final String dfa_3s = "\1\25\1\uffff\1\5\2\uffff\1\25\1\13";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\2\1\3\2\uffff";
    static final String dfa_5s = "\7\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\3\1\4\11\uffff\1\2",
            "",
            "\1\5",
            "",
            "",
            "\1\6\20\uffff\1\2",
            "\1\3\1\4"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "187:2: (this_Background_0= ruleBackground | this_Scenario_1= ruleScenario | this_ScenarioOutline_2= ruleScenarioOutline )";
        }
    }
    static final String dfa_7s = "\6\uffff";
    static final String dfa_8s = "\1\1\5\uffff";
    static final String dfa_9s = "\1\11\1\uffff\1\5\1\uffff\1\4\1\12";
    static final String dfa_10s = "\1\25\1\uffff\1\5\1\uffff\1\25\1\14";
    static final String dfa_11s = "\1\uffff\1\2\1\uffff\1\1\2\uffff";
    static final String dfa_12s = "\6\uffff}>";
    static final String[] dfa_13s = {
            "\3\1\1\3\10\uffff\1\2",
            "",
            "\1\4",
            "",
            "\1\5\20\uffff\1\2",
            "\2\1\1\3"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()+ loopback of 516:3: ( (lv_examples_7_0= ruleExamples ) )+";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200E32L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200E12L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000001F8022L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001F8002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000003F9030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000003F9032L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000002022L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000006022L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000022L});

}