package com.amit.book.inventory.service;


import com.amit.book.inventory.model.Book;

import java.util.HashSet;
import java.util.Scanner;

public class BookService {

    private HashSet<Book> books = new HashSet<>();
    private Scanner scanner = new Scanner(System.in);

    public void acceptingBookInfo(){

        Book book = new Book();

        System.out.println("Enter book id");
        int bookId = Integer.parseInt(scanner.nextLine());
        book.setBookID(bookId);

        System.out.println("Enter book Name");
        String name = scanner.nextLine();
        book.setName(name);

        System.out.println("Enter book Author");
        String author = scanner.nextLine();
        book.setAuthor(author);

        System.out.println("Enter book Publisher");
        String publisher = scanner.nextLine();
        book.setPublisher(publisher);

        System.out.println("Enter no of book copies");
        int noOfCopies = Integer.parseInt(scanner.nextLine());
        book.setNoOfCopies(noOfCopies);

        System.out.println("Enter book category");
        String category = scanner.nextLine();
        book.setCategory(category);

        System.out.println("Enter book store location");
        String storeLocation = scanner.nextLine();
        book.setStoreLocation(storeLocation);

        System.out.println("Enter book price");
        int price = Integer.parseInt(scanner.nextLine());
        book.setNoOfCopies(noOfCopies);

        books.add(book);
    }

    public void displayBookInfo(){
        for(Book book : books){
            System.out.println("Book Info : " +book);
        }
    }
}
