
package com.bookapp.client;

import java.util.List;
import java.util.Scanner;

import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;
import com.bookapp.exception.BookNotFoundException;

public class User {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        IBookService bookservice = new BookServiceImpl();

        int choice;

        do {
            System.out.println("\n===== BOOK MANAGEMENT SYSTEM =====");
            System.out.println("1. Display all books");
            System.out.println("2. Search by author");
            System.out.println("3. Search by category");
            System.out.println("4. Search by price");
            System.out.println("5. Search by publication year");
            System.out.println("6. Search by author and category");
            System.out.println("7. Search by book ID");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            choice = scr.nextInt();
            scr.nextLine();

            try {

                switch (choice) {

                    case 1:
                        displayBooks(bookservice.getAll());
                        break;

                    case 2:
                        System.out.print("Enter author name: ");
                        String author = scr.nextLine();

                        displayBooks(bookservice.getByAuthorContains(author));
                        break;

                    case 3:
                        System.out.print("Enter category: ");
                        String category = scr.nextLine();

                        displayBooks(bookservice.getByCategory(category));
                        break;

                    case 4:
                        System.out.print("Enter maximum price: ");
                        double price = scr.nextDouble();

                        displayBooks(bookservice.getByPriceLessThan(price));
                        break;

                    case 5:
                        System.out.print("Enter publication year: ");
                        int year = scr.nextInt();

                        displayBooks(bookservice.getByDatePublished(year));
                        break;

                    case 6:
                        System.out.print("Enter author name: ");
                        String authorName = scr.nextLine();

                        System.out.print("Enter category: ");
                        String bookCategory = scr.nextLine();

                        displayBooks(bookservice.getByAuthorContainsAndCategory(
                                authorName, bookCategory));
                        break;

                    case 7:
                        System.out.print("Enter book ID: ");
                        int bookId = scr.nextInt();

                        System.out.println(bookservice.getById(bookId));
                        break;

                    case 8:
                        System.out.println("Thank you!");
                        break;

                    default:
                        System.out.println("Invalid choice");
                }

            } catch (BookNotFoundException e) {
                System.out.println(e.getMessage());
            }
            catch (Exception e) {
                System.out.println("Invalid input: " + e.getMessage());
                scr.nextLine();
            }

        } while (choice != 8);

        scr.close();
    }

    public static void displayBooks(List<Book> books) {

        for (Book book : books) {
            System.out.println(book);
        }
    }
}