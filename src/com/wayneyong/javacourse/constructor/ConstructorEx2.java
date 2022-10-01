package com.wayneyong.javacourse.constructor;

//Constructor Overloading

class PositiveInteger {
    private int x;

    public PositiveInteger() {
        x = 0;
    }

    public PositiveInteger(int value) {
        x = value;
    }

    public void set(int value) {
        if (value >= 0) x = value;
    }

    public int get() {
        return x;
    }
}

public class ConstructorEx2 {
    public static void main(String[] args) {

        PositiveInteger n1 = new PositiveInteger();
        System.out.println(n1.get());

        PositiveInteger n2 = new PositiveInteger(900);
        System.out.println(n2.get());
    }
}
