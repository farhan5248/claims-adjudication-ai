/**
 * generated by Xtext 2.32.0
 */
package mbt.cucumber.impl;

import java.util.Collection;

import mbt.cucumber.AbstractScenario;
import mbt.cucumber.Background;
import mbt.cucumber.CucumberPackage;
import mbt.cucumber.Feature;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mbt.cucumber.impl.FeatureImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link mbt.cucumber.impl.FeatureImpl#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureImpl extends SectionImpl implements Feature
{
  /**
   * The cached value of the '{@link #getBackground() <em>Background</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBackground()
   * @generated
   * @ordered
   */
  protected Background background;

  /**
   * The cached value of the '{@link #getScenarios() <em>Scenarios</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScenarios()
   * @generated
   * @ordered
   */
  protected EList<AbstractScenario> scenarios;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeatureImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CucumberPackage.Literals.FEATURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Background getBackground()
  {
    return background;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBackground(Background newBackground, NotificationChain msgs)
  {
    Background oldBackground = background;
    background = newBackground;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CucumberPackage.FEATURE__BACKGROUND, oldBackground, newBackground);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBackground(Background newBackground)
  {
    if (newBackground != background)
    {
      NotificationChain msgs = null;
      if (background != null)
        msgs = ((InternalEObject)background).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CucumberPackage.FEATURE__BACKGROUND, null, msgs);
      if (newBackground != null)
        msgs = ((InternalEObject)newBackground).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CucumberPackage.FEATURE__BACKGROUND, null, msgs);
      msgs = basicSetBackground(newBackground, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CucumberPackage.FEATURE__BACKGROUND, newBackground, newBackground));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<AbstractScenario> getScenarios()
  {
    if (scenarios == null)
    {
      scenarios = new EObjectContainmentEList<AbstractScenario>(AbstractScenario.class, this, CucumberPackage.FEATURE__SCENARIOS);
    }
    return scenarios;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CucumberPackage.FEATURE__BACKGROUND:
        return basicSetBackground(null, msgs);
      case CucumberPackage.FEATURE__SCENARIOS:
        return ((InternalEList<?>)getScenarios()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CucumberPackage.FEATURE__BACKGROUND:
        return getBackground();
      case CucumberPackage.FEATURE__SCENARIOS:
        return getScenarios();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CucumberPackage.FEATURE__BACKGROUND:
        setBackground((Background)newValue);
        return;
      case CucumberPackage.FEATURE__SCENARIOS:
        getScenarios().clear();
        getScenarios().addAll((Collection<? extends AbstractScenario>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CucumberPackage.FEATURE__BACKGROUND:
        setBackground((Background)null);
        return;
      case CucumberPackage.FEATURE__SCENARIOS:
        getScenarios().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CucumberPackage.FEATURE__BACKGROUND:
        return background != null;
      case CucumberPackage.FEATURE__SCENARIOS:
        return scenarios != null && !scenarios.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FeatureImpl