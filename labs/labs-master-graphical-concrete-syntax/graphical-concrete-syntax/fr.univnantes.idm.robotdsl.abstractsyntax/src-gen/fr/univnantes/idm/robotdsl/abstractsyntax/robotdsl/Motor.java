/**
 */
package fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Motor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Motor#getPower <em>Power</em>}</li>
 *   <li>{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Motor#getPoweredWheels <em>Powered Wheels</em>}</li>
 * </ul>
 *
 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotdslPackage#getMotor()
 * @model
 * @generated
 */
public interface Motor extends Component {
	/**
	 * Returns the value of the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power</em>' attribute.
	 * @see #setPower(int)
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotdslPackage#getMotor_Power()
	 * @model
	 * @generated
	 */
	int getPower();

	/**
	 * Sets the value of the '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Motor#getPower <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power</em>' attribute.
	 * @see #getPower()
	 * @generated
	 */
	void setPower(int value);

	/**
	 * Returns the value of the '<em><b>Powered Wheels</b></em>' reference list.
	 * The list contents are of type {@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Wheel}.
	 * It is bidirectional and its opposite is '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Wheel#getMotor <em>Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Powered Wheels</em>' reference list.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotdslPackage#getMotor_PoweredWheels()
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Wheel#getMotor
	 * @model opposite="motor"
	 * @generated
	 */
	EList<Wheel> getPoweredWheels();

} // Motor
