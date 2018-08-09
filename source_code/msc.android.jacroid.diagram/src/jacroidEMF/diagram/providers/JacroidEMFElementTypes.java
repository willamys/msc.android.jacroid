/*
 * 
 */
package jacroidEMF.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class JacroidEMFElementTypes {

	/**
	 * @generated
	 */
	private JacroidEMFElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			jacroidEMF.diagram.part.JacroidEMFDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Projeto_1000 = getElementType("msc.android.jacroid.diagram.Projeto_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Enumerate_2004 = getElementType("msc.android.jacroid.diagram.Enumerate_2004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FirebaseAuth_2005 = getElementType("msc.android.jacroid.diagram.FirebaseAuth_2005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ClassesDescriptor_2002 = getElementType("msc.android.jacroid.diagram.ClassesDescriptor_2002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Component_2003 = getElementType("msc.android.jacroid.diagram.Component_2003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AttributeDescriptor_3002 = getElementType("msc.android.jacroid.diagram.AttributeDescriptor_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ItemEnum_3005 = getElementType("msc.android.jacroid.diagram.ItemEnum_3005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RelationClassesDescriptor_4002 = getElementType("msc.android.jacroid.diagram.RelationClassesDescriptor_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RelationAttributeDescriptorToComponent_4004 = getElementType("msc.android.jacroid.diagram.RelationAttributeDescriptorToComponent_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Projeto_1000,
					jacroidEMF.JacroidEMFPackage.eINSTANCE.getProjeto());

			elements.put(ClassesDescriptor_2002,
					jacroidEMF.JacroidEMFPackage.eINSTANCE
							.getClassesDescriptor());

			elements.put(Component_2003,
					jacroidEMF.JacroidEMFPackage.eINSTANCE.getComponent());

			elements.put(Enumerate_2004,
					jacroidEMF.JacroidEMFPackage.eINSTANCE.getEnumerate());

			elements.put(FirebaseAuth_2005,
					jacroidEMF.JacroidEMFPackage.eINSTANCE.getFirebaseAuth());

			elements.put(AttributeDescriptor_3002,
					jacroidEMF.JacroidEMFPackage.eINSTANCE
							.getAttributeDescriptor());

			elements.put(ItemEnum_3005,
					jacroidEMF.JacroidEMFPackage.eINSTANCE.getItemEnum());

			elements.put(RelationClassesDescriptor_4002,
					jacroidEMF.JacroidEMFPackage.eINSTANCE
							.getRelationClassesDescriptor());

			elements.put(RelationAttributeDescriptorToComponent_4004,
					jacroidEMF.JacroidEMFPackage.eINSTANCE
							.getRelationAttributeDescriptorToComponent());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Projeto_1000);
			KNOWN_ELEMENT_TYPES.add(ClassesDescriptor_2002);
			KNOWN_ELEMENT_TYPES.add(Component_2003);
			KNOWN_ELEMENT_TYPES.add(Enumerate_2004);
			KNOWN_ELEMENT_TYPES.add(FirebaseAuth_2005);
			KNOWN_ELEMENT_TYPES.add(AttributeDescriptor_3002);
			KNOWN_ELEMENT_TYPES.add(ItemEnum_3005);
			KNOWN_ELEMENT_TYPES.add(RelationClassesDescriptor_4002);
			KNOWN_ELEMENT_TYPES
					.add(RelationAttributeDescriptorToComponent_4004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case jacroidEMF.diagram.edit.parts.ProjetoEditPart.VISUAL_ID:
			return Projeto_1000;
		case jacroidEMF.diagram.edit.parts.ClassesDescriptorEditPart.VISUAL_ID:
			return ClassesDescriptor_2002;
		case jacroidEMF.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
			return Component_2003;
		case jacroidEMF.diagram.edit.parts.EnumerateEditPart.VISUAL_ID:
			return Enumerate_2004;
		case jacroidEMF.diagram.edit.parts.FirebaseAuthEditPart.VISUAL_ID:
			return FirebaseAuth_2005;
		case jacroidEMF.diagram.edit.parts.AttributeDescriptorEditPart.VISUAL_ID:
			return AttributeDescriptor_3002;
		case jacroidEMF.diagram.edit.parts.ItemEnumEditPart.VISUAL_ID:
			return ItemEnum_3005;
		case jacroidEMF.diagram.edit.parts.RelationClassesDescriptorEditPart.VISUAL_ID:
			return RelationClassesDescriptor_4002;
		case jacroidEMF.diagram.edit.parts.RelationAttributeDescriptorToComponentEditPart.VISUAL_ID:
			return RelationAttributeDescriptorToComponent_4004;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return jacroidEMF.diagram.providers.JacroidEMFElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return jacroidEMF.diagram.providers.JacroidEMFElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return jacroidEMF.diagram.providers.JacroidEMFElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
