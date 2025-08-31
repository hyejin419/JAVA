package lesson06;
// 예외를 던질 수 있는 메서드
public class Ex05_Main {
    public static double calculateSqrt(int number) throws IllegalArgumentException {
        if(number < 0) {
            throw new IllegalArgumentException("음수는 제곱근을 계산할 수 없습니다.");
        }return Math.sqrt(number);
    }
    public static void main(String[] args) {
        try {
            double result = calculateSqrt(-9);
            System.out.println("결과: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
    }
}
