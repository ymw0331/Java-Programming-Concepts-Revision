package com.wayneyong.javacourse.inheritance;

import java.awt.*;

/**
 * Base class constructor invocation using super.
 * - should be the first statement in the subclass constructor
 * - if not selected by default super() is selected
 */

class Point2D {
    protected int x, y; //parent is protecting the properties for the children

//    public Point2D() {}

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.printf("(%d, %d) \n", x, y);
    }
}

class Point3D extends Point2D {

    private int z;

    public Point3D() {
        //by default, it has super();
        super(0, 0);
        //constructor selection is mandatroy
    }

    public Point3D(int x, int y, int z) {
        super(x, y); //should be first statement, use to select constructor of base class
        this.z = z;
    }

    @Override
    public void print() {
        System.out.printf("(%d, %d, %d) \n", x, y, z);
        //private data members in parent class cannot be accessed by its sub classes, other than putting getter and setter
        //therefore, subclass can access the data in parent class by declaring protected to the data members in parent class
    }
}

public class InheritanceEx5 {
    public static void main(String[] args) {

        Point2D p1 = new Point2D(10, 20);
        p1.print();

        System.out.println();
        Point3D p2 = new Point3D(10, 20, 30);
        p2.print();


    }
}
