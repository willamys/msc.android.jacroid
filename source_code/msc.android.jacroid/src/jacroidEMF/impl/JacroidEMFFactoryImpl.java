/**
 */
package jacroidEMF.impl;

import jacroidEMF.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JacroidEMFFactoryImpl extends EFactoryImpl implements JacroidEMFFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JacroidEMFFactory init() {
		try {
			JacroidEMFFactory theJacroidEMFFactory = (JacroidEMFFactory)EPackage.Registry.INSTANCE.getEFactory(JacroidEMFPackage.eNS_URI);
			if (theJacroidEMFFactory != null) {
				return theJacroidEMFFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JacroidEMFFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JacroidEMFFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JacroidEMFPackage.PROJETO: return createProjeto();
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR: return createAttributeDescriptor();
			case JacroidEMFPackage.CLASSES_DESCRIPTOR: return createClassesDescriptor();
			case JacroidEMFPackage.COMPONENT: return createComponent();
			case JacroidEMFPackage.FIREBASE_AUTH: return createFirebaseAuth();
			case JacroidEMFPackage.ENUMERATE: return createEnumerate();
			case JacroidEMFPackage.ITEM_ENUM: return createItemEnum();
			case JacroidEMFPackage.RELATION_CLASSES_DESCRIPTOR: return createRelationClassesDescriptor();
			case JacroidEMFPackage.RELATION_ATTRIBUTE_DESCRIPTOR_TO_COMPONENT: return createRelationAttributeDescriptorToComponent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case JacroidEMFPackage.TYPE_DATA:
				return createTypeDataFromString(eDataType, initialValue);
			case JacroidEMFPackage.TYPE:
				return createTypeFromString(eDataType, initialValue);
			case JacroidEMFPackage.INPUT:
				return createInputFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case JacroidEMFPackage.TYPE_DATA:
				return convertTypeDataToString(eDataType, instanceValue);
			case JacroidEMFPackage.TYPE:
				return convertTypeToString(eDataType, instanceValue);
			case JacroidEMFPackage.INPUT:
				return convertInputToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDescriptor createAttributeDescriptor() {
		AttributeDescriptorImpl attributeDescriptor = new AttributeDescriptorImpl();
		return attributeDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassesDescriptor createClassesDescriptor() {
		ClassesDescriptorImpl classesDescriptor = new ClassesDescriptorImpl();
		return classesDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirebaseAuth createFirebaseAuth() {
		FirebaseAuthImpl firebaseAuth = new FirebaseAuthImpl();
		return firebaseAuth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerate createEnumerate() {
		EnumerateImpl enumerate = new EnumerateImpl();
		return enumerate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemEnum createItemEnum() {
		ItemEnumImpl itemEnum = new ItemEnumImpl();
		return itemEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationClassesDescriptor createRelationClassesDescriptor() {
		RelationClassesDescriptorImpl relationClassesDescriptor = new RelationClassesDescriptorImpl();
		return relationClassesDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationAttributeDescriptorToComponent createRelationAttributeDescriptorToComponent() {
		RelationAttributeDescriptorToComponentImpl relationAttributeDescriptorToComponent = new RelationAttributeDescriptorToComponentImpl();
		return relationAttributeDescriptorToComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input createInputFromString(EDataType eDataType, String initialValue) {
		Input result = Input.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInputToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeData createTypeDataFromString(EDataType eDataType, String initialValue) {
		TypeData result = TypeData.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDataToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createTypeFromString(EDataType eDataType, String initialValue) {
		Type result = Type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Projeto createProjeto() {
		ProjetoImpl projeto = new ProjetoImpl();
		return projeto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JacroidEMFPackage getJacroidEMFPackage() {
		return (JacroidEMFPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JacroidEMFPackage getPackage() {
		return JacroidEMFPackage.eINSTANCE;
	}

} //JacroidEMFFactoryImpl
