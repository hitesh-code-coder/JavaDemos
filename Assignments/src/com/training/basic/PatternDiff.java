package com.training.basic;

public class PatternDiff {

	public static void main(String[] args) 
	{
		int counter = 1;
		
		System.out.println("create a pattern as(given below)1 23 456 789");
		
		for (int i = 1; i<=4 ;i++)
		{
			for(int j = 1; j <=i ;j ++)
			{
				System.out.print(counter);
				counter ++;
			}
			System.out.print("\t");
		}

	}

}
