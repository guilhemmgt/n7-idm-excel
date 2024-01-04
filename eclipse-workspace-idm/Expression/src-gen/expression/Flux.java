/**
 */
package expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flux</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link expression.Flux#getNom <em>Nom</em>}</li>
 * </ul>
 *
 * @see expression.ExpressionPackage#getFlux()
 * @model abstract="true"
 * @generated
 */
public interface Flux extends ExpressionElement {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see expression.ExpressionPackage#getFlux_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link expression.Flux#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

} // Flux
