package com.sristi.array;

import java.util.Scanner;

public class ScanDemo {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the name");
		String name = scr.next();
		System.out.println("Name is : "+name);
		
		System.out.println("Enter ID");
		int id = scr.nextInt();
		System.out.println("The ID is : "+id);
		
		System.out.println("Enter the salary");
		double salary = scr.nextDouble();
		System.out.println("Salary is : "+salary);
		
		System.out.println("Enter your city");
		String city = scr.next();
		System.out.println("City is : "+city);
		
		scr.close();
		
	}

}
