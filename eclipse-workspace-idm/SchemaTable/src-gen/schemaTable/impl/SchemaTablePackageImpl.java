/**
 */
package schemaTable.impl;

import algo.AlgoPackage;

import algo.impl.AlgoPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import schemaTable.AppelAlgo;
import schemaTable.Colonne;
import schemaTable.ContenuColonne;
import schemaTable.ImportTable;
import schemaTable.SchemaTableFactory;
import schemaTable.SchemaTablePackage;
import schemaTable.Tableau;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SchemaTablePackageImpl extends EPackageImpl implements SchemaTablePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableauEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colonneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenuColonneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appelAlgoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importTableEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see schemaTable.SchemaTablePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SchemaTablePackageImpl() {
		super(eNS_URI, SchemaTableFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SchemaTablePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SchemaTablePackage init() {
		if (isInited)
			return (SchemaTablePackage) EPackage.Registry.INSTANCE.getEPackage(SchemaTablePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSchemaTablePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SchemaTablePackageImpl theSchemaTablePackage = registeredSchemaTablePackage instanceof SchemaTablePackageImpl
				? (SchemaTablePackageImpl) registeredSchemaTablePackage
				: new SchemaTablePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AlgoPackage.eNS_URI);
		AlgoPackageImpl theAlgoPackage = (AlgoPackageImpl) (registeredPackage instanceof AlgoPackageImpl
				? registeredPackage
				: AlgoPackage.eINSTANCE);

		// Create package meta-data objects
		theSchemaTablePackage.createPackageContents();
		theAlgoPackage.createPackageContents();

		// Initialize created meta-data
		theSchemaTablePackage.initializePackageContents();
		theAlgoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSchemaTablePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SchemaTablePackage.eNS_URI, theSchemaTablePackage);
		return theSchemaTablePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTableau() {
		return tableauEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableau_Name() {
		return (EAttribute) tableauEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTableau_ColonneLignes() {
		return (EReference) tableauEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTableau_Colonnes() {
		return (EReference) tableauEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColonne() {
		return colonneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColonne_Name() {
		return (EAttribute) colonneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColonne_Id() {
		return (EAttribute) colonneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColonne_DataType() {
		return (EAttribute) colonneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getColonne_Contenu() {
		return (EReference) colonneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getColonne_Contraintes() {
		return (EReference) colonneEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getColonne_Tableau() {
		return (EReference) colonneEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContenuColonne() {
		return contenuColonneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContenuColonne_Colonne() {
		return (EReference) contenuColonneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAppelAlgo() {
		return appelAlgoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAppelAlgo_Algo() {
		return (EReference) appelAlgoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAppelAlgo_Input() {
		return (EReference) appelAlgoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImportTable() {
		return importTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImportTable_Table() {
		return (EReference) importTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImportTable_IdColumn() {
		return (EAttribute) importTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchemaTableFactory getSchemaTableFactory() {
		return (SchemaTableFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		tableauEClass = createEClass(TABLEAU);
		createEAttribute(tableauEClass, TABLEAU__NAME);
		createEReference(tableauEClass, TABLEAU__COLONNE_LIGNES);
		createEReference(tableauEClass, TABLEAU__COLONNES);

		colonneEClass = createEClass(COLONNE);
		createEAttribute(colonneEClass, COLONNE__NAME);
		createEAttribute(colonneEClass, COLONNE__ID);
		createEAttribute(colonneEClass, COLONNE__DATA_TYPE);
		createEReference(colonneEClass, COLONNE__CONTENU);
		createEReference(colonneEClass, COLONNE__CONTRAINTES);
		createEReference(colonneEClass, COLONNE__TABLEAU);

		contenuColonneEClass = createEClass(CONTENU_COLONNE);
		createEReference(contenuColonneEClass, CONTENU_COLONNE__COLONNE);

		appelAlgoEClass = createEClass(APPEL_ALGO);
		createEReference(appelAlgoEClass, APPEL_ALGO__ALGO);
		createEReference(appelAlgoEClass, APPEL_ALGO__INPUT);

		importTableEClass = createEClass(IMPORT_TABLE);
		createEReference(importTableEClass, IMPORT_TABLE__TABLE);
		createEAttribute(importTableEClass, IMPORT_TABLE__ID_COLUMN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AlgoPackage theAlgoPackage = (AlgoPackage) EPackage.Registry.INSTANCE.getEPackage(AlgoPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		appelAlgoEClass.getESuperTypes().add(this.getContenuColonne());
		importTableEClass.getESuperTypes().add(this.getContenuColonne());

		// Initialize classes, features, and operations; add parameters
		initEClass(tableauEClass, Tableau.class, "Tableau", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableau_Name(), ecorePackage.getEString(), "name", null, 1, 1, Tableau.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableau_ColonneLignes(), this.getColonne(), null, "colonneLignes", null, 1, 1, Tableau.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableau_Colonnes(), this.getColonne(), this.getColonne_Tableau(), "colonnes", null, 0, -1,
				Tableau.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colonneEClass, Colonne.class, "Colonne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColonne_Name(), ecorePackage.getEString(), "name", null, 1, 1, Colonne.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColonne_Id(), ecorePackage.getEString(), "id", null, 1, 1, Colonne.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColonne_DataType(), theAlgoPackage.getDataType(), "dataType", null, 1, 1, Colonne.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColonne_Contenu(), this.getContenuColonne(), this.getContenuColonne_Colonne(), "contenu",
				null, 0, 1, Colonne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColonne_Contraintes(), theAlgoPackage.getAlgo(), null, "contraintes", null, 0, -1,
				Colonne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColonne_Tableau(), this.getTableau(), this.getTableau_Colonnes(), "tableau", null, 1, 1,
				Colonne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contenuColonneEClass, ContenuColonne.class, "ContenuColonne", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenuColonne_Colonne(), this.getColonne(), this.getColonne_Contenu(), "colonne", null, 1, 1,
				ContenuColonne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appelAlgoEClass, AppelAlgo.class, "AppelAlgo", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAppelAlgo_Algo(), theAlgoPackage.getAlgo(), null, "algo", null, 1, 1, AppelAlgo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppelAlgo_Input(), this.getColonne(), null, "input", null, 0, -1, AppelAlgo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importTableEClass, ImportTable.class, "ImportTable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImportTable_Table(), this.getTableau(), null, "table", null, 1, 1, ImportTable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImportTable_IdColumn(), ecorePackage.getEString(), "idColumn", null, 1, 1, ImportTable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SchemaTablePackageImpl
