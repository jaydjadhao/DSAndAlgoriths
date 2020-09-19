package com.deepdive.section3.sortalgorithms;

import java.util.stream.IntStream;

import static java.lang.Math.pow;

public class RadixSort {
    public static void main(String[] args) {

        int[] intArray = {2448,9897,1210,3462,2112,5464};
        System.out.println("Array Before Swap : ");
        display(intArray);
        radixSort(intArray,4, 10);
        System.out.println("Array After Swap : ");
        display(intArray);

    }

    private static void radixSort(int[] intArray, int width, int radix) {
        for (int i = 0; i < width; i++) {
            singleRadixSort(intArray, i, radix);
        }
    }

    private static void singleRadixSort(int[] intArray, int position, int radix) {
        int n = intArray.length;

        // Count Array creation
        int[] countArray= new int[radix];
        for (int elem:intArray) {
            countArray[getDigit(elem,position,radix)]++;
        }

        //steps for stable counting sort
        //adjust count array
        for (int i = 1; i < countArray.length; i++) {
            countArray[i] += countArray[i-1];
        }

        //create temp array
        int[] temp = new int[n];
        for (int k = n-1; k >=0 ; k--) {
            temp[--countArray[getDigit(intArray[k],position,radix)]] = intArray[k];
        }
        //copy elements from temp array to original array
        IntStream.range(0, n).forEach(i -> intArray[i] = temp[i]);

    }

    private static int getDigit(int elem, int position, int radix) {
        return elem/(int) pow(radix,position)%radix;
    }

    public static void display(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
