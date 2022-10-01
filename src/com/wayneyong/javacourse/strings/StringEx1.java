package com.wayneyong.javacourse.strings;

/**
 * String -
 * - String objects are immutable
 * - Because they are immutable, objects with same value can be shared
 * - Use StringBuilder
 * - when you are constructing a string content dynamically
 * <p>
 * -equals()
 * -equalsIgnoreCase()
 * -compareTo()
 * -compareToIgnoreCase()
 */

public class StringEx1 {
    public static void main(String[] args) {
        //cannot modify an object once initialised
        String s = "abc";
        s = s + "xyz";
        System.out.println(s);

        //same object reference, won't cause any problem
        String s1 = "pqr";
        String s2 = "pqr";
        String s3 = new String("pqr"); //creating a different object

        if (s1 == s3) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        StringBuilder sb = new StringBuilder("my first string ");
        sb.append("my second string ");
        sb.append("my third string ");
        String str = sb.toString();
        System.out.println(str);

        String str1 = "abc";
        String str2 = "ABC";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        if (str1.compareTo(str2) > 0) {
            System.out.println("str1 > str2");
        } else if (str1.compareTo(str2) < 0) {
            System.out.println("str1 < str2");
        } else {
            System.out.println("str1 = str2");
        }
    }
}

