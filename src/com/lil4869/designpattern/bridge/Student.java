package com.lil4869.designpattern.bridge;

import com.lil4869.designpattern.entity.creature.Human;

public class Student extends Human{
	
	public void startClass(String name) {
		System.out.print("Good morning,"+name+"\n");
	};
	
	public void finishClass() {
		System.out.print("Bye.Yes!\n");
	}

}
