/*
 * generated by Xtext 2.32.0
 */
package org.farhan.formatting2;

import org.eclipse.xtext.formatting2.AbstractJavaFormatter;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegionsFinder;
import org.farhan.cucumber.AbstractScenario;
import org.farhan.cucumber.Background;
import org.farhan.cucumber.CucumberPackage;
import org.farhan.cucumber.Feature;
import org.farhan.cucumber.Step;
import org.farhan.services.CucumberGrammarAccess;

import com.google.inject.Inject;

public class CucumberFormatter extends AbstractJavaFormatter {

	@Inject
	CucumberGrammarAccess grammarAccess;

	protected void format(Feature feature, IFormattableDocument doc) {
		// TODO: format HiddenRegions around keywords, attributes, cross references,
		// etc.
		System.out.println("Formatting the feature file");

		ISemanticRegion featureRegion = regionFor(feature)
				.keyword(grammarAccess.getFeatureAccess().getFeatureKeyword_1());
		// TODO add new lines to the region as a whole? Do this after formatting description
		ISemanticRegion titleRegion = regionFor(feature).feature(CucumberPackage.Literals.FEATURE__TITLE);

		doc.prepend(titleRegion, it -> {
			it.oneSpace();
			//it.noSpace();
			//it.setSpace(" ");
		});
		doc.append(titleRegion, it -> {
			it.noSpace();
		});

		// doc.interior(begin, end, it -> { it.setNewLines(2); });

		// TODO indent this and leave two new lines after it
		doc.format(feature.getDescription());
		// TODO indent this and leave two new lines after it
		doc.format(feature.getBackground());
		for (AbstractScenario abstractScenario : feature.getScenarios()) {
			// TODO indent this and leave two new lines after it
			doc.format(abstractScenario);
		}
	}

	protected void format(Background background, IFormattableDocument doc) {
		// TODO: format HiddenRegions around keywords, attributes, cross references,
		// etc.
		doc.format(background.getDescription());
		for (Step step : background.getSteps()) {
			doc.format(step);
		}
	}

	// TODO: implement for Scenario, ScenarioOutline, Example, Step, Table, TableRow
}
