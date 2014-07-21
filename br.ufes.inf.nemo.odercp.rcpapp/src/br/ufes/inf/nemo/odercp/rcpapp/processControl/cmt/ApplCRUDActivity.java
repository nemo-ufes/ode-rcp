package br.ufes.inf.nemo.odercp.rcpapp.processControl.cmt;

import java.util.LinkedList;
import java.util.List;

import br.ufes.inf.nemo.odercp.rcpapp.processControl.cpd.Activity;

public class ApplCRUDActivity {
	static List<Activity> activities;

	static Activity vectorsActivities[];

	public static Activity[] getever() {
		if (activities == null)
			activities = new LinkedList<Activity>();
		if (!activities.isEmpty()) {
			vectorsActivities = activities
					.toArray(new Activity[activities.size()]);
			return vectorsActivities;
		}
		return null;
	}

	public boolean Create(Activity activity) {
		if (activities == null)
			activities = new LinkedList<Activity>();
		activities.add(activity);
		return true;
	}
}
