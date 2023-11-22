/*
 * generated by Xtext 2.32.0
 */
package org.farhan.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.farhan.ide.contentassist.antlr.internal.InternalCucumberParser;
import org.farhan.services.CucumberGrammarAccess;

public class CucumberParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(CucumberGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, CucumberGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getAbstractScenarioAccess().getAlternatives(), "rule__AbstractScenario__Alternatives");
			builder.put(grammarAccess.getStepAccess().getAlternatives_0(), "rule__Step__Alternatives_0");
			builder.put(grammarAccess.getStepAccess().getAlternatives_3(), "rule__Step__Alternatives_3");
			builder.put(grammarAccess.getDocStringAccess().getAlternatives_2(), "rule__DocString__Alternatives_2");
			builder.put(grammarAccess.getFeatureAccess().getGroup(), "rule__Feature__Group__0");
			builder.put(grammarAccess.getFeatureAccess().getGroup_0(), "rule__Feature__Group_0__0");
			builder.put(grammarAccess.getBackgroundAccess().getGroup(), "rule__Background__Group__0");
			builder.put(grammarAccess.getScenarioAccess().getGroup(), "rule__Scenario__Group__0");
			builder.put(grammarAccess.getScenarioAccess().getGroup_0(), "rule__Scenario__Group_0__0");
			builder.put(grammarAccess.getScenarioOutlineAccess().getGroup(), "rule__ScenarioOutline__Group__0");
			builder.put(grammarAccess.getScenarioOutlineAccess().getGroup_0(), "rule__ScenarioOutline__Group_0__0");
			builder.put(grammarAccess.getExampleAccess().getGroup(), "rule__Example__Group__0");
			builder.put(grammarAccess.getExampleAccess().getGroup_0(), "rule__Example__Group_0__0");
			builder.put(grammarAccess.getDescriptionAccess().getGroup(), "rule__Description__Group__0");
			builder.put(grammarAccess.getStepAccess().getGroup(), "rule__Step__Group__0");
			builder.put(grammarAccess.getTableRowAccess().getGroup(), "rule__TableRow__Group__0");
			builder.put(grammarAccess.getRowCellAccess().getGroup(), "rule__RowCell__Group__0");
			builder.put(grammarAccess.getDocStringAccess().getGroup(), "rule__DocString__Group__0");
			builder.put(grammarAccess.getFeatureAccess().getTagAssignment_0_0(), "rule__Feature__TagAssignment_0_0");
			builder.put(grammarAccess.getFeatureAccess().getTitleAssignment_2(), "rule__Feature__TitleAssignment_2");
			builder.put(grammarAccess.getFeatureAccess().getDescriptionsAssignment_4(), "rule__Feature__DescriptionsAssignment_4");
			builder.put(grammarAccess.getFeatureAccess().getBackgroundAssignment_5(), "rule__Feature__BackgroundAssignment_5");
			builder.put(grammarAccess.getFeatureAccess().getScenariosAssignment_6(), "rule__Feature__ScenariosAssignment_6");
			builder.put(grammarAccess.getBackgroundAccess().getTitleAssignment_1(), "rule__Background__TitleAssignment_1");
			builder.put(grammarAccess.getBackgroundAccess().getDescriptionAssignment_3(), "rule__Background__DescriptionAssignment_3");
			builder.put(grammarAccess.getBackgroundAccess().getStepsAssignment_4(), "rule__Background__StepsAssignment_4");
			builder.put(grammarAccess.getScenarioAccess().getTagAssignment_0_0(), "rule__Scenario__TagAssignment_0_0");
			builder.put(grammarAccess.getScenarioAccess().getTitleAssignment_2(), "rule__Scenario__TitleAssignment_2");
			builder.put(grammarAccess.getScenarioAccess().getDescriptionAssignment_4(), "rule__Scenario__DescriptionAssignment_4");
			builder.put(grammarAccess.getScenarioAccess().getStepsAssignment_5(), "rule__Scenario__StepsAssignment_5");
			builder.put(grammarAccess.getScenarioOutlineAccess().getTagAssignment_0_0(), "rule__ScenarioOutline__TagAssignment_0_0");
			builder.put(grammarAccess.getScenarioOutlineAccess().getTitleAssignment_2(), "rule__ScenarioOutline__TitleAssignment_2");
			builder.put(grammarAccess.getScenarioOutlineAccess().getDescriptionAssignment_4(), "rule__ScenarioOutline__DescriptionAssignment_4");
			builder.put(grammarAccess.getScenarioOutlineAccess().getStepsAssignment_5(), "rule__ScenarioOutline__StepsAssignment_5");
			builder.put(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_6(), "rule__ScenarioOutline__ExamplesAssignment_6");
			builder.put(grammarAccess.getExampleAccess().getTagAssignment_0_0(), "rule__Example__TagAssignment_0_0");
			builder.put(grammarAccess.getExampleAccess().getTitleAssignment_2(), "rule__Example__TitleAssignment_2");
			builder.put(grammarAccess.getExampleAccess().getDescriptionAssignment_4(), "rule__Example__DescriptionAssignment_4");
			builder.put(grammarAccess.getExampleAccess().getTableAssignment_5(), "rule__Example__TableAssignment_5");
			builder.put(grammarAccess.getDescriptionAccess().getLineAssignment_0(), "rule__Description__LineAssignment_0");
			builder.put(grammarAccess.getStepAccess().getTitleAssignment_1(), "rule__Step__TitleAssignment_1");
			builder.put(grammarAccess.getStepAccess().getTableAssignment_3_0(), "rule__Step__TableAssignment_3_0");
			builder.put(grammarAccess.getStepAccess().getTextAssignment_3_1(), "rule__Step__TextAssignment_3_1");
			builder.put(grammarAccess.getTableAccess().getRowsAssignment(), "rule__Table__RowsAssignment");
			builder.put(grammarAccess.getTableRowAccess().getCellsAssignment_0(), "rule__TableRow__CellsAssignment_0");
			builder.put(grammarAccess.getRowCellAccess().getCellAssignment_0(), "rule__RowCell__CellAssignment_0");
			builder.put(grammarAccess.getTagAccess().getTagAssignment(), "rule__Tag__TagAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private CucumberGrammarAccess grammarAccess;

	@Override
	protected InternalCucumberParser createParser() {
		InternalCucumberParser result = new InternalCucumberParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_SL_COMMENT" };
	}

	public CucumberGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CucumberGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
