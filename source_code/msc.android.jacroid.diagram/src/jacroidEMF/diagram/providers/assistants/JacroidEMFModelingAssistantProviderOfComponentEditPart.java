/*
 * 
 */
package jacroidEMF.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class JacroidEMFModelingAssistantProviderOfComponentEditPart extends
		jacroidEMF.diagram.providers.JacroidEMFModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((jacroidEMF.diagram.edit.parts.ComponentEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			jacroidEMF.diagram.edit.parts.ComponentEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(jacroidEMF.diagram.providers.JacroidEMFElementTypes.RelationAttributeDescriptorToComponent_4004);
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
				(jacroidEMF.diagram.edit.parts.ComponentEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			jacroidEMF.diagram.edit.parts.ComponentEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == jacroidEMF.diagram.providers.JacroidEMFElementTypes.RelationAttributeDescriptorToComponent_4004) {
			types.add(jacroidEMF.diagram.providers.JacroidEMFElementTypes.AttributeDescriptor_3002);
		}
		return types;
	}

}
