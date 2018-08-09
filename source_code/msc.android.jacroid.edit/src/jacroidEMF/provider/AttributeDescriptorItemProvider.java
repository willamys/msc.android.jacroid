/**
 */
package jacroidEMF.provider;


import jacroidEMF.AttributeDescriptor;
import jacroidEMF.JacroidEMFPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jacroidEMF.AttributeDescriptor} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributeDescriptorItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDescriptorItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addClassnamePropertyDescriptor(object);
			addColumnTablePropertyDescriptor(object);
			addExhibitionNamePropertyDescriptor(object);
			addInputPropertyDescriptor(object);
			addIsColumnPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addPrimaryKeyPropertyDescriptor(object);
			addPrimaryKeyTablePropertyDescriptor(object);
			addTypeDataPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Classname feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassnamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AttributeDescriptor_classname_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AttributeDescriptor_classname_feature", "_UI_AttributeDescriptor_type"),
				 JacroidEMFPackage.Literals.ATTRIBUTE_DESCRIPTOR__CLASSNAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Column Table feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColumnTablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AttributeDescriptor_columnTable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AttributeDescriptor_columnTable_feature", "_UI_AttributeDescriptor_type"),
				 JacroidEMFPackage.Literals.ATTRIBUTE_DESCRIPTOR__COLUMN_TABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Exhibition Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExhibitionNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AttributeDescriptor_exhibitionName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AttributeDescriptor_exhibitionName_feature", "_UI_AttributeDescriptor_type"),
				 JacroidEMFPackage.Literals.ATTRIBUTE_DESCRIPTOR__EXHIBITION_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AttributeDescriptor_input_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AttributeDescriptor_input_feature", "_UI_AttributeDescriptor_type"),
				 JacroidEMFPackage.Literals.ATTRIBUTE_DESCRIPTOR__INPUT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Column feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsColumnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AttributeDescriptor_isColumn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AttributeDescriptor_isColumn_feature", "_UI_AttributeDescriptor_type"),
				 JacroidEMFPackage.Literals.ATTRIBUTE_DESCRIPTOR__IS_COLUMN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AttributeDescriptor_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AttributeDescriptor_name_feature", "_UI_AttributeDescriptor_type"),
				 JacroidEMFPackage.Literals.ATTRIBUTE_DESCRIPTOR__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Primary Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrimaryKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AttributeDescriptor_primaryKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AttributeDescriptor_primaryKey_feature", "_UI_AttributeDescriptor_type"),
				 JacroidEMFPackage.Literals.ATTRIBUTE_DESCRIPTOR__PRIMARY_KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Primary Key Table feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrimaryKeyTablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AttributeDescriptor_primaryKeyTable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AttributeDescriptor_primaryKeyTable_feature", "_UI_AttributeDescriptor_type"),
				 JacroidEMFPackage.Literals.ATTRIBUTE_DESCRIPTOR__PRIMARY_KEY_TABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type Data feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypeDataPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AttributeDescriptor_typeData_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AttributeDescriptor_typeData_feature", "_UI_AttributeDescriptor_type"),
				 JacroidEMFPackage.Literals.ATTRIBUTE_DESCRIPTOR__TYPE_DATA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns AttributeDescriptor.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AttributeDescriptor"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AttributeDescriptor)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AttributeDescriptor_type") :
			getString("_UI_AttributeDescriptor_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(AttributeDescriptor.class)) {
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__CLASSNAME:
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__COLUMN_TABLE:
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__EXHIBITION_NAME:
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__INPUT:
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__IS_COLUMN:
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__NAME:
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__PRIMARY_KEY:
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__PRIMARY_KEY_TABLE:
			case JacroidEMFPackage.ATTRIBUTE_DESCRIPTOR__TYPE_DATA:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return JacroidEMFEditPlugin.INSTANCE;
	}

}
