package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EvenOddString {

    public static String takeEven(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i += 2) {
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }

    public static String takeOdd(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < s.length(); i += 2) {
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int nStrings = scanner.nextInt();
        String[] inputs = new String[nStrings];

        for (int i = 0; i < nStrings; i++) {
            inputs[i] = scanner.next();
        }

        for (int i = 0; i < nStrings; i++) {
            System.out.println(inputs[i]);
            System.out.println(takeEven(inputs[i]) + " " + takeOdd(inputs[i]));
        }
    }
}
