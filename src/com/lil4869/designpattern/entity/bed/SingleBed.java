package com.lil4869.designpattern.entity.bed;

public class SingleBed implements Bed{

	@Override
	public void printDesc() {
	System.out.print("A single bed with a width of 90 centimeters.");
		
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 90;
	}

}
