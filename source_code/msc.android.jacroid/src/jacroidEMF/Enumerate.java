/**
 */
package jacroidEMF;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumerate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jacroidEMF.Enumerate#getName <em>Name</em>}</li>
 *   <li>{@link jacroidEMF.Enumerate#getItem <em>Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see jacroidEMF.JacroidEMFPackage#getEnumerate()
 * @model annotation="gmf.node label='name' figure='rectangle'"
 * @generated
 */
public interface Enumerate extends EObject {
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
	 * @see jacroidEMF.JacroidEMFPackage#getEnumerate_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link jacroidEMF.Enumerate#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link jacroidEMF.ItemEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see jacroidEMF.JacroidEMFPackage#getEnumerate_Item()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list' collapsible='false'"
	 * @generated
	 */
	EList<ItemEnum> getItem();

} // Enumerate
