/*
 * 
 */
package jacroidEMF.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class JacroidEMFModelingAssistantProviderOfClassesDescriptorEditPart
		extends
		jacroidEMF.diagram.providers.JacroidEMFModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(jacroidEMF.diagram.providers.JacroidEMFElementTypes.AttributeDescriptor_3002);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((jacroidEMF.diagram.edit.parts.ClassesDescriptorEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			jacroidEMF.diagram.edit.parts.ClassesDescriptorEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(jacroidEMF.diagram.providers.JacroidEMFElementTypes.RelationClassesDescriptor_4002);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(jacroidEMF.diagram.edit.parts.ClassesDescriptorEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			jacroidEMF.diagram.edit.parts.ClassesDescriptorEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof jacroidEMF.diagram.edit.parts.ClassesDescriptorEditPart) {
			types.add(jacroidEMF.diagram.providers.JacroidEMFElementTypes.RelationClassesDescriptor_4002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget(
				(jacroidEMF.diagram.edit.parts.ClassesDescriptorEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			jacroidEMF.diagram.edit.parts.ClassesDescriptorEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == jacroidEMF.diagram.providers.JacroidEMFElementTypes.RelationClassesDescriptor_4002) {
			types.add(jacroidEMF.diagram.providers.JacroidEMFElementTypes.ClassesDescriptor_2002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((jacroidEMF.diagram.edit.parts.ClassesDescriptorEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			jacroidEMF.diagram.edit.parts.ClassesDescriptorEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(jacroidEMF.diagram.providers.JacroidEMFElementTypes.RelationClassesDescriptor_4002);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource(
				(jacroidEMF.diagram.edit.parts.ClassesDescriptorEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			jacroidEMF.diagram.edit.parts.ClassesDescriptorEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == jacroidEMF.diagram.providers.JacroidEMFElementTypes.RelationClassesDescriptor_4002) {
			types.add(jacroidEMF.diagram.providers.JacroidEMFElementTypes.ClassesDescriptor_2002);
		}
		return types;
	}

}
