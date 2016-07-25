package com.directi.training.codesmells_refactored.duplicatecode.acrossclasses;

import java.io.OutputStream;

public class LoginCommand extends Command
{
    private String _username;
    private String _password;

    public LoginCommand(String username, String password)
    {
        _username = username;
        _password = password;
    }

    @Override
    protected int getContentSize()
    {
        return super.getContentSize() + _username.getBytes().length + 1 +
               _password.getBytes().length + 1;
    }

    public void write(OutputStream outputStream) throws Exception
    {
        writeHeader(outputStream);
        writeContentSize(outputStream);
        writeCommandChar(outputStream);
        writeData(_username, outputStream);
        writeData(_password, outputStream);
        writeFooter(outputStream);
    }

}
