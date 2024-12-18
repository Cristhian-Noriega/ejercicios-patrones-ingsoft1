package ingsoft.patrones.factoryMethod;


public class Ferrari extends Auto{
    public int calculateDistance(int timeAmount) {
        return new FerrariVelocityCalculator().getVelocity() * timeAmount;
    }

    @Override
    protected VelocityCalculator createVelocityCalculator() {
        return new FerrariVelocityCalculator();
    }
}
