package ingsoft.patrones.decorator;

public class CheeseDecorator implements Pizza{
    private final Pizza pizza;

    public CheeseDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.5;
    }
}
