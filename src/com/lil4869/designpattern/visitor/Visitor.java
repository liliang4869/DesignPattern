package com.lil4869.designpattern.visitor;

public interface Visitor {
	//访问者要访问的目标
	void visit(Bank bank);
	void visit(Park park);

}
