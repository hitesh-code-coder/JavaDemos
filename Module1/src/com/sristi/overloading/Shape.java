package com.sristi.overloading;

public class Shape 
{
	
	void area (int x)
	{
		System.out.println("sq : " + (x*x));
	}
	
	int area(int x, int y)
	{
		return x*y;
	}
	
	double area(int x, double y)
	{
		return 0.5*x*y;
	}
	
	void area (double x)
	{
		System.out.println("sq" + (Math.PI*x*x));
	}

}
