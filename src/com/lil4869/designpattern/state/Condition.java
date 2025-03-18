package com.lil4869.designpattern.state;

public class Condition {
	private ConditionState currentState;
	ConditionState stateOff;
	ConditionState stateOn;
	public Condition() {
		stateOff=new TurnOffState(this);
		stateOn=new TurnOnState(this);
		currentState=stateOff;
	}

	public void turnOff() {
		currentState.turnOff();
	}
	
	public void turnOn() {
		currentState.turnOn();
	}
	public void adjustTemp(int temp) {
		currentState.adjustTemp(temp);
	}
	
	public void changeMode(int mode) {
		currentState.changeMode(mode);
	}
	
	public void setState(ConditionState state) {
		this.currentState=state;
	}

}
