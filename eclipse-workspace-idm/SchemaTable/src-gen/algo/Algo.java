/**
 */
package algo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Algo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algo.Algo#getName <em>Name</em>}</li>
 *   <li>{@link algo.Algo#getRessource <em>Ressource</em>}</li>
 *   <li>{@link algo.Algo#getOutput <em>Output</em>}</li>
 *   <li>{@link algo.Algo#getInput <em>Input</em>}</li>
 *   <li>{@link algo.Algo#getDocumentations <em>Documentations</em>}</li>
 * </ul>
 *
 * @see algo.AlgoPackage#getAlgo()
 * @model
 * @generated
 */
public interface Algo extends Documentable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see algo.AlgoPackage#getAlgo_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link algo.Algo#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ressource</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link algo.Ressource#getAlgo <em>Algo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressource</em>' containment reference.
	 * @see #setRessource(Ressource)
	 * @see algo.AlgoPackage#getAlgo_Ressource()
	 * @see algo.Ressource#getAlgo
	 * @model opposite="algo" containment="true" required="true"
	 * @generated
	 */
	Ressource getRessource();

	/**
	 * Sets the value of the '{@link algo.Algo#getRessource <em>Ressource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ressource</em>' containment reference.
	 * @see #getRessource()
	 * @generated
	 */
	void setRessource(Ressource value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference.
	 * @see #setOutput(Flux)
	 * @see algo.AlgoPackage#getAlgo_Output()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Flux getOutput();

	/**
	 * Sets the value of the '{@link algo.Algo#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Flux value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link algo.Flux}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see algo.AlgoPackage#getAlgo_Input()
	 * @model containment="true"
	 * @generated
	 */
	EList<Flux> getInput();

	/**
	 * Returns the value of the '<em><b>Documentations</b></em>' containment reference list.
	 * The list contents are of type {@link algo.Documentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentations</em>' containment reference list.
	 * @see algo.AlgoPackage#getAlgo_Documentations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Documentation> getDocumentations();

} // Algo
