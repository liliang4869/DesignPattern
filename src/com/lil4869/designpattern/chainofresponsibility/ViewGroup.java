package com.lil4869.designpattern.chainofresponsibility;

public class ViewGroup extends TouchEventHandler{

	@Override
	public void handle(TouchEvent event) {
		System.out.printf("Touch[%d,%d]Handle by ViewGroup.Send to View.\n",event.getX(),event.getY());
		sendToNext(event);
	}

}
