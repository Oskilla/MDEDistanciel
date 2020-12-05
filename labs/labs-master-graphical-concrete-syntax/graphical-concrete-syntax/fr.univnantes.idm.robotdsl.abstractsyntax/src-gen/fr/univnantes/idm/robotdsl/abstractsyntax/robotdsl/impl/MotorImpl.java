/**
 */
package fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl;

import fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Motor;
import fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotdslPackage;
import fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Wheel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Motor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.MotorImpl#getPower <em>Power</em>}</li>
 *   <li>{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.MotorImpl#getPoweredWheels <em>Powered Wheels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MotorImpl extends ComponentImpl implements Motor {
	/**
	 * The default value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected static final int POWER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected int power = POWER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPoweredWheels() <em>Powered Wheels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoweredWheels()
	 * @generated
	 * @ordered
	 */
	protected EList<Wheel> poweredWheels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MotorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotdslPackage.Literals.MOTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPower() {
		return power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPower(int newPower) {
		int oldPower = power;
		power = newPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotdslPackage.MOTOR__POWER, oldPower, power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Wheel> getPoweredWheels() {
		if (poweredWheels == null) {
			poweredWheels = new EObjectWithInverseResolvingEList<Wheel>(Wheel.class, this,
					RobotdslPackage.MOTOR__POWERED_WHEELS, RobotdslPackage.WHEEL__MOTOR);
		}
		return poweredWheels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RobotdslPackage.MOTOR__POWERED_WHEELS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPoweredWheels()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RobotdslPackage.MOTOR__POWERED_WHEELS:
			return ((InternalEList<?>) getPoweredWheels()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RobotdslPackage.MOTOR__POWER:
			return getPower();
		case RobotdslPackage.MOTOR__POWERED_WHEELS:
			return getPoweredWheels();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RobotdslPackage.MOTOR__POWER:
			setPower((Integer) newValue);
			return;
		case RobotdslPackage.MOTOR__POWERED_WHEELS:
			getPoweredWheels().clear();
			getPoweredWheels().addAll((Collection<? extends Wheel>) newValue);
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
		case RobotdslPackage.MOTOR__POWER:
			setPower(POWER_EDEFAULT);
			return;
		case RobotdslPackage.MOTOR__POWERED_WHEELS:
			getPoweredWheels().clear();
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
		case RobotdslPackage.MOTOR__POWER:
			return power != POWER_EDEFAULT;
		case RobotdslPackage.MOTOR__POWERED_WHEELS:
			return poweredWheels != null && !poweredWheels.isEmpty();
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
		result.append(" (power: ");
		result.append(power);
		result.append(')');
		return result.toString();
	}

} //MotorImpl
