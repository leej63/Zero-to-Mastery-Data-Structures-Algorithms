/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.sorting.quick_sort;

import java.util.Arrays;

/**
 *
 * @author jonat
 */
public class QuickSort {
    public static int[] quickSort(int[] arr, int low, int high) {
        if(low < high) {
            int pIndex = partition(arr, low, high);
            
            quickSort(arr, low, pIndex - 1);
            quickSort(arr, pIndex + 1, high);
        }
        return arr;
    }
    
    // Time complexity: O(n^2)
    // Space complexity: O(log N)
    
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        
        for(int j = low; j < high; j++) {
            if(arr[j] <= pivot) {
                i++;
                
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1;
    }
    
    public static void main(String[] args) {
        int[] numbers = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        System.out.println(Arrays.toString(quickSort(numbers, 0, numbers.length -1)));
    }
}
