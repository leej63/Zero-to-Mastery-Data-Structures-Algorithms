/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamic_programming.memoization;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jonat
 */
public class Memoization {
    public static int addTo80(int n) {
        System.out.println("long time");
        return n + 80;
    }
    
    public static int memoizeAddTo80(int n) {
        Map<Integer, Integer> cache = new HashMap<>();
        // once cached it won't have to add every time the function is called
        if(!cache.containsKey(n)) {
            System.out.println("long time");
            cache.put(n, n + 80);
        }
        return cache.get(n);
    }
    
    public static void main(String[] args) {
        System.out.println("addTo80: " + addTo80(5));
        System.out.println("addTo80: " + addTo80(5));
        
        System.out.println("memoizeAddTo80: " + memoizeAddTo80(5));
        System.out.println("memoizeAddTo80: " + memoizeAddTo80(5));
        System.out.println("memoizeAddTo80: " + memoizeAddTo80(5));
    }
}
