/**
 */
package algo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see algo.AlgoFactory
 * @model kind="package"
 * @generated
 */
public interface AlgoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "algo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/algo";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "algo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AlgoPackage eINSTANCE = algo.impl.AlgoPackageImpl.init();

	/**
	 * The meta object id for the '{@link algo.impl.DocumentableImpl <em>Documentable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algo.impl.DocumentableImpl
	 * @see algo.impl.AlgoPackageImpl#getDocumentable()
	 * @generated
	 */
	int DOCUMENTABLE = 3;

	/**
	 * The number of structural features of the '<em>Documentable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Documentable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link algo.impl.AlgoImpl <em>Algo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algo.impl.AlgoImpl
	 * @see algo.impl.AlgoPackageImpl#getAlgo()
	 * @generated
	 */
	int ALGO = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO__NAME = DOCUMENTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ressource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO__RESSOURCE = DOCUMENTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO__OUTPUT = DOCUMENTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO__INPUT = DOCUMENTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO__DOCUMENTATIONS = DOCUMENTABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Algo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO_FEATURE_COUNT = DOCUMENTABLE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Algo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO_OPERATION_COUNT = DOCUMENTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link algo.impl.RessourceImpl <em>Ressource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algo.impl.RessourceImpl
	 * @see algo.impl.AlgoPackageImpl#getRessource()
	 * @generated
	 */
	int RESSOURCE = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__PATH = DOCUMENTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Algo</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__ALGO = DOCUMENTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_FEATURE_COUNT = DOCUMENTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_OPERATION_COUNT = DOCUMENTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link algo.impl.FluxImpl <em>Flux</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algo.impl.FluxImpl
	 * @see algo.impl.AlgoPackageImpl#getFlux()
	 * @generated
	 */
	int FLUX = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUX__VALUE = DOCUMENTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUX__TYPE = DOCUMENTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Flux</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUX_FEATURE_COUNT = DOCUMENTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Flux</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUX_OPERATION_COUNT = DOCUMENTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link algo.impl.DocumentationImpl <em>Documentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algo.impl.DocumentationImpl
	 * @see algo.impl.AlgoPackageImpl#getDocumentation()
	 * @generated
	 */
	int DOCUMENTATION = 4;

	/**
	 * The feature id for the '<em><b>Commentaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__COMMENTAIRE = 0;

	/**
	 * The feature id for the '<em><b>Link To Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__LINK_TO_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link algo.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algo.DataType
	 * @see algo.impl.AlgoPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 5;

	/**
	 * Returns the meta object for class '{@link algo.Algo <em>Algo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Algo</em>'.
	 * @see algo.Algo
	 * @generated
	 */
	EClass getAlgo();

	/**
	 * Returns the meta object for the attribute '{@link algo.Algo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see algo.Algo#getName()
	 * @see #getAlgo()
	 * @generated
	 */
	EAttribute getAlgo_Name();

	/**
	 * Returns the meta object for the containment reference '{@link algo.Algo#getRessource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ressource</em>'.
	 * @see algo.Algo#getRessource()
	 * @see #getAlgo()
	 * @generated
	 */
	EReference getAlgo_Ressource();

	/**
	 * Returns the meta object for the containment reference '{@link algo.Algo#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see algo.Algo#getOutput()
	 * @see #getAlgo()
	 * @generated
	 */
	EReference getAlgo_Output();

	/**
	 * Returns the meta object for the containment reference list '{@link algo.Algo#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see algo.Algo#getInput()
	 * @see #getAlgo()
	 * @generated
	 */
	EReference getAlgo_Input();

	/**
	 * Returns the meta object for the containment reference list '{@link algo.Algo#getDocumentations <em>Documentations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentations</em>'.
	 * @see algo.Algo#getDocumentations()
	 * @see #getAlgo()
	 * @generated
	 */
	EReference getAlgo_Documentations();

	/**
	 * Returns the meta object for class '{@link algo.Ressource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ressource</em>'.
	 * @see algo.Ressource
	 * @generated
	 */
	EClass getRessource();

	/**
	 * Returns the meta object for the attribute '{@link algo.Ressource#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see algo.Ressource#getPath()
	 * @see #getRessource()
	 * @generated
	 */
	EAttribute getRessource_Path();

	/**
	 * Returns the meta object for the container reference '{@link algo.Ressource#getAlgo <em>Algo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Algo</em>'.
	 * @see algo.Ressource#getAlgo()
	 * @see #getRessource()
	 * @generated
	 */
	EReference getRessource_Algo();

	/**
	 * Returns the meta object for class '{@link algo.Flux <em>Flux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flux</em>'.
	 * @see algo.Flux
	 * @generated
	 */
	EClass getFlux();

	/**
	 * Returns the meta object for the attribute '{@link algo.Flux#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see algo.Flux#getValue()
	 * @see #getFlux()
	 * @generated
	 */
	EAttribute getFlux_Value();

	/**
	 * Returns the meta object for the attribute '{@link algo.Flux#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see algo.Flux#getType()
	 * @see #getFlux()
	 * @generated
	 */
	EAttribute getFlux_Type();

	/**
	 * Returns the meta object for class '{@link algo.Documentable <em>Documentable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentable</em>'.
	 * @see algo.Documentable
	 * @generated
	 */
	EClass getDocumentable();

	/**
	 * Returns the meta object for class '{@link algo.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation</em>'.
	 * @see algo.Documentation
	 * @generated
	 */
	EClass getDocumentation();

	/**
	 * Returns the meta object for the attribute '{@link algo.Documentation#getCommentaire <em>Commentaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commentaire</em>'.
	 * @see algo.Documentation#getCommentaire()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Commentaire();

	/**
	 * Returns the meta object for the reference '{@link algo.Documentation#getLinkToElement <em>Link To Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link To Element</em>'.
	 * @see algo.Documentation#getLinkToElement()
	 * @see #getDocumentation()
	 * @generated
	 */
	EReference getDocumentation_LinkToElement();

	/**
	 * Returns the meta object for enum '{@link algo.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see algo.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AlgoFactory getAlgoFactory();

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
		 * The meta object literal for the '{@link algo.impl.AlgoImpl <em>Algo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algo.impl.AlgoImpl
		 * @see algo.impl.AlgoPackageImpl#getAlgo()
		 * @generated
		 */
		EClass ALGO = eINSTANCE.getAlgo();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALGO__NAME = eINSTANCE.getAlgo_Name();

		/**
		 * The meta object literal for the '<em><b>Ressource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGO__RESSOURCE = eINSTANCE.getAlgo_Ressource();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGO__OUTPUT = eINSTANCE.getAlgo_Output();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGO__INPUT = eINSTANCE.getAlgo_Input();

		/**
		 * The meta object literal for the '<em><b>Documentations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGO__DOCUMENTATIONS = eINSTANCE.getAlgo_Documentations();

		/**
		 * The meta object literal for the '{@link algo.impl.RessourceImpl <em>Ressource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algo.impl.RessourceImpl
		 * @see algo.impl.AlgoPackageImpl#getRessource()
		 * @generated
		 */
		EClass RESSOURCE = eINSTANCE.getRessource();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESSOURCE__PATH = eINSTANCE.getRessource_Path();

		/**
		 * The meta object literal for the '<em><b>Algo</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESSOURCE__ALGO = eINSTANCE.getRessource_Algo();

		/**
		 * The meta object literal for the '{@link algo.impl.FluxImpl <em>Flux</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algo.impl.FluxImpl
		 * @see algo.impl.AlgoPackageImpl#getFlux()
		 * @generated
		 */
		EClass FLUX = eINSTANCE.getFlux();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLUX__VALUE = eINSTANCE.getFlux_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLUX__TYPE = eINSTANCE.getFlux_Type();

		/**
		 * The meta object literal for the '{@link algo.impl.DocumentableImpl <em>Documentable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algo.impl.DocumentableImpl
		 * @see algo.impl.AlgoPackageImpl#getDocumentable()
		 * @generated
		 */
		EClass DOCUMENTABLE = eINSTANCE.getDocumentable();

		/**
		 * The meta object literal for the '{@link algo.impl.DocumentationImpl <em>Documentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algo.impl.DocumentationImpl
		 * @see algo.impl.AlgoPackageImpl#getDocumentation()
		 * @generated
		 */
		EClass DOCUMENTATION = eINSTANCE.getDocumentation();

		/**
		 * The meta object literal for the '<em><b>Commentaire</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__COMMENTAIRE = eINSTANCE.getDocumentation_Commentaire();

		/**
		 * The meta object literal for the '<em><b>Link To Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTATION__LINK_TO_ELEMENT = eINSTANCE.getDocumentation_LinkToElement();

		/**
		 * The meta object literal for the '{@link algo.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algo.DataType
		 * @see algo.impl.AlgoPackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

	}

} //AlgoPackage
