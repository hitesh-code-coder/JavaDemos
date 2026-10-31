package com.training.scan;

import java.util.Scanner;

public class ScanSmaller {

	public static void main(String[] args) 
	{
		System.out.println("Find the smallest of three numbers using short circuit AND");
		System.out.println("Enter the three numbers : ");
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if(a < b && a < c)
			System.out.println("The smallest is a : "+a);
		else if (b < c)
			System.out.println("The smallest is b : "+b);
		else
			System.out.println("The smallest is c : "+c);
		
		scanner.close();


	}

}
