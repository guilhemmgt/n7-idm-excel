/**
 */
package algo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algo.Documentation#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link algo.Documentation#getLinkToElement <em>Link To Element</em>}</li>
 * </ul>
 *
 * @see algo.AlgoPackage#getDocumentation()
 * @model
 * @generated
 */
public interface Documentation extends EObject {
	/**
	 * Returns the value of the '<em><b>Commentaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commentaire</em>' attribute.
	 * @see #setCommentaire(String)
	 * @see algo.AlgoPackage#getDocumentation_Commentaire()
	 * @model required="true"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link algo.Documentation#getCommentaire <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire</em>' attribute.
	 * @see #getCommentaire()
	 * @generated
	 */
	void setCommentaire(String value);

	/**
	 * Returns the value of the '<em><b>Link To Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link To Element</em>' reference.
	 * @see #setLinkToElement(Documentable)
	 * @see algo.AlgoPackage#getDocumentation_LinkToElement()
	 * @model required="true"
	 * @generated
	 */
	Documentable getLinkToElement();

	/**
	 * Sets the value of the '{@link algo.Documentation#getLinkToElement <em>Link To Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link To Element</em>' reference.
	 * @see #getLinkToElement()
	 * @generated
	 */
	void setLinkToElement(Documentable value);

} // Documentation
