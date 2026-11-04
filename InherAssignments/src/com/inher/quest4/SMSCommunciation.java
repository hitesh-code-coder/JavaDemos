package com.inher.quest4;

public class SMSCommunciation extends Communication 
{

	@Override
	void sendMessage() 
	{
		System.out.println("communication through short messaging service");
	}
	
	void messageLength()
	{
		System.out.println("short messages of up to 160 characters");
	}

}
