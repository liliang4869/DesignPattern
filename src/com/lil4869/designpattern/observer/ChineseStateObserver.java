package com.lil4869.designpattern.observer;

public class ChineseStateObserver implements Observer{
	private String state;
	

	@Override
	public void onNewState(String state) {
		
		this.state=state;
		String stateInChinese="未知";
		switch(state) {
		case "running":stateInChinese="运行中";break;
		case "pause":stateInChinese="暂停";break;
		case "stop":stateInChinese="停止";break;
		case "creating":stateInChinese="创建中";break;
		default:stateInChinese="未知";
		}
		System.out.printf("UpdateStateObserver state in chinese [%s]\n",stateInChinese);
	}

}
