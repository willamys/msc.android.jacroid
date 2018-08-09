/*
 * 
 */
package jacroidEMF.diagram.navigator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class JacroidEMFNavigatorItem extends
		jacroidEMF.diagram.navigator.JacroidEMFAbstractNavigatorItem {

	/**
	 * @generated
	 */
	static {
		final Class[] supportedTypes = new Class[] { View.class, EObject.class };
		Platform.getAdapterManager().registerAdapters(new IAdapterFactory() {

			public Object getAdapter(Object adaptableObject, Class adapterType) {
				if (adaptableObject instanceof jacroidEMF.diagram.navigator.JacroidEMFNavigatorItem
						&& (adapterType == View.class || adapterType == EObject.class)) {
					return ((jacroidEMF.diagram.navigator.JacroidEMFNavigatorItem) adaptableObject)
							.getView();
				}
				return null;
			}

			public Class[] getAdapterList() {
				return supportedTypes;
			}
		}, jacroidEMF.diagram.navigator.JacroidEMFNavigatorItem.class);
	}

	/**
	 * @generated
	 */
	private View myView;

	/**
	 * @generated
	 */
	private boolean myLeaf = false;

	/**
	 * @generated
	 */
	public JacroidEMFNavigatorItem(View view, Object parent, boolean isLeaf) {
		super(parent);
		myView = view;
		myLeaf = isLeaf;
	}

	/**
	 * @generated
	 */
	public View getView() {
		return myView;
	}

	/**
	 * @generated
	 */
	public boolean isLeaf() {
		return myLeaf;
	}

	/**
	 * @generated
	 */
	public boolean equals(Object obj) {
		if (obj instanceof jacroidEMF.diagram.navigator.JacroidEMFNavigatorItem) {
			return EcoreUtil
					.getURI(getView())
					.equals(EcoreUtil
							.getURI(((jacroidEMF.diagram.navigator.JacroidEMFNavigatorItem) obj)
									.getView()));
		}
		return super.equals(obj);
	}

	/**
	 * @generated
	 */
	public int hashCode() {
		return EcoreUtil.getURI(getView()).hashCode();
	}

}
