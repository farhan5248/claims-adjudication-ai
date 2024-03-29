package org.farhan.common;

import java.util.Map.Entry;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.ValueSpecification;
import org.farhan.mbt.uml.UMLProject;
import org.junit.jupiter.api.Assertions;

public abstract class UMLFileObject extends FileObject {

	protected UMLProject umlProject;

	public void assertModelExists() {

		assertFileExists();
		try {
			umlProject = new UMLProject();
			umlProject.load();
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step");
		}
	}

	protected void assertClassExists(String className) {
		Class theClass = (Class) umlProject.getPackagedElement("pst" + "::" + className, null);
		Assertions.assertTrue(theClass != null, "Class " + className + " doesn't exist");

	}

	protected void assertClassCommentValue(String className, String commentBody) {
		Class theClass = (Class) umlProject.getPackagedElement("pst" + "::" + className, null);
		Comment comment = theClass.getOwnedComments().get(0);
		Assertions.assertTrue(comment != null, "Class " + className + " Comment " + commentBody + " doesn't exist");
		Assertions.assertEquals(commentBody, comment.getBody());

	}

	protected void assertClassImportedElementValue(String className, String importedElement) {
		Class theClass = (Class) umlProject.getPackagedElement("pst" + "::" + className, null);
		Class importedClass = (Class) umlProject.getPackagedElement(importedElement, null);
		ElementImport elementImport = null;
		for (ElementImport ei : theClass.getElementImports()) {
			if (ei.getImportedElement().getQualifiedName().contentEquals(importedClass.getQualifiedName())) {
				elementImport = ei;
				break;
			}
		}
		Assertions.assertTrue(elementImport != null,
				"Class " + className + " Imported Element " + importedElement + " doesn't exist");

	}

	protected void assertClassPropertyNameExists(String className, String propertyName) {
		Class theClass = (Class) umlProject.getPackagedElement("pst" + "::" + className, null);
		Property property = getProperty(theClass, propertyName);
		Assertions.assertTrue(property != null,
				"Class " + className + " Property Name " + propertyName + " doesn't exist");
	}

	protected void assertClassPropertyTypeValue(String className, String propertyName, String propertyType) {
		Class theClass = (Class) umlProject.getPackagedElement("pst" + "::" + className, null);
		Property property = getProperty(theClass, propertyName);
		Assertions.assertTrue(property != null,
				"Class " + className + " Property Name " + propertyName + " doesn't exist");
		Assertions.assertEquals(propertyType, property.getType().getQualifiedName(),
				"Class " + className + " Property Type " + propertyType + " doesn't match");
	}

	protected void assertClassAnnotationNameExists(String className, String annotationName) {
		Class theClass = (Class) umlProject.getPackagedElement("pst" + "::" + className, null);
		EAnnotation annotation = getAnnotation(theClass, annotationName);
		Assertions.assertTrue(annotation != null,
				"Class " + className + " Annotation " + annotationName + " doesn't exist");
	}

	protected void assertClassAnnotationDetailExists(String className, String annotationName, String annotationDetail) {
		Class theClass = (Class) umlProject.getPackagedElement("pst" + "::" + className, null);
		EAnnotation annotation = getAnnotation(theClass, annotationName);
		Entry<String, String> detail = getAnnotationDetail(annotation, annotationDetail);
		Assertions.assertTrue(detail != null, "Class " + className + " Annotation " + annotationName
				+ " Annotation Detail " + annotationDetail + " doesn't exist");
	}

	protected void assertInteractionNameExists(String className, String interactionName) {
		Interaction interaction = (Interaction) umlProject
				.getPackagedElement("pst" + "::" + className + "::" + interactionName, null);
		Assertions.assertTrue(interaction != null,
				"Class " + className + " Interaction " + interactionName + " doesn't exist");
	}

	protected void assertInteractionNameExists(String interactionName) {
		Interaction interaction = (Interaction) umlProject.getPackagedElement("pst" + "::" + interactionName, null);
		Assertions.assertTrue(interaction != null, "Interaction " + interactionName + " doesn't exist");

	}

