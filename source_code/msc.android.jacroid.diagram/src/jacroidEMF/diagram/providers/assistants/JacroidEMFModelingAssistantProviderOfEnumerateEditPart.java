/*
 * 
 */
package jacroidEMF.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class JacroidEMFModelingAssistantProviderOfEnumerateEditPart extends
		jacroidEMF.diagram.providers.JacroidEMFModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(jacroidEMF.diagram.providers.JacroidEMFElementTypes.ItemEnum_3005);
		return types;
	}

}
