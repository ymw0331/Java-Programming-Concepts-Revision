package com.wayneyong.javacourse.exceptions;

/**
 * Finally block - finally block is executed irrespective of exceptions
 * <p>
 * Generally used for releasing the resources such as closing a file,
 * closing a database connection etc.
 * <p>
 * Example Usage:-
 * open file
 * try{
 * read/write
 * }catch(IOException e){
 * handle IOException
 * }finally{
 * close file
 * }
 * <p>
 * <p>
 * try-with-resources is a simplified version of finally
 * for AutoClosable
 */

class MyExp extends Exception {
}

public class ExceptionHandlingEx5 {
    static void f(int a) {
        try {
            System.out.println("inside try");
            if (a == 1) return;
            if (a == 2) throw new MyExp();
            System.out.println("last statement of try");
        } catch (MyExp e) {
            System.out.println("MyExp handler");
        } finally { //usually used in closing a db connection, releasing the resources
            System.out.println("finally....");
        }
        System.out.println("after try block");
    }

    public static void main(String[] args) {
//        f(1);
//        f(2);
        f(3);
    }
}
