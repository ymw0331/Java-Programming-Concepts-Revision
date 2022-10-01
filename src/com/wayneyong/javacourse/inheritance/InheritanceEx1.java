package com.wayneyong.javacourse.inheritance;

import static java.lang.Math.PI;

/**
 * Inheritance -
 * - Mechanism in which one class acquires the properties of another class in order to
 * extend or modify the existing functionality
 * - Class being extended is called base class or parent class or super class
 * - Class extending the base class called as subclass or derived class
 * - Forms an IsA relation with the base class
 */

class BasicCalculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

//IsA
class ScientificCalculator extends BasicCalculator {
    private static final double PI = 3.1417;

    public double sin(double deg) {
        double rad = deg * PI / 180;
        return Math.sin(rad);
    }
}

public class InheritanceEx1 {
    public static void main(String[] args) {
        BasicCalculator bcalc1 = new BasicCalculator();
        System.out.println("Testing basic cal");
        System.out.println(bcalc1.add(10, 20));
        System.out.println(bcalc1.sub(10, 40));

        ScientificCalculator sciCal1 = new ScientificCalculator();
        System.out.println("Testing scientific calc");
        System.out.println(sciCal1.add(10, 20));
        System.out.println(sciCal1.sin(90));

        BasicCalculator b1 = new BasicCalculator();
        System.out.println("Testing basic calc");
        System.out.println(b1.add(10, 30));
        System.out.println(b1.sub(10, 30));


        BasicCalculator b2 = new ScientificCalculator();
        System.out.println("Testing basic calc");
        System.out.println(b2.add(10, 30));
//        System.out.println(b2.sin(180));
    }
}
