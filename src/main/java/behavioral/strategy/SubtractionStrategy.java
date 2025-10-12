package behavioral.strategy;

public class SubtractionStrategy implements CalculatorStrategy {

    @Override
    public double calculate(double a, double b) {
        return a - b;
    }

}