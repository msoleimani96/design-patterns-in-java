package behavioral.strategy;

public class DivisionStrategy implements CalculatorStrategy {

    @Override
    public double calculate(double a, double b) throws Exception {
        if (b == 0)
            throw new Exception("Cannot divide by zero!");

        return a / b;
    }

}
