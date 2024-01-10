/**
 */
package schemaTable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see schemaTable.SchemaTableFactory
 * @model kind="package"
 * @generated
 */
public interface SchemaTablePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "schemaTable";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/schemaTable";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "schemaTable";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchemaTablePackage eINSTANCE = schemaTable.impl.SchemaTablePackageImpl.init();

	/**
	 * The meta object id for the '{@link schemaTable.impl.TableauImpl <em>Tableau</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see schemaTable.impl.TableauImpl
	 * @see schemaTable.impl.SchemaTablePackageImpl#getTableau()
	 * @generated
	 */
	int TABLEAU = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLEAU__NAME = 0;

	/**
	 * The feature id for the '<em><b>Colonne Lignes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLEAU__COLONNE_LIGNES = 1;

	/**
	 * The feature id for the '<em><b>Colonnes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLEAU__COLONNES = 2;

	/**
	 * The number of structural features of the '<em>Tableau</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLEAU_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Tableau</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLEAU_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link schemaTable.impl.ColonneImpl <em>Colonne</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see schemaTable.impl.ColonneImpl
	 * @see schemaTable.impl.SchemaTablePackageImpl#getColonne()
	 * @generated
	 */
	int COLONNE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE__ID = 1;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE__DATA_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Contenu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE__CONTENU = 3;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE__CONTRAINTES = 4;

	/**
	 * The feature id for the '<em><b>Tableau</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE__TABLEAU = 5;

	/**
	 * The number of structural features of the '<em>Colonne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Colonne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link schemaTable.impl.ContenuColonneImpl <em>Contenu Colonne</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see schemaTable.impl.ContenuColonneImpl
	 * @see schemaTable.impl.SchemaTablePackageImpl#getContenuColonne()
	 * @generated
	 */
	int CONTENU_COLONNE = 2;

	/**
	 * The feature id for the '<em><b>Colonne</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU_COLONNE__COLONNE = 0;

	/**
	 * The number of structural features of the '<em>Contenu Colonne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU_COLONNE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Contenu Colonne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU_COLONNE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link schemaTable.impl.AppelAlgoImpl <em>Appel Algo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see schemaTable.impl.AppelAlgoImpl
	 * @see schemaTable.impl.SchemaTablePackageImpl#getAppelAlgo()
	 * @generated
	 */
	int APPEL_ALGO = 3;

	/**
	 * The feature id for the '<em><b>Colonne</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEL_ALGO__COLONNE = CONTENU_COLONNE__COLONNE;

	/**
	 * The feature id for the '<em><b>Algo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEL_ALGO__ALGO = CONTENU_COLONNE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEL_ALGO__INPUT = CONTENU_COLONNE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Appel Algo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEL_ALGO_FEATURE_COUNT = CONTENU_COLONNE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Appel Algo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEL_ALGO_OPERATION_COUNT = CONTENU_COLONNE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link schemaTable.impl.ImportTableImpl <em>Import Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see schemaTable.impl.ImportTableImpl
	 * @see schemaTable.impl.SchemaTablePackageImpl#getImportTable()
	 * @generated
	 */
	int IMPORT_TABLE = 4;

	/**
	 * The feature id for the '<em><b>Colonne</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TABLE__COLONNE = CONTENU_COLONNE__COLONNE;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TABLE__TABLE = CONTENU_COLONNE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TABLE__ID_COLUMN = CONTENU_COLONNE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Import Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TABLE_FEATURE_COUNT = CONTENU_COLONNE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Import Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TABLE_OPERATION_COUNT = CONTENU_COLONNE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link schemaTable.Tableau <em>Tableau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tableau</em>'.
	 * @see schemaTable.Tableau
	 * @generated
	 */
	EClass getTableau();

	/**
	 * Returns the meta object for the attribute '{@link schemaTable.Tableau#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see schemaTable.Tableau#getName()
	 * @see #getTableau()
	 * @generated
	 */
	EAttribute getTableau_Name();

	/**
	 * Returns the meta object for the reference '{@link schemaTable.Tableau#getColonneLignes <em>Colonne Lignes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Colonne Lignes</em>'.
	 * @see schemaTable.Tableau#getColonneLignes()
	 * @see #getTableau()
	 * @generated
	 */
	EReference getTableau_ColonneLignes();

	/**
	 * Returns the meta object for the containment reference list '{@link schemaTable.Tableau#getColonnes <em>Colonnes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Colonnes</em>'.
	 * @see schemaTable.Tableau#getColonnes()
	 * @see #getTableau()
	 * @generated
	 */
	EReference getTableau_Colonnes();

	/**
	 * Returns the meta object for class '{@link schemaTable.Colonne <em>Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colonne</em>'.
	 * @see schemaTable.Colonne
	 * @generated
	 */
	EClass getColonne();

	/**
	 * Returns the meta object for the attribute '{@link schemaTable.Colonne#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see schemaTable.Colonne#getName()
	 * @see #getColonne()
	 * @generated
	 */
	EAttribute getColonne_Name();

	/**
	 * Returns the meta object for the attribute '{@link schemaTable.Colonne#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see schemaTable.Colonne#getId()
	 * @see #getColonne()
	 * @generated
	 */
	EAttribute getColonne_Id();

	/**
	 * Returns the meta object for the attribute '{@link schemaTable.Colonne#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see schemaTable.Colonne#getDataType()
	 * @see #getColonne()
	 * @generated
	 */
	EAttribute getColonne_DataType();

	/**
	 * Returns the meta object for the containment reference '{@link schemaTable.Colonne#getContenu <em>Contenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contenu</em>'.
	 * @see schemaTable.Colonne#getContenu()
	 * @see #getColonne()
	 * @generated
	 */
	EReference getColonne_Contenu();

	/**
	 * Returns the meta object for the reference list '{@link schemaTable.Colonne#getContraintes <em>Contraintes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contraintes</em>'.
	 * @see schemaTable.Colonne#getContraintes()
	 * @see #getColonne()
	 * @generated
	 */
	EReference getColonne_Contraintes();

	/**
	 * Returns the meta object for the container reference '{@link schemaTable.Colonne#getTableau <em>Tableau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tableau</em>'.
	 * @see schemaTable.Colonne#getTableau()
	 * @see #getColonne()
	 * @generated
	 */
	EReference getColonne_Tableau();

	/**
	 * Returns the meta object for class '{@link schemaTable.ContenuColonne <em>Contenu Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenu Colonne</em>'.
	 * @see schemaTable.ContenuColonne
	 * @generated
	 */
	EClass getContenuColonne();

	/**
	 * Returns the meta object for the container reference '{@link schemaTable.ContenuColonne#getColonne <em>Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Colonne</em>'.
	 * @see schemaTable.ContenuColonne#getColonne()
	 * @see #getContenuColonne()
	 * @generated
	 */
	EReference getContenuColonne_Colonne();

	/**
	 * Returns the meta object for class '{@link schemaTable.AppelAlgo <em>Appel Algo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Appel Algo</em>'.
	 * @see schemaTable.AppelAlgo
	 * @generated
	 */
	EClass getAppelAlgo();

	/**
	 * Returns the meta object for the reference '{@link schemaTable.AppelAlgo#getAlgo <em>Algo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Algo</em>'.
	 * @see schemaTable.AppelAlgo#getAlgo()
	 * @see #getAppelAlgo()
	 * @generated
	 */
	EReference getAppelAlgo_Algo();

	/**
	 * Returns the meta object for the reference list '{@link schemaTable.AppelAlgo#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see schemaTable.AppelAlgo#getInput()
	 * @see #getAppelAlgo()
	 * @generated
	 */
	EReference getAppelAlgo_Input();

	/**
	 * Returns the meta object for class '{@link schemaTable.ImportTable <em>Import Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Table</em>'.
	 * @see schemaTable.ImportTable
	 * @generated
	 */
	EClass getImportTable();

	/**
	 * Returns the meta object for the reference '{@link schemaTable.ImportTable#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table</em>'.
	 * @see schemaTable.ImportTable#getTable()
	 * @see #getImportTable()
	 * @generated
	 */
	EReference getImportTable_Table();

	/**
	 * Returns the meta object for the attribute '{@link schemaTable.ImportTable#getIdColumn <em>Id Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Column</em>'.
	 * @see schemaTable.ImportTable#getIdColumn()
	 * @see #getImportTable()
	 * @generated
	 */
	EAttribute getImportTable_IdColumn();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SchemaTableFactory getSchemaTableFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link schemaTable.impl.TableauImpl <em>Tableau</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see schemaTable.impl.TableauImpl
		 * @see schemaTable.impl.SchemaTablePackageImpl#getTableau()
		 * @generated
		 */
		EClass TABLEAU = eINSTANCE.getTableau();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLEAU__NAME = eINSTANCE.getTableau_Name();

		/**
		 * The meta object literal for the '<em><b>Colonne Lignes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLEAU__COLONNE_LIGNES = eINSTANCE.getTableau_ColonneLignes();

		/**
		 * The meta object literal for the '<em><b>Colonnes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLEAU__COLONNES = eINSTANCE.getTableau_Colonnes();

		/**
		 * The meta object literal for the '{@link schemaTable.impl.ColonneImpl <em>Colonne</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see schemaTable.impl.ColonneImpl
		 * @see schemaTable.impl.SchemaTablePackageImpl#getColonne()
		 * @generated
		 */
		EClass COLONNE = eINSTANCE.getColonne();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLONNE__NAME = eINSTANCE.getColonne_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLONNE__ID = eINSTANCE.getColonne_Id();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLONNE__DATA_TYPE = eINSTANCE.getColonne_DataType();

		/**
		 * The meta object literal for the '<em><b>Contenu</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLONNE__CONTENU = eINSTANCE.getColonne_Contenu();

		/**
		 * The meta object literal for the '<em><b>Contraintes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLONNE__CONTRAINTES = eINSTANCE.getColonne_Contraintes();

		/**
		 * The meta object literal for the '<em><b>Tableau</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLONNE__TABLEAU = eINSTANCE.getColonne_Tableau();

		/**
		 * The meta object literal for the '{@link schemaTable.impl.ContenuColonneImpl <em>Contenu Colonne</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see schemaTable.impl.ContenuColonneImpl
		 * @see schemaTable.impl.SchemaTablePackageImpl#getContenuColonne()
		 * @generated
		 */
		EClass CONTENU_COLONNE = eINSTANCE.getContenuColonne();

		/**
		 * The meta object literal for the '<em><b>Colonne</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENU_COLONNE__COLONNE = eINSTANCE.getContenuColonne_Colonne();

		/**
		 * The meta object literal for the '{@link schemaTable.impl.AppelAlgoImpl <em>Appel Algo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see schemaTable.impl.AppelAlgoImpl
		 * @see schemaTable.impl.SchemaTablePackageImpl#getAppelAlgo()
		 * @generated
		 */
		EClass APPEL_ALGO = eINSTANCE.getAppelAlgo();

		/**
		 * The meta object literal for the '<em><b>Algo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPEL_ALGO__ALGO = eINSTANCE.getAppelAlgo_Algo();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPEL_ALGO__INPUT = eINSTANCE.getAppelAlgo_Input();

		/**
		 * The meta object literal for the '{@link schemaTable.impl.ImportTableImpl <em>Import Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see schemaTable.impl.ImportTableImpl
		 * @see schemaTable.impl.SchemaTablePackageImpl#getImportTable()
		 * @generated
		 */
		EClass IMPORT_TABLE = eINSTANCE.getImportTable();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT_TABLE__TABLE = eINSTANCE.getImportTable_Table();

		/**
		 * The meta object literal for the '<em><b>Id Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_TABLE__ID_COLUMN = eINSTANCE.getImportTable_IdColumn();

	}

} //SchemaTablePackage
