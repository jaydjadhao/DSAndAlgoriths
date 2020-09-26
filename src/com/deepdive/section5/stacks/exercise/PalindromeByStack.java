package com.deepdive.section5.stacks.exercise;

import java.util.LinkedList;

public class PalindromeByStack {
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat i saw?"));
        System.out.println(checkForPalindrome("I did, did i?"));
        System.out.println(checkForPalindrome("Hello"));
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String str) {
        StringBuilder noPunctuationStr = new StringBuilder(str.length());
        String lowerCaseStr = str.toLowerCase();

        LinkedList<Character> stack = new LinkedList<>();
        for (int i = 0 ; i<str.length(); i++){
            char c= lowerCaseStr.charAt(i);
            if(c >= 'a' && c <= 'z') {
                noPunctuationStr.append(c);
                stack.push(c);
            }
        }

        StringBuilder reversedStr = new StringBuilder(noPunctuationStr.length());
        while (!stack.isEmpty()){
            reversedStr.append(stack.poll());
        }
        return noPunctuationStr.toString().equals(reversedStr.toString());
    }


}
