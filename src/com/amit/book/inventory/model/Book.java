package com.amit.book.inventory.model;

public class Book {
    private int bookID;
    private String Name;
    private String author;
    private String publisher;
    private int noOfCopies;
    private String category;
    private String storeLocation;
    private int price;

    @Override
    public String toString() {
        return "Book{" +
                "bookID=" + bookID +
                ", Name='" + Name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", noOfCopies=" + noOfCopies +
                ", category='" + category + '\'' +
                ", storeLocation='" + storeLocation + '\'' +
                ", price=" + price +
                '}';
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
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
