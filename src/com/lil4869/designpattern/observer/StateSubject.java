package com.lil4869.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class StateSubject implements Subject{
	private List<Observer>observerList=new ArrayList<Observer>();
	private String msg;
	public void addObserver(Observer obs) {
		observerList.add(obs);
	}
	public void removeObserver(Observer obs) {
		observerList.remove(obs);
		System.out.print("remove a observer\n");
	}
	@Override
	public void notifyObservers() {
		for(Observer observer:observerList) {
			observer.onNewState(msg);
		}
		
	}
	public void setStateMsg(String msg) {
		this.msg=msg;
		notifyObservers();
	}
	
}
