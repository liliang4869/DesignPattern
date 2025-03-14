package com.lil4869.designpattern.builder;

import com.lil4869.designpattern.entity.creature.Human;

public abstract class AbsBuilder {
	protected Human human=new Human();
	abstract void buildSex();
	abstract void buildSkinColor();
	abstract void buildName(String name);
	public Human getHuman() {
		return human;
	}
}
