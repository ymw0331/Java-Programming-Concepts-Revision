package com.wayneyong.javacourse.collections;

import java.util.*;


/**
 * Collections - Prebuilt data structures implementations
 * <p>
 * I - Interface
 * C - Class
 * <p>
 * Collection - (I)
 * List - (I) accept duplicate
 * ArrayList - (C)
 * LinkList - (C)
 * Set - (I) not accept duplicate
 * HashSet - (C)
 * LinkHashSet - (C)
 * SortedSet - (I)
 * TreeSet - (C)
 * Map - (I)
 * HashMap - (C)
 * LinkedHashMap - (C)
 * SortedMap - (I)
 * TreeMap - (C)
 * <p>
 * Shortcuts -
 * <p>
 * List - Allows duplicates
 * Set - No duplicates
 * Hash - Uses hashing (insertion order not preserved)
 * Linked - Insertion order preserved
 * Tree - Sorted
 */
//Iterator
public class CollectionEx5 {
    public static void display(Collection<Integer> col) {
        //For each value in the collection.
//        for (Integer value : col) {
//            System.out.println(value);
//        }

        Iterator<Integer> iterator = col.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        System.out.println("Values in the LinkedList:");
        display(list);

        System.out.println("===================");
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10); // not added because of duplicated
        System.out.println("Values in the Set:");
        display(set);
    }
}
