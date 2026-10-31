package com.basics.quest2;

public class Bank 
{
	double balance;
	
	public Bank(double balance)
	{
		this.balance = balance;
	}
	
	void withdraw(double amount)
	{
		if(amount > balance)
			System.out.println("low balance");
		else
		{
			balance = balance - amount;
			System.out.println("Your new balance is "+balance);
		}
		  
	}
	
	void deposit(double amount)
	{
		balance = balance + amount;
		System.out.println("Your new balance is "+balance);
	}
	
	double getBalance()
	{
		return balance;
	}
	
}
