/**
 */
package fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robot Simulation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotSimulation#getRobots <em>Robots</em>}</li>
 *   <li>{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotSimulation#getPrograms <em>Programs</em>}</li>
 * </ul>
 *
 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotdslPackage#getRobotSimulation()
 * @model
 * @generated
 */
public interface RobotSimulation extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Robots</b></em>' containment reference list.
	 * The list contents are of type {@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Robot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Robots</em>' containment reference list.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotdslPackage#getRobotSimulation_Robots()
	 * @model containment="true"
	 * @generated
	 */
	EList<Robot> getRobots();

	/**
	 * Returns the value of the '<em><b>Programs</b></em>' containment reference list.
	 * The list contents are of type {@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotProgram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programs</em>' containment reference list.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotdslPackage#getRobotSimulation_Programs()
	 * @model containment="true"
	 * @generated
	 */
	EList<RobotProgram> getPrograms();

} // RobotSimulation
