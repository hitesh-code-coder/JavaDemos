package com.bankingapp;

public class Savings extends Account 
{

	public Savings(double balance) {
		super(balance);
	}

	@Override
	void withDraw(double amount) {
		System.out.println("Withdraw in savings account");
		balance = balance - amount;
	}

	@Override
	void deposit(double amount) {
		System.out.println("Deposit in savings account");
		balance = balance + amount;
		super.deposit(amount);
	}
	
	
		
}
