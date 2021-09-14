package com.deepdive.section3.sortalgorithms;

public class QuickSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("Array Before Sort : ");
        display(intArray);
        quickSort(intArray,0,intArray.length);
        System.out.println("Array After Sort : ");
        display(intArray);
    }

    private static void quickSort(int[] input, int start, int end) {
        if(end - start < 2) return;
        int pivotIndex = partition(input,start,end);
        quickSort(input,start,pivotIndex);
        quickSort(input,pivotIndex + 1, end);
    }

    private static int partition(int[] input, int start, int end) {
        //Taking first element as a Pivot Element.
        int pivot = input[start];
        int i = start;
        int j = end;

        // Run the loop to get Pivot element in Correct Position
        while (i < j){
            // NOTE: empty loop body
            while (i < j && input[--j] >= pivot);
            if (i < j) {
                input[i] = input[j];
            }

            // NOTE: empty loop body
            while (i < j && input[++i] <= pivot);
            if (i < j) {
                input[j] = input[i];
            }
        }

        input[j] = pivot;
        return j;
    }

    public static void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
