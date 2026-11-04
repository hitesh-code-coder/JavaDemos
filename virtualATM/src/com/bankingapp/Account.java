package com.bankingapp;

public class Account 
{
	
	protected double balance;

	public Account(double balance) 
	{
		super();
		this.balance = balance;
	}
	
	public static String bankName="ABC Bank";
	
	void withDraw(double amount)
	{
		System.out.println("withdraw in account class");
	}
	
	void deposit(double amount)
	{
		System.out.println("Deposit in account class");
	}
	
	double getBalance()
	{
		return this.balance;
	}
	

}
