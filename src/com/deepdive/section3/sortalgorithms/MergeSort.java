package com.deepdive.section3.sortalgorithms;

public class MergeSort {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("Array Before Swap : ");
        display(intArray);
        mergeSort(intArray,0,intArray.length);
        System.out.println("Array After Swap : ");
        display(intArray);
    }

    private static void mergeSort(int[] input, int start, int end) {
        //base condition
        if(end - start < 2) return;

        // For partition get Mid and do the recursive call to mergeSort()
        int mid = (start + end) / 2;
        //left partition
        mergeSort(input,start,mid);
        //right partition
        mergeSort(input,mid,end);
        //merge the elements
        merge(input,start,mid,end);
    }

    //{20, 35, -15, 7, 55, 1, -22}
    private static void merge(int[] input, int start, int mid, int end) {
        //check both partitions are already sorted
        if(input[mid-1] < input[mid]) return;

        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] tempArr = new int[end - start];
        // Copy elements to the temp Array
        while (i < mid && j < end){
            tempArr[tempIndex++] = input[i] <= input[j]?input[i++]:input[j++];
        }
        // for element in left array, Copy it directly to the main array
        System.arraycopy(input,i,input,start + tempIndex,mid -i);
        // Copy Temp array to main Array
        System.arraycopy(tempArr,0,input,start,tempIndex);
    }

    public static void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
