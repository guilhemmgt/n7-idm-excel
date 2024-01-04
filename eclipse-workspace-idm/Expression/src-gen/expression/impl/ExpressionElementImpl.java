/**
 */
package expression.impl;

import expression.ExpressionElement;
import expression.ExpressionPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link expression.impl.ExpressionElementImpl#getEntree <em>Entree</em>}</li>
 *   <li>{@link expression.impl.ExpressionElementImpl#getSortie <em>Sortie</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExpressionElementImpl extends MinimalEObjectImpl.Container implements ExpressionElement {
	/**
	 * The cached value of the '{@link #getEntree() <em>Entree</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntree()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpressionElement> entree;

	/**
	 * The cached value of the '{@link #getSortie() <em>Sortie</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortie()
	 * @generated
	 * @ordered
	 */
	protected ExpressionElement sortie;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionPackage.Literals.EXPRESSION_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExpressionElement> getEntree() {
		if (entree == null) {
			entree = new EObjectWithInverseResolvingEList<ExpressionElement>(ExpressionElement.class, this,
					ExpressionPackage.EXPRESSION_ELEMENT__ENTREE, ExpressionPackage.EXPRESSION_ELEMENT__SORTIE);
		}
		return entree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressionElement getSortie() {
		if (sortie != null && sortie.eIsProxy()) {
			InternalEObject oldSortie = (InternalEObject) sortie;
			sortie = (ExpressionElement) eResolveProxy(oldSortie);
			if (sortie != oldSortie) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ExpressionPackage.EXPRESSION_ELEMENT__SORTIE, oldSortie, sortie));
			}
		}
		return sortie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionElement basicGetSortie() {
		return sortie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSortie(ExpressionElement newSortie, NotificationChain msgs) {
		ExpressionElement oldSortie = sortie;
		sortie = newSortie;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ExpressionPackage.EXPRESSION_ELEMENT__SORTIE, oldSortie, newSortie);
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
	public void setSortie(ExpressionElement newSortie) {
		if (newSortie != sortie) {
			NotificationChain msgs = null;
			if (sortie != null)
				msgs = ((InternalEObject) sortie).eInverseRemove(this, ExpressionPackage.EXPRESSION_ELEMENT__ENTREE,
						ExpressionElement.class, msgs);
			if (newSortie != null)
				msgs = ((InternalEObject) newSortie).eInverseAdd(this, ExpressionPackage.EXPRESSION_ELEMENT__ENTREE,
						ExpressionElement.class, msgs);
			msgs = basicSetSortie(newSortie, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.EXPRESSION_ELEMENT__SORTIE,
					newSortie, newSortie));
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
		case ExpressionPackage.EXPRESSION_ELEMENT__ENTREE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getEntree()).basicAdd(otherEnd, msgs);
		case ExpressionPackage.EXPRESSION_ELEMENT__SORTIE:
			if (sortie != null)
				msgs = ((InternalEObject) sortie).eInverseRemove(this, ExpressionPackage.EXPRESSION_ELEMENT__ENTREE,
						ExpressionElement.class, msgs);
			return basicSetSortie((ExpressionElement) otherEnd, msgs);
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
		case ExpressionPackage.EXPRESSION_ELEMENT__ENTREE:
			return ((InternalEList<?>) getEntree()).basicRemove(otherEnd, msgs);
		case ExpressionPackage.EXPRESSION_ELEMENT__SORTIE:
			return basicSetSortie(null, msgs);
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
		case ExpressionPackage.EXPRESSION_ELEMENT__ENTREE:
			return getEntree();
		case ExpressionPackage.EXPRESSION_ELEMENT__SORTIE:
			if (resolve)
				return getSortie();
			return basicGetSortie();
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
		case ExpressionPackage.EXPRESSION_ELEMENT__ENTREE:
			getEntree().clear();
			getEntree().addAll((Collection<? extends ExpressionElement>) newValue);
			return;
		case ExpressionPackage.EXPRESSION_ELEMENT__SORTIE:
			setSortie((ExpressionElement) newValue);
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
		case ExpressionPackage.EXPRESSION_ELEMENT__ENTREE:
			getEntree().clear();
			return;
		case ExpressionPackage.EXPRESSION_ELEMENT__SORTIE:
			setSortie((ExpressionElement) null);
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
		case ExpressionPackage.EXPRESSION_ELEMENT__ENTREE:
			return entree != null && !entree.isEmpty();
		case ExpressionPackage.EXPRESSION_ELEMENT__SORTIE:
			return sortie != null;
		}
		return super.eIsSet(featureID);
	}

} //ExpressionElementImpl
