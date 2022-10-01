package com.wayneyong.javacourse.refection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Invoking method through reflection
 * -creating object at runtime using reflection
 * -using annotation using reflection
 */

public class ReflectionEx2 {
    public static void main(String[] args) throws Exception {

        //Demo d1 = new Demo();
        //d1.sayHello("Wayne");

        //use the class object then load the method
        //done at runtime
        Class<Demo> clazz = Demo.class;
        Constructor<Demo> constructor = clazz.getDeclaredConstructor();
        Demo d1 = constructor.newInstance();
        Method m1 = clazz.getDeclaredMethod("sayHello", String.class);
        m1.invoke(d1, "Sakai");
    }
}

class Demo {
    public void sayHello(String name) {
        System.out.println("Hello !! " + name);
    }
}