package com.lil4869.designpattern.chainofresponsibility;

public abstract class TouchEventHandler {
	//实际触摸处理还会设计拦截、消耗等逻辑，此处实例不处理
	protected TouchEventHandler nextHandler;
	public abstract void handle(TouchEvent event);
	public TouchEventHandler getNextHandler() {
		return nextHandler;
	}
	public void setNextHandler(TouchEventHandler nextHandler) {
		this.nextHandler = nextHandler;
	}
	protected void sendToNext(TouchEvent event) {
		if(nextHandler!=null) {
			nextHandler.handle(event);
		}
	};
}
