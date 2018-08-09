/**
 */
package jacroidEMF.util;

import jacroidEMF.*;

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
 * @see jacroidEMF.JacroidEMFPackage
 * @generated
 */
public class JacroidEMFSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JacroidEMFPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JacroidEMFSwitch() {
		if (modelPackage == null) {
			modelPackage = JacroidEMFPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
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
			case JacroidEMFPackage.PROJETO: {
				Projeto projeto = (Projeto)theEObject;
				T result = caseProjeto(projeto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR: {
				AttributeDescriptor attributeDescriptor = (AttributeDescriptor)theEObject;
				T result = caseAttributeDescriptor(attributeDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JacroidEMFPackage.CLASSES_DESCRIPTOR: {
				ClassesDescriptor classesDescriptor = (ClassesDescriptor)theEObject;
				T result = caseClassesDescriptor(classesDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JacroidEMFPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JacroidEMFPackage.FIREBASE_AUTH: {
				FirebaseAuth firebaseAuth = (FirebaseAuth)theEObject;
				T result = caseFirebaseAuth(firebaseAuth);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JacroidEMFPackage.ENUMERATE: {
				Enumerate enumerate = (Enumerate)theEObject;
				T result = caseEnumerate(enumerate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JacroidEMFPackage.ITEM_ENUM: {
				ItemEnum itemEnum = (ItemEnum)theEObject;
				T result = caseItemEnum(itemEnum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JacroidEMFPackage.RELATION_CLASSES_DESCRIPTOR: {
				RelationClassesDescriptor relationClassesDescriptor = (RelationClassesDescriptor)theEObject;
				T result = caseRelationClassesDescriptor(relationClassesDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JacroidEMFPackage.RELATION_ATTRIBUTE_DESCRIPTOR_TO_COMPONENT: {
				RelationAttributeDescriptorToComponent relationAttributeDescriptorToComponent = (RelationAttributeDescriptorToComponent)theEObject;
				T result = caseRelationAttributeDescriptorToComponent(relationAttributeDescriptorToComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDescriptor(AttributeDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classes Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classes Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassesDescriptor(ClassesDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Firebase Auth</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Firebase Auth</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirebaseAuth(FirebaseAuth object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumerate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumerate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerate(Enumerate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemEnum(ItemEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Classes Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Classes Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationClassesDescriptor(RelationClassesDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Attribute Descriptor To Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Attribute Descriptor To Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationAttributeDescriptorToComponent(RelationAttributeDescriptorToComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Projeto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Projeto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjeto(Projeto object) {
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

} //JacroidEMFSwitch
