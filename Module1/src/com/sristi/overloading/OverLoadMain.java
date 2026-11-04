package com.sristi.overloading;

public class OverLoadMain {

	public static void main(String[] args) 
	{
		Shape shape = new Shape();
		shape.area(5);
		System.out.println(shape.area(4, 5));
		System.out.println(shape.area(4, 3.2));
		shape.area(5);

	}

}
