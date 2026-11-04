package com.sristi.overloading;

public class Messenger 
{
	void greet(String... names)
	{
		for(String name : names)
			System.out.println("Welcome "+ name);
	}
	
	public static void main(String args[])
	{
		Messenger message = new Messenger();
		message.greet("sri","ram");
		message.greet("raju","ramu","Priya");	
		
	}

}
