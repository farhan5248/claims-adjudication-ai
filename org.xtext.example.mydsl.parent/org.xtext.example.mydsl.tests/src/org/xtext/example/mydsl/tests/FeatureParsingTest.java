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
public class FeatureParsingTest extends ParsingTest {

	@Test
	public void parseFeatureWithName() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("Feature: This is a test feature\r\n");
		assertNoErrors(sb);
	}

	@Test
	public void parseFeatureWithoutName() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("Feature:\r\n");
		assertErrors(sb);
	}

	@Test
	public void parseFeatureWithoutNameEOL() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("Feature: This is a test feature");
		assertErrors(sb);
	}

	@Test
	public void parseFeatureWithTags() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("@tag1\r\n");
		sb.append("Feature: This is a test feature\r\n");
		assertNoErrors(sb);
	}

	@Test
	public void parseFeatureWithDescription() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("Feature: This is a test feature\r\n");
		sb.append("This is the description\r\n");
		sb.append("This is the second line of the description\r\n");
		assertNoErrors(sb);
	}

	@Test
	public void parseFeatureWithoutDescriptionEOL() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("Feature: This is a test feature\r\n");
		sb.append("This is the description");
		assertErrors(sb);
	}

	@Test
	public void parseFeatureWithEverything() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("@tag1 @tag2 @tag3\r\n");
		sb.append("Feature: This is a test feature\r\n");
		sb.append("This is the description\r\n");
		sb.append("This is the second line of the description\r\n");
		assertNoErrors(sb);
	}

}
