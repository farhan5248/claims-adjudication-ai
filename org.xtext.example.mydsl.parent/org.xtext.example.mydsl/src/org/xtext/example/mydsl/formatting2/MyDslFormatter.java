/*
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl.formatting2;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.formatting2.AbstractJavaFormatter;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.xtext.example.mydsl.myDsl.AbstractScenario;
import org.xtext.example.mydsl.myDsl.And;
import org.xtext.example.mydsl.myDsl.Asterisk;
import org.xtext.example.mydsl.myDsl.Background;
import org.xtext.example.mydsl.myDsl.But;
import org.xtext.example.mydsl.myDsl.Given;
import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.Scenario;
import org.xtext.example.mydsl.myDsl.ScenarioOutline;
import org.xtext.example.mydsl.myDsl.Statement;
import org.xtext.example.mydsl.myDsl.Step;
import org.xtext.example.mydsl.myDsl.Tag;
import org.xtext.example.mydsl.myDsl.Then;
import org.xtext.example.mydsl.myDsl.When;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;
import org.xtext.example.mydsl.services.MyDslGrammarAccess.AndElements;
import org.xtext.example.mydsl.services.MyDslGrammarAccess.AsteriskElements;
import org.xtext.example.mydsl.services.MyDslGrammarAccess.BackgroundElements;
import org.xtext.example.mydsl.services.MyDslGrammarAccess.ButElements;
import org.xtext.example.mydsl.services.MyDslGrammarAccess.GivenElements;
import org.xtext.example.mydsl.services.MyDslGrammarAccess.ModelElements;
import org.xtext.example.mydsl.services.MyDslGrammarAccess.ScenarioElements;
import org.xtext.example.mydsl.services.MyDslGrammarAccess.ScenarioOutlineElements;
import org.xtext.example.mydsl.services.MyDslGrammarAccess.StatementElements;
import org.xtext.example.mydsl.services.MyDslGrammarAccess.TagElements;
import org.xtext.example.mydsl.services.MyDslGrammarAccess.ThenElements;
import org.xtext.example.mydsl.services.MyDslGrammarAccess.WhenElements;

import com.google.inject.Inject;

public class MyDslFormatter extends AbstractJavaFormatter {

	@Inject
	private MyDslGrammarAccess ga;

	protected void format(Model m, IFormattableDocument doc) {

		ModelElements a = ga.getModelAccess();

		for (Tag t : m.getTags()) {
			TagFormatter.isLast(isLastElement(t, m.getTags()));
			doc.format(t);
		}
		ModelFormatter.formatEOL1RuleCall(getRegion(m, a.getEOLTerminalRuleCall_0_1()), doc);
		ModelFormatter.formatFeatureKeyword(getRegion(m, a.getFeatureKeyword_1()), doc);
		// There's two types of assignments, = and += where the latter is a list
		// This is an example of how to access an assignment of just one item.
		// An assignment has 2 parts, the feature (name) and the ruleCall (Phrase)
		// Together they make up an assignment.
		// A ruleCall is anything that's in the xtext file with a :
		// So a ruleCall can be a structure like thing with attributes or a terminal
		ModelFormatter.formatNameRuleCall(getRegion(m, a.getNamePhraseParserRuleCall_2_0()), doc);
		ModelFormatter.formatEOL2RuleCall(getRegion(m, a.getEOLTerminalRuleCall_3()), doc);
		for (Statement s : m.getStatements()) {

			StatementFormatter.isLast(isLastElement(s, m.getStatements()));
			StatementFormatter.setIndent(2);
			doc.format(s);
		}
		for (AbstractScenario s : m.getAbstractScenarios()) {

			AbstractScenarioFormatter.setIndent(2);
			doc.format(s);
		}
	}

	protected void format(Tag t, IFormattableDocument doc) {

		TagElements a = ga.getTagAccess();
		TagFormatter.formatFeatureKeyword(getRegion(t, a.getCommercialAtKeyword_0()), doc);
		TagFormatter.formatNameRuleCall(getRegion(t, a.getNameIDTerminalRuleCall_1_0()), doc);
	}

	// These are examples on how to access something with += loop through the
	// elements and then get the name. The approach is the following, loop
	// through the elements. Then invoke a formatter on the rule call like for name
	// above. The 3 other approaches, feature, keyword and assignment throw
	// exceptions in the regionFor method
	// A note on the regionFor method. It works for statement works but not for
	// name. Like you can't do model.getName() and then pass that to regionFor. The
	// reason being that name has no attributes.
	// This method, like the one for Model is invoked by doc.format like on line 74.
	// What happens is that the doc.format method uses the reflection API to find
	// this method
	protected void format(Statement s, IFormattableDocument doc) {

		StatementElements a = ga.getStatementAccess();
		StatementFormatter.formatNameRuleCall(getRegion(s, a.getNamePhraseParserRuleCall_0_0()), doc);
		StatementFormatter.formatEOLRuleCall(getRegion(s, a.getEOLTerminalRuleCall_1()), doc);
	}

	// This is an example of how to work with abstract types like stepSet which can
	// be 3 different rule calls
	protected void format(AbstractScenario s, IFormattableDocument doc) {
		if (s instanceof Background) {
			doc.format((Background) s);
		} else if (s instanceof Scenario) {
			doc.format((Scenario) s);
		} else if (s instanceof ScenarioOutline) {
			doc.format((ScenarioOutline) s);
		}
	}

	protected void format(Background b, IFormattableDocument doc) {

		BackgroundElements a = ga.getBackgroundAccess();
		BackgroundFormatter.formatBackgroundKeyword(getRegion(b, a.getBackgroundKeyword_0()), doc);
		BackgroundFormatter.formatNameRuleCall(getRegion(b, a.getNamePhraseParserRuleCall_1_0()), doc);
		BackgroundFormatter.formatEOL2RuleCall(getRegion(b, a.getEOLTerminalRuleCall_2()), doc);
		for (Statement s : b.getStatements()) {

			StatementFormatter.isLast(isLastElement(s, b.getStatements()));
			StatementFormatter.setIndent(4);
			doc.format(s);
		}
		for (Step s : b.getSteps()) {

			AsteriskFormatter.isLast(isLastElement(s, b.getSteps()));
			AsteriskFormatter.setIndent(4);
			doc.format(s);
		}
	}

	protected void format(Scenario b, IFormattableDocument doc) {

		ScenarioElements a = ga.getScenarioAccess();

		for (Tag t : b.getTags()) {
			TagFormatter.isLast(isLastElement(t, b.getTags()));
			TagFormatter.isFirst(isFirstElement(t, b.getTags()));
			doc.format(t);
		}
		ScenarioFormatter.formatEOL1RuleCall(getRegion(b, a.getEOLTerminalRuleCall_0_1()), doc);
		ScenarioFormatter.formatScenarioKeyword(getRegion(b, a.getScenarioKeyword_1()), doc);
		ScenarioFormatter.formatNameRuleCall(getRegion(b, a.getNamePhraseParserRuleCall_2_0()), doc);
		ScenarioFormatter.formatEOL2RuleCall(getRegion(b, a.getEOLTerminalRuleCall_3()), doc);
		for (Statement s : b.getStatements()) {

			StatementFormatter.isLast(isLastElement(s, b.getStatements()));
			StatementFormatter.setIndent(4);
			doc.format(s);
		}
		for (Step s : b.getSteps()) {

			AsteriskFormatter.isLast(isLastElement(s, b.getSteps()));
			AsteriskFormatter.setIndent(4);
			doc.format(s);
		}
	}

	protected void format(ScenarioOutline b, IFormattableDocument doc) {

		ScenarioOutlineElements a = ga.getScenarioOutlineAccess();

		for (Tag t : b.getTags()) {
			TagFormatter.isLast(isLastElement(t, b.getTags()));
			TagFormatter.isFirst(isFirstElement(t, b.getTags()));
			doc.format(t);
		}
		ScenarioOutlineFormatter.formatEOL1RuleCall(getRegion(b, a.getEOLTerminalRuleCall_0_1()), doc);
		ScenarioOutlineFormatter.formatScenarioOutlineKeyword(getRegion(b, a.getScenarioOutlineKeyword_1()), doc);
		ScenarioOutlineFormatter.formatNameRuleCall(getRegion(b, a.getNamePhraseParserRuleCall_2_0()), doc);
		ScenarioOutlineFormatter.formatEOL2RuleCall(getRegion(b, a.getEOLTerminalRuleCall_3()), doc);
		for (Statement s : b.getStatements()) {

			StatementFormatter.isLast(isLastElement(s, b.getStatements()));
			StatementFormatter.setIndent(4);
			doc.format(s);
		}
		for (Step s : b.getSteps()) {

			AsteriskFormatter.isLast(isLastElement(s, b.getSteps()));
			AsteriskFormatter.setIndent(4);
			doc.format(s);
		}
	}

	protected void format(Step s, IFormattableDocument doc) {
		if (s instanceof Given) {
			doc.format((Given) s);
		} else if (s instanceof When) {
			doc.format((When) s);
		} else if (s instanceof Then) {
			doc.format((Then) s);
		} else if (s instanceof And) {
			doc.format((And) s);
		} else if (s instanceof But) {
			doc.format((But) s);
		} else if (s instanceof Asterisk) {
			doc.format((Asterisk) s);
		}
	}

	protected void format(Given s, IFormattableDocument doc) {
		GivenElements a = ga.getGivenAccess();
		GivenFormatter.formatGivenKeyword(getRegion(s, a.getGivenKeyword_0()), doc);
		GivenFormatter.formatNameRuleCall(getRegion(s, a.getNamePhraseParserRuleCall_1_0()), doc);
		GivenFormatter.formatEOLRuleCall(getRegion(s, a.getEOLTerminalRuleCall_2()), doc);
	}

	protected void format(When s, IFormattableDocument doc) {
		WhenElements a = ga.getWhenAccess();
		WhenFormatter.formatWhenKeyword(getRegion(s, a.getWhenKeyword_0()), doc);
		WhenFormatter.formatNameRuleCall(getRegion(s, a.getNamePhraseParserRuleCall_1_0()), doc);
		WhenFormatter.formatEOLRuleCall(getRegion(s, a.getEOLTerminalRuleCall_2()), doc);
	}

	protected void format(Then s, IFormattableDocument doc) {
		ThenElements a = ga.getThenAccess();
		ThenFormatter.formatThenKeyword(getRegion(s, a.getThenKeyword_0()), doc);
		ThenFormatter.formatNameRuleCall(getRegion(s, a.getNamePhraseParserRuleCall_1_0()), doc);
		ThenFormatter.formatEOLRuleCall(getRegion(s, a.getEOLTerminalRuleCall_2()), doc);
	}

	protected void format(And s, IFormattableDocument doc) {
		AndElements a = ga.getAndAccess();
		AndFormatter.formatAndKeyword(getRegion(s, a.getAndKeyword_0()), doc);
		AndFormatter.formatNameRuleCall(getRegion(s, a.getNamePhraseParserRuleCall_1_0()), doc);
		AndFormatter.formatEOLRuleCall(getRegion(s, a.getEOLTerminalRuleCall_2()), doc);
	}

	protected void format(But s, IFormattableDocument doc) {
		ButElements a = ga.getButAccess();
		ButFormatter.formatButKeyword(getRegion(s, a.getButKeyword_0()), doc);
		ButFormatter.formatNameRuleCall(getRegion(s, a.getNamePhraseParserRuleCall_1_0()), doc);
		ButFormatter.formatEOLRuleCall(getRegion(s, a.getEOLTerminalRuleCall_2()), doc);
	}

	protected void format(Asterisk s, IFormattableDocument doc) {

		AsteriskElements a = ga.getAsteriskAccess();
		AsteriskFormatter.formatAsteriskKeyword(getRegion(s, a.getAsteriskKeyword_0()), doc);
		AsteriskFormatter.formatNameRuleCall(getRegion(s, a.getNamePhraseParserRuleCall_1_0()), doc);
		AsteriskFormatter.formatEOLRuleCall(getRegion(s, a.getEOLTerminalRuleCall_2()), doc);
	}

	@SuppressWarnings("rawtypes")
	private boolean isLastElement(EObject o, EList l) {
		int lastIndex = l.size() - 1;
		return o.equals(l.get(lastIndex));
	}

	@SuppressWarnings("rawtypes")
	private boolean isFirstElement(EObject o, EList l) {
		int firstIndex = 0;
		return o.equals(l.get(firstIndex));
	}

	private ISemanticRegion getRegion(EObject eo, RuleCall ruleCall) {
		// All 3 approaches below reference the same region, which can be tested by
		// triggering a ConflictingFormattingException
		// regionFor(model).feature(Literals.MODEL__NAME);
		// regionFor(model).assignment(ga.getModelAccess().getNameAssignment_1());
		// regionFor(model).ruleCall(ga.getModelAccess().getNamePhraseParserRuleCall_1_0());

		return regionFor(eo).ruleCall(ruleCall);
	}

	private ISemanticRegion getRegion(EObject eo, Keyword keyword) {
		// You can also search for the keyword using keyword("Feature:");
		return regionFor(eo).keyword(keyword);
	}

}
