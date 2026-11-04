package com.inher.quest4;

public class PhoneCommunciation extends Communication 
{

	@Override
	void sendMessage() {
		System.out.println("communication through phone/mobile verbally");
	}
	
	void callService()
	{
		System.out.println("can be local,international orSubscriber trunk dialing STD");
	}
	
}
