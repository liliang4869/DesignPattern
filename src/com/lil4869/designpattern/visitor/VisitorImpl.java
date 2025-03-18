package com.lil4869.designpattern.visitor;

public class VisitorImpl implements Visitor {

	@Override
	public void visit(Bank bank) {
	bank.checkAccount();
	bank.saveMoney(1000);

	}

	@Override
	public void visit(Park park) {
	
		System.out.print("visitor visits the park.");
	}

}
