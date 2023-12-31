package org.xtext.example.mydsl.formatting2;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.xtext.example.mydsl.myDsl.DocString;
import org.xtext.example.mydsl.myDsl.Statement;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;
import org.xtext.example.mydsl.services.MyDslGrammarAccess.DocStringElements;

public class DocStringFormatter extends Formatter {

	private DocString theDocString;

	public DocStringFormatter(DocString theDocString) {
		this.theDocString = theDocString;
	}

	public void isEOLDouble(boolean isEOLDouble) {
		this.isLastEOLDouble = isEOLDouble;
	}

	protected void formatKeyword(ISemanticRegion iSR, IFormattableDocument doc) {
		doc.prepend(iSR, it -> it.noSpace());
		doc.append(iSR, it -> it.noSpace());
		replace(doc, iSR, getIndent() + iSR.getText());
	}

	public void format(IFormattableDocument doc, MyDslGrammarAccess ga, MyDslFormatter df) {
		DocStringElements a = ga.getDocStringAccess();
		formatKeyword(df.getRegion(theDocString, a.getQuotationMarkQuotationMarkQuotationMarkKeyword_0()), doc);
		formatEOL1RuleCall(df.getRegion(theDocString, a.getEOLTerminalRuleCall_1()), doc);
		formatKeyword(df.getRegion(theDocString, a.getQuotationMarkQuotationMarkQuotationMarkKeyword_3()), doc);
		formatEOL12RuleCall(df.getRegion(theDocString, a.getEOLTerminalRuleCall_4()), doc);
		for (Statement s : theDocString.getStatements()) {
			StatementFormatter formatter = new StatementFormatter(s);
			formatter.isLast(isLastElement(s, theDocString.getStatements()));
			formatter.setIndent(10, true);
			formatter.isLastEOLDouble(false);
			formatter.format(doc, ga, df);
		}
	}

}
