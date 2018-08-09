/*
 * 
 */
package jacroidEMF.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class JacroidEMFEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
					.getVisualID(view)) {

			case jacroidEMF.diagram.edit.parts.ProjetoEditPart.VISUAL_ID:
				return new jacroidEMF.diagram.edit.parts.ProjetoEditPart(view);

			case jacroidEMF.diagram.edit.parts.ClassesDescriptorEditPart.VISUAL_ID:
				return new jacroidEMF.diagram.edit.parts.ClassesDescriptorEditPart(
						view);

			case jacroidEMF.diagram.edit.parts.ClassesDescriptorNameEditPart.VISUAL_ID:
				return new jacroidEMF.diagram.edit.parts.ClassesDescriptorNameEditPart(
						view);

			case jacroidEMF.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
				return new jacroidEMF.diagram.edit.parts.ComponentEditPart(view);

			case jacroidEMF.diagram.edit.parts.ComponentNameTypeEditPart.VISUAL_ID:
				return new jacroidEMF.diagram.edit.parts.ComponentNameTypeEditPart(
						view);

			case jacroidEMF.diagram.edit.parts.EnumerateEditPart.VISUAL_ID:
				return new jacroidEMF.diagram.edit.parts.EnumerateEditPart(view);

			case jacroidEMF.diagram.edit.parts.EnumerateNameEditPart.VISUAL_ID:
				return new jacroidEMF.diagram.edit.parts.EnumerateNameEditPart(
						view);

			case jacroidEMF.diagram.edit.parts.FirebaseAuthEditPart.VISUAL_ID:
				return new jacroidEMF.diagram.edit.parts.FirebaseAuthEditPart(
						view);

			case jacroidEMF.diagram.edit.parts.FirebaseAuthNameEditPart.VISUAL_ID:
				return new jacroidEMF.diagram.edit.parts.FirebaseAuthNameEditPart(
						view);

			case jacroidEMF.diagram.edit.parts.AttributeDescriptorEditPart.VISUAL_ID:
				return new jacroidEMF.diagram.edit.parts.AttributeDescriptorEditPart(
						view);

			case jacroidEMF.diagram.edit.parts.AttributeDescriptorNameTypeDataEditPart.VISUAL_ID:
				return new jacroidEMF.diagram.edit.parts.AttributeDescriptorNameTypeDataEditPart(
						view);

			case jacroidEMF.diagram.edit.parts.ItemEnumEditPart.VISUAL_ID:
				return new jacroidEMF.diagram.edit.parts.ItemEnumEditPart(view);

			case jacroidEMF.diagram.edit.parts.ItemEnumNameEditPart.VISUAL_ID:
				return new jacroidEMF.diagram.edit.parts.ItemEnumNameEditPart(
						view);

			case jacroidEMF.diagram.edit.parts.ClassesDescriptorClassesDescriptorAttributesCompartmentEditPart.VISUAL_ID:
				return new jacroidEMF.diagram.edit.parts.ClassesDescriptorClassesDescriptorAttributesCompartmentEditPart(
						view);

			case jacroidEMF.diagram.edit.parts.EnumerateEnumerateItemCompartmentEditPart.VISUAL_ID:
				return new jacroidEMF.diagram.edit.parts.EnumerateEnumerateItemCompartmentEditPart(
						view);

			case jacroidEMF.diagram.edit.parts.RelationClassesDescriptorEditPart.VISUAL_ID:
				return new jacroidEMF.diagram.edit.parts.RelationClassesDescriptorEditPart(
						view);

			case jacroidEMF.diagram.edit.parts.RelationAttributeDescriptorToComponentEditPart.VISUAL_ID:
				return new jacroidEMF.diagram.edit.parts.RelationAttributeDescriptorToComponentEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
