package com.wayneyong.javacourse.basics;

/**
 * Looping statement -
 *      while(condition) statement
 *
 *      do  statement  while(condition);
 *
 *      for( expr1; expr2; expr3 ) statement
 */

public class LoopingEx1 {
    public static void main(String[] args) {
        int i =1;
        while ( i<= 10){
            System.out.println("hello!");
            i++;
        }

        i=10;
        do{
            System.out.println("run once");
        }while(i<5);

        for(int x = 1; x <= 10; x ++){
            System.out.println("it is for ....");
        }

        //break and continue
    }
}
