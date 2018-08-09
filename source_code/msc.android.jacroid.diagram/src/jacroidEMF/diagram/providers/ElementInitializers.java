/*
 * 
 */
package jacroidEMF.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = jacroidEMF.diagram.part.JacroidEMFDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			jacroidEMF.diagram.part.JacroidEMFDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
