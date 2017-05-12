package com.elkhaberi.webservice.messenger.service;

import java.util.ArrayList;
import java.util.List;

import com.elkhaberi.webservice.messenger.model.Comment;

public class CommentService {
	

	
	public List<Comment> getAllComments(){
	
		Comment comment1 = new Comment(1, "first comment", "ahmed");
		Comment comment2 = new Comment(2, "sec comment", "ahmed");
		Comment comment3 = new Comment(3, "third comment", "ahmed");
		Comment comment4 = new Comment(4, "fourth comment", "ahmed");
		
		List<Comment> list =new ArrayList<>();
		list.add(comment1);
		list.add(comment2);
		list.add(comment3);
		list.add(comment4);
		
		return list;
	}

}
