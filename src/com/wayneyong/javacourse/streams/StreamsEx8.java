package com.wayneyong.javacourse.streams;

import java.util.Arrays;
import java.util.Optional;

/***
 * Intermediate Operations -
 *  Observing the elements of a stream -
 *   - peek (Consumer)
 *      - Returns the output stream that is identical to the input stream
 *      - Each element is passed to the accept() method of the consumer
 *      - Useful in debugging
 */

public class StreamsEx8 {
    public static void main(String[] args) {
        String arr[] = {"ab", "abcedf", "xy", "bcd", "abcd"};

        //find the length of the max length string in an array
        Optional<Integer> max = Arrays.stream(arr)
                .peek(x -> System.out.println(x))
                .map(x -> x.length())//returns a int value
                .peek(System.out::println)
                .max((x, y) -> x - y);

        if (max.isPresent()) {
            System.out.println("max value - " + max.get());
        }
    }
}
