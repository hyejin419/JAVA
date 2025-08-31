package lesson06;

public class Ex02_Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[3]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 범위를 벗어났습니다: " + e);
            //java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
            //전체 예외 클래스 + 메시지
            System.out.println("배열 범위를 벗어났습니다: " + e.getMessage());
            //Index 3 out of bounds for length 3
            //예외 메시지만 출력
        }
    }
}
