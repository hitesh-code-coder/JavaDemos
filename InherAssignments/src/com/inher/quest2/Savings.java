package com.inher.quest2;

public class Savings extends Account 
{

	public Savings(double balance) {
		super(balance);
	}

	public Savings() {

			}

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		super.withdraw(amount);
		System.out.println("Amount of "+amount+ " withdrawn from savings - account, your balance is " + (balance - amount));

	}

	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		super.deposit(amount);
		System.out.println("Amount of "+amount+ " deposited to your savings-account, your balance is " + (balance + amount));

	}
	
	

}
