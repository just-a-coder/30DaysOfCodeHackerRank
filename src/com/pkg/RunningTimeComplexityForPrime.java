package com.pkg;

import java.util.Scanner;

public class RunningTimeComplexityForPrime {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
/*        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            isPrime(arrItem);
        }

        scanner.close();*/
        int n = 9;
        isPrime(n);

    }

    public static void isPrime(int n) {

        boolean primeFlag = false;
        if (n == 2 || n == 3) {
            primeFlag = true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                primeFlag = false;
                break;
            } else {
                primeFlag = true;
            }
        }

        if (primeFlag) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }

    }


}
