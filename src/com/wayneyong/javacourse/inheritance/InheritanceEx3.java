package com.wayneyong.javacourse.inheritance;

/**
 * - Overriding and method invocation
 * - Dynamic binding -
 * binding/linking to the corresponding method definition based on object.
 */

class Base {
    void f() {
        System.out.println("f() in Base class");
    }

    void g() {
        System.out.println("g() in Base class");
    }
}

class Derived extends Base {

    //redefining pre-existing function of base class, it is overriding
    void f() {
        System.out.println("f() in Derived class");
    }

    void h() {
        System.out.println("h() in Derived class");
    }

}

public class InheritanceEx3 {
    public static void main(String[] args) {
//        Base b1 = new Base();
//        b1.f(); //f() in base
//        b1.g(); //g() in base
//
//        System.out.println();
//        Base b2 = new Derived(); //Compiler doesn't know what instantiated object is, but only the object type/class
//        b2.f();
//        b2.g();
//        b2.h();
        test(new Base());

    }


    static void test(Base b) {
        b.f();
        b.g();
        if (b instanceof Derived) {
            ((Derived) b).h(); //ClassCastException
        } else {
            System.out.println("b is not an instance of Derived");
        }
    }
}
