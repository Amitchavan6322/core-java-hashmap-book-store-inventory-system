package com.amit.book.inventory.model;

public class Book {
    private String name;
    private String author;
    private String publisher;
    private int noOfCopies;
    private BookCategory category; // Use BookCategory enum instead of String
    private String storeLocation;
    private int price;

    @Override
    public String toString() {
        return "Book{" +
                "Name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", noOfCopies=" + noOfCopies +
                ", category=" + category + // Display the enum value
                ", storeLocation='" + storeLocation + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public BookCategory getCategory() { // Updated getter for BookCategory
        return category;
    }

    public void setCategory(BookCategory category) { // Updated setter for BookCategory
        this.category = category;
    }

    public String getStoreLocation() {
        return storeLocation;
    }

    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}