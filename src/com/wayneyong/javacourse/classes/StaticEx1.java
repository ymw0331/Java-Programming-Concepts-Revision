package com.wayneyong.javacourse.classes;

/**
 * Static members -
 *    - Shared by all the objects of the class
 *    - No need for object
 *    - static .... can only access .... other static members directly
 */

class Student {

    //static members - they belong to class
    //class member
    private static String board;
    public static void writeToBoard(String s){
        board = s;
//        note = "my note";
    }

    //non-static -related to objet (student)
    private String note;
    public void writeNote(String s){
        note = s;
    }

    public void print(){
        System.out.println("Content on the board");
        System.out.println("My notes - " + note);
    }
}


public class StaticEx1 {
    public static void main(String[] args) {

        Student.writeToBoard("written to board");

        Student s1, s2;
        s1 = new Student();
        s2 = new Student();

        s1.writeNote("written by s1");
        s1.writeNote("abc");

        s2.writeNote("written by s2");
        s2.writeNote("xyz");

        s1.print();
        s2.print();

    }
}
