package com.wayneyong.javacourse.generics;

/***
 * Generic methods
 */


public class GenericsEx2 {
    public static <T> void display(T[] arr) {
        for (T value : arr) {
            System.out.println(value);
        }
    }

//    //overloading for double array
//    public static void display(Double[] arr) {
//        for (Double value : arr) {
//            System.out.println(value);
//        }
//    }
//
//    //overloading for string array
//    public static void display(String[] arr) {
//        for (String value : arr) {
//            System.out.println(value);
//        }
//    }

    public static void main(String[] args) {
        Integer arr1[] = {10, 20, 30};
        display(arr1);

        Double arr2[] = {10.2, 23.2, 32.4};
        display(arr2);

        String arr3[] = {"abc", "xyz", "pqr"};
        display(arr3);

    }
}
