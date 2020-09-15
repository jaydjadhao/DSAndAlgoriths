package com.deepdive.section3.sortalgorithms;

public class CountingSort {
    public static void main(String[] args) {

        int[] intArray = {8,7,10,2,2,4,6,9,5,7};
        System.out.println("Array Before Swap : ");
        display(intArray);
        countingSort(intArray, 1, 10);
        System.out.println("Array After Swap : ");
        display(intArray);

    }

//    intArray = {8,7,10,2,2,4,6,9,5,7};
    private static void countingSort(int[] input, int min, int max) {
        int[] countArray = new int[(max-min)+1];


        //reload the Count Array
        for (int i = 0 ; i < input.length; i++) {
            countArray[input[i]-min]++;
        }

        //Sort the Array by Count Array
        int j=0;
        for (int i = min; i <= max; i++) {
            while (countArray[i-min] > 0){
                input[j++]=i;
                countArray[i-min]--;
            }
        }
    }

    public static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
