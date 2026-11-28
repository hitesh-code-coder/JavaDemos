package com.meth.examples;

public class MethStaticDemo {

	public static void main(String[] args) 
	{
		ICalculator cal = (x,y)->System.out.println("Sum of number "+(x+y));
		cal.Calculate(4, 5);
		
		
		ICalculator call = Processor::sum;
		System.out.println("Run the code");
		call.Calculate(5, 8);
	}

}
