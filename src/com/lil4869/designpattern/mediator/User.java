package com.lil4869.designpattern.mediator;

public class User {
	private String name;
	private Mediator mediator;
	public User(String name) {
		super();
		this.name = name;
	}
	
	public void setMediator(Mediator mediator) {
		this.mediator=mediator;
	}
	
	public void sendMessage(String message,String targetName){
		if(mediator==null) {
			System.out.print("Not registered");
		}
		else {
			mediator.sendMessage(message, targetName, this);
		}
	}
	
	public void recieve(String msg,String from) {
		System.out.printf("%s reveive message [%s] from %s\n",name,msg,from);
	}
	
	public String getName() {
		return name;
	}
	
}
