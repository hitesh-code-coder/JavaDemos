package com.abs.quest1;

import java.util.Scanner;

public class DemoAbs {

	public static void main(String[] args) 
	{

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your role :\n1.Manager \n2.TeamLead \n3.Developer");
		int option = scanner.nextInt();
		
		switch(option)
		{
		case 1:
				{
					Employee manager = new Manager("HItesh",10000,101);
				}
		
		
		
		}
	}

}
