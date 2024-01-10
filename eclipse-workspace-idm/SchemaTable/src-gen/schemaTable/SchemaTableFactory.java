/**
 */
package schemaTable;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see schemaTable.SchemaTablePackage
 * @generated
 */
public interface SchemaTableFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchemaTableFactory eINSTANCE = schemaTable.impl.SchemaTableFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Tableau</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tableau</em>'.
	 * @generated
	 */
	Tableau createTableau();

	/**
	 * Returns a new object of class '<em>Colonne</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Colonne</em>'.
	 * @generated
	 */
	Colonne createColonne();

	/**
	 * Returns a new object of class '<em>Appel Algo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Appel Algo</em>'.
	 * @generated
	 */
	AppelAlgo createAppelAlgo();

	/**
	 * Returns a new object of class '<em>Import Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import Table</em>'.
	 * @generated
	 */
	ImportTable createImportTable();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SchemaTablePackage getSchemaTablePackage();

} //SchemaTableFactory
