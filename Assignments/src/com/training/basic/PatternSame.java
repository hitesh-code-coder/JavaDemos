package com.training.basic;

public class PatternSame {

	public static void main(String[] args) 
	{
		System.out.println("create a pattern as(given below) 1 22 333 4444");
		
		for(int i = 1 ; i<=4 ; i++)
		{
			for(int j = 1; j<=i ; j++)
			{
			System.out.print(i);
			}
			System.out.print("\n");
		}

	}

}
