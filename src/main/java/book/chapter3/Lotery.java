package book.chapter3;

import java.util.Random;

public class Lotery {

    public static void loteryNumber(int number) {

//        Random random = new Random();
//
//        int number = random.nextInt();

        boolean isPositive = number > 0;

        while (number > 0) {
            System.out.println("Wow!: " + number);
            number = number - 1000;
        }

        if (isPositive)
            System.out.println("Your number was positive.");
        else
            System.out.println("Sorry, number was not positive.");

        System.out.println("Only positive numbers can win.");
    }

    public static void main(String[] args){
        loteryNumber(-2100);
    }
}
