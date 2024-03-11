package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerGivenTheSearchApplicationHomePageIsEmptyGraphFileSteps {

    @Given("^The mbt-transformer plugin, target/Graphs/stepdefs/Given The Search application Home page is empty.graph file is as follows$")
    public void theMbtTransformerPluginTargetGraphsStepdefsGivenTheSearchApplicationHomePageIsEmptyGraphFileIsAsFollows(String docString) {
        MbtTransformerFactory.get("GivenTheSearchApplicationHomePageIsEmptyGraphFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("GivenTheSearchApplicationHomePageIsEmptyGraphFile").setPath("target/Graphs/stepdefs/Given The Search application Home page is empty.graph");
        MbtTransformerFactory.get("GivenTheSearchApplicationHomePageIsEmptyGraphFile").setInputOutputs("Content", docString);
    }
}
