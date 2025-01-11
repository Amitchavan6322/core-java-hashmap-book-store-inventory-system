package com.amit.book.inventory.service;

import com.amit.book.inventory.model.Customer;

import java.util.HashSet;
import java.util.Scanner;

public class CustomerService {

    private HashSet<Customer> customers = new HashSet<>();
    private Scanner scanner = new Scanner(System.in);


    public void acceptCustomerInfo(){

        Customer customer = new Customer();

        System.out.println("Enter customer id");
        int customerId = Integer.parseInt(scanner.nextLine());
        customer.setCustomerID(customerId);

        System.out.println("Enter customer name");
        String name = scanner.nextLine();
        customer.setCustomerName(name);

        System.out.println("Enter customer address");
        String address = scanner.nextLine();
        customer.setCustomerAddress(address);

        System.out.println("Enter customer contact");
        Long contact = Long.valueOf(scanner.nextLine());
        customer.setCustomerContact(contact);

        System.out.println("Enter customer Email ID");
        String emailID = scanner.nextLine();
        customer.setEmailID(emailID);

        customers.add(customer);
    }

    public void displayCustomerInfo(){
        for (Customer customer : customers){
            System.out.println("Customer Info : " +customer);
        }
    }
}
