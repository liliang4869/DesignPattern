package com.lil4869.designpattern.bridge;

import com.lil4869.designpattern.entity.creature.Human;

public abstract class Worker {
	Human human;
	int salary;
	String occupation="not set";
	public Worker(Human human) {
		this.human = human;
	}
	public abstract String getOccupation();
	public int getSalary() {
		return salary;
	}
	public Human getHuman() {
		return human;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	
}
