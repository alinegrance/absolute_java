package book.chapter4;

/*
Class for basic pet records: name, age, weight
 */

public class PetRecord {

    private String name;
    private int age; // in years
    private double weight; // in kg

    public PetRecord() {
        name = "Not named yet.";
        age = 0;
        weight = 0;
    }

    public PetRecord(String initialName) {
        name = initialName;
        age = 0;
        weight = 0;
    }

    public PetRecord(String initialName, int initialAge, double initialWeight) {
        name = initialName;

        if(initialAge < 0 || initialWeight < 0){
            System.out.println("Invalid input, negative age or weight");
            System.exit(0);
        } else {
            age = initialAge;
            weight = initialWeight;
        }
    }

    public void set(String newName, int newAge, double newWeight) {
        name = newName;

        if (newAge < 0 || newWeight < 0) {
            System.out.println("Invalid input, negative age or weight");
            System.exit(0);
        } else {
            age = newAge;
            weight = newWeight;
        }

    }

    public void setName(String newName) {
        name = newName;
    }

    public void setAge(int newAge) {
        if (newAge < 0) {
            System.out.println("Invalid input, negative age.");
            System.exit(0);
        } else {
            age = newAge;
        }
    }

    public void setWeight(double newWeight) {
        if(newWeight < 0){
            System.out.println("Invalid input, negative weight.");
            System.exit(0);
        } else{
            weight = newWeight;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String toString(){
        return ("Name: " + name + ", age: " + age + " years, weight: " + weight + " kg");
    }
}