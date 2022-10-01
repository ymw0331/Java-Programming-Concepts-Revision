package com.wayneyong.javacourse.overriding;

/***
 * Overriding-
 *  Mechanism to modify/replace an existing function of the base class
 */

class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("name is - " + name);
    }
}

class Contact extends Person {
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void print() {
        super.print(); //calling its parent class print method (overriding - modify existing print method)
        System.out.println("address - " + address);
    }
}

public class OverridingEx1 {
    public static void main(String[] args) {
        System.out.println("Person class");
        Person p1 = new Person();
        p1.setName("a");
        p1.print();

        System.out.println("=====================");

        System.out.println("Contact class");
        Contact c1 = new Contact();
        c1.setName("b");
        c1.setAddress("Jalan Elektron Denai Alam");
        c1.print();
//        c1.printAddress();

    }
}
