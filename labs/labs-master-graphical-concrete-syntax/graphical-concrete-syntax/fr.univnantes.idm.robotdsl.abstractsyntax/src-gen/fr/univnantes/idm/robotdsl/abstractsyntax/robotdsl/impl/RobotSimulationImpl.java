/**
 */
package fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl;

import fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Robot;
import fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotProgram;
import fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotSimulation;
import fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotdslPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robot Simulation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotSimulationImpl#getRobots <em>Robots</em>}</li>
 *   <li>{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotSimulationImpl#getPrograms <em>Programs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RobotSimulationImpl extends NamedElementImpl implements RobotSimulation {
	/**
	 * The cached value of the '{@link #getRobots() <em>Robots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRobots()
	 * @generated
	 * @ordered
	 */
	protected EList<Robot> robots;

	/**
	 * The cached value of the '{@link #getPrograms() <em>Programs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrograms()
	 * @generated
	 * @ordered
	 */
	protected EList<RobotProgram> programs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotSimulationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotdslPackage.Literals.ROBOT_SIMULATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Robot> getRobots() {
		if (robots == null) {
			robots = new EObjectContainmentEList<Robot>(Robot.class, this, RobotdslPackage.ROBOT_SIMULATION__ROBOTS);
		}
		return robots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RobotProgram> getPrograms() {
		if (programs == null) {
			programs = new EObjectContainmentEList<RobotProgram>(RobotProgram.class, this,
					RobotdslPackage.ROBOT_SIMULATION__PROGRAMS);
		}
		return programs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RobotdslPackage.ROBOT_SIMULATION__ROBOTS:
			return ((InternalEList<?>) getRobots()).basicRemove(otherEnd, msgs);
		case RobotdslPackage.ROBOT_SIMULATION__PROGRAMS:
			return ((InternalEList<?>) getPrograms()).basicRemove(otherEnd, msgs);
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
		case RobotdslPackage.ROBOT_SIMULATION__ROBOTS:
			return getRobots();
		case RobotdslPackage.ROBOT_SIMULATION__PROGRAMS:
			return getPrograms();
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
		case RobotdslPackage.ROBOT_SIMULATION__ROBOTS:
			getRobots().clear();
			getRobots().addAll((Collection<? extends Robot>) newValue);
			return;
		case RobotdslPackage.ROBOT_SIMULATION__PROGRAMS:
			getPrograms().clear();
			getPrograms().addAll((Collection<? extends RobotProgram>) newValue);
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
		case RobotdslPackage.ROBOT_SIMULATION__ROBOTS:
			getRobots().clear();
			return;
		case RobotdslPackage.ROBOT_SIMULATION__PROGRAMS:
			getPrograms().clear();
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
		case RobotdslPackage.ROBOT_SIMULATION__ROBOTS:
			return robots != null && !robots.isEmpty();
		case RobotdslPackage.ROBOT_SIMULATION__PROGRAMS:
			return programs != null && !programs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RobotSimulationImpl
