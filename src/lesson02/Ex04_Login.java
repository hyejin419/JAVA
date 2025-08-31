package lesson02;

import java.util.Scanner;

public class Ex04_Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctId = "apple";
        String correctPassword = "1111";

        System.out.print("아이디를 입력하세요: ");
        String inputId = sc.nextLine();

        System.out.print("비번을 입력하세요: ");
        String inputPassword = sc.nextLine();

        ///ex. (inputId == correctPassword)  /// 메모리 주소가 같은지 비교 → false

        if (inputId.equals(correctId) && inputPassword.equals(correctPassword)) {
            System.out.println("로그인 성공!");
        } else {
            System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
        }
        sc.close();
    }
}
