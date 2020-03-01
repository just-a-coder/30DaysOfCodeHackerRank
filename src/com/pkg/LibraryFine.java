package com.pkg;

import java.util.Scanner;

public class LibraryFine {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];

        String[] arrItems1 = scanner.nextLine().split(" ");
        String[] arrItems2 = scanner.nextLine().split(" ");

        for (int i = 0; i < 3; i++) {
            int arrItem = Integer.parseInt(arrItems1[i]);
            arr1[i] = arrItem;
        }
        for (int i = 0; i < 3; i++) {
            int arrItem = Integer.parseInt(arrItems2[i]);
            arr2[i] = arrItem;
        }
        int d1 = arr1[0];
        int m1 = arr1[1];
        int y1 = arr1[2];
        int d2 = arr2[0];
        int m2 = arr2[1];
        int y2 = arr2[2];
        int fine = libraryFine(d1,m1,y1,d2,m2,y2);
        System.out.println(fine);
    }

    // Complete the libraryFine function below.
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        if (y1 > y2) {
            return 10000;
        } else if(y2>y1){
            return 0;
        }


        if (m1 > m2) {
            return 500 * (m1-m2);
        } else if (m2>m1) {
            return 0;
        }

        if (d1 > d2) {
            return 15 * (d1 - d2);
        } else {
            return 0;
        }

    }
}
