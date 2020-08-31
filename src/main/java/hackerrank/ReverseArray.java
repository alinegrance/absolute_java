package hackerrank;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        n = scanner.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++){
            numbers[i] = scanner.nextInt();
        }

        for (int i = n-1; i >= 0; i--) {
            System.out.print(numbers[i]);

            if (i != 0) {
                System.out.print(" ");
            }
        }
    }
}
