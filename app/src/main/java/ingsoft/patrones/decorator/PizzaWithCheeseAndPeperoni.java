package ingsoft.patrones.decorator;

public class PizzaWithCheeseAndPeperoni implements Pizza {
    private final Pizza pizza;

    public PizzaWithCheeseAndPeperoni(Pizza pizza) {
        this.pizza = pizza;
    }
    public String getDescription() {
        return pizza.getDescription() + " + Peperoni";
    }
    
    public double  getCost() {
        return pizza.getCost() + 2;
    }
}
