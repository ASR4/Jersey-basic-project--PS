package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Activity;
import com.pluralsight.model.ActivitySearch;
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
		//Usually writing to the database here
		
	}

	@Override
	public Activity update(Activity activity) {
		//search the data base to see if we have activity with that id and Usually updating it to the database here
		//select * from Activity table
		//else
		//update the Activity
		return activity;
	}

	@Override
	public void delete(String activityId) {
		//Delete from activity where activityid = 1234
		
	}

	@Override
	public List<Activity> findByDescription(List<String> descriptions, int durationFrom, int durationTo) {
		//Select * from activities where description in (?,?,?) and duration<?> and duration<?>
		
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity activity = new Activity();
		activity.setId("1234");
		activity.setDescription("swimming");
		activity.setDuration(55);
		
		activities.add(activity);
		
		return activities;
	}

	@Override
	public List<Activity> findByContraints(ActivitySearch search) {
		System.out.println(search.getDurationFrom());
		
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity activity = new Activity();
		activity.setId("1234");
		activity.setDescription("swimming");
		activity.setDuration(55);
		
		activities.add(activity);
		
		return activities;
	}
}
