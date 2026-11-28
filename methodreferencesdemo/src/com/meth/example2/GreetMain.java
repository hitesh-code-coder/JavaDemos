package com.meth.example2;

public class GreetMain {

	public static void main(String[] args) 
	{
		UserDetails details = new UserDetails();
		IGreeter greetref = details::sayHello;
		System.out.println(greetref.greetUSer("Hitesh"));
	}

}
