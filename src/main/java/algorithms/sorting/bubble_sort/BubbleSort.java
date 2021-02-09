/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.sorting.bubble_sort;

import java.util.Arrays;

/**
 *
 * @author jonat
 */
public class BubbleSort {
    public static int[] bubbleSort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length - 1; j++) {
                if(array[j] > array[j + 1]) {
                    // Swap numbers
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
    // Time complexity: O(n^2) - Quadratic time
    // Space complexity: O(1) - Constant
    
    public static void main(String[] args) {
        int[] numbers = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
