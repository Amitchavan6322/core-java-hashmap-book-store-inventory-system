package com.amit.book.inventory.service;

import com.amit.book.inventory.model.Book;
import com.amit.book.inventory.model.BookCategory;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookService {

    private HashMap<Integer, Book> books = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public void acceptingBookInfo() {
        Book book = new Book();

        System.out.println("Enter book id");
        int bookId = Integer.parseInt(scanner.nextLine());
        // book.setBookID(bookId);

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

        // Updated category input
        System.out.println("Enter book category (Options: ACADEMIC, FICTION, HISTORY, MUSIC)");
        String categoryInput = scanner.nextLine().toUpperCase(); // Convert input to uppercase for enum compatibility
        try {
            BookCategory category = BookCategory.valueOf(categoryInput); // Convert input to enum value
            book.setCategory(category);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid category. Please enter one of the following: ACADEMIC, FICTION, ACTION, MUSIC");
            return; // Exit the method if invalid input
        }

        System.out.println("Enter book store location");
        String storeLocation = scanner.nextLine();
        book.setStoreLocation(storeLocation);

        System.out.println("Enter book price");
        int price = Integer.parseInt(scanner.nextLine());
        book.setPrice(price);

        books.put(bookId, book);
    }

    public void displayBookInfo() {
        for (Map.Entry<Integer, Book> set : books.entrySet()) {
            System.out.println("Book ID: " + set.getKey() + " = Book Info: " + set.getValue());
        }
    }
}
