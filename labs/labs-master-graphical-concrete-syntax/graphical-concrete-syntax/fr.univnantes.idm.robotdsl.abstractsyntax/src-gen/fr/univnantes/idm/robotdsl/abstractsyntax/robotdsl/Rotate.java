/**
 */
package fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Rotate#getAngle <em>Angle</em>}</li>
 * </ul>
 *
 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotdslPackage#getRotate()
 * @model
 * @generated
 */
public interface Rotate extends Command {
	/**
	 * Returns the value of the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' attribute.
	 * @see #setAngle(int)
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotdslPackage#getRotate_Angle()
	 * @model required="true"
	 * @generated
	 */
	int getAngle();

	/**
	 * Sets the value of the '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Rotate#getAngle <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' attribute.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(int value);

} // Rotate
