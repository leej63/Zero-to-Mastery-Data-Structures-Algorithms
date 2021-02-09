/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.sorting.merge_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author jonat
 */
public class MergeSort {
    public static List<Integer> mergeSort(List<Integer> array) {
        if(array.size() == 1) return array;
        
        int length = array.size();
        int middle = array.size() / 2;
        List<Integer> left = array.subList(0, middle);
        List<Integer> right = array.subList(middle, length);
        
        return merge(mergeSort(left), mergeSort(right));
    }
    
    // Time complexity: O(n log n)
    // Space complexity: O(n)
    
    public static List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> result = new ArrayList<>();
        int leftIndex = 0;
        int rightIndex = 0;
        
        while(leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex) < right.get(rightIndex)) {
                result.add(left.get(leftIndex));
                leftIndex++;
            } else {
                result.add(right.get(rightIndex));
                rightIndex++;
            }
        }
        List<Integer> leftRemaining = left.subList(leftIndex, left.size());
        List<Integer> rightRemaining = right.subList(rightIndex, right.size());
        
        result.addAll(leftRemaining);
        result.addAll(rightRemaining);
        
        return result;
    }
    
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0));
        System.out.println(mergeSort(numbers));
    }
}
