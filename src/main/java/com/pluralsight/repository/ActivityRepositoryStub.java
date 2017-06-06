package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Activity;
import com.pluralsight.model.User;

public class ActivityRepositoryStub implements ActivityRepository {
	
	/* (non-Javadoc)
	 * @see com.pluralsight.repository.AcitivityRepository#findAllActivities()
	 */
	@Override
	public List<Activity> findAllActivities(){
		List<Activity> activities = new ArrayList<Activity>();
		
		// Usually a database query here
		Activity activity1 = new Activity();
		
		activity1.setDescription("Swimming");
		activity1.setDuration(55);
		
		activities.add(activity1);
		
		Activity activity2 = new Activity();
		
		activity2.setDescription("Cycling");
		activity2.setDuration(120);
		
		activities.add(activity2);
		
		return activities;
	}
	
	@Override
	public Activity findActivity(String activityId) {
		// Usually a database query here
		
		Activity activity1 = new Activity();
		
		activity1.setId("1234");
		activity1.setDescription("Swimming");
		activity1.setDuration(55);
		
		User user = new User();
		user.setName("Brayan");
		
		activity1.setUser(user);
		
		return activity1;
	}

	@Override
	public void create(Activity activity) {
		// Usually writing to the database here
		
	}
}
