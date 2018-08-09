/**
 */
package jacroidEMF;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see jacroidEMF.JacroidEMFFactory
 * @model kind="package"
 * @generated
 */
public interface JacroidEMFPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jacroidEMF";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "jacroidEMF";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jacroidEMF";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JacroidEMFPackage eINSTANCE = jacroidEMF.impl.JacroidEMFPackageImpl.init();

	/**
	 * The meta object id for the '{@link jacroidEMF.impl.AttributeDescriptorImpl <em>Attribute Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jacroidEMF.impl.AttributeDescriptorImpl
	 * @see jacroidEMF.impl.JacroidEMFPackageImpl#getAttributeDescriptor()
	 * @generated
	 */
	int ATTRIBUTE_DESCRIPTOR = 1;

	/**
	 * The meta object id for the '{@link jacroidEMF.impl.ClassesDescriptorImpl <em>Classes Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jacroidEMF.impl.ClassesDescriptorImpl
	 * @see jacroidEMF.impl.JacroidEMFPackageImpl#getClassesDescriptor()
	 * @generated
	 */
	int CLASSES_DESCRIPTOR = 2;

	/**
	 * The meta object id for the '{@link jacroidEMF.impl.ProjetoImpl <em>Projeto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jacroidEMF.impl.ProjetoImpl
	 * @see jacroidEMF.impl.JacroidEMFPackageImpl#getProjeto()
	 * @generated
	 */
	int PROJETO = 0;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJETO__CLASSES = 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJETO__COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Enumerate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJETO__ENUMERATE = 2;

	/**
	 * The feature id for the '<em><b>Firebase Auth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJETO__FIREBASE_AUTH = 3;

	/**
	 * The feature id for the '<em><b>Relation Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJETO__RELATION_CLASSES = 4;

	/**
	 * The feature id for the '<em><b>Relation Attribute To Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJETO__RELATION_ATTRIBUTE_TO_COMPONENT = 5;

	/**
	 * The number of structural features of the '<em>Projeto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJETO_FEATURE_COUNT = 6;

	/**
	 * The feature id for the '<em><b>Classname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DESCRIPTOR__CLASSNAME = 0;

	/**
	 * The feature id for the '<em><b>Column Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DESCRIPTOR__COLUMN_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Exhibition Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DESCRIPTOR__EXHIBITION_NAME = 2;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DESCRIPTOR__INPUT = 3;

	/**
	 * The feature id for the '<em><b>Is Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DESCRIPTOR__IS_COLUMN = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DESCRIPTOR__NAME = 5;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DESCRIPTOR__PRIMARY_KEY = 6;

	/**
	 * The feature id for the '<em><b>Primary Key Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DESCRIPTOR__PRIMARY_KEY_TABLE = 7;

	/**
	 * The feature id for the '<em><b>Type Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DESCRIPTOR__TYPE_DATA = 8;

	/**
	 * The number of structural features of the '<em>Attribute Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DESCRIPTOR_FEATURE_COUNT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSES_DESCRIPTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSES_DESCRIPTOR__TABLE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSES_DESCRIPTOR__ATTRIBUTES = 2;

	/**
	 * The number of structural features of the '<em>Classes Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSES_DESCRIPTOR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link jacroidEMF.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jacroidEMF.impl.ComponentImpl
	 * @see jacroidEMF.impl.JacroidEMFPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link jacroidEMF.impl.FirebaseAuthImpl <em>Firebase Auth</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jacroidEMF.impl.FirebaseAuthImpl
	 * @see jacroidEMF.impl.JacroidEMFPackageImpl#getFirebaseAuth()
	 * @generated
	 */
	int FIREBASE_AUTH = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIREBASE_AUTH__NAME = 0;

	/**
	 * The number of structural features of the '<em>Firebase Auth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIREBASE_AUTH_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link jacroidEMF.impl.EnumerateImpl <em>Enumerate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jacroidEMF.impl.EnumerateImpl
	 * @see jacroidEMF.impl.JacroidEMFPackageImpl#getEnumerate()
	 * @generated
	 */
	int ENUMERATE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATE__ITEM = 1;

	/**
	 * The number of structural features of the '<em>Enumerate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link jacroidEMF.impl.ItemEnumImpl <em>Item Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jacroidEMF.impl.ItemEnumImpl
	 * @see jacroidEMF.impl.JacroidEMFPackageImpl#getItemEnum()
	 * @generated
	 */
	int ITEM_ENUM = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ENUM__NAME = 0;

	/**
	 * The number of structural features of the '<em>Item Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ENUM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link jacroidEMF.impl.RelationClassesDescriptorImpl <em>Relation Classes Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jacroidEMF.impl.RelationClassesDescriptorImpl
	 * @see jacroidEMF.impl.JacroidEMFPackageImpl#getRelationClassesDescriptor()
	 * @generated
	 */
	int RELATION_CLASSES_DESCRIPTOR = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CLASSES_DESCRIPTOR__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CLASSES_DESCRIPTOR__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Relation Classes Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CLASSES_DESCRIPTOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link jacroidEMF.impl.RelationAttributeDescriptorToComponentImpl <em>Relation Attribute Descriptor To Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jacroidEMF.impl.RelationAttributeDescriptorToComponentImpl
	 * @see jacroidEMF.impl.JacroidEMFPackageImpl#getRelationAttributeDescriptorToComponent()
	 * @generated
	 */
	int RELATION_ATTRIBUTE_DESCRIPTOR_TO_COMPONENT = 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ATTRIBUTE_DESCRIPTOR_TO_COMPONENT__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ATTRIBUTE_DESCRIPTOR_TO_COMPONENT__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Relation Attribute Descriptor To Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ATTRIBUTE_DESCRIPTOR_TO_COMPONENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link jacroidEMF.Input <em>Input</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jacroidEMF.Input
	 * @see jacroidEMF.impl.JacroidEMFPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 11;

	/**
	 * The meta object id for the '{@link jacroidEMF.TypeData <em>Type Data</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jacroidEMF.TypeData
	 * @see jacroidEMF.impl.JacroidEMFPackageImpl#getTypeData()
	 * @generated
	 */
	int TYPE_DATA = 9;

	/**
	 * The meta object id for the '{@link jacroidEMF.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jacroidEMF.Type
	 * @see jacroidEMF.impl.JacroidEMFPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 10;

	/**
	 * Returns the meta object for class '{@link jacroidEMF.AttributeDescriptor <em>Attribute Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Descriptor</em>'.
	 * @see jacroidEMF.AttributeDescriptor
	 * @generated
	 */
	EClass getAttributeDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link jacroidEMF.AttributeDescriptor#getClassname <em>Classname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classname</em>'.
	 * @see jacroidEMF.AttributeDescriptor#getClassname()
	 * @see #getAttributeDescriptor()
	 * @generated
	 */
	EAttribute getAttributeDescriptor_Classname();

	/**
	 * Returns the meta object for the attribute '{@link jacroidEMF.AttributeDescriptor#getColumnTable <em>Column Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Table</em>'.
	 * @see jacroidEMF.AttributeDescriptor#getColumnTable()
	 * @see #getAttributeDescriptor()
	 * @generated
	 */
	EAttribute getAttributeDescriptor_ColumnTable();

	/**
	 * Returns the meta object for the attribute '{@link jacroidEMF.AttributeDescriptor#getExhibitionName <em>Exhibition Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exhibition Name</em>'.
	 * @see jacroidEMF.AttributeDescriptor#getExhibitionName()
	 * @see #getAttributeDescriptor()
	 * @generated
	 */
	EAttribute getAttributeDescriptor_ExhibitionName();

	/**
	 * Returns the meta object for the attribute '{@link jacroidEMF.AttributeDescriptor#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see jacroidEMF.AttributeDescriptor#getInput()
	 * @see #getAttributeDescriptor()
	 * @generated
	 */
	EAttribute getAttributeDescriptor_Input();

	/**
	 * Returns the meta object for the attribute '{@link jacroidEMF.AttributeDescriptor#getIsColumn <em>Is Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Column</em>'.
	 * @see jacroidEMF.AttributeDescriptor#getIsColumn()
	 * @see #getAttributeDescriptor()
	 * @generated
	 */
	EAttribute getAttributeDescriptor_IsColumn();

	/**
	 * Returns the meta object for the attribute '{@link jacroidEMF.AttributeDescriptor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jacroidEMF.AttributeDescriptor#getName()
	 * @see #getAttributeDescriptor()
	 * @generated
	 */
	EAttribute getAttributeDescriptor_Name();

	/**
	 * Returns the meta object for the attribute '{@link jacroidEMF.AttributeDescriptor#getPrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Key</em>'.
	 * @see jacroidEMF.AttributeDescriptor#getPrimaryKey()
	 * @see #getAttributeDescriptor()
	 * @generated
	 */
	EAttribute getAttributeDescriptor_PrimaryKey();

	/**
	 * Returns the meta object for the attribute '{@link jacroidEMF.AttributeDescriptor#getPrimaryKeyTable <em>Primary Key Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Key Table</em>'.
	 * @see jacroidEMF.AttributeDescriptor#getPrimaryKeyTable()
	 * @see #getAttributeDescriptor()
	 * @generated
	 */
	EAttribute getAttributeDescriptor_PrimaryKeyTable();

	/**
	 * Returns the meta object for the attribute '{@link jacroidEMF.AttributeDescriptor#getTypeData <em>Type Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Data</em>'.
	 * @see jacroidEMF.AttributeDescriptor#getTypeData()
	 * @see #getAttributeDescriptor()
	 * @generated
	 */
	EAttribute getAttributeDescriptor_TypeData();

	/**
	 * Returns the meta object for class '{@link jacroidEMF.ClassesDescriptor <em>Classes Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classes Descriptor</em>'.
	 * @see jacroidEMF.ClassesDescriptor
	 * @generated
	 */
	EClass getClassesDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link jacroidEMF.ClassesDescriptor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jacroidEMF.ClassesDescriptor#getName()
	 * @see #getClassesDescriptor()
	 * @generated
	 */
	EAttribute getClassesDescriptor_Name();

	/**
	 * Returns the meta object for the attribute '{@link jacroidEMF.ClassesDescriptor#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see jacroidEMF.ClassesDescriptor#getTableName()
	 * @see #getClassesDescriptor()
	 * @generated
	 */
	EAttribute getClassesDescriptor_TableName();

	/**
	 * Returns the meta object for the containment reference list '{@link jacroidEMF.ClassesDescriptor#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see jacroidEMF.ClassesDescriptor#getAttributes()
	 * @see #getClassesDescriptor()
	 * @generated
	 */
	EReference getClassesDescriptor_Attributes();

	/**
	 * Returns the meta object for class '{@link jacroidEMF.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see jacroidEMF.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link jacroidEMF.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jacroidEMF.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link jacroidEMF.Component#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see jacroidEMF.Component#getType()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Type();

	/**
	 * Returns the meta object for class '{@link jacroidEMF.FirebaseAuth <em>Firebase Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Firebase Auth</em>'.
	 * @see jacroidEMF.FirebaseAuth
	 * @generated
	 */
	EClass getFirebaseAuth();

	/**
	 * Returns the meta object for the attribute '{@link jacroidEMF.FirebaseAuth#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jacroidEMF.FirebaseAuth#getName()
	 * @see #getFirebaseAuth()
	 * @generated
	 */
	EAttribute getFirebaseAuth_Name();

	/**
	 * Returns the meta object for class '{@link jacroidEMF.Enumerate <em>Enumerate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumerate</em>'.
	 * @see jacroidEMF.Enumerate
	 * @generated
	 */
	EClass getEnumerate();

	/**
	 * Returns the meta object for the attribute '{@link jacroidEMF.Enumerate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jacroidEMF.Enumerate#getName()
	 * @see #getEnumerate()
	 * @generated
	 */
	EAttribute getEnumerate_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link jacroidEMF.Enumerate#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see jacroidEMF.Enumerate#getItem()
	 * @see #getEnumerate()
	 * @generated
	 */
	EReference getEnumerate_Item();

	/**
	 * Returns the meta object for class '{@link jacroidEMF.ItemEnum <em>Item Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Enum</em>'.
	 * @see jacroidEMF.ItemEnum
	 * @generated
	 */
	EClass getItemEnum();

	/**
	 * Returns the meta object for the attribute '{@link jacroidEMF.ItemEnum#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jacroidEMF.ItemEnum#getName()
	 * @see #getItemEnum()
	 * @generated
	 */
	EAttribute getItemEnum_Name();

	/**
	 * Returns the meta object for class '{@link jacroidEMF.RelationClassesDescriptor <em>Relation Classes Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Classes Descriptor</em>'.
	 * @see jacroidEMF.RelationClassesDescriptor
	 * @generated
	 */
	EClass getRelationClassesDescriptor();

	/**
	 * Returns the meta object for the reference '{@link jacroidEMF.RelationClassesDescriptor#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see jacroidEMF.RelationClassesDescriptor#getSource()
	 * @see #getRelationClassesDescriptor()
	 * @generated
	 */
	EReference getRelationClassesDescriptor_Source();

	/**
	 * Returns the meta object for the reference '{@link jacroidEMF.RelationClassesDescriptor#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see jacroidEMF.RelationClassesDescriptor#getTarget()
	 * @see #getRelationClassesDescriptor()
	 * @generated
	 */
	EReference getRelationClassesDescriptor_Target();

	/**
	 * Returns the meta object for class '{@link jacroidEMF.RelationAttributeDescriptorToComponent <em>Relation Attribute Descriptor To Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Attribute Descriptor To Component</em>'.
	 * @see jacroidEMF.RelationAttributeDescriptorToComponent
	 * @generated
	 */
	EClass getRelationAttributeDescriptorToComponent();

	/**
	 * Returns the meta object for the reference '{@link jacroidEMF.RelationAttributeDescriptorToComponent#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see jacroidEMF.RelationAttributeDescriptorToComponent#getSource()
	 * @see #getRelationAttributeDescriptorToComponent()
	 * @generated
	 */
	EReference getRelationAttributeDescriptorToComponent_Source();

	/**
	 * Returns the meta object for the reference '{@link jacroidEMF.RelationAttributeDescriptorToComponent#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see jacroidEMF.RelationAttributeDescriptorToComponent#getTarget()
	 * @see #getRelationAttributeDescriptorToComponent()
	 * @generated
	 */
	EReference getRelationAttributeDescriptorToComponent_Target();

	/**
	 * Returns the meta object for enum '{@link jacroidEMF.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Input</em>'.
	 * @see jacroidEMF.Input
	 * @generated
	 */
	EEnum getInput();

	/**
	 * Returns the meta object for enum '{@link jacroidEMF.TypeData <em>Type Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Data</em>'.
	 * @see jacroidEMF.TypeData
	 * @generated
	 */
	EEnum getTypeData();

	/**
	 * Returns the meta object for enum '{@link jacroidEMF.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see jacroidEMF.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the meta object for class '{@link jacroidEMF.Projeto <em>Projeto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Projeto</em>'.
	 * @see jacroidEMF.Projeto
	 * @generated
	 */
	EClass getProjeto();

	/**
	 * Returns the meta object for the containment reference list '{@link jacroidEMF.Projeto#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see jacroidEMF.Projeto#getClasses()
	 * @see #getProjeto()
	 * @generated
	 */
	EReference getProjeto_Classes();

	/**
	 * Returns the meta object for the containment reference list '{@link jacroidEMF.Projeto#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see jacroidEMF.Projeto#getComponent()
	 * @see #getProjeto()
	 * @generated
	 */
	EReference getProjeto_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link jacroidEMF.Projeto#getEnumerate <em>Enumerate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumerate</em>'.
	 * @see jacroidEMF.Projeto#getEnumerate()
	 * @see #getProjeto()
	 * @generated
	 */
	EReference getProjeto_Enumerate();

	/**
	 * Returns the meta object for the containment reference '{@link jacroidEMF.Projeto#getFirebaseAuth <em>Firebase Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Firebase Auth</em>'.
	 * @see jacroidEMF.Projeto#getFirebaseAuth()
	 * @see #getProjeto()
	 * @generated
	 */
	EReference getProjeto_FirebaseAuth();

	/**
	 * Returns the meta object for the containment reference list '{@link jacroidEMF.Projeto#getRelationClasses <em>Relation Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relation Classes</em>'.
	 * @see jacroidEMF.Projeto#getRelationClasses()
	 * @see #getProjeto()
	 * @generated
	 */
	EReference getProjeto_RelationClasses();

	/**
	 * Returns the meta object for the containment reference list '{@link jacroidEMF.Projeto#getRelationAttributeToComponent <em>Relation Attribute To Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relation Attribute To Component</em>'.
	 * @see jacroidEMF.Projeto#getRelationAttributeToComponent()
	 * @see #getProjeto()
	 * @generated
	 */
	EReference getProjeto_RelationAttributeToComponent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JacroidEMFFactory getJacroidEMFFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link jacroidEMF.impl.AttributeDescriptorImpl <em>Attribute Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jacroidEMF.impl.AttributeDescriptorImpl
		 * @see jacroidEMF.impl.JacroidEMFPackageImpl#getAttributeDescriptor()
		 * @generated
		 */
		EClass ATTRIBUTE_DESCRIPTOR = eINSTANCE.getAttributeDescriptor();

		/**
		 * The meta object literal for the '<em><b>Classname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DESCRIPTOR__CLASSNAME = eINSTANCE.getAttributeDescriptor_Classname();

		/**
		 * The meta object literal for the '<em><b>Column Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DESCRIPTOR__COLUMN_TABLE = eINSTANCE.getAttributeDescriptor_ColumnTable();

		/**
		 * The meta object literal for the '<em><b>Exhibition Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DESCRIPTOR__EXHIBITION_NAME = eINSTANCE.getAttributeDescriptor_ExhibitionName();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DESCRIPTOR__INPUT = eINSTANCE.getAttributeDescriptor_Input();

		/**
		 * The meta object literal for the '<em><b>Is Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DESCRIPTOR__IS_COLUMN = eINSTANCE.getAttributeDescriptor_IsColumn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DESCRIPTOR__NAME = eINSTANCE.getAttributeDescriptor_Name();

		/**
		 * The meta object literal for the '<em><b>Primary Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DESCRIPTOR__PRIMARY_KEY = eINSTANCE.getAttributeDescriptor_PrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Primary Key Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DESCRIPTOR__PRIMARY_KEY_TABLE = eINSTANCE.getAttributeDescriptor_PrimaryKeyTable();

		/**
		 * The meta object literal for the '<em><b>Type Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DESCRIPTOR__TYPE_DATA = eINSTANCE.getAttributeDescriptor_TypeData();

		/**
		 * The meta object literal for the '{@link jacroidEMF.impl.ClassesDescriptorImpl <em>Classes Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jacroidEMF.impl.ClassesDescriptorImpl
		 * @see jacroidEMF.impl.JacroidEMFPackageImpl#getClassesDescriptor()
		 * @generated
		 */
		EClass CLASSES_DESCRIPTOR = eINSTANCE.getClassesDescriptor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSES_DESCRIPTOR__NAME = eINSTANCE.getClassesDescriptor_Name();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSES_DESCRIPTOR__TABLE_NAME = eINSTANCE.getClassesDescriptor_TableName();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSES_DESCRIPTOR__ATTRIBUTES = eINSTANCE.getClassesDescriptor_Attributes();

		/**
		 * The meta object literal for the '{@link jacroidEMF.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jacroidEMF.impl.ComponentImpl
		 * @see jacroidEMF.impl.JacroidEMFPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__TYPE = eINSTANCE.getComponent_Type();

		/**
		 * The meta object literal for the '{@link jacroidEMF.impl.FirebaseAuthImpl <em>Firebase Auth</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jacroidEMF.impl.FirebaseAuthImpl
		 * @see jacroidEMF.impl.JacroidEMFPackageImpl#getFirebaseAuth()
		 * @generated
		 */
		EClass FIREBASE_AUTH = eINSTANCE.getFirebaseAuth();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIREBASE_AUTH__NAME = eINSTANCE.getFirebaseAuth_Name();

		/**
		 * The meta object literal for the '{@link jacroidEMF.impl.EnumerateImpl <em>Enumerate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jacroidEMF.impl.EnumerateImpl
		 * @see jacroidEMF.impl.JacroidEMFPackageImpl#getEnumerate()
		 * @generated
		 */
		EClass ENUMERATE = eINSTANCE.getEnumerate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATE__NAME = eINSTANCE.getEnumerate_Name();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATE__ITEM = eINSTANCE.getEnumerate_Item();

		/**
		 * The meta object literal for the '{@link jacroidEMF.impl.ItemEnumImpl <em>Item Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jacroidEMF.impl.ItemEnumImpl
		 * @see jacroidEMF.impl.JacroidEMFPackageImpl#getItemEnum()
		 * @generated
		 */
		EClass ITEM_ENUM = eINSTANCE.getItemEnum();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_ENUM__NAME = eINSTANCE.getItemEnum_Name();

		/**
		 * The meta object literal for the '{@link jacroidEMF.impl.RelationClassesDescriptorImpl <em>Relation Classes Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jacroidEMF.impl.RelationClassesDescriptorImpl
		 * @see jacroidEMF.impl.JacroidEMFPackageImpl#getRelationClassesDescriptor()
		 * @generated
		 */
		EClass RELATION_CLASSES_DESCRIPTOR = eINSTANCE.getRelationClassesDescriptor();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_CLASSES_DESCRIPTOR__SOURCE = eINSTANCE.getRelationClassesDescriptor_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_CLASSES_DESCRIPTOR__TARGET = eINSTANCE.getRelationClassesDescriptor_Target();

		/**
		 * The meta object literal for the '{@link jacroidEMF.impl.RelationAttributeDescriptorToComponentImpl <em>Relation Attribute Descriptor To Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jacroidEMF.impl.RelationAttributeDescriptorToComponentImpl
		 * @see jacroidEMF.impl.JacroidEMFPackageImpl#getRelationAttributeDescriptorToComponent()
		 * @generated
		 */
		EClass RELATION_ATTRIBUTE_DESCRIPTOR_TO_COMPONENT = eINSTANCE.getRelationAttributeDescriptorToComponent();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_ATTRIBUTE_DESCRIPTOR_TO_COMPONENT__SOURCE = eINSTANCE.getRelationAttributeDescriptorToComponent_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_ATTRIBUTE_DESCRIPTOR_TO_COMPONENT__TARGET = eINSTANCE.getRelationAttributeDescriptorToComponent_Target();

		/**
		 * The meta object literal for the '{@link jacroidEMF.Input <em>Input</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jacroidEMF.Input
		 * @see jacroidEMF.impl.JacroidEMFPackageImpl#getInput()
		 * @generated
		 */
		EEnum INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '{@link jacroidEMF.TypeData <em>Type Data</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jacroidEMF.TypeData
		 * @see jacroidEMF.impl.JacroidEMFPackageImpl#getTypeData()
		 * @generated
		 */
		EEnum TYPE_DATA = eINSTANCE.getTypeData();

		/**
		 * The meta object literal for the '{@link jacroidEMF.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jacroidEMF.Type
		 * @see jacroidEMF.impl.JacroidEMFPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link jacroidEMF.impl.ProjetoImpl <em>Projeto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jacroidEMF.impl.ProjetoImpl
		 * @see jacroidEMF.impl.JacroidEMFPackageImpl#getProjeto()
		 * @generated
		 */
		EClass PROJETO = eINSTANCE.getProjeto();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJETO__CLASSES = eINSTANCE.getProjeto_Classes();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJETO__COMPONENT = eINSTANCE.getProjeto_Component();

		/**
		 * The meta object literal for the '<em><b>Enumerate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJETO__ENUMERATE = eINSTANCE.getProjeto_Enumerate();

		/**
		 * The meta object literal for the '<em><b>Firebase Auth</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJETO__FIREBASE_AUTH = eINSTANCE.getProjeto_FirebaseAuth();

		/**
		 * The meta object literal for the '<em><b>Relation Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJETO__RELATION_CLASSES = eINSTANCE.getProjeto_RelationClasses();

		/**
		 * The meta object literal for the '<em><b>Relation Attribute To Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJETO__RELATION_ATTRIBUTE_TO_COMPONENT = eINSTANCE.getProjeto_RelationAttributeToComponent();

	}

} //JacroidEMFPackage
