package com.lil4869.designpattern.bridge;

import com.lil4869.designpattern.entity.creature.Human;

public class Doctor extends Worker{


	public Doctor(Human human) {
		super(human);
	}

	@Override
	public String getOccupation() {
		return "Doctor";
	}

}
