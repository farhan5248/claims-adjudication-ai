package org.farhan.stepdefs.mbtmavenplugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginAcmeHomePageStepsJavaFileSteps {

    @Given("^The src/test/java/org/farhan/stepdefs/acme/AcmeHomePageSteps.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanStepdefsAcmeAcmeHomePageStepsJavaFileWillBeAsFollows(String docString) {
        MbtMavenPluginFactory.get("AcmeHomePageStepsJavaFile").setComponent("mbt-maven-plugin");
        MbtMavenPluginFactory.get("AcmeHomePageStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/acme/AcmeHomePageSteps.java");
        MbtMavenPluginFactory.get("AcmeHomePageStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
