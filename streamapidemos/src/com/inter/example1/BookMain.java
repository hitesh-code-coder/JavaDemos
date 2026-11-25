package com.inter.example1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BookMain {

	public static void main(String[] args) 
	{
		Consumer<Book> bookcon = (book)->System.out.println(book.getTitle());
		bookcon.accept(new Book("Hi",1,"Hitesh",1000,"tech"));
		
		Supplier<Book> booksup = ()-> new Book("Hi",1,"Hitesh",1000,"tech");
		System.out.println(booksup.get());
		
		Function<Book, Double> fun1 = (book1) -> book1.getPrice();
		Double price = fun1.apply(new Book("Hi",1,"Hitesh",1000,"tech"));
		System.out.println(price);
		
		Predicate<String> pre = (str)->str.length()>5;
		System.out.println(pre.test("Hitesh"));
		
		Predicate<Book> book = (boo)->boo.getTitle().contains("java");
		System.out.println(book.test(new Book("java",1,"Hitesh",1000,"tech")));
	}

}
