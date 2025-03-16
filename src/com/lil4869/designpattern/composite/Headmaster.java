package com.lil4869.designpattern.composite;

import java.util.ArrayList;
import java.util.List;
import com.lil4869.designpattern.bridge.Teacher;
import com.lil4869.designpattern.bridge.Worker;
import com.lil4869.designpattern.entity.creature.Creature;
import com.lil4869.designpattern.entity.creature.Human;

public class Headmaster extends Worker{

public Headmaster(Human human) {
		super(human);
	}

private List<Teacher> teacherList=new ArrayList<Teacher>();

	public List<Teacher> getTeacherList() {
	return teacherList;
}

	public void addTeacher(Teacher teacher) {
		if(!teacherList.contains(teacher))
		this.teacherList.add(teacher);
	}
	
	public void delTeacher(Teacher teacher) {
		this.teacherList.remove(teacher);
	}


	private int getTeacherCount() {
		return teacherList==null?0:teacherList.size();
	}

	@Override
	public String getOccupation() {
		return String.format("A headmaster who leads %d teacher(s)",getTeacherCount());
	}
}
