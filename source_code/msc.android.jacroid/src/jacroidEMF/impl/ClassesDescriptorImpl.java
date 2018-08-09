/**
 */
package jacroidEMF.impl;

import jacroidEMF.AttributeDescriptor;
import jacroidEMF.ClassesDescriptor;
import jacroidEMF.JacroidEMFPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classes Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jacroidEMF.impl.ClassesDescriptorImpl#getName <em>Name</em>}</li>
 *   <li>{@link jacroidEMF.impl.ClassesDescriptorImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link jacroidEMF.impl.ClassesDescriptorImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassesDescriptorImpl extends EObjectImpl implements ClassesDescriptor {
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
	 * The default value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName()
	 * @generated
	 * @ordered
	 */
	protected String tableName = TABLE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeDescriptor> attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassesDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JacroidEMFPackage.Literals.CLASSES_DESCRIPTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JacroidEMFPackage.CLASSES_DESCRIPTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTableName() {
		return tableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableName(String newTableName) {
		String oldTableName = tableName;
		tableName = newTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JacroidEMFPackage.CLASSES_DESCRIPTOR__TABLE_NAME, oldTableName, tableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeDescriptor> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<AttributeDescriptor>(AttributeDescriptor.class, this, JacroidEMFPackage.CLASSES_DESCRIPTOR__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JacroidEMFPackage.CLASSES_DESCRIPTOR__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JacroidEMFPackage.CLASSES_DESCRIPTOR__NAME:
				return getName();
			case JacroidEMFPackage.CLASSES_DESCRIPTOR__TABLE_NAME:
				return getTableName();
			case JacroidEMFPackage.CLASSES_DESCRIPTOR__ATTRIBUTES:
				return getAttributes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JacroidEMFPackage.CLASSES_DESCRIPTOR__NAME:
				setName((String)newValue);
				return;
			case JacroidEMFPackage.CLASSES_DESCRIPTOR__TABLE_NAME:
				setTableName((String)newValue);
				return;
			case JacroidEMFPackage.CLASSES_DESCRIPTOR__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends AttributeDescriptor>)newValue);
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
			case JacroidEMFPackage.CLASSES_DESCRIPTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JacroidEMFPackage.CLASSES_DESCRIPTOR__TABLE_NAME:
				setTableName(TABLE_NAME_EDEFAULT);
				return;
			case JacroidEMFPackage.CLASSES_DESCRIPTOR__ATTRIBUTES:
				getAttributes().clear();
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
			case JacroidEMFPackage.CLASSES_DESCRIPTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JacroidEMFPackage.CLASSES_DESCRIPTOR__TABLE_NAME:
				return TABLE_NAME_EDEFAULT == null ? tableName != null : !TABLE_NAME_EDEFAULT.equals(tableName);
			case JacroidEMFPackage.CLASSES_DESCRIPTOR__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", tableName: ");
		result.append(tableName);
		result.append(')');
		return result.toString();
	}

} //ClassesDescriptorImpl