	protected void assertInteractionParameterNameExists(String interactionName, String parameterName) {
		Interaction interaction = (Interaction) umlProject.getPackagedElement("pst" + "::" + interactionName, null);
		if (parameterName.contentEquals("has none")) {
			Assertions.assertTrue(interaction.getOwnedParameters().isEmpty(),
					"Interaction " + interactionName + " has parameters");
		} else {
			Parameter parameter = interaction.getOwnedParameter(parameterName, null);
			Assertions.assertTrue(parameter != null,
					"Interaction " + interactionName + " Parameter " + parameterName + " doesn't exist");
		}
	}

	protected void assertInteractionCommentValue(String interactionName, String commentBody) {
		Interaction interaction = (Interaction) umlProject.getPackagedElement("pst" + "::" + interactionName, null);
		Comment comment = interaction.getOwnedComments().get(0);
		Assertions.assertTrue(comment != null,
				"Interaction " + interactionName + " Comment " + commentBody + " doesn't exist");
		Assertions.assertEquals(commentBody, comment.getBody());

	}

	protected void assertInteractionAnnotationNameExists(String interactionName, String annotationName) {
		Interaction interaction = (Interaction) umlProject.getPackagedElement("pst" + "::" + interactionName, null);
		EAnnotation annotation = getAnnotation(interaction, annotationName);
		Assertions.assertTrue(annotation != null,
				"Interaction " + interactionName + " Annotation " + annotationName + " doesn't exist");
	}

	protected void assertInteractionAnnotationDetailExists(String interactionName, String annotationName,
			String annotationDetail) {
		Interaction interaction = (Interaction) umlProject.getPackagedElement("pst" + "::" + interactionName, null);
		EAnnotation annotation = getAnnotation(interaction, annotationName);
		Entry<String, String> detail = getAnnotationDetail(annotation, annotationDetail);
		Assertions.assertTrue(detail != null, "Interaction " + interactionName + " Annotation " + annotationName
				+ " Annotation Detail " + annotationDetail + " doesn't exist");
	}

	protected void assertInteractionLifelineExists(String interactionName, String lifelineName) {
		Interaction interaction = (Interaction) umlProject.getPackagedElement("pst" + "::" + interactionName, null);
		Lifeline lifeline = interaction.getLifeline(lifelineName);
		Assertions.assertTrue(lifeline != null,
				"Interaction " + interactionName + " Lifeline " + lifelineName + " doesn't exist");
	}

	protected void assertInteractionLifelineRepresentsValue(String interactionName, String lifelineName,
			String lifelineRepresents) {
		Interaction interaction = (Interaction) umlProject.getPackagedElement("pst" + "::" + interactionName, null);
		Lifeline lifeline = interaction.getLifeline(lifelineName);
		ConnectableElement represents = lifeline.getRepresents();
		Assertions.assertTrue(represents != null, "Interaction " + interactionName + " Lifeline " + lifelineName
				+ " Lifeline Represents " + lifelineName + " doesn't exist");
		Assertions.assertEquals(lifelineRepresents, represents.getQualifiedName());

	}

	protected void assertInteractionLifelineCoveredValue(String interactionName, String messageOccurenceName,
			String lifelineCovered) {
		Interaction interaction = (Interaction) umlProject.getPackagedElement("pst" + "::" + interactionName, null);
		MessageOccurrenceSpecification messageOccurence = getMessageOccurence(interaction, messageOccurenceName);
		Lifeline covered = messageOccurence.getCovered(lifelineCovered);
		Assertions.assertTrue(covered != null, "Interaction " + interactionName + " Message Occurence "
				+ messageOccurenceName + " Lifeline Covered " + lifelineCovered + " doesn't exist");
		Assertions.assertEquals(lifelineCovered, covered.getName());

	}

	protected void assertInteractionMessageValue(String interactionName, String messageName) {
		Interaction interaction = (Interaction) umlProject.getPackagedElement("pst" + "::" + interactionName, null);
		Message message = getMessage(interaction, messageName);
		Assertions.assertTrue(message != null,
				"Interaction " + interactionName + " Message " + messageName + " doesn't exist");

	}

