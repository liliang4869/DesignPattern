package com.lil4869.designpattern.bridge;

import com.lil4869.designpattern.entity.creature.Human;

public class Student extends Human{
	String id;
	public Student() {
		super();
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Student(String id) {
		this.id=id;
		System.out.printf("generate student by id %s\n",id);
	}
	public void startClass(String name) {
		System.out.print("Good morning,"+name+"\n");
	};
	
	public void finishClass() {
		System.out.print("Bye.Yes!\n");
	}

}
