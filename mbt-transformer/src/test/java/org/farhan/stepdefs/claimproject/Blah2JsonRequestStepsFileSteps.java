package org.farhan.stepdefs.claimproject;

import org.farhan.objects.claimproject.Blah2JsonRequestStepsFile;
import org.farhan.objects.claimproject.ClaimProjectFactory;
import org.farhan.stepdefs.common.JavaSteps;

import io.cucumber.java.en.And;

public class Blah2JsonRequestStepsFileSteps extends JavaSteps {

	@And("^The claim project, src/test/java/org/farhan/stepdefs/blah2/blah2JsonRequestSteps.java file is as follows$")
	public void TheClaimProjectBlahDataTablePageStepsJavaFileIsAsFollows(String docString) {
		Blah2JsonRequestStepsFile o = (Blah2JsonRequestStepsFile) ClaimProjectFactory.get("Blah2JsonRequestStepsFile");
		o.setBaseDir("claim");
		o.setPath("src/test/java/org/farhan/stepdefs/blah2/blah2JsonRequestSteps.java");
		o.assertContents(docString);
	}
}