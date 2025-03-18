package com.lil4869.designpattern.observer;

public interface Subject {
	void addObserver(Observer observer);
	void removeObserver(Observer observer);
	void notifyObservers();

}
