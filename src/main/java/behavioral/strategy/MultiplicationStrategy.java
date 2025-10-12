package behavioral.strategy;

public class MultiplicationStrategy implements CalculatorStrategy {

    @Override
    public double calculate(double a, double b) {
        return a * b;
    }

}
