package com.wayneyong.javacourse.streams;

import java.util.Arrays;

/**
 * Streams -
 * Enable to define a pipeline of operations to process collections of data.
 * Consists of three main things
 * - Source
 * - Zero of more intermediate operations
 * - Terminal operation - result
 * Pipeline is not evaluated till the terminal operation is invoked.
 * <p>
 * Example -
 * Sum of the squares of all the even numbers of an array.
 * <p>
 * int arr[] = {1,2,3,4,5};
 * int sum = Arrays.stream(arr) //source
 * .filter(x -> x % 2 == 0) //intermediate operation
 * .map(x-> x * x) //intermediate operation
 * .sum(); // terminal operation
 */

public class StreamsEx1 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        // Imperative programming
        // not very descriptive (not parallelized)
//        int sum = 0;
//        for (int value : arr) { // source
//            if (value % 2 == 0) { // filter
//                sum += (value * value); // map
//            }
//        }
//        System.out.println("sum is " + sum);

        //functional approach (lambda involved)
        int sum = Arrays.stream(arr)
//                .parallel()
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .sum();

        System.out.println("Sum is " + sum);

    }
}
