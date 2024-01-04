/**
 */
package expression.impl;

import expression.Entree;
import expression.Expression;
import expression.ExpressionElement;
import expression.ExpressionPackage;
import expression.Sortie;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link expression.impl.ExpressionImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link expression.impl.ExpressionImpl#getEntree <em>Entree</em>}</li>
 *   <li>{@link expression.impl.ExpressionImpl#getSortie <em>Sortie</em>}</li>
 *   <li>{@link expression.impl.ExpressionImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionImpl extends MinimalEObjectImpl.Container implements Expression {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntree() <em>Entree</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntree()
	 * @generated
	 * @ordered
	 */
	protected EList<Entree> entree;

	/**
	 * The cached value of the '{@link #getSortie() <em>Sortie</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortie()
	 * @generated
	 * @ordered
	 */
	protected Sortie sortie;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpressionElement> elements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionPackage.Literals.EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.EXPRESSION__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Entree> getEntree() {
		if (entree == null) {
			entree = new EObjectResolvingEList<Entree>(Entree.class, this, ExpressionPackage.EXPRESSION__ENTREE);
		}
		return entree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sortie getSortie() {
		if (sortie != null && sortie.eIsProxy()) {
			InternalEObject oldSortie = (InternalEObject) sortie;
			sortie = (Sortie) eResolveProxy(oldSortie);
			if (sortie != oldSortie) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionPackage.EXPRESSION__SORTIE,
							oldSortie, sortie));
			}
		}
		return sortie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sortie basicGetSortie() {
		return sortie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSortie(Sortie newSortie) {
		Sortie oldSortie = sortie;
		sortie = newSortie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.EXPRESSION__SORTIE, oldSortie,
					sortie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExpressionElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<ExpressionElement>(ExpressionElement.class, this,
					ExpressionPackage.EXPRESSION__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ExpressionPackage.EXPRESSION__ELEMENTS:
			return ((InternalEList<?>) getElements()).basicRemove(otherEnd, msgs);
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
		case ExpressionPackage.EXPRESSION__NOM:
			return getNom();
		case ExpressionPackage.EXPRESSION__ENTREE:
			return getEntree();
		case ExpressionPackage.EXPRESSION__SORTIE:
			if (resolve)
				return getSortie();
			return basicGetSortie();
		case ExpressionPackage.EXPRESSION__ELEMENTS:
			return getElements();
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
		case ExpressionPackage.EXPRESSION__NOM:
			setNom((String) newValue);
			return;
		case ExpressionPackage.EXPRESSION__ENTREE:
			getEntree().clear();
			getEntree().addAll((Collection<? extends Entree>) newValue);
			return;
		case ExpressionPackage.EXPRESSION__SORTIE:
			setSortie((Sortie) newValue);
			return;
		case ExpressionPackage.EXPRESSION__ELEMENTS:
			getElements().clear();
			getElements().addAll((Collection<? extends ExpressionElement>) newValue);
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
		case ExpressionPackage.EXPRESSION__NOM:
			setNom(NOM_EDEFAULT);
			return;
		case ExpressionPackage.EXPRESSION__ENTREE:
			getEntree().clear();
			return;
		case ExpressionPackage.EXPRESSION__SORTIE:
			setSortie((Sortie) null);
			return;
		case ExpressionPackage.EXPRESSION__ELEMENTS:
			getElements().clear();
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
		case ExpressionPackage.EXPRESSION__NOM:
			return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
		case ExpressionPackage.EXPRESSION__ENTREE:
			return entree != null && !entree.isEmpty();
		case ExpressionPackage.EXPRESSION__SORTIE:
			return sortie != null;
		case ExpressionPackage.EXPRESSION__ELEMENTS:
			return elements != null && !elements.isEmpty();
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(')');
		return result.toString();
	}

} //ExpressionImpl
