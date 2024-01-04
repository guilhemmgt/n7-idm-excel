/**
 */
package expression;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link expression.Expression#getNom <em>Nom</em>}</li>
 *   <li>{@link expression.Expression#getEntree <em>Entree</em>}</li>
 *   <li>{@link expression.Expression#getSortie <em>Sortie</em>}</li>
 *   <li>{@link expression.Expression#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see expression.ExpressionPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see expression.ExpressionPackage#getExpression_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link expression.Expression#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Entree</b></em>' reference list.
	 * The list contents are of type {@link expression.Entree}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entree</em>' reference list.
	 * @see expression.ExpressionPackage#getExpression_Entree()
	 * @model
	 * @generated
	 */
	EList<Entree> getEntree();

	/**
	 * Returns the value of the '<em><b>Sortie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sortie</em>' reference.
	 * @see #setSortie(Sortie)
	 * @see expression.ExpressionPackage#getExpression_Sortie()
	 * @model required="true"
	 * @generated
	 */
	Sortie getSortie();

	/**
	 * Sets the value of the '{@link expression.Expression#getSortie <em>Sortie</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sortie</em>' reference.
	 * @see #getSortie()
	 * @generated
	 */
	void setSortie(Sortie value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link expression.ExpressionElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see expression.ExpressionPackage#getExpression_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpressionElement> getElements();

} // Expression
