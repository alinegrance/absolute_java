package hackerrank;

import java.util.*;

/*
If is odd, print Weird
If is even and in the inclusive range of 2 to 5, print Not Weird
If is even and in the inclusive range of 6 to 20, print Weird
If is even and greater than 20, print Not Weird
*/

public class Weirdness {

    public static boolean isWeird(int n){
        return n % 2 != 0 || (n >= 6 && n <= 20);
    }

    public static String weirdTester(int n) {
        if (isWeird(n)) {
            return "Weird";
        }

        return "Not Weird";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int N = scanner.nextInt();

//        String result = weirdTester(N);

        System.out.println( weirdTester(1));
        System.out.println( weirdTester(4));
        System.out.println( weirdTester(18));
        System.out.println( weirdTester(28));

        scanner.close();
    }
}

