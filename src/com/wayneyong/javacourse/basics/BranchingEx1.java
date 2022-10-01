package com.wayneyong.javacourse.basics;
/**
 * Branching statements -
 *     1) if (condition)
 *          statement1
 *        else
 *          statement2
 *
 *     2)
 *       switch(expression) {
 *          case value1: statements;
 *                       break;
 *                       ...
 *          default: statements;
 *      }
 */
public class BranchingEx1 {
    public static void main(String[] args) {
        int a = 10, b=20;
        if(a>b){
            System.out.println("a is big");
        }else if (a<b){
            System.out.println("b is big");
        }else {
            System.out.println("a is equal to b");
        }

        int day = 1;
        switch (day) {
            case 1:
                System.out.println("sunday"); break;
            case 2:
                System.out.println("monday"); break;
            default:
                System.out.println("some other day");
        }
    }
}
