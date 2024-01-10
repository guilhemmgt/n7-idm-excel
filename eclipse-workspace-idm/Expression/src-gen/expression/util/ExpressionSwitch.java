/**
 */
package expression.util;

import expression.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see expression.ExpressionPackage
 * @generated
 */
public class ExpressionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExpressionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionSwitch() {
		if (modelPackage == null) {
			modelPackage = ExpressionPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ExpressionPackage.EXPRESSION: {
			Expression expression = (Expression) theEObject;
			T result = caseExpression(expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExpressionPackage.EXPRESSION_ELEMENT: {
			ExpressionElement expressionElement = (ExpressionElement) theEObject;
			T result = caseExpressionElement(expressionElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExpressionPackage.FLUX: {
			Flux flux = (Flux) theEObject;
			T result = caseFlux(flux);
			if (result == null)
				result = caseExpressionElement(flux);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExpressionPackage.ENTREE: {
			Entree entree = (Entree) theEObject;
			T result = caseEntree(entree);
			if (result == null)
				result = caseFlux(entree);
			if (result == null)
				result = caseExpressionElement(entree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExpressionPackage.SORTIE: {
			Sortie sortie = (Sortie) theEObject;
			T result = caseSortie(sortie);
			if (result == null)
				result = caseFlux(sortie);
			if (result == null)
				result = caseExpressionElement(sortie);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExpressionPackage.OPERATION_NULLAIRE: {
			OperationNullaire operationNullaire = (OperationNullaire) theEObject;
			T result = caseOperationNullaire(operationNullaire);
			if (result == null)
				result = caseExpressionElement(operationNullaire);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExpressionPackage.CONSTANTE: {
			Constante constante = (Constante) theEObject;
			T result = caseConstante(constante);
			if (result == null)
				result = caseOperationNullaire(constante);
			if (result == null)
				result = caseExpressionElement(constante);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExpressionPackage.OPERATION_UNAIRE: {
			OperationUnaire operationUnaire = (OperationUnaire) theEObject;
			T result = caseOperationUnaire(operationUnaire);
			if (result == null)
				result = caseExpressionElement(operationUnaire);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExpressionPackage.OPPOSE: {
			Oppose oppose = (Oppose) theEObject;
			T result = caseOppose(oppose);
			if (result == null)
				result = caseOperationUnaire(oppose);
			if (result == null)
				result = caseExpressionElement(oppose);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExpressionPackage.INVERSE: {
			Inverse inverse = (Inverse) theEObject;
			T result = caseInverse(inverse);
			if (result == null)
				result = caseOperationUnaire(inverse);
			if (result == null)
				result = caseExpressionElement(inverse);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExpressionPackage.SINUS: {
			Sinus sinus = (Sinus) theEObject;
			T result = caseSinus(sinus);
			if (result == null)
				result = caseOperationUnaire(sinus);
			if (result == null)
				result = caseExpressionElement(sinus);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExpressionPackage.COSINUS: {
			Cosinus cosinus = (Cosinus) theEObject;
			T result = caseCosinus(cosinus);
			if (result == null)
				result = caseOperationUnaire(cosinus);
			if (result == null)
				result = caseExpressionElement(cosinus);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExpressionPackage.RACINE_CARREE: {
			Racine_carree racine_carree = (Racine_carree) theEObject;
			T result = caseRacine_carree(racine_carree);
			if (result == null)
				result = caseOperationUnaire(racine_carree);
			if (result == null)
				result = caseExpressionElement(racine_carree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExpressionPackage.EXPONENTIELLE: {
			Exponentielle exponentielle = (Exponentielle) theEObject;
			T result = caseExponentielle(exponentielle);
			if (result == null)
				result = caseRacine_carree(exponentielle);
			if (result == null)
				result = caseOperationUnaire(exponentielle);
			if (result == null)
				result = caseExpressionElement(exponentielle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExpressionPackage.OPERATION_BINAIRE: {
			OperationBinaire operationBinaire = (OperationBinaire) theEObject;
			T result = caseOperationBinaire(operationBinaire);
			if (result == null)
				result = caseExpressionElement(operationBinaire);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExpressionPackage.SOUSTRACTION: {
			Soustraction soustraction = (Soustraction) theEObject;
			T result = caseSoustraction(soustraction);
			if (result == null)
				result = caseOperationBinaire(soustraction);
			if (result == null)
				result = caseExpressionElement(soustraction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExpressionPackage.ADDITION: {
			Addition addition = (Addition) theEObject;
			T result = caseAddition(addition);
			if (result == null)
				result = caseOperationBinaire(addition);
			if (result == null)
				result = caseExpressionElement(addition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExpressionPackage.DIVISION: {
			Division division = (Division) theEObject;
			T result = caseDivision(division);
			if (result == null)
				result = caseOperationBinaire(division);
			if (result == null)
				result = caseExpressionElement(division);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExpressionPackage.MULTIPLICATION: {
			Multiplication multiplication = (Multiplication) theEObject;
			T result = caseMultiplication(multiplication);
			if (result == null)
				result = caseOperationBinaire(multiplication);
			if (result == null)
				result = caseExpressionElement(multiplication);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExpressionPackage.MINIMUM: {
			Minimum minimum = (Minimum) theEObject;
			T result = caseMinimum(minimum);
			if (result == null)
				result = caseOperationBinaire(minimum);
			if (result == null)
				result = caseExpressionElement(minimum);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExpressionPackage.MAXIMUM: {
			Maximum maximum = (Maximum) theEObject;
			T result = caseMaximum(maximum);
			if (result == null)
				result = caseOperationBinaire(maximum);
			if (result == null)
				result = caseExpressionElement(maximum);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionElement(ExpressionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flux</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flux</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlux(Flux object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntree(Entree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sortie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sortie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortie(Sortie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Nullaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Nullaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationNullaire(OperationNullaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constante</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constante</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstante(Constante object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Unaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Unaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationUnaire(OperationUnaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oppose</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oppose</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOppose(Oppose object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inverse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inverse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInverse(Inverse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sinus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sinus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSinus(Sinus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cosinus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cosinus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCosinus(Cosinus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Racine carree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Racine carree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRacine_carree(Racine_carree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exponentielle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exponentielle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExponentielle(Exponentielle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Binaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Binaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationBinaire(OperationBinaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Soustraction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Soustraction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoustraction(Soustraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddition(Addition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Division</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Division</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivision(Division object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplication(Multiplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minimum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minimum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinimum(Minimum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maximum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maximum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaximum(Maximum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ExpressionSwitch
