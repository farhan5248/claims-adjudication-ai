package org.farhan.stepdefs.claim;

import org.farhan.common.objects.ClaimFactory;
import org.farhan.common.stepdefs.TestSteps;
import io.cucumber.java.en.Given;

public class BlahObjectPageFileSteps extends TestSteps {

	@Given("^The claim project, src/test/java/org/farhan/objects/blah/BlahObjectPage.java file will be as follows$")
	public void TheClaimProjectBlahDataTablePageStepsJavaFileWillBeAsFollows(String docString) {
		ClaimFactory.get("BlahObjectPageFile").setBaseDir("claim")
				.setPath("src/test/java/org/farhan/objects/blah/BlahObjectPage.java").assertAttributes(docString);
	}

	@Given("^The claim project, src/test/java/org/farhan/objects/blah/BlahObjectPage.java file is as follows$")
	public void TheClaimProjectBlahDataTablePageStepsJavaFileIsAsFollows(String docString) {
		ClaimFactory.get("BlahObjectPageFile").setBaseDir("claim")
				.setPath("src/test/java/org/farhan/objects/blah/BlahObjectPage.java").setAttributes(docString);
	}
}