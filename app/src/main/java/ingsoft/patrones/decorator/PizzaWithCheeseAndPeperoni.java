package ingsoft.patrones.decorator;

public class PizzaWithCheeseAndPeperoni implements Pizza {
    private final Pizza pizza;

    public PizzaWithCheeseAndPeperoni() {
        this.pizza = new PepperoniDecorator(new CheeseDecorator(new BasicPizza()));
    }
    public String getDescription() {
        return pizza.getDescription();
    }
    
    public double  getCost() {
        return pizza.getCost();
    }
}
