package com.wayneyong.javacourse.iostreams;

import java.io.*;

/**
 * DataInputStream an DataOutputStream -
 * <p>
 * They decorate the InputStream and OutputStream classes
 * to provide the additional functionality for readability
 * and writing primitive types e.g. int, float, double etc
 */


public class IOStreamEx7Data {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOut = new FileOutputStream("s.dat");
        int a = 9878;
        float b = 10.2f;
        DataOutputStream dout = new DataOutputStream(fileOut);
        dout.writeInt(a);
        dout.writeFloat(b);

        fileOut.close();


        FileInputStream fileIn = new FileInputStream("s.dat");
        DataInputStream din = new DataInputStream(fileIn);
        int c = fileIn.read();
        System.out.println(c);
        fileIn.close();
    }
}
