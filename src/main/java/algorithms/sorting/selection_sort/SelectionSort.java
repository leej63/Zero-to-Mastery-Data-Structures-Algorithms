/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.sorting.selection_sort;

import java.util.Arrays;

/**
 *
 * @author jonat
 */
public class SelectionSort {
    public static int[] selectionSort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            // set current idx as minimum
            int min = i;
            for(int j = i + 1; j < array.length; j++) {
                if(array[j] < array[min]) {
                    // update minimum if current is lower than what we had previously
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        return array;
    }
    // Time complexity: O(n^2) - Quadratic time
    // Space complexity: O(1) - Constant
    
    public static void main(String[] args) {
        int[] numbers = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        System.out.println(Arrays.toString(selectionSort(numbers)));
    }
}
