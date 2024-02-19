import strategy.ICalculationStrategy;

public class Calculator {
    private ICalculationStrategy iCalculationStrategy;

    public void setCalculationStrategy(ICalculationStrategy iCalculationStrategy) {
        this.iCalculationStrategy = iCalculationStrategy;
    }

    public double executeCalculator(int x, int y) {
        return iCalculationStrategy.calculate(x, y);
    }
}
