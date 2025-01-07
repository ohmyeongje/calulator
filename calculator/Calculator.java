package org.example.calculator;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    //저장할 큐를 캡슐화
    private Queue<Integer> results;

    //생성자
    public Calculator() {
        this.results = new LinkedList<>();
    }

    //사칙연산 수행 메서드
    public int calculate(int num1, int num2, char operator) {
        int result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("0으로 나눌 수 없습니다");
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("잘못된 연산입니다");
                return 0;
        }
        // 결과를 큐에 저장
        results.offer(result);
        return result;
    }
    // Getter: 큐 상태를 복사하여 반환
    public Queue<Integer> getResults() {
        return new LinkedList<>(results);
    }

    public void setResults(Queue<Integer> results) {
        this.results = new LinkedList<>(results);
    }

    //첫번쨰 연산값을 제거
    public void removeResult() {
        if (!results.isEmpty()) {
            results.poll(); //큐에서 가장 앞의 요소를 제거
        }else {
            System.out.println("삭제할 연산 결과가 없습니다");
        }
    }
}

