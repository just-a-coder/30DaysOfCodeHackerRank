package com.pkg;

public class TotalCost {
    public static void main(String[] args) {
        double meal_cost = 12.00;
        int tip_percent = 20;
        int tax_percent = 8;
        solve(meal_cost, tip_percent, tax_percent);
    }

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        long totalCost = Math.round(meal_cost + (meal_cost*tip_percent/100) + (meal_cost*tax_percent/100));
        System.out.println(totalCost);
    }
}
