package com.wayneyong.javacourse.inheritance;

/**
 * - Generalizing code through Inheritance
 * - Object
 * - The base class for all Java classes
 * - Common methods equals(), toString(), hasCode()...
 */

class Animal {
}

class WildAnimal extends Animal {
}

class DomesticAnimal extends Animal {
}

class Lion extends WildAnimal {
}

class Tiger extends WildAnimal {
}

class Cow extends DomesticAnimal {
}

class Dog extends DomesticAnimal {
}

class Human {

}

public class InheritanceEx2 {
    public static void main(String[] args) {
        feed(new Animal());
        feed(new WildAnimal());
        feed(new DomesticAnimal());
        feed(new Lion());
        feed(new Tiger());
        feed(new Cow());
        feed(new Dog());

//        feed(new Human());


    }

    //static can only invoke other static member directly
    static void feed(Animal a) {
        System.out.println("Feeding an animal");
    }
}

class List {
    Dog arr[];
    //going down toward below the hierachy, going toward specification, toward base class, toward generalisation
}