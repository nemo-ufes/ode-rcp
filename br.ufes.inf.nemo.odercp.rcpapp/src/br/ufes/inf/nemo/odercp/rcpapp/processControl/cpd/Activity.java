package br.ufes.inf.nemo.odercp.rcpapp.processControl.cpd;

import java.util.LinkedHashSet;
import java.util.Set;

import br.ufes.inf.nemo.odercp.rcpapp.humanResourceControl.cpd.HumanResource;
import br.ufes.inf.nemo.odercp.rcpapp.knowledgeProcess.cpd.KActivity;
import br.ufes.inf.nemo.odercp.rcpapp.knowledgeProcess.cpd.KArtefact;
import br.ufes.inf.nemo.odercp.rcpapp.knowledgeProcess.cpd.KHumanResource;
import br.ufes.inf.nemo.odercp.rcpapp.knowledgeProcess.cpd.KProcedure;
import br.ufes.inf.nemo.odercp.rcpapp.knowledgeProcess.cpd.KResource;
import br.ufes.inf.nemo.odercp.rcpapp.standardProcess.cpd.ActivityStandardProcess;

public class Activity {

	private String name;
	private Set<KHumanResource> kHumanResources;
	private Set<KResource> kResources;
	private Set<Activity> preActivityStandardProcesses;
	private Set<Activity> subActivityStandardProcesses;
	private Set<KProcedure> kProcedures;
	private KActivity kActivity;
	private Set<KArtefact> kproducts;
	private Set<KArtefact> kinputs;
	private Set<Artefact> products;
	private Set<Artefact> inputs;
	private Set<Resource> resources;
	private Set<HumanResource> humanResources;
	private ActivityStandardProcess activityStandardProcess;

	/** Constructor. */
	public Activity() {
		super();
		kHumanResources = new LinkedHashSet<KHumanResource>();
		preActivityStandardProcesses = new LinkedHashSet<Activity>();
		subActivityStandardProcesses = new LinkedHashSet<Activity>();
		kProcedures = new LinkedHashSet<KProcedure>();
		kproducts = new LinkedHashSet<KArtefact>();
		kinputs = new LinkedHashSet<KArtefact>();
		kResources = new LinkedHashSet<KResource>();
		products = new LinkedHashSet<Artefact>();
		inputs = new LinkedHashSet<Artefact>();
		resources = new LinkedHashSet<Resource>();
		humanResources = new LinkedHashSet<HumanResource>();

	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the kHumanResources
	 */
	public Set<KHumanResource> getkHumanResources() {
		return kHumanResources;
	}

	/**
	 * @param kHumanResources the kHumanResources to set
	 */
	public void setkHumanResources(Set<KHumanResource> kHumanResources) {
		this.kHumanResources = kHumanResources;
	}

	/**
	 * @return the kResources
	 */
	public Set<KResource> getkResources() {
		return kResources;
	}

	/**
	 * @param kResources the kResources to set
	 */
	public void setkResources(Set<KResource> kResources) {
		this.kResources = kResources;
	}

	/**
	 * @return the preActivityStandardProcesses
	 */
	public Set<Activity> getPreActivityStandardProcesses() {
		return preActivityStandardProcesses;
	}

	/**
	 * @param preActivityStandardProcesses the preActivityStandardProcesses to set
	 */
	public void setPreActivityStandardProcesses(
			Set<Activity> preActivityStandardProcesses) {
		this.preActivityStandardProcesses = preActivityStandardProcesses;
	}

	/**
	 * @return the subActivityStandardProcesses
	 */
	public Set<Activity> getSubActivityStandardProcesses() {
		return subActivityStandardProcesses;
	}

	/**
	 * @param subActivityStandardProcesses the subActivityStandardProcesses to set
	 */
	public void setSubActivityStandardProcesses(
			Set<Activity> subActivityStandardProcesses) {
		this.subActivityStandardProcesses = subActivityStandardProcesses;
	}

	/**
	 * @return the kProcedures
	 */
	public Set<KProcedure> getkProcedures() {
		return kProcedures;
	}

	/**
	 * @param kProcedures the kProcedures to set
	 */
	public void setkProcedures(Set<KProcedure> kProcedures) {
		this.kProcedures = kProcedures;
	}

	

	/**
	 * @return the kActivity
	 */
	public KActivity getkActivity() {
		return kActivity;
	}

	/**
	 * @param kActivity the kActivity to set
	 */
	public void setkActivity(KActivity kActivity) {
		this.kActivity = kActivity;
	}

	/**
	 * @return the kproducts
	 */
	public Set<KArtefact> getKproducts() {
		return kproducts;
	}

	/**
	 * @param kproducts the kproducts to set
	 */
	public void setKproducts(Set<KArtefact> kproducts) {
		this.kproducts = kproducts;
	}

	/**
	 * @return the kinputs
	 */
	public Set<KArtefact> getKinputs() {
		return kinputs;
	}

	/**
	 * @param kinputs the kinputs to set
	 */
	public void setKinputs(Set<KArtefact> kinputs) {
		this.kinputs = kinputs;
	}

	/**
	 * @return the products
	 */
	public Set<Artefact> getProducts() {
		return products;
	}

	/**
	 * @param products the products to set
	 */
	public void setProducts(Set<Artefact> products) {
		this.products = products;
	}

	/**
	 * @return the inputs
	 */
	public Set<Artefact> getInputs() {
		return inputs;
	}

	/**
	 * @param inputs the inputs to set
	 */
	public void setInputs(Set<Artefact> inputs) {
		this.inputs = inputs;
	}

	/**
	 * @return the resources
	 */
	public Set<Resource> getResources() {
		return resources;
	}

	/**
	 * @param resources the resources to set
	 */
	public void setResources(Set<Resource> resources) {
		this.resources = resources;
	}

	/**
	 * @return the humanResources
	 */
	public Set<HumanResource> getHumanResources() {
		return humanResources;
	}

	/**
	 * @param humanResources the humanResources to set
	 */
	public void setHumanResources(Set<HumanResource> humanResources) {
		this.humanResources = humanResources;
	}

	/**
	 * @return the activityStandardProcess
	 */
	public ActivityStandardProcess getActivityStandardProcess() {
		return activityStandardProcess;
	}

	/**
	 * @param activityStandardProcess the activityStandardProcess to set
	 */
	public void setActivityStandardProcess(
			ActivityStandardProcess activityStandardProcess) {
		this.activityStandardProcess = activityStandardProcess;
	}

}
