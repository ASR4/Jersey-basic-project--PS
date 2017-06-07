package com.pluralsight.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import com.pluralsight.model.Activity;

public class ActivityClient {
	
	private Client client;
	
	public ActivityClient(){
		client = ClientBuilder.newClient();
	}
	
	public Activity get(String id){
		
		WebTarget target = client.target("http://localhost:9090/exercise-services/webapi/");
		
		Activity response = target.path("activities/" + id).request().get(Activity.class);
		
		return response;
	}
}
