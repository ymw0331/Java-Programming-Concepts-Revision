package com.wayneyong.javacourse.constructor;

/**
 * Other constructor invocation using this.
 * Note: this(..) call should be the first statement in the constructor
 */

class Demo {
    Demo() {
        this(100); // arg constructor call , should be 1st stmt
        System.out.println("rest of the code... ");
    }

    Demo(int a) {
        System.out.println("some complicated init .... " + a);
    }
}

public class ConstructorEx4 {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        System.out.println();
        Demo d2 = new Demo(300);

    }
}
