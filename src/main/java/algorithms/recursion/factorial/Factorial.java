/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.recursion.factorial;

/**
 *
 * @author jonat
 */
public class Factorial {
    // Factorial: 5! = 5 * 4 * 3 * 2 * 1
    
    public static int findFactorialRecursive(int number) {
        if(number == 1) {
            return 1;
        }
        return number * findFactorialRecursive(number - 1);
    }
    
    public static int findFactorialIterative(int number) {
        int answer = 1;
//        if(number == 1) {
//            answer = 1;
//        }
        for(int i = 2; i <= number; i++) {
            answer *= i;
        }
        return answer;
    }
    
    public static void main(String[] args) {
//        System.out.println(findFactorialIterative(1));
        System.out.println(findFactorialRecursive(2));
    }
}
