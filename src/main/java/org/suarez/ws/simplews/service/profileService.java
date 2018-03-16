package org.suarez.ws.simplews.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.suarez.ws.simplews.database.Database;
import org.suarez.ws.simplews.model.profile;

public class profileService {
	
private Map<String,profile> prof=Database.getProfile();
	
	
	
	public profileService() {
		super();
		prof.put("Jetty",new profile(001,"Jetty", "suarez","Luise",new Date().toString()));
		prof.put("Tomcat",new profile(002,"Tomcat", "Wishwa","Linux",new Date().toString()));
		prof.put("Glassfish",new profile(003,"Glassfish", "Tommy","Lee",new Date().toString()));
	}

	public List<profile> getAllProfiles(){
		
		return new ArrayList<>(prof.values());
		
	}
	
	public profile addProfile(profile  pf) {
		pf.setId(prof.size() + 1);
		prof.put(pf.getProfilename(),pf);
		return pf;
	}
	
	public profile getProfile(String profname) {
		
		return prof.get(profname);
	} 

	
	public profile updateProfile(profile pf) {
			if(pf.getProfilename().isEmpty()) {
				return null;
			}
			
		prof.put(pf.getProfilename(),pf);
		return pf;
	}
	
	
	public profile removeProfile(String profname) {
		return prof.remove(profname);
		 
	}

}
