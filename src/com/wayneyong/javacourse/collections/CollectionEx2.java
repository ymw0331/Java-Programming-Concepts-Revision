package com.wayneyong.javacourse.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

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
 * HashSet - (C) hashing technique
 * LinkHashSet - (C) preserving insertion order
 * SortedSet - (I)
 * TreeSet - (C) implementation of sorted set (sort element by default)
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


//Remove duplicates
public class CollectionEx2 {

    public static void main(String[] args) {
        int a[] = {30, 10, 20, 40, 10, 20, 10};
        //collections
//        HashSet<Integer> set1 = new HashSet<Integer>(); //remove duplicate
//        LinkedHashSet<Integer> set1 = new LinkedHashSet<Integer>(); //getting element in the insertion order
        TreeSet<Integer> set1 = new TreeSet<Integer>(); //sort element while adding itself
        for (int ele : a) {
            if (!set1.add(ele)) {
                System.out.println("duplicate found - " + ele);
            }
        }
        System.out.println(set1); //set1.toString();
    }
}
