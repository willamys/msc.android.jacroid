/*
 * 
 */
package jacroidEMF.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class JacroidEMFParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser classesDescriptorName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getClassesDescriptorName_5004Parser() {
		if (classesDescriptorName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { jacroidEMF.JacroidEMFPackage.eINSTANCE
					.getClassesDescriptor_Name() };
			jacroidEMF.diagram.parsers.MessageFormatParser parser = new jacroidEMF.diagram.parsers.MessageFormatParser(
					features);
			classesDescriptorName_5004Parser = parser;
		}
		return classesDescriptorName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser componentNameType_5005Parser;

	/**
	 * @generated
	 */
	private IParser getComponentNameType_5005Parser() {
		if (componentNameType_5005Parser == null) {
			EAttribute[] features = new EAttribute[] {
					jacroidEMF.JacroidEMFPackage.eINSTANCE.getComponent_Name(),
					jacroidEMF.JacroidEMFPackage.eINSTANCE.getComponent_Type() };
			jacroidEMF.diagram.parsers.MessageFormatParser parser = new jacroidEMF.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0} use {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} use {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} use {1}"); //$NON-NLS-1$
			componentNameType_5005Parser = parser;
		}
		return componentNameType_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser enumerateName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getEnumerateName_5007Parser() {
		if (enumerateName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { jacroidEMF.JacroidEMFPackage.eINSTANCE
					.getEnumerate_Name() };
			jacroidEMF.diagram.parsers.MessageFormatParser parser = new jacroidEMF.diagram.parsers.MessageFormatParser(
					features);
			enumerateName_5007Parser = parser;
		}
		return enumerateName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser firebaseAuthName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getFirebaseAuthName_5010Parser() {
		if (firebaseAuthName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { jacroidEMF.JacroidEMFPackage.eINSTANCE
					.getFirebaseAuth_Name() };
			jacroidEMF.diagram.parsers.MessageFormatParser parser = new jacroidEMF.diagram.parsers.MessageFormatParser(
					features);
			firebaseAuthName_5010Parser = parser;
		}
		return firebaseAuthName_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser attributeDescriptorNameTypeData_5003Parser;

	/**
	 * @generated
	 */
	private IParser getAttributeDescriptorNameTypeData_5003Parser() {
		if (attributeDescriptorNameTypeData_5003Parser == null) {
			EAttribute[] features = new EAttribute[] {
					jacroidEMF.JacroidEMFPackage.eINSTANCE
							.getAttributeDescriptor_Name(),
					jacroidEMF.JacroidEMFPackage.eINSTANCE
							.getAttributeDescriptor_TypeData() };
			jacroidEMF.diagram.parsers.MessageFormatParser parser = new jacroidEMF.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} : {1}"); //$NON-NLS-1$
			attributeDescriptorNameTypeData_5003Parser = parser;
		}
		return attributeDescriptorNameTypeData_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser itemEnumName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getItemEnumName_5009Parser() {
		if (itemEnumName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { jacroidEMF.JacroidEMFPackage.eINSTANCE
					.getItemEnum_Name() };
			jacroidEMF.diagram.parsers.MessageFormatParser parser = new jacroidEMF.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			itemEnumName_5009Parser = parser;
		}
		return itemEnumName_5009Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case jacroidEMF.diagram.edit.parts.ClassesDescriptorNameEditPart.VISUAL_ID:
			return getClassesDescriptorName_5004Parser();
		case jacroidEMF.diagram.edit.parts.ComponentNameTypeEditPart.VISUAL_ID:
			return getComponentNameType_5005Parser();
		case jacroidEMF.diagram.edit.parts.EnumerateNameEditPart.VISUAL_ID:
			return getEnumerateName_5007Parser();
		case jacroidEMF.diagram.edit.parts.FirebaseAuthNameEditPart.VISUAL_ID:
			return getFirebaseAuthName_5010Parser();
		case jacroidEMF.diagram.edit.parts.AttributeDescriptorNameTypeDataEditPart.VISUAL_ID:
			return getAttributeDescriptorNameTypeData_5003Parser();
		case jacroidEMF.diagram.edit.parts.ItemEnumNameEditPart.VISUAL_ID:
			return getItemEnumName_5009Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(jacroidEMF.diagram.part.JacroidEMFVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (jacroidEMF.diagram.providers.JacroidEMFElementTypes
					.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
