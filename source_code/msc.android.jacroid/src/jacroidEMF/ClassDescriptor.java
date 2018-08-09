/**
 */
package jacroidEMF;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jacroidEMF.ClassDescriptor#getName <em>Name</em>}</li>
 *   <li>{@link jacroidEMF.ClassDescriptor#getTableName <em>Table Name</em>}</li>
 *   <li>{@link jacroidEMF.ClassDescriptor#getListAttributesDescriptorForClass <em>List Attributes Descriptor For Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see jacroidEMF.JacroidEMFPackage#getClassDescriptor()
 * @model
 * @generated
 */
public interface ClassDescriptor extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see jacroidEMF.JacroidEMFPackage#getClassDescriptor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link jacroidEMF.ClassDescriptor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Name</em>' attribute.
	 * @see #setTableName(String)
	 * @see jacroidEMF.JacroidEMFPackage#getClassDescriptor_TableName()
	 * @model
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link jacroidEMF.ClassDescriptor#getTableName <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' attribute.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(String value);

	/**
	 * Returns the value of the '<em><b>List Attributes Descriptor For Class</b></em>' containment reference list.
	 * The list contents are of type {@link jacroidEMF.AttributeDescriptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Attributes Descriptor For Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Attributes Descriptor For Class</em>' containment reference list.
	 * @see jacroidEMF.JacroidEMFPackage#getClassDescriptor_ListAttributesDescriptorForClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeDescriptor> getListAttributesDescriptorForClass();

} // ClassDescriptor
