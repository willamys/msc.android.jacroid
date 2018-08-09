/*
 * 
 */
package jacroidEMF.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class EnumerateEnumerateItemCompartmentItemSemanticEditPolicy extends
		jacroidEMF.diagram.edit.policies.JacroidEMFBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EnumerateEnumerateItemCompartmentItemSemanticEditPolicy() {
		super(
				jacroidEMF.diagram.providers.JacroidEMFElementTypes.Enumerate_2004);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (jacroidEMF.diagram.providers.JacroidEMFElementTypes.ItemEnum_3005 == req
				.getElementType()) {
			return getGEFWrapper(new jacroidEMF.diagram.edit.commands.ItemEnumCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
