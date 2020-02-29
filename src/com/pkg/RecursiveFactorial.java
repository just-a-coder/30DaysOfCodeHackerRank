package com.pkg;

public class RecursiveFactorial {
    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        System.out.println(result);
    }


    // Complete the factorial function below.
    static int factorial(int n) {
        if (n == 1 || n == 0)
            return 1;
        else
            return n * factorial(n - 1);

    }
}
