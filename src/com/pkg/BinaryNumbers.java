package com.pkg;

public class BinaryNumbers {
    public static void main(String[] args) {
        int n = 13;
        String binaryNum = recConvertToBinary(n, "");
        int maxNum = maxNumOfConsecutiveOne(binaryNum);
        System.out.println(maxNum);
    }

    public static int maxNumOfConsecutiveOne(String binaryNum) {
        int maxNum = 0;
        int tempMax = 0;
        for (int i = 0; i < binaryNum.length(); i++) {

            if (binaryNum.charAt(i) == '1') {
                tempMax++;
            } else {
                tempMax = 0;
            }

            if (tempMax > maxNum) {
                maxNum = tempMax;
            }
        }
        return maxNum;
    }

    public static String recConvertToBinary(int n, String binary) {
        if (n < 1) {
            return binary;
        } else {
            int rem = n % 2;
            n = n / 2;
            return recConvertToBinary(n, binary) + rem;
        }
    }
}
