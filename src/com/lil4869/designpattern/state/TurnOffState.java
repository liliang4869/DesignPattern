package com.lil4869.designpattern.state;

public class TurnOffState implements ConditionState{
	Condition condition;
	

	public TurnOffState(Condition condition) {
		this.condition = condition;
	}

	@Override
	public void turnOn() {
		System.out.print("turn on the condition\n");
		if(condition!=null)condition.setState(condition.stateOn);
		
		
	}

	@Override
	public void turnOff() {
	
		System.out.print("Already turned off\n");
	}

	@Override
	public void adjustTemp(int temp) {
	
		System.out.print("Please turn on the condition first\n");
	}

	@Override
	public void changeMode(int mode) {
		System.out.print("Please turn on the condition first\n");
		
	}

}
