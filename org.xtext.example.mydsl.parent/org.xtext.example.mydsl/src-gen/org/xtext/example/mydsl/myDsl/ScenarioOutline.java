/**
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario Outline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ScenarioOutline#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getScenarioOutline()
 * @model
 * @generated
 */
public interface ScenarioOutline extends AbstractScenario
{
  /**
   * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Tag}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tags</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getScenarioOutline_Tags()
   * @model containment="true"
   * @generated
   */
  EList<Tag> getTags();

} // ScenarioOutline
