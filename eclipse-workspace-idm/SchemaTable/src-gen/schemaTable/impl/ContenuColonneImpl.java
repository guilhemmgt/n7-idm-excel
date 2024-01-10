/**
 */
package schemaTable.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import schemaTable.Colonne;
import schemaTable.ContenuColonne;
import schemaTable.SchemaTablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenu Colonne</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link schemaTable.impl.ContenuColonneImpl#getColonne <em>Colonne</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContenuColonneImpl extends MinimalEObjectImpl.Container implements ContenuColonne {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenuColonneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaTablePackage.Literals.CONTENU_COLONNE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Colonne getColonne() {
		if (eContainerFeatureID() != SchemaTablePackage.CONTENU_COLONNE__COLONNE)
			return null;
		return (Colonne) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SchemaTablePackage.CONTENU_COLONNE__COLONNE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return eBasicSetContainer(otherEnd, SchemaTablePackage.CONTENU_COLONNE__COLONNE, msgs);
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
		case SchemaTablePackage.CONTENU_COLONNE__COLONNE:
			return eBasicSetContainer(null, SchemaTablePackage.CONTENU_COLONNE__COLONNE, msgs);
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
		case SchemaTablePackage.CONTENU_COLONNE__COLONNE:
			return eInternalContainer().eInverseRemove(this, SchemaTablePackage.COLONNE__CONTENU, Colonne.class, msgs);
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
		case SchemaTablePackage.CONTENU_COLONNE__COLONNE:
			return getColonne();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SchemaTablePackage.CONTENU_COLONNE__COLONNE:
			return getColonne() != null;
		}
		return super.eIsSet(featureID);
	}

} //ContenuColonneImpl
