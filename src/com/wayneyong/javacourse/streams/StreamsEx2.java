package com.wayneyong.javacourse.streams;

import javafx.scene.shape.Path;

import java.nio.file.Files;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Stream Sources -
 * Collection -
 * stream()
 * - sequential stream of elements in a collection
 * <p>
 * Arrays -
 * stream()
 * - sequential stream of elements of an array
 * <p>
 * Files class -
 * lines()
 * - A stream of lines from the given file
 * <p>
 * Static methods of the Stream class-
 * <p>
 * concat(Stream, Stream) - for concatenated streams
 * of(T.... values) - values to stream.
 */

public class StreamsEx2 {
    public static void main(String[] args) throws Exception {

        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("ab");
        list.add("c");

        list.stream()
                .forEach(System.out::println);


//        Files.lines(Path.of("D:/Users/ymw03/Desktop/JavaDemo/desc1.txt"))
//                .forEach(System.out::println);

    }
}
