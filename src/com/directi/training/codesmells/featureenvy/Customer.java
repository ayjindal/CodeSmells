package com.directi.training.codesmells.featureenvy;

public class Customer {

    private String name;
    private Address currentAddress;

    public Customer(String name, Address address) {
        this.name = name;
        this.currentAddress = address;
    }


    public void printAddress() {
        StringBuilder sb = new StringBuilder();
        sb.append(currentAddress.getAddressLine1());
        sb.append("\n");
        sb.append(currentAddress.getAddressLine2());
        sb.append("\n");
        sb.append(currentAddress.getCity() + ", " + currentAddress.getState());
        sb.append("\n");
        sb.append(currentAddress.getPostalCode());
        System.out.println(sb.toString());
    }


    //other methods related to customer class.....

}
