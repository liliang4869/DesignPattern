package com.lil4869.designpattern.builder;

import com.lil4869.designpattern.entity.creature.Human;

public class HumanDirector {
	private AbsBuilder builder;

	public HumanDirector(AbsBuilder builder) {
		this.builder = builder;
	}
	
	public Human buildTargetPerson(String name) {
		builder.buildSex();
		builder.buildSkinColor();
		builder.buildName(name);
		System.out.println("build a human named " +name);
		return builder.getHuman();
	}
}