	protected void assertInteractionMessageArgumentNameExists(String interactionName, String messageName,
			String argumentName) {
		Interaction interaction = (Interaction) umlProject.getPackagedElement("pst" + "::" + interactionName, null);
		Message message = getMessage(interaction, messageName);
		ValueSpecification vs = (LiteralString) message.getArgument(argumentName, null);
		Assertions.assertTrue(vs != null, "Interaction " + interactionName + " Message " + messageName
				+ " Argument Name " + argumentName + " doesn't exist");

	}

	protected void assertInteractionMessageAnnotationNameExists(String interactionName, String messageName,
			String annotationName) {
		Interaction interaction = (Interaction) umlProject.getPackagedElement("pst" + "::" + interactionName, null);
		Message message = getMessage(interaction, messageName);
		EAnnotation annotation = null;
		for (EAnnotation e : message.getEAnnotations()) {
			if (e.getSource().contentEquals(annotationName)) {
				annotation = e;
				break;
			}
		}
		Assertions.assertTrue(annotation != null, "Interaction " + interactionName + " Message " + messageName
				+ " Annotation " + annotationName + " doesn't exist");

	}

	protected void assertInteractionMessageAnnotationDetailExists(String interactionName, String messageName,
			String argumentName, String annotationDetail) {
		Interaction interaction = (Interaction) umlProject.getPackagedElement("pst" + "::" + interactionName, null);
		Message message = getMessage(interaction, messageName);
		ValueSpecification vs = (LiteralString) message.getArgument(argumentName, null);

		EAnnotation annotation = null;
		for (EAnnotation e : vs.getEAnnotations()) {
			if (e.getSource().contentEquals(argumentName)) {
				annotation = e;
				break;
			}
		}
		Entry<String, String> detail = null;
		for (Entry<String, String> d : annotation.getDetails()) {
			String e = d.getKey() + " -> " + d.getValue();
			if (e.contentEquals(annotationDetail)) {
				detail = d;
				break;
			}
		}
		Assertions.assertTrue(detail != null, "Interaction " + interactionName + " Message " + messageName
				+ " Argument Name " + argumentName + " Annotation Detail " + annotationDetail + " doesn't exist");

	}

	protected void assertInteractionMessageOccurenceExists(String interactionName, String messageOccurenceName) {
		Interaction interaction = (Interaction) umlProject.getPackagedElement("pst" + "::" + interactionName, null);
		MessageOccurrenceSpecification messageOccurence = getMessageOccurence(interaction, messageOccurenceName);
		Assertions.assertTrue(messageOccurence != null,
				"Interaction " + interactionName + " Message Occurence " + messageOccurenceName + " doesn't exist");

	}

	private Entry<String, String> getAnnotationDetail(EAnnotation annotation, String annotationDetail) {
		for (Entry<String, String> d : annotation.getDetails()) {
			if (annotationDetail.contains(" -> ")) {
				if (annotationDetail.contentEquals(d.getKey() + " -> " + d.getValue())) {
					return d;
				}
			} else {
				if (annotationDetail.contentEquals(d.getKey())) {
					return d;
				}
			}
		}
		return null;
	}

	private EAnnotation getAnnotation(Class theClass, String annotationName) {
		for (EAnnotation e : theClass.getEAnnotations()) {
			if (e.getSource().contentEquals(annotationName)) {
				return e;
			}
		}
		return null;
	}

	private EAnnotation getAnnotation(Interaction interaction, String annotationName) {
		for (EAnnotation e : interaction.getEAnnotations()) {
			if (e.getSource().contentEquals(annotationName)) {
				return e;
			}
		}
		return null;
	}

	private Property getProperty(Class theClass, String name) {
		for (Property p : theClass.getOwnedAttributes()) {
			if (p.getName().contentEquals(name)) {
				return p;
			}
		}
		return null;
	}

	private Message getMessage(Interaction interaction, String name) {
		for (NamedElement ne : interaction.getOwnedMembers()) {
			if (ne.getName().contentEquals(name)) {
				return (Message) ne;
			}
		}
		return null;
	}

	private MessageOccurrenceSpecification getMessageOccurence(Interaction interaction, String name) {
		for (NamedElement ne : interaction.getOwnedMembers()) {
			if (ne.getName().contentEquals(name)) {
				return (MessageOccurrenceSpecification) ne;
			}
		}
		return null;
	}

}
