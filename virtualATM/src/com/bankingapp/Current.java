package com.bankingapp;

public class Current extends Account 
{

	public Current(double balance) {
		super(balance);
	}

	@Override
	void withDraw(double amount) {
		System.out.println("Withdraw in current account");
		balance = balance -amount - 100;
	}

	@Override
	void deposit(double amount) {
		System.out.println("Deposit in current account");
		balance = balance + 100+amount;
		super.deposit(amount);
	}
	
	void showLoanTypes()
	{
		System.out.println("Short-term and long term available");
	}
	
}
