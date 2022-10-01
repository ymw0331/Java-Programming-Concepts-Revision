package com.wayneyong.javacourse.generics;

/**
 * Bounded Type Parameters
 */

class Demo<T extends Number> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }
}

public class GenericsEx3 {
    public static void main(String[] args) {

        Demo<Integer> d1 = new Demo<>();
        d1.setValue(10);
        System.out.println(d1.getValue());

        Demo<Double> d2 = new Demo<>();
        d2.setValue(10.2);
        System.out.println(d2.getValue());

//        Demo<String> d3 = new Demo<>();
//        d3.setValue("abc");
//        System.out.println(d3.getValue());

    }
}
