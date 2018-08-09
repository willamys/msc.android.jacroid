/**
 */
package jacroidEMF.impl;

import jacroidEMF.AttributeDescriptor;
import jacroidEMF.ClassesDescriptor;
import jacroidEMF.Component;
import jacroidEMF.Enumerate;
import jacroidEMF.FirebaseAuth;
import jacroidEMF.Input;
import jacroidEMF.ItemEnum;
import jacroidEMF.JacroidEMFFactory;
import jacroidEMF.JacroidEMFPackage;
import jacroidEMF.Projeto;

import jacroidEMF.RelationAttributeDescriptorToComponent;
import jacroidEMF.RelationClassesDescriptor;
import jacroidEMF.Type;
import jacroidEMF.TypeData;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JacroidEMFPackageImpl extends EPackageImpl implements JacroidEMFPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classesDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firebaseAuthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationClassesDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationAttributeDescriptorToComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum inputEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeDataEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projetoEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see jacroidEMF.JacroidEMFPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JacroidEMFPackageImpl() {
		super(eNS_URI, JacroidEMFFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link JacroidEMFPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JacroidEMFPackage init() {
		if (isInited) return (JacroidEMFPackage)EPackage.Registry.INSTANCE.getEPackage(JacroidEMFPackage.eNS_URI);

		// Obtain or create and register package
		JacroidEMFPackageImpl theJacroidEMFPackage = (JacroidEMFPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JacroidEMFPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JacroidEMFPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theJacroidEMFPackage.createPackageContents();

		// Initialize created meta-data
		theJacroidEMFPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJacroidEMFPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JacroidEMFPackage.eNS_URI, theJacroidEMFPackage);
		return theJacroidEMFPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDescriptor() {
		return attributeDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeDescriptor_Classname() {
		return (EAttribute)attributeDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeDescriptor_ColumnTable() {
		return (EAttribute)attributeDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeDescriptor_ExhibitionName() {
		return (EAttribute)attributeDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeDescriptor_Input() {
		return (EAttribute)attributeDescriptorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeDescriptor_IsColumn() {
		return (EAttribute)attributeDescriptorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeDescriptor_Name() {
		return (EAttribute)attributeDescriptorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeDescriptor_PrimaryKey() {
		return (EAttribute)attributeDescriptorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeDescriptor_PrimaryKeyTable() {
		return (EAttribute)attributeDescriptorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeDescriptor_TypeData() {
		return (EAttribute)attributeDescriptorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassesDescriptor() {
		return classesDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassesDescriptor_Name() {
		return (EAttribute)classesDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassesDescriptor_TableName() {
		return (EAttribute)classesDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassesDescriptor_Attributes() {
		return (EReference)classesDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Name() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Type() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirebaseAuth() {
		return firebaseAuthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirebaseAuth_Name() {
		return (EAttribute)firebaseAuthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerate() {
		return enumerateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerate_Name() {
		return (EAttribute)enumerateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerate_Item() {
		return (EReference)enumerateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemEnum() {
		return itemEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemEnum_Name() {
		return (EAttribute)itemEnumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationClassesDescriptor() {
		return relationClassesDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationClassesDescriptor_Source() {
		return (EReference)relationClassesDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationClassesDescriptor_Target() {
		return (EReference)relationClassesDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationAttributeDescriptorToComponent() {
		return relationAttributeDescriptorToComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationAttributeDescriptorToComponent_Source() {
		return (EReference)relationAttributeDescriptorToComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationAttributeDescriptorToComponent_Target() {
		return (EReference)relationAttributeDescriptorToComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInput() {
		return inputEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeData() {
		return typeDataEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getType() {
		return typeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjeto() {
		return projetoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjeto_Classes() {
		return (EReference)projetoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjeto_Component() {
		return (EReference)projetoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjeto_Enumerate() {
		return (EReference)projetoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjeto_FirebaseAuth() {
		return (EReference)projetoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjeto_RelationClasses() {
		return (EReference)projetoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjeto_RelationAttributeToComponent() {
		return (EReference)projetoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JacroidEMFFactory getJacroidEMFFactory() {
		return (JacroidEMFFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		projetoEClass = createEClass(PROJETO);
		createEReference(projetoEClass, PROJETO__CLASSES);
		createEReference(projetoEClass, PROJETO__COMPONENT);
		createEReference(projetoEClass, PROJETO__ENUMERATE);
		createEReference(projetoEClass, PROJETO__FIREBASE_AUTH);
		createEReference(projetoEClass, PROJETO__RELATION_CLASSES);
		createEReference(projetoEClass, PROJETO__RELATION_ATTRIBUTE_TO_COMPONENT);

		attributeDescriptorEClass = createEClass(ATTRIBUTE_DESCRIPTOR);
		createEAttribute(attributeDescriptorEClass, ATTRIBUTE_DESCRIPTOR__CLASSNAME);
		createEAttribute(attributeDescriptorEClass, ATTRIBUTE_DESCRIPTOR__COLUMN_TABLE);
		createEAttribute(attributeDescriptorEClass, ATTRIBUTE_DESCRIPTOR__EXHIBITION_NAME);
		createEAttribute(attributeDescriptorEClass, ATTRIBUTE_DESCRIPTOR__INPUT);
		createEAttribute(attributeDescriptorEClass, ATTRIBUTE_DESCRIPTOR__IS_COLUMN);
		createEAttribute(attributeDescriptorEClass, ATTRIBUTE_DESCRIPTOR__NAME);
		createEAttribute(attributeDescriptorEClass, ATTRIBUTE_DESCRIPTOR__PRIMARY_KEY);
		createEAttribute(attributeDescriptorEClass, ATTRIBUTE_DESCRIPTOR__PRIMARY_KEY_TABLE);
		createEAttribute(attributeDescriptorEClass, ATTRIBUTE_DESCRIPTOR__TYPE_DATA);

		classesDescriptorEClass = createEClass(CLASSES_DESCRIPTOR);
		createEAttribute(classesDescriptorEClass, CLASSES_DESCRIPTOR__NAME);
		createEAttribute(classesDescriptorEClass, CLASSES_DESCRIPTOR__TABLE_NAME);
		createEReference(classesDescriptorEClass, CLASSES_DESCRIPTOR__ATTRIBUTES);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__NAME);
		createEAttribute(componentEClass, COMPONENT__TYPE);

		firebaseAuthEClass = createEClass(FIREBASE_AUTH);
		createEAttribute(firebaseAuthEClass, FIREBASE_AUTH__NAME);

		enumerateEClass = createEClass(ENUMERATE);
		createEAttribute(enumerateEClass, ENUMERATE__NAME);
		createEReference(enumerateEClass, ENUMERATE__ITEM);

		itemEnumEClass = createEClass(ITEM_ENUM);
		createEAttribute(itemEnumEClass, ITEM_ENUM__NAME);

		relationClassesDescriptorEClass = createEClass(RELATION_CLASSES_DESCRIPTOR);
		createEReference(relationClassesDescriptorEClass, RELATION_CLASSES_DESCRIPTOR__SOURCE);
		createEReference(relationClassesDescriptorEClass, RELATION_CLASSES_DESCRIPTOR__TARGET);

		relationAttributeDescriptorToComponentEClass = createEClass(RELATION_ATTRIBUTE_DESCRIPTOR_TO_COMPONENT);
		createEReference(relationAttributeDescriptorToComponentEClass, RELATION_ATTRIBUTE_DESCRIPTOR_TO_COMPONENT__SOURCE);
		createEReference(relationAttributeDescriptorToComponentEClass, RELATION_ATTRIBUTE_DESCRIPTOR_TO_COMPONENT__TARGET);

		// Create enums
		typeDataEEnum = createEEnum(TYPE_DATA);
		typeEEnum = createEEnum(TYPE);
		inputEEnum = createEEnum(INPUT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(projetoEClass, Projeto.class, "Projeto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProjeto_Classes(), this.getClassesDescriptor(), null, "classes", null, 0, -1, Projeto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProjeto_Component(), this.getComponent(), null, "component", null, 0, -1, Projeto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProjeto_Enumerate(), this.getEnumerate(), null, "enumerate", null, 0, -1, Projeto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProjeto_FirebaseAuth(), this.getFirebaseAuth(), null, "firebaseAuth", null, 0, 1, Projeto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProjeto_RelationClasses(), this.getRelationClassesDescriptor(), null, "relationClasses", null, 0, -1, Projeto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProjeto_RelationAttributeToComponent(), this.getRelationAttributeDescriptorToComponent(), null, "relationAttributeToComponent", null, 0, -1, Projeto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeDescriptorEClass, AttributeDescriptor.class, "AttributeDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeDescriptor_Classname(), ecorePackage.getEString(), "classname", null, 0, 1, AttributeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeDescriptor_ColumnTable(), ecorePackage.getEString(), "columnTable", null, 0, 1, AttributeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeDescriptor_ExhibitionName(), ecorePackage.getEString(), "exhibitionName", null, 0, 1, AttributeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeDescriptor_Input(), this.getInput(), "input", null, 0, 1, AttributeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeDescriptor_IsColumn(), ecorePackage.getEBooleanObject(), "isColumn", null, 0, 1, AttributeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeDescriptor_Name(), ecorePackage.getEString(), "name", null, 0, 1, AttributeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeDescriptor_PrimaryKey(), ecorePackage.getEBooleanObject(), "primaryKey", "false", 0, 1, AttributeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeDescriptor_PrimaryKeyTable(), ecorePackage.getEBooleanObject(), "primaryKeyTable", "false", 0, 1, AttributeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeDescriptor_TypeData(), this.getTypeData(), "typeData", null, 0, 1, AttributeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classesDescriptorEClass, ClassesDescriptor.class, "ClassesDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassesDescriptor_Name(), ecorePackage.getEString(), "name", null, 0, 1, ClassesDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassesDescriptor_TableName(), ecorePackage.getEString(), "tableName", null, 0, 1, ClassesDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassesDescriptor_Attributes(), this.getAttributeDescriptor(), null, "attributes", null, 0, -1, ClassesDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Type(), this.getType(), "type", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(firebaseAuthEClass, FirebaseAuth.class, "FirebaseAuth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFirebaseAuth_Name(), ecorePackage.getEString(), "name", null, 0, 1, FirebaseAuth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerateEClass, Enumerate.class, "Enumerate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumerate_Name(), ecorePackage.getEString(), "name", null, 0, 1, Enumerate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumerate_Item(), this.getItemEnum(), null, "item", null, 0, -1, Enumerate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemEnumEClass, ItemEnum.class, "ItemEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItemEnum_Name(), ecorePackage.getEString(), "name", null, 0, 1, ItemEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationClassesDescriptorEClass, RelationClassesDescriptor.class, "RelationClassesDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationClassesDescriptor_Source(), this.getClassesDescriptor(), null, "source", null, 0, 1, RelationClassesDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationClassesDescriptor_Target(), this.getClassesDescriptor(), null, "target", null, 0, 1, RelationClassesDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationAttributeDescriptorToComponentEClass, RelationAttributeDescriptorToComponent.class, "RelationAttributeDescriptorToComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationAttributeDescriptorToComponent_Source(), this.getAttributeDescriptor(), null, "source", null, 0, 1, RelationAttributeDescriptorToComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationAttributeDescriptorToComponent_Target(), this.getComponent(), null, "target", null, 0, 1, RelationAttributeDescriptorToComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeDataEEnum, TypeData.class, "TypeData");
		addEEnumLiteral(typeDataEEnum, TypeData.STRING);
		addEEnumLiteral(typeDataEEnum, TypeData.INT);
		addEEnumLiteral(typeDataEEnum, TypeData.LONG);
		addEEnumLiteral(typeDataEEnum, TypeData.BOOLEAN);
		addEEnumLiteral(typeDataEEnum, TypeData.ENUMERATE);
		addEEnumLiteral(typeDataEEnum, TypeData.IMAGE);

		initEEnum(typeEEnum, Type.class, "Type");
		addEEnumLiteral(typeEEnum, Type.NONE);
		addEEnumLiteral(typeEEnum, Type.GPS);
		addEEnumLiteral(typeEEnum, Type.CAMERA);
		addEEnumLiteral(typeEEnum, Type.NFC);

		initEEnum(inputEEnum, Input.class, "Input");
		addEEnumLiteral(inputEEnum, Input.SELECT);
		addEEnumLiteral(inputEEnum, Input.TEXT);
		addEEnumLiteral(inputEEnum, Input.CHECKBOX);
		addEEnumLiteral(inputEEnum, Input.RADIOBUTTON);
		addEEnumLiteral(inputEEnum, Input.HIDDEN);
		addEEnumLiteral(inputEEnum, Input.IMAGE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (projetoEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (attributeDescriptorEClass, 
		   source, 
		   new String[] {
			 "label", "name, typeData",
			 "figure", "rectangle",
			 "label.icon", "false",
			 "label.pattern", "{0} : {1}"
		   });	
		addAnnotation
		  (classesDescriptorEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (componentEClass, 
		   source, 
		   new String[] {
			 "label", "name, type",
			 "figure", "rectangle",
			 "label.pattern", "{0} use {1}"
		   });	
		addAnnotation
		  (firebaseAuthEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (enumerateEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (itemEnumEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "figure", "rectangle",
			 "label.icon", "false",
			 "label.pattern", "{0}"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getClassesDescriptor_Attributes(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "false"
		   });	
		addAnnotation
		  (getEnumerate_Item(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "false"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.link";	
		addAnnotation
		  (relationClassesDescriptorEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "target.decoration", "arrow",
			 "style", "solid",
			 "width", "2"
		   });	
		addAnnotation
		  (relationAttributeDescriptorToComponentEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "target.decoration", "arrow",
			 "style", "dot",
			 "width", "2"
		   });
	}

} //JacroidEMFPackageImpl
