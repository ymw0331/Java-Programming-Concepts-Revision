package com.wayneyong.javacourse.solid;

/**
 * SOLID Principles:
 * SOLID is an acronym for the first object-oriented design (ODD)
 * principles by Robert C. Martin
 * <p>
 * S - Single Responsibility Principle -
 * A class should have one and only one reason to change.
 * O - Open Closed Principle -
 * Objects or entities should be open for extension but closed for modification
 * L - Liskov Substitution Principle -
 * Objects of super class shall be replaced with objects of subclasses
 * I - Interface Segregation Principle -
 * A client should never be forced to implement an interface that it does not use
 * D -
 ***/

interface VegRestaurant {
    void vegMeals();
}

interface NonVegRestaurant{
    void nonVegMeal();
}

class ABCVegRestaurant implements VegRestaurant {
    @Override
    public void vegMeals() {
        System.out.println("provide veg meals");
    }
}

class XYZRestaurant implements VegRestaurant, NonVegRestaurant{
    @Override
    public void vegMeals() {

    }
    @Override
    public void nonVegMeal() {

    }
}


public class InterfaceSegEx1 {
    public static void main(String[] args) {

    }
}
