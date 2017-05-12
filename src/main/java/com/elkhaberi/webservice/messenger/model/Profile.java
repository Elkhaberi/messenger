package com.elkhaberi.webservice.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profile {

	private long id;
    private String profileName;
    private String firstName;
    private String lastName;
    private Date created;
    
    public Profile(){}
    public Profile(long id, String profileName, String firstName, String lastName) {
		this.id = id;
		this.profileName = profileName;
		this.firstName = firstName;
		this.lastName = lastName;
	}

    @XmlAttribute
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@XmlElement
	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	
	@XmlElement
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@XmlElement
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@XmlElement
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
}
