package org.farhan.runners.umltocode;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

import org.farhan.common.GraphTestObjectFactory;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import io.cucumber.java.Before;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("cucumber/UMLToCode/UMLDocStringToCode.feature")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "org.farhan")
@IncludeTags("debug")
public class UMLDocStringToCodeTest {

	@Before
	public static void before() {
		GraphTestObjectFactory.reset();
	}
}