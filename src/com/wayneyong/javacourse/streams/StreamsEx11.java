package com.wayneyong.javacourse.streams;

import java.util.Arrays;

/**
 * Folding streams -
 * reduce(BinaryOperator accumulator)
 * reduce(Identity, BinaryOperator accumulator)
 * - Takes a stream and reduces it to a single view
 * - How the reduction works is defined by the accumulator
 * - reduce() method maintains a partial state.
 **/

public class StreamsEx11 {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40};
        //sum of the values of the array
        int sum = Arrays.stream(arr)
                .reduce(0, (oldSum, y) -> {
                    System.out.println("oldSum is " + oldSum + ", y is " + y);
                    return oldSum + y;
                });

        System.out.println(sum);

        //reduce(to combine)
        int product = Arrays.stream(arr)
                .reduce(1, (p, y) -> {
                    System.out.println("p is " + p + ", y is " + y);
                    return p * y;
                });

        System.out.println(product);
    }
}
