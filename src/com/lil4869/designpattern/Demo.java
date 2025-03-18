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
import com.lil4869.designpattern.iterator.HumanCollection;
import com.lil4869.designpattern.iterator.Iterator;
import com.lil4869.designpattern.mediator.ConcreteMediator;
import com.lil4869.designpattern.mediator.User;
import com.lil4869.designpattern.memento.MementoKeeper;
import com.lil4869.designpattern.memento.Originator;
import com.lil4869.designpattern.observer.ChineseStateObserver;
import com.lil4869.designpattern.observer.PrintObserver;
import com.lil4869.designpattern.observer.StateSubject;
import com.lil4869.designpattern.proxy.ProxyStudent;
import com.lil4869.designpattern.singleton.PersonSingleton;
import com.lil4869.designpattern.state.Condition;
import com.lil4869.designpattern.strategy.Computer;
import com.lil4869.designpattern.strategy.ListenMusic;
import com.lil4869.designpattern.strategy.WatchMovie;
import com.lil4869.designpattern.template.DayOfTeacher;
import com.lil4869.designpattern.visitor.Bank;
import com.lil4869.designpattern.visitor.Park;
import com.lil4869.designpattern.visitor.VisitorImpl;
import com.lil4869.designpattern.chainofresponsibility.*;
import com.lil4869.designpattern.command.Boss;
import com.lil4869.designpattern.command.HR;
import com.lil4869.designpattern.command.HRCommand;

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
	
	//责任链
	touchChain();
	
	//命令
	bossCommand();
	
	//迭代器
	humanIterator();
	
	//中介者
	userMediator();
	
	//备忘录
	memento();
	
	//观察者
	observe();
	
	//状态
	statePattern();
	
	//策略
	computerStrategy();
	
	//访问者
	visitor();
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

	//责任链
	public static void touchChain() {
		System.out.print("\n***Chain of responsibility***\n");
		TouchEventHandler activity=new Activity();
		TouchEventHandler window=new Window();
		TouchEventHandler viewGroup=new ViewGroup();
		TouchEventHandler view=new View();
		activity.setNextHandler(window);
		window.setNextHandler(viewGroup);
		viewGroup.setNextHandler(view);
		TouchEvent event=new TouchEvent(10,10);
		activity.handle(event);
	}
	
	//命令
	public static void bossCommand() {
		System.out.print("\n***Command***\n");
		HR hr=new HR();
		HRCommand hrCommand=new HRCommand(hr);
		Boss boss=new Boss();
		boss.setCmd(hrCommand);
		boss.startCommand();
		boss.queryCommand();
	}
	
	//迭代器
	public static void humanIterator() {
		System.out.print("\n***Iterator***\n");
		HumanCollection hc=new HumanCollection();
		hc.addHuman(generateHumanByBuilder("Liu"));
		hc.addHuman(generateHumanByBuilder("Jiang"));
		Iterator<Human> iterator=hc.getIterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next().getName()+"\n");
		}
		hc.addHuman(generateHumanByBuilder("Fan"));
		while(iterator.hasNext()) {
			System.out.print(iterator.next().getName()+"\n");
		}
		
	}
	//中介者
	public static void userMediator() {
		System.out.print("\n***Mediator***\n");
		ConcreteMediator mediator=new ConcreteMediator();
		User userLi=new User("Li");
		User userWang=new User("Wang");
		mediator.register(userLi);
		mediator.register(userWang);
		userLi.sendMessage("Hello", "Wang");
		userWang.sendMessage("Hello,too","Li");
		userLi.sendMessage("How r u.", "Yang");
		
		
	}
	
	//备忘录
	public static void memento() {
		System.out.print("\n***Memento***\n");
		Originator ori=new Originator("message 1");
		MementoKeeper mk=new MementoKeeper();
		mk.setMemento(ori.createMemento());
		ori.setMessage("message 2");
		ori.restore(mk.getMemento());
	}
	
	//观察者
	private static void observe() {
		System.out.print("\n***Observer***\n");
		PrintObserver pobs=new PrintObserver();
		ChineseStateObserver cobs=new ChineseStateObserver();
		StateSubject ssbj=new StateSubject();
		ssbj.addObserver(pobs);
		ssbj.addObserver(cobs);
		ssbj.setStateMsg("creating");
		ssbj.setStateMsg("running");
		ssbj.setStateMsg("stop");
		ssbj.removeObserver(pobs);
		ssbj.setStateMsg("creating");
		
	}
	
	private static void statePattern() {
		System.out.print("\n***State***\n");
		Condition condition=new Condition();
		condition.adjustTemp(10);
		condition.turnOff();
		condition.turnOn();
		condition.adjustTemp(25);
		condition.changeMode(2);
		condition.changeMode(6);
		condition.turnOff();
	}
	
	public static void computerStrategy() {
		System.out.print("\n***Strategy***\n");
		Computer computer =new Computer(new ListenMusic());
		computer.useComputer();
		computer.setUsage(new WatchMovie());
		computer.useComputer();
	}
	
	public static void visitor() {
		System.out.print("\n***Visitor***\n");
		VisitorImpl visitorImpl=new VisitorImpl();
		Bank bank=new Bank(9999);
		Park park=new Park();
		visitorImpl.visit(bank);
		visitorImpl.visit(park);
	}
}
