package com.elkhaberi.webservice.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement  
public class Message {
	
	private long id;
	private String message;
	private Date created;
	private String author;
	
	public Message(){}
	public Message(long id,String message,String author){
		this.id =id;
		this.message = message;
		this.author = author;
		this.created = new Date();
	}
	
	@XmlAttribute 
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@XmlElement  
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	@XmlElement  
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	
	@XmlElement  
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	
}
