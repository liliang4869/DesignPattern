package com.lil4869.designpattern.command;

public class Boss {
	
	public void startCommand(WorkCommand cmd) {
		cmd.startWork();
	}
	
	public void queryCommand(WorkCommand cmd) {
		cmd.query();
	}
}
