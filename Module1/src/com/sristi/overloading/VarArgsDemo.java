package com.sristi.overloading;

public class VarArgsDemo 
{
	void calcSum( String name , int... marks)
	{
		System.out.println("Welcome " + name);
		int sum = 0;
		
		for(int mark : marks)
			sum+=mark;
		
		System.out.println(sum);
	}

	public static void main(String args[])
	{
		VarArgsDemo ref = new VarArgsDemo();
		ref.calcSum("Hitesh",30,50,60);
		ref.calcSum("Hi");
		ref.calcSum("Sri",30,50,60);
	}

}
