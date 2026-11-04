package com.sristi.inher;

public class Car extends Vehicale
{
	

	public Car(String brand, String name, String accessories) {
		super(brand, name);
		this.accessories = accessories;
	}

	String accessories;
	
	void show()
	{
		System.out.println(accessories);
	}
	
}
