/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.structural_algorithm.mavenproject1;

import java.util.Iterator;

/**
 *
 * @author ASUS
 */
public class SortAlgorithms {

    public static int[] insertionSort1(int arr[]){
        if (arr.length <= 1) {
            return arr;
        }
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j>0 && arr[j] <= arr[j-1]) {
                int tempt = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = tempt;
                j--;
            }
        }
        return arr;
    }
    
    public static int[] insertionSort2(int arr[]){
        if (arr.length <= 1) {
            return arr;
        }
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while(j>=0 && key <= arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}
