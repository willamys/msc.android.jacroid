package msc.android.jacroid.diagram.m2t;

import gradle.GradleFiles;
import img.Img;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.FileChannel;

import jacroidEMF.JacroidEMFPackage;
import jacroidEMF.diagram.m2t.M2TAction;
import jacroidEMF.diagram.m2t.TransformationView;
import jacroidEMF.diagram.part.JacroidEMFDiagramEditor;
import libs.Libs;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.osgi.framework.Bundle;

import templatesegl.TemplatesEgl;

public class GenerateHandler extends AbstractHandler {
	String ide;
	EglTemplateFactoryModuleAdapter module;
	URL fileURL;
	String destino;
	String projectName;
	InMemoryEmfModel m;
	IWorkbenchWindow window;
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// Acessa o editor ativo
				IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
				window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
				// Caso seja um diagrama
				if (editor instanceof JacroidEMFDiagramEditor) {

					JacroidEMFDiagramEditor friendsDiagramEditor = (JacroidEMFDiagramEditor) editor;

					// Obtém o modelo EMF do editor
					Resource resource = getFirstSemanticModelResource( friendsDiagramEditor.getEditingDomain().getResourceSet());

					if (resource == null) return null;

					// Envolve o modelo EMF neste InMemoryEmfModel
					m = new InMemoryEmfModel("M", resource, JacroidEMFPackage.eINSTANCE);

					// Constrói o módulo EGL
					module = new EglTemplateFactoryModuleAdapter(new EglFileGeneratingTemplateFactory());
					//EgxModule module = new EgxModule(new EglFileGeneratingTemplateFactory());

					//Bundle bundle = Platform.getBundle("msc.android.jacroid");
					//URL fileURL = bundle.getEntry("main.egx");
					fileURL = TemplatesEgl.class.getResource("delegateProject.egl");
					//fileURL = bundle.getEntry("templatesegl/delegateProject.egl");

					/** obtendo local do projeto para copiar**/
					IPath path = new Path(resource.getURI().toPlatformString(true));
					IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
					//obtendo o nome do projeto 
					projectName = path.toString().substring(1, path.toString().length() - file.getName().length() -1);

					destino = file.getLocation().toString().substring(0, file.getLocation().toString().length() - file.getName().length());
					//	System.out.println(destino+System.getProperty("file.separator")+"Projeto"+System.getProperty("file.separator")+"assets");
					//System.out.println(Platform.getLocation()+System.getProperty("file.separator"));
					//obtendo qual a ide foi selecionada pelo usuário
					ide = verify(window);

					Job job = new Job("Creating project..."+ide) {
						@Override
						protected IStatus run(IProgressMonitor monitor) {
							// Set total number of work units
							try {
								module.parse(FileLocator.resolve(fileURL).toURI());
								//definindo a variavel com a informação de saída do projeto
								module.getContext().getFrameStack().put(Variable.createReadOnlyVariable("outputDir",destino+System.getProperty("file.separator")+"gen"));
								module.getContext().getFrameStack().put(Variable.createReadOnlyVariable("IDE",ide));
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}		
							if (!module.getParseProblems().isEmpty()) {
								System.out.println("Syntax errors found. Exiting.");
								return Status.CANCEL_STATUS;
							}
							// Make the document visible to the EGX program
							module.getContext().getModelRepository().addModel(m);
							// ... and execute
							try {
								module.execute();
							} catch (EolRuntimeException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}


							if(ide.equals("Eclipse")){
								//criar arquivos restantes e transferir imagens
								String projeto_raiz = destino+System.getProperty("file.separator")+"gen"+System.getProperty("file.separator")+ide+System.getProperty("file.separator")+"projeto";

								//String settings = destino+System.getProperty("file.separator")+"gen"+System.getProperty("file.separator")+"projeto"+System.getProperty("file.separator")+".settings";
								String libs = destino+System.getProperty("file.separator")+"gen"+System.getProperty("file.separator")+ide+System.getProperty("file.separator")+"projeto"+System.getProperty("file.separator")+"lib";
								String assets = destino+System.getProperty("file.separator")+"gen"+System.getProperty("file.separator")+ide+System.getProperty("file.separator")+"projeto"+System.getProperty("file.separator")+"assets";
								String drawable = destino+System.getProperty("file.separator")+"gen"+System.getProperty("file.separator")+ide+System.getProperty("file.separator")+"projeto"+System.getProperty("file.separator")+"res"+System.getProperty("file.separator")+"drawable";
								String drawable_hdpi = destino+System.getProperty("file.separator")+"gen"+System.getProperty("file.separator")+ide+System.getProperty("file.separator")+"projeto"+System.getProperty("file.separator")+"res"+System.getProperty("file.separator")+"drawable-hdpi";
								String drawable_ldpi = destino+System.getProperty("file.separator")+"gen"+System.getProperty("file.separator")+ide+System.getProperty("file.separator")+"projeto"+System.getProperty("file.separator")+"res"+System.getProperty("file.separator")+"drawable-ldpi";
								String drawable_mdpi = destino+System.getProperty("file.separator")+"gen"+System.getProperty("file.separator")+ide+System.getProperty("file.separator")+"projeto"+System.getProperty("file.separator")+"res"+System.getProperty("file.separator")+"drawable-mdpi";

								String gradle = destino+System.getProperty("file.separator")+"gen"+System.getProperty("file.separator")+ide+System.getProperty("file.separator")+"projeto"+System.getProperty("file.separator")+"gradle"+System.getProperty("file.separator")+"wrapper";

								String dotGradle = destino+System.getProperty("file.separator")+"gen"+System.getProperty("file.separator")+ide+System.getProperty("file.separator")+"projeto"+System.getProperty("file.separator")+".gradle";
								
								createDirectories(assets);
								createDirectories(drawable);
								createDirectories(libs);
								getFilesDefault(Libs.class.getResourceAsStream("/libs/glide-3.7.0.jar"),libs+System.getProperty("file.separator")+"glide-3.7.0.jar");
								getFilesDefault(Img.class.getResourceAsStream("/img/auth.png"),drawable+System.getProperty("file.separator")+"auth.png");
								getFilesDefault(Img.class.getResourceAsStream("/img/edit.png"),drawable+System.getProperty("file.separator")+"edit.png");
								getFilesDefault(Img.class.getResourceAsStream("/img/dots.png"),drawable+System.getProperty("file.separator")+"dots.png");
								getFilesDefault(Img.class.getResourceAsStream("/img/plus.png"),drawable+System.getProperty("file.separator")+"plus.png");
								getFilesDefault(Img.class.getResourceAsStream("/img/jacroid.png"),drawable+System.getProperty("file.separator")+"jacroid.png");
								getFilesDefault(Img.class.getResourceAsStream("/img/marker.png"),drawable+System.getProperty("file.separator")+"marker.png");
								createDirectories(drawable_hdpi);
								getFilesDefault(Img.class.getResourceAsStream("/img/ic_hdpi.png"),drawable_hdpi+System.getProperty("file.separator")+"ico.png");
								createDirectories(drawable_ldpi);
								getFilesDefault(Img.class.getResourceAsStream("/img/ic_ldpi.png"),drawable_ldpi+System.getProperty("file.separator")+"ico.png");
								createDirectories(drawable_mdpi);
								getFilesDefault(Img.class.getResourceAsStream("/img/ic_mdpi.png"),drawable_mdpi+System.getProperty("file.separator")+"ico.png");

								//arquivos gradle
								createDirectories(gradle);
								getFilesDefault(GradleFiles.class.getResourceAsStream("/gradle/gradle-wrapper.jar"),gradle+System.getProperty("file.separator")+"gradle-wrapper.jar");
								getFilesDefault(GradleFiles.class.getResourceAsStream("/gradle/gradle-wrapper.properties"),gradle+System.getProperty("file.separator")+"gradle-wrapper.properties");
								getFilesDefault(GradleFiles.class.getResourceAsStream("/gradle/gradlew"),projeto_raiz+System.getProperty("file.separator")+"gradlew");
								getFilesDefault(GradleFiles.class.getResourceAsStream("/gradle/gradlew.bat"),projeto_raiz+System.getProperty("file.separator")+"gradlew.bat");

								createDirectories(dotGradle+System.getProperty("file.separator")+"2.2.1"+System.getProperty("file.separator")+"taskArtifacts");
								createDirectories(dotGradle+System.getProperty("file.separator")+"2.3"+System.getProperty("file.separator")+"taskArtifacts");

								Display.getDefault().asyncExec(new Runnable() {
									public void run() {
										//TransformationView view = null;
										//ViewHelp help = null;
										//try {
										//	help = (ViewHelp) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(ViewHelp.ID);
										//	view = (TransformationView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(TransformationView.ID);
										MessageDialog.openInformation(
												window.getShell(),
												"Jacroid",
												"Código Gerado e salvo em: \n\n"
														+projectName+" -> gen -> "+ide.toLowerCase());
										//Atualizar o projeto
										try {
											ResourcesPlugin.getWorkspace().getRoot().getProject(projectName).refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
										} catch (CoreException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
										//l} catch (PartInitException e1) {
										//	e1.printStackTrace();
										//}
										//view.setInput("Código gerado e salvo em:\n\n"+destino+"gen"+System.getProperty("file.separator")+ide.toLowerCase());
										//help.setInput("");
									}
								});
							
							}else if(ide.equals("AndroidStudio")){
								
								//criar arquivos restantes e transferir imagens
								String projeto_raiz = destino+System.getProperty("file.separator")+"gen"+System.getProperty("file.separator")+ide+System.getProperty("file.separator")+"projeto";

								//String settings = destino+System.getProperty("file.separator")+"gen"+System.getProperty("file.separator")+"projeto"+System.getProperty("file.separator")+".settings";
								String libs = destino+System.getProperty("file.separator")+"gen"+System.getProperty("file.separator")+ide+System.getProperty("file.separator")+"projeto"+System.getProperty("file.separator")+"app"+System.getProperty("file.separator")+"libs";
								String drawable = destino+System.getProperty("file.separator")+"gen"+System.getProperty("file.separator")+ide+System.getProperty("file.separator")+"projeto"+System.getProperty("file.separator")+"app"+System.getProperty("file.separator")+"src"+System.getProperty("file.separator")+"main"+System.getProperty("file.separator")+"res"+System.getProperty("file.separator")+"drawable";
								String drawable_hdpi = destino+System.getProperty("file.separator")+"gen"+System.getProperty("file.separator")+ide+System.getProperty("file.separator")+"projeto"+System.getProperty("file.separator")+"app"+System.getProperty("file.separator")+"src"+System.getProperty("file.separator")+"main"+System.getProperty("file.separator")+"res"+System.getProperty("file.separator")+"drawable-hdpi";
								String drawable_ldpi = destino+System.getProperty("file.separator")+"gen"+System.getProperty("file.separator")+ide+System.getProperty("file.separator")+"projeto"+System.getProperty("file.separator")+"app"+System.getProperty("file.separator")+"src"+System.getProperty("file.separator")+"main"+System.getProperty("file.separator")+"res"+System.getProperty("file.separator")+"drawable-ldpi";
								String drawable_mdpi = destino+System.getProperty("file.separator")+"gen"+System.getProperty("file.separator")+ide+System.getProperty("file.separator")+"projeto"+System.getProperty("file.separator")+"app"+System.getProperty("file.separator")+"src"+System.getProperty("file.separator")+"main"+System.getProperty("file.separator")+"res"+System.getProperty("file.separator")+"drawable-mdpi";

								String gradle = destino+System.getProperty("file.separator")+"gen"+System.getProperty("file.separator")+ide+System.getProperty("file.separator")+"projeto"+System.getProperty("file.separator")+"gradle"+System.getProperty("file.separator")+"wrapper";

								String dotGradle = destino+System.getProperty("file.separator")+"gen"+System.getProperty("file.separator")+ide+System.getProperty("file.separator")+"projeto"+System.getProperty("file.separator")+".gradle";
								
								createDirectories(drawable);
								createDirectories(libs);
								getFilesDefault(Libs.class.getResourceAsStream("/libs/glide-3.7.0.jar"),libs+System.getProperty("file.separator")+"glide-3.7.0.jar");
								getFilesDefault(Img.class.getResourceAsStream("/img/auth.png"),drawable+System.getProperty("file.separator")+"auth.png");
								getFilesDefault(Img.class.getResourceAsStream("/img/edit.png"),drawable+System.getProperty("file.separator")+"edit.png");
								getFilesDefault(Img.class.getResourceAsStream("/img/dots.png"),drawable+System.getProperty("file.separator")+"dots.png");
								getFilesDefault(Img.class.getResourceAsStream("/img/plus.png"),drawable+System.getProperty("file.separator")+"plus.png");
								getFilesDefault(Img.class.getResourceAsStream("/img/jacroid.png"),drawable+System.getProperty("file.separator")+"jacroid.png");
								getFilesDefault(Img.class.getResourceAsStream("/img/marker.png"),drawable+System.getProperty("file.separator")+"marker.png");
								createDirectories(drawable_hdpi);
								getFilesDefault(Img.class.getResourceAsStream("/img/ic_hdpi.png"),drawable_hdpi+System.getProperty("file.separator")+"ico.png");
								createDirectories(drawable_ldpi);
								getFilesDefault(Img.class.getResourceAsStream("/img/ic_ldpi.png"),drawable_ldpi+System.getProperty("file.separator")+"ico.png");
								createDirectories(drawable_mdpi);
								getFilesDefault(Img.class.getResourceAsStream("/img/ic_mdpi.png"),drawable_mdpi+System.getProperty("file.separator")+"ico.png");

								//arquivos gradle
								//createDirectories(gradle);
								//getFilesDefault(GradleFiles.class.getResourceAsStream("/gradle/gradle-wrapper.jar"),gradle+System.getProperty("file.separator")+"gradle-wrapper.jar");
								//getFilesDefault(GradleFiles.class.getResourceAsStream("/gradle/gradle-wrapper.properties"),gradle+System.getProperty("file.separator")+"gradle-wrapper.properties");
								//getFilesDefault(GradleFiles.class.getResourceAsStream("/gradle/gradlew"),projeto_raiz+System.getProperty("file.separator")+"gradlew");
								//getFilesDefault(GradleFiles.class.getResourceAsStream("/gradle/gradlew.bat"),projeto_raiz+System.getProperty("file.separator")+"gradlew.bat");

								createDirectories(dotGradle+System.getProperty("file.separator")+"2.2.1"+System.getProperty("file.separator")+"taskArtifacts");
								createDirectories(dotGradle+System.getProperty("file.separator")+"2.3"+System.getProperty("file.separator")+"taskArtifacts");

								Display.getDefault().asyncExec(new Runnable() {
									public void run() {
										//TransformationView view = null;
										//ViewHelp help = null;
										//try {
										//	help = (ViewHelp) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(ViewHelp.ID);
										//	view = (TransformationView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(TransformationView.ID);
										MessageDialog.openInformation(
												window.getShell(),
												"Jacroid",
												"Código Gerado e salvo em: \n\n"
														+projectName+" -> gen -> "+ide.toLowerCase());
										//Atualizar o projeto
										try {
											ResourcesPlugin.getWorkspace().getRoot().getProject(projectName).refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
										} catch (CoreException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
										//l} catch (PartInitException e1) {
										//	e1.printStackTrace();
										//}
										//view.setInput("Código gerado e salvo em:\n\n"+destino+"gen"+System.getProperty("file.separator")+ide.toLowerCase());
										//help.setInput("");
									}
								});
							}
							return Status.OK_STATUS;
						}
					};
					//mensagem informando que o código foi gerado
					job.schedule();
				}
				return window;
			}

			public Resource getFirstSemanticModelResource(ResourceSet resourceSet) {
				for (Resource resource : resourceSet.getResources()) {
					return resource;
				}
				return null;
			}
			/**
			 * Apresenta a mensagem de que o código foi gerado.
			 * @param window
			 * @param projectName
			 * @param destino
			 
			public void resultGenerate(IWorkbenchWindow window, String projectName, String destino, String ide){
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						//TransformationView view = null;
						//ViewHelp help = null;
						//try {
						//	help = (ViewHelp) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(ViewHelp.ID);
						//	view = (TransformationView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(TransformationView.ID);
						MessageDialog.openInformation(
								window.getShell(),
								"Jacroid",
								"Código Gerado e salvo em: \n\n"
										+projectName+" -> gen -> "+ide.toLowerCase());
						//Atualizar o projeto
						try {
							ResourcesPlugin.getWorkspace().getRoot().getProject(projectName).refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
						} catch (CoreException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						//l} catch (PartInitException e1) {
						//	e1.printStackTrace();
						//}
						//view.setInput("Código gerado e salvo em:\n\n"+destino+"gen"+System.getProperty("file.separator")+ide.toLowerCase());
						//help.setInput("");
					}
				});
			}
	/**
	 * Verificar qual a IDE foi selecionada pelo usuário
	 * @param window
	 * @return
	 */
	public String verify(IWorkbenchWindow window){
		String ide = null;
		MessageDialog dialog = new MessageDialog(window.getShell(), "Jacroid: Opção de IDE", null,
				"Deseja que o projeto gerado seja compatível com:", MessageDialog.QUESTION_WITH_CANCEL, new String[] { "Android Studio",
			"Eclipse","Cancelar"}, 0);
		int result = dialog.open();
		switch (result) {
		case 0:
			ide = "AndroidStudio";
			break;
		case 1:
			ide = "Eclipse";
			break;
		case 2:
			ide = "none";
			break;
		default:
			break;
		}
		return ide;
	}
	/**
	 * Criar diretórios do projeto
	 * @param path
	 */
	public static void createDirectories(String path) {
		File file = new File(path);
		file.mkdirs();
	}
	/**
	 * Criar arquivos padrão
	 * @param input
	 * @param path_destino
	 */
	public static void getFilesDefault(InputStream input, String path_destino) {

		File file_destino =  new File(path_destino);

		if(!file_destino.exists()){
			try {
				//FileInputStream input = new FileInputStream(file_origem);
				FileOutputStream output = new  FileOutputStream(file_destino);
				int c;
				while ((c = input.read())!= -1) {
					output.write(c);
				}
				input.close();
				output.close();

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	/**
	 * Transferir arquivos do plugin para o projeto
	 * @param origem
	 * @param destino
	 */
	public static void transferDir(String origem, String destino){
		// Cria channel na origem
		try{
			FileChannel  oriChannel = new FileInputStream(origem).getChannel();
			// Cria channel no destino
			FileChannel destChannel = new FileOutputStream(destino).getChannel();
			// Copia conteúdo da origem no destino
			destChannel.transferFrom(oriChannel, 0, oriChannel.size());

			// Fecha channels
			oriChannel.close();
			destChannel.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
