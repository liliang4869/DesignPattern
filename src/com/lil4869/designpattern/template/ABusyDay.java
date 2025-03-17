package com.lil4869.designpattern.template;

abstract class  ABusyDay {
	public void startADay() {
		System.out.print(getupTime());
		doSomethingInTheMorning();
		System.out.print(lunchTime());
		doSomethingInTheAfternoon();
		System.out.print( dinnerTime());
		doSomethingInTheEvening();
		System.out.print( goToBedTime());

	}
	abstract String getupTime();
	abstract void doSomethingInTheMorning();
	abstract String lunchTime();
	abstract void doSomethingInTheAfternoon();
	abstract String dinnerTime();
	abstract void doSomethingInTheEvening();
	abstract String goToBedTime();

}
