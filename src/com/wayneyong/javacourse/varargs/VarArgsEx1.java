package com.wayneyong.javacourse.varargs;

/**
 * Variable arguments -
 */

public class VarArgsEx1 {
    static int sum(int... a) {
        int s = 0;
        for (int value : a) {
            s += value;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(sum(20, 32));
        System.out.println(sum(20, 44, 32));
        System.out.println(sum(20, 44, 32, 50));
    }
}
