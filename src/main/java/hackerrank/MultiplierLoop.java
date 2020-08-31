package hackerrank;

import java.util.Scanner;

public class MultiplierLoop {

    public static void multiplier(int n) {
        int i;
        int endOfRange = 10;
        for (i = 1; i <= endOfRange; i++) {
            int result = i * n;
            System.out.println(n + " x " + i + " = " + result);
        }
    }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int n = scanner.nextInt();

            multiplier(n);

            scanner.close();
        }
}
