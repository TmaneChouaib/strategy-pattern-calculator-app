package strategy;

public class MultiplicationStrategy implements ICalculationStrategy {
    @Override
    public double calculate(int x, int y) {
        return x * y;
    }
}
