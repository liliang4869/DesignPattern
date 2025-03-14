package com.lil4869.designpattern.builder;

public class BlackMaleBuilder extends AbsBuilder{


	@Override
	public void buildSex() {
		human.setSex("male");
	}

	@Override
	public void buildSkinColor() {
		human.setSkinColor("black");
		
	}

	@Override
	public void buildName(String name) {
		human.setName(name);
		
	}

}
