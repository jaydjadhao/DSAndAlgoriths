package com.deepdive.section8.searchalgorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] intArray = {-22,-15,1,7,20, 35, 55 };
        System.out.println(search(intArray,-15, false));
        System.out.println(search(intArray,55, false));
        System.out.println(search(intArray,888, false));
        System.out.println(search(intArray,-22, false));

        System.out.println(search(intArray,-15, true));
        System.out.println(search(intArray,55, true));
        System.out.println(search(intArray,888, true));
        System.out.println(search(intArray,-22, true));
    }

    private static int search(int[] input, int val, boolean isRecursive) {
        if(isRecursive){
            return recursiveBinarySearch(input,val,0,input.length);
        }else {
            return iterativeBinarySearch(input,val);
        }
    }
    // 0, 1,  2, 3,4, 5, 6
    //{20,35,-15,7,55,1,-22}
    private static int iterativeBinarySearch(int[] input, int val) {
        int start = 0;
        int end = input.length;
        while (start < end){
            int mid = (start + end) / 2;
            //System.out.println(" start = " + start + " end  = " + end+ " Mid = " + mid);
            if (input[mid] == val){
                return mid;
            } else if(input[mid] < val){
                start = mid +1;
            } else{
                end = mid;
            }
        }
        return -1;
    }

    private static int recursiveBinarySearch(int[] input, int val, int start, int end) {
        // Base Case
        if(start >= end) return -1;
        int mid = (start + end) /2;
        if (input[mid] == val) return mid;
        else if(input[mid] < val) start = mid +1;
        else end = mid;
        return recursiveBinarySearch(input,val,start,end);
    }
}
