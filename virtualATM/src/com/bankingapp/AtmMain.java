package com.bankingapp;

public class AtmMain {

	public static void main(String[] args) 
	{
		System.out.println("Welcome to "+Account.bankName);
		
		Account savings= new Savings(10000);
		savings.withDraw(200);
		savings.deposit(300);
		double bal = savings.getBalance();
		System.out.println("Balance is : "+bal);
		System.out.println();
		
		Account current = new Current(20000);
		current.withDraw(100);
		current.deposit(200);
		bal = current.getBalance();
		System.out.println("Balance is : "+bal);
		System.out.println();
		
		Current cur = (Current)current;
		cur.showLoanTypes();
		bal = cur.getBalance();
		System.out.println("Balance is : "+bal);
		System.out.println();

	}

}
