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
      case CucumberPackage.BACKGROUND: return createBackground();
      case CucumberPackage.ABSTRACT_SCENARIO: return createAbstractScenario();
      case CucumberPackage.SCENARIO: return createScenario();
      case CucumberPackage.SCENARIO_OUTLINE: return createScenarioOutline();
      case CucumberPackage.EXAMPLE: return createExample();
      case CucumberPackage.DESCRIPTION: return createDescription();
      case CucumberPackage.STEP: return createStep();
      case CucumberPackage.TABLE: return createTable();
      case CucumberPackage.TABLE_ROW: return createTableRow();
      case CucumberPackage.ROW_CELL: return createRowCell();
      case CucumberPackage.DOC_STRING: return createDocString();
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
  public Example createExample()
  {
    ExampleImpl example = new ExampleImpl();
    return example;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Description createDescription()
  {
    DescriptionImpl description = new DescriptionImpl();
    return description;
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
  public Table createTable()
  {
    TableImpl table = new TableImpl();
    return table;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TableRow createTableRow()
  {
    TableRowImpl tableRow = new TableRowImpl();
    return tableRow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RowCell createRowCell()
  {
    RowCellImpl rowCell = new RowCellImpl();
    return rowCell;
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
