package com.deepdive.section3.sortalgorithms;

public class ShellSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("Array Before Sort : ");
        display(intArray);
        for (int gap = intArray.length / 2; gap > 0; gap /= 2)
            sort(intArray,gap);
        System.out.println("Array After Sort : ");
        display(intArray);

    }

    public static void sort(int[] arr, int gap) {
        for (int firstUnSortedIndex = gap; firstUnSortedIndex < arr.length; firstUnSortedIndex++) {
            int newElement = arr[firstUnSortedIndex];

            int i;
            for (i = firstUnSortedIndex; i >= gap && arr[i - gap] > newElement; i-=gap) {
                arr[i] = arr[i - gap];
            }
            arr[i] = newElement;
        }
    }

    public static void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
