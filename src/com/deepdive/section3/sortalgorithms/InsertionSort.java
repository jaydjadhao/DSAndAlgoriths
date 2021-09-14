package com.deepdive.section3.sortalgorithms;

import java.util.Collections;

public class InsertionSort {
    public static void main(String[] args) {
        int[] intArray = {20,35,-15,7,55,1,-22};
        System.out.println("Array Before Sort : ");
        display(intArray);
        sort(intArray);
        System.out.println("Array After Sort : ");
        display(intArray);

    }
    public static void sort(int[] arr){
        for (int firstUnSortedIndex = 1 ; firstUnSortedIndex < arr.length ; firstUnSortedIndex++) {
            int newElement = arr[firstUnSortedIndex];
            int i;
            for (i = firstUnSortedIndex ; i > 0 && arr[i-1] > newElement; i--) {
                arr[i] = arr[i-1];
            }
            arr[i] = newElement;
        }
    }

    public static void display(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
