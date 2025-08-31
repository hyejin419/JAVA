package lesson02;

import java.util.Scanner;

public class Ex10_While2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";  //문자열 변수 input을 선언하고, 빈 문자열로 초기화
        while(!input.equals("exit")) {  //input이 "exit"이 아닐 때까지 반복 실행
            System.out.println("문장을 입력해 (종료: exit): ");
            input = sc.nextLine();  //사용자로부터 한 줄 전체 입력을 받아서 input 변수에 저장
            System.out.println("입력한 내용: " + input);
        }
        System.out.println("프로그램 종료");
        sc.close();
    }
}
