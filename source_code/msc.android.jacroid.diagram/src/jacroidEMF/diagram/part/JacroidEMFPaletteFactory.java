/*
 * 
 */
package jacroidEMF.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class JacroidEMFPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				jacroidEMF.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAttributeDescriptor1CreationTool());
		paletteContainer.add(createClassesDescriptor2CreationTool());
		paletteContainer.add(createComponent3CreationTool());
		paletteContainer.add(createEnumerate4CreationTool());
		paletteContainer.add(createFirebaseAuth5CreationTool());
		paletteContainer.add(createItemEnum6CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				jacroidEMF.diagram.part.Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer
				.add(createRelationAttributeDescriptorToComponent1CreationTool());
		paletteContainer.add(createRelationClassesDescriptor2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttributeDescriptor1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				jacroidEMF.diagram.part.Messages.AttributeDescriptor1CreationTool_title,
				jacroidEMF.diagram.part.Messages.AttributeDescriptor1CreationTool_desc,
				Collections
						.singletonList(jacroidEMF.diagram.providers.JacroidEMFElementTypes.AttributeDescriptor_3002));
		entry.setId("createAttributeDescriptor1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(jacroidEMF.diagram.providers.JacroidEMFElementTypes
				.getImageDescriptor(jacroidEMF.diagram.providers.JacroidEMFElementTypes.AttributeDescriptor_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClassesDescriptor2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				jacroidEMF.diagram.part.Messages.ClassesDescriptor2CreationTool_title,
				jacroidEMF.diagram.part.Messages.ClassesDescriptor2CreationTool_desc,
				Collections
						.singletonList(jacroidEMF.diagram.providers.JacroidEMFElementTypes.ClassesDescriptor_2002));
		entry.setId("createClassesDescriptor2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(jacroidEMF.diagram.providers.JacroidEMFElementTypes
				.getImageDescriptor(jacroidEMF.diagram.providers.JacroidEMFElementTypes.ClassesDescriptor_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComponent3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				jacroidEMF.diagram.part.Messages.Component3CreationTool_title,
				jacroidEMF.diagram.part.Messages.Component3CreationTool_desc,
				Collections
						.singletonList(jacroidEMF.diagram.providers.JacroidEMFElementTypes.Component_2003));
		entry.setId("createComponent3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(jacroidEMF.diagram.providers.JacroidEMFElementTypes
				.getImageDescriptor(jacroidEMF.diagram.providers.JacroidEMFElementTypes.Component_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnumerate4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				jacroidEMF.diagram.part.Messages.Enumerate4CreationTool_title,
				jacroidEMF.diagram.part.Messages.Enumerate4CreationTool_desc,
				Collections
						.singletonList(jacroidEMF.diagram.providers.JacroidEMFElementTypes.Enumerate_2004));
		entry.setId("createEnumerate4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(jacroidEMF.diagram.providers.JacroidEMFElementTypes
				.getImageDescriptor(jacroidEMF.diagram.providers.JacroidEMFElementTypes.Enumerate_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFirebaseAuth5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				jacroidEMF.diagram.part.Messages.FirebaseAuth5CreationTool_title,
				jacroidEMF.diagram.part.Messages.FirebaseAuth5CreationTool_desc,
				Collections
						.singletonList(jacroidEMF.diagram.providers.JacroidEMFElementTypes.FirebaseAuth_2005));
		entry.setId("createFirebaseAuth5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(jacroidEMF.diagram.providers.JacroidEMFElementTypes
				.getImageDescriptor(jacroidEMF.diagram.providers.JacroidEMFElementTypes.FirebaseAuth_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createItemEnum6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				jacroidEMF.diagram.part.Messages.ItemEnum6CreationTool_title,
				jacroidEMF.diagram.part.Messages.ItemEnum6CreationTool_desc,
				Collections
						.singletonList(jacroidEMF.diagram.providers.JacroidEMFElementTypes.ItemEnum_3005));
		entry.setId("createItemEnum6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(jacroidEMF.diagram.providers.JacroidEMFElementTypes
				.getImageDescriptor(jacroidEMF.diagram.providers.JacroidEMFElementTypes.ItemEnum_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelationAttributeDescriptorToComponent1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				jacroidEMF.diagram.part.Messages.RelationAttributeDescriptorToComponent1CreationTool_title,
				jacroidEMF.diagram.part.Messages.RelationAttributeDescriptorToComponent1CreationTool_desc,
				Collections
						.singletonList(jacroidEMF.diagram.providers.JacroidEMFElementTypes.RelationAttributeDescriptorToComponent_4004));
		entry.setId("createRelationAttributeDescriptorToComponent1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(jacroidEMF.diagram.providers.JacroidEMFElementTypes
				.getImageDescriptor(jacroidEMF.diagram.providers.JacroidEMFElementTypes.RelationAttributeDescriptorToComponent_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelationClassesDescriptor2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				jacroidEMF.diagram.part.Messages.RelationClassesDescriptor2CreationTool_title,
				jacroidEMF.diagram.part.Messages.RelationClassesDescriptor2CreationTool_desc,
				Collections
						.singletonList(jacroidEMF.diagram.providers.JacroidEMFElementTypes.RelationClassesDescriptor_4002));
		entry.setId("createRelationClassesDescriptor2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(jacroidEMF.diagram.providers.JacroidEMFElementTypes
				.getImageDescriptor(jacroidEMF.diagram.providers.JacroidEMFElementTypes.RelationClassesDescriptor_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
