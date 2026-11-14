package com.lamb.basic;

public class LambdaMain {

	public static void main(String[] args) 
	{
		IGreet greet = () -> {System.out.println("have a great day");};
		greet.greetMessage();
		
		IGreet greet1 = () -> {System.out.println("have a great weekend !!");};
		greet1.greetMessage();
	}

	
}
