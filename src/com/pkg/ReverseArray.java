package com.pkg;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5};
        revArray(arr, 0);
        //Arrays.stream(arr).forEach(i-> System.out.print(i+" "));
    }

    private static void revArray(int[] arr, int index) {
        if (index == arr.length) {
            return ;
        } else {
            revArray(arr, index+1);
            System.out.print(arr[index]+" ");
        }
    }
}
