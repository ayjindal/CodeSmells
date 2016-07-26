package com.directi.training.codesmells.featureenvy;

public class Address
{

    private String _addressLine1;
    private String _addressLine2;
    private String _city;
    private String _state;
    private String _country;
    private String _postalCode;

    public Address(String addressLine1, String addressLine2, String city, String state,
                   String country, String postalCode)
    {
        _addressLine1 = addressLine1;
        _addressLine2 = addressLine2;
        _city = city;
        _state = state;
        _country = country;
        _postalCode = postalCode;
    }

    public String getAddressLine1()
    {
        return _addressLine1;
    }

    public String getAddressLine2()
    {
        return _addressLine2;
    }

    public String getCity()
    {
        return _city;
    }

    public String getState()
    {
        return _state;
    }

    public String getCountry()
    {
        return _country;
    }

    public String getPostalCode()
    {
        return _postalCode;
    }
}
