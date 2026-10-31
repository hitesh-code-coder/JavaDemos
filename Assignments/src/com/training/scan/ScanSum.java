package com.training.scan;

import java.util.Scanner;

public class ScanSum {

	public static void main(String[] args) 
	
	{
		int sum =0;
		int avg = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = scanner.nextInt();
		
		int[] array = new int[size];
		
		System.out.println("Enter the elements of the array : ");
		for(int i = 0; i<array.length;i++)
			array[i] = scanner.nextInt();
		
		for(int j =0 ; j<array.length;j++)
		{
			sum+=array[j];
		}
		
		avg = sum/array.length;
		
		System.out.print("The elements are :");
		for(int ar:array)
		{
			System.out.print(ar + ",");
			
		}
		
		System.out.println("\n The sum of array is "+sum + " the average of array is : "+ avg);
		
		scanner.close();
	}

}
