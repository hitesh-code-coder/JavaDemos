package com.basics.quest2;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		Bank bank = new Bank(10000);
		
		System.out.println("Press 1 for withdraw \n Press 2 to deposit");
		int option = scanner.nextInt();
		
		switch(option)
		{
		
		case 1:
				{
					System.out.println("Enter amount to be withdrawn");
					double withdraw= scanner.nextDouble();
					bank.withdraw(withdraw);
					bank.getBalance();
					break;
				}
				
		case 2:
				{
					System.out.println("Enter amount to be deposited");
					double deposit= scanner.nextDouble();
					bank.deposit(deposit);
					bank.getBalance();
					break;
				}
				
		default: System.out.println("Wrong option");
				break;
		
		}
		
		scanner.close();
	}

}
