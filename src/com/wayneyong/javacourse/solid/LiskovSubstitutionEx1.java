package com.wayneyong.javacourse.solid;

/**
 * SOLID Principles -
 * SOLID is an acronym for the first object-oriented design (ODD)
 * principles by Robert C. Martin
 * <p>
 * S - Single Responsibility Principle -
 * A class should have one and only one reason to change
 * O - Open Closed Principles -
 * Objects or entities should be open for extension but not modification
 * L - Liskov Substitution Principle -
 * Objects or super class shall be replaced with objects
 * of subclasses
 */

class Vehicle {
    public void start() {
        System.out.println("Starting a vehicle");
    }
    public void stop() {
        System.out.println("Stopping a vehicle");
    }
}

class Bike extends Vehicle {
    public void start() {
        System.out.println("Starting a bike");
    }
    public void stop() {
        System.out.println("Stopping a bike");
    }
}

class Car extends Vehicle {
    public void start() {
//        System.out.println("Starting a car");
        throw new RuntimeException("boom you are gone!");
    }

    public void stop() {
        System.out.println("Stopping a car");
    }
}

public class LiskovSubstitutionEx1 {
    static void testDrive(Vehicle vehicle) {
        vehicle.start();
        vehicle.stop();
    }
    public static void main(String[] args) {
        testDrive(new Vehicle());
        testDrive(new Bike());
        testDrive(new Car());
    }
}
