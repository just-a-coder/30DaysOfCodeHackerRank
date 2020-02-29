package com.pkg;


import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = new int[]{3,2,1,4,5};
        bubbleSorting(arr);
        Arrays.stream(arr).forEach(i-> System.out.print(i+" "));
    }

    public static void bubbleSorting(int a[]) {
        int n = a.length;
        int numberOfSwaps = 0;
        for (int i = 0; i < n; i++) {
            // Track number of elements swapped during a single array traversal

            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    swap(a,j, j+1);
                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
        System.out.println("Array is sorted in "+numberOfSwaps+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[a.length-1]);
    }

    public static void swap(int arr[],int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
