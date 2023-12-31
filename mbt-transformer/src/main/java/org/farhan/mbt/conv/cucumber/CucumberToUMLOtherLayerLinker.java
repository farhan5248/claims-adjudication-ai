package org.farhan.mbt.conv.cucumber;

import java.util.ArrayList;

import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.ValueSpecification;
import org.farhan.mbt.conv.core.ToUMLOtherLayerLinker;
import org.farhan.mbt.conv.uml.ArgumentFactory;
import org.farhan.mbt.conv.uml.InteractionFactory;
import org.farhan.mbt.conv.uml.ParameterFactory;

public class CucumberToUMLOtherLayerLinker extends ToUMLOtherLayerLinker {

	@Override
	protected ArrayList<String> getNextLayerInteractionNamesfromMessage(Message m) {
		ArrayList<String> newTitles = new ArrayList<String>();
		if (m.getName().startsWith("set") || m.getName().startsWith("assert")) {

			if (m.getName().endsWith("Attributes")) {
				String prefix = m.getName().replace("Attributes", "");

				ValueSpecification vs;
				vs = ArgumentFactory.getArgument(m, "section", "", false);
				String sectionName = "";
				if (vs != null) {
					sectionName = ((LiteralString) vs).getValue();
				}

				vs = ArgumentFactory.getArgument(m, "keyMap", "", false);
				if (vs != null) {
					// it's a data table
					String[] attributes = vs.getEAnnotation("keyMap").getDetails().getFirst().getValue().split("\\|");

					for (String a : attributes) {
						// TODO validate data table headers to always start with a capital letter
						newTitles.add(CucumberNameConverter.getMethodName(prefix + sectionName + a, true));
					}
				} else {
					// it's a doc string
					newTitles.add(CucumberNameConverter.getMethodName(prefix + sectionName + "Content", true));
				}
			} else {
				// TODO sections can be specified for setIsEmpty etc
				// could be setIsEmpty or setIsInvalid
				newTitles.add(m.getName());
			}
		} else {
			// could be a send for a transition/edge
			newTitles.add(m.getName());
		}
		return newTitles;
	}

	@Override
	protected void addNextLayerInteractionParameters(Interaction targetInteraction, Message m) {

		ValueSpecification vs;

		vs = ArgumentFactory.getArgument(m, "keyMap", "", false);
		if (vs != null) {
			ParameterFactory.getParameter(targetInteraction, "keyMap", "", "in");
		}

		vs = ArgumentFactory.getArgument(m, "contents", "", false);
		if (vs != null) {
			ParameterFactory.getParameter(targetInteraction, "contents", "", "in");
		}
	}

	@Override
	protected Interaction addNextLayerInteraction(String methodName, Message m) {
		return InteractionFactory.getInteraction(getNextLayerClassFromMessage(m), methodName, true);
	}

}
