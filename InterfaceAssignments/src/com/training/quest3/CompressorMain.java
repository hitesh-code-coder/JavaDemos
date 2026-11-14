package com.training.quest3;

public class CompressorMain 
{
	public static void main(String[] args) 
	{
		IFileCompressor zip = new ZipCompressor();
		zip.compressFile("Java.main");
		
		IFileCompressor jar = new JarCompressor();
		jar.compressFile("main.main");
		
		IFileCompressor rar = new RarCompressor();
		rar.compressFile("main.rar");
		
	}

}
