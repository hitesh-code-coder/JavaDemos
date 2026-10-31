package com.training.basic;

public class Prime {

	public static void main(String[] args) 
	{
		int num = 7;
		boolean isPrime = true;
		
		if (num <= 1)
			System.out.println("Number is not a prime");
		else 
		{
			for (int i =2 ; i <num ; i++)
			{
				if (num % i == 0)
					isPrime =false; 
			}
		}
		
		if(isPrime == true)
			System.out.println("number is a prime");
		else
			System.out.println("number is not a prime");

	}

}
