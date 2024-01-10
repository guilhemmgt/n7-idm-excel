/**
 */
package schemaTable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenu Colonne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link schemaTable.ContenuColonne#getColonne <em>Colonne</em>}</li>
 * </ul>
 *
 * @see schemaTable.SchemaTablePackage#getContenuColonne()
 * @model abstract="true"
 * @generated
 */
public interface ContenuColonne extends EObject {

	/**
	 * Returns the value of the '<em><b>Colonne</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link schemaTable.Colonne#getContenu <em>Contenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colonne</em>' container reference.
	 * @see schemaTable.SchemaTablePackage#getContenuColonne_Colonne()
	 * @see schemaTable.Colonne#getContenu
	 * @model opposite="contenu" required="true" transient="false" changeable="false"
	 * @generated
	 */
	Colonne getColonne();
} // ContenuColonne
