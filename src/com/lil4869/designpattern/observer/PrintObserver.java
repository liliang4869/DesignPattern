package com.lil4869.designpattern.observer;

public class PrintObserver implements Observer {

	@Override
	public void onNewState(String state) {
		System.out.printf("PrintObserver onNewState [%s]\n",state);

	}

}
