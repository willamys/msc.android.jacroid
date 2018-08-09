/*
 * 
 */
package jacroidEMF.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class JacroidEMFNavigatorContentProvider implements
		ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public JacroidEMFNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<jacroidEMF.diagram.navigator.JacroidEMFNavigatorItem> result = new ArrayList<jacroidEMF.diagram.navigator.JacroidEMFNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(
							topViews,
							jacroidEMF.diagram.edit.parts.ProjetoEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof jacroidEMF.diagram.navigator.JacroidEMFNavigatorGroup) {
			jacroidEMF.diagram.navigator.JacroidEMFNavigatorGroup group = (jacroidEMF.diagram.navigator.JacroidEMFNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof jacroidEMF.diagram.navigator.JacroidEMFNavigatorItem) {
			jacroidEMF.diagram.navigator.JacroidEMFNavigatorItem navigatorItem = (jacroidEMF.diagram.navigator.JacroidEMFNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		 * Due to plugin.xml restrictions this code will be called only for views representing
		 * shortcuts to this diagram elements created on other diagrams. 
		 */
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement)
					.getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
				.getVisualID(view)) {

		case jacroidEMF.diagram.edit.parts.ProjetoEditPart.VISUAL_ID: {
			LinkedList<jacroidEMF.diagram.navigator.JacroidEMFAbstractNavigatorItem> result = new LinkedList<jacroidEMF.diagram.navigator.JacroidEMFAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			jacroidEMF.diagram.navigator.JacroidEMFNavigatorGroup links = new jacroidEMF.diagram.navigator.JacroidEMFNavigatorGroup(
					jacroidEMF.diagram.part.Messages.NavigatorGroupName_Projeto_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
							.getType(jacroidEMF.diagram.edit.parts.ClassesDescriptorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
							.getType(jacroidEMF.diagram.edit.parts.ComponentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
							.getType(jacroidEMF.diagram.edit.parts.EnumerateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
							.getType(jacroidEMF.diagram.edit.parts.FirebaseAuthEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
							.getType(jacroidEMF.diagram.edit.parts.RelationClassesDescriptorEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
							.getType(jacroidEMF.diagram.edit.parts.RelationAttributeDescriptorToComponentEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case jacroidEMF.diagram.edit.parts.ClassesDescriptorEditPart.VISUAL_ID: {
			LinkedList<jacroidEMF.diagram.navigator.JacroidEMFAbstractNavigatorItem> result = new LinkedList<jacroidEMF.diagram.navigator.JacroidEMFAbstractNavigatorItem>();
			Node sv = (Node) view;
			jacroidEMF.diagram.navigator.JacroidEMFNavigatorGroup incominglinks = new jacroidEMF.diagram.navigator.JacroidEMFNavigatorGroup(
					jacroidEMF.diagram.part.Messages.NavigatorGroupName_ClassesDescriptor_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			jacroidEMF.diagram.navigator.JacroidEMFNavigatorGroup outgoinglinks = new jacroidEMF.diagram.navigator.JacroidEMFNavigatorGroup(
					jacroidEMF.diagram.part.Messages.NavigatorGroupName_ClassesDescriptor_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
							.getType(jacroidEMF.diagram.edit.parts.ClassesDescriptorClassesDescriptorAttributesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
							.getType(jacroidEMF.diagram.edit.parts.AttributeDescriptorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
							.getType(jacroidEMF.diagram.edit.parts.RelationClassesDescriptorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
							.getType(jacroidEMF.diagram.edit.parts.RelationClassesDescriptorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case jacroidEMF.diagram.edit.parts.ComponentEditPart.VISUAL_ID: {
			LinkedList<jacroidEMF.diagram.navigator.JacroidEMFAbstractNavigatorItem> result = new LinkedList<jacroidEMF.diagram.navigator.JacroidEMFAbstractNavigatorItem>();
			Node sv = (Node) view;
			jacroidEMF.diagram.navigator.JacroidEMFNavigatorGroup incominglinks = new jacroidEMF.diagram.navigator.JacroidEMFNavigatorGroup(
					jacroidEMF.diagram.part.Messages.NavigatorGroupName_Component_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
							.getType(jacroidEMF.diagram.edit.parts.RelationAttributeDescriptorToComponentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case jacroidEMF.diagram.edit.parts.EnumerateEditPart.VISUAL_ID: {
			LinkedList<jacroidEMF.diagram.navigator.JacroidEMFAbstractNavigatorItem> result = new LinkedList<jacroidEMF.diagram.navigator.JacroidEMFAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
							.getType(jacroidEMF.diagram.edit.parts.EnumerateEnumerateItemCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
							.getType(jacroidEMF.diagram.edit.parts.ItemEnumEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case jacroidEMF.diagram.edit.parts.AttributeDescriptorEditPart.VISUAL_ID: {
			LinkedList<jacroidEMF.diagram.navigator.JacroidEMFAbstractNavigatorItem> result = new LinkedList<jacroidEMF.diagram.navigator.JacroidEMFAbstractNavigatorItem>();
			Node sv = (Node) view;
			jacroidEMF.diagram.navigator.JacroidEMFNavigatorGroup outgoinglinks = new jacroidEMF.diagram.navigator.JacroidEMFNavigatorGroup(
					jacroidEMF.diagram.part.Messages.NavigatorGroupName_AttributeDescriptor_3002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
							.getType(jacroidEMF.diagram.edit.parts.RelationAttributeDescriptorToComponentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case jacroidEMF.diagram.edit.parts.RelationClassesDescriptorEditPart.VISUAL_ID: {
			LinkedList<jacroidEMF.diagram.navigator.JacroidEMFAbstractNavigatorItem> result = new LinkedList<jacroidEMF.diagram.navigator.JacroidEMFAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			jacroidEMF.diagram.navigator.JacroidEMFNavigatorGroup target = new jacroidEMF.diagram.navigator.JacroidEMFNavigatorGroup(
					jacroidEMF.diagram.part.Messages.NavigatorGroupName_RelationClassesDescriptor_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			jacroidEMF.diagram.navigator.JacroidEMFNavigatorGroup source = new jacroidEMF.diagram.navigator.JacroidEMFNavigatorGroup(
					jacroidEMF.diagram.part.Messages.NavigatorGroupName_RelationClassesDescriptor_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
							.getType(jacroidEMF.diagram.edit.parts.ClassesDescriptorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
							.getType(jacroidEMF.diagram.edit.parts.ClassesDescriptorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case jacroidEMF.diagram.edit.parts.RelationAttributeDescriptorToComponentEditPart.VISUAL_ID: {
			LinkedList<jacroidEMF.diagram.navigator.JacroidEMFAbstractNavigatorItem> result = new LinkedList<jacroidEMF.diagram.navigator.JacroidEMFAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			jacroidEMF.diagram.navigator.JacroidEMFNavigatorGroup target = new jacroidEMF.diagram.navigator.JacroidEMFNavigatorGroup(
					jacroidEMF.diagram.part.Messages.NavigatorGroupName_RelationAttributeDescriptorToComponent_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			jacroidEMF.diagram.navigator.JacroidEMFNavigatorGroup source = new jacroidEMF.diagram.navigator.JacroidEMFNavigatorGroup(
					jacroidEMF.diagram.part.Messages.NavigatorGroupName_RelationAttributeDescriptorToComponent_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
							.getType(jacroidEMF.diagram.edit.parts.ComponentEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
							.getType(jacroidEMF.diagram.edit.parts.AttributeDescriptorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return jacroidEMF.diagram.edit.parts.ProjetoEditPart.MODEL_ID
				.equals(jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
						.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<jacroidEMF.diagram.navigator.JacroidEMFNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<jacroidEMF.diagram.navigator.JacroidEMFNavigatorItem> result = new ArrayList<jacroidEMF.diagram.navigator.JacroidEMFNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new jacroidEMF.diagram.navigator.JacroidEMFNavigatorItem(
					nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<jacroidEMF.diagram.navigator.JacroidEMFNavigatorItem> getForeignShortcuts(
			Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView)
					&& nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof jacroidEMF.diagram.navigator.JacroidEMFAbstractNavigatorItem) {
			jacroidEMF.diagram.navigator.JacroidEMFAbstractNavigatorItem abstractNavigatorItem = (jacroidEMF.diagram.navigator.JacroidEMFAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
