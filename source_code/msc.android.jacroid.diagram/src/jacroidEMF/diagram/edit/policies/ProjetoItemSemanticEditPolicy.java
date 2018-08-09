/*
 * 
 */
package jacroidEMF.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class ProjetoItemSemanticEditPolicy extends
		jacroidEMF.diagram.edit.policies.JacroidEMFBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ProjetoItemSemanticEditPolicy() {
		super(jacroidEMF.diagram.providers.JacroidEMFElementTypes.Projeto_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (jacroidEMF.diagram.providers.JacroidEMFElementTypes.ClassesDescriptor_2002 == req
				.getElementType()) {
			return getGEFWrapper(new jacroidEMF.diagram.edit.commands.ClassesDescriptorCreateCommand(
					req));
		}
		if (jacroidEMF.diagram.providers.JacroidEMFElementTypes.Component_2003 == req
				.getElementType()) {
			return getGEFWrapper(new jacroidEMF.diagram.edit.commands.ComponentCreateCommand(
					req));
		}
		if (jacroidEMF.diagram.providers.JacroidEMFElementTypes.Enumerate_2004 == req
				.getElementType()) {
			return getGEFWrapper(new jacroidEMF.diagram.edit.commands.EnumerateCreateCommand(
					req));
		}
		if (jacroidEMF.diagram.providers.JacroidEMFElementTypes.FirebaseAuth_2005 == req
				.getElementType()) {
			return getGEFWrapper(new jacroidEMF.diagram.edit.commands.FirebaseAuthCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
