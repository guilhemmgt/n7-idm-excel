/**
 */
package schemaTable.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import schemaTable.ImportTable;
import schemaTable.SchemaTablePackage;
import schemaTable.Tableau;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link schemaTable.impl.ImportTableImpl#getTable <em>Table</em>}</li>
 *   <li>{@link schemaTable.impl.ImportTableImpl#getIdColumn <em>Id Column</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportTableImpl extends ContenuColonneImpl implements ImportTable {
	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected Tableau table;

	/**
	 * The default value of the '{@link #getIdColumn() <em>Id Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdColumn()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_COLUMN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdColumn() <em>Id Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdColumn()
	 * @generated
	 * @ordered
	 */
	protected String idColumn = ID_COLUMN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaTablePackage.Literals.IMPORT_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tableau getTable() {
		if (table != null && table.eIsProxy()) {
			InternalEObject oldTable = (InternalEObject) table;
			table = (Tableau) eResolveProxy(oldTable);
			if (table != oldTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchemaTablePackage.IMPORT_TABLE__TABLE,
							oldTable, table));
			}
		}
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tableau basicGetTable() {
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTable(Tableau newTable) {
		Tableau oldTable = table;
		table = newTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaTablePackage.IMPORT_TABLE__TABLE, oldTable,
					table));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdColumn() {
		return idColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdColumn(String newIdColumn) {
		String oldIdColumn = idColumn;
		idColumn = newIdColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaTablePackage.IMPORT_TABLE__ID_COLUMN,
					oldIdColumn, idColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SchemaTablePackage.IMPORT_TABLE__TABLE:
			if (resolve)
				return getTable();
			return basicGetTable();
		case SchemaTablePackage.IMPORT_TABLE__ID_COLUMN:
			return getIdColumn();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SchemaTablePackage.IMPORT_TABLE__TABLE:
			setTable((Tableau) newValue);
			return;
		case SchemaTablePackage.IMPORT_TABLE__ID_COLUMN:
			setIdColumn((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SchemaTablePackage.IMPORT_TABLE__TABLE:
			setTable((Tableau) null);
			return;
		case SchemaTablePackage.IMPORT_TABLE__ID_COLUMN:
			setIdColumn(ID_COLUMN_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SchemaTablePackage.IMPORT_TABLE__TABLE:
			return table != null;
		case SchemaTablePackage.IMPORT_TABLE__ID_COLUMN:
			return ID_COLUMN_EDEFAULT == null ? idColumn != null : !ID_COLUMN_EDEFAULT.equals(idColumn);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (idColumn: ");
		result.append(idColumn);
		result.append(')');
		return result.toString();
	}

} //ImportTableImpl
