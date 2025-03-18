package com.lil4869.designpattern.state;

public interface ConditionState {
	void turnOn();
	void turnOff();
	void adjustTemp(int temp);
	void changeMode(int mode);
}
