package com.inher.quest5;

public class MobMain {

	public static void main(String[] args) 
	{
		System.out.println("Mobile");
		
		Mobile featurephone = new FeaturePhone();
		featurephone.call();
		System.out.println();
		
		Mobile smart = new SmartPhone();
		smart.call();
		
		SmartPhone sp = (SmartPhone)smart;
		String[] arr = sp.apps();
		
		
		for(String a:arr)
			System.out.print(a+",");
	}

}
