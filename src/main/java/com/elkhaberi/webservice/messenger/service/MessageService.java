package com.elkhaberi.webservice.messenger.service;

import java.util.ArrayList;
import java.util.List;

import com.elkhaberi.webservice.messenger.model.Message;

public class MessageService {
	
	public List<Message> getAllMessages(){
		Message m1 = new Message(100,"first message","ahmed");
		Message m2 = new Message(200,"second message","omar");
		
		List<Message> list =new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;		
	}

}
