package com.lil4869.designpattern.adapter;

import com.lil4869.designpattern.entity.creature.Human;

public class HumanInfoAdapter implements HumanInfo{
	Human human;
	

	public HumanInfoAdapter(Human person) {
		this.human = person;
	}


	@Override
	public void showComplete() {

		String info="Not inited";
		if(human !=null) {
			human.printDesc();
			info=" full info:\n  "+human.toString()+"\n";}
		System.out.print(info);
		
	}
	

}
