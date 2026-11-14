package com.training.quest3;

public class ZipCompressor implements IFileCompressor {

	@Override
	public void compressFile(String... strings) {
		System.out.println("Compressed as zip file");
		
		for(String str:strings)
			System.out.println(str);
	}

}
