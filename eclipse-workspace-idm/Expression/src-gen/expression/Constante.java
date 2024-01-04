/**
 */
package expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constante</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link expression.Constante#getValeur <em>Valeur</em>}</li>
 * </ul>
 *
 * @see expression.ExpressionPackage#getConstante()
 * @model
 * @generated
 */
public interface Constante extends OperationNullaire {
	/**
	 * Returns the value of the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur</em>' attribute.
	 * @see #setValeur(float)
	 * @see expression.ExpressionPackage#getConstante_Valeur()
	 * @model required="true"
	 * @generated
	 */
	float getValeur();

	/**
	 * Sets the value of the '{@link expression.Constante#getValeur <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valeur</em>' attribute.
	 * @see #getValeur()
	 * @generated
	 */
	void setValeur(float value);

} // Constante
