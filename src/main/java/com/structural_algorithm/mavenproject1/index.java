package com.structural_algorithm.mavenproject1;

import java.util.Arrays;

public class index {
    
    public static void main(String[] args) {
        int[] arrSearch = {5,51,24,9,79,28,44,20,15,37};
        System.out.println("Array of search before sort: " + Arrays.toString(arrSearch));
        System.out.println("Array of search after sort: " + Arrays.toString(SortAlgorithms.insertionSort2(arrSearch)));
        System.out.println("Binary Search: value to search: 37");
        Integer[] integerArr = Arrays.stream(arrSearch).boxed().toArray(Integer[]::new);
        int result = SearchAlgorithm.binarySearchPosition(integerArr, 37);
        System.out.println("Position: " + result);
        System.out.println("Insertion Sort 1");
        int[] arr = {6,16,5,28,30,9};
        System.out.println(Arrays.toString(SortAlgorithms.insertionSort2(arr)));
        System.out.println("Insertion Sort 2");
        System.out.println(Arrays.toString(SortAlgorithms.insertionSort2(arr)));
    }
}
