package com.meth.cons;

interface ShapeFactory{
	Shape getshape();
}

public class MethConstDemo {

	public static void main(String[] args) 
	{
		Shape shape1 = new Shape(10);
		shape1.area();
	
		ShapeFactory factory = Shape::new;
		Shape shape2 = factory.getshape();
		shape2.area();
	}

}
