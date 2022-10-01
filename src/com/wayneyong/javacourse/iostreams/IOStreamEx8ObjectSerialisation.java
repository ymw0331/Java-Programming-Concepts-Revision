package com.wayneyong.javacourse.iostreams;

import java.io.*;

/**
 * ObjectInputStream and ObjectOutputStream
 * <p>
 * They decorate the InputStream and OutputStream classes to provide the
 * additional functionality for reading and writing objects.
 * <p>
 * - The corresponding class should implement Serializable interface
 * <p>
 * - Serialization - converting object to stream of bytes
 * - Deserialization - converting stream of bytes to object
 */

public class IOStreamEx8ObjectSerialisation {

    public static void main(String[] args) throws Exception {
        Rectangle r1 = new Rectangle(10, 20);
        Rectangle r2 = new Rectangle(30, 40);

        FileOutputStream fileOut = new FileOutputStream("rectangle.dat");
        ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
        objOut.writeObject(r1);
        objOut.writeObject(r2);
        fileOut.close();

        FileInputStream fileIn = new FileInputStream("rectangle.dat");
        ObjectInputStream objIn = new ObjectInputStream(fileIn);

        Rectangle r3, r4;
        r3 = (Rectangle) objIn.readObject();
        r4 = (Rectangle) objIn.readObject();

        r3.print();
        r4.print();

        fileIn.close();
    }
}

// marker interface, convert object to byte, byte to object
class Rectangle implements Serializable {
    private double weight, height;

    public Rectangle(double w, double h) {
        this.weight = w;
        this.height = h;
    }

    public void print() {
        System.out.println("width - " + weight + ", height - " + height);
    }
}