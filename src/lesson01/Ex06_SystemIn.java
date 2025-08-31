package lesson01;
//문자 하나를 입력받아 출력하는 예제
import java.io.IOException;

public class Ex06_SystemIn {
    public static void main(String[] args) throws IOException {
        System.out.println("문자 하나를 입력하세요: ");
        int input = System.in.read();   // 문자 하나를 입력받아 ASCII 값으로 저장
        System.out.println("입력한 문자: " + (char)input);  // ASCII 값을 문자로 캐스팅하여 출력

    }
}
/*
int first = System.in.read();
int second = System.in.read();
이 경우, A를 입력하고 엔터를 누르면: first에는 'A'가 저장됩니다.
하지만 second에는 엔터를 누르면서 입력된 \n이 저장됩니다.
즉, 두 번째 입력은 사용자가 다시 뭘 입력하지 않아도 버퍼에 있던 줄바꿈 문자가 자동으로 읽혀버리는 현상이 발생합니다.
이런 문제를 피하려면 Scanner 또는 BufferedReader 같은 입력 클래스를 사용하는 것이 일반적입니다.
Scanner sc = new Scanner(System.in);
String input = sc.nextLine();  // 한 줄 전체 입력받기
char ch = input.charAt(0);     // 첫 글자만 추출
 */