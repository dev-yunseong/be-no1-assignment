package calculator;

import java.util.*;
import java.util.stream.Collectors;

public class App3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArithmeticCalculator calculator = new ArithmeticCalculator<Double>();
        double num1, num2;
        while (true){
            try {
                System.out.print("num1: ");
                num1 = scanner.nextDouble();
                System.out.print("num2: ");
                num2 = scanner.nextDouble();

                System.out.print("operator: ");
                char operator = scanner.next().charAt(0);
                calculator.calculate(num1, num2, operator);

                double result = (double) calculator.getResults().getLast();

                System.out.printf("result: %.02f\n", result);
            } catch (Exception e) {
                System.out.println("error : " + e.getMessage());
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String commend = scanner.next();
            if (commend.equals("exit"))
                break;
        }

        System.out.print("num: ");
        double num = scanner.nextDouble();

        List<Double> nums = (List<Double>) calculator.getResults().stream()
                .filter( x -> ((Number) x).doubleValue() > num)
                .collect(Collectors.toList());

        for (Double n : nums){
            System.out.printf("result: %.02f, ", n);
        }
    }
}
