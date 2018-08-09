/*
 * 
 */
package jacroidEMF.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class JacroidEMFVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "msc.android.jacroid.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (jacroidEMF.diagram.edit.parts.ProjetoEditPart.MODEL_ID
					.equals(view.getType())) {
				return jacroidEMF.diagram.edit.parts.ProjetoEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				jacroidEMF.diagram.part.JacroidEMFDiagramEditorPlugin
						.getInstance().logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (jacroidEMF.JacroidEMFPackage.eINSTANCE.getProjeto().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((jacroidEMF.Projeto) domainElement)) {
			return jacroidEMF.diagram.edit.parts.ProjetoEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
				.getModelID(containerView);
		if (!jacroidEMF.diagram.edit.parts.ProjetoEditPart.MODEL_ID
				.equals(containerModelID)
				&& !"jacroidEMF".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (jacroidEMF.diagram.edit.parts.ProjetoEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = jacroidEMF.diagram.edit.parts.ProjetoEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case jacroidEMF.diagram.edit.parts.ProjetoEditPart.VISUAL_ID:
			if (jacroidEMF.JacroidEMFPackage.eINSTANCE.getClassesDescriptor()
					.isSuperTypeOf(domainElement.eClass())) {
				return jacroidEMF.diagram.edit.parts.ClassesDescriptorEditPart.VISUAL_ID;
			}
			if (jacroidEMF.JacroidEMFPackage.eINSTANCE.getComponent()
					.isSuperTypeOf(domainElement.eClass())) {
				return jacroidEMF.diagram.edit.parts.ComponentEditPart.VISUAL_ID;
			}
			if (jacroidEMF.JacroidEMFPackage.eINSTANCE.getEnumerate()
					.isSuperTypeOf(domainElement.eClass())) {
				return jacroidEMF.diagram.edit.parts.EnumerateEditPart.VISUAL_ID;
			}
			if (jacroidEMF.JacroidEMFPackage.eINSTANCE.getFirebaseAuth()
					.isSuperTypeOf(domainElement.eClass())) {
				return jacroidEMF.diagram.edit.parts.FirebaseAuthEditPart.VISUAL_ID;
			}
			break;
		case jacroidEMF.diagram.edit.parts.ClassesDescriptorClassesDescriptorAttributesCompartmentEditPart.VISUAL_ID:
			if (jacroidEMF.JacroidEMFPackage.eINSTANCE.getAttributeDescriptor()
					.isSuperTypeOf(domainElement.eClass())) {
				return jacroidEMF.diagram.edit.parts.AttributeDescriptorEditPart.VISUAL_ID;
			}
			break;
		case jacroidEMF.diagram.edit.parts.EnumerateEnumerateItemCompartmentEditPart.VISUAL_ID:
			if (jacroidEMF.JacroidEMFPackage.eINSTANCE.getItemEnum()
					.isSuperTypeOf(domainElement.eClass())) {
				return jacroidEMF.diagram.edit.parts.ItemEnumEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
				.getModelID(containerView);
		if (!jacroidEMF.diagram.edit.parts.ProjetoEditPart.MODEL_ID
				.equals(containerModelID)
				&& !"jacroidEMF".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (jacroidEMF.diagram.edit.parts.ProjetoEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = jacroidEMF.diagram.edit.parts.ProjetoEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case jacroidEMF.diagram.edit.parts.ProjetoEditPart.VISUAL_ID:
			if (jacroidEMF.diagram.edit.parts.ClassesDescriptorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (jacroidEMF.diagram.edit.parts.ComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (jacroidEMF.diagram.edit.parts.EnumerateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (jacroidEMF.diagram.edit.parts.FirebaseAuthEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case jacroidEMF.diagram.edit.parts.ClassesDescriptorEditPart.VISUAL_ID:
			if (jacroidEMF.diagram.edit.parts.ClassesDescriptorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (jacroidEMF.diagram.edit.parts.ClassesDescriptorClassesDescriptorAttributesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case jacroidEMF.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
			if (jacroidEMF.diagram.edit.parts.ComponentNameTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case jacroidEMF.diagram.edit.parts.EnumerateEditPart.VISUAL_ID:
			if (jacroidEMF.diagram.edit.parts.EnumerateNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (jacroidEMF.diagram.edit.parts.EnumerateEnumerateItemCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case jacroidEMF.diagram.edit.parts.FirebaseAuthEditPart.VISUAL_ID:
			if (jacroidEMF.diagram.edit.parts.FirebaseAuthNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case jacroidEMF.diagram.edit.parts.AttributeDescriptorEditPart.VISUAL_ID:
			if (jacroidEMF.diagram.edit.parts.AttributeDescriptorNameTypeDataEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case jacroidEMF.diagram.edit.parts.ItemEnumEditPart.VISUAL_ID:
			if (jacroidEMF.diagram.edit.parts.ItemEnumNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case jacroidEMF.diagram.edit.parts.ClassesDescriptorClassesDescriptorAttributesCompartmentEditPart.VISUAL_ID:
			if (jacroidEMF.diagram.edit.parts.AttributeDescriptorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case jacroidEMF.diagram.edit.parts.EnumerateEnumerateItemCompartmentEditPart.VISUAL_ID:
			if (jacroidEMF.diagram.edit.parts.ItemEnumEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (jacroidEMF.JacroidEMFPackage.eINSTANCE
				.getRelationClassesDescriptor().isSuperTypeOf(
						domainElement.eClass())) {
			return jacroidEMF.diagram.edit.parts.RelationClassesDescriptorEditPart.VISUAL_ID;
		}
		if (jacroidEMF.JacroidEMFPackage.eINSTANCE
				.getRelationAttributeDescriptorToComponent().isSuperTypeOf(
						domainElement.eClass())) {
			return jacroidEMF.diagram.edit.parts.RelationAttributeDescriptorToComponentEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(jacroidEMF.Projeto element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case jacroidEMF.diagram.edit.parts.ClassesDescriptorClassesDescriptorAttributesCompartmentEditPart.VISUAL_ID:
		case jacroidEMF.diagram.edit.parts.EnumerateEnumerateItemCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case jacroidEMF.diagram.edit.parts.ProjetoEditPart.VISUAL_ID:
			return false;
		case jacroidEMF.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
		case jacroidEMF.diagram.edit.parts.FirebaseAuthEditPart.VISUAL_ID:
		case jacroidEMF.diagram.edit.parts.AttributeDescriptorEditPart.VISUAL_ID:
		case jacroidEMF.diagram.edit.parts.ItemEnumEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
