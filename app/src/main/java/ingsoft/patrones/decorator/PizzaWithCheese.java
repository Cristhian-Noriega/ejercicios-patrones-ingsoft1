package ingsoft.patrones.decorator;

public class PizzaWithCheese implements Pizza {
    private final Pizza pizza;

    public PizzaWithCheese() {
        this.pizza = new CheeseDecorator(new BasicPizza());
    }
    public String getDescription() {
        return pizza.getDescription();
    }
    
    public double  getCost() {
        return pizza.getCost();
    }
}
