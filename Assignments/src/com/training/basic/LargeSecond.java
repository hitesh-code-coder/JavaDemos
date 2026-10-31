package com.training.basic;

public class LargeSecond {

	public static void main(String[] args) {

		System.out.println("Second largest in an array");
		
		int list [] = {2,5,8,11,3,10};
		int greaterNum = list[0]; int greaterSecond = list[0];
		
		for(int i =0 ; i < list.length ;i++)
			System.out.print(list[i] + " ");
		
		for(int j =0 ; j < list.length;j++)
		{
			if(greaterNum < list[j])
			{
				greaterSecond = greaterNum;
				greaterNum = list[j];
			}
			
			else if(list[j] > greaterSecond)
			{
				greaterSecond = list[j];
			}
		}
		
		System.out.println("\nSecond greatest in array is " + greaterSecond + " and the greatest in array is " + greaterNum);
		
	}

}
