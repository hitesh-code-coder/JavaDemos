package com.training.quest3;

public class RarCompressor implements IFileCompressor 
{

	@Override
	public void compressFile(String... strings) 
	{
		System.out.println("Compressed as Rar file");
		
		for(String string:strings)
			System.out.println(string);
	}

}
