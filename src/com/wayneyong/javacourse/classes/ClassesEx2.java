package com.wayneyong.javacourse.classes;

/**
 * Classes -
 *  class {  data + operations } + data hiding + encapsulation
 */

class PositiveInteger {
    //data
    private int x;
    //operation
    public void set(int value){
        if(value > 0)
            x = value;
    }
    public  int get(){
        return x;
    }
}

public class ClassesEx2 {
    public static void main(String[] args) {

        //reference variable
        PositiveInteger n1;
        //RHS: creating object and assigned its reference to n1
        n1 = new PositiveInteger();

        //reference variable
        PositiveInteger n2;
        //RHS: creating object and assigned its reference to n1
        n2 = new PositiveInteger();

        n1.set(10);
        System.out.println(n1.get());
//        n1.x = -10; //we don't have any control but after set private in them
//        System.out.println(n1.get());

    }
}
