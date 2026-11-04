package com.oops.override;

public class OverrideDemo {

	public static void main(String[] args) 
	{
		Mobile mob = new BasicPhone();
		mob.CallUser();
		
		Mobile sp = new SmartPhone();
		sp.CallUser();
		
		SmartPhone smart = (SmartPhone) sp;
		String[] arr = smart.availableApps();
		for(String p:arr)
		System.out.print(p+",");
	}

}
