package com.directi.training.codesmells_refactored.duplicatecode.acrossclasses;

import com.directi.training.codesmells.duplicatecode.acrossclasses.LoginCommand;

import org.junit.Test;

import java.io.OutputStream;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LoginCommandTest
{
    @Test
    public void testWrite() throws Exception
    {
        String userName = "Smith";
        String passwd = "qwedsa";
        com.directi.training.codesmells.duplicatecode.acrossclasses.LoginCommand loginCommand = new com.directi.training.codesmells.duplicatecode.acrossclasses.LoginCommand(userName, passwd);
        OutputStream outputStream = mock(OutputStream.class);
        loginCommand.write(outputStream);
        verify(outputStream).write(
            com.directi.training.codesmells.duplicatecode.acrossclasses.LoginCommand.header);
        verify(outputStream).write(19);
        verify(outputStream).write(
            com.directi.training.codesmells.duplicatecode.acrossclasses.LoginCommand.commandChar);
        verify(outputStream).write(userName.getBytes());
        verify(outputStream, atLeastOnce()).write(0x00);
        verify(outputStream).write(passwd.getBytes());
        verify(outputStream, atLeastOnce()).write(0x00);
        verify(outputStream).write(LoginCommand.footer);
    }
}
