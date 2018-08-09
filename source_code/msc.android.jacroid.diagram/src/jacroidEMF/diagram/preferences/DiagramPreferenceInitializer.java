/*
 * 
 */
package jacroidEMF.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		jacroidEMF.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		jacroidEMF.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		jacroidEMF.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		jacroidEMF.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		jacroidEMF.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return jacroidEMF.diagram.part.JacroidEMFDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
