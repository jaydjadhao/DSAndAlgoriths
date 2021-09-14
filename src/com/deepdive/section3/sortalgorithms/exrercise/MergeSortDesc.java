package com.deepdive.section3.sortalgorithms.exrercise;

public class MergeSortDesc {
    public static void main(String[] args) {
        // Array to sort
        int[] intArray = {20,35,-15,7,55,1,-22};
        // Show the Array before Sort
        System.out.print("Array Before Sort : ");
        display(intArray);
        // sort the Array
        mergeSortDesc(intArray,0,intArray.length);
        //Show the Array after sort
        System.out.print("Array After Sort  : ");
        display(intArray);
    }

    private static void mergeSortDesc(int[] input, int start, int end) {
        // Writing this method as recursion required Base Condition
        if(end-start < 2) return;

        //Get mid for partition process
        int mid = (end + start) /2;

        // Recursively call to mergeSortDesc() method
        mergeSortDesc(input,start,mid);
        mergeSortDesc(input,mid,end);
        merge(input,start,mid,end);

    }

    private static void merge(int[] input, int start, int mid, int end) {
        // for optimization check Array is already sorted
        if(input[mid - 1] > input[mid]) return;

        // Create the temp array and copy elements in sorting order
        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] tempArray = new int[start + end];

        while (i < mid && j < end){
            tempArray[tempIndex++] = input[i] >= input[j] ?input[i++]:input[j++];
        }
        // if any elements remains in left Array, Copy directly to the input Array
        System.arraycopy(input,i,input,start+tempIndex,mid-i);
        // copy elements from temp array to input array
        System.arraycopy(tempArray,0,input,start,tempIndex);
    }

    private static void display(int[] input) {
        for (int elem : input){
            System.out.print(elem + " ");
        }
        System.out.println();
    }

}
