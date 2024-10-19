package ingsoft.patrones.strategy.calculateStrategy;

public class StrategyMultiply implements CalculateStrategy {
    public int calculate(int a, int b) throws Exception {
        return a * b;
    }
}


