package com.directi.training.codesmells_refactored.featureenvy;

public class Customer
{
    private String _name;
    private Address _currentAddress;

    public Customer(String name, Address address)
    {
        _name = name;
        _currentAddress = address;
    }

    public void printAddress()
    {
        System.out.println(_currentAddress);
    }

    //other methods related to customer class.....

}
