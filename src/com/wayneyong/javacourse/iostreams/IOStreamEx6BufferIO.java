package com.wayneyong.javacourse.iostreams;

import java.io.*;

/**
 * BufferedInputStream & BufferedOutputStream -
 * <p>
 * They decorate the InputStream and OutputStream instances to
 * added buffered I/O functionality
 * <p>
 * program <-> buffer <-> disc
 * storing data in buffer memory and start consuming from buffer
 * writing some content, and write it to buffer, once buffer is full
 * or closing the stream, can send info to disc, (flush operation)
 * just like water tank, it act as buffer to store water before flushed
 * <p>
 * e.g. whatsapp, each character while you type, it is not going to the destination
 * right immediately, type the full content and once done, click send button
 * then content is sent, meanwhile content is kept in memory, so it is a buffer
 * when click the send button, it is a flush operation
 */


public class IOStreamEx6BufferIO {
    public static void main(String[] args) throws Exception {
        FileOutputStream fileOut = new FileOutputStream("s.dat");

        BufferedOutputStream bufferOut = new BufferedOutputStream(fileOut);
        bufferOut.write(10);
        bufferOut.write(20);
        bufferOut.flush();
        fileOut.close();

        FileInputStream fileIn = new FileInputStream("s.dat");
        BufferedInputStream bufferIn = new BufferedInputStream(fileIn);
        int a = bufferIn.read();
        int b = bufferIn.read();
        System.out.println(a);
        System.out.println(b);
        fileIn.close();

    }
}
