package com.lil4869.designpattern.singleton;

import com.lil4869.designpattern.entity.creature.Human;

public class PersonSingleton {
	private static Human instance;
	
	//懒加载
	public static Human getInstance() {
		if(instance ==null) {
			synchronized(PersonSingleton.class){
				if(instance ==null) {
					instance=new Human("Alice","white","female");
					System.out.print("***Singleton***\n");
				}
			}
		}
		return instance;
	}

}
