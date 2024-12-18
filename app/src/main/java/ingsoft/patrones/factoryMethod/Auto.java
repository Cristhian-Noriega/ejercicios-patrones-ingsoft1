package ingsoft.patrones.factoryMethod;

public abstract class Auto {
    public int calculateDistance(int timeAmount) {
        return createVelocityCalculator().getVelocity() * timeAmount;
    }

    protected abstract VelocityCalculator createVelocityCalculator();
}
