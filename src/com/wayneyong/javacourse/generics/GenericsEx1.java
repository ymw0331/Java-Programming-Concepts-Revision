package com.wayneyong.javacourse.generics;

/**
 * Generic classes - (A kind of Template classes in C++)
 * - Classes with Type parameters so that they provide a way re-use
 * the same code for different types.
 * - Allow a stronger type checking at compile time.
 **/

class Sample<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class GenericsEx1 {
    public static void main(String[] args) {
        Sample<Integer> s1 = new Sample<Integer>();
        s1.setValue(10);
        System.out.println(s1.getValue());

        Sample<Double> s2 = new Sample<Double>();
        s2.setValue(10.2);
        System.out.println(s2.getValue());

        Sample<String> s3 = new Sample<String>();
        s3.setValue("abc");
        System.out.println(s3.getValue());

//        Sample<Integer> s4 = new Sample<Integer>();
//        s4.setValue("xyz");
//        Integer a = (Integer) s4.getValue();
//        System.out.println(a);
    }
}
