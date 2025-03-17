package com.lil4869.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

import com.lil4869.designpattern.bridge.Student;

public class StudentFactory {
	public Map<String,Student>studentMap=new HashMap();
	
	public Student getStudent(String id) {
		Student student=studentMap.get(id);
		if(studentMap.get(id)==null) {
			student =new Student(id);
			studentMap.put(id, student);
		}
		return student;
	}

}
