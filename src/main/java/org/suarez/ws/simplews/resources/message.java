package org.suarez.ws.simplews.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.suarez.ws.simplews.model.messageInstance;
import org.suarez.ws.simplews.service.messageService;
 
@Path("/messages")
@Consumes(MediaType.APPLICATION_JSON)//let you say that this method accepts json
@Produces(MediaType.APPLICATION_JSON)

public class message {
	
	messageService mserv=new messageService();
	@GET
	public List<messageInstance> getM(){
		
	return mserv.getAllMessages();	
	}
	
	@GET
	@Path("/{messageId}")
	public messageInstance getSingleMsg(@PathParam("messageId")long msgid ) {
		return mserv.getMessage(msgid);  
	}
	
	@POST
	public messageInstance addMsg(messageInstance mssg){
	 	
		return mserv.addMessage(mssg);	
		}
	
	
	@PUT
	@Path("/{messageId}")
	public messageInstance updateMsg(@PathParam("messageId")long msgid,messageInstance mssg){
	 	mssg.setId(msgid);
		return mserv.updateMessage(mssg);	
		}
	
	
	@DELETE
	@Path("/{messageId}")
	public messageInstance deleteMsg(@PathParam("messageId")long msgid){
	 
		return mserv.removeMessage(msgid);	
		}
	
	
	

}
