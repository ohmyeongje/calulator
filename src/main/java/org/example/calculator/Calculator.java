package org.example.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      boolean calculator = true;

      while (calculator) {
          System.out.print("첫 번쨰 정수를 입력해주세요:");
          String input1 = scanner.next();

          if (input1.equals("exit")) {
              System.out.println("계산기를 종료합니다");
              break;
          }
          System.out.print("두 번쨰 정수를 입력하세요");
          String input2 = scanner.next();

          if (input2.equals("exit")) {
              System.out.println("계산기를 종료합니다");
              break;
          }

          int number1 = Integer.parseInt(input1);
          int number2 = Integer.parseInt(input2);

          System.out.print("사칙연산 기호를 입력하세요(+, -, *, /)");
          String operator = scanner.next();

          int result = 0;
          boolean vaildoperator = true;

          switch (operator) {
              case "+":
                  result = number1 + number2;
                  break;
              case "-":
                  result = number1 - number2;
                  break;
              case "*":
                  result = number1 * number2;
              case "/":
                  if (number1 != 0) {
                      result = number1 / number2;
                  } else {
                      System.out.println("0으로 나눌 수 없습니다");
                      vaildoperator = false;
                  }
                  break;
              default:
                  System.out.println("올바른 연산 기호를 입력하세요");
                  vaildoperator = false;
          }
          if (vaildoperator) {
              System.out.println("결과" + result);
          }
      }
      scanner.close();
    }
}
