package org.farhan.mbt.graph.validation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VerticeValidatorTest {

	@Test
	public void testIsVertice() {
		Assertions.assertTrue(
				VerticeValidator.isVertice("The something1 application, something2 file, something3 section is empty"));
	}

	@Test
	public void testIsContainer() {
		Assertions.assertTrue(VerticeValidator
				.isContainerStep("The something1 application, something2 file, something3 section is empty"));
	}

	@Test
	public void testGetAppName() {
		Assertions.assertTrue(VerticeValidator
				.getContainerName("The something1 application, something2 file, something3 section is empty")
				.contentEquals("something1"));
	}

	@Test
	public void testGetAppType() {
		Assertions.assertTrue(VerticeValidator
				.getContainerType("The something1 application, something2 file, something3 section is empty")
				.contentEquals("application"));
	}

	@Test
	public void testGetObjName() {
		Assertions.assertTrue(VerticeValidator
				.getObjectName("The something1 application, something2 file, something3 section is empty")
				.contentEquals("something2"));
	}

	@Test
	public void testGetObjType() {
		Assertions.assertTrue(VerticeValidator
				.getObjectType("The something1 application, something2 file, something3 section is empty")
				.contentEquals("file"));
	}

	@Test
	public void testGetSection() {
		Assertions.assertTrue(
				VerticeValidator.getSection("The something1 application, something2 file, something3 section is empty")
						.contentEquals("something3"));
	}

	@Test
	public void testGetDetails() {
		Assertions.assertTrue(
				VerticeValidator.getDetails("The something1 application, something2 file, something3 section is empty")
						.contentEquals("is empty"));
	}

	@Test
	public void testDetailsRegexIsEmpty() {
		Assertions.assertTrue(VerticeValidator.isValid("The something1 application, something2 file is empty"));
	}

	@Test
	public void testDetailsRegexIsPresent() {
		Assertions.assertTrue(VerticeValidator.isValid("The something1 application, something2 file is present"));
	}

	@Test
	public void testDetailsRegexAsFollows() {
		Assertions.assertTrue(VerticeValidator.isValid("The something1 application, something2 file is as follows"));
	}

	@Test
	public void testIsNegativeStep() {
		Assertions.assertTrue(VerticeValidator.isValid("The something1 application, something2 file isn't empty"));
	}

	@Test
	public void testDetailsRegexIsnt() {
		Assertions.assertTrue(VerticeValidator.isValid("The something1 application, something2 file isn't empty"));
	}

	@Test
	public void testDetailsRegexWill() {
		Assertions.assertTrue(VerticeValidator.isValid("The something1 application, something2 file will be empty"));
	}

	@Test
	public void testDetailsRegexWont() {
		Assertions.assertTrue(VerticeValidator.isValid("The something1 application, something2 file won't be empty"));
	}

	@Test
	public void testSectionRegex() {
		Assertions.assertTrue(
				VerticeValidator.isValid("The something1 application, something2 file, something3 section is empty"));
	}

	@Test
	public void testObjectRegexPage() {
		Assertions.assertTrue(VerticeValidator.isValid("The something1 application, something2 page is empty"));
	}

	@Test
	public void testObjectRegexConfig() {
		Assertions.assertTrue(VerticeValidator.isValid("The something1 application, something2 config is empty"));
	}

	@Test
	public void testAppRegexService() {
		Assertions.assertTrue(VerticeValidator.isValid("The something1 service, something2 file is empty"));
	}

	@Test
	public void testAppRegexProject() {
		Assertions.assertTrue(VerticeValidator.isValid("The something1 project, something2 file is empty"));
	}

	@Test
	public void testAppRegexPlugin() {
		Assertions.assertTrue(VerticeValidator.isValid("The something1 plugin, something2 file is empty"));
	}

	@Test
	public void testAppRegexBatchjob() {
		Assertions.assertTrue(VerticeValidator.isValid("The something1 batchjob, something2 file is empty"));
	}
}
