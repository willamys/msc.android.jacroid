/**
 */
package jacroidEMF.impl;

import jacroidEMF.ClassesDescriptor;
import jacroidEMF.JacroidEMFPackage;
import jacroidEMF.RelationClassesDescriptor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Classes Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jacroidEMF.impl.RelationClassesDescriptorImpl#getSource <em>Source</em>}</li>
 *   <li>{@link jacroidEMF.impl.RelationClassesDescriptorImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationClassesDescriptorImpl extends EObjectImpl implements RelationClassesDescriptor {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ClassesDescriptor source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ClassesDescriptor target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationClassesDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JacroidEMFPackage.Literals.RELATION_CLASSES_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassesDescriptor getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (ClassesDescriptor)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JacroidEMFPackage.RELATION_CLASSES_DESCRIPTOR__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassesDescriptor basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ClassesDescriptor newSource) {
		ClassesDescriptor oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JacroidEMFPackage.RELATION_CLASSES_DESCRIPTOR__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassesDescriptor getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ClassesDescriptor)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JacroidEMFPackage.RELATION_CLASSES_DESCRIPTOR__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassesDescriptor basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ClassesDescriptor newTarget) {
		ClassesDescriptor oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JacroidEMFPackage.RELATION_CLASSES_DESCRIPTOR__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JacroidEMFPackage.RELATION_CLASSES_DESCRIPTOR__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case JacroidEMFPackage.RELATION_CLASSES_DESCRIPTOR__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case JacroidEMFPackage.RELATION_CLASSES_DESCRIPTOR__SOURCE:
				setSource((ClassesDescriptor)newValue);
				return;
			case JacroidEMFPackage.RELATION_CLASSES_DESCRIPTOR__TARGET:
				setTarget((ClassesDescriptor)newValue);
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
			case JacroidEMFPackage.RELATION_CLASSES_DESCRIPTOR__SOURCE:
				setSource((ClassesDescriptor)null);
				return;
			case JacroidEMFPackage.RELATION_CLASSES_DESCRIPTOR__TARGET:
				setTarget((ClassesDescriptor)null);
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
			case JacroidEMFPackage.RELATION_CLASSES_DESCRIPTOR__SOURCE:
				return source != null;
			case JacroidEMFPackage.RELATION_CLASSES_DESCRIPTOR__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //RelationClassesDescriptorImpl
