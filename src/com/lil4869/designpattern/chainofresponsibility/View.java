package com.lil4869.designpattern.chainofresponsibility;

public class View extends TouchEventHandler{

	@Override
	public void handle(TouchEvent event) {
		System.out.printf("Touch[%d,%d]Handle by ViewGroup.Event has been handled properly.\n",event.getX(),event.getY());
	}

}
