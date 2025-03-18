package com.lil4869.designpattern.visitor;

public class Bank implements Building {
	private int account;
	
	public Bank(int account) {
		super();
		this.account = account;
	}
	public void checkAccount() {
		System.out.printf("Visitor visits bank.Account balance is $%d\n",account);
	}
	public void saveMoney(int money) {
		System.out.printf("Visitor visits bank,saves $%d\n",money);
		account+=money;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
