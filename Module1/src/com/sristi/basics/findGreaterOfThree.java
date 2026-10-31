package com.sristi.basics;

public class findGreaterOfThree {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = 30;
		
		
		if (x > y && x >z)
			System.out.println("The greatest number is x : " + x);
		
		else if (y > z ) 
		{
			System.out.println("The greastest number is y : " +  y);
		}
		
		else
			System.out.println("The greatest number is z : " + z);

	}



}
