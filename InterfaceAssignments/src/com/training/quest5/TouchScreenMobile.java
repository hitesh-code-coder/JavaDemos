package com.training.quest5;

public class TouchScreenMobile extends BasicMobile implements ISmartPhone {

	@Override
	public void showApps() 
	{
			System.out.println("Whats app, Facebook, Instagram");
	}

	@Override
	public void cameraTypes() 
	{
		System.out.println("Selfie, Rear Camera");
	}

}
