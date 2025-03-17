package com.lil4869.designpattern;


import com.lil4869.designpattern.adapter.HumanInfoAdapter;
import com.lil4869.designpattern.bridge.Doctor;
import com.lil4869.designpattern.bridge.Student;
import com.lil4869.designpattern.bridge.Teacher;
import com.lil4869.designpattern.builder.BlackMaleBuilder;
import com.lil4869.designpattern.builder.HumanDirector;
import com.lil4869.designpattern.composite.Headmaster;
import com.lil4869.designpattern.decorator.EnglishTeacher;
import com.lil4869.designpattern.entity.bed.Bed;
import com.lil4869.designpattern.entity.creature.Human;
import com.lil4869.designpattern.entity.sitthing.SitThing;
import com.lil4869.designpattern.facade.SchoolClass;
import com.lil4869.designpattern.factory.SingleBedBenchFactory;
import com.lil4869.designpattern.flyweight.StudentFactory;
import com.lil4869.designpattern.proxy.ProxyStudent;
import com.lil4869.designpattern.singleton.PersonSingleton;
import com.lil4869.designpattern.template.DayOfTeacher;

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
	Teacher teacher =generateTeacherByBridge(singleton);
	//組合
	headmasterComposite();
	
	//裝飾
	decorateEnglishTeacher(teacher);
	
	//外觀
	Student student=new Student();
	facadeClassDemo(teacher,student);
	//享元
	flyweightPattern();
	
	//代理
	proxyPattern();
	
	//模板
	templatePattern();
	}
	
	//工厂模式
	public static void testFactory() {
		System.out.print("\n***Factory***\n");
		SingleBedBenchFactory factory=new SingleBedBenchFactory();
		Bed bed=factory.createBed();
		SitThing ibSit=factory.createSitThing();
		bed.printDesc();
		System.out.printf("sit:%s",ibSit.getName());
	}
	
	//建造者模式
	public static Human generateHumanByBuilder(String name) {
	System.out.print("\n***Builder***\n");
	BlackMaleBuilder bmb=new BlackMaleBuilder();
	HumanDirector humanDirector=new HumanDirector(bmb);
	Human person=humanDirector.buildTargetPerson(name);

	return person;
	}
	
	//适配器模式
	public static void testAdapter(Human person) {
		System.out.print("\n***Adapter***\n");
		HumanInfoAdapter adapter=new HumanInfoAdapter(person);
		adapter.showComplete();
	}
	
	//橋接
	public static Teacher generateTeacherByBridge(Human human) {
		System.out.print("\n***Bridge***\n");
		Teacher teacher=new Teacher(human);
		teacher.setSalary(20000);
		teacher.getHuman().printDesc();
		return teacher;
	}
	
	//組合
	public static void headmasterComposite() {
		System.out.print("\n***Composite***\n");
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
	
	//裝飾模式
	public static EnglishTeacher decorateEnglishTeacher(Teacher teacher) {
		System.out.print("\n***Decorator***\n");
		EnglishTeacher englishTeacher=new EnglishTeacher(teacher);
		englishTeacher.printDesc();
		return englishTeacher;
	}
	//外观
	public static void facadeClassDemo(Teacher teacher,Student student) {
		System.out.print("\n***Facade***\n");
		SchoolClass sc=new SchoolClass(teacher,student);
		sc.startClass();
		sc.finishClass();
	}
	
	//享元
	public static void flyweightPattern() {
		System.out.print("\n***Flyweight***\n");
		StudentFactory sf=new StudentFactory();;
		for(int i=0;i<10;i++) {
			int intId=(int)(Math.random()*10);
			Student stu=sf.getStudent(String.valueOf(intId));
			System.out.printf("get student %s from flyweight factory\n",stu.getId());
		}
	}
	
	//代理
	public static void proxyPattern() {
		System.out.print("\n***Proxy***\n");
		ProxyStudent ps=new ProxyStudent();
		ps.printDesc();
	}
	
	//模版
	public static void templatePattern() {
		System.out.print("\n***Template***\n");
		DayOfTeacher dft=new DayOfTeacher();
		dft.startADay();
	}

}
