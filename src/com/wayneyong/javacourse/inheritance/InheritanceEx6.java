package com.wayneyong.javacourse.inheritance;

/**
 * final modifier -
 * 1) Used for creating constants
 * final double PI = 3.1416
 * 2) if a method is final it cannot be overridden
 * 3) if a class is final it cannot be extended
 */

class Base1 {
    public void print() {
        System.out.println("print in Base");
    }
}

class Derived1 extends Base1 {
    public void print() {
        System.out.println("print in Derived");
    }
}


public class InheritanceEx6 {
    public static void main(String[] args) {

    }
}
