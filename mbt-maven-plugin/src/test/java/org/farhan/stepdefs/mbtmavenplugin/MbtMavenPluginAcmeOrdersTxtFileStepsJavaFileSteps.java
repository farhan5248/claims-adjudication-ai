package org.farhan.stepdefs.mbtmavenplugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginAcmeOrdersTxtFileStepsJavaFileSteps {

    @Given("^The src/test/java/org/farhan/stepdefs/acme/AcmeOrdersTxtFileSteps.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanStepdefsAcmeAcmeOrdersTxtFileStepsJavaFileWillBeAsFollows(String docString) {
        MbtMavenPluginFactory.get("AcmeOrdersTxtFileStepsJavaFile").setComponent("mbt-maven-plugin");
        MbtMavenPluginFactory.get("AcmeOrdersTxtFileStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/acme/AcmeOrdersTxtFileSteps.java");
        MbtMavenPluginFactory.get("AcmeOrdersTxtFileStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
