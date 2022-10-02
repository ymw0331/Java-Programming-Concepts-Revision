package com.wayneyong.javacourse.streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Terminal Operations -
 * Terminates the pipeline of operations on the stream.
 * Generate on explicit result or a side effect.
 * <p>
 * findFirst() - finds the first element that matched
 * findAny() - finds any element with out focusing on the order of occurence
 * boolean allMatch(Predicate p)
 * boolean anyMatch(Predicate p)
 * boolean noneMatch(Predicate p)
 * collect(Collector c) - performs a mutable reduction on the stream
 * toArray() - returns an array
 * forEach(Consumer c) - consume the elements of the stream
 */

public class StreamsEx9 {
    public static void main(String[] args) {
        String arr[] = {"ab", "a", "xyz", "bcd"};

        //find the first 3 digit string
        Optional<String> str1 = Stream.of(arr)
                .filter(x -> x.length() == 3)
                .findFirst();

        if (str1.isPresent())
            System.out.println("first 3 char string - " + str1.get());

        //find if all strings are of 3 char length
        boolean result = Stream.of(arr)
                .allMatch(x -> x.length() == 3);

        System.out.println("result - " + result); //false not all string is length of 3


        //collect
        List<String> list = Stream.of(arr)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
