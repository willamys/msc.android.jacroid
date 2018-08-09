/*
 * 
 */
package jacroidEMF.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class RelationAttributeDescriptorToComponentItemSemanticEditPolicy
		extends
		jacroidEMF.diagram.edit.policies.JacroidEMFBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RelationAttributeDescriptorToComponentItemSemanticEditPolicy() {
		super(
				jacroidEMF.diagram.providers.JacroidEMFElementTypes.RelationAttributeDescriptorToComponent_4004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
