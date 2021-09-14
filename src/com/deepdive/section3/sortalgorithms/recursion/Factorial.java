package com.deepdive.section3.sortalgorithms.recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(iterativeFact(4));
        System.out.println(recursionFact(4));

    }
    public static int iterativeFact(int num){
        if (num == 0) return  1;
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
    public static int recursionFact(int num){
        return (num == 0) ? 1: num * recursionFact(num - 1);
    }
}
