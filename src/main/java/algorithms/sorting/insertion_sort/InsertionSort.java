/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.sorting.insertion_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author jonat
 */
public class InsertionSort {
    public static List<Integer> insertionSort(List<Integer> array) {
        for(int i = 0; i < array.size(); i++) {
            if(array.get(i) <= array.get(0)) {
                // if number is less than 1st number, then move it to the start of array
                array.add(0, array.remove(i));
            } else {
                // else check where should the number be placed and move it
                if(array.get(i) < array.get(i - 1)) {
                    for(int j = 1; j < i; j++) {
                        if(array.get(i) < array.get(j)) {
                            array.add(j, array.remove(i));
                            // end inner loop after element moved
                            break;
                        }
                    }
                }
            }
        }
        return array;
    }
    // Time complexity: O(?)
    // Space complexity: O(?)
    
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0));
        System.out.println(insertionSort(numbers));
    }
}
