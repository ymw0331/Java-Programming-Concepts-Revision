package com.wayneyong.javacourse.collections;

import java.util.Objects;
import java.util.TreeSet;

/**
 * Custom classes with Collections -
 * -If working with hash structures we need to implement hashCode
 * and equals methods
 * -If working with tree structures we need to implement Comparable
 * interface - or we need to provide Comparator
 */

class SomeFruit implements Comparable<SomeFruit> {
    private String name;

    public SomeFruit(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    //f1.equals(f2)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SomeFruit someFruit = (SomeFruit) o;
        return Objects.equals(name, someFruit.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
/*
    //f1.compareTo(f2)*/
    @Override
    public int compareTo(SomeFruit o) {
        return this.name.compareToIgnoreCase(o.name);
    }
}


public class CollectionEx9 {
    public static void main(String[] args) {
        TreeSet<SomeFruit> set = new TreeSet<>();

        set.add(new SomeFruit("apple"));
        set.add(new SomeFruit("mango"));
        set.add(new SomeFruit("apple"));
        set.add(new SomeFruit("APPLE"));

        System.out.println(set);
    }
}
