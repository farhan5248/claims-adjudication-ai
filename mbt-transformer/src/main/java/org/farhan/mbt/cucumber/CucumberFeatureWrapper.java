package org.farhan.mbt.cucumber;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.farhan.CucumberStandaloneSetup;
import org.farhan.cucumber.CucumberFactory;
import org.farhan.cucumber.Feature;
import org.farhan.mbt.core.ConvertibleObject;

import com.google.inject.Injector;

public class CucumberFeatureWrapper implements ConvertibleObject {

	private File theFile;
	private Feature theFeature;

	public CucumberFeatureWrapper(File theFile) {
		setFile(theFile);
		theFeature = CucumberFactory.eINSTANCE.createFeature();
		theFeature.setName(theFile.getName().replace(".feature", ""));
	}

	@Override
	public void setFile(File theFile) {
		this.theFile = theFile;
	}

	@Override
	public File getFile() {
		return theFile;
	}

	@Override
	public void load() {
		URI uri = URI.createFileURI(theFile.getAbsolutePath());
		CucumberStandaloneSetup.doSetup();
		Resource res = new ResourceSetImpl().getResource(uri, true);
		theFeature = (Feature) res.getContents().get(0);
		// TODO validate it using the xtext api and throw the exception if it's invalid
	}

	@Override
	public void save() {
		Injector injector = new CucumberStandaloneSetup().createInjectorAndDoEMFRegistration();
		ResourceSet rs = injector.getInstance(ResourceSet.class);
		URI uri = URI.createFileURI(theFile.getAbsolutePath());
		Resource r = rs.createResource(uri);
		r.getContents().add(theFeature);
		try {
			r.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Object get() {
		return theFeature;
	}

}
