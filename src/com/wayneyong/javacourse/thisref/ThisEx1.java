package com.wayneyong.javacourse.thisref;

/**
 * this - refers to current object
 * <p>
 * a reference variable that points to the current object on
 * which operation is being performed
 * <p>
 * Usages-
 * 1) Resolving local and instance variable references.
 * 2) Constructor invocation from another constructor of the same class.
 * 3) Referencing/returning current object from within the methods.
 */

class Sample {

    private int x; //instance(object) specific variable

    //local variable
    public void setX(int x) {
        this.x = x; //this refer to current object
    }

    public int getX() {
        return this.x;
    }

    public Sample getRef() {
        return this;
    }
}

public class ThisEx1 {
    public static void main(String[] args) {

        Sample s1, s2;
        s1 = new Sample();
        s1.setX(10);
        System.out.println(s1.getX());
        s2 = s1.getRef() ;
        System.out.println(s2.getX());


    }
}
