/*
 * generated by Xtext 2.32.0
 */
grammar InternalCucumber;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.farhan.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.farhan.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.farhan.services.CucumberGrammarAccess;

}
@parser::members {
	private CucumberGrammarAccess grammarAccess;

	public void setGrammarAccess(CucumberGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleFeature
entryRuleFeature
:
{ before(grammarAccess.getFeatureRule()); }
	 ruleFeature
{ after(grammarAccess.getFeatureRule()); } 
	 EOF 
;

// Rule Feature
ruleFeature 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFeatureAccess().getGroup()); }
		(rule__Feature__Group__0)
		{ after(grammarAccess.getFeatureAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleScenario
entryRuleScenario
:
{ before(grammarAccess.getScenarioRule()); }
	 ruleScenario
{ after(grammarAccess.getScenarioRule()); } 
	 EOF 
;

// Rule Scenario
ruleScenario 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getScenarioAccess().getGroup()); }
		(rule__Scenario__Group__0)
		{ after(grammarAccess.getScenarioAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStep
entryRuleStep
:
{ before(grammarAccess.getStepRule()); }
	 ruleStep
{ after(grammarAccess.getStepRule()); } 
	 EOF 
;

// Rule Step
ruleStep 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStepAccess().getGroup()); }
		(rule__Step__Group__0)
		{ after(grammarAccess.getStepAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDescription
entryRuleDescription
:
{ before(grammarAccess.getDescriptionRule()); }
	 ruleDescription
{ after(grammarAccess.getDescriptionRule()); } 
	 EOF 
;

// Rule Description
ruleDescription 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDescriptionAccess().getGroup()); }
		(rule__Description__Group__0)
		{ after(grammarAccess.getDescriptionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Step__KeywordAlternatives_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStepAccess().getKeywordGivenKeyword_0_0_0()); }
		'Given'
		{ after(grammarAccess.getStepAccess().getKeywordGivenKeyword_0_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getStepAccess().getKeywordWhenKeyword_0_0_1()); }
		'When'
		{ after(grammarAccess.getStepAccess().getKeywordWhenKeyword_0_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getStepAccess().getKeywordThenKeyword_0_0_2()); }
		'Then'
		{ after(grammarAccess.getStepAccess().getKeywordThenKeyword_0_0_2()); }
	)
	|
	(
		{ before(grammarAccess.getStepAccess().getKeywordAndKeyword_0_0_3()); }
		'And'
		{ after(grammarAccess.getStepAccess().getKeywordAndKeyword_0_0_3()); }
	)
	|
	(
		{ before(grammarAccess.getStepAccess().getKeywordButKeyword_0_0_4()); }
		'But'
		{ after(grammarAccess.getStepAccess().getKeywordButKeyword_0_0_4()); }
	)
	|
	(
		{ before(grammarAccess.getStepAccess().getKeywordAsteriskKeyword_0_0_5()); }
		'*'
		{ after(grammarAccess.getStepAccess().getKeywordAsteriskKeyword_0_0_5()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__0__Impl
	rule__Feature__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getFeatureKeyword_0()); }
	'Feature:'
	{ after(grammarAccess.getFeatureAccess().getFeatureKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__1__Impl
	rule__Feature__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getTitleAssignment_1()); }
	(rule__Feature__TitleAssignment_1)
	{ after(grammarAccess.getFeatureAccess().getTitleAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getScenariosAssignment_2()); }
	(rule__Feature__ScenariosAssignment_2)*
	{ after(grammarAccess.getFeatureAccess().getScenariosAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Scenario__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario__Group__0__Impl
	rule__Scenario__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenarioAccess().getScenarioKeyword_0()); }
	'Scenario:'
	{ after(grammarAccess.getScenarioAccess().getScenarioKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario__Group__1__Impl
	rule__Scenario__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenarioAccess().getTitleAssignment_1()); }
	(rule__Scenario__TitleAssignment_1)
	{ after(grammarAccess.getScenarioAccess().getTitleAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenarioAccess().getStepsAssignment_2()); }
	(rule__Scenario__StepsAssignment_2)*
	{ after(grammarAccess.getScenarioAccess().getStepsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Step__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Step__Group__0__Impl
	rule__Step__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Step__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStepAccess().getKeywordAssignment_0()); }
	(rule__Step__KeywordAssignment_0)
	{ after(grammarAccess.getStepAccess().getKeywordAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Step__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Step__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Step__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStepAccess().getDescriptionAssignment_1()); }
	(rule__Step__DescriptionAssignment_1)
	{ after(grammarAccess.getStepAccess().getDescriptionAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Description__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Description__Group__0__Impl
	rule__Description__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Description__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDescriptionAccess().getWORDTerminalRuleCall_0()); }
	RULE_WORD
	{ after(grammarAccess.getDescriptionAccess().getWORDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Description__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Description__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Description__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDescriptionAccess().getWORDTerminalRuleCall_1()); }
	(RULE_WORD)*
	{ after(grammarAccess.getDescriptionAccess().getWORDTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__TitleAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getTitleDescriptionParserRuleCall_1_0()); }
		ruleDescription
		{ after(grammarAccess.getFeatureAccess().getTitleDescriptionParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__ScenariosAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getScenariosScenarioParserRuleCall_2_0()); }
		ruleScenario
		{ after(grammarAccess.getFeatureAccess().getScenariosScenarioParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__TitleAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenarioAccess().getTitleDescriptionParserRuleCall_1_0()); }
		ruleDescription
		{ after(grammarAccess.getScenarioAccess().getTitleDescriptionParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__StepsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_2_0()); }
		ruleStep
		{ after(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Step__KeywordAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStepAccess().getKeywordAlternatives_0_0()); }
		(rule__Step__KeywordAlternatives_0_0)
		{ after(grammarAccess.getStepAccess().getKeywordAlternatives_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Step__DescriptionAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStepAccess().getDescriptionDescriptionParserRuleCall_1_0()); }
		ruleDescription
		{ after(grammarAccess.getStepAccess().getDescriptionDescriptionParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_WORD : ' ' ('a'..'z'|'A'..'Z'|'0'..'9')+;
