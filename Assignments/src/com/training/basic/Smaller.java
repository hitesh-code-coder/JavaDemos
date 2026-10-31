package com.training.basic;

public class Smaller {

	public static void main(String[] args) 
	{
		int list [] = {2,5,8,11,3,10};
		int i =0;
		int j =0;
		int leastNum = list[0];
		
		System.out.print("The array is as follows : ");
		for(i = 0; i< list.length ;i++)
		{
			System.out.print(list[i] + " ");
		}

		for(j=0; j<list.length ;j++)
		{
			if(list[j] < leastNum)
				leastNum = list[j];
		}
		
		System.out.println("\nThe least is " + leastNum);
	}

}
