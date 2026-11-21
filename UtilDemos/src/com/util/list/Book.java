package com.util.list;

public class Book implements Comparable<Book>
{
	private String title;
	private String author;
	private String publisher;
	private double price;
	private Integer bookId;
	
	public Book() {
		super();
	}

	public Book(String title, String author, String publisher, double price, Integer bookId) 
	{
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", publisher=" + publisher + ", price=" + price
				+ ", bookId=" + bookId + "]";
	}

	@Override
	public int compareTo(Book o) {
		
		return this.getTitle().compareTo(o.title);
		
	}
	
	

	
	

}
