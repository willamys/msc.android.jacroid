/**
 */
package jacroidEMF;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see jacroidEMF.JacroidEMFPackage
 * @generated
 */
public interface JacroidEMFFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JacroidEMFFactory eINSTANCE = jacroidEMF.impl.JacroidEMFFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Attribute Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Descriptor</em>'.
	 * @generated
	 */
	AttributeDescriptor createAttributeDescriptor();

	/**
	 * Returns a new object of class '<em>Classes Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classes Descriptor</em>'.
	 * @generated
	 */
	ClassesDescriptor createClassesDescriptor();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Firebase Auth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Firebase Auth</em>'.
	 * @generated
	 */
	FirebaseAuth createFirebaseAuth();

	/**
	 * Returns a new object of class '<em>Enumerate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumerate</em>'.
	 * @generated
	 */
	Enumerate createEnumerate();

	/**
	 * Returns a new object of class '<em>Item Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Enum</em>'.
	 * @generated
	 */
	ItemEnum createItemEnum();

	/**
	 * Returns a new object of class '<em>Relation Classes Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Classes Descriptor</em>'.
	 * @generated
	 */
	RelationClassesDescriptor createRelationClassesDescriptor();

	/**
	 * Returns a new object of class '<em>Relation Attribute Descriptor To Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Attribute Descriptor To Component</em>'.
	 * @generated
	 */
	RelationAttributeDescriptorToComponent createRelationAttributeDescriptorToComponent();

	/**
	 * Returns a new object of class '<em>Projeto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Projeto</em>'.
	 * @generated
	 */
	Projeto createProjeto();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JacroidEMFPackage getJacroidEMFPackage();

} //JacroidEMFFactory
