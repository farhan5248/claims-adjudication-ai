package org.xtext.example.mydsl.formatting2;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;

public class StepFormatter extends ListFormatter {

	public static void formatNameRuleCall(ISemanticRegion iSR, IFormattableDocument doc) {
		doc.append(iSR, it -> it.noSpace());
	}

	public static void formatEOLRuleCall(ISemanticRegion iSR, IFormattableDocument doc) {

		if (isLast) {
			replace(doc, iSR, "\r\n\r\n");
			isLast = false;
		} else {
			replace(doc, iSR, "\r\n");
		}
	}
}
