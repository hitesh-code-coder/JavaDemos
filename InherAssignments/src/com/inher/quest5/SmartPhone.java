package com.inher.quest5;

public class SmartPhone extends Mobile 
{

	@Override
	void call() 
	{
		System.out.println("calling from smartphone");
		
	}
	
	String[] apps()
	{
		String[] app = {"whatsapp","fb","snapchat","WiFi"};
		return app;
	}
	
}
