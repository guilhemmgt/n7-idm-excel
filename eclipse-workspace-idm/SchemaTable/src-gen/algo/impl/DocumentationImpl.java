/**
 */
package algo.impl;

import algo.AlgoPackage;
import algo.Documentable;
import algo.Documentation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Documentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link algo.impl.DocumentationImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link algo.impl.DocumentationImpl#getLinkToElement <em>Link To Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentationImpl extends MinimalEObjectImpl.Container implements Documentation {
	/**
	 * The default value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTAIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected String commentaire = COMMENTAIRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLinkToElement() <em>Link To Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkToElement()
	 * @generated
	 * @ordered
	 */
	protected Documentable linkToElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgoPackage.Literals.DOCUMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommentaire() {
		return commentaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommentaire(String newCommentaire) {
		String oldCommentaire = commentaire;
		commentaire = newCommentaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgoPackage.DOCUMENTATION__COMMENTAIRE,
					oldCommentaire, commentaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Documentable getLinkToElement() {
		if (linkToElement != null && linkToElement.eIsProxy()) {
			InternalEObject oldLinkToElement = (InternalEObject) linkToElement;
			linkToElement = (Documentable) eResolveProxy(oldLinkToElement);
			if (linkToElement != oldLinkToElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AlgoPackage.DOCUMENTATION__LINK_TO_ELEMENT, oldLinkToElement, linkToElement));
			}
		}
		return linkToElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documentable basicGetLinkToElement() {
		return linkToElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkToElement(Documentable newLinkToElement) {
		Documentable oldLinkToElement = linkToElement;
		linkToElement = newLinkToElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgoPackage.DOCUMENTATION__LINK_TO_ELEMENT,
					oldLinkToElement, linkToElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AlgoPackage.DOCUMENTATION__COMMENTAIRE:
			return getCommentaire();
		case AlgoPackage.DOCUMENTATION__LINK_TO_ELEMENT:
			if (resolve)
				return getLinkToElement();
			return basicGetLinkToElement();
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
		case AlgoPackage.DOCUMENTATION__COMMENTAIRE:
			setCommentaire((String) newValue);
			return;
		case AlgoPackage.DOCUMENTATION__LINK_TO_ELEMENT:
			setLinkToElement((Documentable) newValue);
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
		case AlgoPackage.DOCUMENTATION__COMMENTAIRE:
			setCommentaire(COMMENTAIRE_EDEFAULT);
			return;
		case AlgoPackage.DOCUMENTATION__LINK_TO_ELEMENT:
			setLinkToElement((Documentable) null);
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
		case AlgoPackage.DOCUMENTATION__COMMENTAIRE:
			return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
		case AlgoPackage.DOCUMENTATION__LINK_TO_ELEMENT:
			return linkToElement != null;
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
		result.append(" (commentaire: ");
		result.append(commentaire);
		result.append(')');
		return result.toString();
	}

} //DocumentationImpl
