package calculator.lv3;

import calculator.exception.CalculatorDividedByZeroException;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator<T extends Number> {
    private List<Double> results = new ArrayList<>();

    public List<Double> getResults() {
        return results;
    }

    public void setResults(List<Double> results) {
        this.results = results;
    }

    public void removeResult(){
        results.remove(0);
    }



    private double add(T num1, T num2){
        return num1.doubleValue() + num2.doubleValue();
    }
    private double sub(T num1, T num2){
        return num1.doubleValue() - num2.doubleValue();
    }
    private double mul(T num1, T num2){
        return num1.doubleValue() * num2.doubleValue();
    }
    private double div(T num1, T num2){
        return num1.doubleValue() / num2.doubleValue();
    }

    public double calculate(T num1, T num2, char operator) throws CalculatorDividedByZeroException {
        double result = 0;
        switch (operator) {
            case '+':
                result = add(num1, num2);
                break;
            case '-':
                result = sub(num1, num2);
                break;
            case '*':
                result = mul(num1, num2);
                break;
            case '/':
                if (num2.doubleValue() == 0)
                    throw new CalculatorDividedByZeroException("divided by zero");
                result = div(num1, num2);
                break;
        }
        results.add(result);
        return result;
    }
}
