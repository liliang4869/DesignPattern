package com.lil4869.designpattern.chainofresponsibility;

public class Activity extends TouchEventHandler{

	@Override
	public void handle(TouchEvent event) {
		System.out.printf("Touch[%d,%d]Handle by Activity.Send to window.\n",event.getX(),event.getY());
		sendToNext(event);
	}

}
