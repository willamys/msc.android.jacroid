/*
 * 
 */
package jacroidEMF.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class JacroidEMFNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		jacroidEMF.diagram.part.JacroidEMFDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		jacroidEMF.diagram.part.JacroidEMFDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof jacroidEMF.diagram.navigator.JacroidEMFNavigatorItem
				&& !isOwnView(((jacroidEMF.diagram.navigator.JacroidEMFNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof jacroidEMF.diagram.navigator.JacroidEMFNavigatorGroup) {
			jacroidEMF.diagram.navigator.JacroidEMFNavigatorGroup group = (jacroidEMF.diagram.navigator.JacroidEMFNavigatorGroup) element;
			return jacroidEMF.diagram.part.JacroidEMFDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof jacroidEMF.diagram.navigator.JacroidEMFNavigatorItem) {
			jacroidEMF.diagram.navigator.JacroidEMFNavigatorItem navigatorItem = (jacroidEMF.diagram.navigator.JacroidEMFNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
				.getVisualID(view)) {
		case jacroidEMF.diagram.edit.parts.ProjetoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?jacroidEMF?Projeto", jacroidEMF.diagram.providers.JacroidEMFElementTypes.Projeto_1000); //$NON-NLS-1$
		case jacroidEMF.diagram.edit.parts.ClassesDescriptorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?jacroidEMF?ClassesDescriptor", jacroidEMF.diagram.providers.JacroidEMFElementTypes.ClassesDescriptor_2002); //$NON-NLS-1$
		case jacroidEMF.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?jacroidEMF?Component", jacroidEMF.diagram.providers.JacroidEMFElementTypes.Component_2003); //$NON-NLS-1$
		case jacroidEMF.diagram.edit.parts.EnumerateEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?jacroidEMF?Enumerate", jacroidEMF.diagram.providers.JacroidEMFElementTypes.Enumerate_2004); //$NON-NLS-1$
		case jacroidEMF.diagram.edit.parts.FirebaseAuthEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?jacroidEMF?FirebaseAuth", jacroidEMF.diagram.providers.JacroidEMFElementTypes.FirebaseAuth_2005); //$NON-NLS-1$
		case jacroidEMF.diagram.edit.parts.AttributeDescriptorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?jacroidEMF?AttributeDescriptor", jacroidEMF.diagram.providers.JacroidEMFElementTypes.AttributeDescriptor_3002); //$NON-NLS-1$
		case jacroidEMF.diagram.edit.parts.ItemEnumEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?jacroidEMF?ItemEnum", jacroidEMF.diagram.providers.JacroidEMFElementTypes.ItemEnum_3005); //$NON-NLS-1$
		case jacroidEMF.diagram.edit.parts.RelationClassesDescriptorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?jacroidEMF?RelationClassesDescriptor", jacroidEMF.diagram.providers.JacroidEMFElementTypes.RelationClassesDescriptor_4002); //$NON-NLS-1$
		case jacroidEMF.diagram.edit.parts.RelationAttributeDescriptorToComponentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?jacroidEMF?RelationAttributeDescriptorToComponent", jacroidEMF.diagram.providers.JacroidEMFElementTypes.RelationAttributeDescriptorToComponent_4004); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = jacroidEMF.diagram.part.JacroidEMFDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& jacroidEMF.diagram.providers.JacroidEMFElementTypes
						.isKnownElementType(elementType)) {
			image = jacroidEMF.diagram.providers.JacroidEMFElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof jacroidEMF.diagram.navigator.JacroidEMFNavigatorGroup) {
			jacroidEMF.diagram.navigator.JacroidEMFNavigatorGroup group = (jacroidEMF.diagram.navigator.JacroidEMFNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof jacroidEMF.diagram.navigator.JacroidEMFNavigatorItem) {
			jacroidEMF.diagram.navigator.JacroidEMFNavigatorItem navigatorItem = (jacroidEMF.diagram.navigator.JacroidEMFNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
				.getVisualID(view)) {
		case jacroidEMF.diagram.edit.parts.ProjetoEditPart.VISUAL_ID:
			return getProjeto_1000Text(view);
		case jacroidEMF.diagram.edit.parts.ClassesDescriptorEditPart.VISUAL_ID:
			return getClassesDescriptor_2002Text(view);
		case jacroidEMF.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
			return getComponent_2003Text(view);
		case jacroidEMF.diagram.edit.parts.EnumerateEditPart.VISUAL_ID:
			return getEnumerate_2004Text(view);
		case jacroidEMF.diagram.edit.parts.FirebaseAuthEditPart.VISUAL_ID:
			return getFirebaseAuth_2005Text(view);
		case jacroidEMF.diagram.edit.parts.AttributeDescriptorEditPart.VISUAL_ID:
			return getAttributeDescriptor_3002Text(view);
		case jacroidEMF.diagram.edit.parts.ItemEnumEditPart.VISUAL_ID:
			return getItemEnum_3005Text(view);
		case jacroidEMF.diagram.edit.parts.RelationClassesDescriptorEditPart.VISUAL_ID:
			return getRelationClassesDescriptor_4002Text(view);
		case jacroidEMF.diagram.edit.parts.RelationAttributeDescriptorToComponentEditPart.VISUAL_ID:
			return getRelationAttributeDescriptorToComponent_4004Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getProjeto_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getClassesDescriptor_2002Text(View view) {
		IParser parser = jacroidEMF.diagram.providers.JacroidEMFParserProvider
				.getParser(
						jacroidEMF.diagram.providers.JacroidEMFElementTypes.ClassesDescriptor_2002,
						view.getElement() != null ? view.getElement() : view,
						jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
								.getType(jacroidEMF.diagram.edit.parts.ClassesDescriptorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			jacroidEMF.diagram.part.JacroidEMFDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComponent_2003Text(View view) {
		IParser parser = jacroidEMF.diagram.providers.JacroidEMFParserProvider
				.getParser(
						jacroidEMF.diagram.providers.JacroidEMFElementTypes.Component_2003,
						view.getElement() != null ? view.getElement() : view,
						jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
								.getType(jacroidEMF.diagram.edit.parts.ComponentNameTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			jacroidEMF.diagram.part.JacroidEMFDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEnumerate_2004Text(View view) {
		IParser parser = jacroidEMF.diagram.providers.JacroidEMFParserProvider
				.getParser(
						jacroidEMF.diagram.providers.JacroidEMFElementTypes.Enumerate_2004,
						view.getElement() != null ? view.getElement() : view,
						jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
								.getType(jacroidEMF.diagram.edit.parts.EnumerateNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			jacroidEMF.diagram.part.JacroidEMFDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFirebaseAuth_2005Text(View view) {
		IParser parser = jacroidEMF.diagram.providers.JacroidEMFParserProvider
				.getParser(
						jacroidEMF.diagram.providers.JacroidEMFElementTypes.FirebaseAuth_2005,
						view.getElement() != null ? view.getElement() : view,
						jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
								.getType(jacroidEMF.diagram.edit.parts.FirebaseAuthNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			jacroidEMF.diagram.part.JacroidEMFDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttributeDescriptor_3002Text(View view) {
		IParser parser = jacroidEMF.diagram.providers.JacroidEMFParserProvider
				.getParser(
						jacroidEMF.diagram.providers.JacroidEMFElementTypes.AttributeDescriptor_3002,
						view.getElement() != null ? view.getElement() : view,
						jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
								.getType(jacroidEMF.diagram.edit.parts.AttributeDescriptorNameTypeDataEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			jacroidEMF.diagram.part.JacroidEMFDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getItemEnum_3005Text(View view) {
		IParser parser = jacroidEMF.diagram.providers.JacroidEMFParserProvider
				.getParser(
						jacroidEMF.diagram.providers.JacroidEMFElementTypes.ItemEnum_3005,
						view.getElement() != null ? view.getElement() : view,
						jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
								.getType(jacroidEMF.diagram.edit.parts.ItemEnumNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			jacroidEMF.diagram.part.JacroidEMFDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRelationClassesDescriptor_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRelationAttributeDescriptorToComponent_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
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
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return jacroidEMF.diagram.edit.parts.ProjetoEditPart.MODEL_ID
				.equals(jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
						.getModelID(view));
	}

}
