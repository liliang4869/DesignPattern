package com.lil4869.designpattern.memento;

public class Memento {
	private String message;

	public Memento(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
