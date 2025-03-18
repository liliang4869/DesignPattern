package com.lil4869.designpattern.visitor;

public interface Building {
	//访问目标接受访问者的访问
	void accept(Visitor visitor);

}
