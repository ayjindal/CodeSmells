package com.directi.training.codesmells_refactored.largeclass;

public class Employee
{
    private final String _name;
    private final TelephoneNumber _telephoneNumber;

    public Employee(String name, TelephoneNumber telephoneNumber)
    {
        _name = name;
        _telephoneNumber = telephoneNumber;
    }

    public TelephoneNumber getTelephoneNumber()
    {
        return _telephoneNumber;
    }

    public String getName()
    {
        return _name;
    }
}