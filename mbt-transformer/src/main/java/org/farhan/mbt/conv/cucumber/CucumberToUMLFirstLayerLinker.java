package org.farhan.mbt.conv.cucumber;

import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.ValueSpecification;
import org.farhan.mbt.conv.core.ToUMLFirstLayerLinker;
import org.farhan.mbt.conv.core.Utilities;
import org.farhan.mbt.conv.core.Validator;
import org.farhan.mbt.conv.uml.AnnotationFactory;
import org.farhan.mbt.conv.uml.ArgumentFactory;
import org.farhan.mbt.conv.uml.ClassFactory;
import org.farhan.mbt.conv.uml.InteractionFactory;
import org.farhan.mbt.conv.uml.MessageFactory;
import org.farhan.mbt.conv.uml.ParameterFactory;
import org.farhan.mbt.conv.uml.UMLProject;
import org.farhan.mbt.graph.validation.EdgeValidator;
import org.farhan.mbt.graph.validation.VerticeValidator;

public class CucumberToUMLFirstLayerLinker extends ToUMLFirstLayerLinker {

	@Override
	protected ArrayList<String> getNextLayerInteractionNamesfromMessage(Message m) {
		String newTitle = m.getName();
		ArrayList<String> newTitles = new ArrayList<String>();
		newTitles.add(CucumberNameConverter.getMethodName(newTitle, true));
		return newTitles;
	}

	@Override
	protected void addNextLayerInteractionParameters(Interaction targetInteraction, Message m) {

		for (ValueSpecification vs : m.getArguments()) {
			LiteralString ls = (LiteralString) vs;
			ParameterFactory.getParameter(targetInteraction, ls.getName().replace(" ", ""), "", "in");
		}
	}

	@Override
	protected void createNextLayerInteractionMessagesFromVerticeMessage(Interaction targetInteraction, Message m) {

		String text = VerticeValidator.getDetails(m.getName());
		if (text.startsWith("will be") || text.startsWith("won't be")) {
			createInputOutputMessage(targetInteraction, m, "assert");
		} else if (text.startsWith("is") || text.startsWith("isn't")) {
			createInputOutputMessage(targetInteraction, m, "set");
		} else {
			// TODO throw an exception but generally the text should be valid by this point
		}
	}

	@Override
	protected void createNextLayerInteractionMessagesFromEdgeMessage(Interaction targetInteraction, Message m) {

		createInputOutputMessage(targetInteraction, m, "set");
		Class layer3Class = ClassFactory.getClass(UMLProject.theSystem,
				getNextLayerClassQualifiedName(targetInteraction));
		MessageFactory.getMessage(targetInteraction, layer3Class, "execute");
	}

	@Override
	protected Interaction addNextLayerInteraction(String methodName, Message m) {
		// TODO this should be moved to the java code generation
		String annotation = "@Given(\"^" + m.getName() + "$\")";
		return InteractionFactory.getInteraction(getNextLayerClassFromMessage(m), methodName, true, annotation);
	}

	private String getFirstArgument(Message m) {
		if (m.getArguments().size() == 0) {
			return "";
		} else {
			return m.getArguments().get(0).getName();
		}
	}

	private void createInputOutputMessage(Interaction nextLayerInteraction, Message m, String prefix) {

		Class nextLayerClass = ClassFactory.getClass(UMLProject.theSystem,
				getNextLayerClassQualifiedName(nextLayerInteraction));
		if (getFirstArgument(m).contentEquals("docString") || getFirstArgument(m).contentEquals("dataTable")) {

			String methodName = prefix + "Attributes";
			Message nextLayerMessage = MessageFactory.getMessage(nextLayerInteraction, nextLayerClass, methodName);
			if (getFirstArgument(m).contentEquals("docString")) {
				ArgumentFactory.getArgument(nextLayerMessage, "contents", "docString", true);
			} else {
				ValueSpecification vs = ArgumentFactory.getArgument(nextLayerMessage, "keyMap", "dataTable", true);
				String annotationDetailValue = m.getArguments().get(0).getEAnnotation("dataTable").getDetails()
						.getFirst().getValue();
				AnnotationFactory.getAnnotation(vs, "keyMap", "0", annotationDetailValue);

				// TODO wrap up these chunks in private methods
				String section = Validator.getSection(m.getName());
				if (section == null) {
					section = "";
				}
				ArgumentFactory.getArgument(nextLayerMessage, "section", "\"" + section + "\"", true);
			}
			if (Validator.isNegativeStep(m.getName())) {
				ArgumentFactory.getArgument(nextLayerMessage, "negativeTest", "true", true);
			}

		} else {

			String attributeName = "";
			if (VerticeValidator.isVertice(m.getName())) {
				attributeName = VerticeValidator.getDetails(m.getName());
			} else {
				attributeName = EdgeValidator.getDetails(m.getName());
			}
			String methodName = CucumberNameConverter.getMethodName(prefix + StringUtils.capitalize(attributeName),
					true);
			MessageFactory.getMessage(nextLayerInteraction, nextLayerClass, methodName);
			// ArgumentFactory.getArgument(nextLayerMessage, variableName,
			// Utilities.toLowerCamelCase(variableName), true);
		}
	}

}
