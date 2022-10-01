package com.wayneyong.javacourse.abstractclasses;

/**
 * Abstract classes -
 * - Can not be instantiated / cannot create object from the class
 * - They are declared abstract and may or may not include abstract methods
 * - They can be subclassed
 * - Abstract classes and abstract methods can not be final
 * <p>
 * Concrete classes -
 * - Classes which can be instantiated
 */

//Base class as abstract is written to provide common functionalities, sub class can extend it and design their own functionalities
abstract class Base { //designed to be meant pure base class
    public void f() {
        System.out.println("f() in Base");
    }
    public abstract void g(); //somebody has to extends it to become concrete
}

//concrete class
class Derived extends Base {
    @Override
    public void g() {
        System.out.println("g() in Derived");
    }
}

public class AbstractClassEx1 {
    public static void main(String[] args) {
        Base b; // reference variable
        b = new Derived(); //error
        b.f();
        b.g();

        System.out.println();
        Derived d = new Derived();
        d.f();
        d.g();
    }
}
