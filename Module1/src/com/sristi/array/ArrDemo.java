package com.sristi.array;

public class ArrDemo {

	public static void main(String[] args)
	{
		int [] arr = new int[4];
		System.out.println(arr.length);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		arr[0] = 90;
		arr[1] = 80;
		arr[2] = 92;
		arr[3] = 84;
		
		System.out.println("itrating the array");
		
		for(int i = 0; i < arr.length;i++)
			System.out.println(arr[i]);
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++ )
			sum = arr[i] + sum;
		
		System.out.println("The sum is : " + sum);

	}

}
