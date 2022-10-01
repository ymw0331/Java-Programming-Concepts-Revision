package com.wayneyong.javacourse.collections;

import java.util.HashSet;
import java.util.LinkedList;

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


public class CollectionEx1LinkedListAndHashSet {
    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(20);
        list1.add(10);
        System.out.println("LinkedList: " + list1);

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(10);
        System.out.println("HashSets: " + set1);
    }
}
