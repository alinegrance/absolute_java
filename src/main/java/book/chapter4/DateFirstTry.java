package book.chapter4;
/*
Write a method called makeItNewYears that could be added to the class
DateFirstTry in Display 4.1 . The method makeItNewYears has no parameters
and sets the month instance variable to "January" and the day instance variable
to 1 . It does not change the year instance variable.
Write a method called yellIfNewYear that could be added to the class
DateFirstTry in Display 4.1 . The method yellIfNewYear has no parameters
and outputs the string "Hurrah!" provided the month instance variable has the
value "January" and the day instance variable has the value 1 . Otherwise, it
outputs the string "Not New Year's Day."
*/

public class DateFirstTry {
    public String month;
    public int day;
    public int year;

    public void writeOutput(){
        System.out.println(month + " " + day + ", " + year);
    }

    public void makeItNewYears(){
        month = "January";
        day = 1;
    }

    public void yellIfNewYear(){
        if(month.equals("January") && day == 1) {       // TODO: add logic for day.
            System.out.println("Hurrah!");
        } else {
            System.out.println("Not New Year's day");
        }
    }


    public static void main(String[] args){
        DateFirstTry date1 = new DateFirstTry();
        date1.month = "April";
        date1.day = 23;
        date1.year = 2020;

        DateFirstTry date2 = new DateFirstTry();
        date2.month = "January";
        date2.day = 1;
        date2.year = 2021;

        date1.writeOutput();
        date1.yellIfNewYear();
        date1.makeItNewYears();
        date1.writeOutput();
        date1.yellIfNewYear();

        date2.writeOutput();
        date2.yellIfNewYear();

    }
}
