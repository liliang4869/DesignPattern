package com.lil4869.designpattern.mediator;

public interface Mediator {
	void sendMessage(String msg,String targetName,User from);
	void register(User user);
}
