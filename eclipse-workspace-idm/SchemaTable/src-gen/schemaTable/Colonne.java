/**
 */
package schemaTable;

import algo.Algo;
import algo.DataType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colonne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link schemaTable.Colonne#getName <em>Name</em>}</li>
 *   <li>{@link schemaTable.Colonne#getId <em>Id</em>}</li>
 *   <li>{@link schemaTable.Colonne#getDataType <em>Data Type</em>}</li>
 *   <li>{@link schemaTable.Colonne#getContenu <em>Contenu</em>}</li>
 *   <li>{@link schemaTable.Colonne#getContraintes <em>Contraintes</em>}</li>
 *   <li>{@link schemaTable.Colonne#getTableau <em>Tableau</em>}</li>
 * </ul>
 *
 * @see schemaTable.SchemaTablePackage#getColonne()
 * @model
 * @generated
 */
public interface Colonne extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see schemaTable.SchemaTablePackage#getColonne_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link schemaTable.Colonne#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see schemaTable.SchemaTablePackage#getColonne_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link schemaTable.Colonne#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link algo.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see algo.DataType
	 * @see #setDataType(DataType)
	 * @see schemaTable.SchemaTablePackage#getColonne_DataType()
	 * @model required="true"
	 * @generated
	 */
	DataType getDataType();

	/**
	 * Sets the value of the '{@link schemaTable.Colonne#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see algo.DataType
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType value);

	/**
	 * Returns the value of the '<em><b>Contenu</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link schemaTable.ContenuColonne#getColonne <em>Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenu</em>' containment reference.
	 * @see #setContenu(ContenuColonne)
	 * @see schemaTable.SchemaTablePackage#getColonne_Contenu()
	 * @see schemaTable.ContenuColonne#getColonne
	 * @model opposite="colonne" containment="true"
	 * @generated
	 */
	ContenuColonne getContenu();

	/**
	 * Sets the value of the '{@link schemaTable.Colonne#getContenu <em>Contenu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contenu</em>' containment reference.
	 * @see #getContenu()
	 * @generated
	 */
	void setContenu(ContenuColonne value);

	/**
	 * Returns the value of the '<em><b>Contraintes</b></em>' reference list.
	 * The list contents are of type {@link algo.Algo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contraintes</em>' reference list.
	 * @see schemaTable.SchemaTablePackage#getColonne_Contraintes()
	 * @model
	 * @generated
	 */
	EList<Algo> getContraintes();

	/**
	 * Returns the value of the '<em><b>Tableau</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link schemaTable.Tableau#getColonnes <em>Colonnes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tableau</em>' container reference.
	 * @see schemaTable.SchemaTablePackage#getColonne_Tableau()
	 * @see schemaTable.Tableau#getColonnes
	 * @model opposite="colonnes" required="true" transient="false" changeable="false"
	 * @generated
	 */
	Tableau getTableau();

} // Colonne
