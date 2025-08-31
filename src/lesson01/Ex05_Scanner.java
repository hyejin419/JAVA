package lesson01;

import java.util.Scanner;

public class Ex05_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.in : 표준 입력(키보드)
        // sc라는 이름으로 Scanner 객체를 만들고, 이후 sc.nextLine(), sc.nextInt() 등의 메서드를 사용할 수 있다.
        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine(); //문자열 전체 한 줄을 입력받기 위해 사용하는 메서드
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();  //정수를 입력받기 위해 사용하는 메서드
        System.out.print("안녕하세요, " + name + "님! 당신의 나이는 " +age + "세 입니다.");
        sc.close();
    }
}

/*
Scanner 사용
1. 먼저 import java.util.Scanner;를 선언합니다.
2. Scanner sc = new Scanner(System.in); 으로 객체를 생성합니다.
3. sc.nextInt(), sc.nextLine(), sc.nextDouble() 등 다양한 메서드를 사용해 입력을 받습니다.
4.사용이 끝나면 sc.close();를 호출해서 자원을 정리합니다.
*/