package book.chapter2;

/*
(This is a version with input of an exercise from Chapter 1 .) Write a program that
inputs two string variables, first and last , which the user should enter with his or
her name. First, convert both strings to all lowercase. Your program should then cre-
ate a new string that contains the full name in pig latin with the first letter capitalized
for the first and last name.

Use only the pig latin rule of moving the first letter to the
end of the word and adding “ay.”

 Output the pig latin name to the screen. Use the
substring and toUpperCase methods to construct the new name.

For example, if the user inputs “Walt” for the first name and “Savitch” for the
last name, then the program should create a new string with the text “Altway
Avitchsay” and print it.
*/

public class PigLatin {

    public static String toPigLatin(String name) {
        String lowerCaseName = name.toLowerCase();
        String pigLatinName = lowerCaseName.substring(1) + lowerCaseName.charAt(0) + "ay";

        return pigLatinName.substring(0,1).toUpperCase() + pigLatinName.substring(1);
    }

    public static void test(String expected, String actual) {
        boolean pass = expected.equals(actual);

        if (pass) {
            System.out.println("Pass: true");
        } else {
            System.out.println("Pass: false, expected: " + expected + ", but got: " + actual);
        }
    }

    public static void main(String[] args) {
        test("Lineaay", toPigLatin("Aline"));
        test("Rancegay", toPigLatin("Grance"));
        test("Azukikay", toPigLatin("Kazuki"));
        test("Udimpay", toPigLatin("Pudim"));
    }
}