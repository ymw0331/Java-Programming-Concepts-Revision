package com.wayneyong.javacourse.exercise;

import java.util.Optional;

/**
 * Wrapper Types (Object type in Java)-
 * byte, char, int, long, float, double, boolean
 * Byte, Character, Integer, Long, Float, Double, Boolean
 * <p>
 * Autoboxing -
 * Automatic conversion of primitive to corresponding wrapper type
 * e.g. Integer a = 10; ==> Integer a = new Integer(10);
 * <p>
 * Auto-unboxing -
 * Automatic unboxing of wrapper type to corresponding
 * primitive type.
 * e.g. Integer a = new Integer(10);
 * int x = a;  ==> int x = a.intValue();
 */

class StackException extends Exception {
    public StackException(String reason) {
        super(reason);
    }
}

class Stack {
    private Integer arr[];
    private int top;
    private int limit;

    private static final int DEFAULT_LIMIT = 5;

    public Stack() {
        initialize(DEFAULT_LIMIT);
    }

    public Stack(int size) {
        initialize(size);
    }

    private void initialize(int size) {
        arr = new Integer[size];
        top = -1;
        limit = size;
    }

    public void push(Integer ele) throws StackException {
        if (top < limit - 1) {
            arr[++top] = ele;
        } else {
            //failed
            throw new StackException("overflow");
        }
    }

    public Integer pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("empty"); //below the stack
        }
        return arr[top--];
    }

    public Optional<Integer> peek() { //return top most value without popping
        if (isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(arr[top]);
        //return optional better than null pointer exception
    }

    public boolean isEmpty() {
        return top == -1;
    }
}


public class StackProblem {
    public static void main(String[] args) throws StackException {
        Stack stk = new Stack(3);
        stk.push(10);
        stk.push(20);
        stk.push(30);
//        stk.push(40); //accessing index not existing in array

        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
//        System.out.println(stk.pop());

        stk.push(25);
        Optional peekValue = stk.peek();
        if (peekValue.isPresent()) {
            System.out.println(peekValue.get()); //25
        }
        System.out.println(stk.peek());
        System.out.println(stk.pop());
    }
}
