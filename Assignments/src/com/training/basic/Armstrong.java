package com.training.basic;

public class Armstrong {

	public static void main(String[] args) 
	
	{
		int number = 153;
		int originalNumber = number;
		
		int sum = 0;
		int digits =3;

		while (number > 0)
		{
			int digit = number % 10;
			sum = sum + Math.powExact(digit, digits);
			number = number /10;
			
		}
		
		if (sum ==originalNumber)
		{
			System.out.println(originalNumber + " is an armstrong number");
		}
		else
			System.out.println(originalNumber + " is not an armstrong number");

	}
	

}
