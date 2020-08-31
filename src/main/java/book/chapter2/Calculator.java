package book.chapter2;

public class Calculator {

    public static void test(double expected, double actual) {
        if(expected == actual) {
            System.out.println("ok, it works!");
        } else {
            System.out.println("Not ok, the value expected is:" + expected + ", but got: " + actual);
        }
    }

    public static double add(double number1, double number2) {
        return  number1 + number2;
    }

    public static double subtract(double number1, double number2) {
        return number1 - number2;
    }

    public static double multiply(double number1, double number2) {
        return number1 * number2;
    }

    public static double divide(double number1, double number2) {
        return number1 / number2;
    }

    public static void main(String[] args) {

        test(34.0, add(10, 24));
        test(20.0, subtract(30, 10));
        test(-20.0, subtract(30, 50));
        test(4.5, multiply(1.5, 3));
        test(10 * (10/3.0), divide(100, 3.0));
    }
}
