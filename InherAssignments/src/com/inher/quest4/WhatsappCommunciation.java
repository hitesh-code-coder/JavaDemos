package com.inher.quest4;

public class WhatsappCommunciation extends Communication 
{

	@Override
	void sendMessage() {
		System.out.println("communication using whatsapp");
	}
	
	void otherFeatures()
	{
		System.out.println("send photos,videos,audio documents,and \r\n messages");
	}
	
}
