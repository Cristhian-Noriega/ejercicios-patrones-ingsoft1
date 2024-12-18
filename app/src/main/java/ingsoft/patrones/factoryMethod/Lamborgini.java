package ingsoft.patrones.factoryMethod;


public class Lamborgini extends Auto{
    public int calculateDistance(int timeAmount) {
        return new LamborginiVelocityCalculator().getVelocity() * timeAmount;
    }

    @Override
    protected VelocityCalculator createVelocityCalculator() {
        return new LamborginiVelocityCalculator();
    }
}
