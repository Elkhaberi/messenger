package com.elkhaberi.webservice.messenger.service;

import java.util.ArrayList;
import java.util.List;

import com.elkhaberi.webservice.messenger.model.Profile;

public class ProfileService {
	

	
	public List<Profile> getAllProfile(){
		
		Profile profile1 = new Profile(10,"A.Elkhaberi","Ahmed","Elkhaberi");
		Profile profile2 = new Profile(11,"O.Elkhaberi","Omer","Elkhaberi");
		Profile profile3 = new Profile(12,"Abdo.Elkhaberi","Abdelrahman","Elkhaberi");
		
		List<Profile> list =new ArrayList<Profile>();
		list.add(profile1);
		list.add(profile2);
		list.add(profile3);
		return list;
		
		
	}

}
