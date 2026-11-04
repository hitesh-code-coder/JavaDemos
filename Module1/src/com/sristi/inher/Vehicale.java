package com.sristi.inher;

public class Vehicale 
{
	String brand;
	String name;
	
	
	public Vehicale(String brand, String name) {
		super();
		this.brand = brand;
		this.name = name;
	}


	void printDetails()
	{
		System.out.println("Name is  "+name);
		System.out.println("Brand is "+brand);
	}

}
