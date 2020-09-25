package com.deepdive.section3.sortalgorithms.exrercise;

public class InsertionSortRec {
    public static void main(String[] args) {
        // Array to sort
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        // Show the Array before Sort
        System.out.print("Array Before Sort : ");
        display(intArray);
        // sort the Array
        insertionSortRec(intArray, intArray.length);
        //Show the Array after sort
        System.out.print("Array After Sort  : ");
        display(intArray);
    }

    private static void insertionSortRec(int[] input, int length) {
        // Base Condition
        if (length < 2) return;

        // Recursive Call
        insertionSortRec(input, length - 1);

        int newElement = input[length - 1];
        int i;
        for (i = length - 1; i > 0 && input[i - 1] > newElement; i--) {
            input[i] = input[i - 1];
        }
        input[i] = newElement;
    }

    private static void display(int[] input) {
        for (int elem : input) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}
