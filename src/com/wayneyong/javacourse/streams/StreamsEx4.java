package com.wayneyong.javacourse.streams;

import java.util.Arrays;

/**
 * Intermediate Operations -
 * Filtering and Mapping
 * distinct() - returns a stream with no duplicates
 * filter(Predicate) - returns a stream of elements which only those elements for which the predicate return true.
 * map(Function) - returns a stream where the given function is applied on each element of the input stream
 * mapToInt(), mapToDouble(), mapToLong() -
 * produces the stream of primitives not objects.
 */

public class StreamsEx4 {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("Distinct values");
        Arrays.stream(arr)
                .distinct()
                .forEach(System.out::println);

        System.out.println("Distinct values > 2");
        Arrays.stream(arr)
                .distinct()
                .filter(x -> x > 2) // return true predicate
                .forEach(System.out::println);

        System.out.println("Distinct values > 2 and their squares");
        Arrays.stream(arr)
                .distinct()
                .filter(x -> x > 2) // return true predicate
                .map(x -> x * x)
                .forEach(System.out::println);


    }
}
