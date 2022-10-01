package com.wayneyong.javacourse.classes;

import sun.security.util.ArrayUtil;

/**
 * Static members - Use case.
 * Sometimes it is good to avoid object creation and declare the methods as static
 * so that the members are accessible directly using the classname with out the
 * need for object creation (or) instantiation.
 * Ideal for utilities.
 * Note - But it's not always the case.
 */

class ArrayUtils {
    /*
     * Return the index of the ele if it is found, otherwise -1.
     * @param arr
     * @param ele
     * @return
     * */
    public static int search(int arr[], int ele) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                return i;
            }
        }
        return -1;
    }

}

public class StaticEx2 {
    public static void main(String[] args) {

        int a[] = {10, 20, 30, 40};
        int searhEle = 30;
        //Static method, use in class without instantiate is
        //good to be used in Util class
        int index = ArrayUtils.search(a, searhEle);
        if (index != -1) {
            System.out.println("found at " + index);
        } else {
            System.out.println("not found");
    }
    }
}
