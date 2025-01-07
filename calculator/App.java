package org.example.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /* Calculator 인스턴스 생성 */
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        //반복문 시작
      while (true) {
          System.out.print("첫 번쨰 정수를 입력해주세요:");
          int num1 = scanner.nextInt();

          System.out.print("두 번쨰 정수를 입력하세요");
          int num2 = scanner.nextInt();

          System.out.print("사칙연산 기호를 입력하세요(+, -, *, /)");
          char operator = scanner.next().charAt(0);

          // Calculator 클래스 활용
          int result = calculator.calculate(num1, num2, operator);
          System.out.println("결과: " + result);


          System.out.print("더 계산하시겠습니까? (exit 입력 시 종료, delete 입력 시 첫 연산 결과 삭제): ");
          String command = scanner.next();
          if (command.equals("exit")) {
              break;
          } else if (command.equals("delete")) {
              calculator.removeResult();
              System.out.println("첫 번째 연산 결과가 삭제되었습니다.");
          }
      }

        System.out.println("연산 결과 목록: " + calculator.getResults());
        scanner.close();
    }
}
