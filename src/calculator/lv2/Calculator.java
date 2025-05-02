package calculator.lv2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Integer> results = new ArrayList<>();

    public List<Integer> getResults() {
        return results;
    }

    public void setResults(List<Integer> results) {
        this.results = results;
    }

    public void removeResult(){
        results.remove(0);
    }

    private int add(int num1, int num2){
        return num1 + num2;
    }
    private int sub(int num1, int num2){
        return num1 - num2;
    }
    private int mul(int num1, int num2){
        return num1 * num2;
    }
    private int div(int num1, int num2){
        return num1 / num2;
    }

    public int calculate(int num1, int num2, char operator) throws Exception {
        int result = -1;
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
                if (num2 == 0)
                    throw new Exception("divided by zero");
                result = div(num1, num2);
                break;
        }
        results.add(result);
        return result;
    }
}
