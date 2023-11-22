/*
 * generated by Xtext 2.32.0
 */
grammar InternalCucumber;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.farhan.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleFeature
entryRuleFeature returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFeatureRule()); }
	iv_ruleFeature=ruleFeature
	{ $current=$iv_ruleFeature.current; }
	EOF;

// Rule Feature
ruleFeature returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getFeatureAccess().getTagTagParserRuleCall_0_0_0());
					}
					lv_tag_0_0=ruleTag
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFeatureRule());
						}
						add(
							$current,
							"tag",
							lv_tag_0_0,
							"org.farhan.Cucumber.Tag");
						afterParserOrEnumRuleCall();
					}
				)
			)+
			this_EOL_1=RULE_EOL
			{
				newLeafNode(this_EOL_1, grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_0_1());
			}
		)?
		otherlv_2='Feature:'
		{
			newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getFeatureKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureAccess().getTitleSentenceParserRuleCall_2_0());
				}
				lv_title_3_0=ruleSentence
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureRule());
					}
					set(
						$current,
						"title",
						lv_title_3_0,
						"org.farhan.Cucumber.Sentence");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_EOL_4=RULE_EOL
		{
			newLeafNode(this_EOL_4, grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureAccess().getDescriptionsDescriptionParserRuleCall_4_0());
				}
				lv_descriptions_5_0=ruleDescription
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureRule());
					}
					add(
						$current,
						"descriptions",
						lv_descriptions_5_0,
						"org.farhan.Cucumber.Description");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureAccess().getBackgroundBackgroundParserRuleCall_5_0());
				}
				lv_background_6_0=ruleBackground
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureRule());
					}
					set(
						$current,
						"background",
						lv_background_6_0,
						"org.farhan.Cucumber.Background");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureAccess().getScenariosAbstractScenarioParserRuleCall_6_0());
				}
				lv_scenarios_7_0=ruleAbstractScenario
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureRule());
					}
					add(
						$current,
						"scenarios",
						lv_scenarios_7_0,
						"org.farhan.Cucumber.AbstractScenario");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleBackground
entryRuleBackground returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBackgroundRule()); }
	iv_ruleBackground=ruleBackground
	{ $current=$iv_ruleBackground.current; }
	EOF;

// Rule Background
ruleBackground returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Background:'
		{
			newLeafNode(otherlv_0, grammarAccess.getBackgroundAccess().getBackgroundKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBackgroundAccess().getTitleSentenceParserRuleCall_1_0());
				}
				lv_title_1_0=ruleSentence
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBackgroundRule());
					}
					set(
						$current,
						"title",
						lv_title_1_0,
						"org.farhan.Cucumber.Sentence");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_EOL_2=RULE_EOL
		{
			newLeafNode(this_EOL_2, grammarAccess.getBackgroundAccess().getEOLTerminalRuleCall_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBackgroundAccess().getDescriptionDescriptionParserRuleCall_3_0());
				}
				lv_description_3_0=ruleDescription
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBackgroundRule());
					}
					set(
						$current,
						"description",
						lv_description_3_0,
						"org.farhan.Cucumber.Description");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_4_0());
				}
				lv_steps_4_0=ruleStep
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBackgroundRule());
					}
					add(
						$current,
						"steps",
						lv_steps_4_0,
						"org.farhan.Cucumber.Step");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleAbstractScenario
entryRuleAbstractScenario returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractScenarioRule()); }
	iv_ruleAbstractScenario=ruleAbstractScenario
	{ $current=$iv_ruleAbstractScenario.current; }
	EOF;

// Rule AbstractScenario
ruleAbstractScenario returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractScenarioAccess().getScenarioOutlineParserRuleCall_0());
		}
		this_ScenarioOutline_0=ruleScenarioOutline
		{
			$current = $this_ScenarioOutline_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractScenarioAccess().getScenarioParserRuleCall_1());
		}
		this_Scenario_1=ruleScenario
		{
			$current = $this_Scenario_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleScenario
entryRuleScenario returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getScenarioRule()); }
	iv_ruleScenario=ruleScenario
	{ $current=$iv_ruleScenario.current; }
	EOF;

