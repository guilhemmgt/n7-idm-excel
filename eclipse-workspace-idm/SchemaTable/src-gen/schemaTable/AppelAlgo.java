/**
 */
package schemaTable;

import algo.Algo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Appel Algo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link schemaTable.AppelAlgo#getAlgo <em>Algo</em>}</li>
 *   <li>{@link schemaTable.AppelAlgo#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see schemaTable.SchemaTablePackage#getAppelAlgo()
 * @model
 * @generated
 */
public interface AppelAlgo extends ContenuColonne {
	/**
	 * Returns the value of the '<em><b>Algo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algo</em>' reference.
	 * @see #setAlgo(Algo)
	 * @see schemaTable.SchemaTablePackage#getAppelAlgo_Algo()
	 * @model required="true"
	 * @generated
	 */
	Algo getAlgo();

	/**
	 * Sets the value of the '{@link schemaTable.AppelAlgo#getAlgo <em>Algo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algo</em>' reference.
	 * @see #getAlgo()
	 * @generated
	 */
	void setAlgo(Algo value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link schemaTable.Colonne}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see schemaTable.SchemaTablePackage#getAppelAlgo_Input()
	 * @model
	 * @generated
	 */
	EList<Colonne> getInput();

} // AppelAlgo
