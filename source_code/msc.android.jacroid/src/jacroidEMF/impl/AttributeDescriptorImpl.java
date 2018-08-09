/**
 */
package jacroidEMF.impl;

import jacroidEMF.AttributeDescriptor;
import jacroidEMF.Input;
import jacroidEMF.JacroidEMFPackage;

import jacroidEMF.TypeData;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jacroidEMF.impl.AttributeDescriptorImpl#getClassname <em>Classname</em>}</li>
 *   <li>{@link jacroidEMF.impl.AttributeDescriptorImpl#getColumnTable <em>Column Table</em>}</li>
 *   <li>{@link jacroidEMF.impl.AttributeDescriptorImpl#getExhibitionName <em>Exhibition Name</em>}</li>
 *   <li>{@link jacroidEMF.impl.AttributeDescriptorImpl#getInput <em>Input</em>}</li>
 *   <li>{@link jacroidEMF.impl.AttributeDescriptorImpl#getIsColumn <em>Is Column</em>}</li>
 *   <li>{@link jacroidEMF.impl.AttributeDescriptorImpl#getName <em>Name</em>}</li>
 *   <li>{@link jacroidEMF.impl.AttributeDescriptorImpl#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link jacroidEMF.impl.AttributeDescriptorImpl#getPrimaryKeyTable <em>Primary Key Table</em>}</li>
 *   <li>{@link jacroidEMF.impl.AttributeDescriptorImpl#getTypeData <em>Type Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeDescriptorImpl extends EObjectImpl implements AttributeDescriptor {
	/**
	 * The default value of the '{@link #getClassname() <em>Classname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassname()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassname() <em>Classname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassname()
	 * @generated
	 * @ordered
	 */
	protected String classname = CLASSNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnTable() <em>Column Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnTable()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_TABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnTable() <em>Column Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnTable()
	 * @generated
	 * @ordered
	 */
	protected String columnTable = COLUMN_TABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExhibitionName() <em>Exhibition Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExhibitionName()
	 * @generated
	 * @ordered
	 */
	protected static final String EXHIBITION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExhibitionName() <em>Exhibition Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExhibitionName()
	 * @generated
	 * @ordered
	 */
	protected String exhibitionName = EXHIBITION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getInput() <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected static final Input INPUT_EDEFAULT = Input.SELECT;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected Input input = INPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsColumn() <em>Is Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsColumn()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_COLUMN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsColumn() <em>Is Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsColumn()
	 * @generated
	 * @ordered
	 */
	protected Boolean isColumn = IS_COLUMN_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimaryKey() <em>Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PRIMARY_KEY_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getPrimaryKey() <em>Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected Boolean primaryKey = PRIMARY_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimaryKeyTable() <em>Primary Key Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryKeyTable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PRIMARY_KEY_TABLE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getPrimaryKeyTable() <em>Primary Key Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryKeyTable()
	 * @generated
	 * @ordered
	 */
	protected Boolean primaryKeyTable = PRIMARY_KEY_TABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeData() <em>Type Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeData()
	 * @generated
	 * @ordered
	 */
	protected static final TypeData TYPE_DATA_EDEFAULT = TypeData.STRING;

	/**
	 * The cached value of the '{@link #getTypeData() <em>Type Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeData()
	 * @generated
	 * @ordered
	 */
	protected TypeData typeData = TYPE_DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JacroidEMFPackage.Literals.ATTRIBUTE_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassname() {
		return classname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassname(String newClassname) {
		String oldClassname = classname;
		classname = newClassname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__CLASSNAME, oldClassname, classname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnTable() {
		return columnTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnTable(String newColumnTable) {
		String oldColumnTable = columnTable;
		columnTable = newColumnTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__COLUMN_TABLE, oldColumnTable, columnTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExhibitionName() {
		return exhibitionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExhibitionName(String newExhibitionName) {
		String oldExhibitionName = exhibitionName;
		exhibitionName = newExhibitionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__EXHIBITION_NAME, oldExhibitionName, exhibitionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input getInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(Input newInput) {
		Input oldInput = input;
		input = newInput == null ? INPUT_EDEFAULT : newInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__INPUT, oldInput, input));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsColumn() {
		return isColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsColumn(Boolean newIsColumn) {
		Boolean oldIsColumn = isColumn;
		isColumn = newIsColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__IS_COLUMN, oldIsColumn, isColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getPrimaryKey() {
		return primaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryKey(Boolean newPrimaryKey) {
		Boolean oldPrimaryKey = primaryKey;
		primaryKey = newPrimaryKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__PRIMARY_KEY, oldPrimaryKey, primaryKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getPrimaryKeyTable() {
		return primaryKeyTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryKeyTable(Boolean newPrimaryKeyTable) {
		Boolean oldPrimaryKeyTable = primaryKeyTable;
		primaryKeyTable = newPrimaryKeyTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__PRIMARY_KEY_TABLE, oldPrimaryKeyTable, primaryKeyTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeData getTypeData() {
		return typeData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeData(TypeData newTypeData) {
		TypeData oldTypeData = typeData;
		typeData = newTypeData == null ? TYPE_DATA_EDEFAULT : newTypeData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__TYPE_DATA, oldTypeData, typeData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__CLASSNAME:
				return getClassname();
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__COLUMN_TABLE:
				return getColumnTable();
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__EXHIBITION_NAME:
				return getExhibitionName();
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__INPUT:
				return getInput();
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__IS_COLUMN:
				return getIsColumn();
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__NAME:
				return getName();
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__PRIMARY_KEY:
				return getPrimaryKey();
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__PRIMARY_KEY_TABLE:
				return getPrimaryKeyTable();
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__TYPE_DATA:
				return getTypeData();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__CLASSNAME:
				setClassname((String)newValue);
				return;
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__COLUMN_TABLE:
				setColumnTable((String)newValue);
				return;
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__EXHIBITION_NAME:
				setExhibitionName((String)newValue);
				return;
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__INPUT:
				setInput((Input)newValue);
				return;
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__IS_COLUMN:
				setIsColumn((Boolean)newValue);
				return;
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__NAME:
				setName((String)newValue);
				return;
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__PRIMARY_KEY:
				setPrimaryKey((Boolean)newValue);
				return;
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__PRIMARY_KEY_TABLE:
				setPrimaryKeyTable((Boolean)newValue);
				return;
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__TYPE_DATA:
				setTypeData((TypeData)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__CLASSNAME:
				setClassname(CLASSNAME_EDEFAULT);
				return;
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__COLUMN_TABLE:
				setColumnTable(COLUMN_TABLE_EDEFAULT);
				return;
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__EXHIBITION_NAME:
				setExhibitionName(EXHIBITION_NAME_EDEFAULT);
				return;
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__INPUT:
				setInput(INPUT_EDEFAULT);
				return;
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__IS_COLUMN:
				setIsColumn(IS_COLUMN_EDEFAULT);
				return;
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__PRIMARY_KEY:
				setPrimaryKey(PRIMARY_KEY_EDEFAULT);
				return;
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__PRIMARY_KEY_TABLE:
				setPrimaryKeyTable(PRIMARY_KEY_TABLE_EDEFAULT);
				return;
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__TYPE_DATA:
				setTypeData(TYPE_DATA_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__CLASSNAME:
				return CLASSNAME_EDEFAULT == null ? classname != null : !CLASSNAME_EDEFAULT.equals(classname);
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__COLUMN_TABLE:
				return COLUMN_TABLE_EDEFAULT == null ? columnTable != null : !COLUMN_TABLE_EDEFAULT.equals(columnTable);
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__EXHIBITION_NAME:
				return EXHIBITION_NAME_EDEFAULT == null ? exhibitionName != null : !EXHIBITION_NAME_EDEFAULT.equals(exhibitionName);
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__INPUT:
				return input != INPUT_EDEFAULT;
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__IS_COLUMN:
				return IS_COLUMN_EDEFAULT == null ? isColumn != null : !IS_COLUMN_EDEFAULT.equals(isColumn);
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__PRIMARY_KEY:
				return PRIMARY_KEY_EDEFAULT == null ? primaryKey != null : !PRIMARY_KEY_EDEFAULT.equals(primaryKey);
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__PRIMARY_KEY_TABLE:
				return PRIMARY_KEY_TABLE_EDEFAULT == null ? primaryKeyTable != null : !PRIMARY_KEY_TABLE_EDEFAULT.equals(primaryKeyTable);
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__TYPE_DATA:
				return typeData != TYPE_DATA_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (classname: ");
		result.append(classname);
		result.append(", columnTable: ");
		result.append(columnTable);
		result.append(", exhibitionName: ");
		result.append(exhibitionName);
		result.append(", input: ");
		result.append(input);
		result.append(", isColumn: ");
		result.append(isColumn);
		result.append(", name: ");
		result.append(name);
		result.append(", primaryKey: ");
		result.append(primaryKey);
		result.append(", primaryKeyTable: ");
		result.append(primaryKeyTable);
		result.append(", typeData: ");
		result.append(typeData);
		result.append(')');
		return result.toString();
	}

} //AttributeDescriptorImpl
