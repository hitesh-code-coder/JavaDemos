package com.inher.quest2;

public class Current extends Account 
{

	public Current(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		super.withdraw(amount);
		System.out.println("Amount of "+amount+ " withdrawn from current-account, your balance is " + (balance - amount));

	}

	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		super.deposit(amount);
		System.out.println("Amount of "+amount+ " deposited to your current-account, your balance is " + (balance + amount));

	}
	
	

}
