/*
 * 
 */
package jacroidEMF.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class JacroidEMFDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<jacroidEMF.diagram.part.JacroidEMFNodeDescriptor> getSemanticChildren(
			View view) {
		switch (jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
				.getVisualID(view)) {
		case jacroidEMF.diagram.edit.parts.ProjetoEditPart.VISUAL_ID:
			return getProjeto_1000SemanticChildren(view);
		case jacroidEMF.diagram.edit.parts.ClassesDescriptorClassesDescriptorAttributesCompartmentEditPart.VISUAL_ID:
			return getClassesDescriptorClassesDescriptorAttributesCompartment_7002SemanticChildren(view);
		case jacroidEMF.diagram.edit.parts.EnumerateEnumerateItemCompartmentEditPart.VISUAL_ID:
			return getEnumerateEnumerateItemCompartment_7003SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<jacroidEMF.diagram.part.JacroidEMFNodeDescriptor> getProjeto_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		jacroidEMF.Projeto modelElement = (jacroidEMF.Projeto) view
				.getElement();
		LinkedList<jacroidEMF.diagram.part.JacroidEMFNodeDescriptor> result = new LinkedList<jacroidEMF.diagram.part.JacroidEMFNodeDescriptor>();
		for (Iterator<?> it = modelElement.getClasses().iterator(); it
				.hasNext();) {
			jacroidEMF.ClassesDescriptor childElement = (jacroidEMF.ClassesDescriptor) it
					.next();
			int visualID = jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == jacroidEMF.diagram.edit.parts.ClassesDescriptorEditPart.VISUAL_ID) {
				result.add(new jacroidEMF.diagram.part.JacroidEMFNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getComponent().iterator(); it
				.hasNext();) {
			jacroidEMF.Component childElement = (jacroidEMF.Component) it
					.next();
			int visualID = jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == jacroidEMF.diagram.edit.parts.ComponentEditPart.VISUAL_ID) {
				result.add(new jacroidEMF.diagram.part.JacroidEMFNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getEnumerate().iterator(); it
				.hasNext();) {
			jacroidEMF.Enumerate childElement = (jacroidEMF.Enumerate) it
					.next();
			int visualID = jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == jacroidEMF.diagram.edit.parts.EnumerateEditPart.VISUAL_ID) {
				result.add(new jacroidEMF.diagram.part.JacroidEMFNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		{
			jacroidEMF.FirebaseAuth childElement = modelElement
					.getFirebaseAuth();
			int visualID = jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == jacroidEMF.diagram.edit.parts.FirebaseAuthEditPart.VISUAL_ID) {
				result.add(new jacroidEMF.diagram.part.JacroidEMFNodeDescriptor(
						childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<jacroidEMF.diagram.part.JacroidEMFNodeDescriptor> getClassesDescriptorClassesDescriptorAttributesCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		jacroidEMF.ClassesDescriptor modelElement = (jacroidEMF.ClassesDescriptor) containerView
				.getElement();
		LinkedList<jacroidEMF.diagram.part.JacroidEMFNodeDescriptor> result = new LinkedList<jacroidEMF.diagram.part.JacroidEMFNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttributes().iterator(); it
				.hasNext();) {
			jacroidEMF.AttributeDescriptor childElement = (jacroidEMF.AttributeDescriptor) it
					.next();
			int visualID = jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == jacroidEMF.diagram.edit.parts.AttributeDescriptorEditPart.VISUAL_ID) {
				result.add(new jacroidEMF.diagram.part.JacroidEMFNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<jacroidEMF.diagram.part.JacroidEMFNodeDescriptor> getEnumerateEnumerateItemCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		jacroidEMF.Enumerate modelElement = (jacroidEMF.Enumerate) containerView
				.getElement();
		LinkedList<jacroidEMF.diagram.part.JacroidEMFNodeDescriptor> result = new LinkedList<jacroidEMF.diagram.part.JacroidEMFNodeDescriptor>();
		for (Iterator<?> it = modelElement.getItem().iterator(); it.hasNext();) {
			jacroidEMF.ItemEnum childElement = (jacroidEMF.ItemEnum) it.next();
			int visualID = jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == jacroidEMF.diagram.edit.parts.ItemEnumEditPart.VISUAL_ID) {
				result.add(new jacroidEMF.diagram.part.JacroidEMFNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> getContainedLinks(
			View view) {
		switch (jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
				.getVisualID(view)) {
		case jacroidEMF.diagram.edit.parts.ProjetoEditPart.VISUAL_ID:
			return getProjeto_1000ContainedLinks(view);
		case jacroidEMF.diagram.edit.parts.ClassesDescriptorEditPart.VISUAL_ID:
			return getClassesDescriptor_2002ContainedLinks(view);
		case jacroidEMF.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
			return getComponent_2003ContainedLinks(view);
		case jacroidEMF.diagram.edit.parts.EnumerateEditPart.VISUAL_ID:
			return getEnumerate_2004ContainedLinks(view);
		case jacroidEMF.diagram.edit.parts.FirebaseAuthEditPart.VISUAL_ID:
			return getFirebaseAuth_2005ContainedLinks(view);
		case jacroidEMF.diagram.edit.parts.AttributeDescriptorEditPart.VISUAL_ID:
			return getAttributeDescriptor_3002ContainedLinks(view);
		case jacroidEMF.diagram.edit.parts.ItemEnumEditPart.VISUAL_ID:
			return getItemEnum_3005ContainedLinks(view);
		case jacroidEMF.diagram.edit.parts.RelationClassesDescriptorEditPart.VISUAL_ID:
			return getRelationClassesDescriptor_4002ContainedLinks(view);
		case jacroidEMF.diagram.edit.parts.RelationAttributeDescriptorToComponentEditPart.VISUAL_ID:
			return getRelationAttributeDescriptorToComponent_4004ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> getIncomingLinks(
			View view) {
		switch (jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
				.getVisualID(view)) {
		case jacroidEMF.diagram.edit.parts.ClassesDescriptorEditPart.VISUAL_ID:
			return getClassesDescriptor_2002IncomingLinks(view);
		case jacroidEMF.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
			return getComponent_2003IncomingLinks(view);
		case jacroidEMF.diagram.edit.parts.EnumerateEditPart.VISUAL_ID:
			return getEnumerate_2004IncomingLinks(view);
		case jacroidEMF.diagram.edit.parts.FirebaseAuthEditPart.VISUAL_ID:
			return getFirebaseAuth_2005IncomingLinks(view);
		case jacroidEMF.diagram.edit.parts.AttributeDescriptorEditPart.VISUAL_ID:
			return getAttributeDescriptor_3002IncomingLinks(view);
		case jacroidEMF.diagram.edit.parts.ItemEnumEditPart.VISUAL_ID:
			return getItemEnum_3005IncomingLinks(view);
		case jacroidEMF.diagram.edit.parts.RelationClassesDescriptorEditPart.VISUAL_ID:
			return getRelationClassesDescriptor_4002IncomingLinks(view);
		case jacroidEMF.diagram.edit.parts.RelationAttributeDescriptorToComponentEditPart.VISUAL_ID:
			return getRelationAttributeDescriptorToComponent_4004IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
				.getVisualID(view)) {
		case jacroidEMF.diagram.edit.parts.ClassesDescriptorEditPart.VISUAL_ID:
			return getClassesDescriptor_2002OutgoingLinks(view);
		case jacroidEMF.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
			return getComponent_2003OutgoingLinks(view);
		case jacroidEMF.diagram.edit.parts.EnumerateEditPart.VISUAL_ID:
			return getEnumerate_2004OutgoingLinks(view);
		case jacroidEMF.diagram.edit.parts.FirebaseAuthEditPart.VISUAL_ID:
			return getFirebaseAuth_2005OutgoingLinks(view);
		case jacroidEMF.diagram.edit.parts.AttributeDescriptorEditPart.VISUAL_ID:
			return getAttributeDescriptor_3002OutgoingLinks(view);
		case jacroidEMF.diagram.edit.parts.ItemEnumEditPart.VISUAL_ID:
			return getItemEnum_3005OutgoingLinks(view);
		case jacroidEMF.diagram.edit.parts.RelationClassesDescriptorEditPart.VISUAL_ID:
			return getRelationClassesDescriptor_4002OutgoingLinks(view);
		case jacroidEMF.diagram.edit.parts.RelationAttributeDescriptorToComponentEditPart.VISUAL_ID:
			return getRelationAttributeDescriptorToComponent_4004OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> getProjeto_1000ContainedLinks(
			View view) {
		jacroidEMF.Projeto modelElement = (jacroidEMF.Projeto) view
				.getElement();
		LinkedList<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> result = new LinkedList<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_RelationClassesDescriptor_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_RelationAttributeDescriptorToComponent_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> getClassesDescriptor_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> getComponent_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> getEnumerate_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> getFirebaseAuth_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> getAttributeDescriptor_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> getItemEnum_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> getRelationClassesDescriptor_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> getRelationAttributeDescriptorToComponent_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> getClassesDescriptor_2002IncomingLinks(
			View view) {
		jacroidEMF.ClassesDescriptor modelElement = (jacroidEMF.ClassesDescriptor) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> result = new LinkedList<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_RelationClassesDescriptor_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> getComponent_2003IncomingLinks(
			View view) {
		jacroidEMF.Component modelElement = (jacroidEMF.Component) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> result = new LinkedList<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_RelationAttributeDescriptorToComponent_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> getEnumerate_2004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> getFirebaseAuth_2005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> getAttributeDescriptor_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> getItemEnum_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> getRelationClassesDescriptor_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> getRelationAttributeDescriptorToComponent_4004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> getClassesDescriptor_2002OutgoingLinks(
			View view) {
		jacroidEMF.ClassesDescriptor modelElement = (jacroidEMF.ClassesDescriptor) view
				.getElement();
		LinkedList<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> result = new LinkedList<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_RelationClassesDescriptor_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> getComponent_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> getEnumerate_2004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> getFirebaseAuth_2005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> getAttributeDescriptor_3002OutgoingLinks(
			View view) {
		jacroidEMF.AttributeDescriptor modelElement = (jacroidEMF.AttributeDescriptor) view
				.getElement();
		LinkedList<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> result = new LinkedList<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_RelationAttributeDescriptorToComponent_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> getItemEnum_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> getRelationClassesDescriptor_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> getRelationAttributeDescriptorToComponent_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> getContainedTypeModelFacetLinks_RelationClassesDescriptor_4002(
			jacroidEMF.Projeto container) {
		LinkedList<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> result = new LinkedList<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor>();
		for (Iterator<?> links = container.getRelationClasses().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof jacroidEMF.RelationClassesDescriptor) {
				continue;
			}
			jacroidEMF.RelationClassesDescriptor link = (jacroidEMF.RelationClassesDescriptor) linkObject;
			if (jacroidEMF.diagram.edit.parts.RelationClassesDescriptorEditPart.VISUAL_ID != jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			jacroidEMF.ClassesDescriptor dst = link.getTarget();
			jacroidEMF.ClassesDescriptor src = link.getSource();
			result.add(new jacroidEMF.diagram.part.JacroidEMFLinkDescriptor(
					src,
					dst,
					link,
					jacroidEMF.diagram.providers.JacroidEMFElementTypes.RelationClassesDescriptor_4002,
					jacroidEMF.diagram.edit.parts.RelationClassesDescriptorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> getContainedTypeModelFacetLinks_RelationAttributeDescriptorToComponent_4004(
			jacroidEMF.Projeto container) {
		LinkedList<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> result = new LinkedList<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor>();
		for (Iterator<?> links = container.getRelationAttributeToComponent()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof jacroidEMF.RelationAttributeDescriptorToComponent) {
				continue;
			}
			jacroidEMF.RelationAttributeDescriptorToComponent link = (jacroidEMF.RelationAttributeDescriptorToComponent) linkObject;
			if (jacroidEMF.diagram.edit.parts.RelationAttributeDescriptorToComponentEditPart.VISUAL_ID != jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			jacroidEMF.Component dst = link.getTarget();
			jacroidEMF.AttributeDescriptor src = link.getSource();
			result.add(new jacroidEMF.diagram.part.JacroidEMFLinkDescriptor(
					src,
					dst,
					link,
					jacroidEMF.diagram.providers.JacroidEMFElementTypes.RelationAttributeDescriptorToComponent_4004,
					jacroidEMF.diagram.edit.parts.RelationAttributeDescriptorToComponentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> getIncomingTypeModelFacetLinks_RelationClassesDescriptor_4002(
			jacroidEMF.ClassesDescriptor target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> result = new LinkedList<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != jacroidEMF.JacroidEMFPackage.eINSTANCE
					.getRelationClassesDescriptor_Target()
					|| false == setting.getEObject() instanceof jacroidEMF.RelationClassesDescriptor) {
				continue;
			}
			jacroidEMF.RelationClassesDescriptor link = (jacroidEMF.RelationClassesDescriptor) setting
					.getEObject();
			if (jacroidEMF.diagram.edit.parts.RelationClassesDescriptorEditPart.VISUAL_ID != jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			jacroidEMF.ClassesDescriptor src = link.getSource();
			result.add(new jacroidEMF.diagram.part.JacroidEMFLinkDescriptor(
					src,
					target,
					link,
					jacroidEMF.diagram.providers.JacroidEMFElementTypes.RelationClassesDescriptor_4002,
					jacroidEMF.diagram.edit.parts.RelationClassesDescriptorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> getIncomingTypeModelFacetLinks_RelationAttributeDescriptorToComponent_4004(
			jacroidEMF.Component target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> result = new LinkedList<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != jacroidEMF.JacroidEMFPackage.eINSTANCE
					.getRelationAttributeDescriptorToComponent_Target()
					|| false == setting.getEObject() instanceof jacroidEMF.RelationAttributeDescriptorToComponent) {
				continue;
			}
			jacroidEMF.RelationAttributeDescriptorToComponent link = (jacroidEMF.RelationAttributeDescriptorToComponent) setting
					.getEObject();
			if (jacroidEMF.diagram.edit.parts.RelationAttributeDescriptorToComponentEditPart.VISUAL_ID != jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			jacroidEMF.AttributeDescriptor src = link.getSource();
			result.add(new jacroidEMF.diagram.part.JacroidEMFLinkDescriptor(
					src,
					target,
					link,
					jacroidEMF.diagram.providers.JacroidEMFElementTypes.RelationAttributeDescriptorToComponent_4004,
					jacroidEMF.diagram.edit.parts.RelationAttributeDescriptorToComponentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> getOutgoingTypeModelFacetLinks_RelationClassesDescriptor_4002(
			jacroidEMF.ClassesDescriptor source) {
		jacroidEMF.Projeto container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof jacroidEMF.Projeto) {
				container = (jacroidEMF.Projeto) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> result = new LinkedList<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor>();
		for (Iterator<?> links = container.getRelationClasses().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof jacroidEMF.RelationClassesDescriptor) {
				continue;
			}
			jacroidEMF.RelationClassesDescriptor link = (jacroidEMF.RelationClassesDescriptor) linkObject;
			if (jacroidEMF.diagram.edit.parts.RelationClassesDescriptorEditPart.VISUAL_ID != jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			jacroidEMF.ClassesDescriptor dst = link.getTarget();
			jacroidEMF.ClassesDescriptor src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new jacroidEMF.diagram.part.JacroidEMFLinkDescriptor(
					src,
					dst,
					link,
					jacroidEMF.diagram.providers.JacroidEMFElementTypes.RelationClassesDescriptor_4002,
					jacroidEMF.diagram.edit.parts.RelationClassesDescriptorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> getOutgoingTypeModelFacetLinks_RelationAttributeDescriptorToComponent_4004(
			jacroidEMF.AttributeDescriptor source) {
		jacroidEMF.Projeto container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof jacroidEMF.Projeto) {
				container = (jacroidEMF.Projeto) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> result = new LinkedList<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor>();
		for (Iterator<?> links = container.getRelationAttributeToComponent()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof jacroidEMF.RelationAttributeDescriptorToComponent) {
				continue;
			}
			jacroidEMF.RelationAttributeDescriptorToComponent link = (jacroidEMF.RelationAttributeDescriptorToComponent) linkObject;
			if (jacroidEMF.diagram.edit.parts.RelationAttributeDescriptorToComponentEditPart.VISUAL_ID != jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			jacroidEMF.Component dst = link.getTarget();
			jacroidEMF.AttributeDescriptor src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new jacroidEMF.diagram.part.JacroidEMFLinkDescriptor(
					src,
					dst,
					link,
					jacroidEMF.diagram.providers.JacroidEMFElementTypes.RelationAttributeDescriptorToComponent_4004,
					jacroidEMF.diagram.edit.parts.RelationAttributeDescriptorToComponentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<jacroidEMF.diagram.part.JacroidEMFNodeDescriptor> getSemanticChildren(
				View view) {
			return JacroidEMFDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> getContainedLinks(
				View view) {
			return JacroidEMFDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> getIncomingLinks(
				View view) {
			return JacroidEMFDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<jacroidEMF.diagram.part.JacroidEMFLinkDescriptor> getOutgoingLinks(
				View view) {
			return JacroidEMFDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
