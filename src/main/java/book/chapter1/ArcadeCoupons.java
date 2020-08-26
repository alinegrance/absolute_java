package book.chapter1;

/* EXERCICE 2:
        The video game machines at your local arcade output coupons according to how
        well you play the game. You can redeem 10 coupons for a candy bar or 3 coupons
        for a gumball. You prefer candy bars to gumballs. Write a program that defines aProgramming Projects
        variable initially assigned to the number of coupons you win. Next, the program
        should output how many candy bars and gumballs you can get if you spend all of
        your coupons on candy bars first, and any remaining coupons on gumballs.*/

public class ArcadeCoupons {

        public static void main (String[] args){

            int couponsWon = 59;
            int candyRedeem = couponsWon/10;
            int gumballRedeem = (couponsWon%10)/3;

            System.out.println("You won " + candyRedeem + " candies and " + gumballRedeem + " gumballs");
    }


}
