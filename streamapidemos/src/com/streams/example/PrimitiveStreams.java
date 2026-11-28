package com.streams.example;

import java.util.Arrays;
import java.util.stream.LongStream;

public class PrimitiveStreams {

	public static void main(String[] args) 
	{
		int [] nums = new int[] {1,2,3,4,5,6,7,8,9,10};
		int sum = Arrays.stream(nums).sum();
		System.out.println("Sum is "+sum);
		
		System.out.println();
		Arrays.stream(nums)
		.filter(num -> num % 2== 0)
		.forEach(System.out::println);
		
		System.out.println();
		
		LongStream.rangeClosed(1000, 2000)
		.filter(num-> num%2==0)
		.forEach(System.out::println);
	}

}
