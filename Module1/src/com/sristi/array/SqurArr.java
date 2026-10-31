package com.sristi.array;

import java.util.Scanner;

public class SqurArr {

	public static void main(String[] args) 
	{
		System.out.println("Enter the value of an array of size 4 ");
		int[] arr = new int[4];
		int [] arr2 = new int[4];
		
		Scanner scr = new Scanner(System.in);
		for(int i = 0 ;i<4;i++)
		{
			arr[i] = scr.nextInt();
			arr2[i]=(int)Math.pow(arr[i], 2);
		}
		
		for(int dip : arr2)
			System.out.println(dip);
	}

	
		
	
}
