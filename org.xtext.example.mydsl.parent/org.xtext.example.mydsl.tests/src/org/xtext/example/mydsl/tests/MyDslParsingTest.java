/*
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl.tests;

import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(MyDslInjectorProvider.class)
public class MyDslParsingTest extends ParsingTest {

	@Test
	public void parseCompleteFile() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("@tag1 @tag2 @tag3\r\n");
		sb.append("Feature: This is a test feature\r\n");
		sb.append("\r\n");
		sb.append("  This is the description\r\n");
		sb.append("  This is the second line of the description\r\n");
		sb.append("\r\n");
		sb.append("  Background: Setup a cardholder\r\n");
		sb.append("\r\n");
		sb.append("    First setup a group\r\n");
		sb.append("    Next setup the cardholder\r\n");
		sb.append("    Next setup their family\r\n");
		sb.append("\r\n");
		sb.append("    Given do step one\r\n");
		sb.append("          \"\"\"\r\n");
		sb.append("              Line1\r\n");
		sb.append("          Line2\r\n");
		sb.append("          Line3\r\n");
		sb.append("          \"\"\"\r\n");
		sb.append("      And do step two\r\n");
		sb.append("          | Header1 | Header2 |\r\n");
		sb.append("          |   data1 |   data2 |\r\n");
		sb.append("     When do step three\r\n");
		sb.append("          | Header1 | Header2 |\r\n");
		sb.append("          |   data1 |   data2 |\r\n");
		sb.append("     Then do step four\r\n");
		sb.append("          | Header1 | Header2 |\r\n");
		sb.append("          |   data1 |   data2 |\r\n");
		sb.append("      But do step five\r\n");
		sb.append("          | Header1 | Header2 |\r\n");
		sb.append("          |   data1 |   data2 |\r\n");
		sb.append("        * do step six\r\n");
		sb.append("          | Header1 | Header2 |\r\n");
		sb.append("          |   data1 |   data2 |\r\n");
		sb.append("\r\n");
		sb.append("  @tag1 @tag2 @tag3\r\n");
		sb.append("  Scenario: Submit a claim\r\n");
		sb.append("\r\n");
		sb.append("        * do step one\r\n");
		sb.append("      And do step two\r\n");
		sb.append("\r\n");
		sb.append("  @tag1 @tag2 @tag3\r\n");
		sb.append("  Scenario: Submit a drug claim\r\n");
		sb.append("\r\n");
		sb.append("        * do step one\r\n");
		sb.append("      And do step two\r\n");
		sb.append("     When do step three\r\n");
		sb.append("     Then do step four\r\n");
		sb.append("      But do step five\r\n");
		sb.append("    Given do step six\r\n");
		sb.append("          \"\"\"\r\n");
		sb.append("              Line1\r\n");
		sb.append("          Line2\r\n");
		sb.append("          Line3\r\n");
		sb.append("          \"\"\"\r\n");
		sb.append("\r\n");
		sb.append("  @tag1 @tag2 @tag3\r\n");
		sb.append("  Scenario Outline: Submit a dental claim\r\n");
		sb.append("\r\n");
		sb.append("    Given do step one\r\n");
		sb.append("      And do step two\r\n");
		sb.append("          | Header1 | Header2 |\r\n");
		sb.append("          |   data1 |   data2 |\r\n");
		sb.append("     When do step three\r\n");
		sb.append("     Then do step four\r\n");
		sb.append("      But do step five\r\n");
		sb.append("        * do step six\r\n");
		sb.append("\r\n");
		sb.append("    @tag1 @tag2 @tag3\r\n");
		sb.append("    Examples: Describe what this data is about\r\n");
		sb.append("\r\n");
		sb.append("      Put some explanation here.\r\n");
		sb.append("\r\n");
		sb.append("          | Header1 | Header2 |\r\n");
		sb.append("          |   data1 |   data2 |\r\n");
		sb.append("          |   data3 |   data4 |\r\n");
		sb.append("\r\n");
		sb.append("  @tag1 @tag2 @tag3\r\n");
		sb.append("  Scenario Outline: Submit a dental claim\r\n");
		sb.append("\r\n");
		sb.append("    Given do step one\r\n");
		sb.append("      And do step two\r\n");
		sb.append("     When do step three\r\n");
		sb.append("     Then do step four\r\n");
		sb.append("      But do step five\r\n");
		sb.append("        * do step six\r\n");
		sb.append("\r\n");
		sb.append("    @tag1 @tag2 @tag3\r\n");
		sb.append("    Examples: Describe what this data is about as well\r\n");
		sb.append("\r\n");
		sb.append("      Put some explanation here.\r\n");
		sb.append("\r\n");
		sb.append("          | Header1 | Header2 |\r\n");
		sb.append("          |   data1 |   data2 |\r\n");
		sb.append("          |   data3 |   data4 |\r\n");
		sb.append("\r\n");
		sb.append("    @tag1 @tag2 @tag3\r\n");
		sb.append("    Examples: Describe this data too\r\n");
		sb.append("\r\n");
		sb.append("          | Header1 | Header2 |\r\n");
		sb.append("          |   data1 |   data2 |\r\n");
		sb.append("\r\n");
		sb.append("");
		assertNoErrors(sb);
	}
}