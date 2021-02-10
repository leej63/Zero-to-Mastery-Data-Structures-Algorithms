/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamic_programming.dynamic_fibonacci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author jonat
 */
public class DynamicFibonacci {
    static HashMap<Integer, Integer> cache = new HashMap<>();
    static int operationsCount = 0;
    
    public static int fibonacciMaster(int n) {
        if(cache.containsKey(n)) {
            return cache.get(n);
        } else {
            if(n < 2) {
                return n;
            } else {
                operationsCount++;
                cache.put(n, fibonacciMaster(n - 1) + fibonacciMaster(n - 2));
                return cache.get(n);
            }
        }
    }
    
    public static int fibonacciMaster2(int n) {
        List<Integer> answer = new ArrayList<>(Arrays.asList(0, 1));
        for(int i = 2; i <= n; i++) {
            answer.add(answer.get(i - 2) + answer.get(i - 1));
        }
        return answer.get(n);
    }
    
    public static void main(String[] args) {
//        System.out.println(fibonacciMaster(5));
//        System.out.println(operationsCount);
        
        System.out.println(fibonacciMaster2(6));
    }
}
