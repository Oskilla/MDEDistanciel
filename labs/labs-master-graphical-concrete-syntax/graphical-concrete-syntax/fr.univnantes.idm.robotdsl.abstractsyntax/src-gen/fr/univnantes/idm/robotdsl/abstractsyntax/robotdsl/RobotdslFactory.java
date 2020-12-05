/**
 */
package fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotdslPackage
 * @generated
 */
public interface RobotdslFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RobotdslFactory eINSTANCE = fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotdslFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Robot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robot</em>'.
	 * @generated
	 */
	Robot createRobot();

	/**
	 * Returns a new object of class '<em>Robot Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robot Program</em>'.
	 * @generated
	 */
	RobotProgram createRobotProgram();

	/**
	 * Returns a new object of class '<em>Light</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Light</em>'.
	 * @generated
	 */
	Light createLight();

	/**
	 * Returns a new object of class '<em>Motor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Motor</em>'.
	 * @generated
	 */
	Motor createMotor();

	/**
	 * Returns a new object of class '<em>Robot Simulation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robot Simulation</em>'.
	 * @generated
	 */
	RobotSimulation createRobotSimulation();

	/**
	 * Returns a new object of class '<em>Set Light Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Light Color</em>'.
	 * @generated
	 */
	SetLightColor createSetLightColor();

	/**
	 * Returns a new object of class '<em>Move Forward</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Forward</em>'.
	 * @generated
	 */
	MoveForward createMoveForward();

	/**
	 * Returns a new object of class '<em>Rotate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rotate</em>'.
	 * @generated
	 */
	Rotate createRotate();

	/**
	 * Returns a new object of class '<em>Wheel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wheel</em>'.
	 * @generated
	 */
	Wheel createWheel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RobotdslPackage getRobotdslPackage();

} //RobotdslFactory
