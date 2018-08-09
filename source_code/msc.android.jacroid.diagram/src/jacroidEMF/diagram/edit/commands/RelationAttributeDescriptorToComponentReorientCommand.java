/*
 * 
 */
package jacroidEMF.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class RelationAttributeDescriptorToComponentReorientCommand extends
		EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public RelationAttributeDescriptorToComponentReorientCommand(
			ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof jacroidEMF.RelationAttributeDescriptorToComponent) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof jacroidEMF.AttributeDescriptor && newEnd instanceof jacroidEMF.AttributeDescriptor)) {
			return false;
		}
		jacroidEMF.Component target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof jacroidEMF.Projeto)) {
			return false;
		}
		jacroidEMF.Projeto container = (jacroidEMF.Projeto) getLink()
				.eContainer();
		return jacroidEMF.diagram.edit.policies.JacroidEMFBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistRelationAttributeDescriptorToComponent_4004(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof jacroidEMF.Component && newEnd instanceof jacroidEMF.Component)) {
			return false;
		}
		jacroidEMF.AttributeDescriptor source = getLink().getSource();
		if (!(getLink().eContainer() instanceof jacroidEMF.Projeto)) {
			return false;
		}
		jacroidEMF.Projeto container = (jacroidEMF.Projeto) getLink()
				.eContainer();
		return jacroidEMF.diagram.edit.policies.JacroidEMFBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistRelationAttributeDescriptorToComponent_4004(container,
						getLink(), source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected jacroidEMF.RelationAttributeDescriptorToComponent getLink() {
		return (jacroidEMF.RelationAttributeDescriptorToComponent) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected jacroidEMF.AttributeDescriptor getOldSource() {
		return (jacroidEMF.AttributeDescriptor) oldEnd;
	}

	/**
	 * @generated
	 */
	protected jacroidEMF.AttributeDescriptor getNewSource() {
		return (jacroidEMF.AttributeDescriptor) newEnd;
	}

	/**
	 * @generated
	 */
	protected jacroidEMF.Component getOldTarget() {
		return (jacroidEMF.Component) oldEnd;
	}

	/**
	 * @generated
	 */
	protected jacroidEMF.Component getNewTarget() {
		return (jacroidEMF.Component) newEnd;
	}
}
