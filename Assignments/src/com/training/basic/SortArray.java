package com.training.basic;

public class SortArray {

	public static void main(String[] args) 
	{
		int[] array = {5,7,5,1,4,9};
		System.out.println("Sort the array in ascending order");
		
		for(int i=0;i<array.length-1;i++)
		{
			for(int j =i+1;j<array.length;j++)
			{
				if(array[j] < array[i])
				{
					int swap = array[i];
					array[i] = array[j];
					array[j] = swap;
				}
			}
		}
		
		for(int ar:array)
			System.out.print(ar + ",");
		
	}

}
