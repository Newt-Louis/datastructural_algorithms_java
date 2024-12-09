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
    
    public static <T> Integer binarySearchPosition(T[] arr, T n){
        
        if (arr.length <= 0) {
            return -1;
        }
        
        Arrays.sort(arr);
        
        if (arr[0] instanceof ) {
            
        }
            
            int left = 0;
            
            int right = arr.length - 1;
            
            while (left <= right) {                
                
                int mid = (left + right) / 2;
                
                if (arr[mid] == n) {
                    
                    return mid;
                    
                } else if (arr[mid]<n) {
                    
                    left = mid + 1;
                    
                } else {
                    
                    right = mid -1;
                    
                }
                
                }
            
        return -1;
    }
    
}
