package org.xtext.example.mydsl.tests;

import org.eclipse.xtext.formatting2.FormatterPreferenceKeys;
import org.eclipse.xtext.testing.formatter.FormatterTestHelper;
import org.eclipse.xtext.testing.formatter.FormatterTestRequest;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

import com.google.inject.Inject;

public class FormattingTest {
	@Inject
	protected FormatterTestHelper formatterTestHelper;

	protected void assertFormatted(Procedure1<FormatterTestRequest> init) {
		formatterTestHelper.assertFormatted(new Procedure1<FormatterTestRequest>() {
			@Override
			public void apply(FormatterTestRequest p) {
				p.preferences(m -> m.put(FormatterPreferenceKeys.lineSeparator, "\r\n"));
				init.apply(p);
			}
		});
	}
}
