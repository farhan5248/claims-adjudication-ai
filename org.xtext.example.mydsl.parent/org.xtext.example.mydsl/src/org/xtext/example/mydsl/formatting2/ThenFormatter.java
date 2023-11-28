package org.xtext.example.mydsl.formatting2;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractParserRuleElementFinder;
import org.xtext.example.mydsl.myDsl.Then;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;
import org.xtext.example.mydsl.services.MyDslGrammarAccess.ThenElements;

public class ThenFormatter extends StepFormatter {

	public ThenFormatter(Then theThen) {
		super(theThen);
	}

	@Override
	protected AbstractParserRuleElementFinder getAccess(MyDslGrammarAccess ga) {
		return ga.getThenAccess();
	}

	@Override
	protected Keyword getKeyword(AbstractParserRuleElementFinder a) {
		return ((ThenElements) a).getThenKeyword_0();
	}

	@Override
	protected RuleCall getEOLRuleCall(AbstractParserRuleElementFinder a) {
		return ((ThenElements) a).getEOLTerminalRuleCall_2();
	}

	@Override
	protected RuleCall getPhraseRuleCall(AbstractParserRuleElementFinder a) {
		return ((ThenElements) a).getNamePhraseParserRuleCall_1_0();
	}

	@Override
	protected void formatKeyword(ISemanticRegion iSR, IFormattableDocument doc) {
		doc.prepend(iSR, it -> it.noSpace());
		doc.append(iSR, it -> it.noSpace());
		replace(doc, iSR, getIndent() + " " + iSR.getText() + " ");
	}

}