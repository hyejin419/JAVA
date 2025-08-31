package lesson03;
//super
class Parent {
    public Parent(String msg) {
        System.out.println("부모 생성자: " + msg);
    }
}
/*
 생성자: Parent(String msg) :매개변수로 문자열을 받아 출력.
*/

class Child extends Parent {
    public Child() {
        super("apple");
        System.out.println("자식 생성자");
    }
}
/*
자식 생성자 안에 super("apple")을 호출함으로써:
부모 클래스의 생성자 Parent(String msg)가 먼저 실행됩니다.
그 다음 줄에 있는 System.out.println("자식 생성자");가 실행됩니다.
*/
/*
super(...)는 부모 클래스의 생성자를 호출할 때 사용합니다.
항상 자식 생성자 안의 첫 줄에 위치해야 합니다.
생략하면 기본 생성자 (super())가 자동으로 호출되지만, 부모 클래스에 기본 생성자가 없으면 오류 발생!
*/

public class Ex06_Main {
    public static void main(String[] args) {
        Child child = new Child();
    }
}
/*
메인 메서드 실행 흐름
1. super("apple") → Parent(String msg) 실행 → 부모 생성자: apple
2. System.out.println("자식 생성자"); → 자식 생성자
*/