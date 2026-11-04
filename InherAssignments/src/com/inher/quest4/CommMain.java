package com.inher.quest4;

import java.util.Scanner;

public class CommMain {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Select the messaging type : \n1.MailCommunication\n2.SMSCommunication\n3.PhoneCommunication\n4.WhatsppCommunication");
		int choise = scanner.nextInt();
		
		switch(choise)
		{
		case 1: 
				{
					Communication mailcom = new MailCommunciation();
					mailcom.sendMessage();
					
					MailCommunciation ma = (MailCommunciation)mailcom;
					String[] ar = ma.showTypes();
					for(String r:ar)
						System.out.println(r);
					break;
				}
		
		case 2:
				{
					Communication smscom = new SMSCommunciation(); 
					smscom.sendMessage();
					
					SMSCommunciation sm = (SMSCommunciation)smscom;
					sm.messageLength();
					break;
				}
		
		case 3:
				{
					Communication phcom = new PhoneCommunciation();
					phcom.sendMessage();
					
					PhoneCommunciation pc = (PhoneCommunciation) phcom;
					pc.callService();
					break;
				}
				
				
		case 4:
				{
					Communication wacom = new WhatsappCommunciation();
					wacom.sendMessage();
					
					WhatsappCommunciation wa = (WhatsappCommunciation) wacom;
					wa.otherFeatures();
					break;
				}
				
		default : System.out.println("wrong option");
				
		}
		
		scanner.close();
			
		
	}

}
