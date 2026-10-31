package com.training.basic;

public class Even {

	public static void main(String[] args) {

		System.out.println("Even numbers up to 20\n");
		int i =0;
	
		for(i = 1; i<=20 ;i++)
			if(i % 2 == 0)
			{
			System.out.print(i+" ");
			}
		
			else continue;
	}

}
