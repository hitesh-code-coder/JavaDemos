package com.bankingapp;

public class Branch1 extends Bank {

	@Override
	void carLoan() {
		System.out.println("car loan in branch1");
	}

	@Override
	void vehicalLoan() {
		System.out.println("vehical loan in branch1");

	}

	@Override
	void eduLoan() {
		System.out.println("education loan in branch1");

	}
	
	void depositDetails()
	{
		System.out.println("Deposit scheme in branch1");

	}

}
