package com.lil4869.designpattern;


import com.lil4869.designpattern.adapter.PersonInfoAdapter;
import com.lil4869.designpattern.builder.BlackMaleBuilder;
import com.lil4869.designpattern.builder.PersonDirector;
import com.lil4869.designpattern.entity.bed.Bed;
import com.lil4869.designpattern.entity.creature.Human;
import com.lil4869.designpattern.entity.sitthing.SitThing;
import com.lil4869.designpattern.factory.SingleBedBenchFactory;
import com.lil4869.designpattern.singleton.PersonSingleton;

public class Demo {
	public static void main(String[] args) {
		//testFactory();
		//建造者
	Human person=	testBuilder();
	testAdapter(person);
	//单例
	Human singleton=PersonSingleton.getInstance();
	testAdapter(singleton);
	}
	
	//工厂模式
	public static void testFactory() {
		SingleBedBenchFactory factory=new SingleBedBenchFactory();
		Bed bed=factory.createBed();
		SitThing ibSit=factory.createSitThing();
		bed.printDesc();
		System.out.printf("sit:%s",ibSit.getName());
	}
	
	//建造者模式
	public static Human testBuilder() {
	BlackMaleBuilder bmb=new BlackMaleBuilder();
	PersonDirector personDirector=new PersonDirector(bmb);
	Human person=personDirector.buildTargetPerson("Mark");
	System.out.printf("***BuilderMode***\n a person named:%s\n",person.getName());
	return person;
	}
	
	//适配器模式
	public static void testAdapter(Human person) {
		PersonInfoAdapter adapter=new PersonInfoAdapter(person);
		adapter.showComplete();
	}

}
