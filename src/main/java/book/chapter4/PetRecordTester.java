package book.chapter4;

public class PetRecordTester {

    public static void main(String[] args) {
        PetRecord doggo = new PetRecord("Chocolate");

        doggo.setAge(3);
        doggo.setWeight(200);

        System.out.println("How old is doggo? " + doggo.getAge() + " years old");
    }
}
