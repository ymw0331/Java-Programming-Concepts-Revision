package com.wayneyong.javacourse.basics;


public class ArraysEx2 {
    //static function can only call or reference other static member of the same class
    static int f(int a, int b) {
        // logic
        if (a > b)
            return a;
        else
            return b;
    }

    static void print(int b[]) {
        for (int ele : b) {
            System.out.println(ele);
        }
    }

    static void setZero(int b[]) {
        for (int i = 0; i < b.length; i++) {
            b[i] = 0;
        }
    }

    public static void main(String[] args) {
//        int arr[] = {10, 20, 30, 40};
//        int x = f(10, 20);
//        System.out.println(x);

        int arr[] = {10, 20, 30};
        print(arr);
        setZero(arr);
        System.out.println("===============after setting zero===============");
        print(arr);

    }
}
