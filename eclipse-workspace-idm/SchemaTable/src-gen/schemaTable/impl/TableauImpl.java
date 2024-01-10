/**
 */
package schemaTable.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import schemaTable.Colonne;
import schemaTable.SchemaTablePackage;
import schemaTable.Tableau;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tableau</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link schemaTable.impl.TableauImpl#getName <em>Name</em>}</li>
 *   <li>{@link schemaTable.impl.TableauImpl#getColonneLignes <em>Colonne Lignes</em>}</li>
 *   <li>{@link schemaTable.impl.TableauImpl#getColonnes <em>Colonnes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableauImpl extends MinimalEObjectImpl.Container implements Tableau {
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
	 * The cached value of the '{@link #getColonneLignes() <em>Colonne Lignes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColonneLignes()
	 * @generated
	 * @ordered
	 */
	protected Colonne colonneLignes;

	/**
	 * The cached value of the '{@link #getColonnes() <em>Colonnes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColonnes()
	 * @generated
	 * @ordered
	 */
	protected EList<Colonne> colonnes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableauImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaTablePackage.Literals.TABLEAU;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaTablePackage.TABLEAU__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Colonne getColonneLignes() {
		if (colonneLignes != null && colonneLignes.eIsProxy()) {
			InternalEObject oldColonneLignes = (InternalEObject) colonneLignes;
			colonneLignes = (Colonne) eResolveProxy(oldColonneLignes);
			if (colonneLignes != oldColonneLignes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SchemaTablePackage.TABLEAU__COLONNE_LIGNES, oldColonneLignes, colonneLignes));
			}
		}
		return colonneLignes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Colonne basicGetColonneLignes() {
		return colonneLignes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColonneLignes(Colonne newColonneLignes) {
		Colonne oldColonneLignes = colonneLignes;
		colonneLignes = newColonneLignes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaTablePackage.TABLEAU__COLONNE_LIGNES,
					oldColonneLignes, colonneLignes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Colonne> getColonnes() {
		if (colonnes == null) {
			colonnes = new EObjectContainmentWithInverseEList<Colonne>(Colonne.class, this,
					SchemaTablePackage.TABLEAU__COLONNES, SchemaTablePackage.COLONNE__TABLEAU);
		}
		return colonnes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SchemaTablePackage.TABLEAU__COLONNES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getColonnes()).basicAdd(otherEnd, msgs);
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
		case SchemaTablePackage.TABLEAU__COLONNES:
			return ((InternalEList<?>) getColonnes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SchemaTablePackage.TABLEAU__NAME:
			return getName();
		case SchemaTablePackage.TABLEAU__COLONNE_LIGNES:
			if (resolve)
				return getColonneLignes();
			return basicGetColonneLignes();
		case SchemaTablePackage.TABLEAU__COLONNES:
			return getColonnes();
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
		case SchemaTablePackage.TABLEAU__NAME:
			setName((String) newValue);
			return;
		case SchemaTablePackage.TABLEAU__COLONNE_LIGNES:
			setColonneLignes((Colonne) newValue);
			return;
		case SchemaTablePackage.TABLEAU__COLONNES:
			getColonnes().clear();
			getColonnes().addAll((Collection<? extends Colonne>) newValue);
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
		case SchemaTablePackage.TABLEAU__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SchemaTablePackage.TABLEAU__COLONNE_LIGNES:
			setColonneLignes((Colonne) null);
			return;
		case SchemaTablePackage.TABLEAU__COLONNES:
			getColonnes().clear();
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
		case SchemaTablePackage.TABLEAU__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SchemaTablePackage.TABLEAU__COLONNE_LIGNES:
			return colonneLignes != null;
		case SchemaTablePackage.TABLEAU__COLONNES:
			return colonnes != null && !colonnes.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //TableauImpl
