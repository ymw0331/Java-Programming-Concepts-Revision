package com.wayneyong.javacourse.abstractclasses;

/**
 * A subclass extending an abstract class must override all the abstract
 * methods of the base class otherwise it too becomes abstract
 * <p>
 * a class can held many abstract methods, if extending a abstract class, we need to override the method as well otherwise subclass will be abstract
 */

abstract class A {
    public void f() {
        System.out.println("f() in A");
    }

    public abstract void g();

    public abstract void h();
}

abstract class B extends A {
    public void g() {
        System.out.println("g() in B");
    }
}

class C extends B {
    public void h() {
        System.out.println("h() in C");
    }
}

public class AbstractClassEx2 {
    public static void main(String[] args) {
        A a;
        // a = new A()
        // a = new B()
        a = new C();
        a.f();
        a.g();
        a.h();

    }
}
