/**
 */
package fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wheel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Wheel#getMotor <em>Motor</em>}</li>
 * </ul>
 *
 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotdslPackage#getWheel()
 * @model
 * @generated
 */
public interface Wheel extends Component {
	/**
	 * Returns the value of the '<em><b>Motor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Motor#getPoweredWheels <em>Powered Wheels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motor</em>' reference.
	 * @see #setMotor(Motor)
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotdslPackage#getWheel_Motor()
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Motor#getPoweredWheels
	 * @model opposite="poweredWheels"
	 * @generated
	 */
	Motor getMotor();

	/**
	 * Sets the value of the '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Wheel#getMotor <em>Motor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Motor</em>' reference.
	 * @see #getMotor()
	 * @generated
	 */
	void setMotor(Motor value);

} // Wheel
