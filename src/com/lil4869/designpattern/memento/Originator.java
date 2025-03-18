package com.lil4869.designpattern.memento;

public class Originator {
	String message;

	public Originator(String message) {
		this.message = message;
		System.out.printf("init message [%s]\n",message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
		System.out.printf("set message [%s]\n",message);
	}
	
	public Memento createMemento() {
		return new Memento(message);
	}
	
	public void restore(Memento memento) {
		this.message=memento.getMessage();
		System.out.printf("restore message [%s]\n",message);
	};

}
