package com.basics.quest5;

public class Mobile 
{
	
	String model;
	String brand;
	int colour;
	
	public Mobile(String model, String brand, int colour) 
	{
		super();
		this.model = model;
		this.brand = brand;
		this.colour = colour;
	}
	
	void getDetails()
	{
		System.out.println("The model of the mobile is "+model + " brand of the mobile is "+brand+" colour code is "+colour);
	}
	
}
