package com.elkhaberi.webservice.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.elkhaberi.webservice.messenger.model.Message;
import com.elkhaberi.webservice.messenger.service.MessageService;


@Path("/message")
public class MessagesResource {
	MessageService messageService = new MessageService();
	
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages(){
		return messageService.getAllMessages();
		
		
	}

}
