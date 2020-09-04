package book.chapter4;

public class PizzaSystem {

    public static void main(String[] args){
        Pizza pizza1 = new Pizza(PizzaSize.LARGE);
        Pizza pizza2 = new Pizza(PizzaSize.SMALL, 0, 10);

        System.out.println(pizza2.getDescription());
    }
}
