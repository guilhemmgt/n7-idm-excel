/**
 */
package schemaTable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tableau</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link schemaTable.Tableau#getName <em>Name</em>}</li>
 *   <li>{@link schemaTable.Tableau#getColonneLignes <em>Colonne Lignes</em>}</li>
 *   <li>{@link schemaTable.Tableau#getColonnes <em>Colonnes</em>}</li>
 * </ul>
 *
 * @see schemaTable.SchemaTablePackage#getTableau()
 * @model
 * @generated
 */
public interface Tableau extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see schemaTable.SchemaTablePackage#getTableau_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link schemaTable.Tableau#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Colonne Lignes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colonne Lignes</em>' reference.
	 * @see #setColonneLignes(Colonne)
	 * @see schemaTable.SchemaTablePackage#getTableau_ColonneLignes()
	 * @model required="true"
	 * @generated
	 */
	Colonne getColonneLignes();

	/**
	 * Sets the value of the '{@link schemaTable.Tableau#getColonneLignes <em>Colonne Lignes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colonne Lignes</em>' reference.
	 * @see #getColonneLignes()
	 * @generated
	 */
	void setColonneLignes(Colonne value);

	/**
	 * Returns the value of the '<em><b>Colonnes</b></em>' containment reference list.
	 * The list contents are of type {@link schemaTable.Colonne}.
	 * It is bidirectional and its opposite is '{@link schemaTable.Colonne#getTableau <em>Tableau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colonnes</em>' containment reference list.
	 * @see schemaTable.SchemaTablePackage#getTableau_Colonnes()
	 * @see schemaTable.Colonne#getTableau
	 * @model opposite="tableau" containment="true"
	 * @generated
	 */
	EList<Colonne> getColonnes();

} // Tableau
