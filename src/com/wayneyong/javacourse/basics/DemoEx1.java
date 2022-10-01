package com.wayneyong.javacourse.basics;

import java.util.Scanner;

/**
 * Datatypes -
 * integral types = byte, short, int, long
 * floating types = float, double
 * character = char
 * String
 * boolean - true / false
 *
 *
 * Standard Streams:
 * System.in - standard input stream (keyboard)
 * System.out - standard output stream（monitor）
 * System.err - standard error stream （monitor）
 *
 * Scanner -
 *    nextInt() - for reading integer
 *    nextDouble() - for reading double
 *    nextLine() - for reading one line text
 *    etc..
 *
 *  * SI = P*T*R/100
**/

public class DemoEx1 {
    public static void main(String[] args) {
    double si, p, t, r;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter principal amount:");
    p = scan.nextDouble();
    System.out.println("Enter tenure:");
    t = scan.nextDouble();
    System.out.println("Enter rate:");
    r = scan.nextDouble();
    si = (p*t*r)/100;
    System.out.println("Simple interest = " +si);
    /*System.out.printf("Simple interest - %1f \n",si);*/


    }
}
