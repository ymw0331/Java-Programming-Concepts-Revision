package com.wayneyong.javacourse.nestedclasses;

class Base {
    public void f() {
        System.out.println("f() in Base");
    }

    public void g() {
        System.out.println("g() in Base");
    }
}

public class NestedClassesEx7 {
    public static void main(String[] args) {
        Base b1 = new Base();
        System.out.println("==========b1==========");
        b1.f();
        b1.g();

        //anonymous implementation
        Base b2 = new Base() {
            @Override
            public void g() {
                System.out.println("g() in anonymous derived");
            }
        };

        System.out.println("==========b2==========");
        b2.f();
        b2.g();
    }

//    public static Base myAnonymousConstructor() {
//        return new Base() {
//            @Override
//            public void g() {
//                System.out.println("g() in anonymous derived");
//            }
//        };
//    }
}
