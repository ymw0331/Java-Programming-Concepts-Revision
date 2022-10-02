package com.wayneyong.javacourse.streams;

import java.util.Arrays;

/**
 * Intermediate Operations -
 * Sorting streams -
 * - sorted(Comparator) - returns a stream which elements sorted based on an comparator.
 * - sorted() - return stream sorted using natual order
 */

public class StreamsEx7 {
    public static void main(String[] args) {
        String arr[] = {"ab", "a", "xy", "bc"};

        System.out.println("sorting using natural order");
        Arrays.stream(arr)
                .sorted()
                .forEach(System.out::println);

        System.out.println("sorting using comparator order");
        Arrays.stream(arr)
                .sorted((x, y) -> -1 * x.compareTo(y)) //flipping it (reverse)
                .forEach(System.out::println);

    }
}
