package com.wayneyong.javacourse.overloading;

class SearchUtil {
    //return the index if found otherwise -1
    public static int search(int arr[], int ele) {

        return search(arr, 0, ele);
    }

    //overload the same definition with diff meaning
    public static int search(int arr[], int pos, int ele) {
        for (int i = pos; i < arr.length; i++)
            if (arr[i] == ele) {
                return i;
            }
        return -1;
    }
}

public class OverloadingEx2 {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 20, 10, 20, 40};
        int searchEle = 20;
        int index = -1;

        do {
            index = SearchUtil.search(arr, index + 1, searchEle);
            if (index != -1) {
                System.out.println("found at " + index);

            }
        } while (index != -1);
    }
}
