package com.directi.training.codesmells_refactored.duplicatecode.acrossclasses;

import java.io.OutputStream;

public class AddEmployeeCmd extends Command
{
    private String _name;
    private String _address;
    private String _city;
    private String _state;
    private String _annualSalary;

    public AddEmployeeCmd(String name, String address, String city, String state,
                          String annualSalary)
    {
        _name = name;
        _address = address;
        _city = city;
        _state = state;
        _annualSalary = annualSalary;
    }

    @Override
    protected int getContentSize()
    {
        return super.getContentSize() + _name.getBytes().length + 1 + _address.getBytes().length +
               1 +
               _city.getBytes().length + 1 + _state.getBytes().length + 1 +
               _annualSalary.getBytes().length + 1;
    }

    public void write(OutputStream outputStream) throws Exception
    {
        writeHeader(outputStream);
        writeContentSize(outputStream);
        writeCommandChar(outputStream);
        writeData(_name, outputStream);
        writeData(_address, outputStream);
        writeData(_city, outputStream);
        writeData(_state, outputStream);
        writeData(_annualSalary, outputStream);
        writeFooter(outputStream);
    }

}
