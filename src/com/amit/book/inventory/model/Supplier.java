package com.amit.book.inventory.model;

public class Supplier {

    //private int supplierID;
    private String supplierName;
    private String supplierAddress;
    private Long supplierContact;
    private String supplierEmailId;

    @Override
    public String toString() {
        return "Supplier{" +
                //"supplierID=" + supplierID +
                "supplierName='" + supplierName + '\'' +
                ", supplierAddress='" + supplierAddress + '\'' +
                ", supplierContact=" + supplierContact +
                ", supplierEmailId='" + supplierEmailId + '\'' +
                '}';
    }

    /*public int getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
    }*/

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    public Long getSupplierContact() {
        return supplierContact;
    }

    public void setSupplierContact(Long supplierContact) {
        this.supplierContact = supplierContact;
    }

    public String getSupplierEmailId() {
        return supplierEmailId;
    }

    public void setSupplierEmailId(String supplierEmailId) {
        this.supplierEmailId = supplierEmailId;
    }
}