// Rule Scenario
ruleScenario returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getScenarioAccess().getTagTagParserRuleCall_0_0_0());
					}
					lv_tag_0_0=ruleTag
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getScenarioRule());
						}
						add(
							$current,
							"tag",
							lv_tag_0_0,
							"org.farhan.Cucumber.Tag");
						afterParserOrEnumRuleCall();
					}
				)
			)
			this_EOL_1=RULE_EOL
			{
				newLeafNode(this_EOL_1, grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_0_1());
			}
		)?
		otherlv_2='Scenario:'
		{
			newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getScenarioKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioAccess().getTitleSentenceParserRuleCall_2_0());
				}
				lv_title_3_0=ruleSentence
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioRule());
					}
					set(
						$current,
						"title",
						lv_title_3_0,
						"org.farhan.Cucumber.Sentence");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_EOL_4=RULE_EOL
		{
			newLeafNode(this_EOL_4, grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioAccess().getDescriptionDescriptionParserRuleCall_4_0());
				}
				lv_description_5_0=ruleDescription
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioRule());
					}
					set(
						$current,
						"description",
						lv_description_5_0,
						"org.farhan.Cucumber.Description");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_5_0());
				}
				lv_steps_6_0=ruleStep
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioRule());
					}
					add(
						$current,
						"steps",
						lv_steps_6_0,
						"org.farhan.Cucumber.Step");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleScenarioOutline
entryRuleScenarioOutline returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getScenarioOutlineRule()); }
	iv_ruleScenarioOutline=ruleScenarioOutline
	{ $current=$iv_ruleScenarioOutline.current; }
	EOF;

// Rule ScenarioOutline
ruleScenarioOutline returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getScenarioOutlineAccess().getTagTagParserRuleCall_0_0_0());
					}
					lv_tag_0_0=ruleTag
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
						}
						add(
							$current,
							"tag",
							lv_tag_0_0,
							"org.farhan.Cucumber.Tag");
						afterParserOrEnumRuleCall();
					}
				)
			)
			this_EOL_1=RULE_EOL
			{
				newLeafNode(this_EOL_1, grammarAccess.getScenarioOutlineAccess().getEOLTerminalRuleCall_0_1());
			}
		)?
		otherlv_2='Scenario Outline:'
		{
			newLeafNode(otherlv_2, grammarAccess.getScenarioOutlineAccess().getScenarioOutlineKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioOutlineAccess().getTitleSentenceParserRuleCall_2_0());
				}
				lv_title_3_0=ruleSentence
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
					}
					set(
						$current,
						"title",
						lv_title_3_0,
						"org.farhan.Cucumber.Sentence");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_EOL_4=RULE_EOL
		{
			newLeafNode(this_EOL_4, grammarAccess.getScenarioOutlineAccess().getEOLTerminalRuleCall_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioOutlineAccess().getDescriptionDescriptionParserRuleCall_4_0());
				}
				lv_description_5_0=ruleDescription
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
					}
					set(
						$current,
						"description",
						lv_description_5_0,
						"org.farhan.Cucumber.Description");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioOutlineAccess().getStepsStepParserRuleCall_5_0());
				}
				lv_steps_6_0=ruleStep
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
					}
					add(
						$current,
						"steps",
						lv_steps_6_0,
						"org.farhan.Cucumber.Step");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioOutlineAccess().getExamplesExampleParserRuleCall_6_0());
				}
				lv_examples_7_0=ruleExample
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
					}
					add(
						$current,
						"examples",
						lv_examples_7_0,
						"org.farhan.Cucumber.Example");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleExample
entryRuleExample returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExampleRule()); }
	iv_ruleExample=ruleExample
	{ $current=$iv_ruleExample.current; }
	EOF;

