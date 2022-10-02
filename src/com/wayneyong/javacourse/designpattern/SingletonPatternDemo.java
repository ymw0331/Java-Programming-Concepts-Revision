package com.wayneyong.javacourse.designpattern;

/**
 * Singleton Pattern -
 * - Only onw object/instance per container (here it is JVM for now)
 * - Used when instance creation is costly
 * - Example usages:
 * - Runtime.getRuntime();
 * - System.getSecurityManager()
 */

//when we create Sample class, we can create any number of class Sample, but it is not what we wanted
class SampleOld {

    //declaring one instance making it singleton , static member make it only one instance
    //static variable, is class level variable, only one copy of static instance variable
    //remain in memory which holds the reference of the object
    private static SampleOld instance = new SampleOld();

    private SampleOld() {
    }

    //factory method
    public static SampleOld getInstance() {
        return instance;
    }

    //non-static = require an object
    public void sayHello(String name) {
        System.out.println("Hello !!" + name);
    }
}

public class SingletonPatternDemo {
    public static void main(String[] args) {
        //Sample s = new Sample(); is not allowed, because constructor is private field (object creation is not allowed)
        SampleOld s1 = SampleOld.getInstance();
        SampleOld s2 = SampleOld.getInstance();

        System.out.println("is s1 == s2 => " + (s1 == s2)); //same object creation (instance)
        s1.sayHello("wayne");
        s2.sayHello("bapak");

    }
}

/**
 * @Service class AccountService ...{
 * }
 */