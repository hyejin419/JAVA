package lesson04;

class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }
}

public class Ex09_Main {
    public static void main(String[] args) {
        int result = Calculator.add(5, 3);
        System.out.println("결과: " + result);

//        Math math = new Math();  Math클래스의 생성자는 private이기 때문에 불가능
//        Math.add();  존재하지 않는 메서드
    }
}
