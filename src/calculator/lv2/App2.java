package calculator.lv2;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        int num1, num2;
        while (true){
            try {
                System.out.print("num1: ");
                num1 = scanner.nextInt();
                System.out.print("num2: ");
                num2 = scanner.nextInt();

                System.out.print("operator: ");
                char operator = scanner.next().charAt(0);
                calculator.calculate(num1, num2, operator);

                int result = calculator.getResults().getLast();

                System.out.printf("result: %d\n", result);
            } catch (Exception e) {
                System.out.println("error : " + e.getMessage());
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String commend = scanner.next();
            if (commend.equals("exit"))
                break;
        }
    }
}
