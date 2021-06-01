package com.run;

import com.methods.PowerCalculate;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("Kayak"));
        System.out.println(isPalindrome("rafa"));
    }

    public static boolean isPalindrome(final String word){
        final String lowerCase = word.toLowerCase();
        final StringBuffer sb = new StringBuffer(lowerCase);
        return (sb.reverse().toString().equals(lowerCase));
    }
}
