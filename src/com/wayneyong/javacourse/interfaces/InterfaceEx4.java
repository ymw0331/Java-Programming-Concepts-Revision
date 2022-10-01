package com.wayneyong.javacourse.interfaces;

/**
 * Default and static methods in interfaces
 */

interface ITest {
    void f();

    default void g() {
        //purpose of default in implementation, to not break the
        //by right methods of interface should not be defined
        System.out.println("g() in ITest");
    }

    static void h() {
        System.out.println("h() in ITest");
    }
}

class Demo1 implements ITest {
    @Override
    public void f() {
        System.out.println("f() in Demo1");
    }
}

class Demo2 implements ITest {
    @Override
    public void f() {
        System.out.println("f() in Demo2");
    }
}

public class InterfaceEx4 {
    static void test(ITest itest) {
        itest.f();
        itest.g();
        ITest.h();
    }

    public static void main(String[] args) {
        //expected any object of class that implements ITest
        test(new Demo1());
        System.out.println();
        test(new Demo2());
    }
}
