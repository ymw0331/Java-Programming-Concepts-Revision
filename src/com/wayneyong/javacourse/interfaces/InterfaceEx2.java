package com.wayneyong.javacourse.interfaces;

/**
 * 1) A class must implement all abstract methods of an interface otherwise
 * it becomes abstract
 * 2) Method invocation based on interface
 */

interface Sample {
    void f();

    void g();
}

abstract class Base implements Sample {
    public void f() {
        System.out.println("f() in Base");
    }

    public abstract void h();
}

class Derived extends Base {

    @Override
    public void g() {
        System.out.println("g() in Derived");
    }

    @Override
    public void h() {
        System.out.println("h() in Derived");
    }

    public void i() {
        System.out.println("i() in Derived");
    }
}


public class InterfaceEx2 {
    public static void main(String[] args) {
        Derived d1 = new Derived();
        d1.f();
        d1.g();
        d1.h();
        d1.i();
        System.out.println();

        Base b1 = d1;
        b1.f();
        b1.g();
        b1.h();
//        b1.i();

        Sample s1 = d1;
        s1.f();
        s1.g();
//        s1.h();
//        s1.i();

    }
}
