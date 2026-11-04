package com.oops.override;

public class SmartPhone extends Mobile 
{

	@Override
	void CallUser() {
		
		System.out.println("calling thru phone oe whats app");
	}
	
	String[] availableApps()
	{
		return new String [] {"insta","chrome","facebook"};
	}
}
