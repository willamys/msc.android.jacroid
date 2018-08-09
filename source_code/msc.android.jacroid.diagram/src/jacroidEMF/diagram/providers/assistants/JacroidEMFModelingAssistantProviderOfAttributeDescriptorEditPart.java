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
public class JacroidEMFModelingAssistantProviderOfAttributeDescriptorEditPart
		extends
		jacroidEMF.diagram.providers.JacroidEMFModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((jacroidEMF.diagram.edit.parts.AttributeDescriptorEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			jacroidEMF.diagram.edit.parts.AttributeDescriptorEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(jacroidEMF.diagram.providers.JacroidEMFElementTypes.RelationAttributeDescriptorToComponent_4004);
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
				(jacroidEMF.diagram.edit.parts.AttributeDescriptorEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			jacroidEMF.diagram.edit.parts.AttributeDescriptorEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof jacroidEMF.diagram.edit.parts.ComponentEditPart) {
			types.add(jacroidEMF.diagram.providers.JacroidEMFElementTypes.RelationAttributeDescriptorToComponent_4004);
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
				(jacroidEMF.diagram.edit.parts.AttributeDescriptorEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			jacroidEMF.diagram.edit.parts.AttributeDescriptorEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == jacroidEMF.diagram.providers.JacroidEMFElementTypes.RelationAttributeDescriptorToComponent_4004) {
			types.add(jacroidEMF.diagram.providers.JacroidEMFElementTypes.Component_2003);
		}
		return types;
	}

}
