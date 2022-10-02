package com.wayneyong.javacourse.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Collectors -
 * toList()
 * toSet()
 * toMap(keyMapper,valueMapper)
 * <p>
 * groupingBy(Function)
 * -grouping stream of elements using a function into a Map.
 * <p>
 * groupingBy(Function, Collector)
 * -grouping stream of elements using a function into a Map.
 * -reduction is performed on each using a the downstream collector
 */


public class StreamsEx10 {
    public static void main(String[] args) {

        Stream<Student> studentStream =
                Stream.of(new Student(2, "b", 90),
                        new Student(1, "a", 89),
                        new Student(3, "c", 90));

        //Map<Integer, Student>
//        Map<Integer, Student> studentMap = studentStream
//                .collect(Collectors.toMap(Student::getId, Function.identity()));
//
//        System.out.println(studentMap);

//        //Group students by score
//        Map<Double, List<Student>> studentMap =
//                studentStream.collect(Collectors.groupingBy(Student::getScore));
//        System.out.println(studentMap);

        //Count of students per score
        Map<Double, Long> studentMap = studentStream
                .collect(Collectors.groupingBy(Student::getScore, Collectors.counting()));

        System.out.println(studentMap);
    }
}

class Student {
    private int id;
    private String name;
    private double score;

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
