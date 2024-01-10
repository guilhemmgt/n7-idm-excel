/**
 */
package schemaTable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link schemaTable.ImportTable#getTable <em>Table</em>}</li>
 *   <li>{@link schemaTable.ImportTable#getIdColumn <em>Id Column</em>}</li>
 * </ul>
 *
 * @see schemaTable.SchemaTablePackage#getImportTable()
 * @model
 * @generated
 */
public interface ImportTable extends ContenuColonne {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' reference.
	 * @see #setTable(Tableau)
	 * @see schemaTable.SchemaTablePackage#getImportTable_Table()
	 * @model required="true"
	 * @generated
	 */
	Tableau getTable();

	/**
	 * Sets the value of the '{@link schemaTable.ImportTable#getTable <em>Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(Tableau value);

	/**
	 * Returns the value of the '<em><b>Id Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Column</em>' attribute.
	 * @see #setIdColumn(String)
	 * @see schemaTable.SchemaTablePackage#getImportTable_IdColumn()
	 * @model required="true"
	 * @generated
	 */
	String getIdColumn();

	/**
	 * Sets the value of the '{@link schemaTable.ImportTable#getIdColumn <em>Id Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Column</em>' attribute.
	 * @see #getIdColumn()
	 * @generated
	 */
	void setIdColumn(String value);

} // ImportTable
