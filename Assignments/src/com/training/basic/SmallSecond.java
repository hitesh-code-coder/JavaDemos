package com.training.basic;

public class SmallSecond {

	public static void main(String[] args) 
	{
		System.out.println("Second smallest in an array");
		
		int list[] = {2,5,3,7,9,10,11,13};
		int smallestnum = list[0]; int secondsmall = Integer.MAX_VALUE;
		
		for(int i = 0; i < list.length;i++)
		{
			System.out.print(list[i] + " ");
		}
		
		for(int j = 1; j< list.length;j++)
		{
			if(list[j] < smallestnum)
			{
				secondsmall = smallestnum;
				smallestnum = list[j];
			}
			
			else if(list[j] < secondsmall)
			{
				secondsmall = list[j];
			}
		}
		
		System.out.println("The smallest is " + smallestnum + " and the second smallest is "+secondsmall);

	}

}
