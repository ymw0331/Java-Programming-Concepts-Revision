package com.wayneyong.javacourse.interfaces;

/**
 * Interface -
 * Like a menu in a restaurant, only list whatever items available
 * don't define how it is cooked in the kitchen, list of items needed
 * like a specification
 * <p>
 * -100% abstract as per old Java versions
 * -Java recent editions supports default and static methods
 * -All methods are public abstract by default
 * -All fields are public static and final by default
 * <p>
 * -Used for
 * -Separating interface from implementation
 * -As specification for required methods
 * -For constants
 * -As marker interfaces
 * -Any class that implements an interface must override all the
 * abstract methods of the interface otherwise it became abstract
 */

//serving the purpose of specifying things that are available1
interface Calculator {

    //only method declaration, no definition, by default public and abstract
    double PI = 3.14159; //public static final, static because no object instantiation for interface

    int add(int a, int b); //public abstract

    int sub(int a, int b);

    double sin(double deg);
}

class BasicCalculator implements Calculator {

    //interface cannot create object, only concrete class that implemented the interface
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public double sin(double deg) {
        return Math.sin(deg * PI / 180);
    }
}


public class InterfaceEx1 {
    public static void main(String[] args) {
        Calculator calc; //ref variable
        calc = new BasicCalculator();
        System.out.println(calc.add(10, 20));
        System.out.println(calc.sub(10, 20));
        System.out.println(calc.sin(90));

    }
}
