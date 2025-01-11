package com.amit.book.inventory.model;

public class Customer {

    //private int customerID;
    private String customerName;
    private String customerAddress;
    private Long customerContact;
    private String customerEmailID;

    @Override
    public String toString() {
        return "Customer{" +
                //"customerID=" + customerID +
                "customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerContact=" + customerContact +
                ", emailID='" + customerEmailID + '\'' +
                '}';
    }

    /*public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }*/

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Long getCustomerContact() {
        return customerContact;
    }

    public void setCustomerContact(Long customerContact) {
        this.customerContact = customerContact;
    }

    public String getEmailID() {
        return customerEmailID;
    }

    public void setEmailID(String emailID) {
        this.customerEmailID = customerEmailID;
    }
}
