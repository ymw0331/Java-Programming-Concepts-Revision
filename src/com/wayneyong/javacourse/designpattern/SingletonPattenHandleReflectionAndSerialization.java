package com.wayneyong.javacourse.designpattern;

import java.lang.reflect.Constructor;
import java.io.*;

class Sample implements Serializable {
    //eager loading
    //private static Sample instance = new Sample();

    //lazy loading
    private static Sample instance = null;

    //factory method
    public static Sample getInstance() {
        if (instance == null) {
            //lazy loading
            instance = new Sample();
        }
        return instance;
    }

    private Sample() {
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

public class SingletonPattenHandleReflectionAndSerialization {
    public static void main(String[] args) throws Exception {

        //Using reflection
        Class<Sample> clazz = Sample.class;
        Constructor<Sample> constructor = clazz.getDeclaredConstructor();
//        constructor.trySetAccessible();
        Sample obj = constructor.newInstance();

        //Sample s = new Sample(); is not allowed, because constructor is private field (object creation is not allowed)
        Sample s1 = Sample.getInstance();
        Sample s2 = Sample.getInstance();

        System.out.println("is s1 == s2 => " + (s1 == s2)); //same object creation (instance)
        s1.sayHello("wayne");
        s2.sayHello("bapak");

        //serialization
        ByteArrayOutputStream byteArrOut = new ByteArrayOutputStream();
        ObjectOutputStream objOut = new ObjectOutputStream(byteArrOut);
        objOut.writeObject(obj);
        objOut.close();

        byte[] objBytes = byteArrOut.toByteArray();
        //deserialization
        ObjectInputStream objIn = new ObjectInputStream(new ByteArrayInputStream(objBytes));
        Sample obj2 = (Sample) objIn.readObject();
        System.out.println("is s1 == s2 => " + (obj == obj2)); //true
        objIn.close();

    }
}
