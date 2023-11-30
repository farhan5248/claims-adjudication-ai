/**
 * generated by Xtext 2.32.0
 */
package org.farhan.cucumber.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.farhan.cucumber.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CucumberFactoryImpl extends EFactoryImpl implements CucumberFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CucumberFactory init()
  {
    try
    {
      CucumberFactory theCucumberFactory = (CucumberFactory)EPackage.Registry.INSTANCE.getEFactory(CucumberPackage.eNS_URI);
      if (theCucumberFactory != null)
      {
        return theCucumberFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CucumberFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CucumberFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CucumberPackage.FEATURE: return createFeature();
      case CucumberPackage.ABSTRACT_SCENARIO: return createAbstractScenario();
      case CucumberPackage.BACKGROUND: return createBackground();
      case CucumberPackage.SCENARIO: return createScenario();
      case CucumberPackage.SCENARIO_OUTLINE: return createScenarioOutline();
      case CucumberPackage.EXAMPLES: return createExamples();
      case CucumberPackage.EXAMPLES_TABLE: return createExamplesTable();
      case CucumberPackage.STEP_TABLE: return createStepTable();
      case CucumberPackage.ROW: return createRow();
      case CucumberPackage.CELL: return createCell();
      case CucumberPackage.STEP: return createStep();
      case CucumberPackage.DOC_STRING: return createDocString();
      case CucumberPackage.GIVEN: return createGiven();
      case CucumberPackage.WHEN: return createWhen();
      case CucumberPackage.THEN: return createThen();
      case CucumberPackage.AND: return createAnd();
      case CucumberPackage.BUT: return createBut();
      case CucumberPackage.ASTERISK: return createAsterisk();
      case CucumberPackage.STATEMENT: return createStatement();
      case CucumberPackage.TAG: return createTag();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Feature createFeature()
  {
    FeatureImpl feature = new FeatureImpl();
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractScenario createAbstractScenario()
  {
    AbstractScenarioImpl abstractScenario = new AbstractScenarioImpl();
    return abstractScenario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Background createBackground()
  {
    BackgroundImpl background = new BackgroundImpl();
    return background;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Scenario createScenario()
  {
    ScenarioImpl scenario = new ScenarioImpl();
    return scenario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ScenarioOutline createScenarioOutline()
  {
    ScenarioOutlineImpl scenarioOutline = new ScenarioOutlineImpl();
    return scenarioOutline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Examples createExamples()
  {
    ExamplesImpl examples = new ExamplesImpl();
    return examples;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExamplesTable createExamplesTable()
  {
    ExamplesTableImpl examplesTable = new ExamplesTableImpl();
    return examplesTable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StepTable createStepTable()
  {
    StepTableImpl stepTable = new StepTableImpl();
    return stepTable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Row createRow()
  {
    RowImpl row = new RowImpl();
    return row;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Cell createCell()
  {
    CellImpl cell = new CellImpl();
    return cell;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Step createStep()
  {
    StepImpl step = new StepImpl();
    return step;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DocString createDocString()
  {
    DocStringImpl docString = new DocStringImpl();
    return docString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Given createGiven()
  {
    GivenImpl given = new GivenImpl();
    return given;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public When createWhen()
  {
    WhenImpl when = new WhenImpl();
    return when;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Then createThen()
  {
    ThenImpl then = new ThenImpl();
    return then;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public And createAnd()
  {
    AndImpl and = new AndImpl();
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public But createBut()
  {
    ButImpl but = new ButImpl();
    return but;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Asterisk createAsterisk()
  {
    AsteriskImpl asterisk = new AsteriskImpl();
    return asterisk;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Tag createTag()
  {
    TagImpl tag = new TagImpl();
    return tag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CucumberPackage getCucumberPackage()
  {
    return (CucumberPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CucumberPackage getPackage()
  {
    return CucumberPackage.eINSTANCE;
  }

} //CucumberFactoryImpl
