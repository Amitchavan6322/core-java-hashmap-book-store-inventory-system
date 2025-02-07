package com.amit.book.inventory.service;

import com.amit.book.inventory.model.Book;
import com.amit.book.inventory.model.exception.InvalidBookIDException;
import java.util.HashMap;
import java.util.Map;

public class LibraryService {

    protected HashMap<Integer, Book> books = new HashMap<>();

    public void displayAllBooks() {
        for (Map.Entry<Integer, Book> entry : books.entrySet()) {
            System.out.println("Book ID: " + entry.getKey() + " - " + entry.getValue());
        }
    }

    public Book getBookById(int bookId) throws InvalidBookIDException {
        if (!books.containsKey(bookId)) {
            throw new InvalidBookIDException("Book ID not found");
        }
        return books.get(bookId);
    }

    public boolean isBookCollectionEmpty() {
        return books.isEmpty();
    }

    public void clearBooks() {
        books.clear();
    }
}
