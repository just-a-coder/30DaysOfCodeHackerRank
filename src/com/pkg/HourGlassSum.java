package com.pkg;

public class HourGlassSum {
    public static void main(String[] args) {
        int arr[][] = new int[][]{
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 9, 2, -4, -4, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, -1, -2, -4, 0}
        };
        int result = findMaxHourGlassSum(arr);
        System.out.println(result);
    }

    public static int findMaxHourGlassSum(int arr[][]) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = 0;
                boolean flag = false;
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        if (!flag) {
                            sum = sum + arr[k][l];
                        } else {
                            if (k == i + 1 && l == j+1) {
                                sum = sum + arr[k][l];
                            }
                        }
                    }
                    if (!flag)
                        flag = true;
                    else
                        flag = false;
                }
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }
}
