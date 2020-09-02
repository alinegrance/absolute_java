package book.chapter3;
/*
(This is a version of Programming Project 2.1 from Chapter 2 .) The Babylonian
algorithm to compute the square root of a positive number n is as follows:
1. Make a guess at the answer (you can pick n/2 as your initial guess).
2. Compute r = n / guess .
3. Set guess = (guess +r) / 2 .
4. Go back to step 2 until the last two guess values are within 1% of each other.
Write a program that inputs a double for n , iterates through the Babylonian algo-
rithm until the guess is within 1% of the previous guess , and outputs the answer
as a double to two decimal places. Your answer should be accurate even for large
values of n .
*/

public class BabylonianAlgorithmLoopVersion {

    public static boolean isOnePercentDifferent(double number, double previousNumber){
//        return number <= previousNumber - 0.01 * previousNumber || number >= previousNumber + 0.01 * previousNumber);
        return Math.abs(previousNumber - number) <= 0.01 * previousNumber;
    }

    public static void main (String[] args){

//        Scanner scan = new Scanner(System.in);

//        double n = scan.nextDouble();

        double n = 9;
        double guess = n / 2;
        double root;
        double previousGuess;

        do {
            root = n / guess;
            previousGuess = guess;
            guess = (guess + root) / 2;

        } while (!isOnePercentDifferent(guess, previousGuess));

        System.out.println("square root of " + n + " is " + guess);
    }

}
