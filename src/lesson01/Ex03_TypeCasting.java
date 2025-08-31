package lesson01;

public class Ex03_TypeCasting {
    public static void main(String[] args) {
        // 자동 형 변환 (묵시적)
        int score = 90;
        double average = score;
        System.out.println("자동 형 변환 결과: "+ average) ; //90

        // 강제 형 변환 (명시적)
        double pi = 3.141592;
        int truncatedPi = (int) pi; // double → int
        System.out.println("강제 형 변환 결과: " + truncatedPi) ; //3

        // char → int
        char grade = 'A';
        int gradeCode = grade;
        System.out.println("문자 A의 유니코드 값: " + gradeCode) ; //65

        // int → char(강제 형 변환)
        int code = 66;
        char letter = (char) code;
        System.out.println("유니코드 66에 해당하는 문자: " + letter) ; //B
    }
}
