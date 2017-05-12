package com.elkhaberi.webservice.messenger.resources;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.elkhaberi.webservice.messenger.model.Profile;
import com.elkhaberi.webservice.messenger.service.ProfileService;


@Path("/profile")
public class ProfileResource {
	
	ProfileService profileService = new ProfileService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Profile> getAllProfile(){
		return profileService.getAllProfile();
		 
		
	}

}
