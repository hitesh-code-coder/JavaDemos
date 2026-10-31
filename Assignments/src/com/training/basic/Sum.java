package com.training.basic;

public class Sum {

	public static void main(String[] args) 
	{
		System.out.println("The sum and avg of all digits in array");
		
		int list [] = {3,5,7,9,11,12,5};
		for(int i = 0; i < list.length;i++)
		{
			System.out.print(list[i] + " ");
		}
		
		int sum = 0;int average = 0;
		
		for(int j = 0; j< list.length;j++)
		{
			sum = sum + list[j];
		}

		average = (sum / list.length);
		
		System.out.println("\nThe sum of all digits is : " + sum + " and average is : "+ average);
	}

}
