package com.training.basic;

public class DownPyramid {

	public static void main(String[] args) 
	{
		System.out.println("create pyramid with stars - half upto ***** **** *** ** *");
		
		for(int i = 5 ; i>=1 ;i--)
		{
			for(int j = 1 ; j<=i ;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
