package com.over.quest2;

public class MessengerMain {

	public static void main(String[] args) 
	{
		Messenger messenger = new Messenger();
		messenger.sendMail("Hi hello");
		messenger.sendMail("Hitesh", "Hi hello to you too ");
		messenger.sendMail("Hitesh", "Hi hello there three", "greetings");

	}

}
