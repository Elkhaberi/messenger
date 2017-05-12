package com.elkhaberi.webservice.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.elkhaberi.webservice.messenger.model.Comment;
import com.elkhaberi.webservice.messenger.service.CommentService;

@Path("/comment")
public class CommentResource {
	CommentService commentService = new CommentService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Comment> getComments(){
		return commentService.getAllComments(); 
	}

}
