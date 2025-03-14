package com.lil4869.designpattern.bridge;

import com.lil4869.designpattern.entity.creature.Human;

public class Teacher extends Worker{
	private String subject;
	public Teacher(Human human) {
		super(human);
	}

	@Override
	public String getOccupation() {
		return "Teacher";
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}
