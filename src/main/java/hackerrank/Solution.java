package hackerrank;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        System.out.println("i: " + i);
        double d = scan.nextDouble();
        System.out.println("d: " + d);

        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        scan.close();
    }
}
