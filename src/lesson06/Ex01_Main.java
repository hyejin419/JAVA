package lesson06;

public class Ex01_Main {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("result: " + result);  //문법 에러X, 런타임 시 에러 발생.
        } catch (ArithmeticException e) { //e: ArithmeticException(산술계산 오류)의 객체
            System.out.println("예외발생: " + e.getMessage());
        } finally {
            System.out.println("이 코드는 항상 실행됩니다.");
        }
    }
}

/*
try-catch를 사용하면 프로그램이 강제 종료되지 않고 예외를 처리할 수 있다.
*/
