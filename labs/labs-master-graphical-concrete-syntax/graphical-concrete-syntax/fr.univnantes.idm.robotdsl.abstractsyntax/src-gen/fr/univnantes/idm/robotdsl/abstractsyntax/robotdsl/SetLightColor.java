/**
 */
package fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Light Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.SetLightColor#getLight <em>Light</em>}</li>
 *   <li>{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.SetLightColor#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotdslPackage#getSetLightColor()
 * @model
 * @generated
 */
public interface SetLightColor extends Command {
	/**
	 * Returns the value of the '<em><b>Light</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light</em>' reference.
	 * @see #setLight(Light)
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotdslPackage#getSetLightColor_Light()
	 * @model required="true"
	 * @generated
	 */
	Light getLight();

	/**
	 * Sets the value of the '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.SetLightColor#getLight <em>Light</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light</em>' reference.
	 * @see #getLight()
	 * @generated
	 */
	void setLight(Light value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The default value is <code>"NONE"</code>.
	 * The literals are from the enumeration {@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.LightColor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.LightColor
	 * @see #setColor(LightColor)
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotdslPackage#getSetLightColor_Color()
	 * @model default="NONE" required="true"
	 * @generated
	 */
	LightColor getColor();

	/**
	 * Sets the value of the '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.SetLightColor#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.LightColor
	 * @see #getColor()
	 * @generated
	 */
	void setColor(LightColor value);

} // SetLightColor
