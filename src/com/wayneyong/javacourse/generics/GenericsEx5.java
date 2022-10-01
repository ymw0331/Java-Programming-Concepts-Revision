package com.wayneyong.javacourse.generics;

import java.util.LinkedList;

class StackException1 extends Exception {
}

class RevisedStack<T> {
//    T value = new T();// need to use supplier interface
    private LinkedList<T> list = new LinkedList<>();

    //simulating stack operation (last in first out -> insert at last, remove at first)
    public void push(T ele) {
        list.addFirst(ele);
    }

    public T pop() {
        return list.removeFirst();
    }

}

public class GenericsEx5 {
    public static void main(String[] args) {

        RevisedStack<Integer> s1 = new RevisedStack<>();
        s1.push(10);
        s1.push(20);
        System.out.println(s1.pop());
        System.out.println(s1.pop());

    }
}
