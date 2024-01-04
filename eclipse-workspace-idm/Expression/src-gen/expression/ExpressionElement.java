/**
 */
package expression;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link expression.ExpressionElement#getEntree <em>Entree</em>}</li>
 *   <li>{@link expression.ExpressionElement#getSortie <em>Sortie</em>}</li>
 * </ul>
 *
 * @see expression.ExpressionPackage#getExpressionElement()
 * @model abstract="true"
 * @generated
 */
public interface ExpressionElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Entree</b></em>' reference list.
	 * The list contents are of type {@link expression.ExpressionElement}.
	 * It is bidirectional and its opposite is '{@link expression.ExpressionElement#getSortie <em>Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entree</em>' reference list.
	 * @see expression.ExpressionPackage#getExpressionElement_Entree()
	 * @see expression.ExpressionElement#getSortie
	 * @model opposite="sortie"
	 * @generated
	 */
	EList<ExpressionElement> getEntree();

	/**
	 * Returns the value of the '<em><b>Sortie</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link expression.ExpressionElement#getEntree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sortie</em>' reference.
	 * @see #setSortie(ExpressionElement)
	 * @see expression.ExpressionPackage#getExpressionElement_Sortie()
	 * @see expression.ExpressionElement#getEntree
	 * @model opposite="entree"
	 * @generated
	 */
	ExpressionElement getSortie();

	/**
	 * Sets the value of the '{@link expression.ExpressionElement#getSortie <em>Sortie</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sortie</em>' reference.
	 * @see #getSortie()
	 * @generated
	 */
	void setSortie(ExpressionElement value);

} // ExpressionElement