// Rule Example
ruleExample returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getExampleAccess().getTagTagParserRuleCall_0_0_0());
					}
					lv_tag_0_0=ruleTag
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExampleRule());
						}
						add(
							$current,
							"tag",
							lv_tag_0_0,
							"org.farhan.Cucumber.Tag");
						afterParserOrEnumRuleCall();
					}
				)
			)
			this_EOL_1=RULE_EOL
			{
				newLeafNode(this_EOL_1, grammarAccess.getExampleAccess().getEOLTerminalRuleCall_0_1());
			}
		)?
		otherlv_2='Examples:'
		{
			newLeafNode(otherlv_2, grammarAccess.getExampleAccess().getExamplesKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExampleAccess().getTitleSentenceParserRuleCall_2_0());
				}
				lv_title_3_0=ruleSentence
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExampleRule());
					}
					set(
						$current,
						"title",
						lv_title_3_0,
						"org.farhan.Cucumber.Sentence");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_EOL_4=RULE_EOL
		{
			newLeafNode(this_EOL_4, grammarAccess.getExampleAccess().getEOLTerminalRuleCall_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExampleAccess().getDescriptionDescriptionParserRuleCall_4_0());
				}
				lv_description_5_0=ruleDescription
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExampleRule());
					}
					set(
						$current,
						"description",
						lv_description_5_0,
						"org.farhan.Cucumber.Description");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getExampleAccess().getTableTableParserRuleCall_5_0());
				}
				lv_table_6_0=ruleTable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExampleRule());
					}
					set(
						$current,
						"table",
						lv_table_6_0,
						"org.farhan.Cucumber.Table");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleDescription
entryRuleDescription returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDescriptionRule()); }
	iv_ruleDescription=ruleDescription
	{ $current=$iv_ruleDescription.current; }
	EOF;

// Rule Description
ruleDescription returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getDescriptionAccess().getLineSentenceParserRuleCall_0_0());
				}
				lv_line_0_0=ruleSentence
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDescriptionRule());
					}
					set(
						$current,
						"line",
						lv_line_0_0,
						"org.farhan.Cucumber.Sentence");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_EOL_1=RULE_EOL
		{
			newLeafNode(this_EOL_1, grammarAccess.getDescriptionAccess().getEOLTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleStep
entryRuleStep returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStepRule()); }
	iv_ruleStep=ruleStep
	{ $current=$iv_ruleStep.current; }
	EOF;

// Rule Step
ruleStep returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='Given'
			{
				newLeafNode(otherlv_0, grammarAccess.getStepAccess().getGivenKeyword_0_0());
			}
			    |
			otherlv_1='When'
			{
				newLeafNode(otherlv_1, grammarAccess.getStepAccess().getWhenKeyword_0_1());
			}
			    |
			otherlv_2='Then'
			{
				newLeafNode(otherlv_2, grammarAccess.getStepAccess().getThenKeyword_0_2());
			}
			    |
			otherlv_3='And'
			{
				newLeafNode(otherlv_3, grammarAccess.getStepAccess().getAndKeyword_0_3());
			}
			    |
			otherlv_4='But'
			{
				newLeafNode(otherlv_4, grammarAccess.getStepAccess().getButKeyword_0_4());
			}
			    |
			otherlv_5='*'
			{
				newLeafNode(otherlv_5, grammarAccess.getStepAccess().getAsteriskKeyword_0_5());
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getStepAccess().getTitleSentenceParserRuleCall_1_0());
				}
				lv_title_6_0=ruleSentence
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStepRule());
					}
					set(
						$current,
						"title",
						lv_title_6_0,
						"org.farhan.Cucumber.Sentence");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			this_EOL_7=RULE_EOL
			{
				newLeafNode(this_EOL_7, grammarAccess.getStepAccess().getEOLTerminalRuleCall_2());
			}
		)?
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getStepAccess().getTableTableParserRuleCall_3_0_0());
					}
					lv_table_8_0=ruleTable
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStepRule());
						}
						set(
							$current,
							"table",
							lv_table_8_0,
							"org.farhan.Cucumber.Table");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getStepAccess().getTextDocStringParserRuleCall_3_1_0());
					}
					lv_text_9_0=ruleDocString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStepRule());
						}
						set(
							$current,
							"text",
							lv_text_9_0,
							"org.farhan.Cucumber.DocString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleTable
entryRuleTable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTableRule()); }
	iv_ruleTable=ruleTable
	{ $current=$iv_ruleTable.current; }
	EOF;

// Rule Table
ruleTable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getTableAccess().getRowsTableRowParserRuleCall_0());
			}
			lv_rows_0_0=ruleTableRow
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getTableRule());
				}
				add(
					$current,
					"rows",
					lv_rows_0_0,
					"org.farhan.Cucumber.TableRow");
				afterParserOrEnumRuleCall();
			}
		)
	)+
