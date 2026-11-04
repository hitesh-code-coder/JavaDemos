package com.sristi.inher;

public class VehicalMain {

	public static void main(String[] args) 
	{
		Vehicale vehical = new Vehicale("A101","Audi");
		vehical.printDetails();
		
		Car car = new Car("x100","Honda","Music System");
		car.printDetails();
		car.show();
	}
	

}
