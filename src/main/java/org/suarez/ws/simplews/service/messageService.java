package org.suarez.ws.simplews.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.suarez.ws.simplews.database.Database;
import org.suarez.ws.simplews.model.messageInstance;


public class messageService {
	
	private Map<Long,messageInstance> msg=Database.getMsgs();
	
	
	
	public messageService() {
		super();
		msg.put(1L,new messageInstance(001, "Honey bacon", "suarez", new Date().toString()));
		msg.put(2L,new messageInstance(002, "Porchetta", "suarez", new Date().toString()));
		msg.put(3L,new messageInstance(003, "pig liver", "suarez", new Date().toString()));
		msg.put(4L,new messageInstance(004, "beef briskit", "suarez", new Date().toString()));
	}

	public List<messageInstance> getAllMessages(){
		 
		//messageInstance m1=new messageInstance(001, "Honey Ham", "suarez", new Date().toString());
		//messageInstance m2=new messageInstance(002, "Beef Jurky", "lil wayne", new Date().toString());
		//messageInstance m3=new messageInstance(003, "Porchettta", "suarez", new Date().toString());
		//messageInstance m4=new messageInstance(004, "Backen", "siripala", new Date().toString());
		//List<messageInstance> list=new ArrayList<>();
		//list.add(m1);
		//list.add(m2);
		//list.add(m3);
		//list.add(m4);
		
		return new ArrayList<messageInstance>(msg.values());
		
	}
	
	public messageInstance addMessage(messageInstance mssg) {
		mssg.setId(msg.size() + 1);
		msg.put(mssg.getId(),mssg);
		return mssg;
	}
	
	public messageInstance getMessage(long id) {
		
		return msg.get(id);
	} 

	
	public messageInstance updateMessage(messageInstance mssg) {
			if(mssg.getId() <=0) {
				return null;
			}
			
		msg.put(mssg.getId(), mssg);
		return mssg;
	}
	
	
	public messageInstance removeMessage(long id) {
		return msg.remove(id);
		
	}
}
