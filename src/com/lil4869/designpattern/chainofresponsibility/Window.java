package com.lil4869.designpattern.chainofresponsibility;

public class Window extends TouchEventHandler{

	@Override
	public void handle(TouchEvent event) {
		System.out.printf("Touch[%d,%d]Handle by Window.Send to ViewGroup.\n",event.getX(),event.getY());
		sendToNext(event);
	}

}
