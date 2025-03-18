package com.lil4869.designpattern.mediator;

import java.util.HashMap;
import java.util.Map;

public class ConcreteMediator implements Mediator {
	private Map<String,User>userMap=new HashMap<String, User>();

	@Override
	public void sendMessage(String msg, String targetName, User from) {
	
		User targetUser=userMap.get(targetName);
		if(targetUser !=null)
		targetUser.recieve(msg,from.getName());
		else {
			System.out.printf("No user named %s",targetName);
		}
	}

	@Override
	public void register(User user) {
		if(user!=null) {
			userMap.put(user.getName(), user);
			user.setMediator(this);
		}
	}

}
