package ingsoft.patrones.strategy;

import ingsoft.patrones.strategy.calculateStrategy.*;

public class OperationFactory {

    public static CalculateStrategy getStrategy(String operation) {
        if (operation == "add"){
            return new StrategyAddition();
        } else if (operation == "subtract") {
            return new StrategySubstract();
        }else if (operation == "multiply") {
            return new StrategyMultiply();
        }else if (operation == "divide") {
            return new StrategyDivide();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
