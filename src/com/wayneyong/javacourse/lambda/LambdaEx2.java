package com.wayneyong.javacourse.lambda;

// Functional interface (purely for functional programming) - should have only one single method
@FunctionalInterface // to avoid adding additional methods
interface Greet {
    void sayHello(String name);
}

public class LambdaEx2 {
    public static void main(String[] args) {

        //Anonymous implementation
        Greet g1 = new Greet() {
            @Override
            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        g1.sayHello("g1");

        //Lambda
        Greet g2 = (name) ->
                System.out.println("Hello from Lambda " + name);

        g2.sayHello("g2");

        //Lambda - method reference (one single argument)
        Greet g3 = System.out::println;
        g3.sayHello("g3 ini la weih");
    }
}
