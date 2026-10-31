package com.training.basic;

public class Duplicates {

	public static void main(String[] args) 
	{
		System.out.println("Count the duplicates in an array");
		
		int [] first = {2,5,6,7,3,6,5,2};
		int duplicate = 0;
		
		for(int i = 0; i <first.length -1 ; i++)
		{
			for (int j = i + 1; j < first.length; j++)
			{
				if(first[i] == first[j])
				{
					System.out.println("Element is duplicate : " + first[i]);
					duplicate++;
					
				}
			}
		}

		System.out.println(duplicate);
	}

}
