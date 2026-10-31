package com.training.basic;

public class Reverse {

	public static void main(String[] args) 
	{

		System.out.println("Reverse the number");
		int num = 135;
		int reverse = 0;
		
		while(num > 0)
		{
			reverse = (num%10);
			num = num/10;
			System.out.print(reverse);
		}	
		
	}

}
