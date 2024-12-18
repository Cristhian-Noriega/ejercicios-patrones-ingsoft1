package ingsoft.patrones.decorator;

public class PepperoniDecorator implements Pizza{
    private final Pizza pizza;

    public PepperoniDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Peperoni";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 2.0;
    }
}
