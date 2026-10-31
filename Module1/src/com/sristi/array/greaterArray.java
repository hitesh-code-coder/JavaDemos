package com.sristi.array;

public class greaterArray {

	public static void main(String[] args) {

		
		int [] arr = new int[6];
		int max = arr[0];
		
		arr[0] = 5;
		arr[1] = 4;
		arr[2] = 16;
		arr[3] = 8;
		arr[4] = 10;
		arr[5] = 13;
		
		for(int i = 0; i <arr.length;i++)
		{
			if(arr[i] > max )
				max = arr[i];
		}
		System.out.println("Greater number is "+ max);
	}

}
