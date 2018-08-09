/**
 */
package jacroidEMF.impl;

import jacroidEMF.AttributeDescriptor;
import jacroidEMF.Component;
import jacroidEMF.JacroidEMFPackage;
import jacroidEMF.RelationAttributeDescriptorToComponent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Attribute Descriptor To Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jacroidEMF.impl.RelationAttributeDescriptorToComponentImpl#getSource <em>Source</em>}</li>
 *   <li>{@link jacroidEMF.impl.RelationAttributeDescriptorToComponentImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationAttributeDescriptorToComponentImpl extends EObjectImpl implements RelationAttributeDescriptorToComponent {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected AttributeDescriptor source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Component target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationAttributeDescriptorToComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JacroidEMFPackage.Literals.RELATION_ATTRIBUTE_DESCRIPTOR_TO_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDescriptor getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (AttributeDescriptor)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JacroidEMFPackage.RELATION_ATTRIBUTE_DESCRIPTOR_TO_COMPONENT__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDescriptor basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(AttributeDescriptor newSource) {
		AttributeDescriptor oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JacroidEMFPackage.RELATION_ATTRIBUTE_DESCRIPTOR_TO_COMPONENT__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Component)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JacroidEMFPackage.RELATION_ATTRIBUTE_DESCRIPTOR_TO_COMPONENT__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Component newTarget) {
		Component oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JacroidEMFPackage.RELATION_ATTRIBUTE_DESCRIPTOR_TO_COMPONENT__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JacroidEMFPackage.RELATION_ATTRIBUTE_DESCRIPTOR_TO_COMPONENT__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case JacroidEMFPackage.RELATION_ATTRIBUTE_DESCRIPTOR_TO_COMPONENT__TARGET:
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
			case JacroidEMFPackage.RELATION_ATTRIBUTE_DESCRIPTOR_TO_COMPONENT__SOURCE:
				setSource((AttributeDescriptor)newValue);
				return;
			case JacroidEMFPackage.RELATION_ATTRIBUTE_DESCRIPTOR_TO_COMPONENT__TARGET:
				setTarget((Component)newValue);
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
			case JacroidEMFPackage.RELATION_ATTRIBUTE_DESCRIPTOR_TO_COMPONENT__SOURCE:
				setSource((AttributeDescriptor)null);
				return;
			case JacroidEMFPackage.RELATION_ATTRIBUTE_DESCRIPTOR_TO_COMPONENT__TARGET:
				setTarget((Component)null);
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
			case JacroidEMFPackage.RELATION_ATTRIBUTE_DESCRIPTOR_TO_COMPONENT__SOURCE:
				return source != null;
			case JacroidEMFPackage.RELATION_ATTRIBUTE_DESCRIPTOR_TO_COMPONENT__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //RelationAttributeDescriptorToComponentImpl
