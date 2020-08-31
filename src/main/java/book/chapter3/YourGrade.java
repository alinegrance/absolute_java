package book.chapter3;

/*
Write an if-else statement that outputs the word “Passed” provided the
value of the variable exam is greater than or equal to 60 and also the value
of the variable programsDone is greater than or equal to 10. Otherwise, the
if-else statement should output the word “Failed“. The variables exam and
programsDone are both of type int .
*/

public class YourGrade {

    public static boolean passed(int exam, int programsDone) {
        return exam >= 60 && programsDone >= 10;
    }

    public static void isTrueTest(boolean actual) {
        if (actual) {
            System.out.println("ok");
        } else {
            System.out.println("Something went wrong!");
        }
    }

    public static String didYouPass (int exam, int programsDone){
        if (exam >= 60 && programsDone >=10) {
            return "Passed";
        } else
            return "Failed";
    }

    public static void test(String expected, String actual) {
        boolean ok = expected.equals(actual);

        if (ok) {
            System.out.println("ok");
        } else
            System.out.print("Something went wrong!");
    }

    public static void main (String[] args){

        isTrueTest(passed(70, 11));
        isTrueTest(passed(60, 10));
        isTrueTest(!passed(50, 9));
        isTrueTest(!passed(0, 0));
        isTrueTest(false);

        test("Passed", didYouPass(70, 11));
        test("Passed", didYouPass(60, 10));
        test("Failed", didYouPass(50, 9));
        test("Failed", didYouPass(0, 0));
        test("Passed","Failed");
    }
}
