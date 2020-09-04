package book.chapter4;

/*
        Create a class named Pizza that stores information about a single pizza. It should
        contain the following:
        • Private instance variables to store the size of the pizza (either small, medium,
        or large), the number of cheese toppings, the number of pepperoni toppings,
        and the number of ham toppings.
        • Constructor(s) that set all of the instance variables.
        • Public methods to get and set the instance variables.
        • A public method named calcCost( ) that returns a double that is the cost
        of the pizza.
        Pizza cost is determined by:
        Small: $10 + $2 per topping
        Medium: $12 + $2 per topping
        Large: $14 + $2 per topping
        • A public method named getDescription( ) that returns a String contain-
        ing the pizza size, quantity of each topping, and the pizza cost as calculated
        by calcCost( ) .
        Write test code to create several pizzas and output their descriptions. For
        example, a large pizza with one cheese, one pepperoni and two ham toppings
        should cost a total of $22.
*/

public class Pizza {
    private PizzaSize size;
    private int cheeseTopping;
    private int pepperoniTopping;

    public Pizza(PizzaSize size) {
        this(size, 2, 2);
    }

    public Pizza(PizzaSize size, int cheeseTopping, int pepperoniTopping) {
        this.size = size;
        this.cheeseTopping = cheeseTopping;
        this.pepperoniTopping = pepperoniTopping;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public void setCheeseTopping(int cheeseTopping) {
        this.cheeseTopping = cheeseTopping;
    }

    public void setPepperoniTopping(int pepperoniTopping) {
        this.pepperoniTopping = pepperoniTopping;
    }

    public PizzaSize getSize() {
        return this.size;
    }

    public int getCheeseTopping() {
        return this.cheeseTopping;
    }

    public int getPepperoniTopping() {
        return this.pepperoniTopping;
    }

    public double totalAmount() {
        double sizeAmount = 0.0;

        switch (size){
            case SMALL: sizeAmount = 10.0; break;
            case MEDIUM: sizeAmount = 12.0; break;
            case LARGE: sizeAmount = 14.0; break;
            default: System.exit(0);
        }

        return sizeAmount + 2.0 * (cheeseTopping + pepperoniTopping);
    }

    public String getDescription() {
        double formattedTotalAmount = Double.parseDouble(String.format("%.2f", totalAmount()));

        return "Your order is: a " + size
                + " pizza, with " + cheeseTopping
                + " cheese topping(s) and " + pepperoniTopping
                + " pepperoni topping(s). The total amount is: $" + formattedTotalAmount;
    }
}