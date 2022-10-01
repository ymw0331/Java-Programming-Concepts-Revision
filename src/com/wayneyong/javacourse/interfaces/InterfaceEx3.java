package com.wayneyong.javacourse.interfaces;

/**
 * 1) An interface can extend multiple interfaces
 * 2) A class can implement multiple interfaces
 * <p>
 * Note - A Java class can not extend more than one class,
 * but it can implement multiple interfaces
 */

interface A {
    void f();
}

interface B {
    void g();
}

interface C extends A, B {
    void h();
}

interface D {
    void i();
}

class SomeClass implements C, D {

    @Override
    public void f() {

    }

    @Override
    public void g() {

    }

    @Override
    public void h() {

    }

    @Override
    public void i() {

    }
}


public class InterfaceEx3 {
    public static void main(String[] args) {

        A a = new SomeClass();
        a.f();

        B b = new SomeClass();
        b.g();
//        b.f();

        C c = new SomeClass();
        c.f();
        c.g();
        c.h();
//        c.i();

        D d = new SomeClass();
        d.i();

        //whether it can invoke a function anot, it depends on type(class)
        SomeClass s = new SomeClass();
        s.f();
        s.g();
        s.h();
        s.i();


    }
}
