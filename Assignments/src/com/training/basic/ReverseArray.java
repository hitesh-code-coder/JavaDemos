package com.training.basic;

public class ReverseArray {

	public static void main(String[] args) 
	{
		System.out.println("Reverse array");
		int [] arr1 = {5,7,9,3,5,2,7};
		int [] arr2 = new int[7];
		
		for(int i = 0; i<=arr1.length-1;i++)
		{
			for(int j = i ;j<=i;j++)
			{
				arr2[arr2.length-1-i] = arr1[i]; 
			}
		}
		
		for(int array:arr2)
			System.out.print(array);

	}

}
