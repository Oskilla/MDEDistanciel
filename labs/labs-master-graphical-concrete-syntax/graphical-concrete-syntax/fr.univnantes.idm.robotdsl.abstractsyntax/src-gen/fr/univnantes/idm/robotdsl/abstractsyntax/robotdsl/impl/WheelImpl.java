/**
 */
package fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl;

import fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Motor;
import fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotdslPackage;
import fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Wheel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wheel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.WheelImpl#getMotor <em>Motor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WheelImpl extends ComponentImpl implements Wheel {
	/**
	 * The cached value of the '{@link #getMotor() <em>Motor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotor()
	 * @generated
	 * @ordered
	 */
	protected Motor motor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WheelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotdslPackage.Literals.WHEEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Motor getMotor() {
		if (motor != null && motor.eIsProxy()) {
			InternalEObject oldMotor = (InternalEObject) motor;
			motor = (Motor) eResolveProxy(oldMotor);
			if (motor != oldMotor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RobotdslPackage.WHEEL__MOTOR, oldMotor,
							motor));
			}
		}
		return motor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Motor basicGetMotor() {
		return motor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMotor(Motor newMotor, NotificationChain msgs) {
		Motor oldMotor = motor;
		motor = newMotor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RobotdslPackage.WHEEL__MOTOR,
					oldMotor, newMotor);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMotor(Motor newMotor) {
		if (newMotor != motor) {
			NotificationChain msgs = null;
			if (motor != null)
				msgs = ((InternalEObject) motor).eInverseRemove(this, RobotdslPackage.MOTOR__POWERED_WHEELS,
						Motor.class, msgs);
			if (newMotor != null)
				msgs = ((InternalEObject) newMotor).eInverseAdd(this, RobotdslPackage.MOTOR__POWERED_WHEELS,
						Motor.class, msgs);
			msgs = basicSetMotor(newMotor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotdslPackage.WHEEL__MOTOR, newMotor, newMotor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RobotdslPackage.WHEEL__MOTOR:
			if (motor != null)
				msgs = ((InternalEObject) motor).eInverseRemove(this, RobotdslPackage.MOTOR__POWERED_WHEELS,
						Motor.class, msgs);
			return basicSetMotor((Motor) otherEnd, msgs);
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
		case RobotdslPackage.WHEEL__MOTOR:
			return basicSetMotor(null, msgs);
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
		case RobotdslPackage.WHEEL__MOTOR:
			if (resolve)
				return getMotor();
			return basicGetMotor();
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
		case RobotdslPackage.WHEEL__MOTOR:
			setMotor((Motor) newValue);
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
		case RobotdslPackage.WHEEL__MOTOR:
			setMotor((Motor) null);
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
		case RobotdslPackage.WHEEL__MOTOR:
			return motor != null;
		}
		return super.eIsSet(featureID);
	}

} //WheelImpl
