package com.wayneyong.javacourse.nestedclasses;

/**
 * Nested classes - A class written with in another class
 * <p>
 * class OuterClass{
 * .....
 * class NestedClass{
 * ....
 * }
 * }
 * <p>
 * Two types -
 * static nested classes -
 * - NestedClass declared as static
 * - Like static methods they can only access the static members of the outer class
 * directly with out object
 * <p>
 * non-static nested classes -
 * - Non-static nested classes are called inner class
 * - They can access the members of the outer class directly
 * <p>
 * Sample -
 * <p>
 * class OuterClass{
 * static int x;
 * int y;
 * ...
 * static class StaticNestedClass{
 * ...can refer to x
 * }
 * }
 * <p>
 * //Non-static Nested class - also called as inner class
 * class InnerClass{
 * ...can refer to x and y
 * }
 *
 * Instantiation -
 * 1) static nested class object
 *  OuterClass.StaticNestedClass obj = new OuterClass.StaticNestedClass();
 *
 * 2) Non static nested class object
 *  OuterClass outerObj = new OuterClass();
 *  OuterClass.InnerClass obj = outerObj.new InnerClass();
 */

class OuterClass {
    private int x = 10;

    public void test() {
        Demo d = new Demo();
        d.display();
    }

    //inner class ; non-static => object
    class Demo {
        public void display() {
            System.out.println("the value of x is : " + x);
        }
    }
}

public class NestedClassesEx1 {
    public static void main(String[] args) {
        OuterClass obj = new OuterClass();
        obj.test();

        OuterClass.Demo d1 = obj.new Demo();
        d1.display();
    }
}
