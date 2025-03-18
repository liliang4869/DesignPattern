package com.lil4869.designpattern.visitor;

public class Park implements Building {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
