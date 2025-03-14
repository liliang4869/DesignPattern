package com.lil4869.designpattern.adapter;

import com.lil4869.designpattern.entity.creature.Human;

public class PersonInfoAdapter implements PersonInfo{
	Human person;
	

	public PersonInfoAdapter(Human person) {
		this.person = person;
	}


	@Override
	public void showComplete() {
		String info=String.format("***AdapterMode***\n full info:\n  name=%s,sex=%s,skincolor=%s\n", person.getName(),person.getSex(),person.getSkinColor());
		System.out.print(info);
		
	}
	

}
