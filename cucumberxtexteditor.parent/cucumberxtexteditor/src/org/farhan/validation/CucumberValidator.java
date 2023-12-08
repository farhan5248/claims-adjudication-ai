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
import org.farhan.validation.uml.UMLStuffDoer;

public class CucumberValidator extends AbstractCucumberValidator {

	// Given an input/transition or response/state then response/state
	private static final String OBJ_REGEX = "( .*)";
	private static final String APP_REGEX = "( .*( application| service),)?";
	private static final String STATE_NAME_REGEX = "The" + APP_REGEX + "(" + OBJ_REGEX;
	private static final String STATE_DETAILS_REGEX = " is (empty|present|as follows))";
	private static final String STATE_REGEX = STATE_NAME_REGEX + STATE_DETAILS_REGEX;
	public static final String INVALID_STATE = "invalidState";

	// When request for next response/state
	// TODO The (.*) is requested( for ( record| section))?
	private static final String TRANSITION_NAME_REGEX = "(The (.*) request)";
	private static final String TRANSITION_DETAILS_REGEX = "( is( sent| triggered| bad| good)( with| as follows)?)";
	private static final String TRANSITION_REGEX = TRANSITION_NAME_REGEX + TRANSITION_DETAILS_REGEX;
	public static final String INVALID_TRANSITION = "invalidTransition";

	public static final String INVALID_NAME = "invalidName";

	// This one is to check each step, FAST is when the file is modified
	@Check(CheckType.FAST)
	public void checkStepName(Step step) {

		// TODO the quickfix here is to identify which regex is broken and put an
		// example in place

		// this applies to Given and Then
		String stateEgs = "The blah application, something/something/something/Object is empty\r\n"
				+ "The blah service, something/something/something/Object is empty\r\n"
				+ "The something/something/something/Object is empty\r\n" + "\r\n"
				+ "The blah application, something/something/something/Object is present\r\n"
				+ "The blah service, something/something/something/Object is present\r\n"
				+ "The something/something/something/Object is present\r\n" + "\r\n"
				+ "The blah application, something/something/something/Object is as follows\r\n"
				+ "The blah service, something/something/something/Object is as follows\r\n"
				+ "The something/something/something/Object is as follows";

		// this applies to When
		String transitionEgs = "The blah request is good\r\n" + "The blah request is bad\r\n"
				+ "The blah request is sent with\r\n" + "The blah request is triggered with\r\n"
				+ "The blah request is sent as follows\r\n" + "The blah request is triggered as follows";

		String msg = "The state name and details are invalid. Examples:\n" + stateEgs
				+ "The state name and details are invalid. Examples:\n" + transitionEgs;

		if (step.getTheStepTable() != null) {
			// TODO Add table column row validation, each row should have the max number of
			// columns
		}

		if (!step.getName().matches(STATE_REGEX) && !step.getName().matches(TRANSITION_REGEX)) {
			error(msg, CucumberPackage.Literals.STEP__NAME, INVALID_NAME);
		}
	}

	// This one is to check each scenario, NORMAL is when the file is saved
	@Check(CheckType.NORMAL)
	public void checkScenario(Scenario scenario) {

		// TODO validate that state and transition validation are applied to Given/Then
		// and When respectively
		// For And, But and *, the last GWT should apply. The quickfix here is to change
		// the keyword
		// TODO also check that there's a sequence of GWT or G(G|A|B)*W(W|A|B)*T(T|A|B)*
		// and not (G|W|T|A|B)*

		if (!Character.isUpperCase(scenario.getName().charAt(0))) {
			warning("Scenario name should start with a capital", CucumberPackage.Literals.ABSTRACT_SCENARIO__NAME,
					INVALID_NAME);
		}
	}

	// This one is to run the conversion to a UML model, EXPENSIVE is when the
	// validation menu item is selected
	@Check(CheckType.EXPENSIVE)
	public void checkFeature(Feature feature) {
		// TODO validate that feature file name and feature name are the same.

		if (!Character.isUpperCase(feature.getName().charAt(0))) {
			warning("Feature name should start with a capital", CucumberPackage.Literals.FEATURE__NAME, INVALID_NAME);
		}

		// Make model
		UMLStuffDoer usd = new UMLStuffDoer(feature);
		try {
			//usd.makeUMLModel();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Make java code
		
	}

}
