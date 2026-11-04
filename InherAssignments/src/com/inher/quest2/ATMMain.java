package com.inher.quest2;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choise");
		System.out.println("1.Balance \n2.withdraw \n3.Deposite");
		int option = scanner.nextInt();
		
		Account hdfc = new Savings();
		hdfc.balance = 10000;
		
		switch(option)
		{
		case 1 :
				{
					System.out.println("Balance is : ");
					double bal = hdfc.balance;
					System.out.print(bal);
					break;
				}
				
		case 2 : 
				{
					System.out.println("with draw option selected");
					System.out.println("Enter amount to be withdrawn");
					double amount = scanner.nextDouble();
					hdfc.withdraw(amount);
					break;
					
				}
				
		case 3 : 
		{
			System.out.println("with draw option selected");
			System.out.println("Enter amount to be deposited");
			double depamount = scanner.nextDouble();
			hdfc.deposit(depamount);
			break;
		}
		
		default : System.out.println("invalide option");
		}
		
		Savings saving = (Savings) hdfc;
		double ba = saving.getBalance();
		System.out.println(ba);
		
		saving.deposit(200.5);
		double ba1 = saving.getBalance();
				System.out.println(ba1);
		
		saving.withdraw(100);
		double ba2 = saving.getBalance();
				System.out.println(ba2);
				
				scanner.close();
	}

	
}
