package org.farhan.tests.formatting;

import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.formatter.FormatterTestRequest;
import org.farhan.tests.CucumberInjectorProvider;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(CucumberInjectorProvider.class)
public class StepFormattingTest extends FormattingTest {

	private StringBuilder getExpected() {

		StringBuilder sb = new StringBuilder();
		sb.append("Feature: This is a test feature\n");
		sb.append("\n");
		sb.append("  Scenario: Submit a drug claim\n");
		sb.append("\n");
		sb.append("    Given do step one\n");
		sb.append("          | Header1 | Header2 |\n");
		sb.append("          |   data1 |   data2 |\n");
		sb.append("     When do step three\n");
		sb.append("          | Header1 | Header2 |\n");
		sb.append("          |   data1 |   data2 |\n");
		sb.append("     Then do step four\n");
		sb.append("          | Header1 | Header2 |\n");
		sb.append("          |   data1 |   data2 |\n");
		sb.append("      And do step two\n");
		sb.append("          | Header1 | Header2 |\n");
		sb.append("          |   data1 |   data2 |\n");
		sb.append("      But do step five\n");
		sb.append("          | Header1 | Header2 |\n");
		sb.append("          |   data1 |   data2 |\n");
		sb.append("        * do step six\n");
		sb.append("          | Header1 | Header2 |\n");
		sb.append("          |   data1 |   data2 |\n");
		sb.append("    Given do step one\n");
		sb.append("          \"\"\"\n");
		sb.append("          Line1\n");
		sb.append("          \"\"\"\n");
		sb.append("     When do step three\n");
		sb.append("          \"\"\"\n");
		sb.append("          Line1\n");
		sb.append("          \"\"\"\n");
		sb.append("     Then do step four\n");
		sb.append("          \"\"\"\n");
		sb.append("          Line1\n");
		sb.append("          \"\"\"\n");
		sb.append("      And do step two\n");
		sb.append("          \"\"\"\n");
		sb.append("          Line1\n");
		sb.append("          \"\"\"\n");
		sb.append("      But do step five\n");
		sb.append("          \"\"\"\n");
		sb.append("          Line1\n");
		sb.append("          \"\"\"\n");
		sb.append("        * do step six\n");
		sb.append("          \"\"\"\n");
		sb.append("          Line1\n");
		sb.append("          \"\"\"\n");
		sb.append("\n");
		assertNoErrors(sb);
		return sb;
	}

	@Test
	public void formatStepNoIssues() {

		assertFormatted((FormatterTestRequest it) -> {
			it.setToBeFormatted(getExpected().toString());
			it.setExpectation(getExpected().toString());
		});
	}

	@Test
	public void formatStepMoreSpaces() {

		assertFormatted((FormatterTestRequest it) -> {
			StringBuilder sb = new StringBuilder();
			sb.append("Feature: This is a test feature\n");
			sb.append("\n");
			sb.append("  Scenario: Submit a drug claim\n");
			sb.append("\n");
			sb.append("     Given do step one\n");
			sb.append("           |  Header1  |  Header2  | \n");
			sb.append("           |    data1  |    data2  | \n");
			sb.append("      When do step three\n");
			sb.append("           |  Header1  |  Header2  | \n");
			sb.append("           |    data1  |    data2  | \n");
			sb.append("      Then do step four\n");
			sb.append("           |  Header1  |  Header2  | \n");
			sb.append("           |    data1  |    data2  | \n");
			sb.append("       And do step two\n");
			sb.append("           |  Header1  |  Header2  | \n");
			sb.append("           |    data1  |    data2  | \n");
			sb.append("       But do step five\n");
			sb.append("           |  Header1  |  Header2  | \n");
			sb.append("           |    data1  |    data2  | \n");
			sb.append("         * do step six\n");
			sb.append("           |  Header1  |  Header2  | \n");
			sb.append("           |    data1  |    data2  | \n");
			sb.append("     Given do step one\n");
			sb.append("           \"\"\"\n");
			sb.append("          Line1\n");
			sb.append("           \"\"\"\n");
			sb.append("      When do step three\n");
			sb.append("           \"\"\"\n");
			sb.append("          Line1\n");
			sb.append("           \"\"\"\n");
			sb.append("      Then do step four\n");
			sb.append("           \"\"\"\n");
			sb.append("          Line1\n");
			sb.append("           \"\"\"\n");
			sb.append("       And do step two\n");
			sb.append("           \"\"\"\n");
			sb.append("          Line1\n");
			sb.append("           \"\"\"\n");
			sb.append("       But do step five\n");
			sb.append("           \"\"\"\n");
			sb.append("          Line1\n");
			sb.append("           \"\"\"\n");
			sb.append("         * do step six\n");
			sb.append("           \"\"\"\n");
			sb.append("          Line1\n");
			sb.append("           \"\"\"\n");
			sb.append("\n");
			assertNoErrors(sb);
			it.setToBeFormatted(sb.toString());
			it.setExpectation(getExpected().toString());
		});
	}
}
