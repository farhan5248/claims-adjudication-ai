/**
 * generated by Xtext 2.32.0
 */
package org.farhan.generator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.farhan.cucumber.Feature;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class CucumberGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Feature> _filter = <Feature>.Featurefilter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Feature.class);
    for (final Feature f : _filter) {
      String _name = f.getName();
      String _plus = ("temp/" + _name);
      String _plus_1 = (_plus + ".java");
      fsa.generateFile(_plus_1, this.compile(f));
    }
  }

  private CharSequence compile(final Feature f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package temp;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name = f.getName();
    _builder.append(_name);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
