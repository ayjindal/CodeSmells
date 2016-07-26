package com.directi.training.codesmells_refactored.largeclass;

public class TelephoneNumber
{
    private final String _officeAreaCode;
    private final String _officeNumber;
    private final String _officeExtensionNumber;

    public TelephoneNumber(String officeAreaCode, String officeNumber, String officeExtensionNumber)
    {
        _officeAreaCode = officeAreaCode;
        _officeNumber = officeNumber;
        _officeExtensionNumber = officeExtensionNumber;
    }

    @Override
    public String toString()
    {
        return "(" + _officeAreaCode + ") " + _officeNumber + "-" + _officeExtensionNumber;
    }
}
