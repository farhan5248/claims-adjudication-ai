package org.farhan.stepdefs.mbtmavenplugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginAcmeToolDoItGoalStepsJavaFileSteps {

    @Given("^The src/test/java/org/farhan/stepdefs/acmeTool/AcmeToolDoItGoalSteps.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanStepdefsAcmeToolAcmeToolDoItGoalStepsJavaFileWillBeAsFollows(String docString) {
        MbtMavenPluginFactory.get("AcmeToolDoItGoalStepsJavaFile").setComponent("mbt-maven-plugin");
        MbtMavenPluginFactory.get("AcmeToolDoItGoalStepsJavaFile").setPath("src/test/java/org/farhan/stepdefs/acmeTool/AcmeToolDoItGoalSteps.java");
        MbtMavenPluginFactory.get("AcmeToolDoItGoalStepsJavaFile").assertInputOutputs("Content", docString);
    }
}
