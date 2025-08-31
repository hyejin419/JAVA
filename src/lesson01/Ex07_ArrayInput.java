package lesson01;

import java.util.Scanner;

public class Ex07_ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[3];   // 정수형 배열 생성 (길이 3)

        System.out.print("1번째 점수를 입력하세요: ");
        scores[0] = sc.nextInt();
        System.out.print("2번째 점수를 입력하세요: ");
        scores[1] = sc.nextInt();
        System.out.print("3번째 점수를 입력하세요: ");
        scores[2] = sc.nextInt();

        System.out.println("1번째 점수: " + scores[0]);
        System.out.println("2번째 점수: " + scores[1]);
        System.out.println("3번째 점수: " + scores[2]);
        sc.close();

    }
}
