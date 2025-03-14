package com.lil4869.designpattern.builder;

import com.lil4869.designpattern.entity.creature.Human;

public class PersonDirector {
	private AbsBuilder builder;

	public PersonDirector(AbsBuilder builder) {
		this.builder = builder;
	}
	
	public Human buildTargetPerson(String name) {
		builder.buildSex();
		builder.buildSkinColor();
		builder.buildName(name);
		return builder.getPerson();
	}
}
