package book.chapter1;

/* EXERCICE 1:
       One way to measure the amount of energy that is expended during exercise is to
       use metabolic equivalents (MET). Here are some METS for various activities:
       Running 6 MPH:
       10 METS
       Basketball:
       8 METS
       Sleeping:
       1 MET
       The number of calories burned per minute may be estimated using the following
       formula:
       Calories/Minute = 0.0175 * MET * Weight in kilograms
       Write a program that calculates and outputs the total number of calories burned
       for a 150-pound person who runs 6 MPH for 30 minutes, plays basketball for
       30 minutes, and then sleeps for 6 hours. One kilogram is equal to 2.2 pounds.*/

public class CaloriesCounter {

    public static final double WEIGHT_IN_KILOGRAMS = 150 / 2.2;

    public static void main(String[] args) {
        final double runningCaloriesPerMinute = 0.0175 * 10 * WEIGHT_IN_KILOGRAMS;
        final double basketballCaloriesPerMinute = 0.0175 * 8 * WEIGHT_IN_KILOGRAMS;
        final double sleepingCaloriesPerMinute = 0.0175 * 1 * WEIGHT_IN_KILOGRAMS;
        final double caloriesTotal = (runningCaloriesPerMinute * 30) + (basketballCaloriesPerMinute * 30) + (sleepingCaloriesPerMinute * 6 * 60);

        System.out.println("The total of calories burned is: " + caloriesTotal + " Calories");
    }
}