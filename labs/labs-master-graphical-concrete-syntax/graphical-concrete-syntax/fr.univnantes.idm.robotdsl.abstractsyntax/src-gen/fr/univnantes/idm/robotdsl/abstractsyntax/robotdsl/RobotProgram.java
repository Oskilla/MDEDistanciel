/**
 */
package fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robot Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotProgram#getCommands <em>Commands</em>}</li>
 *   <li>{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotProgram#getRobot <em>Robot</em>}</li>
 * </ul>
 *
 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotdslPackage#getRobotProgram()
 * @model
 * @generated
 */
public interface RobotProgram extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotdslPackage#getRobotProgram_Commands()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getCommands();

	/**
	 * Returns the value of the '<em><b>Robot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Robot</em>' reference.
	 * @see #setRobot(Robot)
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotdslPackage#getRobotProgram_Robot()
	 * @model required="true"
	 * @generated
	 */
	Robot getRobot();

	/**
	 * Sets the value of the '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotProgram#getRobot <em>Robot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Robot</em>' reference.
	 * @see #getRobot()
	 * @generated
	 */
	void setRobot(Robot value);

} // RobotProgram
