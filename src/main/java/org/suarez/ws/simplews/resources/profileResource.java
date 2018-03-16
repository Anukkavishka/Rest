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

import org.suarez.ws.simplews.model.profile;
import org.suarez.ws.simplews.service.profileService;

@Path("/profiles")
@Consumes(MediaType.APPLICATION_JSON)//let you say that these methods accepts json
@Produces(MediaType.APPLICATION_JSON)

public class profileResource {

	
	profileService profserv=new profileService();
	
	
	@GET
	public List<profile> getPro(){
		
	return profserv.getAllProfiles();	
	}
	
	@GET
	@Path("/{profilename}")
	public profile getSingleProfile(@PathParam("profilename")String profname ) {
		return profserv.getProfile(profname);  
	}
	
	@POST
	public profile addProfile(profile pf){
	 	
		return profserv.addProfile(pf);	
		}
	
	
	@PUT
	@Path("/{profilename}")
	public profile updateProfile(@PathParam("profilename")String profname,profile pf){
	 	pf.setProfilename(profname);
		return profserv.updateProfile(pf);	
		}
	
	
	@DELETE
	@Path("/{profilename}")
	public profile deleteProfile(@PathParam("profilename")String profname){
	 
		return profserv.removeProfile(profname);	
		}
	
}
