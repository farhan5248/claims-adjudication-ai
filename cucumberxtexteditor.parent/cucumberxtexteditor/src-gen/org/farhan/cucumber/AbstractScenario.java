/**
 * generated by Xtext 2.32.0
 */
package org.farhan.cucumber;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.farhan.cucumber.AbstractScenario#getTag <em>Tag</em>}</li>
 *   <li>{@link org.farhan.cucumber.AbstractScenario#getTitle <em>Title</em>}</li>
 *   <li>{@link org.farhan.cucumber.AbstractScenario#getDescription <em>Description</em>}</li>
 *   <li>{@link org.farhan.cucumber.AbstractScenario#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @see org.farhan.cucumber.CucumberPackage#getAbstractScenario()
 * @model
 * @generated
 */
public interface AbstractScenario extends EObject
{
  /**
   * Returns the value of the '<em><b>Tag</b></em>' containment reference list.
   * The list contents are of type {@link org.farhan.cucumber.Tag}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tag</em>' containment reference list.
   * @see org.farhan.cucumber.CucumberPackage#getAbstractScenario_Tag()
   * @model containment="true"
   * @generated
   */
  EList<Tag> getTag();

  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see org.farhan.cucumber.CucumberPackage#getAbstractScenario_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link org.farhan.cucumber.AbstractScenario#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' containment reference.
   * @see #setDescription(Description)
   * @see org.farhan.cucumber.CucumberPackage#getAbstractScenario_Description()
   * @model containment="true"
   * @generated
   */
  Description getDescription();

  /**
   * Sets the value of the '{@link org.farhan.cucumber.AbstractScenario#getDescription <em>Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' containment reference.
   * @see #getDescription()
   * @generated
   */
  void setDescription(Description value);

  /**
   * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
   * The list contents are of type {@link org.farhan.cucumber.Step}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Steps</em>' containment reference list.
   * @see org.farhan.cucumber.CucumberPackage#getAbstractScenario_Steps()
   * @model containment="true"
   * @generated
   */
  EList<Step> getSteps();

} // AbstractScenario
