/**
 */
package schemaTable.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import schemaTable.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SchemaTableFactoryImpl extends EFactoryImpl implements SchemaTableFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SchemaTableFactory init() {
		try {
			SchemaTableFactory theSchemaTableFactory = (SchemaTableFactory) EPackage.Registry.INSTANCE
					.getEFactory(SchemaTablePackage.eNS_URI);
			if (theSchemaTableFactory != null) {
				return theSchemaTableFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SchemaTableFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaTableFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SchemaTablePackage.TABLEAU:
			return createTableau();
		case SchemaTablePackage.COLONNE:
			return createColonne();
		case SchemaTablePackage.APPEL_ALGO:
			return createAppelAlgo();
		case SchemaTablePackage.IMPORT_TABLE:
			return createImportTable();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tableau createTableau() {
		TableauImpl tableau = new TableauImpl();
		return tableau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Colonne createColonne() {
		ColonneImpl colonne = new ColonneImpl();
		return colonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AppelAlgo createAppelAlgo() {
		AppelAlgoImpl appelAlgo = new AppelAlgoImpl();
		return appelAlgo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImportTable createImportTable() {
		ImportTableImpl importTable = new ImportTableImpl();
		return importTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchemaTablePackage getSchemaTablePackage() {
		return (SchemaTablePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SchemaTablePackage getPackage() {
		return SchemaTablePackage.eINSTANCE;
	}

} //SchemaTableFactoryImpl