;

// Entry rule entryRuleTableRow
entryRuleTableRow returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTableRowRule()); }
	iv_ruleTableRow=ruleTableRow
	{ $current=$iv_ruleTableRow.current; }
	EOF;

// Rule TableRow
ruleTableRow returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getTableRowAccess().getCellsRowCellParserRuleCall_0_0());
				}
				lv_cells_0_0=ruleRowCell
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTableRowRule());
					}
					add(
						$current,
						"cells",
						lv_cells_0_0,
						"org.farhan.Cucumber.RowCell");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_1='|'
		{
			newLeafNode(otherlv_1, grammarAccess.getTableRowAccess().getVerticalLineKeyword_1());
		}
		this_EOL_2=RULE_EOL
		{
			newLeafNode(this_EOL_2, grammarAccess.getTableRowAccess().getEOLTerminalRuleCall_2());
		}
	)
;

// Entry rule entryRuleRowCell
entryRuleRowCell returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRowCellRule()); }
	iv_ruleRowCell=ruleRowCell
	{ $current=$iv_ruleRowCell.current; }
	EOF;

// Rule RowCell
ruleRowCell returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_cell_0_0='|'
				{
					newLeafNode(lv_cell_0_0, grammarAccess.getRowCellAccess().getCellVerticalLineKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRowCellRule());
					}
					setWithLastConsumed($current, "cell", lv_cell_0_0, "|");
				}
			)
		)
		{
			newCompositeNode(grammarAccess.getRowCellAccess().getSentenceParserRuleCall_1());
		}
		ruleSentence
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDocString
entryRuleDocString returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDocStringRule()); }
	iv_ruleDocString=ruleDocString
	{ $current=$iv_ruleDocString.current; }
	EOF;

// Rule DocString
ruleDocString returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getDocStringAccess().getDocStringAction_0(),
					$current);
			}
		)
		otherlv_1='"""'
		{
			newLeafNode(otherlv_1, grammarAccess.getDocStringAccess().getQuotationMarkQuotationMarkQuotationMarkKeyword_1());
		}
		(
			{
				newCompositeNode(grammarAccess.getDocStringAccess().getSentenceParserRuleCall_2_0());
			}
			ruleSentence
			{
				afterParserOrEnumRuleCall();
			}
			    |
			this_EOL_3=RULE_EOL
			{
				newLeafNode(this_EOL_3, grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_2_1());
			}
		)*
		otherlv_4='"""'
		{
			newLeafNode(otherlv_4, grammarAccess.getDocStringAccess().getQuotationMarkQuotationMarkQuotationMarkKeyword_3());
		}
		this_EOL_5=RULE_EOL
		{
			newLeafNode(this_EOL_5, grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_4());
		}
	)
;

// Entry rule entryRuleTag
entryRuleTag returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTagRule()); }
	iv_ruleTag=ruleTag
	{ $current=$iv_ruleTag.current; }
	EOF;

// Rule Tag
ruleTag returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_tag_0_0=RULE_TAG_ID
			{
				newLeafNode(lv_tag_0_0, grammarAccess.getTagAccess().getTagTAG_IDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getTagRule());
				}
				setWithLastConsumed(
					$current,
					"tag",
					lv_tag_0_0,
					"org.farhan.Cucumber.TAG_ID");
			}
		)
	)
;

// Entry rule entryRuleSentence
entryRuleSentence returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSentenceRule()); }
	iv_ruleSentence=ruleSentence
	{ $current=$iv_ruleSentence.current.getText(); }
	EOF;

// Rule Sentence
ruleSentence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_WORD_0=RULE_WORD
		{
			$current.merge(this_WORD_0);
		}
		{
			newLeafNode(this_WORD_0, grammarAccess.getSentenceAccess().getWORDTerminalRuleCall());
		}
	)+
;

RULE_WS : (' '|'\t')+;

RULE_EOL : ('\r'|'\n')+;

RULE_SL_COMMENT : '#' ~(('\r'|'\n'))* RULE_EOL;

RULE_WORD : ~(('@'|'|'|' '|'\t'|'\n'|'\r'))+;

RULE_TAG_ID : '@' RULE_WORD;
