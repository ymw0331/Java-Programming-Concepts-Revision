package com.wayneyong.javacourse.streams;

import java.util.Random;
import java.util.stream.Stream;

/**
 * Stream Sources -
 * Static methods of the Stream class -
 * concat(Stream, Stream) - for concatenated streams
 * of(T... values) - values to stream
 * generate(Supplier) - Infinite stream
 * range(int, int) or rangeClosed(int, int) - range of values (only for IntStream)
 */

public class StreamsEx3 {
    public static void main(String[] args) {

        Stream<String> stream1 = Stream.of("a", "b", "c");
        Stream<String> stream2 = Stream.of("x", "y", "z");

//        Stream.concat(stream1, stream2)
//                .forEach(System.out::println);

        //10 - 19
//        IntStream.range(10, 20)
//                .forEach(System.out::println);

        //10 - 19
//        IntStream.rangeClosed(10, 20)
//                .forEach(System.out::println);

        //infinite string
        Stream.generate(() -> DataGenerator())
                .forEach(System.out::println);

    }

    static int DataGenerator() {
        return new Random().nextInt(); //never end, continue to consume until it end
    }
}
