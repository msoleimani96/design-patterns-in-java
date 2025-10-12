package behavioral.strategy;

public class AdditionStrategy implements CalculatorStrategy {

    @Override
    public double calculate(double a, double b) {
        return a + b;
    }

}
