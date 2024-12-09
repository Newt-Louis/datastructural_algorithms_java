/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.structural_algorithm.mavenproject1;

import java.util.Arrays;

/**
 *
 * @author ASUS
 */
public class SearchAlgorithm {
    
    public static <T extends Comparable<T>> Integer binarySearchPosition(T[] arr, T n){
        
        if (arr.length <= 0) {
            return -1;
        }
        
        Arrays.sort(arr);
        
        if (arr[0] instanceof String && n instanceof String) {
            throw new IllegalArgumentException("String type is not allowed in this function");
        }
            
            int left = 0;
            
            int right = arr.length - 1;
            
            while (left <= right) {                
                
                int mid = (left + right) / 2;
                
                if (arr[mid].compareTo(n) == 0) {
                    
                    return mid;
                    
                } else if (arr[mid].compareTo(n) < 0) {
                    
                    left = mid + 1;
                    
                } else {
                    
                    right = mid -1;
                    
                }
                
            }
            
        return -1;
    }
    
}
