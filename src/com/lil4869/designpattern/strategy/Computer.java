package com.lil4869.designpattern.strategy;

public class Computer {
	ComputerUsage usage;
	
	
	
	public Computer(ComputerUsage usage) {
		super();
		this.usage = usage;
	}



	public ComputerUsage getUsage() {
		return usage;
	}



	public void setUsage(ComputerUsage usage) {
		this.usage = usage;
	}



	public void useComputer() {
		if(usage!=null)usage.operation();
	};

}
