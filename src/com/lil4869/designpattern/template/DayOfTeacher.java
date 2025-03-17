package com.lil4869.designpattern.template;

public class DayOfTeacher extends ABusyDay{
	

	@Override
	 String getupTime() {
		// TODO Auto-generated method stub
		return "07:00 am\n";
	}

	@Override
	void doSomethingInTheMorning() {
		System.out.print("Gives a lecture.Corrects students' homework.\n");
		
	}

	@Override
	String lunchTime() {
		// TODO Auto-generated method stub
		return "11:30 noon\n";
	}

	@Override
	 void doSomethingInTheAfternoon() {
		System.out.print("Gives a lecture.Prepares teaching plan\n");
		
	}

	@Override
	 String dinnerTime() {
		// TODO Auto-generated method stub
		return "05:00 pm";
	}

	@Override
	 void doSomethingInTheEvening() {
		
		System.out.print("Nothing to do.\n");
	}

	@Override
	 String goToBedTime() {
		// TODO Auto-generated method stub
		return "11:00 pm\n";
	}

}
