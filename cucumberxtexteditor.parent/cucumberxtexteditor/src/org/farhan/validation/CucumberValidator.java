/*
 * generated by Xtext 2.32.0
 */
package org.farhan.validation;

import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.farhan.cucumber.CucumberPackage;
import org.farhan.cucumber.Feature;
import org.farhan.cucumber.Scenario;
import org.farhan.cucumber.Step;

/**
 * This class contains custom validation rules.
 *
 * See
 * https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class CucumberValidator extends AbstractCucumberValidator {

	public static final String INVALID_NAME = "invalidName";

	// This one is to check each step
	@Check(CheckType.FAST)
	public void checkStep(Step step) {
		if (!Character.isUpperCase(step.getName().charAt(0))) {
			warning("Step name should start with a capital", CucumberPackage.Literals.STEP__NAME, INVALID_NAME);
		}
	}

	// This one is to check each scenario
	@Check(CheckType.NORMAL)
	public void checkScenario(Scenario scenario) {
		if (!Character.isUpperCase(scenario.getName().charAt(0))) {
			warning("Scenario name should start with a capital", CucumberPackage.Literals.ABSTRACT_SCENARIO__NAME, INVALID_NAME);
		}
	}

	// This one is to run the conversion to a UML model
	@Check(CheckType.EXPENSIVE)
	public void checkFeature(Feature feature) {
		if (!Character.isUpperCase(feature.getName().charAt(0))) {
			warning("Feature name should start with a capital", CucumberPackage.Literals.FEATURE__NAME, INVALID_NAME);
		}
	}

}
