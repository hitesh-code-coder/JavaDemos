package com.training.quest4;

import java.util.Scanner;

public class PlayerDemo {

	public static void main(String[] args) 
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter \nvlc for VLC \nwindows for Windows");
		String opt = scr.nextLine().toLowerCase();
		
		switch(opt)
		{
		case "vlc":
					{
						IMediaPlayer vlc = new VLCMediaPlayer();
						vlc.playMusic();
						break;
					}
		case "windows" :
					{
						IMediaPlayer win = new WindowsMediaPlayer11();
						win.downloadMusic();
						win.playMusic();
						break;
					}
					
		default:System.out.println("Wrong option !");
		
		}
		scr.close();
	}

}
