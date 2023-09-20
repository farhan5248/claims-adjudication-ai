/**
 * generated by Xtext 2.32.0
 */
package mbt.cucumber;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mbt.cucumber.Step#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link mbt.cucumber.Step#getDescription <em>Description</em>}</li>
 *   <li>{@link mbt.cucumber.Step#getTable <em>Table</em>}</li>
 *   <li>{@link mbt.cucumber.Step#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see mbt.cucumber.CucumberPackage#getStep()
 * @model
 * @generated
 */
public interface Step extends EObject
{
  /**
   * Returns the value of the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Keyword</em>' attribute.
   * @see #setKeyword(String)
   * @see mbt.cucumber.CucumberPackage#getStep_Keyword()
   * @model
   * @generated
   */
  String getKeyword();

  /**
   * Sets the value of the '{@link mbt.cucumber.Step#getKeyword <em>Keyword</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Keyword</em>' attribute.
   * @see #getKeyword()
   * @generated
   */
  void setKeyword(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see mbt.cucumber.CucumberPackage#getStep_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link mbt.cucumber.Step#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Table</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table</em>' containment reference.
   * @see #setTable(Table)
   * @see mbt.cucumber.CucumberPackage#getStep_Table()
   * @model containment="true"
   * @generated
   */
  Table getTable();

  /**
   * Sets the value of the '{@link mbt.cucumber.Step#getTable <em>Table</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table</em>' containment reference.
   * @see #getTable()
   * @generated
   */
  void setTable(Table value);

  /**
   * Returns the value of the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code</em>' containment reference.
   * @see #setCode(DocString)
   * @see mbt.cucumber.CucumberPackage#getStep_Code()
   * @model containment="true"
   * @generated
   */
  DocString getCode();

  /**
   * Sets the value of the '{@link mbt.cucumber.Step#getCode <em>Code</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code</em>' containment reference.
   * @see #getCode()
   * @generated
   */
  void setCode(DocString value);

} // Step