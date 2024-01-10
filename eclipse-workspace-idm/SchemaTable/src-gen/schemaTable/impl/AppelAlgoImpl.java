/**
 */
package schemaTable.impl;

import algo.Algo;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import schemaTable.AppelAlgo;
import schemaTable.Colonne;
import schemaTable.SchemaTablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Appel Algo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link schemaTable.impl.AppelAlgoImpl#getAlgo <em>Algo</em>}</li>
 *   <li>{@link schemaTable.impl.AppelAlgoImpl#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppelAlgoImpl extends ContenuColonneImpl implements AppelAlgo {
	/**
	 * The cached value of the '{@link #getAlgo() <em>Algo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgo()
	 * @generated
	 * @ordered
	 */
	protected Algo algo;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<Colonne> input;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppelAlgoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaTablePackage.Literals.APPEL_ALGO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Algo getAlgo() {
		if (algo != null && algo.eIsProxy()) {
			InternalEObject oldAlgo = (InternalEObject) algo;
			algo = (Algo) eResolveProxy(oldAlgo);
			if (algo != oldAlgo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchemaTablePackage.APPEL_ALGO__ALGO,
							oldAlgo, algo));
			}
		}
		return algo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Algo basicGetAlgo() {
		return algo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlgo(Algo newAlgo) {
		Algo oldAlgo = algo;
		algo = newAlgo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaTablePackage.APPEL_ALGO__ALGO, oldAlgo, algo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Colonne> getInput() {
		if (input == null) {
			input = new EObjectResolvingEList<Colonne>(Colonne.class, this, SchemaTablePackage.APPEL_ALGO__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SchemaTablePackage.APPEL_ALGO__ALGO:
			if (resolve)
				return getAlgo();
			return basicGetAlgo();
		case SchemaTablePackage.APPEL_ALGO__INPUT:
			return getInput();
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
		case SchemaTablePackage.APPEL_ALGO__ALGO:
			setAlgo((Algo) newValue);
			return;
		case SchemaTablePackage.APPEL_ALGO__INPUT:
			getInput().clear();
			getInput().addAll((Collection<? extends Colonne>) newValue);
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
		case SchemaTablePackage.APPEL_ALGO__ALGO:
			setAlgo((Algo) null);
			return;
		case SchemaTablePackage.APPEL_ALGO__INPUT:
			getInput().clear();
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
		case SchemaTablePackage.APPEL_ALGO__ALGO:
			return algo != null;
		case SchemaTablePackage.APPEL_ALGO__INPUT:
			return input != null && !input.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AppelAlgoImpl
