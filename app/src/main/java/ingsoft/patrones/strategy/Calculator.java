package ingsoft.patrones.strategy;

import ingsoft.patrones.strategy.calculateStrategy.*;

public class Calculator {
    private CalculateStrategy strategy;

    public void setCalculateStrategy(CalculateStrategy strategy) {
        this.strategy = strategy;
    }
    public Calculator() {

    }
    public int calculate(String operation, int a, int b) throws Exception {
        CalculateStrategy operationStrategy = OperationFactory.getStrategy(operation);
        return operationStrategy.calculate(a,b);
    }
}

