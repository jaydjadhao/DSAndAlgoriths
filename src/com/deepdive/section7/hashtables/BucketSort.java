package com.deepdive.section7.hashtables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {
    public static void main(String[] args) {
        int[] intArray = {54,46,83,66,95,92,43};
        System.out.println("Array Before Sort : ");
        display(intArray);
        sort(intArray);
        System.out.println("Array After Sort : ");
        display(intArray);
    }

    private static void sort(int[] input) {
        List<Integer>[] buckets = new List[10];
        //scattering Phase
        for (int i = 0; i < input.length; i++) {
            int hashedKey = hash(input[i]);
            if(buckets[hashedKey] == null) {
                buckets[hashedKey] = new ArrayList<Integer>();
            }
            buckets[hashedKey].add(input[i]);
        }

        //sorting phase
        for (List bucket: buckets){
            if (bucket != null) {
                Collections.sort(bucket);
            }
        }

        //Gathering phase
        int j=0;
        for (int i = 0; i < buckets.length; i++) {
            if (buckets[i] !=null){
                for (int item : buckets[i]){
                    input[j++] = item;
                }
            }
        }
    }

    private static int hash(int value) {
        return value/(int) 10;
    }

    public static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
