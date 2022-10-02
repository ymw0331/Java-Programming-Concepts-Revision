package com.wayneyong.javacourse.designpattern;

import java.util.Scanner;

/**
 * Template Method Pattern -
 * An abstract super class defines the skeleton of the algorithm leaving certain customizable portions of the algorithms to the subclass to define
 */


abstract class SearchAlgo {
    ///Algoithm
    public int search(int a[], int searchEle) {
        for (int i = 0; i < a.length; i++) {
            //binding search to equality, bond to one single search operation
            if (match(a[i], searchEle)) {
                return i;
            }
        }
        return -1;
    }

    public abstract boolean match(int value, int searchEle);
}

//extends it class algo, but customise functionality

class EqualitySearchAlgo extends SearchAlgo {
    @Override
    public boolean match(int value, int searchEle) {
        return value == searchEle;
    }
}

class InequalitySearchAlgo extends SearchAlgo {
    @Override
    public boolean match(int value, int searchEle) {
        return value != searchEle;
    }
}

public class TemplateMethodPatternDemo {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element to search");
        int searchEle = scanner.nextInt();
        SearchAlgo algo = new InequalitySearchAlgo();
        int index = algo.search(arr, searchEle);
        if (index != -1) {
            System.out.println("found at " + index);
        } else {
            System.out.println("not found");
        }
    }
}
