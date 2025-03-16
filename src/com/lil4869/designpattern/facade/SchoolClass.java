package com.lil4869.designpattern.facade;

import com.lil4869.designpattern.bridge.Student;
import com.lil4869.designpattern.bridge.Teacher;

public class SchoolClass {
	private Teacher teacher;
	private Student student;
	
	public SchoolClass(Teacher teacher, Student student) {
		super();
		this.teacher = teacher;
		this.student = student;
	}
	public void startClass() {
		if(teacher ==null || student ==null) {
			System.out.print("not ready yet");
		}
		teacher.startClass();
		student.startClass(teacher.getHuman().getName());
	}
	public void finishClass() {
		teacher.finishClass();
		student.finishClass();
	}
}
