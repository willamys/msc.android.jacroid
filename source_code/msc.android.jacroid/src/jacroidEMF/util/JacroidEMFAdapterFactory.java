/**
 */
package jacroidEMF.util;

import jacroidEMF.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see jacroidEMF.JacroidEMFPackage
 * @generated
 */
public class JacroidEMFAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JacroidEMFPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JacroidEMFAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JacroidEMFPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JacroidEMFSwitch<Adapter> modelSwitch =
		new JacroidEMFSwitch<Adapter>() {
			@Override
			public Adapter caseProjeto(Projeto object) {
				return createProjetoAdapter();
			}
			@Override
			public Adapter caseAttributeDescriptor(AttributeDescriptor object) {
				return createAttributeDescriptorAdapter();
			}
			@Override
			public Adapter caseClassesDescriptor(ClassesDescriptor object) {
				return createClassesDescriptorAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseFirebaseAuth(FirebaseAuth object) {
				return createFirebaseAuthAdapter();
			}
			@Override
			public Adapter caseEnumerate(Enumerate object) {
				return createEnumerateAdapter();
			}
			@Override
			public Adapter caseItemEnum(ItemEnum object) {
				return createItemEnumAdapter();
			}
			@Override
			public Adapter caseRelationClassesDescriptor(RelationClassesDescriptor object) {
				return createRelationClassesDescriptorAdapter();
			}
			@Override
			public Adapter caseRelationAttributeDescriptorToComponent(RelationAttributeDescriptorToComponent object) {
				return createRelationAttributeDescriptorToComponentAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link jacroidEMF.AttributeDescriptor <em>Attribute Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jacroidEMF.AttributeDescriptor
	 * @generated
	 */
	public Adapter createAttributeDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jacroidEMF.ClassesDescriptor <em>Classes Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jacroidEMF.ClassesDescriptor
	 * @generated
	 */
	public Adapter createClassesDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jacroidEMF.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jacroidEMF.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jacroidEMF.FirebaseAuth <em>Firebase Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jacroidEMF.FirebaseAuth
	 * @generated
	 */
	public Adapter createFirebaseAuthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jacroidEMF.Enumerate <em>Enumerate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jacroidEMF.Enumerate
	 * @generated
	 */
	public Adapter createEnumerateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jacroidEMF.ItemEnum <em>Item Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jacroidEMF.ItemEnum
	 * @generated
	 */
	public Adapter createItemEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jacroidEMF.RelationClassesDescriptor <em>Relation Classes Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jacroidEMF.RelationClassesDescriptor
	 * @generated
	 */
	public Adapter createRelationClassesDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jacroidEMF.RelationAttributeDescriptorToComponent <em>Relation Attribute Descriptor To Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jacroidEMF.RelationAttributeDescriptorToComponent
	 * @generated
	 */
	public Adapter createRelationAttributeDescriptorToComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jacroidEMF.Projeto <em>Projeto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jacroidEMF.Projeto
	 * @generated
	 */
	public Adapter createProjetoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //JacroidEMFAdapterFactory
