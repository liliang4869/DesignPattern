package com.lil4869.designpattern.builder;

public class BlackMaleBuilder extends AbsBuilder{


	@Override
	public void buildSex() {
		person.setSex("male");
	}

	@Override
	public void buildSkinColor() {
		person.setSkinColor("black");
		
	}

	@Override
	public void buildName(String name) {
		person.setName(name);
		
	}

}
