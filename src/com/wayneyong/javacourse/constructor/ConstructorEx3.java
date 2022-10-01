package com.wayneyong.javacourse.constructor;

/**
 * 1) Object creation must match one of the constructor which is accessible
 * 2) When you don't define a constructor for a class, compiler provides one
 * which is known as default constructor
 */

class ComplexNumber {
    private int real, img;

//    public ComplexNumber() {
//        real = img = 0;
//    }

    public ComplexNumber(int real) {
        this.real = real;
        this.img = 0;
    }

    public ComplexNumber(int real, int img) {
        this.real = real;
        this.img = img;
    }

    public void print() {
        System.out.printf(" (%d)+i(%d)", real, img);
    }
}


public class ConstructorEx3 {
    public static void main(String[] args) {
        ComplexNumber c1, c2, c3;
//        c1 = new ComplexNumber();
        c2 = new ComplexNumber(100);
        c3 = new ComplexNumber(100, 200);

//        c1.print();
        c2.print();
        System.out.println();
        c3.print();
    }
}
