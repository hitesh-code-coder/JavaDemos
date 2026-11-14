package com.training.quest2;

import java.util.Scanner;

public class FileDemo {

	public static void main(String[] args) 
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("\nz for Zip\nj for Jar\nr for Rar");
		String opt = scr.nextLine().toLowerCase();
		
		switch(opt)
		{
			case "z":
					{
						IExtractor extractor = new ZipExtractor();
						extractor.extractFiles("examples.zip");
						break;
					}
					
			case "j":
			{
				IExtractor jar = new JarExtractor();
				jar.extractFiles("examples.jar");
				break;
			}
			
			case "r":
			{
				IExtractor rar = new RarExtractor();
				rar.extractFiles("examples.rar");
				break;
			}
		
			default : System.out.println("Wrong option !!!!");
		}
		
		scr.close();
	}

}
