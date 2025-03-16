package com.lil4869.designpattern.entity.creature;

public class Human implements Creature{
	private String name;
	private String skinColor;
	private String sex;
	
	public Human() {
		super();
	}
	public Human(String name, String skinColor, String sex) {
		this.name = name;
		this.skinColor = skinColor;
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkinColor() {
		return skinColor;
	}
	public void setSkinColor(String skinColor) {
		this.skinColor = skinColor;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public void printDesc() {
		System.out.print("generate a human.\n");
		
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", skinColor=" + skinColor + ", sex=" + sex + "]";
	}
	
	
}
