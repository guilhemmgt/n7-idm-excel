/**
 */
package schemaTable.impl;

import algo.Algo;
import algo.DataType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import schemaTable.Colonne;
import schemaTable.ContenuColonne;
import schemaTable.SchemaTablePackage;
import schemaTable.Tableau;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Colonne</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link schemaTable.impl.ColonneImpl#getName <em>Name</em>}</li>
 *   <li>{@link schemaTable.impl.ColonneImpl#getId <em>Id</em>}</li>
 *   <li>{@link schemaTable.impl.ColonneImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link schemaTable.impl.ColonneImpl#getContenu <em>Contenu</em>}</li>
 *   <li>{@link schemaTable.impl.ColonneImpl#getContraintes <em>Contraintes</em>}</li>
 *   <li>{@link schemaTable.impl.ColonneImpl#getTableau <em>Tableau</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColonneImpl extends MinimalEObjectImpl.Container implements Colonne {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final DataType DATA_TYPE_EDEFAULT = DataType.STRING;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected DataType dataType = DATA_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContenu() <em>Contenu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContenu()
	 * @generated
	 * @ordered
	 */
	protected ContenuColonne contenu;

	/**
	 * The cached value of the '{@link #getContraintes() <em>Contraintes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContraintes()
	 * @generated
	 * @ordered
	 */
	protected EList<Algo> contraintes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColonneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaTablePackage.Literals.COLONNE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaTablePackage.COLONNE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaTablePackage.COLONNE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataType(DataType newDataType) {
		DataType oldDataType = dataType;
		dataType = newDataType == null ? DATA_TYPE_EDEFAULT : newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaTablePackage.COLONNE__DATA_TYPE, oldDataType,
					dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContenuColonne getContenu() {
		return contenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContenu(ContenuColonne newContenu, NotificationChain msgs) {
		ContenuColonne oldContenu = contenu;
		contenu = newContenu;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SchemaTablePackage.COLONNE__CONTENU, oldContenu, newContenu);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContenu(ContenuColonne newContenu) {
		if (newContenu != contenu) {
			NotificationChain msgs = null;
			if (contenu != null)
				msgs = ((InternalEObject) contenu).eInverseRemove(this, SchemaTablePackage.CONTENU_COLONNE__COLONNE,
						ContenuColonne.class, msgs);
			if (newContenu != null)
				msgs = ((InternalEObject) newContenu).eInverseAdd(this, SchemaTablePackage.CONTENU_COLONNE__COLONNE,
						ContenuColonne.class, msgs);
			msgs = basicSetContenu(newContenu, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaTablePackage.COLONNE__CONTENU, newContenu,
					newContenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Algo> getContraintes() {
		if (contraintes == null) {
			contraintes = new EObjectResolvingEList<Algo>(Algo.class, this, SchemaTablePackage.COLONNE__CONTRAINTES);
		}
		return contraintes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tableau getTableau() {
		if (eContainerFeatureID() != SchemaTablePackage.COLONNE__TABLEAU)
			return null;
		return (Tableau) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableau(Tableau newTableau, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newTableau, SchemaTablePackage.COLONNE__TABLEAU, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableau(Tableau newTableau) {
		if (newTableau != eInternalContainer()
				|| (eContainerFeatureID() != SchemaTablePackage.COLONNE__TABLEAU && newTableau != null)) {
			if (EcoreUtil.isAncestor(this, newTableau))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTableau != null)
				msgs = ((InternalEObject) newTableau).eInverseAdd(this, SchemaTablePackage.TABLEAU__COLONNES,
						Tableau.class, msgs);
			msgs = basicSetTableau(newTableau, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaTablePackage.COLONNE__TABLEAU, newTableau,
					newTableau));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SchemaTablePackage.COLONNE__CONTENU:
			if (contenu != null)
				msgs = ((InternalEObject) contenu).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SchemaTablePackage.COLONNE__CONTENU, null, msgs);
			return basicSetContenu((ContenuColonne) otherEnd, msgs);
		case SchemaTablePackage.COLONNE__TABLEAU:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetTableau((Tableau) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SchemaTablePackage.COLONNE__CONTENU:
			return basicSetContenu(null, msgs);
		case SchemaTablePackage.COLONNE__TABLEAU:
			return basicSetTableau(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case SchemaTablePackage.COLONNE__TABLEAU:
			return eInternalContainer().eInverseRemove(this, SchemaTablePackage.TABLEAU__COLONNES, Tableau.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SchemaTablePackage.COLONNE__NAME:
			return getName();
		case SchemaTablePackage.COLONNE__ID:
			return getId();
		case SchemaTablePackage.COLONNE__DATA_TYPE:
			return getDataType();
		case SchemaTablePackage.COLONNE__CONTENU:
			return getContenu();
		case SchemaTablePackage.COLONNE__CONTRAINTES:
			return getContraintes();
		case SchemaTablePackage.COLONNE__TABLEAU:
			return getTableau();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SchemaTablePackage.COLONNE__NAME:
			setName((String) newValue);
			return;
		case SchemaTablePackage.COLONNE__ID:
			setId((String) newValue);
			return;
		case SchemaTablePackage.COLONNE__DATA_TYPE:
			setDataType((DataType) newValue);
			return;
		case SchemaTablePackage.COLONNE__CONTENU:
			setContenu((ContenuColonne) newValue);
			return;
		case SchemaTablePackage.COLONNE__CONTRAINTES:
			getContraintes().clear();
			getContraintes().addAll((Collection<? extends Algo>) newValue);
			return;
		case SchemaTablePackage.COLONNE__TABLEAU:
			setTableau((Tableau) newValue);
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
		case SchemaTablePackage.COLONNE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SchemaTablePackage.COLONNE__ID:
			setId(ID_EDEFAULT);
			return;
		case SchemaTablePackage.COLONNE__DATA_TYPE:
			setDataType(DATA_TYPE_EDEFAULT);
			return;
		case SchemaTablePackage.COLONNE__CONTENU:
			setContenu((ContenuColonne) null);
			return;
		case SchemaTablePackage.COLONNE__CONTRAINTES:
			getContraintes().clear();
			return;
		case SchemaTablePackage.COLONNE__TABLEAU:
			setTableau((Tableau) null);
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
		case SchemaTablePackage.COLONNE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SchemaTablePackage.COLONNE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case SchemaTablePackage.COLONNE__DATA_TYPE:
			return dataType != DATA_TYPE_EDEFAULT;
		case SchemaTablePackage.COLONNE__CONTENU:
			return contenu != null;
		case SchemaTablePackage.COLONNE__CONTRAINTES:
			return contraintes != null && !contraintes.isEmpty();
		case SchemaTablePackage.COLONNE__TABLEAU:
			return getTableau() != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", dataType: ");
		result.append(dataType);
		result.append(')');
		return result.toString();
	}

} //ColonneImpl
