/**
 */
package fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl;

import fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Light;
import fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.LightColor;
import fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotdslPackage;
import fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.SetLightColor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Light Color</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.SetLightColorImpl#getLight <em>Light</em>}</li>
 *   <li>{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.SetLightColorImpl#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetLightColorImpl extends CommandImpl implements SetLightColor {
	/**
	 * The cached value of the '{@link #getLight() <em>Light</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLight()
	 * @generated
	 * @ordered
	 */
	protected Light light;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final LightColor COLOR_EDEFAULT = LightColor.NONE;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected LightColor color = COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetLightColorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotdslPackage.Literals.SET_LIGHT_COLOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Light getLight() {
		if (light != null && light.eIsProxy()) {
			InternalEObject oldLight = (InternalEObject) light;
			light = (Light) eResolveProxy(oldLight);
			if (light != oldLight) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RobotdslPackage.SET_LIGHT_COLOR__LIGHT,
							oldLight, light));
			}
		}
		return light;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Light basicGetLight() {
		return light;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLight(Light newLight) {
		Light oldLight = light;
		light = newLight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotdslPackage.SET_LIGHT_COLOR__LIGHT, oldLight,
					light));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LightColor getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(LightColor newColor) {
		LightColor oldColor = color;
		color = newColor == null ? COLOR_EDEFAULT : newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotdslPackage.SET_LIGHT_COLOR__COLOR, oldColor,
					color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RobotdslPackage.SET_LIGHT_COLOR__LIGHT:
			if (resolve)
				return getLight();
			return basicGetLight();
		case RobotdslPackage.SET_LIGHT_COLOR__COLOR:
			return getColor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RobotdslPackage.SET_LIGHT_COLOR__LIGHT:
			setLight((Light) newValue);
			return;
		case RobotdslPackage.SET_LIGHT_COLOR__COLOR:
			setColor((LightColor) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case RobotdslPackage.SET_LIGHT_COLOR__LIGHT:
			setLight((Light) null);
			return;
		case RobotdslPackage.SET_LIGHT_COLOR__COLOR:
			setColor(COLOR_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RobotdslPackage.SET_LIGHT_COLOR__LIGHT:
			return light != null;
		case RobotdslPackage.SET_LIGHT_COLOR__COLOR:
			return color != COLOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (color: ");
		result.append(color);
		result.append(')');
		return result.toString();
	}

} //SetLightColorImpl
