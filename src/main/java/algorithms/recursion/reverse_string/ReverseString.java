/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.recursion.reverse_string;

import java.util.Arrays;

/**
 *
 * @author jonat
 */
public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Iterative approach: " + reverseStringIterative("yoyo mastery"));
        System.out.println("Recursive approach: " + reverseStringRecursive("yoyo mastery"));
    }
    
    public static String reverseStringIterative(String str) {
        char[] charArr = str.toCharArray();
        for(int i = 0; i < charArr.length / 2; i++) {
            char temp = charArr[i];
            charArr[i] = charArr[charArr.length - i - 1];
            charArr[charArr.length - i - 1] = temp;
        }
        return new String(charArr);
    }
    
    public static String reverseStringRecursive(String str) {
        if(str.equals("")) {
            return "";
        } else {
            return reverseStringRecursive(str.substring(1)) + str.charAt(0);
        }
    }
}


// Implement a function that reverses a string using iteration... and then recursion!

// Input: str = "yoyo mastery"
// Output: "yretsam oyoy"