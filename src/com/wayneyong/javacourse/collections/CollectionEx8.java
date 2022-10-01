package com.wayneyong.javacourse.collections;

import java.util.HashSet;
import java.util.Objects;

/**
 * Custom classes with Collections -
 * - If working with hash structures we need to implement hashCode
 * and equals methods.
 * - If working with tree structures we need to implement Comparable interface or
 * we need to provide Comparator.
 */


public class CollectionEx8 {

    public static void main(String[] args) {

        HashSet<Fruit> set = new HashSet<>();
        set.add(new Fruit("apple"));
        set.add(new Fruit("mango"));
        set.add(new Fruit("apple")); //should not be added
        System.out.println(set);

        Fruit f = new Fruit("apple");
        f.hashCode();
        // using hash functionality, hashcode has unique value for
        // each order, therefore duplication is allowed
    }
}


class Fruit {
    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (!(o instanceof Fruit) || o == null) return false;
//        return this.name.equals(((Fruit) o).name);
//        //address of object is referenced to object of another same name
//    }
//
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }

}