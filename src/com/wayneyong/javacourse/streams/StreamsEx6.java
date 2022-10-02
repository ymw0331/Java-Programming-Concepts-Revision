package com.wayneyong.javacourse.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Intermediate Operations -
 * Restricting the size of the stream
 * skip(long n) - skips the first n elements of the steam.
 * <p>
 * limit(long n) - returns the stream that contains only the first n elements of the stream
 */

public class StreamsEx6 {
    public static void main(String[] args) {
        String arr[] = {"this", "is", "sample", "string", "with", "simple", "text"};

        String str = Stream.of(arr)
                .skip(2) //skip first 2 ele
                .limit(2) // limit to only 2 strings
                .collect(Collectors.joining(",")); //concat all string ele into single ele

        System.out.println(str);
    }
}
