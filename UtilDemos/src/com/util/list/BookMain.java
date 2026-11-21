package com.util.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BookMain {

	public static void main(String[] args) 
	{
		List <Book> books = new ArrayList<>();
		books.add(new Book("Hello", "Hitesh", "ABC ", 100, 1));
		books.add(new Book("Hi", "tumtum", "BBC ", 200, 2));
		books.add(new Book("Turn", "tan", "DARK ", 500, 3));
		books.add(new Book("Around", "arch", "toto ", 600, 4));
		books.add(new Book("You", "coil", "titi ", 800, 5));
		
		//System.out.println(books);
		for(Book book:books)
			System.out.println(book);

		List <Book> bookByAuthor = new ArrayList<Book>();
		for(Book book : books)
		{
			if(book.getAuthor().contentEquals("Hitesh"))
			bookByAuthor.add(book);
		}
		
		System.out.println();
		
		for(Book authorbook:bookByAuthor)
			System.out.println(authorbook);
		
		System.out.println();
		Collections.sort(books);
		for(Book book : books)
			System.out.println(book);
		System.out.println();
		
		
			
		
	}

}
