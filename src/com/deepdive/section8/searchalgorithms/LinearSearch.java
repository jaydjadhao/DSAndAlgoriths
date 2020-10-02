package com.deepdive.section8.searchalgorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] intArray = {20,35,-15,7,55,1,-22};
        System.out.println(search(intArray,-15));
        System.out.println(search(intArray,55));
        System.out.println(search(intArray,888));
        System.out.println(search(intArray,-22));


    }

    private static int search(int[] input, int val) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == val) return i;
        }
        return -1;
    }
}
