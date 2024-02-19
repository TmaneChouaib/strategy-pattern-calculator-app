import strategy.*;

public class Main {
    public static void main(String[] args) {

        Calculator calculator=new Calculator();

        System.out.println("\nThe execution of all strategies with x=2 and y=2 .\n");

        System.out.println("=> Addition : ");
        ICalculationStrategy strategyAddition = new AdditionStrategy();
        calculator.setCalculationStrategy(strategyAddition);
        double resultAddition = calculator.executeCalculator(2,2);
        System.out.println("The result of the Addition strategy => "+resultAddition+"\n");


        System.out.println("=> Multiplication : ");
        ICalculationStrategy strategyMultiplication =new MultiplicationStrategy();
        calculator.setCalculationStrategy(strategyMultiplication);
        double resultMultiplication =calculator.executeCalculator(2,2);
        System.out.println("The result of the Multiplication strategy => "+resultMultiplication+"\n");

        System.out.println("=> Division : ");
        ICalculationStrategy strategyDivision = new DivisionStrategy();
        calculator.setCalculationStrategy(strategyDivision);
        double resultDivision =calculator.executeCalculator(2,2);
        System.out.println("The result of the Division strategy => "+resultDivision+"\n");

        System.out.println("=> Subtraction : ");
        ICalculationStrategy subtractionStrategy = new SubtractionStrategy();
        calculator.setCalculationStrategy(subtractionStrategy);
        double resultSubtraction = calculator.executeCalculator(2,2);
        System.out.println("The result of the Subtraction strategy => "+resultSubtraction+"\n");
    }
}