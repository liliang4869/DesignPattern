package com.lil4869.designpattern;


import com.lil4869.designpattern.adapter.HumanInfoAdapter;
import com.lil4869.designpattern.bridge.Doctor;
import com.lil4869.designpattern.builder.BlackMaleBuilder;
import com.lil4869.designpattern.builder.HumanDirector;
import com.lil4869.designpattern.entity.bed.Bed;
import com.lil4869.designpattern.entity.creature.Human;
import com.lil4869.designpattern.entity.sitthing.SitThing;
import com.lil4869.designpattern.factory.SingleBedBenchFactory;
import com.lil4869.designpattern.singleton.PersonSingleton;

public class Demo {
	public static void main(String[] args) {
		//testFactory();
		//建造者
	Human human=	testBuilder();
	testAdapter(human);
	//单例
	Human singleton=PersonSingleton.getInstance();
	testAdapter(singleton);
	
	//桥接
	testBridge(singleton);
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
	HumanDirector humanDirector=new HumanDirector(bmb);
	Human person=humanDirector.buildTargetPerson("Mark");
	System.out.print("***Builder***\n");
	return person;
	}
	
	//适配器模式
	public static void testAdapter(Human person) {
		HumanInfoAdapter adapter=new HumanInfoAdapter(person);
		adapter.showComplete();
	}
	
	public static void testBridge(Human human) {
		Doctor doctor=new Doctor(human);
		doctor.setSalary(20000);
		doctor.getHuman().printDesc();
	}

}
