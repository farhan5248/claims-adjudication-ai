package org.farhan.objects.mbttransformer;

import java.util.HashMap;

import org.farhan.common.objects.MbtTransformer;
import org.farhan.mbt.conv.core.Project;
import org.farhan.mbt.conv.core.Utilities;
import org.farhan.mbt.conv.cucumber.ConvertCucumberToUMLPSTMojo;
import org.junit.jupiter.api.Assertions;

public class MbtTransformerCucumberToUmlGoal extends MbtTransformer {

	public void setTags(HashMap<String, String> keyMap) {
		// TODO I should probably pass the tags to the mojoGoal to keep it simple? It an
		// then set it at the project level or whatever
		Project.tags = keyMap.get("Tags");
	}

	@Override
	public void transition() {
		// TODO make this runGoal("ConvertCucumberToUMLPSTMojo");
		try {
			ConvertCucumberToUMLPSTMojo mojo = new ConvertCucumberToUMLPSTMojo();
			mojo.mojoGoal();
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step\n" + Utilities.getStackTraceAsString(e));
		}
	}

}
