/*
 * 
 */
package jacroidEMF.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ClassesDescriptorClassesDescriptorAttributesCompartmentItemSemanticEditPolicy
		extends
		jacroidEMF.diagram.edit.policies.JacroidEMFBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ClassesDescriptorClassesDescriptorAttributesCompartmentItemSemanticEditPolicy() {
		super(
				jacroidEMF.diagram.providers.JacroidEMFElementTypes.ClassesDescriptor_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (jacroidEMF.diagram.providers.JacroidEMFElementTypes.AttributeDescriptor_3002 == req
				.getElementType()) {
			return getGEFWrapper(new jacroidEMF.diagram.edit.commands.AttributeDescriptorCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
