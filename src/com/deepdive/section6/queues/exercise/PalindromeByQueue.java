package com.deepdive.section6.queues.exercise;

import java.util.LinkedList;

public class PalindromeByQueue {
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat i saw?"));
        System.out.println(checkForPalindrome("I did, did i?"));
        System.out.println(checkForPalindrome("Hello"));
        System.out.println(checkForPalindrome("Don't nod"));
    }

    private static boolean checkForPalindrome(String str) {
        LinkedList<Character> queue = new LinkedList<>();
        LinkedList<Character> stack = new LinkedList<>();

        String lowerCaseStr = str.toLowerCase();
        for (int i = 0; i < lowerCaseStr.length() ; i++) {
            char c = lowerCaseStr.charAt(i);
            if(c >= 'a' && c <= 'z'){
                queue.add(c);
                stack.push(c);
            }
        }

        while (!stack.isEmpty()){
            if (!stack.pop().equals(queue.remove()))
                return false;
        }
        return true;
    }
}
