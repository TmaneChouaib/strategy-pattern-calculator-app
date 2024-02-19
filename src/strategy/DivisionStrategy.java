package strategy;

public class DivisionStrategy implements ICalculationStrategy {
    @Override
    public double calculate(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
    }
}
