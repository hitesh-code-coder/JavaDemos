package com.inher.quest2;

public class Account 
{
	double balance;

	public Account(double balance) 
	{
		super();
		this.balance = balance;
	}

	public Account() 
	{
	}

	void withdraw(double amount)
	{
		System.out.println("Amount of "+amount+ " withdrawn from account, your balance is " + (balance - amount));
	}
	
	void deposit(double amount)
	{
		System.out.println("Amount of "+amount+ " deposited to your account, your balance is " + (balance + amount));

	} 
	
	double getBalance()
	{
		return balance;
	} 
}
