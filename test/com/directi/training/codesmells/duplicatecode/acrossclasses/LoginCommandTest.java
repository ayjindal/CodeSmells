package com.directi.training.codesmells.duplicatecode.acrossclasses;

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
        LoginCommand loginCommand = new LoginCommand(userName, passwd);
        OutputStream outputStream = mock(OutputStream.class);
        loginCommand.write(outputStream);
        verify(outputStream).write(LoginCommand.header);
        verify(outputStream).write(19);
        verify(outputStream).write(LoginCommand.commandChar);
        verify(outputStream).write(userName.getBytes());
        verify(outputStream, atLeastOnce()).write(0x00);
        verify(outputStream).write(passwd.getBytes());
        verify(outputStream, atLeastOnce()).write(0x00);
        verify(outputStream).write(LoginCommand.footer);
    }
}
