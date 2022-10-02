package com.wayneyong.javacourse.designpattern;

/**
 * Decorator Pattern -
 * Need -
 * we should allow behaviour to be extended without
 * the need to modify existing code.
 * <p>
 * Pros -
 * 1) Works as an alternative to subclassing, it extends
 * the behaviour of an existing class without modifying it
 * 2) It mirrors the type of component that it decorates
 * <p>
 * Cons -
 * 1) It can result in many small objects in the design,
 * and overuse can become complex.
 * <p>
 * Example Decorator in Java -
 * <p>
 * ObjectOutputStream objOut =
 * new ObjectOutputStream( // object serialization
 * new BufferedOutputStream( //buffer
 * new FileOutputStream("student.dat") //reading and writing bytes
 * )
 * };
 */

//abstract component
abstract class Pizza {
    public abstract double cost();

    public abstract String description();

}

//concrete components (independent)
class VegExtravaganza extends Pizza {
    @Override
    public double cost() {
        return 100;
    }

    @Override
    public String description() {
        return "VegExtravaganza ";
    }
}

//concrete components (independent)
class PeppyPaneer extends Pizza {
    @Override
    public double cost() {
        return 200;
    }

    @Override
    public String description() {
        return "PeppyPaneer ";
    }
}

//abstract decorator
abstract class Topping extends Pizza {

}

//concrete decorator
class ExtraCheese extends Topping {
    Pizza pizza; //existing pizza

    public ExtraCheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return 50 + pizza.cost();
    }

    @Override
    public String description() {
        return "ExtraCheese " + pizza.description();
    }
}

class BlackOlives extends Topping {
    Pizza pizza; //existing pizza

    public BlackOlives(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return 29 + pizza.cost();
    }

    @Override
    public String description() {
        return "BlackOlives " + pizza.description();
    }
}

public class DecoratorPattern {
    public static void main(String[] args) {
//
//        VegExtravaganza vegExtravaganza = new VegExtravaganza();
//        System.out.println(vegExtravaganza.cost()); //100
//        ExtraCheese extraCheese = new ExtraCheese(vegExtravaganza);

        Pizza pizza =
                new BlackOlives(new ExtraCheese(new VegExtravaganza()));
        System.out.println("Pizza - " + pizza.description() + ";Cost - " + pizza.cost()); // 100 + 50 + 29
    }
}
