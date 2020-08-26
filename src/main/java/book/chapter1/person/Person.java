package book.chapter1.person;

/* Practicing the creation of a class from scratch */

public class Person {

    private String name;
    private int age;
    private int height;
    private String sex;
    private double weight;

    Person(String name, int age, double heightInM, String sex, double weight) {
        this.name = name;
        this.age = age;
        this.height = (int) (100 * heightInM);
        this.sex = sex;
        this.weight = weight;
    }

    public void increaseAge(int yearsToIncrease) {
        age += yearsToIncrease;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return this.sex;
    }

    public void setHeight(double heightInM) {
        this.height = (int) (100 * heightInM);
    }

    public double getHeight() {
        return this.height / 100.0;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }

    public String toString() {
        return name + " [" + age + " years, " + height + " m, " + sex + ", " + weight + " kg]";
    }
}