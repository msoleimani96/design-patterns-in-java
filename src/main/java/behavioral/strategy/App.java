package behavioral.strategy;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        CalculatorStrategy strategy;

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        scanner.nextLine();

        String operation = scanner.nextLine();

        scanner.close();

        switch (operation) {
            case "a" -> strategy = new AdditionStrategy();
            case "s" -> strategy = new SubtractionStrategy();
            case "m" -> strategy = new MultiplicationStrategy();
            case "d" -> strategy = new DivisionStrategy();
            default -> throw new Exception("Invalid operation.");
        }

        CalculatorContext context = new CalculatorContext(strategy);
        System.out.println(context.calculate(a, b));
    }
}
