package com.wayneyong.javacourse.constructor;

/**
 * Constructors - A function like block which take the name
 * of the class but with no return type
 */

class Sample {
    //no argument constructor
    public Sample() {
        System.out.println("no arg constructor");
    }
    public Sample(int value) {
        System.out.println("no arg constructor with value - " + value);
    }

}

public class ConstructorEx1 {
    public static void main(String[] args) {
        Sample s1 = new Sample();
        Sample s2 = new Sample(100);
    }
}
