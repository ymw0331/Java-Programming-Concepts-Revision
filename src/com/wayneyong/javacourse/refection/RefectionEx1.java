package com.wayneyong.javacourse.refection;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Reflection -
 * Used by programs which tend to examine or modify the runtime
 * behavior of the applications running in JVM.
 * Note - Use with caution
 */


public class RefectionEx1 {
    public static void main(String[] args) throws Exception {
        //Each class is associated with a class object
        //2 approaches
        //Class clazz = Sample.class;
        Class clazz = Class.forName("com.wayneyong.javacourse.refection.Sample");


        Field[] fields = clazz.getDeclaredFields();
        Constructor[] constructors = clazz.getDeclaredConstructors();
        Method[] methods = clazz.getDeclaredMethods();

        System.out.println("Fields are - ");
        for (Field f : fields) {
            System.out.println(f);
        }

        System.out.println("Constructors are - ");
        for (Constructor c : constructors) {
            System.out.println(c);
        }

        System.out.println("Methods are - ");
        for (Method m : methods) {
            System.out.println(m);
        }
    }
}


class Sample {
    int a;

    Sample() {
    }

    Sample(int a) {
        this.a = a;
    }

    //methods
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

}
