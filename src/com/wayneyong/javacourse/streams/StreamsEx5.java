package com.wayneyong.javacourse.streams;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Intermediate Operations-
 * <p>
 * Filtering and Mapping -
 * distinct() - return a stream with no duplicates.
 * filter(Predicate) - returns a stream of elements which only those elements for which the predicate returns true
 * map(Function) - returns a stream where the given function is applied on each element of the input stream
 * mapToInt(), mapToDouble(), mapToLong() - produces the streams of primitive not objects.
 * <p>
 * Map and FlatMaps
 * map() - 1 to 1 mapping
 * [[1], [2,3,4], [5,6]]
 * <p>
 * flatMap() - 1 to N mapping
 * [1,2,3,4,5,6]
 */

public class StreamsEx5 {
    public static void main(String[] args) {
        String arr[] = {"this", "this is", "a test sentece"};

        System.out.println("Using map()"); //individual array
        Stream.of(arr)
                .map(x -> x.split(" "))
                .forEach(x -> System.out.println(Arrays.toString(x)));

        System.out.println("Using flatmap()");
        Stream.of(arr)
                .flatMap(x -> Stream.of(x.split(" ")))
                .forEach(x -> System.out.println(x));

    }
}
