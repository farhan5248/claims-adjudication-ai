/*
 * generated by Xtext 2.32.0
 */
package org.farhan.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.farhan.cucumber.Feature

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class CucumberGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (f : resource.allContents.toIterable.filter(Feature)) {
			fsa.generateFile("temp/" + f.name + ".java", f.compile)
		}
	}

	private def compile(Feature f) '''
		package temp;
		
		public class «f.name» {
		
		}
	'''

}
