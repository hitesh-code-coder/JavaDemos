package com.training.scan;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int size = 0;
		System.out.println("Enter the size of array : ");
		size = scanner.nextInt();
		
		System.out.println("Enter the elements of array : ");		
		int arrayMain[] = new int[size];
		int arrayFinal[] = new int[size];
		
		for(int i =0; i<size;i++)
			arrayMain[i] = scanner.nextInt();
		
		for(int j =0; j<size;j++)
		{
			arrayFinal[j] = arrayMain[j] * arrayMain[j];
		}
		
		System.out.println("the squre root of all the elements are : ");

		for(int ar : arrayFinal)
			System.out.println(ar);
		
		scanner.close();
	}

}
