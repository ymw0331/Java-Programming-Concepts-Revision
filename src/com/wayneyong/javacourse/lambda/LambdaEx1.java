package com.wayneyong.javacourse.lambda;

/**
 * A more compact version to Anonymous implementation
 * Lambda Expression -
 * - Anonymous classes seem a bit excessive and cumbersome with
 * only one method to implement.
 * - Lambda Expressions let you express that more compactly
 */

interface MyMath {
    int add(int a, int b);
}

class MyMathImpl implements MyMath {

    @Override
    public int add(int a, int b) {
        return a + b;
    }
}

public class LambdaEx1 {
    public static void main(String[] args) {
        MyMath m1 = new MyMathImpl();
        System.out.println(m1.add(10, 20));

        //Anonymous
        MyMath m2 = new MyMath() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        System.out.println(m2.add(20, 40));

        //Lambda (return statement is optional)
        MyMath m3 = (a, b) -> {
            return a + b;
        };

        //Lambda (compact and more readable)_
        MyMath m4 = (a, b) -> a + b;
        System.out.println("M4:" + m4.add(30, 30));
    }
}
