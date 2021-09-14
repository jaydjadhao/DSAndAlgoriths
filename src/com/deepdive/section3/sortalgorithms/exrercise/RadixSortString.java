package com.deepdive.section3.sortalgorithms.exrercise;

public class RadixSortString {
    public static void main(String[] args) {
        // Array to sort
       // String[] strArray = {"bcdef","dbaqc","abcde","omadd","bbbbb"};
        String[] strArray = {"monali","ankush","sachin","samata","johnam"};

        // Show the Array before Sort
        System.out.print("Array Before Sort : ");
        display(strArray);
        // sort the Array
        radixSort(strArray, 6, 26);
        //Show the Array after sort
        System.out.print("Array After Sort  : ");
        display(strArray);
    }

    public static void radixSort(String[] input, int size, int radix) {
        for (int i = 0; i < size; i++) {
            singleRadixSort(input, i , radix);
        }
    }

    public static void singleRadixSort(String[] input, int position, int radix) {
        int numItems = input.length;
        //Create CounterArray
        int[] countArray = new int[radix];
        for (String elem : input) {
            countArray[getIndex(elem, position)]++;
        }
        //adjust the Counting Array
        for (int i = 1; i < radix; i++) {
            countArray[i] += countArray[i-1];
        }

        //Create temp array and copy elements according to the exact position
        String[] tempArray = new String[numItems];
        for (int k = numItems - 1 ; k >= 0; k--) {
           tempArray[--countArray[getIndex(input[k],position)]] = input[k];
        }

        // Copy elements to the input Array
        System.arraycopy(tempArray,0,input,0,numItems);
        System.out.print("Position of element in Iteration : " + position + " : ");
        display(input);
        System.out.println("====================================================");

    }

    private static int getIndex(String elem, int position) {
        return elem.charAt(elem.length()-1-position) - 'a';
    }

    public static void display(String[] input) {
        for (String elem : input) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}
