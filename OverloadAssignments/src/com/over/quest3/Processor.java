package com.over.quest3;

public class Processor 
{
	void calculate(double x)
	{
		System.out.println("Squre root is : " + (x *x));
	}

	void calculate(int x, int y)
	{
		System.out.println("The product is : " + (x * y));
	}
	
	void calculate(double x, double y)
	{
		System.out.println("Teh different is : "+ (x-y));
	}
	
	void calculate(double x,int y)
	{
		System.out.println(" x power y is : " + Math.powExact((int) x, y) );
	}
	
	void calculate(int x)
	{
		System.out.println("Squre root is : " + (x *x));
	}
}
