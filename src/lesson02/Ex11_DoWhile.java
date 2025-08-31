package lesson02;

import java.util.Scanner;

public class Ex11_DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        do{   //무조건 한 번은 실행되는 반복문
            System.out.println("문장을 입력해 (종료: exit): ");
            input = sc.nextLine();
            System.out.println("입력한 내용: " + input);
        } while (!input.equals("exit"));
        System.out.println("프로그램을 종료할게");
        sc.close();

    }
}
/*
| 구분       | while                 | do-while        |
| -------- | --------------------- | --------------- |
| 조건 확인 시점 | 실행 전에 조건 검사       | 실행 후에 조건 검사 |
| 최소 실행 횟수 | 조건이 `false`면 한 번도 안 함 | 무조건 한 번은 실행 |
| 예시 용도    | 조건이 명확할 때             | 최소 1회는 실행해야 할 때 |
 */