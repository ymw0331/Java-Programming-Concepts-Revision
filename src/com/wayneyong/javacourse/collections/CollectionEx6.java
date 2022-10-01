package com.wayneyong.javacourse.collections;

import java.util.HashMap;

/**
 * Collections - Prebuilt data structures implementations
 * I - Interface
 * C - Class
 * <p>
 * Collection - (I)
 * List - (I)
 * ArrayList - (C)
 * LinkedList - (C)
 * Set - (I)
 * HashSet - (C)
 * LinkedHashSet - (C)
 * SortedSet - (I)
 * TreeSet - (C)
 * Map - (I)
 * HashMap - (C)
 * LinkedHashMap - (C)
 * SortedMap - (I)
 * TreeMap - (C)
 * <p>
 * Shortcuts :-
 * List - Allow duplicates
 * Set - No duplicates
 * Hash - Uses hashing (insertion order preserved)
 * Linked - Insertion order preserved
 * Tree - sorted
 * <p>
 * Map - Key, Value pairs (dictionary)
 * (k1,v1), (k2,v2)
 **/

public class CollectionEx6 {
    public static void main(String[] args) {
        //store -> put(key,value)
        HashMap<String, Integer> fruitMap = new HashMap<>();
        fruitMap.put("apple", 20);
        fruitMap.put("mango", 30);
        fruitMap.put("banana", 30);

        //value = get(key)
        Integer applePrice = fruitMap.get("apple");
        System.out.println("Apple Price: " + applePrice);

        for (String key : fruitMap.keySet()) {
            Integer price = fruitMap.get(key);
            System.out.println(key + " -- " + price);
        }
    }
}
