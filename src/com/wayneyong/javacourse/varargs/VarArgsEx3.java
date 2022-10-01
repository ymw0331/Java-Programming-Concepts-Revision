package com.wayneyong.javacourse.varargs;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class VarArgsEx3 {
    public static void main(String[] args) {
        //translate a simple array into a collection of values
        Collection<String> col1 = MyCollection.of("a", "B", "cd");
        System.out.println(col1);

        Collection<Integer> col2 = MyCollection.of(10, 20, 3, 4);
        System.out.println(col2);

        List<Integer> ints = Arrays.asList(10, 20, 30, 40);
        System.out.println(ints);
    }
}

class MyCollection {
    //any type of values will return a collection of type
    public static <T> Collection<T> of(T... values) {
        Collection<T> col = new ArrayList<>();
        for (T value : values) {
            col.add(value);
        }
        return col;
    }
}