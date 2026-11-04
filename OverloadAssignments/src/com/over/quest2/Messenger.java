package com.over.quest2;

public class Messenger 
{
	
	void sendMail(String message)
	{
		System.out.println("Message sent : " + message);
	}

	void sendMail(String tousername, String message)
	{
		System.out.println("Message sent : " + message + " to " +tousername);
	}
	
	void sendMail(String tousername, String message,String subject)
	{
		System.out.println("Message sent : " + message + " to " +tousername + " with subject : "+subject);
	}
}
