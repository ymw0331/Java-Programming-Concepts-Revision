package com.wayneyong.javacourse.lambda;

import java.util.Arrays;
import java.util.Comparator;

//Method references
public class LambdaEx3 {
    public static void main(String[] args) {
        String arr[] = {"abc", "cb", "ac", "ABC"};
//        Arrays.sort(arr);
//        Separate class
//        Arrays.sort(arr, new DescComparator());

        //Anonymous implementation
//        Arrays.sort(arr, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return -1 * o1.compareTo(o2);
//            }
//        });

        //Lambda
//        Arrays.sort(arr, (o1, o2) -> -1 * o1.compareTo(o2));

        Arrays.sort(arr, (o1, o2) -> o1.compareToIgnoreCase(o2));
        //Lambda - method reference
//        Arrays.sort(arr, String::compareToIgnoreCase);

        System.out.println(Arrays.toString(arr));

    }
}

//Complete implementation of comparator
class DescComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return -1 * o1.compareTo(o2);
    }
}