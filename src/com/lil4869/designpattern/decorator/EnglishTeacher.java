package com.lil4869.designpattern.decorator;

import com.lil4869.designpattern.bridge.Teacher;
import com.lil4869.designpattern.entity.creature.Creature;
import com.lil4869.designpattern.entity.creature.Human;

public class EnglishTeacher implements Creature{
	Teacher teacher;
	
	public EnglishTeacher(Teacher teacher) {
		super();
		this.teacher = teacher;
		this.teacher.setSubject("English");
	}

	@Override
	public void printDesc() {
		System.out.print("An english teacher.\n");
		
	}
	
	

}
