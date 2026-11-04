package com.over.quest1;

import java.util.Scanner;

public class OverloadMain {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		Employee [] empArry = new Employee[5];
		
		
		for(int i =0;i<empArry.length;i++)
		{
		
		System.out.println("Enter the name of the employee");
		String empName = scanner.nextLine();
		
		System.out.println("Enter the designation : ");
		String empDesignation = scanner.nextLine();
		
		Designation designation =
		        Designation.valueOf(empDesignation.toUpperCase());
		
		empArry[i] = new Employee(empName,designation.name());
		}
		
		for(int j=0;j<empArry.length;j++)
		{
			System.out.println("Employee name is : "+ empArry[j].empName);
			System.out.println("Employee designation is : "+ empArry[j].empDesignation);
			
			if(empArry[j].empDesignation.equalsFoldCase("PROGRAMMER"))
			{
				empArry[j].calcBonus(2000.50);
			}
			else if(empArry[j].empDesignation.equalsFoldCase("MANAGER"))
			{
				empArry[j].calcBonus(5000, "watch");
			}
			
			else if(empArry[j].empDesignation.equalsFoldCase("DIRECTOR"))
			{
				empArry[j].calcBonus(10000, "house", 200000);
			}
		}
		scanner.close();
	}

}
