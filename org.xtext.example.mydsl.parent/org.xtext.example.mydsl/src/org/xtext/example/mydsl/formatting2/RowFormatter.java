package org.xtext.example.mydsl.formatting2;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.xtext.example.mydsl.myDsl.Cell;
import org.xtext.example.mydsl.myDsl.Row;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;
import org.xtext.example.mydsl.services.MyDslGrammarAccess.RowElements;

public class RowFormatter extends Formatter {

	// TODO isLast has to be static for now for the Cell code to know if it
	// belongs to the last row

	private Row theRow;

	public RowFormatter(Row Row) {
		this.theRow = Row;
	}

	public void format(IFormattableDocument doc, MyDslGrammarAccess ga, MyDslFormatter df) {
		RowElements a = ga.getRowAccess();
		for (Cell c : theRow.getCells()) {
			CellFormatter formatter = new CellFormatter(c);
			formatter.setIndent(10);
			formatter.isLast(isLastElement(c, theRow.getCells()));
			formatter.isFirst(isFirstElement(c, theRow.getCells()));
			formatter.format(doc, ga, df);
		}
		formatKeyword(df.getRegion(theRow, a.getVerticalLineKeyword_1()), doc);
		formatEOL12RuleCall(df.getRegion(theRow, a.getEOLTerminalRuleCall_2()), doc);
	}

	protected void formatKeyword(ISemanticRegion iSR, IFormattableDocument doc) {
		doc.prepend(iSR, it -> it.noSpace());
		doc.append(iSR, it -> it.noSpace());
		replace(doc, iSR, " " + iSR.getText());
	}

}
