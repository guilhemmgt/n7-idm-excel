/**
 */
package expression;

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
 * @see expression.ExpressionFactory
 * @model kind="package"
 * @generated
 */
public interface ExpressionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "expression";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/expression";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "expression";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExpressionPackage eINSTANCE = expression.impl.ExpressionPackageImpl.init();

	/**
	 * The meta object id for the '{@link expression.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expression.impl.ExpressionImpl
	 * @see expression.impl.ExpressionPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__NOM = 0;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ENTREE = 1;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__SORTIE = 2;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ELEMENTS = 3;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link expression.impl.ExpressionElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expression.impl.ExpressionElementImpl
	 * @see expression.impl.ExpressionPackageImpl#getExpressionElement()
	 * @generated
	 */
	int EXPRESSION_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ELEMENT__ENTREE = 0;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ELEMENT__SORTIE = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link expression.impl.FluxImpl <em>Flux</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expression.impl.FluxImpl
	 * @see expression.impl.ExpressionPackageImpl#getFlux()
	 * @generated
	 */
	int FLUX = 2;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUX__ENTREE = EXPRESSION_ELEMENT__ENTREE;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUX__SORTIE = EXPRESSION_ELEMENT__SORTIE;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUX__NOM = EXPRESSION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Flux</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUX_FEATURE_COUNT = EXPRESSION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Flux</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUX_OPERATION_COUNT = EXPRESSION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expression.impl.EntreeImpl <em>Entree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expression.impl.EntreeImpl
	 * @see expression.impl.ExpressionPackageImpl#getEntree()
	 * @generated
	 */
	int ENTREE = 3;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__ENTREE = FLUX__ENTREE;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__SORTIE = FLUX__SORTIE;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__NOM = FLUX__NOM;

	/**
	 * The number of structural features of the '<em>Entree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_FEATURE_COUNT = FLUX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_OPERATION_COUNT = FLUX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expression.impl.SortieImpl <em>Sortie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expression.impl.SortieImpl
	 * @see expression.impl.ExpressionPackageImpl#getSortie()
	 * @generated
	 */
	int SORTIE = 4;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE__ENTREE = FLUX__ENTREE;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE__SORTIE = FLUX__SORTIE;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE__NOM = FLUX__NOM;

	/**
	 * The number of structural features of the '<em>Sortie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE_FEATURE_COUNT = FLUX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sortie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE_OPERATION_COUNT = FLUX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expression.impl.OperationNullaireImpl <em>Operation Nullaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expression.impl.OperationNullaireImpl
	 * @see expression.impl.ExpressionPackageImpl#getOperationNullaire()
	 * @generated
	 */
	int OPERATION_NULLAIRE = 5;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_NULLAIRE__ENTREE = EXPRESSION_ELEMENT__ENTREE;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_NULLAIRE__SORTIE = EXPRESSION_ELEMENT__SORTIE;

	/**
	 * The number of structural features of the '<em>Operation Nullaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_NULLAIRE_FEATURE_COUNT = EXPRESSION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operation Nullaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_NULLAIRE_OPERATION_COUNT = EXPRESSION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expression.impl.ConstanteImpl <em>Constante</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expression.impl.ConstanteImpl
	 * @see expression.impl.ExpressionPackageImpl#getConstante()
	 * @generated
	 */
	int CONSTANTE = 6;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE__ENTREE = OPERATION_NULLAIRE__ENTREE;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE__SORTIE = OPERATION_NULLAIRE__SORTIE;

	/**
	 * The feature id for the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE__VALEUR = OPERATION_NULLAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE_FEATURE_COUNT = OPERATION_NULLAIRE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE_OPERATION_COUNT = OPERATION_NULLAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expression.impl.OperationUnaireImpl <em>Operation Unaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expression.impl.OperationUnaireImpl
	 * @see expression.impl.ExpressionPackageImpl#getOperationUnaire()
	 * @generated
	 */
	int OPERATION_UNAIRE = 7;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_UNAIRE__ENTREE = EXPRESSION_ELEMENT__ENTREE;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_UNAIRE__SORTIE = EXPRESSION_ELEMENT__SORTIE;

	/**
	 * The number of structural features of the '<em>Operation Unaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_UNAIRE_FEATURE_COUNT = EXPRESSION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operation Unaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_UNAIRE_OPERATION_COUNT = EXPRESSION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expression.impl.OpposeImpl <em>Oppose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expression.impl.OpposeImpl
	 * @see expression.impl.ExpressionPackageImpl#getOppose()
	 * @generated
	 */
	int OPPOSE = 8;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSE__ENTREE = OPERATION_UNAIRE__ENTREE;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSE__SORTIE = OPERATION_UNAIRE__SORTIE;

	/**
	 * The number of structural features of the '<em>Oppose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSE_FEATURE_COUNT = OPERATION_UNAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Oppose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSE_OPERATION_COUNT = OPERATION_UNAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expression.impl.InverseImpl <em>Inverse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expression.impl.InverseImpl
	 * @see expression.impl.ExpressionPackageImpl#getInverse()
	 * @generated
	 */
	int INVERSE = 9;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE__ENTREE = OPERATION_UNAIRE__ENTREE;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE__SORTIE = OPERATION_UNAIRE__SORTIE;

	/**
	 * The number of structural features of the '<em>Inverse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_FEATURE_COUNT = OPERATION_UNAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inverse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_OPERATION_COUNT = OPERATION_UNAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expression.impl.OperationBinaireImpl <em>Operation Binaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expression.impl.OperationBinaireImpl
	 * @see expression.impl.ExpressionPackageImpl#getOperationBinaire()
	 * @generated
	 */
	int OPERATION_BINAIRE = 10;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BINAIRE__ENTREE = EXPRESSION_ELEMENT__ENTREE;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BINAIRE__SORTIE = EXPRESSION_ELEMENT__SORTIE;

	/**
	 * The number of structural features of the '<em>Operation Binaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BINAIRE_FEATURE_COUNT = EXPRESSION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operation Binaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BINAIRE_OPERATION_COUNT = EXPRESSION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expression.impl.SoustractionImpl <em>Soustraction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expression.impl.SoustractionImpl
	 * @see expression.impl.ExpressionPackageImpl#getSoustraction()
	 * @generated
	 */
	int SOUSTRACTION = 11;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUSTRACTION__ENTREE = OPERATION_BINAIRE__ENTREE;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUSTRACTION__SORTIE = OPERATION_BINAIRE__SORTIE;

	/**
	 * The number of structural features of the '<em>Soustraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUSTRACTION_FEATURE_COUNT = OPERATION_BINAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Soustraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUSTRACTION_OPERATION_COUNT = OPERATION_BINAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expression.impl.AdditionImpl <em>Addition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expression.impl.AdditionImpl
	 * @see expression.impl.ExpressionPackageImpl#getAddition()
	 * @generated
	 */
	int ADDITION = 12;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__ENTREE = OPERATION_BINAIRE__ENTREE;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__SORTIE = OPERATION_BINAIRE__SORTIE;

	/**
	 * The number of structural features of the '<em>Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_FEATURE_COUNT = OPERATION_BINAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_OPERATION_COUNT = OPERATION_BINAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expression.impl.DivisionImpl <em>Division</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expression.impl.DivisionImpl
	 * @see expression.impl.ExpressionPackageImpl#getDivision()
	 * @generated
	 */
	int DIVISION = 13;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__ENTREE = OPERATION_BINAIRE__ENTREE;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__SORTIE = OPERATION_BINAIRE__SORTIE;

	/**
	 * The number of structural features of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_FEATURE_COUNT = OPERATION_BINAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_OPERATION_COUNT = OPERATION_BINAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expression.impl.MultiplicationImpl <em>Multiplication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expression.impl.MultiplicationImpl
	 * @see expression.impl.ExpressionPackageImpl#getMultiplication()
	 * @generated
	 */
	int MULTIPLICATION = 14;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__ENTREE = OPERATION_BINAIRE__ENTREE;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__SORTIE = OPERATION_BINAIRE__SORTIE;

	/**
	 * The number of structural features of the '<em>Multiplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION_FEATURE_COUNT = OPERATION_BINAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multiplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION_OPERATION_COUNT = OPERATION_BINAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expression.impl.MinimumImpl <em>Minimum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expression.impl.MinimumImpl
	 * @see expression.impl.ExpressionPackageImpl#getMinimum()
	 * @generated
	 */
	int MINIMUM = 15;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUM__ENTREE = OPERATION_BINAIRE__ENTREE;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUM__SORTIE = OPERATION_BINAIRE__SORTIE;

	/**
	 * The number of structural features of the '<em>Minimum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUM_FEATURE_COUNT = OPERATION_BINAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Minimum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUM_OPERATION_COUNT = OPERATION_BINAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link expression.impl.MaximumImpl <em>Maximum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expression.impl.MaximumImpl
	 * @see expression.impl.ExpressionPackageImpl#getMaximum()
	 * @generated
	 */
	int MAXIMUM = 16;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMUM__ENTREE = OPERATION_BINAIRE__ENTREE;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMUM__SORTIE = OPERATION_BINAIRE__SORTIE;

	/**
	 * The number of structural features of the '<em>Maximum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMUM_FEATURE_COUNT = OPERATION_BINAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Maximum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMUM_OPERATION_COUNT = OPERATION_BINAIRE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link expression.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see expression.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the attribute '{@link expression.Expression#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see expression.Expression#getNom()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Nom();

	/**
	 * Returns the meta object for the reference list '{@link expression.Expression#getEntree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entree</em>'.
	 * @see expression.Expression#getEntree()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Entree();

	/**
	 * Returns the meta object for the reference '{@link expression.Expression#getSortie <em>Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sortie</em>'.
	 * @see expression.Expression#getSortie()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Sortie();

	/**
	 * Returns the meta object for the containment reference list '{@link expression.Expression#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see expression.Expression#getElements()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Elements();

	/**
	 * Returns the meta object for class '{@link expression.ExpressionElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see expression.ExpressionElement
	 * @generated
	 */
	EClass getExpressionElement();

	/**
	 * Returns the meta object for the reference list '{@link expression.ExpressionElement#getEntree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entree</em>'.
	 * @see expression.ExpressionElement#getEntree()
	 * @see #getExpressionElement()
	 * @generated
	 */
	EReference getExpressionElement_Entree();

	/**
	 * Returns the meta object for the reference '{@link expression.ExpressionElement#getSortie <em>Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sortie</em>'.
	 * @see expression.ExpressionElement#getSortie()
	 * @see #getExpressionElement()
	 * @generated
	 */
	EReference getExpressionElement_Sortie();

	/**
	 * Returns the meta object for class '{@link expression.Flux <em>Flux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flux</em>'.
	 * @see expression.Flux
	 * @generated
	 */
	EClass getFlux();

	/**
	 * Returns the meta object for the attribute '{@link expression.Flux#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see expression.Flux#getNom()
	 * @see #getFlux()
	 * @generated
	 */
	EAttribute getFlux_Nom();

	/**
	 * Returns the meta object for class '{@link expression.Entree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entree</em>'.
	 * @see expression.Entree
	 * @generated
	 */
	EClass getEntree();

	/**
	 * Returns the meta object for class '{@link expression.Sortie <em>Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sortie</em>'.
	 * @see expression.Sortie
	 * @generated
	 */
	EClass getSortie();

	/**
	 * Returns the meta object for class '{@link expression.OperationNullaire <em>Operation Nullaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Nullaire</em>'.
	 * @see expression.OperationNullaire
	 * @generated
	 */
	EClass getOperationNullaire();

	/**
	 * Returns the meta object for class '{@link expression.Constante <em>Constante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constante</em>'.
	 * @see expression.Constante
	 * @generated
	 */
	EClass getConstante();

	/**
	 * Returns the meta object for the attribute '{@link expression.Constante#getValeur <em>Valeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valeur</em>'.
	 * @see expression.Constante#getValeur()
	 * @see #getConstante()
	 * @generated
	 */
	EAttribute getConstante_Valeur();

	/**
	 * Returns the meta object for class '{@link expression.OperationUnaire <em>Operation Unaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Unaire</em>'.
	 * @see expression.OperationUnaire
	 * @generated
	 */
	EClass getOperationUnaire();

	/**
	 * Returns the meta object for class '{@link expression.Oppose <em>Oppose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oppose</em>'.
	 * @see expression.Oppose
	 * @generated
	 */
	EClass getOppose();

	/**
	 * Returns the meta object for class '{@link expression.Inverse <em>Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inverse</em>'.
	 * @see expression.Inverse
	 * @generated
	 */
	EClass getInverse();

	/**
	 * Returns the meta object for class '{@link expression.OperationBinaire <em>Operation Binaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Binaire</em>'.
	 * @see expression.OperationBinaire
	 * @generated
	 */
	EClass getOperationBinaire();

	/**
	 * Returns the meta object for class '{@link expression.Soustraction <em>Soustraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Soustraction</em>'.
	 * @see expression.Soustraction
	 * @generated
	 */
	EClass getSoustraction();

	/**
	 * Returns the meta object for class '{@link expression.Addition <em>Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addition</em>'.
	 * @see expression.Addition
	 * @generated
	 */
	EClass getAddition();

	/**
	 * Returns the meta object for class '{@link expression.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Division</em>'.
	 * @see expression.Division
	 * @generated
	 */
	EClass getDivision();

	/**
	 * Returns the meta object for class '{@link expression.Multiplication <em>Multiplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplication</em>'.
	 * @see expression.Multiplication
	 * @generated
	 */
	EClass getMultiplication();

	/**
	 * Returns the meta object for class '{@link expression.Minimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minimum</em>'.
	 * @see expression.Minimum
	 * @generated
	 */
	EClass getMinimum();

	/**
	 * Returns the meta object for class '{@link expression.Maximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maximum</em>'.
	 * @see expression.Maximum
	 * @generated
	 */
	EClass getMaximum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExpressionFactory getExpressionFactory();

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
		 * The meta object literal for the '{@link expression.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expression.impl.ExpressionImpl
		 * @see expression.impl.ExpressionPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__NOM = eINSTANCE.getExpression_Nom();

		/**
		 * The meta object literal for the '<em><b>Entree</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__ENTREE = eINSTANCE.getExpression_Entree();

		/**
		 * The meta object literal for the '<em><b>Sortie</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__SORTIE = eINSTANCE.getExpression_Sortie();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__ELEMENTS = eINSTANCE.getExpression_Elements();

		/**
		 * The meta object literal for the '{@link expression.impl.ExpressionElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expression.impl.ExpressionElementImpl
		 * @see expression.impl.ExpressionPackageImpl#getExpressionElement()
		 * @generated
		 */
		EClass EXPRESSION_ELEMENT = eINSTANCE.getExpressionElement();

		/**
		 * The meta object literal for the '<em><b>Entree</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_ELEMENT__ENTREE = eINSTANCE.getExpressionElement_Entree();

		/**
		 * The meta object literal for the '<em><b>Sortie</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_ELEMENT__SORTIE = eINSTANCE.getExpressionElement_Sortie();

		/**
		 * The meta object literal for the '{@link expression.impl.FluxImpl <em>Flux</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expression.impl.FluxImpl
		 * @see expression.impl.ExpressionPackageImpl#getFlux()
		 * @generated
		 */
		EClass FLUX = eINSTANCE.getFlux();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLUX__NOM = eINSTANCE.getFlux_Nom();

		/**
		 * The meta object literal for the '{@link expression.impl.EntreeImpl <em>Entree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expression.impl.EntreeImpl
		 * @see expression.impl.ExpressionPackageImpl#getEntree()
		 * @generated
		 */
		EClass ENTREE = eINSTANCE.getEntree();

		/**
		 * The meta object literal for the '{@link expression.impl.SortieImpl <em>Sortie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expression.impl.SortieImpl
		 * @see expression.impl.ExpressionPackageImpl#getSortie()
		 * @generated
		 */
		EClass SORTIE = eINSTANCE.getSortie();

		/**
		 * The meta object literal for the '{@link expression.impl.OperationNullaireImpl <em>Operation Nullaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expression.impl.OperationNullaireImpl
		 * @see expression.impl.ExpressionPackageImpl#getOperationNullaire()
		 * @generated
		 */
		EClass OPERATION_NULLAIRE = eINSTANCE.getOperationNullaire();

		/**
		 * The meta object literal for the '{@link expression.impl.ConstanteImpl <em>Constante</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expression.impl.ConstanteImpl
		 * @see expression.impl.ExpressionPackageImpl#getConstante()
		 * @generated
		 */
		EClass CONSTANTE = eINSTANCE.getConstante();

		/**
		 * The meta object literal for the '<em><b>Valeur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANTE__VALEUR = eINSTANCE.getConstante_Valeur();

		/**
		 * The meta object literal for the '{@link expression.impl.OperationUnaireImpl <em>Operation Unaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expression.impl.OperationUnaireImpl
		 * @see expression.impl.ExpressionPackageImpl#getOperationUnaire()
		 * @generated
		 */
		EClass OPERATION_UNAIRE = eINSTANCE.getOperationUnaire();

		/**
		 * The meta object literal for the '{@link expression.impl.OpposeImpl <em>Oppose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expression.impl.OpposeImpl
		 * @see expression.impl.ExpressionPackageImpl#getOppose()
		 * @generated
		 */
		EClass OPPOSE = eINSTANCE.getOppose();

		/**
		 * The meta object literal for the '{@link expression.impl.InverseImpl <em>Inverse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expression.impl.InverseImpl
		 * @see expression.impl.ExpressionPackageImpl#getInverse()
		 * @generated
		 */
		EClass INVERSE = eINSTANCE.getInverse();

		/**
		 * The meta object literal for the '{@link expression.impl.OperationBinaireImpl <em>Operation Binaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expression.impl.OperationBinaireImpl
		 * @see expression.impl.ExpressionPackageImpl#getOperationBinaire()
		 * @generated
		 */
		EClass OPERATION_BINAIRE = eINSTANCE.getOperationBinaire();

		/**
		 * The meta object literal for the '{@link expression.impl.SoustractionImpl <em>Soustraction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expression.impl.SoustractionImpl
		 * @see expression.impl.ExpressionPackageImpl#getSoustraction()
		 * @generated
		 */
		EClass SOUSTRACTION = eINSTANCE.getSoustraction();

		/**
		 * The meta object literal for the '{@link expression.impl.AdditionImpl <em>Addition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expression.impl.AdditionImpl
		 * @see expression.impl.ExpressionPackageImpl#getAddition()
		 * @generated
		 */
		EClass ADDITION = eINSTANCE.getAddition();

		/**
		 * The meta object literal for the '{@link expression.impl.DivisionImpl <em>Division</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expression.impl.DivisionImpl
		 * @see expression.impl.ExpressionPackageImpl#getDivision()
		 * @generated
		 */
		EClass DIVISION = eINSTANCE.getDivision();

		/**
		 * The meta object literal for the '{@link expression.impl.MultiplicationImpl <em>Multiplication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expression.impl.MultiplicationImpl
		 * @see expression.impl.ExpressionPackageImpl#getMultiplication()
		 * @generated
		 */
		EClass MULTIPLICATION = eINSTANCE.getMultiplication();

		/**
		 * The meta object literal for the '{@link expression.impl.MinimumImpl <em>Minimum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expression.impl.MinimumImpl
		 * @see expression.impl.ExpressionPackageImpl#getMinimum()
		 * @generated
		 */
		EClass MINIMUM = eINSTANCE.getMinimum();

		/**
		 * The meta object literal for the '{@link expression.impl.MaximumImpl <em>Maximum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expression.impl.MaximumImpl
		 * @see expression.impl.ExpressionPackageImpl#getMaximum()
		 * @generated
		 */
		EClass MAXIMUM = eINSTANCE.getMaximum();

	}

} //ExpressionPackage
