package com.wayneyong.javacourse.nestedclasses;

/**
 * Local classes
 * - Classes which are local to be block
 * - They can only access to the final and effectively final variables.
 * <p>
 * Anonymous classes
 * - A class instantaneously created without any name
 */

public class NestedClassesEx4 {

    static void test() {
        String name = "Wayne";
        class Local {
            public void sayHello() {
                System.out.println("Hello !!" + name);
            }
        }
        Local obj = new Local();
        obj.sayHello();
    }

    public static void main(String[] args) {
        test();
    }
}
