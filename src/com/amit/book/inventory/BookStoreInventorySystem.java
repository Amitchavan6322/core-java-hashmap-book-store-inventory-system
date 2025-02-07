package com.amit.book.inventory;

import com.amit.book.inventory.model.exception.InvalidBookIDException;
import com.amit.book.inventory.model.exception.InvalidBookNameException;
import com.amit.book.inventory.service.BookService;
import com.amit.book.inventory.service.CustomerService;
import com.amit.book.inventory.service.SupplierService;

import java.util.Scanner;

public class BookStoreInventorySystem {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws InvalidBookIDException {
        BookService bookService = new BookService();
        CustomerService customerService = new CustomerService();
        SupplierService supplierService = new SupplierService();

        int option = 0;
        do {
            System.out.println("Welcome to the Book Store Inventory System");
            System.out.println("Please select option from below list :");
            System.out.println("1. Fill the book information");
            System.out.println("2. Display book information");
            System.out.println("3. Fill the customer information");
            System.out.println("4. Display customer information");
            System.out.println("5. Fill supplier information");
            System.out.println("6. Display supplier information");
            System.out.println("0: Exit project");
            option = Integer.parseInt(sc.nextLine());

           switch (option){
               case 1:
                   try {
                       bookService.acceptingBookInfo();
                       break;
                   } catch (InvalidBookIDException | InvalidBookNameException invalidBookIDException) {
                       System.err.println(invalidBookIDException.getMessage());
                   }

               case 2:
                   bookService.displayBookInfo();
                   break;

               case 3:
                   customerService.acceptCustomerInfo();
                   break;

               case 4:
                   customerService.displayCustomerInfo();
                   break;

               case 5:
                   supplierService.acceptingSupplierInfo();

               case 6:
                   supplierService.displaySupplierInfo();
           }

        }
            while (option != 0);
            System.out.println("THANK YOU!");
    }
}