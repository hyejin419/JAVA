package lesson02;
// switch 표현식 + yield 사용(여러 줄 블록에서 값을 반환할 때 사용ban)
import java.util.Scanner;

public class Ex08_SwitchYield {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("과일 이름을 영어로 입력하세요 (apple, banana, grape): ");
        String fruit = sc.nextLine().toLowerCase();

        String result = switch (fruit) {
            case "apple" -> {
                System.out.println("🍎 사과를 선택하셨습니다!");
                yield "사과";
            }
            case "banana" -> {
                System.out.println("🍌 바나나는 에너지가 넘치죠!");
                yield "바나나";
            }
            case "grape" -> {
                System.out.println("🍇 포도는 여름 제철 과일이에요.");
                yield "포도";
            }
            default -> {
                System.out.println("😕 등록되지 않은 과일입니다.");
                yield "알 수 없음";
            }
    };
        System.out.println("한글 이름: " + result);

        sc.close();
    }
}
/*
switch (mbti) { ... System.out.println(...) }
switch문 (statement) : 결과를 변수에 저장하지 않음. 실행만 하고 끝!

String result = switch (...)
switch 표현식 (expression) : 문자열을 반환해서 result에 저장. 이후 그 값을 출력하거나 사용할 수 있음.
 */