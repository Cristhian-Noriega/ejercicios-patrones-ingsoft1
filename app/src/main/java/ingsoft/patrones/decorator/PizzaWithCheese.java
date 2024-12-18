package ingsoft.patrones.decorator;

public class PizzaWithCheese implements Pizza {
    private final Pizza pizza;

    public PizzaWithCheese(Pizza pizza) {
        this.pizza = pizza;
    }
    public String getDescription() {
        return pizza.getDescription() + " + Cheese";
    }
    
    public double  getCost() {
        return pizza.getCost() + 1.5;
    }
}
