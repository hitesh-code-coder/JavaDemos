package com.training.basic;

public class Greater {

	public static void main(String[] args) {

		int list [] = {2,5,8,11,3,10};
		int i =0;
		int j =0;
		int greaterNum = list[0];
		
		System.out.println("The greatest in array");
		for(i =0 ; i < list.length ; i++)
		{	
			System.out.print(list[i] + " ");
		}
		
		for(j=0;j<list.length;j++)
		{
			if (greaterNum < list[j])
				greaterNum = list[j];
		}
		
		System.out.println("\n\nGreatest is " + greaterNum);
	}

}
