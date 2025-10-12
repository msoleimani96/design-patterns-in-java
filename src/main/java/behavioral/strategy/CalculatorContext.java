package behavioral.strategy;

public class CalculatorContext {
    private CalculatorStrategy strategy;

    public CalculatorContext(CalculatorStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(double a, double b) throws Exception {
        return strategy.calculate(a, b);
    }
}
