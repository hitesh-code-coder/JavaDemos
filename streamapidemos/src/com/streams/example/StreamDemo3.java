package com.streams.example;

import java.util.Arrays;
import java.util.List;

import com.inter.example1.Book;

public class StreamDemo3 {

	public static void main(String[] args) 
	{
		 List<Book> books =  Arrays.asList(
				    new Book("Java",1,"Kathy",890,"tech"),
				    new Book("Angular",2,"Joe Ben",760,"tech"),
				    new Book("Placebo",3,"Joe",1230,"spiritual"),
				    new Book("Master Mind",4,"Ann Joe",1890,"selfhelp"),
				    new Book("Master Yoga ",5,"BKS",790,"selfhelp"),
				    new Book("Spring",6,"Rod Joe",590,"tech") 
				    );
		 
		 books.stream()
		 .filter(book1->book1.getPrice()>1000).forEach(book1->System.out.println(book1.getTitle()));
		 
	}

}
