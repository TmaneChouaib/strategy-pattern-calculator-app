package strategy;

public class AdditionStrategy implements ICalculationStrategy {
    @Override
    public double calculate(int x, int y) {
        return x + y;
    }
}
