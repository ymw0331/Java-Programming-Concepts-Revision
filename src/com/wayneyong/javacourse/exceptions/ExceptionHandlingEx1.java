package com.wayneyong.javacourse.exceptions;

/**
 * Exceptions are special kind of errors or failure conditions in the code which need to be caught and handled.
 * <p>
 * StackTrace - give list of function call hierarchy, so can figure out from where it is invoked, what kind of failure caused by exception class
 */

public class ExceptionHandlingEx1 {
    static int div(int a, int b) {
        try { //block where exception might occur
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException");
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(div(10, 2));
        System.out.println(div(10, 0));
    }
}
