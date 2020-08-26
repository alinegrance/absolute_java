package chapter1.person;

/* Main that uses the Person class */

public class PersonMain {

    public static void main(String[] args) {
        Person mary = new Person("Mary", 28, 1.63, "female", 65);
        Person john = new Person("John",28, 1.67, "male", 80);

        System.out.println(mary);
        System.out.println(john);

        mary.setAge(30);

        System.out.println(mary);

        System.out.println("Mary has " + mary.getAge() + " years");

        System.out.println("Mary's height is " + mary.getHeight() + " m");
    }
}
