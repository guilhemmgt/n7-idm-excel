/**
 */
package algo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ressource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algo.Ressource#getPath <em>Path</em>}</li>
 *   <li>{@link algo.Ressource#getAlgo <em>Algo</em>}</li>
 * </ul>
 *
 * @see algo.AlgoPackage#getRessource()
 * @model
 * @generated
 */
public interface Ressource extends Documentable {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see algo.AlgoPackage#getRessource_Path()
	 * @model required="true"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link algo.Ressource#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Algo</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link algo.Algo#getRessource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algo</em>' container reference.
	 * @see #setAlgo(Algo)
	 * @see algo.AlgoPackage#getRessource_Algo()
	 * @see algo.Algo#getRessource
	 * @model opposite="ressource" required="true" transient="false"
	 * @generated
	 */
	Algo getAlgo();

	/**
	 * Sets the value of the '{@link algo.Ressource#getAlgo <em>Algo</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algo</em>' container reference.
	 * @see #getAlgo()
	 * @generated
	 */
	void setAlgo(Algo value);

} // Ressource
