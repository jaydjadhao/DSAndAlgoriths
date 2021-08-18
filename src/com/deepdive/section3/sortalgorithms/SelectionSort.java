package com.deepdive.section3.sortalgorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int[] intArray = {20,35,-15,7,55,1,-22};
        System.out.println("Array Before Sort : ");
        display(intArray);
        sort(intArray);
        System.out.println("Array After Sort : ");
        display(intArray);

    }
    public static void sort(int[] arr){
        for (int lastUnSortedIndex = arr.length-1  ; lastUnSortedIndex > 0 ; lastUnSortedIndex --) {
            int largest = 0;

            for (int i = 1 ; i <= lastUnSortedIndex; i++) {
                if(arr[i] > arr[largest]) largest = i;
            }

            swap(arr,largest,lastUnSortedIndex);
        }
    }

    public static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j  ){
        if (i==j) return;
        int temp = 0;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
