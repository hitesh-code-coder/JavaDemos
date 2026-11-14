package com.training.quest5;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) 
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter \ntouch for Touch Screen \nbasic for Basic Phone");
		String opt = scr.nextLine().toLowerCase();
		
		switch(opt)
		{
		case "touch" :
						{
							ISmartPhone touch = new TouchScreenMobile();
							touch.call();
							touch.cameraTypes();
							touch.showApps();
							touch.messaging();
							break;
						}
		case "smart" :
						{
							IFeaturePhone basic = new BasicMobile();
							basic.call();
							basic.messaging();
							break;
						}
						
		default : System.out.println("Wrong option");
		}
		scr.close();
	}

}
