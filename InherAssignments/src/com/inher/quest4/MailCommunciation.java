package com.inher.quest4;

public class MailCommunciation extends Communication 
{

	@Override
	void sendMessage() 
	{
	
		System.out.println("communication using mail service");
		
	}
	
	String[] showTypes()
	{
		String[] ar = {"email","telegram","letter"};
		return ar;
	}
	
}
