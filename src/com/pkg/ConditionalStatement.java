package com.pkg;

public class ConditionalStatement {
    public static void main(String[] args) {
        checkCondition(20);
    }

    public static void checkCondition(int n) {
        if (n % 2 == 0) {
            if (n >= 2 && n <= 5) {
                System.out.println("Not Weird");
            } else if (n >= 6 && n <= 20) {
                System.out.println("Weird");
            } else if (n > 20) {
                System.out.println("Not Weird");
            }
        } else {
            System.out.println("Weird");
        }
    }
}
