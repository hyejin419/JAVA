package lesson04;

class Ex08_Car {
    static int count = 0;
    public Ex08_Car() {
        count++;
    }
}

public class Ex08_Main {
    public static void main(String[] args) {
        new Ex08_Car();
        new Ex08_Car();
        new Ex08_Car();
        System.out.println("총 생성된 자동차 수: " + Ex08_Car.count);  //클래스 이름을 통해 직접 접근한다.
    }
}
/*
- static변수: 클래스 전체에서 하나만 존재하는 변수(객체마다 다르지 않음)
- static int count: 클래스 변수로, 모든 객체가 공유하는 변수. 인스턴스를 몇 개 만들든 Ex08_Car클래스 전체에서 하나만 존재한다.
- 클래스명으로 접근: Ex08_Car.count처럼 객체가 아닌 클래스명으로 접근 가능
*/