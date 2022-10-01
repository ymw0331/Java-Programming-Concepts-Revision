package com.wayneyong.javacourse.nestedclasses;

/**
 * Anonymous class
 */

interface Greet {
    void sayHello(String name);
}

class MyGreetImp implements Greet {

    @Override
    public void sayHello(String name) {
        System.out.println("Hello!!  " + name);
    }
}


public class NestedClassesEx5AnonymousClass {
    public static void main(String[] args) {

        Greet obj = new MyGreetImp();
        obj.sayHello("Wayne");

        Greet obj2 = new MyGreetImp();
        obj2.sayHello("Wayne 2");

        //anonymous class without having the name
        Greet obj1 = new Greet() {
            public void sayHello(String name) {
                System.out.println("Hello !! " + name + "from anonymous implementation");
            }
        };
        obj1.sayHello("abc");
    }
}
