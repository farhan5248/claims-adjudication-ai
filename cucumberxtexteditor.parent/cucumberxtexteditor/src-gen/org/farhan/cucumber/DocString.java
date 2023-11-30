/**
 * generated by Xtext 2.32.0
 */
package org.farhan.cucumber;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doc String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.farhan.cucumber.DocString#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see org.farhan.cucumber.CucumberPackage#getDocString()
 * @model
 * @generated
 */
public interface DocString extends EObject
{
  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.farhan.cucumber.Statement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see org.farhan.cucumber.CucumberPackage#getDocString_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // DocString
