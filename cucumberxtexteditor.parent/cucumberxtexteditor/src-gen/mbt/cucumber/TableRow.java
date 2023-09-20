/**
 * generated by Xtext 2.32.0
 */
package mbt.cucumber;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mbt.cucumber.TableRow#getCols <em>Cols</em>}</li>
 * </ul>
 *
 * @see mbt.cucumber.CucumberPackage#getTableRow()
 * @model
 * @generated
 */
public interface TableRow extends EObject
{
  /**
   * Returns the value of the '<em><b>Cols</b></em>' containment reference list.
   * The list contents are of type {@link mbt.cucumber.TableCol}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cols</em>' containment reference list.
   * @see mbt.cucumber.CucumberPackage#getTableRow_Cols()
   * @model containment="true"
   * @generated
   */
  EList<TableCol> getCols();

} // TableRow