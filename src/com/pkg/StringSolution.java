package com.pkg;

import java.util.Scanner;

public class StringSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for (int i = 1; i <= t; i++) {
            String str = scan.next();
            String response = findOddEvenString(str);
            System.out.println(response);
        }
    }

    private static String findOddEvenString(String str) {
        String evenString ="", oddString ="";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || i % 2 == 0) {
                evenString = evenString + str.charAt(i);
            } else {
                oddString = oddString + str.charAt(i);
            }
        }
       return evenString+" "+oddString;

    }
}
