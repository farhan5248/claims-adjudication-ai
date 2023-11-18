/**
 * generated by Xtext 2.32.0
 */
package org.farhan.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.testing.CompilationTestHelper;
import org.farhan.cucumber.CucumberPackage;
import org.farhan.cucumber.Feature;
import org.farhan.validation.CucumberValidator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(CucumberInjectorProvider.class)
@SuppressWarnings("all")
public class CucumberParsingTest {
  @Inject
  @Extension
  private ParseHelper<Feature> _parseHelper;

  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;

  @Inject
  @Extension
  private CompilationTestHelper _compilationTestHelper;

  @Test
  public void testParser() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Feature: Basic scenario Test");
      _builder.newLine();
      _builder.append("This tests basic feature file grammar");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Scenario: Demo of all keywords");
      _builder.newLine();
      _builder.append("Given The current state");
      _builder.newLine();
      _builder.append("When The input is sen");
      _builder.newLine();
      _builder.append("Then The state changes");
      _builder.newLine();
      _builder.append("And The output is blah");
      _builder.newLine();
      _builder.append("But This means nothing");
      _builder.newLine();
      this._validationTestHelper.assertNoIssues(this._parseHelper.parse(_builder));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void testValidator() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Feature: basic scenario Test");
      _builder.newLine();
      this._validationTestHelper.assertWarning(this._parseHelper.parse(_builder), 
        CucumberPackage.Literals.FEATURE, 
        CucumberValidator.INVALID_NAME, 
        "Name should start with a capital");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void testCompiler() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Feature: basic scenario Test");
      _builder.newLine();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package temp;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("public class basic scenario Test {");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      this._compilationTestHelper.assertCompilesTo(_builder, _builder_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
