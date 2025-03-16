package com.lil4869.designpattern;


import com.lil4869.designpattern.adapter.HumanInfoAdapter;
import com.lil4869.designpattern.bridge.Doctor;
import com.lil4869.designpattern.bridge.Teacher;
import com.lil4869.designpattern.builder.BlackMaleBuilder;
import com.lil4869.designpattern.builder.HumanDirector;
import com.lil4869.designpattern.composite.Headmaster;
import com.lil4869.designpattern.entity.bed.Bed;
import com.lil4869.designpattern.entity.creature.Human;
import com.lil4869.designpattern.entity.sitthing.SitThing;
import com.lil4869.designpattern.factory.SingleBedBenchFactory;
import com.lil4869.designpattern.singleton.PersonSingleton;

public class Demo {
	public static void main(String[] args) {
		//testFactory();
		//建造者
	Human human=	generateHumanByBuilder( "Mark");
	testAdapter(human);
	//单例
	Human singleton=PersonSingleton.getInstance();
	testAdapter(singleton);
	
	//桥接
	generateTeacherByBridge(singleton);
	//組合
	headmasterComposite();
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
	public static Human generateHumanByBuilder(String name) {
	System.out.print("***Builder***\n");
	BlackMaleBuilder bmb=new BlackMaleBuilder();
	HumanDirector humanDirector=new HumanDirector(bmb);
	Human person=humanDirector.buildTargetPerson(name);

	return person;
	}
	
	//适配器模式
	public static void testAdapter(Human person) {
		System.out.print("***Adapter***\n");
		HumanInfoAdapter adapter=new HumanInfoAdapter(person);
		adapter.showComplete();
	}
	
	//橋接
	public static Teacher generateTeacherByBridge(Human human) {
		System.out.print("***Bridge***\n");
		Teacher teacher=new Teacher(human);
		teacher.setSalary(20000);
		teacher.getHuman().printDesc();
		return teacher;
	}
	
	//組合
	public static void headmasterComposite() {
		Human humanTrump=generateHumanByBuilder("Teacher Trump");
		Teacher teacherTrump=generateTeacherByBridge(humanTrump);
		Human humanWang=generateHumanByBuilder("Teacher Wang");
		Teacher teacherWang=generateTeacherByBridge(humanWang);
		Human humanRong=generateHumanByBuilder("Headmaster Rong");
		Headmaster hm=new Headmaster(humanRong);
		hm.setSalary(35000);
		hm.addTeacher(teacherWang);
		hm.addTeacher(teacherTrump);
		System.out.print(hm.getOccupation());
	}

}
