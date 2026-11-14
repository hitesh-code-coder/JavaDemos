package com.bankingapp;

public abstract class Bank 
{
	
	abstract void carLoan();
	abstract void vehicalLoan();
	abstract void eduLoan();

	void adminDetails()
	{
		System.out.println("Admin ");
	}
}
