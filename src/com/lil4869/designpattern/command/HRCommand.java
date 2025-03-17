package com.lil4869.designpattern.command;

public class HRCommand implements WorkCommand{
	HR hr;
	

	public HRCommand(HR hr) {
		super();
		this.hr = hr;
	}

	@Override
	public void startWork() {
		hr.doNormalWork();
		
	}

	@Override
	public void query() {
		hr.report();
		
	}
	

}
