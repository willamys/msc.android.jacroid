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
public class RelationClassesDescriptorItemSemanticEditPolicy extends
		jacroidEMF.diagram.edit.policies.JacroidEMFBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RelationClassesDescriptorItemSemanticEditPolicy() {
		super(
				jacroidEMF.diagram.providers.JacroidEMFElementTypes.RelationClassesDescriptor_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
