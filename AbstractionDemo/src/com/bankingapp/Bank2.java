package com.bankingapp;

public abstract class Bank2 extends Bank
{

	@Override
	void vehicalLoan() {
		System.out.println("car loan in branch2");

		
	}

	@Override
	void eduLoan() {
		System.out.println("edu loan in branch2");
		
	}
	
	void loanTypes()
	{
		System.out.println("short term and long term loan");
	}

}
