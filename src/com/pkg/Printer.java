package com.pkg;

class Printer <T> {

    // Write your code here
    public void printArray( T arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

class Solution {
    public static void main(String[] args) {
        Integer intArray[] = new Integer[]{3,2,1,4};
        String stringArray[] = new String[]{"hello","world","pluto"};
        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> stringPrinter = new Printer<String>();
        intPrinter.printArray( intArray  );
        stringPrinter.printArray( stringArray );
    }

}
