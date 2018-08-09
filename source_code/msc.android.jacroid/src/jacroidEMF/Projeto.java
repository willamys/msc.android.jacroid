/**
 */
package jacroidEMF;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Projeto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jacroidEMF.Projeto#getClasses <em>Classes</em>}</li>
 *   <li>{@link jacroidEMF.Projeto#getComponent <em>Component</em>}</li>
 *   <li>{@link jacroidEMF.Projeto#getEnumerate <em>Enumerate</em>}</li>
 *   <li>{@link jacroidEMF.Projeto#getFirebaseAuth <em>Firebase Auth</em>}</li>
 *   <li>{@link jacroidEMF.Projeto#getRelationClasses <em>Relation Classes</em>}</li>
 *   <li>{@link jacroidEMF.Projeto#getRelationAttributeToComponent <em>Relation Attribute To Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see jacroidEMF.JacroidEMFPackage#getProjeto()
 * @model
 * @generated
 */
public interface Projeto extends EObject {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link jacroidEMF.ClassesDescriptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see jacroidEMF.JacroidEMFPackage#getProjeto_Classes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassesDescriptor> getClasses();

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link jacroidEMF.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see jacroidEMF.JacroidEMFPackage#getProjeto_Component()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponent();

	/**
	 * Returns the value of the '<em><b>Enumerate</b></em>' containment reference list.
	 * The list contents are of type {@link jacroidEMF.Enumerate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumerate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumerate</em>' containment reference list.
	 * @see jacroidEMF.JacroidEMFPackage#getProjeto_Enumerate()
	 * @model containment="true"
	 * @generated
	 */
	EList<Enumerate> getEnumerate();

	/**
	 * Returns the value of the '<em><b>Firebase Auth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firebase Auth</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firebase Auth</em>' containment reference.
	 * @see #setFirebaseAuth(FirebaseAuth)
	 * @see jacroidEMF.JacroidEMFPackage#getProjeto_FirebaseAuth()
	 * @model containment="true"
	 * @generated
	 */
	FirebaseAuth getFirebaseAuth();

	/**
	 * Sets the value of the '{@link jacroidEMF.Projeto#getFirebaseAuth <em>Firebase Auth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firebase Auth</em>' containment reference.
	 * @see #getFirebaseAuth()
	 * @generated
	 */
	void setFirebaseAuth(FirebaseAuth value);

	/**
	 * Returns the value of the '<em><b>Relation Classes</b></em>' containment reference list.
	 * The list contents are of type {@link jacroidEMF.RelationClassesDescriptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Classes</em>' containment reference list.
	 * @see jacroidEMF.JacroidEMFPackage#getProjeto_RelationClasses()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationClassesDescriptor> getRelationClasses();

	/**
	 * Returns the value of the '<em><b>Relation Attribute To Component</b></em>' containment reference list.
	 * The list contents are of type {@link jacroidEMF.RelationAttributeDescriptorToComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation Attribute To Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Attribute To Component</em>' containment reference list.
	 * @see jacroidEMF.JacroidEMFPackage#getProjeto_RelationAttributeToComponent()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationAttributeDescriptorToComponent> getRelationAttributeToComponent();

} // Projeto
