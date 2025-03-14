package com.lil4869.designpattern.entity.bed;

public class DoubleBed implements Bed{

	@Override
	public void printDesc() {
	System.out.print("A double bed with a width of 180 centimeters.");
		
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 180;
	}
	

}
