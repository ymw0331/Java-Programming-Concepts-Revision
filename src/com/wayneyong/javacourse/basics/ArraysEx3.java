package com.wayneyong.javacourse.basics;

import java.util.Scanner;

public class ArraysEx3 {

    /**
     * return index if found, otherwise -1,
     **/
    static int search(int arr[], int searchEle) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchEle) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 10, 20};
        int searchEle;
        Scanner scan = new Scanner(System.in);
        System.out.println("Array is {10, 20, 30, 40, 10, 20}");
        System.out.println("Enter element to search:");
        searchEle = scan.nextInt();

        int index = search(arr, searchEle);

        if(index!= -1){
            System.out.println("Found at index : "+ index);
        }
        else {
            System.out.println("Not found");
        }
    }
}
