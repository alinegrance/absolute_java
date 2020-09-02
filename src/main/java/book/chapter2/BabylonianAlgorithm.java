package book.chapter2;
/*      The Babylonian algorithm to compute the square root of a positive number n is as
        follows:
        1. Make a guess at the answer (you can pick n /2 as your initial guess).
        2. Compute r = n / guess
        3. Set guess = (guess +r)/ 2
        4. Go back to step 2 for as many iterations as necessary. The more you repeat steps
        2 and 3, the closer guess will become to the square root of n .
        Write a program that inputs a double for n , iterates through the Babylonian algo-
        rithm five times, and outputs the answer as a double to two decimal places. Your
        answer will be most accurate for small values of n .*/

import java.util.Scanner;

public class BabylonianAlgorithm {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double n = scan.nextDouble();
        
        double guess = n / 2;

        // Repeating code five fold by hand because I have not learned how to loop in java yet.
        
        double root = n / guess;
        guess = (guess + root) / 2;
        System.out.println(guess);

        root = n / guess;
        guess = (guess + root) / 2;
        System.out.println(guess);

        root = n / guess;
        guess = (guess + root) / 2;
        System.out.println(guess);

        root = n / guess;
        guess = (guess + root) / 2;
        System.out.println(guess);

        root = n / guess;
        guess = (guess + root) / 2;

        System.out.println(guess);
    }
}