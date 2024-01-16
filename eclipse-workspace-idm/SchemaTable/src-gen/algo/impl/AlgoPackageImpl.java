/**
 */
package algo.impl;

import algo.Algo;
import algo.AlgoFactory;
import algo.AlgoPackage;
import algo.DataType;
import algo.Documentable;
import algo.Documentation;
import algo.Flux;
import algo.Ressource;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import schemaTable.SchemaTablePackage;

import schemaTable.impl.SchemaTablePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlgoPackageImpl extends EPackageImpl implements AlgoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass algoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ressourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fluxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTypeEEnum = null;

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
	 * @see algo.AlgoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AlgoPackageImpl() {
		super(eNS_URI, AlgoFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AlgoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AlgoPackage init() {
		if (isInited)
			return (AlgoPackage) EPackage.Registry.INSTANCE.getEPackage(AlgoPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAlgoPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AlgoPackageImpl theAlgoPackage = registeredAlgoPackage instanceof AlgoPackageImpl
				? (AlgoPackageImpl) registeredAlgoPackage
				: new AlgoPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SchemaTablePackage.eNS_URI);
		SchemaTablePackageImpl theSchemaTablePackage = (SchemaTablePackageImpl) (registeredPackage instanceof SchemaTablePackageImpl
				? registeredPackage
				: SchemaTablePackage.eINSTANCE);

		// Create package meta-data objects
		theAlgoPackage.createPackageContents();
		theSchemaTablePackage.createPackageContents();

		// Initialize created meta-data
		theAlgoPackage.initializePackageContents();
		theSchemaTablePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAlgoPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AlgoPackage.eNS_URI, theAlgoPackage);
		return theAlgoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlgo() {
		return algoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlgo_Name() {
		return (EAttribute) algoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlgo_Ressource() {
		return (EReference) algoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlgo_Output() {
		return (EReference) algoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlgo_Input() {
		return (EReference) algoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlgo_Documentations() {
		return (EReference) algoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRessource() {
		return ressourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRessource_Path() {
		return (EAttribute) ressourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRessource_Algo() {
		return (EReference) ressourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlux() {
		return fluxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlux_Value() {
		return (EAttribute) fluxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlux_Type() {
		return (EAttribute) fluxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentable() {
		return documentableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentation() {
		return documentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentation_Commentaire() {
		return (EAttribute) documentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentation_LinkToElement() {
		return (EReference) documentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDataType() {
		return dataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlgoFactory getAlgoFactory() {
		return (AlgoFactory) getEFactoryInstance();
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
		algoEClass = createEClass(ALGO);
		createEAttribute(algoEClass, ALGO__NAME);
		createEReference(algoEClass, ALGO__RESSOURCE);
		createEReference(algoEClass, ALGO__OUTPUT);
		createEReference(algoEClass, ALGO__INPUT);
		createEReference(algoEClass, ALGO__DOCUMENTATIONS);

		ressourceEClass = createEClass(RESSOURCE);
		createEAttribute(ressourceEClass, RESSOURCE__PATH);
		createEReference(ressourceEClass, RESSOURCE__ALGO);

		fluxEClass = createEClass(FLUX);
		createEAttribute(fluxEClass, FLUX__VALUE);
		createEAttribute(fluxEClass, FLUX__TYPE);

		documentableEClass = createEClass(DOCUMENTABLE);

		documentationEClass = createEClass(DOCUMENTATION);
		createEAttribute(documentationEClass, DOCUMENTATION__COMMENTAIRE);
		createEReference(documentationEClass, DOCUMENTATION__LINK_TO_ELEMENT);

		// Create enums
		dataTypeEEnum = createEEnum(DATA_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		algoEClass.getESuperTypes().add(this.getDocumentable());
		ressourceEClass.getESuperTypes().add(this.getDocumentable());
		fluxEClass.getESuperTypes().add(this.getDocumentable());

		// Initialize classes, features, and operations; add parameters
		initEClass(algoEClass, Algo.class, "Algo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlgo_Name(), ecorePackage.getEString(), "name", null, 1, 1, Algo.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgo_Ressource(), this.getRessource(), this.getRessource_Algo(), "ressource", null, 1, 1,
				Algo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgo_Output(), this.getFlux(), null, "output", null, 1, 1, Algo.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getAlgo_Input(), this.getFlux(), null, "input", null, 0, -1, Algo.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getAlgo_Documentations(), this.getDocumentation(), null, "documentations", null, 0, -1,
				Algo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ressourceEClass, Ressource.class, "Ressource", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRessource_Path(), ecorePackage.getEString(), "path", null, 1, 1, Ressource.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRessource_Algo(), this.getAlgo(), this.getAlgo_Ressource(), "algo", null, 1, 1,
				Ressource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fluxEClass, Flux.class, "Flux", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlux_Value(), ecorePackage.getEString(), "value", null, 1, 1, Flux.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlux_Type(), this.getDataType(), "type", null, 1, 1, Flux.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentableEClass, Documentable.class, "Documentable", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(documentationEClass, Documentation.class, "Documentation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentation_Commentaire(), ecorePackage.getEString(), "commentaire", null, 1, 1,
				Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentation_LinkToElement(), this.getDocumentable(), null, "linkToElement", null, 1, 1,
				Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dataTypeEEnum, DataType.class, "DataType");
		addEEnumLiteral(dataTypeEEnum, DataType.STRING);
		addEEnumLiteral(dataTypeEEnum, DataType.INT);
		addEEnumLiteral(dataTypeEEnum, DataType.BOOL);

		// Create resource
		createResource(eNS_URI);
	}

} //AlgoPackageImpl
