package org.suarez.ws.simplews.database;

import java.util.HashMap;
import java.util.Map;

import org.suarez.ws.simplews.model.messageInstance;
import org.suarez.ws.simplews.model.profile;


public class Database {
	
	private static Map<Long,messageInstance> msgs=new HashMap<>();
	private static Map<String,profile> profile= new HashMap<>();
	
	public static Map<Long,messageInstance> getMsgs() {
		
		
		return msgs;
	}
	
	public static Map<String,profile> getProfile() {
		
		
		return profile;
	}

	
}
