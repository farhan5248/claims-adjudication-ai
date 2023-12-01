/*
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl.formatting2;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.formatting2.AbstractJavaFormatter;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.xtext.example.mydsl.myDsl.Feature;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;
import com.google.inject.Inject;

public class MyDslFormatter extends AbstractJavaFormatter {

	@Inject
	private MyDslGrammarAccess ga;

	protected void format(Feature theFeature, IFormattableDocument doc) {

		FeatureFormatter formatter = new FeatureFormatter(theFeature);
		formatter.setIndent(0);
		formatter.format(doc, ga, this);
	}

	// TODO move to Markdown
	// All 3 approaches below reference the same region, which can be tested by
	// triggering a ConflictingFormattingException
	// regionFor(model).feature(Literals.MODEL__NAME);
	// regionFor(model).assignment(ga.getModelAccess().getNameAssignment_1());
	// regionFor(model).ruleCall(ga.getModelAccess().getNamePhraseParserRuleCall_1_0());

	public ISemanticRegion getRegion(EObject eo, RuleCall ruleCall) {
		return regionFor(eo).ruleCall(ruleCall);
	}

	// TODO move to Markdown
	// You can also search for the keyword using keyword("Feature:");
	public ISemanticRegion getRegion(EObject eo, Keyword keyword) {
		return regionFor(eo).keyword(keyword);
	}
}