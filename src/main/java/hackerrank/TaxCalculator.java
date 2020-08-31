package hackerrank;

import java.util.*;

public class TaxCalculator {

    // Complete the solve function below.
    static double solve(double meal_cost, int tip_percent, int tax_percent) {

        double tip = meal_cost * (tip_percent / 100.0);
        double tax = meal_cost * (tax_percent / 100.0);
        double totalCost = (meal_cost + tip + tax);

//        System.out.println(Math.round(totalCost));

        return totalCost;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println(solve(meal_cost, tip_percent, tax_percent));

        scanner.close();
    }
}