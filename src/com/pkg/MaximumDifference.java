package com.pkg;

class Difference {
    public static void main(String[] args) {
        int arr[] = new int[]{8, 19, 3, 2, 7};
        System.out.println(computeDifference(arr));
    }


    // Add your code here
    public static int computeDifference(int elements[]) {
        int maxDifference = 0;

        for (int i = 0; i < elements.length - 1; i++) {
            int diff = 0;
            for (int j = 0; j < elements.length; j++) {
                diff = Math.abs(elements[i] - elements[j]);
                if (diff > maxDifference) {
                    maxDifference = diff;
                }
            }


        }
        return maxDifference;
    }

}
