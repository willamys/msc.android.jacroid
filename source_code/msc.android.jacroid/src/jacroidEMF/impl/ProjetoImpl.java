/**
 */
package jacroidEMF.impl;

import jacroidEMF.ClassesDescriptor;
import jacroidEMF.Component;
import jacroidEMF.Enumerate;
import jacroidEMF.FirebaseAuth;
import jacroidEMF.JacroidEMFPackage;
import jacroidEMF.Projeto;

import jacroidEMF.RelationAttributeDescriptorToComponent;
import jacroidEMF.RelationClassesDescriptor;
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
 * An implementation of the model object '<em><b>Projeto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jacroidEMF.impl.ProjetoImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link jacroidEMF.impl.ProjetoImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link jacroidEMF.impl.ProjetoImpl#getEnumerate <em>Enumerate</em>}</li>
 *   <li>{@link jacroidEMF.impl.ProjetoImpl#getFirebaseAuth <em>Firebase Auth</em>}</li>
 *   <li>{@link jacroidEMF.impl.ProjetoImpl#getRelationClasses <em>Relation Classes</em>}</li>
 *   <li>{@link jacroidEMF.impl.ProjetoImpl#getRelationAttributeToComponent <em>Relation Attribute To Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjetoImpl extends EObjectImpl implements Projeto {
	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassesDescriptor> classes;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> component;

	/**
	 * The cached value of the '{@link #getEnumerate() <em>Enumerate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerate()
	 * @generated
	 * @ordered
	 */
	protected EList<Enumerate> enumerate;

	/**
	 * The cached value of the '{@link #getFirebaseAuth() <em>Firebase Auth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirebaseAuth()
	 * @generated
	 * @ordered
	 */
	protected FirebaseAuth firebaseAuth;

	/**
	 * The cached value of the '{@link #getRelationClasses() <em>Relation Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationClassesDescriptor> relationClasses;

	/**
	 * The cached value of the '{@link #getRelationAttributeToComponent() <em>Relation Attribute To Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationAttributeToComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationAttributeDescriptorToComponent> relationAttributeToComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjetoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JacroidEMFPackage.Literals.PROJETO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassesDescriptor> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentEList<ClassesDescriptor>(ClassesDescriptor.class, this, JacroidEMFPackage.PROJETO__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<Component>(Component.class, this, JacroidEMFPackage.PROJETO__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Enumerate> getEnumerate() {
		if (enumerate == null) {
			enumerate = new EObjectContainmentEList<Enumerate>(Enumerate.class, this, JacroidEMFPackage.PROJETO__ENUMERATE);
		}
		return enumerate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirebaseAuth getFirebaseAuth() {
		return firebaseAuth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirebaseAuth(FirebaseAuth newFirebaseAuth, NotificationChain msgs) {
		FirebaseAuth oldFirebaseAuth = firebaseAuth;
		firebaseAuth = newFirebaseAuth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JacroidEMFPackage.PROJETO__FIREBASE_AUTH, oldFirebaseAuth, newFirebaseAuth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirebaseAuth(FirebaseAuth newFirebaseAuth) {
		if (newFirebaseAuth != firebaseAuth) {
			NotificationChain msgs = null;
			if (firebaseAuth != null)
				msgs = ((InternalEObject)firebaseAuth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JacroidEMFPackage.PROJETO__FIREBASE_AUTH, null, msgs);
			if (newFirebaseAuth != null)
				msgs = ((InternalEObject)newFirebaseAuth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JacroidEMFPackage.PROJETO__FIREBASE_AUTH, null, msgs);
			msgs = basicSetFirebaseAuth(newFirebaseAuth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JacroidEMFPackage.PROJETO__FIREBASE_AUTH, newFirebaseAuth, newFirebaseAuth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationClassesDescriptor> getRelationClasses() {
		if (relationClasses == null) {
			relationClasses = new EObjectContainmentEList<RelationClassesDescriptor>(RelationClassesDescriptor.class, this, JacroidEMFPackage.PROJETO__RELATION_CLASSES);
		}
		return relationClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationAttributeDescriptorToComponent> getRelationAttributeToComponent() {
		if (relationAttributeToComponent == null) {
			relationAttributeToComponent = new EObjectContainmentEList<RelationAttributeDescriptorToComponent>(RelationAttributeDescriptorToComponent.class, this, JacroidEMFPackage.PROJETO__RELATION_ATTRIBUTE_TO_COMPONENT);
		}
		return relationAttributeToComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JacroidEMFPackage.PROJETO__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case JacroidEMFPackage.PROJETO__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
			case JacroidEMFPackage.PROJETO__ENUMERATE:
				return ((InternalEList<?>)getEnumerate()).basicRemove(otherEnd, msgs);
			case JacroidEMFPackage.PROJETO__FIREBASE_AUTH:
				return basicSetFirebaseAuth(null, msgs);
			case JacroidEMFPackage.PROJETO__RELATION_CLASSES:
				return ((InternalEList<?>)getRelationClasses()).basicRemove(otherEnd, msgs);
			case JacroidEMFPackage.PROJETO__RELATION_ATTRIBUTE_TO_COMPONENT:
				return ((InternalEList<?>)getRelationAttributeToComponent()).basicRemove(otherEnd, msgs);
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
			case JacroidEMFPackage.PROJETO__CLASSES:
				return getClasses();
			case JacroidEMFPackage.PROJETO__COMPONENT:
				return getComponent();
			case JacroidEMFPackage.PROJETO__ENUMERATE:
				return getEnumerate();
			case JacroidEMFPackage.PROJETO__FIREBASE_AUTH:
				return getFirebaseAuth();
			case JacroidEMFPackage.PROJETO__RELATION_CLASSES:
				return getRelationClasses();
			case JacroidEMFPackage.PROJETO__RELATION_ATTRIBUTE_TO_COMPONENT:
				return getRelationAttributeToComponent();
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
			case JacroidEMFPackage.PROJETO__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends ClassesDescriptor>)newValue);
				return;
			case JacroidEMFPackage.PROJETO__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends Component>)newValue);
				return;
			case JacroidEMFPackage.PROJETO__ENUMERATE:
				getEnumerate().clear();
				getEnumerate().addAll((Collection<? extends Enumerate>)newValue);
				return;
			case JacroidEMFPackage.PROJETO__FIREBASE_AUTH:
				setFirebaseAuth((FirebaseAuth)newValue);
				return;
			case JacroidEMFPackage.PROJETO__RELATION_CLASSES:
				getRelationClasses().clear();
				getRelationClasses().addAll((Collection<? extends RelationClassesDescriptor>)newValue);
				return;
			case JacroidEMFPackage.PROJETO__RELATION_ATTRIBUTE_TO_COMPONENT:
				getRelationAttributeToComponent().clear();
				getRelationAttributeToComponent().addAll((Collection<? extends RelationAttributeDescriptorToComponent>)newValue);
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
			case JacroidEMFPackage.PROJETO__CLASSES:
				getClasses().clear();
				return;
			case JacroidEMFPackage.PROJETO__COMPONENT:
				getComponent().clear();
				return;
			case JacroidEMFPackage.PROJETO__ENUMERATE:
				getEnumerate().clear();
				return;
			case JacroidEMFPackage.PROJETO__FIREBASE_AUTH:
				setFirebaseAuth((FirebaseAuth)null);
				return;
			case JacroidEMFPackage.PROJETO__RELATION_CLASSES:
				getRelationClasses().clear();
				return;
			case JacroidEMFPackage.PROJETO__RELATION_ATTRIBUTE_TO_COMPONENT:
				getRelationAttributeToComponent().clear();
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
			case JacroidEMFPackage.PROJETO__CLASSES:
				return classes != null && !classes.isEmpty();
			case JacroidEMFPackage.PROJETO__COMPONENT:
				return component != null && !component.isEmpty();
			case JacroidEMFPackage.PROJETO__ENUMERATE:
				return enumerate != null && !enumerate.isEmpty();
			case JacroidEMFPackage.PROJETO__FIREBASE_AUTH:
				return firebaseAuth != null;
			case JacroidEMFPackage.PROJETO__RELATION_CLASSES:
				return relationClasses != null && !relationClasses.isEmpty();
			case JacroidEMFPackage.PROJETO__RELATION_ATTRIBUTE_TO_COMPONENT:
				return relationAttributeToComponent != null && !relationAttributeToComponent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProjetoImpl
