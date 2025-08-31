package lesson02;

import java.util.Scanner;

public class Ex06_SwitchFruit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("과일 이름을 영어로 입력하세요 (apple, banana, orange): ");
        String fruit = sc.nextLine();

        String result = switch (fruit) { ///반환형 /// 변수이므로 세미콜론으로 마무리.
            case "apple" -> "사과";
            case "banana" -> "바나나";
            case "orange" -> "오렌지";
            case "grape" -> "포오도";
            case "pineapple" -> "파인애애들";
            default -> "알 수 없는 과일이야";
        };
        System.out.println("입력한 과일의 한글 이름은 " + result);
        sc.close();
        }
}
