package com.wayneyong.javacourse.exceptions;

/**
 * 1) When an Exception is thrown it must be caught or
 * declared to be thrown (using throws)
 * 2) Exception class hierarchy -
 * Throwable
 * |..Error (virtual machine error)
 * |.. Exception (high level categorisation, handleable)
 * |..  RuntimeException (NullPointerException, ArrayIndexOutOfBoundException)
 * .....
 * 3) Error and RuntimeException objects are exempted
 * from handling hence they are unchecked exceptions,
 * for rest of Exception types handling is mandatory
 * hence they are checked exceptions
 * <p>
 * 4) Multiple Exceptions can be caught or thrown using
 * base types
 */

class MyExp1 extends Exception {
}

class MyExp2 extends Exception {
}

public class ExceptionHandlingEx4 {

    public static void f(int a) throws MyExp1, MyExp2 {
        if (a == 1) throw new MyExp1();
        if (a == 2) throw new MyExp2();
    }

    public static void main(String[] args) {

        try {
            f(1);
        } catch (MyExp1 | MyExp2 e) {
            System.out.println("Handle MyExp1, MyExp2");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
