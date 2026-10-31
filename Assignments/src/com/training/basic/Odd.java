package com.training.basic;

public class Odd {

	public static void main(String[] args) {
		System.out.println("List of odd number : \n");
		
		for(int i =1 ; i<=20 ;i ++)
		{
			if(i % 2 != 0)
				System.out.print(i + " ");
			else continue;
		}

	}

}
