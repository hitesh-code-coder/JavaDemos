package com.oops.override;

public class BasicPhone extends Mobile 
{

	@Override
	void CallUser() {
		System.out.println("This is a basic phone");
		System.out.println("calling using cellular network");
	}
	

}
