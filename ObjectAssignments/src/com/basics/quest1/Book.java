package com.basics.quest1;

public class Book 
{
	String bookTitle;
	String bookAuthor;
	double price;
	String category;
	
	public Book(String bookTitle, String bookAuthor, double price, String string)
	{
		super();
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.price = price;
		this.category = string;
	}
	
	void getDetails()
	{
		System.out.print("The title of the book is : "+bookTitle + " \nthe author of the book is "+bookAuthor + " \nthe price of the book is "+price);
		System.out.println(" and the category of the book are : " +category);
		
	}
	
	void checkBookType()
	{
		if(price >= 500 )
			System.out.println("The book is premium");
		else
			System.out.println("The book is standard");
	}

}
