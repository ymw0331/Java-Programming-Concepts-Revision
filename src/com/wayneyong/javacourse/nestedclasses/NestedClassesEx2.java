package com.wayneyong.javacourse.nestedclasses;

import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

import java.util.Iterator;

class MyArray implements Iterable<Integer> {
    private Integer arr[];
    private int size;
    private int curPos; // -1, 0, 1

    public MyArray(int size) {
        this.size = size;
        arr = new Integer[size];
        curPos = -1;
    }

    public void add(Integer value) {
        if (curPos < size - 1) {
            arr[++curPos] = value;
        } else {
            throw new ArrayIndexOutOfBoundsException("out of bounds at indes " + curPos);
        }
    }

    public void print() {
        for (int i = 0; i <= curPos; i++) {
            System.out.println(arr[i]);
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyArrayIterator();
    }

    //inner class
    class MyArrayIterator implements Iterator<Integer> {

        private int pos = 0;

        @Override
        public boolean hasNext() {
            return pos <= curPos;
        }

        @Override
        public Integer next() {
            return arr[pos++];
        }
    }
}

public class NestedClassesEx2 {
    public static void main(String[] args) {
        MyArray obj = new MyArray(5);
        obj.add(10);
        obj.add(20);
        obj.print();

//        for (Integer value : obj) {
//            System.out.println(value);
//        }

        Iterator<Integer> itr = obj.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
