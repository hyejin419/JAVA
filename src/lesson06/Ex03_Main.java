package lesson06;

public class Ex03_Main {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (ArithmeticException e) {
            System.out.println("산술 오류: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("널 오류: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("기타 오류: " + e.getMessage());
        }
    }
}
