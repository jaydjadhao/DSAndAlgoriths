package com.deepdive.section7.hashtables.exercise;

public class Challenge1 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        int[] numsToAdd = {59382,43,6894,500,99,-58};

        for (int num : numsToAdd){
            System.out.println(hash(num) + " = " + num);
            nums[hash(num)] = num;
        }

        for (int i = 0 ; i < nums.length ; i++){
            System.out.println("Position " + i + " : " + nums[i]);
        }

    }

    private static int hash(int value) {
        return Math.abs(value%10);
    }
}
