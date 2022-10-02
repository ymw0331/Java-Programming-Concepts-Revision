package com.wayneyong.javacourse.designpattern;

import java.io.Serializable;

class SampleNew implements Serializable {
    //eager loading
    //private static Sample instance = new Sample();

    //lazy loading
    private static SampleNew instance = null;

    //factory method
    public static SampleNew getInstance() {
        if (instance == null) {
            //synchronise operation
            //traffic light is a shared resource, once green only we can drive thru, other should wait
            synchronized (Sample.class) { //synchronized is a costly operation
                //double checking
                if (instance == null) {
                    //lazy loading
                    instance = new SampleNew();
                }
            }
        }
        return instance;
    }

    private SampleNew() {
        if (instance == null) {
            instance = this; //current object
        } else {
            throw new IllegalStateException("you can not crate object");
        }
    }

    //to fix deserialization issue
    public Object readResolve() {
        return instance;
    }

    //non-static = requires an object
    public void sayHello(String name) {
        System.out.println("Hello!! " + name);
    }
}

public class SingletonPatternThreadSafety {
    public static void main(String[] args) {


    }
}
