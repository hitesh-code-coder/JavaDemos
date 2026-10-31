package com.training.basic;

public class Factorial {

	public static void main(String[] args) 
	{
		int num = 5;
		int fact = 1;
		System.out.println("The factorial for a number : " + num);
		
		for(int i = 1 ; i <= num ;i++)
		{
			fact = fact * i; 
		}
		
		System.out.println("The factorial is : " + fact);

	}

}
