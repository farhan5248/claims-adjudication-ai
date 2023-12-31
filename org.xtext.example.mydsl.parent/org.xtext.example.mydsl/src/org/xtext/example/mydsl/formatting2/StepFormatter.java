package org.xtext.example.mydsl.formatting2;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractParserRuleElementFinder;
import org.xtext.example.mydsl.myDsl.Step;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public abstract class StepFormatter extends Formatter {

	// Put this here to avoid mixing up nested lists like steps and rows
	// TODO this is duplicated code, maybe if it wasn't static, then there'd be no
	// reason for duplication?
	// TODO isLast has to be static for now for the StepTable code to know if it
	// belongs to the last step
	protected Step theStep;

	public StepFormatter(Step theStep) {
		this.theStep = theStep;
	}

	protected abstract void formatKeyword(ISemanticRegion iSR, IFormattableDocument doc);

	protected abstract AbstractParserRuleElementFinder getAccess(MyDslGrammarAccess ga);

	protected abstract Keyword getKeyword(AbstractParserRuleElementFinder a);

	protected abstract RuleCall getEOLRuleCall(AbstractParserRuleElementFinder a);

	protected abstract RuleCall getPhraseRuleCall(AbstractParserRuleElementFinder a);

	public void format(IFormattableDocument doc, MyDslGrammarAccess ga, MyDslFormatter df) {

		AbstractParserRuleElementFinder a = getAccess(ga);
		formatKeyword(df.getRegion(theStep, getKeyword(a)), doc);
		formatPhraseRuleCall(df.getRegion(theStep, getPhraseRuleCall(a)), doc);
		formatEOL12RuleCall(df.getRegion(theStep, getEOLRuleCall(a)), doc);
		if (theStep.getTheStepTable() != null) {
			StepTableFormatter formatter = new StepTableFormatter(theStep.getTheStepTable());
			formatter.setIndent(10);
			formatter.isEOLDouble(isLast);
			formatter.format(doc, ga, df);
		}
		if (theStep.getTheDocString() != null) {
			DocStringFormatter formatter2 = new DocStringFormatter(theStep.getTheDocString());
			formatter2.setIndent(10);
			formatter2.isEOLDouble(isLast);
			formatter2.format(doc, ga, df);
		}
	}

}
