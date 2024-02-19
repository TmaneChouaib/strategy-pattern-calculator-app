package strategy;

public class SubtractionStrategy implements ICalculationStrategy {
    @Override
    public double calculate(int x, int y) {
        return x - y;
    }
}
