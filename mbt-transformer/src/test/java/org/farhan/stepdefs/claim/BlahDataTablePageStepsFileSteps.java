package org.farhan.stepdefs.claim;

import org.farhan.common.objects.ClaimFactory;
import org.farhan.common.stepdefs.TestSteps;
import io.cucumber.java.en.Given;

public class BlahDataTablePageStepsFileSteps extends TestSteps {

	@Given("^The claim project, src/test/java/org/farhan/stepdefs/blah/BlahDataTablePageSteps.java file will be as follows$")
	public void TheClaimProjectBlahDataTablePageStepsJavaFileIsAsFollows(String docString) {
		ClaimFactory.get("BlahDataTablePageStepsFile").setBaseDir("claim")
				.setPath("src/test/java/org/farhan/stepdefs/blah/BlahDataTablePageSteps.java")
				.assertAttributes(docString);
	}
}