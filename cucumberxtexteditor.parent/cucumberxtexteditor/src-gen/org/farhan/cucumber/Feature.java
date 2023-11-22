/**
 * generated by Xtext 2.32.0
 */
package org.farhan.cucumber;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.farhan.cucumber.Feature#getTag <em>Tag</em>}</li>
 *   <li>{@link org.farhan.cucumber.Feature#getTitle <em>Title</em>}</li>
 *   <li>{@link org.farhan.cucumber.Feature#getDescriptions <em>Descriptions</em>}</li>
 *   <li>{@link org.farhan.cucumber.Feature#getBackground <em>Background</em>}</li>
 *   <li>{@link org.farhan.cucumber.Feature#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 *
 * @see org.farhan.cucumber.CucumberPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends EObject
{
  /**
   * Returns the value of the '<em><b>Tag</b></em>' containment reference list.
   * The list contents are of type {@link org.farhan.cucumber.Tag}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tag</em>' containment reference list.
   * @see org.farhan.cucumber.CucumberPackage#getFeature_Tag()
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
   * @see org.farhan.cucumber.CucumberPackage#getFeature_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link org.farhan.cucumber.Feature#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Descriptions</b></em>' containment reference list.
   * The list contents are of type {@link org.farhan.cucumber.Description}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Descriptions</em>' containment reference list.
   * @see org.farhan.cucumber.CucumberPackage#getFeature_Descriptions()
   * @model containment="true"
   * @generated
   */
  EList<Description> getDescriptions();

  /**
   * Returns the value of the '<em><b>Background</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Background</em>' containment reference.
   * @see #setBackground(Background)
   * @see org.farhan.cucumber.CucumberPackage#getFeature_Background()
   * @model containment="true"
   * @generated
   */
  Background getBackground();

  /**
   * Sets the value of the '{@link org.farhan.cucumber.Feature#getBackground <em>Background</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Background</em>' containment reference.
   * @see #getBackground()
   * @generated
   */
  void setBackground(Background value);

  /**
   * Returns the value of the '<em><b>Scenarios</b></em>' containment reference list.
   * The list contents are of type {@link org.farhan.cucumber.AbstractScenario}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scenarios</em>' containment reference list.
   * @see org.farhan.cucumber.CucumberPackage#getFeature_Scenarios()
   * @model containment="true"
   * @generated
   */
  EList<AbstractScenario> getScenarios();

} // Feature
