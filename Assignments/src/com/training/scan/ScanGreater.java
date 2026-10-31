package com.training.scan;

import java.util.Scanner;

public class ScanGreater {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 3 number to find the greatest : ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int great = 0;
		
		great = ((a > b && a > c)? a : (b>c)?b :c)  ;
		System.out.println("The greatest is : "+great);
		scanner.close();
	}
}
