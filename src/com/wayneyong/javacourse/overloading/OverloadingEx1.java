package com.wayneyong.javacourse.overloading;

/*
 * Overloading -
 * Providing multiple definitions to the same identifier
 * */

class Sample {
    public void print(int a) {
        System.out.println("Int - " + a);
    }

    public void print(float a) {
        System.out.println("Float - " +a);
    }

    public void print(String a) {
        System.out.println("String - " + a);
    }

}

public class OverloadingEx1 {
    public static void main(String[] args) {
        Sample obj = new Sample();
        obj.print(10);
        obj.print(10.2f);
        obj.print("abc");

    }
}
