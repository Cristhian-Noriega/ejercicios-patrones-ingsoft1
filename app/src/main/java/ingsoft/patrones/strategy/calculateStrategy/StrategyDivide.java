package ingsoft.patrones.strategy.calculateStrategy;

public class StrategyDivide implements CalculateStrategy{
    public int calculate(int a, int b) throws Exception {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }
}
