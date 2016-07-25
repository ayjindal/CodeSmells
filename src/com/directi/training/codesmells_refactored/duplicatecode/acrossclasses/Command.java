package com.directi.training.codesmells_refactored.duplicatecode.acrossclasses;

import java.io.IOException;
import java.io.OutputStream;

public abstract class Command
{
    static final byte[] header = {(byte) 0xde, (byte) 0xad};
    static final byte[] commandChar = {0x01};
    static final byte[] footer = {(byte) 0xbe, (byte) 0xef};
    private static final int SIZE_LENGTH = 1;
    private static final int CMD_BYTE_LENGTH = 1;

    protected void writeHeader(OutputStream outputStream) throws IOException
    {
        outputStream.write(header);
    }

    protected void writeContentSize(OutputStream outputStream) throws IOException
    {
        outputStream.write(getContentSize());
    }

    protected int getContentSize()
    {
        return header.length + SIZE_LENGTH + CMD_BYTE_LENGTH + footer.length;
    }


    protected void writeCommandChar(OutputStream outputStream) throws IOException
    {
        outputStream.write(commandChar);
    }

    protected void writeData(String data, OutputStream outputStream) throws IOException
    {
        outputStream.write(data.getBytes());
        outputStream.write(0x00);
    }

    protected void writeFooter(OutputStream outputStream) throws IOException
    {
        outputStream.write(footer);
    }
}
