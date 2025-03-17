package com.lil4869.designpattern.command;

public class Boss {
	WorkCommand cmd;
	
	public WorkCommand getCmd() {
		return cmd;
	}

	public void setCmd(WorkCommand cmd) {
		this.cmd = cmd;
	}

	public void startCommand() {
		if(cmd!=null)
		cmd.startWork();
	}
	
	public void queryCommand() {
		if(cmd!=null)
		cmd.query();
	}
}
