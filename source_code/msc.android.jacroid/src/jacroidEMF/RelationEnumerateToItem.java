/**
 */
package jacroidEMF;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Enumerate To Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jacroidEMF.RelationEnumerateToItem#getSource <em>Source</em>}</li>
 *   <li>{@link jacroidEMF.RelationEnumerateToItem#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see jacroidEMF.JacroidEMFPackage#getRelationEnumerateToItem()
 * @model annotation="gmf.link source='source' target='target' target.decoration='arrow' style='dot' width='2'"
 * @generated
 */
public interface RelationEnumerateToItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Enumerate)
	 * @see jacroidEMF.JacroidEMFPackage#getRelationEnumerateToItem_Source()
	 * @model
	 * @generated
	 */
	Enumerate getSource();

	/**
	 * Sets the value of the '{@link jacroidEMF.RelationEnumerateToItem#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Enumerate value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Item)
	 * @see jacroidEMF.JacroidEMFPackage#getRelationEnumerateToItem_Target()
	 * @model
	 * @generated
	 */
	Item getTarget();

	/**
	 * Sets the value of the '{@link jacroidEMF.RelationEnumerateToItem#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Item value);

} // RelationEnumerateToItem
