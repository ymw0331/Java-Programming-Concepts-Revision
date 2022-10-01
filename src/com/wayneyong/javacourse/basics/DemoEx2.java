package com.wayneyong.javacourse.basics;
/**
 * Operators -
 * 1) Arithmetic  : +, -, /, *, %, ++, --
 * 2) Relational  : >, <, >=, <=, !=, ==
 * 3) Logical  : &&, ||, !
 * 4) Bitwise : &, |, ~, ^
 * 5) Shift  :
 *          << (left shift),
 *          >> (right shift with sign bit fill),
 *          >>> (right shift with zero fill)
 * 6) Conditional :
 *          ? :
 */
public class DemoEx2 {
    public static void main(String[] args) {
        int obt = 290, total = 300;
        double per;
        per = (double) obt/ total * 100;
        System.out.printf("percentage %1f\n",per);
    }
}
