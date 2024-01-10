/**
 */
package schemaTable.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import schemaTable.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see schemaTable.SchemaTablePackage
 * @generated
 */
public class SchemaTableAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SchemaTablePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaTableAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SchemaTablePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaTableSwitch<Adapter> modelSwitch = new SchemaTableSwitch<Adapter>() {
		@Override
		public Adapter caseTableau(Tableau object) {
			return createTableauAdapter();
		}

		@Override
		public Adapter caseColonne(Colonne object) {
			return createColonneAdapter();
		}

		@Override
		public Adapter caseContenuColonne(ContenuColonne object) {
			return createContenuColonneAdapter();
		}

		@Override
		public Adapter caseAppelAlgo(AppelAlgo object) {
			return createAppelAlgoAdapter();
		}

		@Override
		public Adapter caseImportTable(ImportTable object) {
			return createImportTableAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link schemaTable.Tableau <em>Tableau</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see schemaTable.Tableau
	 * @generated
	 */
	public Adapter createTableauAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link schemaTable.Colonne <em>Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see schemaTable.Colonne
	 * @generated
	 */
	public Adapter createColonneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link schemaTable.ContenuColonne <em>Contenu Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see schemaTable.ContenuColonne
	 * @generated
	 */
	public Adapter createContenuColonneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link schemaTable.AppelAlgo <em>Appel Algo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see schemaTable.AppelAlgo
	 * @generated
	 */
	public Adapter createAppelAlgoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link schemaTable.ImportTable <em>Import Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see schemaTable.ImportTable
	 * @generated
	 */
	public Adapter createImportTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SchemaTableAdapterFactory
