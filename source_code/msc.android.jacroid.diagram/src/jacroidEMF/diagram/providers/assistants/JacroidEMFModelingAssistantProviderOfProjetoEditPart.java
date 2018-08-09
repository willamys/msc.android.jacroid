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
public class JacroidEMFModelingAssistantProviderOfProjetoEditPart extends
		jacroidEMF.diagram.providers.JacroidEMFModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(jacroidEMF.diagram.providers.JacroidEMFElementTypes.ClassesDescriptor_2002);
		types.add(jacroidEMF.diagram.providers.JacroidEMFElementTypes.Component_2003);
		types.add(jacroidEMF.diagram.providers.JacroidEMFElementTypes.Enumerate_2004);
		types.add(jacroidEMF.diagram.providers.JacroidEMFElementTypes.FirebaseAuth_2005);
		return types;
	}

}
