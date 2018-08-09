/**
 */
package jacroidEMF;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jacroidEMF.AttributeDescriptor#getClassname <em>Classname</em>}</li>
 *   <li>{@link jacroidEMF.AttributeDescriptor#getColumnTable <em>Column Table</em>}</li>
 *   <li>{@link jacroidEMF.AttributeDescriptor#getExhibitionName <em>Exhibition Name</em>}</li>
 *   <li>{@link jacroidEMF.AttributeDescriptor#getInput <em>Input</em>}</li>
 *   <li>{@link jacroidEMF.AttributeDescriptor#getIsColumn <em>Is Column</em>}</li>
 *   <li>{@link jacroidEMF.AttributeDescriptor#getName <em>Name</em>}</li>
 *   <li>{@link jacroidEMF.AttributeDescriptor#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link jacroidEMF.AttributeDescriptor#getPrimaryKeyTable <em>Primary Key Table</em>}</li>
 *   <li>{@link jacroidEMF.AttributeDescriptor#getTypeData <em>Type Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see jacroidEMF.JacroidEMFPackage#getAttributeDescriptor()
 * @model annotation="gmf.node label='name, typeData' figure='rectangle' label.icon='false' label.pattern='{0} : {1}'"
 * @generated
 */
public interface AttributeDescriptor extends EObject {
	/**
	 * Returns the value of the '<em><b>Classname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classname</em>' attribute.
	 * @see #setClassname(String)
	 * @see jacroidEMF.JacroidEMFPackage#getAttributeDescriptor_Classname()
	 * @model
	 * @generated
	 */
	String getClassname();

	/**
	 * Sets the value of the '{@link jacroidEMF.AttributeDescriptor#getClassname <em>Classname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classname</em>' attribute.
	 * @see #getClassname()
	 * @generated
	 */
	void setClassname(String value);

	/**
	 * Returns the value of the '<em><b>Column Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Table</em>' attribute.
	 * @see #setColumnTable(String)
	 * @see jacroidEMF.JacroidEMFPackage#getAttributeDescriptor_ColumnTable()
	 * @model
	 * @generated
	 */
	String getColumnTable();

	/**
	 * Sets the value of the '{@link jacroidEMF.AttributeDescriptor#getColumnTable <em>Column Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Table</em>' attribute.
	 * @see #getColumnTable()
	 * @generated
	 */
	void setColumnTable(String value);

	/**
	 * Returns the value of the '<em><b>Exhibition Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exhibition Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exhibition Name</em>' attribute.
	 * @see #setExhibitionName(String)
	 * @see jacroidEMF.JacroidEMFPackage#getAttributeDescriptor_ExhibitionName()
	 * @model
	 * @generated
	 */
	String getExhibitionName();

	/**
	 * Sets the value of the '{@link jacroidEMF.AttributeDescriptor#getExhibitionName <em>Exhibition Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exhibition Name</em>' attribute.
	 * @see #getExhibitionName()
	 * @generated
	 */
	void setExhibitionName(String value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' attribute.
	 * The literals are from the enumeration {@link jacroidEMF.Input}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' attribute.
	 * @see jacroidEMF.Input
	 * @see #setInput(Input)
	 * @see jacroidEMF.JacroidEMFPackage#getAttributeDescriptor_Input()
	 * @model
	 * @generated
	 */
	Input getInput();

	/**
	 * Sets the value of the '{@link jacroidEMF.AttributeDescriptor#getInput <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' attribute.
	 * @see jacroidEMF.Input
	 * @see #getInput()
	 * @generated
	 */
	void setInput(Input value);

	/**
	 * Returns the value of the '<em><b>Is Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Column</em>' attribute.
	 * @see #setIsColumn(Boolean)
	 * @see jacroidEMF.JacroidEMFPackage#getAttributeDescriptor_IsColumn()
	 * @model
	 * @generated
	 */
	Boolean getIsColumn();

	/**
	 * Sets the value of the '{@link jacroidEMF.AttributeDescriptor#getIsColumn <em>Is Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Column</em>' attribute.
	 * @see #getIsColumn()
	 * @generated
	 */
	void setIsColumn(Boolean value);

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
	 * @see jacroidEMF.JacroidEMFPackage#getAttributeDescriptor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link jacroidEMF.AttributeDescriptor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Primary Key</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key</em>' attribute.
	 * @see #setPrimaryKey(Boolean)
	 * @see jacroidEMF.JacroidEMFPackage#getAttributeDescriptor_PrimaryKey()
	 * @model default="false"
	 * @generated
	 */
	Boolean getPrimaryKey();

	/**
	 * Sets the value of the '{@link jacroidEMF.AttributeDescriptor#getPrimaryKey <em>Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key</em>' attribute.
	 * @see #getPrimaryKey()
	 * @generated
	 */
	void setPrimaryKey(Boolean value);

	/**
	 * Returns the value of the '<em><b>Primary Key Table</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Key Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key Table</em>' attribute.
	 * @see #setPrimaryKeyTable(Boolean)
	 * @see jacroidEMF.JacroidEMFPackage#getAttributeDescriptor_PrimaryKeyTable()
	 * @model default="false"
	 * @generated
	 */
	Boolean getPrimaryKeyTable();

	/**
	 * Sets the value of the '{@link jacroidEMF.AttributeDescriptor#getPrimaryKeyTable <em>Primary Key Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key Table</em>' attribute.
	 * @see #getPrimaryKeyTable()
	 * @generated
	 */
	void setPrimaryKeyTable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Type Data</b></em>' attribute.
	 * The literals are from the enumeration {@link jacroidEMF.TypeData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Data</em>' attribute.
	 * @see jacroidEMF.TypeData
	 * @see #setTypeData(TypeData)
	 * @see jacroidEMF.JacroidEMFPackage#getAttributeDescriptor_TypeData()
	 * @model
	 * @generated
	 */
	TypeData getTypeData();

	/**
	 * Sets the value of the '{@link jacroidEMF.AttributeDescriptor#getTypeData <em>Type Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Data</em>' attribute.
	 * @see jacroidEMF.TypeData
	 * @see #getTypeData()
	 * @generated
	 */
	void setTypeData(TypeData value);

} // AttributeDescriptor
