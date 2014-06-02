package br.ufes.inf.nemo.odercp.rcpapp.projectControl.cmt;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourceAttributes;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.dialogs.MessageDialog;

import br.ufes.inf.nemo.odercp.rcpapp.projectControl.cpd.Project;

public class ApplCRUDProject {

	public static boolean CreateNewProject(String namenewproject,
			String descriptionproject) {
		// TODO Auto-generated constructor stub
		if (!namenewproject.equals("")) {
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			Project project = new Project();
			project.setName(namenewproject);
			project.setDescription(descriptionproject);
			IProject iProject = root.getProject(project.getName());
			/*
			 * SrvAplCadastrarProjeto srv = new SrvAplCadastrarProjetoProxy();
			 * ode.controleProjeto.srv.Projeto projeto = new
			 * ode.controleProjeto.srv.Projeto("uuid", 1144168960171946495L,
			 * 1144168960171946495L, namenewproject, descriptionproject); try {
			 * // int save = srv.salvar(projeto);
			 * System.out.println(srv.recuperarQuantidadeTotal()); } catch
			 * (RemoteException e1) { // TODO Auto-generated catch block
			 * e1.printStackTrace(); }
			 */
			try {
				iProject.create(null);
				iProject.open(null);

			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;

			}
			return true;

		}
		return false;
	}

	public static boolean deleteProject(String nameProject) {
		int i;
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		// Get all projects in the workspace
		IProject[] projects = root.getProjects();
		// Loop over all projects
		for (i = 0; i < projects.length; i++) {
			if (projects[i].getName().equals(nameProject)) {
				try {
					projects[i].delete(true, null);
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return false;
				}
				return true;
			}
		}
		MessageDialog.openInformation(null, "Don't selected project",
				"Select a project");

		return false;

	}

	public static String[] showProjects() {
		String[] nameprojects;
		int i;
		// Get the root of the workspace
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		// Get all projects in the workspace
		IProject[] projects = root.getProjects();
		// Loop over all projects
		nameprojects = new String[projects.length];
		for (i = 0; i < projects.length; i++) {
			nameprojects[i] = projects[i].getName();
		
		}
		return nameprojects;
	}

}
