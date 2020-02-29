package com.pkg;

public class LoopTable {
    public static void main(String[] args) {
        int n = 8;
        printMulTable(n);
    }

    private static void printMulTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
}
