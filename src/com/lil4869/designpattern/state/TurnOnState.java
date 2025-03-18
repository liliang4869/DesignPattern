package com.lil4869.designpattern.state;

public class TurnOnState implements ConditionState{
	private Condition condition;
	
	String[]modes= {"COOLING","HEATING","VENTILATION"};
	public TurnOnState(Condition condition) {
		this.condition = condition;
	}

	@Override
	public void turnOn() {
		System.out.print("Already turned on.\n");
		
	}

	@Override
	public void turnOff() {
		System.out.print("Turn off the condition now.\n");
		if(condition!=null)condition.setState(condition.stateOff);
	}

	@Override
	public void adjustTemp(int temp) {
		System.out.print("Adjust temperature to temp.\n");
		
	}

	@Override
	public void changeMode(int mode) {
		if(mode >=0 && mode <=2) {
			System.out.printf("Adjust temperature to %s MODE.\n",modes[mode]);
		}
		else System.out.print("Err mode.\n");
	}
	

}
