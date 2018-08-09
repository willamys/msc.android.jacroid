/**
 */
package jacroidEMF;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Attribute Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jacroidEMF.RelationAttributeDescriptor#getSource <em>Source</em>}</li>
 *   <li>{@link jacroidEMF.RelationAttributeDescriptor#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see jacroidEMF.JacroidEMFPackage#getRelationAttributeDescriptor()
 * @model annotation="gmf.link source='source' target='target' style='dot' width='2'"
 * @generated
 */
public interface RelationAttributeDescriptor extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ClassesDescriptor)
	 * @see jacroidEMF.JacroidEMFPackage#getRelationAttributeDescriptor_Source()
	 * @model
	 * @generated
	 */
	ClassesDescriptor getSource();

	/**
	 * Sets the value of the '{@link jacroidEMF.RelationAttributeDescriptor#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ClassesDescriptor value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(AttributeDescriptor)
	 * @see jacroidEMF.JacroidEMFPackage#getRelationAttributeDescriptor_Target()
	 * @model
	 * @generated
	 */
	AttributeDescriptor getTarget();

	/**
	 * Sets the value of the '{@link jacroidEMF.RelationAttributeDescriptor#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(AttributeDescriptor value);

} // RelationAttributeDescriptor
