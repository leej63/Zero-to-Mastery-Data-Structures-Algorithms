/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.recursion.fibonacci;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jonat
 */
public class Fibonacci {
    // Given a number N return the index value of the Fibonacci sequence, where the sequence is:
    
    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 ...
    // the pattern of the sequence is that each value is the sum of the 2 previous values, that means that for N = 5 -> 2 + 3
    
    public static int fibonacciIterative(int n) {
        if(n < 2) {
            return n;
        } else {
            int[] arr = {1, 1};
            for (int i = 3; i <= n; i++) {
                int temp = arr[1];
                arr[1] = arr[0] + arr[1];
                arr[0] = temp;
            }
            return arr[1];
        }
    }
    
    public static int fibonacciIterative2(int n) { // O(n) - Linear time
        List<Integer> arr = new ArrayList<>();
            arr.add(0);
            arr.add(1);
        
        for(int i = 2; i < n + 1; i++) {
            arr.add(arr.get(i-2) + arr.get(i-1));
        }
        
        return arr.get(n);
    }
    
    public static int fibonacciRecursive(int n) { // O(2^n) - Exponential time
        if(n < 2) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
    
    public static void main(String[] args) {
        System.out.println(fibonacciIterative(5));
        System.out.println(fibonacciRecursive(5));
        System.out.println(fibonacciIterative2(6));
    }
}
