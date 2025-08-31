package lesson06;

import java.util.Scanner;

public class Ex04_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("나눗셈 계산기");
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int a = sc.nextInt();
            System.out.println("두 번째 숫자를 입력하세요: ");
            int b = sc.nextInt();

            int result = a/b;
            System.out.println("결과: " + a + "/" + b + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("오류: 0으로 나눌 수 없습니다!");
        } catch (Exception e) {
            System.out.println("예기치 못한 오류 발생: " + e.getMessage());
        } finally {
            System.out.println("계산기를 종료합니다.");
            sc.close();
        }
    }
}
/*Exception: 모든 일반 예외를 포괄적으로 처리*/