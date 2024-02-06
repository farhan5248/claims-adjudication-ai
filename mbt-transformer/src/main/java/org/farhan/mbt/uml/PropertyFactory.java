package org.farhan.mbt.uml;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Property;

public class PropertyFactory {
	public static Property getProperty(Class propertyOwner, String propertyName, Class propertyType) {
		if (propertyType != null && propertyType != propertyOwner) {
			ElementImport propertyTypeImport = ElementImportFactory.getElementImportByAlias(propertyOwner,
					propertyType.getName());
			if (propertyTypeImport == null) {
				propertyTypeImport = ElementImportFactory.getOrAddElementImport(propertyOwner, propertyType);
			}
		}
		Property theProperty = propertyOwner.getOwnedAttribute(propertyName, propertyType);
		if (theProperty == null) {
			theProperty = propertyOwner.createOwnedAttribute(propertyName, propertyType);
		}
		return theProperty;
	}

	public static Property getProperty(Class theClass, String name) {
		for (Property p : theClass.getOwnedAttributes()) {
			if (p.getName().contentEquals(name)) {
				return p;
			}
		}
		return null;
	}
}
