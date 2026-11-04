package com.over.quest4;

public class Greeter 
{
	String name;
	
	void greetUser(String... messages)
	{
		for(String message:messages)
			System.out.println(message + " name is "+name );
	}
	
	void sayHello(String... names)
	{
		for(String name : names)
			System.out.println("Welcome "+ name);
	}

	public Greeter(String name) {
		super();
		this.name = name;
	}

	public Greeter() {
	}

}
