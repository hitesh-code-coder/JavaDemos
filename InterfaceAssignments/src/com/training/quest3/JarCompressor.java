package com.training.quest3;

public class JarCompressor implements IFileCompressor 
{

	@Override
	public void compressFile(String... strings) 
	{
		System.out.println("Compressed as Jar file");
		
		for(String string:strings)
			System.out.println(string);
	}

}
