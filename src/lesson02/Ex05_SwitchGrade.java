package lesson02;

import java.util.Scanner;

public class Ex05_SwitchGrade {
    public static void main(String[] args) {
        /// if : 범위값을 사용할 때, switch : 특정값
        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력하세요 (0~100)");
        int score = sc.nextInt();
        int grade = score / 10;  /// 정수로 나눴으므로 정수가 출력된다.

        switch (grade) {
            case 10:
            case 9:
                System.out.println("A학점");
                break;
            case 8:
                System.out.println("B학점");
                break;
                case 7:
                    System.out.println("C학점");
                    break;
            case 6:
                System.out.println("D학점");
                break;
            default:
                System.out.println("재시험");
        }  ///블럭으로 보므로 세미콜론 없음

    }
}
