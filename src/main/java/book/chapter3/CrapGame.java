package book.chapter3;
/*
In the game of craps, a pass line bet proceeds as follows: Two six-sided dice are
rolled; the first roll of the dice in a craps round is called the “come out roll.”
A come out roll of 7 or 11 automatically wins, and a come out roll of 2, 3, or 12
automatically loses. If 4, 5, 6, 8, 9, or 10 is rolled on the come out roll, that number
becomes “the point.” The player keeps rolling the dice until either 7 or the point is
rolled. If the point is rolled first, then the player wins the bet. If a 7 is rolled first,
then the player loses.
Write a program that simulates a game of craps using these rules without human
input. Instead of asking for a wager, the program should calculate whether the
player would win or lose. The program should simulate rolling the two dice and
calculate the sum. Add a loop so that the program plays 10,000 games. Add
c ounters that count how many times the player wins, and how many times the
player loses. At the end of the 10,000 games, compute the probability of winning
[i.e., Wins / (Wins + Losses) ] and output this value. Over the long run, who
is going to win the most games, you or the house?
*/


import java.util.Random;

public class CrapGame {

    public static int rollDie(int sides) {
        return new Random().nextInt(sides) + 1;
    }

    public static int rollDie6(){
        return rollDie(6);
    }

    public static void main (String[] args){
       int n = rollDie6()+ rollDie6();
       System.out.println("Come out Roll: " + n);

       int point = 0;
       boolean shouldProceed = false;

       switch(n){
           case 7:
           case 11:
               System.out.println("Win (" + n + ")");
               break;

           case 2:
           case 3:
           case 12:
               System.out.println("Lose (" + n + ")");
               break;

           default:
               point = n;
               System.out.println("You rolled: " + n + ", its now is your point number, going to next roll");
               shouldProceed = true;
       }

       while (shouldProceed) {
           n = rollDie6() + rollDie6();
           System.out.println("You rolled: " + n);

           if (n == 7){
               System.out.println("Lose");
               shouldProceed = false;
           } else if (n == point) {
               System.out.println("Win");
               shouldProceed = false;
           } else {
               System.out.println("Rerolling...");
           }
        };
    }
}
