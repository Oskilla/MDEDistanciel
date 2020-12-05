/**
 */
package fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move Forward</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.MoveForward#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotdslPackage#getMoveForward()
 * @model
 * @generated
 */
public interface MoveForward extends Command {
	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(int)
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotdslPackage#getMoveForward_Distance()
	 * @model required="true"
	 * @generated
	 */
	int getDistance();

	/**
	 * Sets the value of the '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.MoveForward#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(int value);

} // MoveForward
